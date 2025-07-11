-module(openapi_default_api).

-export([api_get/1, api_get/2,
         api_mdl_components_component_type_and_record_name_files_get/2, api_mdl_components_component_type_and_record_name_files_get/3,
         api_mdl_components_component_type_and_record_name_get/2, api_mdl_components_component_type_and_record_name_get/3,
         api_mdl_execute_async_job_id_results_get/2, api_mdl_execute_async_job_id_results_get/3,
         api_mdl_execute_async_post/1, api_mdl_execute_async_post/2,
         api_mdl_execute_post/1, api_mdl_execute_post/2,
         api_mdl_files_post/1, api_mdl_files_post/2,
         audittrail_audit_trail_type_get/2, audittrail_audit_trail_type_get/3,
         auth_discovery_post/1, auth_discovery_post/2,
         auth_oauth_session_oath_oidc_profile_id_post/2, auth_oauth_session_oath_oidc_profile_id_post/3,
         auth_post/1, auth_post/2,
         code_class_name_delete/2, code_class_name_delete/3,
         code_class_name_disable_put/2, code_class_name_disable_put/3,
         code_class_name_enable_put/2, code_class_name_enable_put/3,
         code_class_name_get/2, code_class_name_get/3,
         code_profiler_get/1, code_profiler_get/2,
         code_profiler_post/1, code_profiler_post/2,
         code_profiler_session_name_actions_end_post/2, code_profiler_session_name_actions_end_post/3,
         code_profiler_session_name_delete/2, code_profiler_session_name_delete/3,
         code_profiler_session_name_get/2, code_profiler_session_name_get/3,
         code_profiler_session_name_results_get/2, code_profiler_session_name_results_get/3,
         code_put/1, code_put/2,
         composites_trees_edl_hierarchy_or_template_actions_listnodes_post/2, composites_trees_edl_hierarchy_or_template_actions_listnodes_post/3,
         composites_trees_edl_hierarchy_or_template_get/2, composites_trees_edl_hierarchy_or_template_get/3,
         composites_trees_edl_hierarchy_v_parent_node_id_children_get/2, composites_trees_edl_hierarchy_v_parent_node_id_children_get/3,
         composites_trees_edl_hierarchy_v_parent_node_id_children_put/2, composites_trees_edl_hierarchy_v_parent_node_id_children_put/3,
         configuration_component_type_and_record_name_get/2, configuration_component_type_and_record_name_get/3,
         configuration_component_type_get/2, configuration_component_type_get/3,
         configuration_object_name_and_object_type_get/2, configuration_object_name_and_object_type_get/3,
         configuration_objecttype_get/1, configuration_objecttype_get/2,
         configuration_role_assignment_rule_delete/1, configuration_role_assignment_rule_delete/2,
         configuration_role_assignment_rule_get/1, configuration_role_assignment_rule_get/2,
         configuration_role_assignment_rule_post/1, configuration_role_assignment_rule_post/2,
         configuration_role_assignment_rule_put/1, configuration_role_assignment_rule_put/2,
         delegation_login_post/1, delegation_login_post/2,
         delegation_vaults_get/1, delegation_vaults_get/2,
         keep_alive_post/1, keep_alive_post/2,
         limits_get/1, limits_get/2,
         logs_api_usage_get/1, logs_api_usage_get/2,
         logs_code_debug_get/1, logs_code_debug_get/2,
         logs_code_debug_id_actions_reset_delete/2, logs_code_debug_id_actions_reset_delete/3,
         logs_code_debug_id_actions_reset_post/2, logs_code_debug_id_actions_reset_post/3,
         logs_code_debug_id_files_get/2, logs_code_debug_id_files_get/3,
         logs_code_debug_id_get/2, logs_code_debug_id_get/3,
         logs_code_debug_post/1, logs_code_debug_post/2,
         logs_code_runtime_get/1, logs_code_runtime_get/2,
         messages_message_type_actions_import_post/2, messages_message_type_actions_import_post/3,
         messages_message_type_language_lang_actions_export_post/3, messages_message_type_language_lang_actions_export_post/4,
         metadata_audittrail_audit_trail_type_get/2, metadata_audittrail_audit_trail_type_get/3,
         metadata_audittrail_get/1, metadata_audittrail_get/2,
         metadata_components_component_type_get/2, metadata_components_component_type_get/3,
         metadata_components_get/1, metadata_components_get/2,
         metadata_objects_binders_templates_bindernodes_get/1, metadata_objects_binders_templates_bindernodes_get/2,
         metadata_objects_binders_templates_get/1, metadata_objects_binders_templates_get/2,
         metadata_objects_documents_annotations_placemarks_types_placemark_type_get/2, metadata_objects_documents_annotations_placemarks_types_placemark_type_get/3,
         metadata_objects_documents_annotations_references_types_reference_type_get/2, metadata_objects_documents_annotations_references_types_reference_type_get/3,
         metadata_objects_documents_annotations_types_annotation_type_get/2, metadata_objects_documents_annotations_types_annotation_type_get/3,
         metadata_objects_documents_events_event_type_types_event_subtype_get/3, metadata_objects_documents_events_event_type_types_event_subtype_get/4,
         metadata_objects_documents_events_get/1, metadata_objects_documents_events_get/2,
         metadata_objects_documents_lock_get/1, metadata_objects_documents_lock_get/2,
         metadata_objects_documents_properties_find_common_post/1, metadata_objects_documents_properties_find_common_post/2,
         metadata_objects_documents_properties_get/1, metadata_objects_documents_properties_get/2,
         metadata_objects_documents_templates_get/1, metadata_objects_documents_templates_get/2,
         metadata_objects_documents_types_get/1, metadata_objects_documents_types_get/2,
         metadata_objects_documents_types_type_get/2, metadata_objects_documents_types_type_get/3,
         metadata_objects_documents_types_type_relationships_get/2, metadata_objects_documents_types_type_relationships_get/3,
         metadata_objects_documents_types_type_subtypes_subtype_classifications_classification_get/4, metadata_objects_documents_types_type_subtypes_subtype_classifications_classification_get/5,
         metadata_objects_documents_types_type_subtypes_subtype_get/3, metadata_objects_documents_types_type_subtypes_subtype_get/4,
         metadata_objects_groups_get/1, metadata_objects_groups_get/2,
         metadata_objects_securitypolicies_get/1, metadata_objects_securitypolicies_get/2,
         metadata_objects_users_get/1, metadata_objects_users_get/2,
         metadata_query_archived_documents_relationships_document_signature_sysr_get/1, metadata_query_archived_documents_relationships_document_signature_sysr_get/2,
         metadata_query_documents_relationships_document_signature_sysr_get/1, metadata_query_documents_relationships_document_signature_sysr_get/2,
         metadata_vobjects_get/1, metadata_vobjects_get/2,
         metadata_vobjects_object_name_actions_canceldeployment_post/2, metadata_vobjects_object_name_actions_canceldeployment_post/3,
         metadata_vobjects_object_name_fields_object_field_name_get/3, metadata_vobjects_object_name_fields_object_field_name_get/4,
         metadata_vobjects_object_name_get/2, metadata_vobjects_object_name_get/3,
         metadata_vobjects_object_name_page_layouts_get/2, metadata_vobjects_object_name_page_layouts_get/3,
         metadata_vobjects_object_name_page_layouts_layout_name_get/3, metadata_vobjects_object_name_page_layouts_layout_name_get/4,
         notifications_histories_get/1, notifications_histories_get/2,
         object_workflow_actions_action_get/2, object_workflow_actions_action_get/3,
         object_workflow_actions_action_post/2, object_workflow_actions_action_post/3,
         object_workflow_actions_canceltasks_post/1, object_workflow_actions_canceltasks_post/2,
         object_workflow_actions_cancelworkflows_post/1, object_workflow_actions_cancelworkflows_post/2,
         object_workflow_actions_get/1, object_workflow_actions_get/2,
         object_workflow_actions_reassigntasks_post/1, object_workflow_actions_reassigntasks_post/2,
         object_workflow_actions_replaceworkflowowner_post/1, object_workflow_actions_replaceworkflowowner_post/2,
         objects_binders_actions_export_job_id_results_get/2, objects_binders_actions_export_job_id_results_get/3,
         objects_binders_binder_id_actions_export_post/2, objects_binders_binder_id_actions_export_post/3,
         objects_binders_binder_id_actions_post/2, objects_binders_binder_id_actions_post/3,
         objects_binders_binder_id_binding_rule_put/2, objects_binders_binder_id_binding_rule_put/3,
         objects_binders_binder_id_delete/2, objects_binders_binder_id_delete/3,
         objects_binders_binder_id_documents_node_id_binding_rule_put/3, objects_binders_binder_id_documents_node_id_binding_rule_put/4,
         objects_binders_binder_id_documents_post/2, objects_binders_binder_id_documents_post/3,
         objects_binders_binder_id_documents_section_id_delete/3, objects_binders_binder_id_documents_section_id_delete/4,
         objects_binders_binder_id_documents_section_id_put/3, objects_binders_binder_id_documents_section_id_put/4,
         objects_binders_binder_id_get/2, objects_binders_binder_id_get/3,
         objects_binders_binder_id_post/2, objects_binders_binder_id_post/3,
         objects_binders_binder_id_put/2, objects_binders_binder_id_put/3,
         objects_binders_binder_id_roles_role_name_and_user_or_group_id_delete/4, objects_binders_binder_id_roles_role_name_and_user_or_group_id_delete/5,
         objects_binders_binder_id_sections_node_id_binding_rule_put/3, objects_binders_binder_id_sections_node_id_binding_rule_put/4,
         objects_binders_binder_id_sections_node_id_put/3, objects_binders_binder_id_sections_node_id_put/4,
         objects_binders_binder_id_sections_post/2, objects_binders_binder_id_sections_post/3,
         objects_binders_binder_id_sections_section_id_delete/3, objects_binders_binder_id_sections_section_id_delete/4,
         objects_binders_binder_id_sections_section_id_get/3, objects_binders_binder_id_sections_section_id_get/4,
         objects_binders_binder_id_versions_get/2, objects_binders_binder_id_versions_get/3,
         objects_binders_binder_id_versions_major_version_minor_version_actions_export_post/4, objects_binders_binder_id_versions_major_version_minor_version_actions_export_post/5,
         objects_binders_binder_id_versions_major_version_minor_version_delete/4, objects_binders_binder_id_versions_major_version_minor_version_delete/5,
         objects_binders_binder_id_versions_major_version_minor_version_get/4, objects_binders_binder_id_versions_major_version_minor_version_get/5,
         objects_binders_binder_id_versions_major_version_minor_version_put/4, objects_binders_binder_id_versions_major_version_minor_version_put/5,
         objects_binders_binder_id_versions_major_version_minor_version_relationships_post/4, objects_binders_binder_id_versions_major_version_minor_version_relationships_post/5,
         objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_delete/5, objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_delete/6,
         objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_get/5, objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_get/6,
         objects_binders_binder_id_versions_major_version_minor_version_sections_section_id_get/5, objects_binders_binder_id_versions_major_version_minor_version_sections_section_id_get/6,
         objects_binders_id_roles_get/2, objects_binders_id_roles_get/3,
         objects_binders_id_roles_post/2, objects_binders_id_roles_post/3,
         objects_binders_id_roles_role_name_get/3, objects_binders_id_roles_role_name_get/4,
         objects_binders_id_versions_major_version_minor_version_lifecycle_actions_get/4, objects_binders_id_versions_major_version_minor_version_lifecycle_actions_get/5,
         objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get/5, objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get/6,
         objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_put/5, objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_put/6,
         objects_binders_lifecycle_actions_post/1, objects_binders_lifecycle_actions_post/2,
         objects_binders_lifecycle_actions_user_action_name_put/2, objects_binders_lifecycle_actions_user_action_name_put/3,
         objects_binders_post/1, objects_binders_post/2,
         objects_binders_templates_get/1, objects_binders_templates_get/2,
         objects_binders_templates_post/1, objects_binders_templates_post/2,
         objects_binders_templates_put/1, objects_binders_templates_put/2,
         objects_binders_templates_template_name_bindernodes_get/2, objects_binders_templates_template_name_bindernodes_get/3,
         objects_binders_templates_template_name_bindernodes_post/2, objects_binders_templates_template_name_bindernodes_post/3,
         objects_binders_templates_template_name_bindernodes_put/2, objects_binders_templates_template_name_bindernodes_put/3,
         objects_binders_templates_template_name_delete/2, objects_binders_templates_template_name_delete/3,
         objects_binders_templates_template_name_get/2, objects_binders_templates_template_name_get/3,
         objects_deletions_documents_get/1, objects_deletions_documents_get/2,
         objects_deletions_vobjects_object_name_get/2, objects_deletions_vobjects_object_name_get/3,
         objects_documents_actions_get/1, objects_documents_actions_get/2,
         objects_documents_actions_lifecycle_and_state_and_action_job_id_results_get/3, objects_documents_actions_lifecycle_and_state_and_action_job_id_results_get/4,
         objects_documents_actions_workflow_name_get/2, objects_documents_actions_workflow_name_get/3,
         objects_documents_actions_workflow_name_post/2, objects_documents_actions_workflow_name_post/3,
         objects_documents_annotations_batch_delete/1, objects_documents_annotations_batch_delete/2,
         objects_documents_annotations_batch_post/5, objects_documents_annotations_batch_post/6,
         objects_documents_annotations_batch_put/1, objects_documents_annotations_batch_put/2,
         objects_documents_annotations_replies_batch_post/1, objects_documents_annotations_replies_batch_post/2,
         objects_documents_attachments_batch_delete/1, objects_documents_attachments_batch_delete/2,
         objects_documents_attachments_batch_post/1, objects_documents_attachments_batch_post/2,
         objects_documents_attachments_batch_put/1, objects_documents_attachments_batch_put/2,
         objects_documents_batch_actions_fileextract_job_id_results_get/2, objects_documents_batch_actions_fileextract_job_id_results_get/3,
         objects_documents_batch_actions_fileextract_post/1, objects_documents_batch_actions_fileextract_post/2,
         objects_documents_batch_actions_reclassify_put/1, objects_documents_batch_actions_reclassify_put/2,
         objects_documents_batch_actions_rerender_post/1, objects_documents_batch_actions_rerender_post/2,
         objects_documents_batch_delete/1, objects_documents_batch_delete/2,
         objects_documents_batch_lock_delete/1, objects_documents_batch_lock_delete/2,
         objects_documents_batch_post/1, objects_documents_batch_post/2,
         objects_documents_batch_put/1, objects_documents_batch_put/2,
         objects_documents_doc_id_anchors_get/2, objects_documents_doc_id_anchors_get/3,
         objects_documents_doc_id_annotations_file_get/2, objects_documents_doc_id_annotations_file_get/3,
         objects_documents_doc_id_annotations_file_post/2, objects_documents_doc_id_annotations_file_post/3,
         objects_documents_doc_id_attachments_attachment_id_delete/3, objects_documents_doc_id_attachments_attachment_id_delete/4,
         objects_documents_doc_id_attachments_attachment_id_file_get/3, objects_documents_doc_id_attachments_attachment_id_file_get/4,
         objects_documents_doc_id_attachments_attachment_id_get/3, objects_documents_doc_id_attachments_attachment_id_get/4,
         objects_documents_doc_id_attachments_attachment_id_put/3, objects_documents_doc_id_attachments_attachment_id_put/4,
         objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_delete/4, objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_delete/5,
         objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_file_get/4, objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_file_get/5,
         objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_get/4, objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_get/5,
         objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_post/4, objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_post/5,
         objects_documents_doc_id_attachments_attachment_id_versions_get/3, objects_documents_doc_id_attachments_attachment_id_versions_get/4,
         objects_documents_doc_id_attachments_file_get/2, objects_documents_doc_id_attachments_file_get/3,
         objects_documents_doc_id_attachments_get/2, objects_documents_doc_id_attachments_get/3,
         objects_documents_doc_id_attachments_post/2, objects_documents_doc_id_attachments_post/3,
         objects_documents_doc_id_audittrail_get/2, objects_documents_doc_id_audittrail_get/3,
         objects_documents_doc_id_delete/2, objects_documents_doc_id_delete/3,
         objects_documents_doc_id_events_get/2, objects_documents_doc_id_events_get/3,
         objects_documents_doc_id_file_get/2, objects_documents_doc_id_file_get/3,
         objects_documents_doc_id_get/2, objects_documents_doc_id_get/3,
         objects_documents_doc_id_lock_delete/2, objects_documents_doc_id_lock_delete/3,
         objects_documents_doc_id_lock_get/2, objects_documents_doc_id_lock_get/3,
         objects_documents_doc_id_lock_post/2, objects_documents_doc_id_lock_post/3,
         objects_documents_doc_id_major_version_minor_version_attachments_file_get/4, objects_documents_doc_id_major_version_minor_version_attachments_file_get/5,
         objects_documents_doc_id_post/2, objects_documents_doc_id_post/3,
         objects_documents_doc_id_put/2, objects_documents_doc_id_put/3,
         objects_documents_doc_id_renditions_get/2, objects_documents_doc_id_renditions_get/3,
         objects_documents_doc_id_renditions_rendition_type_delete/3, objects_documents_doc_id_renditions_rendition_type_delete/4,
         objects_documents_doc_id_renditions_rendition_type_get/3, objects_documents_doc_id_renditions_rendition_type_get/4,
         objects_documents_doc_id_renditions_rendition_type_post/3, objects_documents_doc_id_renditions_rendition_type_post/4,
         objects_documents_doc_id_renditions_rendition_type_put/3, objects_documents_doc_id_renditions_rendition_type_put/4,
         objects_documents_doc_id_roles_role_name_and_user_or_group_id_delete/4, objects_documents_doc_id_roles_role_name_and_user_or_group_id_delete/5,
         objects_documents_doc_id_version_major_version_minor_version_attachments_get/4, objects_documents_doc_id_version_major_version_minor_version_attachments_get/5,
         objects_documents_doc_id_versions_get/2, objects_documents_doc_id_versions_get/3,
         objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_get/5, objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_get/6,
         objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_replies_get/5, objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_replies_get/6,
         objects_documents_doc_id_versions_major_version_minor_version_annotations_file_get/4, objects_documents_doc_id_versions_major_version_minor_version_annotations_file_get/5,
         objects_documents_doc_id_versions_major_version_minor_version_annotations_file_post/4, objects_documents_doc_id_versions_major_version_minor_version_annotations_file_post/5,
         objects_documents_doc_id_versions_major_version_minor_version_annotations_get/4, objects_documents_doc_id_versions_major_version_minor_version_annotations_get/5,
         objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_file_get/6, objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_file_get/7,
         objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_get/6, objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_get/7,
         objects_documents_doc_id_versions_major_version_minor_version_delete/4, objects_documents_doc_id_versions_major_version_minor_version_delete/5,
         objects_documents_doc_id_versions_major_version_minor_version_doc_export_annotations_to_csv_get/4, objects_documents_doc_id_versions_major_version_minor_version_doc_export_annotations_to_csv_get/5,
         objects_documents_doc_id_versions_major_version_minor_version_events_post/4, objects_documents_doc_id_versions_major_version_minor_version_events_post/5,
         objects_documents_doc_id_versions_major_version_minor_version_export_video_annotations_get/4, objects_documents_doc_id_versions_major_version_minor_version_export_video_annotations_get/5,
         objects_documents_doc_id_versions_major_version_minor_version_file_get/4, objects_documents_doc_id_versions_major_version_minor_version_file_get/5,
         objects_documents_doc_id_versions_major_version_minor_version_get/4, objects_documents_doc_id_versions_major_version_minor_version_get/5,
         objects_documents_doc_id_versions_major_version_minor_version_put/4, objects_documents_doc_id_versions_major_version_minor_version_put/5,
         objects_documents_doc_id_versions_major_version_minor_version_relationships_get/4, objects_documents_doc_id_versions_major_version_minor_version_relationships_get/5,
         objects_documents_doc_id_versions_major_version_minor_version_relationships_post/4, objects_documents_doc_id_versions_major_version_minor_version_relationships_post/5,
         objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_delete/5, objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_delete/6,
         objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_get/5, objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_get/6,
         objects_documents_doc_id_versions_major_version_minor_version_renditions_get/4, objects_documents_doc_id_versions_major_version_minor_version_renditions_get/5,
         objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_delete/5, objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_delete/6,
         objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_get/5, objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_get/6,
         objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_post/5, objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_post/6,
         objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_put/5, objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_put/6,
         objects_documents_doc_id_versions_major_version_minor_version_thumbnail_get/4, objects_documents_doc_id_versions_major_version_minor_version_thumbnail_get/5,
         objects_documents_get/1, objects_documents_get/2,
         objects_documents_id_roles_get/2, objects_documents_id_roles_get/3,
         objects_documents_id_roles_post/2, objects_documents_id_roles_post/3,
         objects_documents_id_roles_role_name_get/3, objects_documents_id_roles_role_name_get/4,
         objects_documents_id_versions_major_version_minor_version_lifecycle_actions_get/4, objects_documents_id_versions_major_version_minor_version_lifecycle_actions_get/5,
         objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get/5, objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get/6,
         objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_put/5, objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_put/6,
         objects_documents_lifecycle_actions_post/1, objects_documents_lifecycle_actions_post/2,
         objects_documents_lifecycle_actions_user_action_name_put/2, objects_documents_lifecycle_actions_user_action_name_put/3,
         objects_documents_post/1, objects_documents_post/2,
         objects_documents_relationships_batch_delete/1, objects_documents_relationships_batch_delete/2,
         objects_documents_relationships_batch_post/1, objects_documents_relationships_batch_post/2,
         objects_documents_renditions_batch_delete/1, objects_documents_renditions_batch_delete/2,
         objects_documents_renditions_batch_post/1, objects_documents_renditions_batch_post/2,
         objects_documents_roles_batch_delete/1, objects_documents_roles_batch_delete/2,
         objects_documents_roles_batch_post/1, objects_documents_roles_batch_post/2,
         objects_documents_templates_get/1, objects_documents_templates_get/2,
         objects_documents_templates_post/1, objects_documents_templates_post/2,
         objects_documents_templates_put/1, objects_documents_templates_put/2,
         objects_documents_templates_template_name_delete/2, objects_documents_templates_template_name_delete/3,
         objects_documents_templates_template_name_file_get/2, objects_documents_templates_template_name_file_get/3,
         objects_documents_templates_template_name_get/2, objects_documents_templates_template_name_get/3,
         objects_documents_templates_template_name_put/2, objects_documents_templates_template_name_put/3,
         objects_documents_tokens_post/1, objects_documents_tokens_post/2,
         objects_documents_versions_batch_actions_fileextract_post/1, objects_documents_versions_batch_actions_fileextract_post/2,
         objects_documents_versions_batch_delete/1, objects_documents_versions_batch_delete/2,
         objects_documents_versions_batch_post/1, objects_documents_versions_batch_post/2,
         objects_domain_get/1, objects_domain_get/2,
         objects_domains_get/1, objects_domains_get/2,
         objects_edl_matched_documents_batch_actions_add_post/1, objects_edl_matched_documents_batch_actions_add_post/2,
         objects_edl_matched_documents_batch_actions_remove_post/1, objects_edl_matched_documents_batch_actions_remove_post/2,
         objects_groups_auto_get/1, objects_groups_auto_get/2,
         objects_groups_get/1, objects_groups_get/2,
         objects_groups_group_id_delete/2, objects_groups_group_id_delete/3,
         objects_groups_group_id_get/2, objects_groups_group_id_get/3,
         objects_groups_group_id_put/2, objects_groups_group_id_put/3,
         objects_groups_post/1, objects_groups_post/2,
         objects_licenses_get/1, objects_licenses_get/2,
         objects_objectworkflows_actions_get/1, objects_objectworkflows_actions_get/2,
         objects_objectworkflows_actions_workflow_name_get/2, objects_objectworkflows_actions_workflow_name_get/3,
         objects_objectworkflows_actions_workflow_name_post/2, objects_objectworkflows_actions_workflow_name_post/3,
         objects_objectworkflows_get/1, objects_objectworkflows_get/2,
         objects_objectworkflows_tasks_get/1, objects_objectworkflows_tasks_get/2,
         objects_objectworkflows_tasks_task_id_actions_accept_post/2, objects_objectworkflows_tasks_task_id_actions_accept_post/3,
         objects_objectworkflows_tasks_task_id_actions_cancel_post/2, objects_objectworkflows_tasks_task_id_actions_cancel_post/3,
         objects_objectworkflows_tasks_task_id_actions_complete_post/2, objects_objectworkflows_tasks_task_id_actions_complete_post/3,
         objects_objectworkflows_tasks_task_id_actions_get/2, objects_objectworkflows_tasks_task_id_actions_get/3,
         objects_objectworkflows_tasks_task_id_actions_mdwaccept_post/2, objects_objectworkflows_tasks_task_id_actions_mdwaccept_post/3,
         objects_objectworkflows_tasks_task_id_actions_mdwcomplete_post/2, objects_objectworkflows_tasks_task_id_actions_mdwcomplete_post/3,
         objects_objectworkflows_tasks_task_id_actions_mdwmanagecontent_post/2, objects_objectworkflows_tasks_task_id_actions_mdwmanagecontent_post/3,
         objects_objectworkflows_tasks_task_id_actions_mdwreassign_post/2, objects_objectworkflows_tasks_task_id_actions_mdwreassign_post/3,
         objects_objectworkflows_tasks_task_id_actions_reassign_post/2, objects_objectworkflows_tasks_task_id_actions_reassign_post/3,
         objects_objectworkflows_tasks_task_id_actions_task_action_get/3, objects_objectworkflows_tasks_task_id_actions_task_action_get/4,
         objects_objectworkflows_tasks_task_id_actions_undoaccept_post/2, objects_objectworkflows_tasks_task_id_actions_undoaccept_post/3,
         objects_objectworkflows_tasks_task_id_actions_updateduedate_post/2, objects_objectworkflows_tasks_task_id_actions_updateduedate_post/3,
         objects_objectworkflows_tasks_task_id_get/2, objects_objectworkflows_tasks_task_id_get/3,
         objects_objectworkflows_workflow_id_actions_get/2, objects_objectworkflows_workflow_id_actions_get/3,
         objects_objectworkflows_workflow_id_actions_workflow_action_get/3, objects_objectworkflows_workflow_id_actions_workflow_action_get/4,
         objects_objectworkflows_workflow_id_actions_workflow_action_post/3, objects_objectworkflows_workflow_id_actions_workflow_action_post/4,
         objects_objectworkflows_workflow_id_get/2, objects_objectworkflows_workflow_id_get/3,
         objects_picklists_get/1, objects_picklists_get/2,
         objects_picklists_picklist_name_get/2, objects_picklists_picklist_name_get/3,
         objects_picklists_picklist_name_picklist_value_name_delete/3, objects_picklists_picklist_name_picklist_value_name_delete/4,
         objects_picklists_picklist_name_picklist_value_name_put/3, objects_picklists_picklist_name_picklist_value_name_put/4,
         objects_picklists_picklist_name_post/2, objects_picklists_picklist_name_post/3,
         objects_picklists_picklist_name_put/2, objects_picklists_picklist_name_put/3,
         objects_sandbox_actions_buildproduction_post/1, objects_sandbox_actions_buildproduction_post/2,
         objects_sandbox_actions_promoteproduction_post/1, objects_sandbox_actions_promoteproduction_post/2,
         objects_sandbox_actions_recheckusage_post/1, objects_sandbox_actions_recheckusage_post/2,
         objects_sandbox_batch_changesize_post/1, objects_sandbox_batch_changesize_post/2,
         objects_sandbox_entitlements_set_post/1, objects_sandbox_entitlements_set_post/2,
         objects_sandbox_get/1, objects_sandbox_get/2,
         objects_sandbox_name_delete/2, objects_sandbox_name_delete/3,
         objects_sandbox_post/1, objects_sandbox_post/2,
         objects_sandbox_snapshot_api_name_actions_update_post/2, objects_sandbox_snapshot_api_name_actions_update_post/3,
         objects_sandbox_snapshot_api_name_actions_upgrade_post/2, objects_sandbox_snapshot_api_name_actions_upgrade_post/3,
         objects_sandbox_snapshot_api_name_delete/2, objects_sandbox_snapshot_api_name_delete/3,
         objects_sandbox_snapshot_get/1, objects_sandbox_snapshot_get/2,
         objects_sandbox_snapshot_post/1, objects_sandbox_snapshot_post/2,
         objects_sandbox_vault_id_actions_refresh_post/2, objects_sandbox_vault_id_actions_refresh_post/3,
         objects_sandbox_vault_id_get/2, objects_sandbox_vault_id_get/3,
         objects_securitypolicies_get/1, objects_securitypolicies_get/2,
         objects_securitypolicies_security_policy_name_get/2, objects_securitypolicies_security_policy_name_get/3,
         objects_users_get/1, objects_users_get/2,
         objects_users_id_get/2, objects_users_id_get/3,
         objects_users_id_permissions_get/2, objects_users_id_permissions_get/3,
         objects_users_id_put/2, objects_users_id_put/3,
         objects_users_me_get/1, objects_users_me_get/2,
         objects_users_me_password_post/1, objects_users_me_password_post/2,
         objects_users_me_permissions_get/1, objects_users_me_permissions_get/2,
         objects_users_me_put/1, objects_users_me_put/2,
         objects_users_post/1, objects_users_post/2,
         objects_users_put/1, objects_users_put/2,
         objects_users_user_id_delete/2, objects_users_user_id_delete/3,
         objects_users_user_id_vault_membership_vault_id_put/3, objects_users_user_id_vault_membership_vault_id_put/4,
         objects_vault_actions_compare_post/1, objects_vault_actions_compare_post/2,
         objects_vault_actions_configreport_post/1, objects_vault_actions_configreport_post/2,
         query_components_post/1, query_components_post/2,
         query_next_page_post/2, query_next_page_post/3,
         query_post/1, query_post/2,
         query_previous_page_post/2, query_previous_page_post/3,
         scim_v2_me_get/1, scim_v2_me_get/2,
         scim_v2_me_put/1, scim_v2_me_put/2,
         scim_v2_resource_types_get/1, scim_v2_resource_types_get/2,
         scim_v2_resource_types_type_get/2, scim_v2_resource_types_type_get/3,
         scim_v2_schemas_get/1, scim_v2_schemas_get/2,
         scim_v2_schemas_id_get/2, scim_v2_schemas_id_get/3,
         scim_v2_service_provider_config_get/1, scim_v2_service_provider_config_get/2,
         scim_v2_type_get/2, scim_v2_type_get/3,
         scim_v2_type_id_get/3, scim_v2_type_id_get/4,
         scim_v2_users_get/1, scim_v2_users_get/2,
         scim_v2_users_id_get/2, scim_v2_users_id_get/3,
         scim_v2_users_id_put/2, scim_v2_users_id_put/3,
         scim_v2_users_post/1, scim_v2_users_post/2,
         services_certificate_cert_id_get/2, services_certificate_cert_id_get/3,
         services_configuration_mode_actions_disable_post/1, services_configuration_mode_actions_disable_post/2,
         services_configuration_mode_actions_enable_post/1, services_configuration_mode_actions_enable_post/2,
         services_directdata_files_get/1, services_directdata_files_get/2,
         services_directdata_files_name_get/2, services_directdata_files_name_get/3,
         services_file_staging_items_content_item_get/2, services_file_staging_items_content_item_get/3,
         services_file_staging_items_item_delete/2, services_file_staging_items_item_delete/3,
         services_file_staging_items_item_get/2, services_file_staging_items_item_get/3,
         services_file_staging_items_item_put/2, services_file_staging_items_item_put/3,
         services_file_staging_items_post/1, services_file_staging_items_post/2,
         services_file_staging_upload_get/1, services_file_staging_upload_get/2,
         services_file_staging_upload_post/1, services_file_staging_upload_post/2,
         services_file_staging_upload_upload_session_id_delete/2, services_file_staging_upload_upload_session_id_delete/3,
         services_file_staging_upload_upload_session_id_get/2, services_file_staging_upload_upload_session_id_get/3,
         services_file_staging_upload_upload_session_id_parts_get/2, services_file_staging_upload_upload_session_id_parts_get/3,
         services_file_staging_upload_upload_session_id_post/2, services_file_staging_upload_upload_session_id_post/3,
         services_file_staging_upload_upload_session_id_put/2, services_file_staging_upload_upload_session_id_put/3,
         services_jobs_histories_get/1, services_jobs_histories_get/2,
         services_jobs_job_id_errors_get/2, services_jobs_job_id_errors_get/3,
         services_jobs_job_id_get/2, services_jobs_job_id_get/3,
         services_jobs_job_id_summary_get/2, services_jobs_job_id_summary_get/3,
         services_jobs_job_id_tasks_get/2, services_jobs_job_id_tasks_get/3,
         services_jobs_monitors_get/1, services_jobs_monitors_get/2,
         services_jobs_start_now_job_id_post/2, services_jobs_start_now_job_id_post/3,
         services_loader_extract_post/1, services_loader_extract_post/2,
         services_loader_job_id_tasks_task_id_failurelog_get/3, services_loader_job_id_tasks_task_id_failurelog_get/4,
         services_loader_job_id_tasks_task_id_results_get/3, services_loader_job_id_tasks_task_id_results_get/4,
         services_loader_job_id_tasks_task_id_results_renditions_get/3, services_loader_job_id_tasks_task_id_results_renditions_get/4,
         services_loader_job_id_tasks_task_id_successlog_get/3, services_loader_job_id_tasks_task_id_successlog_get/4,
         services_loader_load_post/1, services_loader_load_post/2,
         services_package_actions_validate_post/1, services_package_actions_validate_post/2,
         services_package_post/1, services_package_post/2,
         services_package_put/1, services_package_put/2,
         services_queues_get/1, services_queues_get/2,
         services_queues_queue_name_actions_disable_delivery_put/2, services_queues_queue_name_actions_disable_delivery_put/3,
         services_queues_queue_name_actions_enable_delivery_put/2, services_queues_queue_name_actions_enable_delivery_put/3,
         services_queues_queue_name_actions_reset_put/2, services_queues_queue_name_actions_reset_put/3,
         services_queues_queue_name_get/2, services_queues_queue_name_get/3,
         services_vobject_vault_package_v_package_id_actions_validate_post/2, services_vobject_vault_package_v_package_id_actions_validate_post/3,
         session_delete/1, session_delete/2,
         uicode_distributions_distribution_name_code_get/2, uicode_distributions_distribution_name_code_get/3,
         uicode_distributions_distribution_name_delete/2, uicode_distributions_distribution_name_delete/3,
         uicode_distributions_distribution_name_get/2, uicode_distributions_distribution_name_get/3,
         uicode_distributions_get/1, uicode_distributions_get/2,
         uicode_distributions_post/1, uicode_distributions_post/2,
         vobject_vault_package_v_package_id_actions_deploy_post/2, vobject_vault_package_v_package_id_actions_deploy_post/3,
         vobject_vault_package_v_package_id_actions_deploy_results_get/2, vobject_vault_package_v_package_id_actions_deploy_results_get/3,
         vobjects_cascadedelete_results_object_name_job_status_job_id_get/4, vobjects_cascadedelete_results_object_name_job_status_job_id_get/5,
         vobjects_deepcopy_results_object_name_job_status_job_id_get/4, vobjects_deepcopy_results_object_name_job_status_job_id_get/5,
         vobjects_edl_item_v_actions_createplaceholder_post/1, vobjects_edl_item_v_actions_createplaceholder_post/2,
         vobjects_merges_job_id_log_get/2, vobjects_merges_job_id_log_get/3,
         vobjects_merges_job_id_results_get/2, vobjects_merges_job_id_results_get/3,
         vobjects_merges_job_id_status_get/2, vobjects_merges_job_id_status_get/3,
         vobjects_object_name_actions_action_name_post/3, vobjects_object_name_actions_action_name_post/4,
         vobjects_object_name_actions_changetype_post/2, vobjects_object_name_actions_changetype_post/3,
         vobjects_object_name_actions_merge_post/3, vobjects_object_name_actions_merge_post/4,
         vobjects_object_name_actions_recalculaterollups_get/2, vobjects_object_name_actions_recalculaterollups_get/3,
         vobjects_object_name_actions_recalculaterollups_post/2, vobjects_object_name_actions_recalculaterollups_post/3,
         vobjects_object_name_actions_updatecorporatecurrency_put/2, vobjects_object_name_actions_updatecorporatecurrency_put/3,
         vobjects_object_name_attachments_batch_delete/2, vobjects_object_name_attachments_batch_delete/3,
         vobjects_object_name_attachments_batch_post/2, vobjects_object_name_attachments_batch_post/3,
         vobjects_object_name_attachments_batch_put/2, vobjects_object_name_attachments_batch_put/3,
         vobjects_object_name_delete/2, vobjects_object_name_delete/3,
         vobjects_object_name_id_roles_role_name_get/4, vobjects_object_name_id_roles_role_name_get/5,
         vobjects_object_name_object_record_id_actions_action_name_get/4, vobjects_object_name_object_record_id_actions_action_name_get/5,
         vobjects_object_name_object_record_id_actions_action_name_post/4, vobjects_object_name_object_record_id_actions_action_name_post/5,
         vobjects_object_name_object_record_id_actions_cascadedelete_post/3, vobjects_object_name_object_record_id_actions_cascadedelete_post/4,
         vobjects_object_name_object_record_id_actions_deepcopy_post/3, vobjects_object_name_object_record_id_actions_deepcopy_post/4,
         vobjects_object_name_object_record_id_actions_get/3, vobjects_object_name_object_record_id_actions_get/4,
         vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_get/4, vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_get/5,
         vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_post/4, vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_post/5,
         vobjects_object_name_object_record_id_attachment_fields_file_get/3, vobjects_object_name_object_record_id_attachment_fields_file_get/4,
         vobjects_object_name_object_record_id_attachments_attachment_id_delete/4, vobjects_object_name_object_record_id_attachments_attachment_id_delete/5,
         vobjects_object_name_object_record_id_attachments_attachment_id_get/4, vobjects_object_name_object_record_id_attachments_attachment_id_get/5,
         vobjects_object_name_object_record_id_attachments_attachment_id_put/4, vobjects_object_name_object_record_id_attachments_attachment_id_put/5,
         vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_delete/5, vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_delete/6,
         vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_file_get/5, vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_file_get/6,
         vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_get/5, vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_get/6,
         vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_post/5, vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_post/6,
         vobjects_object_name_object_record_id_attachments_attachment_id_versions_get/4, vobjects_object_name_object_record_id_attachments_attachment_id_versions_get/5,
         vobjects_object_name_object_record_id_attachments_file_get/3, vobjects_object_name_object_record_id_attachments_file_get/4,
         vobjects_object_name_object_record_id_attachments_get/3, vobjects_object_name_object_record_id_attachments_get/4,
         vobjects_object_name_object_record_id_attachments_post/3, vobjects_object_name_object_record_id_attachments_post/4,
         vobjects_object_name_object_record_id_audittrail_get/3, vobjects_object_name_object_record_id_audittrail_get/4,
         vobjects_object_name_object_record_id_get/3, vobjects_object_name_object_record_id_get/4,
         vobjects_object_name_post/2, vobjects_object_name_post/3,
         vobjects_object_name_put/2, vobjects_object_name_put/3,
         vobjects_object_name_roles_delete/2, vobjects_object_name_roles_delete/3,
         vobjects_object_name_roles_post/2, vobjects_object_name_roles_post/3,
         vobjects_outbound_package_v_package_id_dependencies_get/2, vobjects_outbound_package_v_package_id_dependencies_get/3]).

-define(BASE_URL, <<"/api/v25.1">>).

%% @doc Retrieve API Versions
%% 
-spec api_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
api_get(Ctx) ->
    api_get(Ctx, #{}).

-spec api_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
api_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Content File
%% 
-spec api_mdl_components_component_type_and_record_name_files_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
api_mdl_components_component_type_and_record_name_files_get(Ctx, ComponentTypeAndRecordName) ->
    api_mdl_components_component_type_and_record_name_files_get(Ctx, ComponentTypeAndRecordName, #{}).

-spec api_mdl_components_component_type_and_record_name_files_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
api_mdl_components_component_type_and_record_name_files_get(Ctx, ComponentTypeAndRecordName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/mdl/components/", ComponentTypeAndRecordName, "/files"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Component Record (MDL)
%% 
-spec api_mdl_components_component_type_and_record_name_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
api_mdl_components_component_type_and_record_name_get(Ctx, ComponentTypeAndRecordName) ->
    api_mdl_components_component_type_and_record_name_get(Ctx, ComponentTypeAndRecordName, #{}).

-spec api_mdl_components_component_type_and_record_name_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
api_mdl_components_component_type_and_record_name_get(Ctx, ComponentTypeAndRecordName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/mdl/components/", ComponentTypeAndRecordName, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Asynchronous MDL Script Results
%% 
-spec api_mdl_execute_async_job_id_results_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
api_mdl_execute_async_job_id_results_get(Ctx, JobId) ->
    api_mdl_execute_async_job_id_results_get(Ctx, JobId, #{}).

-spec api_mdl_execute_async_job_id_results_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
api_mdl_execute_async_job_id_results_get(Ctx, JobId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/mdl/execute_async/", JobId, "/results"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Execute MDL Script Asynchronously
%% 
-spec api_mdl_execute_async_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
api_mdl_execute_async_post(Ctx) ->
    api_mdl_execute_async_post(Ctx, #{}).

-spec api_mdl_execute_async_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
api_mdl_execute_async_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/api/mdl/execute_async"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Execute MDL Script
%% 
-spec api_mdl_execute_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
api_mdl_execute_post(Ctx) ->
    api_mdl_execute_post(Ctx, #{}).

-spec api_mdl_execute_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
api_mdl_execute_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/api/mdl/execute"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Upload Content File
%% 
-spec api_mdl_files_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
api_mdl_files_post(Ctx) ->
    api_mdl_files_post(Ctx, #{}).

-spec api_mdl_files_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
api_mdl_files_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/api/mdl/files"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Audit Details
%% 
-spec audittrail_audit_trail_type_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
audittrail_audit_trail_type_get(Ctx, AuditTrailType) ->
    audittrail_audit_trail_type_get(Ctx, AuditTrailType, #{}).

-spec audittrail_audit_trail_type_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
audittrail_audit_trail_type_get(Ctx, AuditTrailType, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/audittrail/", AuditTrailType, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['start_date', 'end_date', 'all_dates', 'format_result', 'limit', 'offset', 'objects', 'events'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Authentication Type Discovery
%% 
-spec auth_discovery_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
auth_discovery_post(Ctx) ->
    auth_discovery_post(Ctx, #{}).

-spec auth_discovery_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
auth_discovery_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/auth/discovery"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc OAuth 2.0 / OpenID Connect
%% 
-spec auth_oauth_session_oath_oidc_profile_id_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
auth_oauth_session_oath_oidc_profile_id_post(Ctx, OathOidcProfileId) ->
    auth_oauth_session_oath_oidc_profile_id_post(Ctx, OathOidcProfileId, #{}).

-spec auth_oauth_session_oath_oidc_profile_id_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
auth_oauth_session_oath_oidc_profile_id_post(Ctx, OathOidcProfileId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/auth/oauth/session/", OathOidcProfileId, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc User Name and Password
%% 
-spec auth_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
auth_post(Ctx) ->
    auth_post(Ctx, #{}).

-spec auth_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
auth_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/auth"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete Single Source Code File
%% 
-spec code_class_name_delete(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
code_class_name_delete(Ctx, ClassName) ->
    code_class_name_delete(Ctx, ClassName, #{}).

-spec code_class_name_delete(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
code_class_name_delete(Ctx, ClassName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/code/", ClassName, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Disable Vault Extension
%% 
-spec code_class_name_disable_put(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
code_class_name_disable_put(Ctx, ClassName) ->
    code_class_name_disable_put(Ctx, ClassName, #{}).

-spec code_class_name_disable_put(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
code_class_name_disable_put(Ctx, ClassName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/code/", ClassName, "/disable"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Enable Vault Extension
%% 
-spec code_class_name_enable_put(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
code_class_name_enable_put(Ctx, ClassName) ->
    code_class_name_enable_put(Ctx, ClassName, #{}).

-spec code_class_name_enable_put(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
code_class_name_enable_put(Ctx, ClassName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/code/", ClassName, "/enable"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Single Source Code File
%% 
-spec code_class_name_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
code_class_name_get(Ctx, ClassName) ->
    code_class_name_get(Ctx, ClassName, #{}).

-spec code_class_name_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
code_class_name_get(Ctx, ClassName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/code/", ClassName, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve All Profiling Sessions
%% 
-spec code_profiler_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
code_profiler_get(Ctx) ->
    code_profiler_get(Ctx, #{}).

-spec code_profiler_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
code_profiler_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/code/profiler"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create Profiling Session
%% 
-spec code_profiler_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
code_profiler_post(Ctx) ->
    code_profiler_post(Ctx, #{}).

-spec code_profiler_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
code_profiler_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/code/profiler"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc End Profiling Session
%% 
-spec code_profiler_session_name_actions_end_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
code_profiler_session_name_actions_end_post(Ctx, SessionName) ->
    code_profiler_session_name_actions_end_post(Ctx, SessionName, #{}).

-spec code_profiler_session_name_actions_end_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
code_profiler_session_name_actions_end_post(Ctx, SessionName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/code/profiler/", SessionName, "/actions/end"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete Profiling Session
%% 
-spec code_profiler_session_name_delete(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
code_profiler_session_name_delete(Ctx, SessionName) ->
    code_profiler_session_name_delete(Ctx, SessionName, #{}).

-spec code_profiler_session_name_delete(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
code_profiler_session_name_delete(Ctx, SessionName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/code/profiler/", SessionName, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Profiling Session
%% 
-spec code_profiler_session_name_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
code_profiler_session_name_get(Ctx, SessionName) ->
    code_profiler_session_name_get(Ctx, SessionName, #{}).

-spec code_profiler_session_name_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
code_profiler_session_name_get(Ctx, SessionName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/code/profiler/", SessionName, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Download Profiling Session Results
%% 
-spec code_profiler_session_name_results_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
code_profiler_session_name_results_get(Ctx, SessionName) ->
    code_profiler_session_name_results_get(Ctx, SessionName, #{}).

-spec code_profiler_session_name_results_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
code_profiler_session_name_results_get(Ctx, SessionName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/code/profiler/", SessionName, "/results"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Add or Replace Single Source Code File
%% 
-spec code_put(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
code_put(Ctx) ->
    code_put(Ctx, #{}).

-spec code_put(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
code_put(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/code"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Specific Root Nodes
%% 
-spec composites_trees_edl_hierarchy_or_template_actions_listnodes_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
composites_trees_edl_hierarchy_or_template_actions_listnodes_post(Ctx, EdlHierarchyOrTemplate) ->
    composites_trees_edl_hierarchy_or_template_actions_listnodes_post(Ctx, EdlHierarchyOrTemplate, #{}).

-spec composites_trees_edl_hierarchy_or_template_actions_listnodes_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
composites_trees_edl_hierarchy_or_template_actions_listnodes_post(Ctx, EdlHierarchyOrTemplate, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/composites/trees/", EdlHierarchyOrTemplate, "/actions/listnodes"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve All Root Nodes
%% 
-spec composites_trees_edl_hierarchy_or_template_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
composites_trees_edl_hierarchy_or_template_get(Ctx, EdlHierarchyOrTemplate) ->
    composites_trees_edl_hierarchy_or_template_get(Ctx, EdlHierarchyOrTemplate, #{}).

-spec composites_trees_edl_hierarchy_or_template_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
composites_trees_edl_hierarchy_or_template_get(Ctx, EdlHierarchyOrTemplate, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/composites/trees/", EdlHierarchyOrTemplate, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve a Node's Children
%% 
-spec composites_trees_edl_hierarchy_v_parent_node_id_children_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
composites_trees_edl_hierarchy_v_parent_node_id_children_get(Ctx, ParentNodeId) ->
    composites_trees_edl_hierarchy_v_parent_node_id_children_get(Ctx, ParentNodeId, #{}).

-spec composites_trees_edl_hierarchy_v_parent_node_id_children_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
composites_trees_edl_hierarchy_v_parent_node_id_children_get(Ctx, ParentNodeId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/composites/trees/edl_hierarchy__v/", ParentNodeId, "/children"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update Node Order
%% 
-spec composites_trees_edl_hierarchy_v_parent_node_id_children_put(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
composites_trees_edl_hierarchy_v_parent_node_id_children_put(Ctx, ParentNodeId) ->
    composites_trees_edl_hierarchy_v_parent_node_id_children_put(Ctx, ParentNodeId, #{}).

-spec composites_trees_edl_hierarchy_v_parent_node_id_children_put(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
composites_trees_edl_hierarchy_v_parent_node_id_children_put(Ctx, ParentNodeId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/composites/trees/edl_hierarchy__v/", ParentNodeId, "/children"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Component Record (XML/JSON)
%% 
-spec configuration_component_type_and_record_name_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
configuration_component_type_and_record_name_get(Ctx, ComponentTypeAndRecordName) ->
    configuration_component_type_and_record_name_get(Ctx, ComponentTypeAndRecordName, #{}).

-spec configuration_component_type_and_record_name_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
configuration_component_type_and_record_name_get(Ctx, ComponentTypeAndRecordName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/configuration/", ComponentTypeAndRecordName, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['loc'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Component Record Collection
%% 
-spec configuration_component_type_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
configuration_component_type_get(Ctx, ComponentType) ->
    configuration_component_type_get(Ctx, ComponentType, #{}).

-spec configuration_component_type_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
configuration_component_type_get(Ctx, ComponentType, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/configuration/", ComponentType, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Details from a Specific Object
%% 
-spec configuration_object_name_and_object_type_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
configuration_object_name_and_object_type_get(Ctx, ObjectNameAndObjectType) ->
    configuration_object_name_and_object_type_get(Ctx, ObjectNameAndObjectType, #{}).

-spec configuration_object_name_and_object_type_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
configuration_object_name_and_object_type_get(Ctx, ObjectNameAndObjectType, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/configuration/", ObjectNameAndObjectType, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['loc'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Details from All Object Types
%% 
-spec configuration_objecttype_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
configuration_objecttype_get(Ctx) ->
    configuration_objecttype_get(Ctx, #{}).

-spec configuration_objecttype_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
configuration_objecttype_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/configuration/Objecttype"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete Lifecycle Role Assignment Override Rules
%% 
-spec configuration_role_assignment_rule_delete(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
configuration_role_assignment_rule_delete(Ctx) ->
    configuration_role_assignment_rule_delete(Ctx, #{}).

-spec configuration_role_assignment_rule_delete(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
configuration_role_assignment_rule_delete(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/configuration/role_assignment_rule"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Lifecycle Role Assignment Rules (Default & Override)
%% 
-spec configuration_role_assignment_rule_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
configuration_role_assignment_rule_get(Ctx) ->
    configuration_role_assignment_rule_get(Ctx, #{}).

-spec configuration_role_assignment_rule_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
configuration_role_assignment_rule_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/configuration/role_assignment_rule"],
    QS = lists:flatten([])++openapi_utils:optional_params(['lifecycle__v', 'role__v', 'product__v', 'country__v', 'study__v', 'study_country__v'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create Lifecycle Role Assignment Override Rules
%% 
-spec configuration_role_assignment_rule_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
configuration_role_assignment_rule_post(Ctx) ->
    configuration_role_assignment_rule_post(Ctx, #{}).

-spec configuration_role_assignment_rule_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
configuration_role_assignment_rule_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/configuration/role_assignment_rule"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update Lifecycle Role Assignment Rules (Default & Override)
%% 
-spec configuration_role_assignment_rule_put(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
configuration_role_assignment_rule_put(Ctx) ->
    configuration_role_assignment_rule_put(Ctx, #{}).

-spec configuration_role_assignment_rule_put(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
configuration_role_assignment_rule_put(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/configuration/role_assignment_rule"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Initiate Delegated Session
%% 
-spec delegation_login_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delegation_login_post(Ctx) ->
    delegation_login_post(Ctx, #{}).

-spec delegation_login_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delegation_login_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/delegation/login"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Delegations
%% 
-spec delegation_vaults_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delegation_vaults_get(Ctx) ->
    delegation_vaults_get(Ctx, #{}).

-spec delegation_vaults_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delegation_vaults_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/delegation/vaults"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Session Keep Alive
%% 
-spec keep_alive_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
keep_alive_post(Ctx) ->
    keep_alive_post(Ctx, #{}).

-spec keep_alive_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
keep_alive_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/keep-alive"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Limits on Objects
%% 
-spec limits_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
limits_get(Ctx) ->
    limits_get(Ctx, #{}).

-spec limits_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
limits_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/limits"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Download Daily API Usage
%% 
-spec logs_api_usage_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
logs_api_usage_get(Ctx) ->
    logs_api_usage_get(Ctx, #{}).

-spec logs_api_usage_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
logs_api_usage_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/logs/api_usage"],
    QS = lists:flatten([])++openapi_utils:optional_params(['date', 'log_format'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve All Debug Logs
%% 
-spec logs_code_debug_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
logs_code_debug_get(Ctx) ->
    logs_code_debug_get(Ctx, #{}).

-spec logs_code_debug_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
logs_code_debug_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/logs/code/debug"],
    QS = lists:flatten([])++openapi_utils:optional_params(['user_id', 'include_inactive'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete Debug Log
%% 
-spec logs_code_debug_id_actions_reset_delete(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
logs_code_debug_id_actions_reset_delete(Ctx, Id) ->
    logs_code_debug_id_actions_reset_delete(Ctx, Id, #{}).

-spec logs_code_debug_id_actions_reset_delete(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
logs_code_debug_id_actions_reset_delete(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/logs/code/debug/", Id, "/actions/reset"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Reset Debug Log
%% 
-spec logs_code_debug_id_actions_reset_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
logs_code_debug_id_actions_reset_post(Ctx, Id) ->
    logs_code_debug_id_actions_reset_post(Ctx, Id, #{}).

-spec logs_code_debug_id_actions_reset_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
logs_code_debug_id_actions_reset_post(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/logs/code/debug/", Id, "/actions/reset"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Download Debug Log Files
%% 
-spec logs_code_debug_id_files_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
logs_code_debug_id_files_get(Ctx, Id) ->
    logs_code_debug_id_files_get(Ctx, Id, #{}).

-spec logs_code_debug_id_files_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
logs_code_debug_id_files_get(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/logs/code/debug/", Id, "/files"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Single Debug Log
%% 
-spec logs_code_debug_id_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
logs_code_debug_id_get(Ctx, Id) ->
    logs_code_debug_id_get(Ctx, Id, #{}).

-spec logs_code_debug_id_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
logs_code_debug_id_get(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/logs/code/debug/", Id, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create Debug Log
%% 
-spec logs_code_debug_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
logs_code_debug_post(Ctx) ->
    logs_code_debug_post(Ctx, #{}).

-spec logs_code_debug_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
logs_code_debug_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/logs/code/debug"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Download SDK Runtime Log
%% 
-spec logs_code_runtime_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
logs_code_runtime_get(Ctx) ->
    logs_code_runtime_get(Ctx, #{}).

-spec logs_code_runtime_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
logs_code_runtime_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/logs/code/runtime"],
    QS = lists:flatten([])++openapi_utils:optional_params(['date', 'log_format'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Import Bulk Translation File
%% 
-spec messages_message_type_actions_import_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
messages_message_type_actions_import_post(Ctx, MessageType) ->
    messages_message_type_actions_import_post(Ctx, MessageType, #{}).

-spec messages_message_type_actions_import_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
messages_message_type_actions_import_post(Ctx, MessageType, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/messages/", MessageType, "/actions/import"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Export Bulk Translation File
%% 
-spec messages_message_type_language_lang_actions_export_post(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
messages_message_type_language_lang_actions_export_post(Ctx, MessageType, Lang) ->
    messages_message_type_language_lang_actions_export_post(Ctx, MessageType, Lang, #{}).

-spec messages_message_type_language_lang_actions_export_post(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
messages_message_type_language_lang_actions_export_post(Ctx, MessageType, Lang, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/messages/", MessageType, "/language/", Lang, "/actions/export"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Audit Metadata
%% 
-spec metadata_audittrail_audit_trail_type_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_audittrail_audit_trail_type_get(Ctx, AuditTrailType) ->
    metadata_audittrail_audit_trail_type_get(Ctx, AuditTrailType, #{}).

-spec metadata_audittrail_audit_trail_type_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_audittrail_audit_trail_type_get(Ctx, AuditTrailType, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/metadata/audittrail/", AuditTrailType, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Audit Types
%% 
-spec metadata_audittrail_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_audittrail_get(Ctx) ->
    metadata_audittrail_get(Ctx, #{}).

-spec metadata_audittrail_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_audittrail_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/metadata/audittrail"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Component Type Metadata
%% 
-spec metadata_components_component_type_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_components_component_type_get(Ctx, ComponentType) ->
    metadata_components_component_type_get(Ctx, ComponentType, #{}).

-spec metadata_components_component_type_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_components_component_type_get(Ctx, ComponentType, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/metadata/components/", ComponentType, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve All Component Metadata
%% 
-spec metadata_components_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_components_get(Ctx) ->
    metadata_components_get(Ctx, #{}).

-spec metadata_components_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_components_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/metadata/components"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Binder Template Node Metadata
%% 
-spec metadata_objects_binders_templates_bindernodes_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_objects_binders_templates_bindernodes_get(Ctx) ->
    metadata_objects_binders_templates_bindernodes_get(Ctx, #{}).

-spec metadata_objects_binders_templates_bindernodes_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_objects_binders_templates_bindernodes_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/metadata/objects/binders/templates/bindernodes"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Binder Template Metadata
%% 
-spec metadata_objects_binders_templates_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_objects_binders_templates_get(Ctx) ->
    metadata_objects_binders_templates_get(Ctx, #{}).

-spec metadata_objects_binders_templates_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_objects_binders_templates_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/metadata/objects/binders/templates"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Annotation Placemark Type Metadata
%% 
-spec metadata_objects_documents_annotations_placemarks_types_placemark_type_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_objects_documents_annotations_placemarks_types_placemark_type_get(Ctx, PlacemarkType) ->
    metadata_objects_documents_annotations_placemarks_types_placemark_type_get(Ctx, PlacemarkType, #{}).

-spec metadata_objects_documents_annotations_placemarks_types_placemark_type_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_objects_documents_annotations_placemarks_types_placemark_type_get(Ctx, PlacemarkType, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/metadata/objects/documents/annotations/placemarks/types/", PlacemarkType, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Annotation Reference Type Metadata
%% 
-spec metadata_objects_documents_annotations_references_types_reference_type_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_objects_documents_annotations_references_types_reference_type_get(Ctx, ReferenceType) ->
    metadata_objects_documents_annotations_references_types_reference_type_get(Ctx, ReferenceType, #{}).

-spec metadata_objects_documents_annotations_references_types_reference_type_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_objects_documents_annotations_references_types_reference_type_get(Ctx, ReferenceType, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/metadata/objects/documents/annotations/references/types/", ReferenceType, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Annotation Type Metadata
%% 
-spec metadata_objects_documents_annotations_types_annotation_type_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_objects_documents_annotations_types_annotation_type_get(Ctx, AnnotationType) ->
    metadata_objects_documents_annotations_types_annotation_type_get(Ctx, AnnotationType, #{}).

-spec metadata_objects_documents_annotations_types_annotation_type_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_objects_documents_annotations_types_annotation_type_get(Ctx, AnnotationType, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/metadata/objects/documents/annotations/types/", AnnotationType, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Document Event SubType Metadata
%% 
-spec metadata_objects_documents_events_event_type_types_event_subtype_get(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_objects_documents_events_event_type_types_event_subtype_get(Ctx, EventType, EventSubtype) ->
    metadata_objects_documents_events_event_type_types_event_subtype_get(Ctx, EventType, EventSubtype, #{}).

-spec metadata_objects_documents_events_event_type_types_event_subtype_get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_objects_documents_events_event_type_types_event_subtype_get(Ctx, EventType, EventSubtype, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/metadata/objects/documents/events/", EventType, "/types/", EventSubtype, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Document Event Types and Subtypes
%% 
-spec metadata_objects_documents_events_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_objects_documents_events_get(Ctx) ->
    metadata_objects_documents_events_get(Ctx, #{}).

-spec metadata_objects_documents_events_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_objects_documents_events_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/metadata/objects/documents/events"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Document Lock Metadata
%% 
-spec metadata_objects_documents_lock_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_objects_documents_lock_get(Ctx) ->
    metadata_objects_documents_lock_get(Ctx, #{}).

-spec metadata_objects_documents_lock_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_objects_documents_lock_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/metadata/objects/documents/lock"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Common Document Fields
%% 
-spec metadata_objects_documents_properties_find_common_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_objects_documents_properties_find_common_post(Ctx) ->
    metadata_objects_documents_properties_find_common_post(Ctx, #{}).

-spec metadata_objects_documents_properties_find_common_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_objects_documents_properties_find_common_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/metadata/objects/documents/properties/find_common"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Content-Type', 'Accept', 'Authorization', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve All Document Fields
%% 
-spec metadata_objects_documents_properties_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_objects_documents_properties_get(Ctx) ->
    metadata_objects_documents_properties_get(Ctx, #{}).

-spec metadata_objects_documents_properties_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_objects_documents_properties_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/metadata/objects/documents/properties"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Document Template Metadata
%% 
-spec metadata_objects_documents_templates_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_objects_documents_templates_get(Ctx) ->
    metadata_objects_documents_templates_get(Ctx, #{}).

-spec metadata_objects_documents_templates_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_objects_documents_templates_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/metadata/objects/documents/templates"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve All Document Types
%% 
-spec metadata_objects_documents_types_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_objects_documents_types_get(Ctx) ->
    metadata_objects_documents_types_get(Ctx, #{}).

-spec metadata_objects_documents_types_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_objects_documents_types_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/metadata/objects/documents/types"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Document Type
%% 
-spec metadata_objects_documents_types_type_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_objects_documents_types_type_get(Ctx, Type) ->
    metadata_objects_documents_types_type_get(Ctx, Type, #{}).

-spec metadata_objects_documents_types_type_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_objects_documents_types_type_get(Ctx, Type, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/metadata/objects/documents/types/", Type, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Document Type Relationships
%% 
-spec metadata_objects_documents_types_type_relationships_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_objects_documents_types_type_relationships_get(Ctx, Type) ->
    metadata_objects_documents_types_type_relationships_get(Ctx, Type, #{}).

-spec metadata_objects_documents_types_type_relationships_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_objects_documents_types_type_relationships_get(Ctx, Type, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/metadata/objects/documents/types/", Type, "/relationships"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Document Classification
%% 
-spec metadata_objects_documents_types_type_subtypes_subtype_classifications_classification_get(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_objects_documents_types_type_subtypes_subtype_classifications_classification_get(Ctx, Type, Subtype, Classification) ->
    metadata_objects_documents_types_type_subtypes_subtype_classifications_classification_get(Ctx, Type, Subtype, Classification, #{}).

-spec metadata_objects_documents_types_type_subtypes_subtype_classifications_classification_get(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_objects_documents_types_type_subtypes_subtype_classifications_classification_get(Ctx, Type, Subtype, Classification, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/metadata/objects/documents/types/", Type, "/subtypes/", Subtype, "/classifications/", Classification, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Document Subtype
%% 
-spec metadata_objects_documents_types_type_subtypes_subtype_get(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_objects_documents_types_type_subtypes_subtype_get(Ctx, Type, Subtype) ->
    metadata_objects_documents_types_type_subtypes_subtype_get(Ctx, Type, Subtype, #{}).

-spec metadata_objects_documents_types_type_subtypes_subtype_get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_objects_documents_types_type_subtypes_subtype_get(Ctx, Type, Subtype, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/metadata/objects/documents/types/", Type, "/subtypes/", Subtype, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Group Metadata
%% 
-spec metadata_objects_groups_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_objects_groups_get(Ctx) ->
    metadata_objects_groups_get(Ctx, #{}).

-spec metadata_objects_groups_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_objects_groups_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/metadata/objects/groups"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Security Policy Metadata
%% 
-spec metadata_objects_securitypolicies_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_objects_securitypolicies_get(Ctx) ->
    metadata_objects_securitypolicies_get(Ctx, #{}).

-spec metadata_objects_securitypolicies_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_objects_securitypolicies_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/metadata/objects/securitypolicies"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve User Metadata
%% 
-spec metadata_objects_users_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_objects_users_get(Ctx) ->
    metadata_objects_users_get(Ctx, #{}).

-spec metadata_objects_users_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_objects_users_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/metadata/objects/users"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Archived Document Signature Metadata
%% 
-spec metadata_query_archived_documents_relationships_document_signature_sysr_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_query_archived_documents_relationships_document_signature_sysr_get(Ctx) ->
    metadata_query_archived_documents_relationships_document_signature_sysr_get(Ctx, #{}).

-spec metadata_query_archived_documents_relationships_document_signature_sysr_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_query_archived_documents_relationships_document_signature_sysr_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/metadata/query/archived_documents/relationships/document_signature__sysr"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Document Signature Metadata
%% 
-spec metadata_query_documents_relationships_document_signature_sysr_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_query_documents_relationships_document_signature_sysr_get(Ctx) ->
    metadata_query_documents_relationships_document_signature_sysr_get(Ctx, #{}).

-spec metadata_query_documents_relationships_document_signature_sysr_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_query_documents_relationships_document_signature_sysr_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/metadata/query/documents/relationships/document_signature__sysr"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Object Collection
%% 
-spec metadata_vobjects_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_vobjects_get(Ctx) ->
    metadata_vobjects_get(Ctx, #{}).

-spec metadata_vobjects_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_vobjects_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/metadata/vobjects"],
    QS = lists:flatten([])++openapi_utils:optional_params(['loc'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Cancel Raw Object Deployment
%% 
-spec metadata_vobjects_object_name_actions_canceldeployment_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_vobjects_object_name_actions_canceldeployment_post(Ctx, ObjectName) ->
    metadata_vobjects_object_name_actions_canceldeployment_post(Ctx, ObjectName, #{}).

-spec metadata_vobjects_object_name_actions_canceldeployment_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_vobjects_object_name_actions_canceldeployment_post(Ctx, ObjectName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/metadata/vobjects/", ObjectName, "/actions/canceldeployment"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Object Field Metadata
%% 
-spec metadata_vobjects_object_name_fields_object_field_name_get(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_vobjects_object_name_fields_object_field_name_get(Ctx, ObjectName, ObjectFieldName) ->
    metadata_vobjects_object_name_fields_object_field_name_get(Ctx, ObjectName, ObjectFieldName, #{}).

-spec metadata_vobjects_object_name_fields_object_field_name_get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_vobjects_object_name_fields_object_field_name_get(Ctx, ObjectName, ObjectFieldName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/metadata/vobjects/", ObjectName, "/fields/", ObjectFieldName, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['loc'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Object Metadata
%% 
-spec metadata_vobjects_object_name_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_vobjects_object_name_get(Ctx, ObjectName) ->
    metadata_vobjects_object_name_get(Ctx, ObjectName, #{}).

-spec metadata_vobjects_object_name_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_vobjects_object_name_get(Ctx, ObjectName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/metadata/vobjects/", ObjectName, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['loc'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Page Layouts
%% 
-spec metadata_vobjects_object_name_page_layouts_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_vobjects_object_name_page_layouts_get(Ctx, ObjectName) ->
    metadata_vobjects_object_name_page_layouts_get(Ctx, ObjectName, #{}).

-spec metadata_vobjects_object_name_page_layouts_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_vobjects_object_name_page_layouts_get(Ctx, ObjectName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/metadata/vobjects/", ObjectName, "/page_layouts"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Page Layout Metadata
%% 
-spec metadata_vobjects_object_name_page_layouts_layout_name_get(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_vobjects_object_name_page_layouts_layout_name_get(Ctx, ObjectName, LayoutName) ->
    metadata_vobjects_object_name_page_layouts_layout_name_get(Ctx, ObjectName, LayoutName, #{}).

-spec metadata_vobjects_object_name_page_layouts_layout_name_get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
metadata_vobjects_object_name_page_layouts_layout_name_get(Ctx, ObjectName, LayoutName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/metadata/vobjects/", ObjectName, "/page_layouts/", LayoutName, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Email Notification Histories
%% 
-spec notifications_histories_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
notifications_histories_get(Ctx) ->
    notifications_histories_get(Ctx, #{}).

-spec notifications_histories_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
notifications_histories_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/notifications/histories"],
    QS = lists:flatten([])++openapi_utils:optional_params(['start_date', 'end_date', 'all_dates', 'format_result', 'limit', 'offset'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Bulk Workflow Action Details
%% 
-spec object_workflow_actions_action_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
object_workflow_actions_action_get(Ctx, Action) ->
    object_workflow_actions_action_get(Ctx, Action, #{}).

-spec object_workflow_actions_action_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
object_workflow_actions_action_get(Ctx, Action, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/object/workflow/actions/", Action, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Initiate Workflow Actions on Multiple Workflows
%% 
-spec object_workflow_actions_action_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
object_workflow_actions_action_post(Ctx, Action) ->
    object_workflow_actions_action_post(Ctx, Action, #{}).

-spec object_workflow_actions_action_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
object_workflow_actions_action_post(Ctx, Action, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/object/workflow/actions/", Action, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Cancel Workflow Tasks
%% 
-spec object_workflow_actions_canceltasks_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
object_workflow_actions_canceltasks_post(Ctx) ->
    object_workflow_actions_canceltasks_post(Ctx, #{}).

-spec object_workflow_actions_canceltasks_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
object_workflow_actions_canceltasks_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/object/workflow/actions/canceltasks"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Cancel Workflows
%% 
-spec object_workflow_actions_cancelworkflows_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
object_workflow_actions_cancelworkflows_post(Ctx) ->
    object_workflow_actions_cancelworkflows_post(Ctx, #{}).

-spec object_workflow_actions_cancelworkflows_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
object_workflow_actions_cancelworkflows_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/object/workflow/actions/cancelworkflows"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Bulk Workflow Actions
%% 
-spec object_workflow_actions_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
object_workflow_actions_get(Ctx) ->
    object_workflow_actions_get(Ctx, #{}).

-spec object_workflow_actions_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
object_workflow_actions_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/object/workflow/actions"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Reassign Workflow Tasks
%% 
-spec object_workflow_actions_reassigntasks_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
object_workflow_actions_reassigntasks_post(Ctx) ->
    object_workflow_actions_reassigntasks_post(Ctx, #{}).

-spec object_workflow_actions_reassigntasks_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
object_workflow_actions_reassigntasks_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/object/workflow/actions/reassigntasks"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Replace Workflow Owner
%% 
-spec object_workflow_actions_replaceworkflowowner_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
object_workflow_actions_replaceworkflowowner_post(Ctx) ->
    object_workflow_actions_replaceworkflowowner_post(Ctx, #{}).

-spec object_workflow_actions_replaceworkflowowner_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
object_workflow_actions_replaceworkflowowner_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/object/workflow/actions/replaceworkflowowner"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Binder Export Results
%% 
-spec objects_binders_actions_export_job_id_results_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_actions_export_job_id_results_get(Ctx, JobId) ->
    objects_binders_actions_export_job_id_results_get(Ctx, JobId, #{}).

-spec objects_binders_actions_export_job_id_results_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_actions_export_job_id_results_get(Ctx, JobId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/binders/actions/export/", JobId, "/results"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Export Binder (Latest Version)
%% 
-spec objects_binders_binder_id_actions_export_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_actions_export_post(Ctx, BinderId) ->
    objects_binders_binder_id_actions_export_post(Ctx, BinderId, #{}).

-spec objects_binders_binder_id_actions_export_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_actions_export_post(Ctx, BinderId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/binders/", BinderId, "/actions/export"],
    QS = lists:flatten([])++openapi_utils:optional_params(['source', 'renditiontype', 'docversion', 'attachments', 'export', 'docfield'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Refresh Binder Auto-Filing
%% 
-spec objects_binders_binder_id_actions_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_actions_post(Ctx, BinderId) ->
    objects_binders_binder_id_actions_post(Ctx, BinderId, #{}).

-spec objects_binders_binder_id_actions_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_actions_post(Ctx, BinderId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/binders/", BinderId, "/actions"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update Binding Rule
%% 
-spec objects_binders_binder_id_binding_rule_put(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_binding_rule_put(Ctx, BinderId) ->
    objects_binders_binder_id_binding_rule_put(Ctx, BinderId, #{}).

-spec objects_binders_binder_id_binding_rule_put(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_binding_rule_put(Ctx, BinderId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/objects/binders/", BinderId, "/binding_rule"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Content-Type', 'Accept', 'Authorization', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete Binder
%% 
-spec objects_binders_binder_id_delete(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_delete(Ctx, BinderId) ->
    objects_binders_binder_id_delete(Ctx, BinderId, #{}).

-spec objects_binders_binder_id_delete(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_delete(Ctx, BinderId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/objects/binders/", BinderId, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update Binder Document Binding Rule
%% 
-spec objects_binders_binder_id_documents_node_id_binding_rule_put(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_documents_node_id_binding_rule_put(Ctx, BinderId, NodeId) ->
    objects_binders_binder_id_documents_node_id_binding_rule_put(Ctx, BinderId, NodeId, #{}).

-spec objects_binders_binder_id_documents_node_id_binding_rule_put(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_documents_node_id_binding_rule_put(Ctx, BinderId, NodeId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/objects/binders/", BinderId, "/documents/", NodeId, "/binding_rule"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Add Document to Binder
%% 
-spec objects_binders_binder_id_documents_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_documents_post(Ctx, BinderId) ->
    objects_binders_binder_id_documents_post(Ctx, BinderId, #{}).

-spec objects_binders_binder_id_documents_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_documents_post(Ctx, BinderId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/binders/", BinderId, "/documents"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Remove Document from Binder
%% 
-spec objects_binders_binder_id_documents_section_id_delete(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_documents_section_id_delete(Ctx, BinderId, SectionId) ->
    objects_binders_binder_id_documents_section_id_delete(Ctx, BinderId, SectionId, #{}).

-spec objects_binders_binder_id_documents_section_id_delete(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_documents_section_id_delete(Ctx, BinderId, SectionId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/objects/binders/", BinderId, "/documents/", SectionId, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Move Document in Binder
%% 
-spec objects_binders_binder_id_documents_section_id_put(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_documents_section_id_put(Ctx, BinderId, SectionId) ->
    objects_binders_binder_id_documents_section_id_put(Ctx, BinderId, SectionId, #{}).

-spec objects_binders_binder_id_documents_section_id_put(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_documents_section_id_put(Ctx, BinderId, SectionId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/objects/binders/", BinderId, "/documents/", SectionId, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Binder
%% 
-spec objects_binders_binder_id_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_get(Ctx, BinderId) ->
    objects_binders_binder_id_get(Ctx, BinderId, #{}).

-spec objects_binders_binder_id_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_get(Ctx, BinderId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/binders/", BinderId, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['depth'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create Binder Version
%% 
-spec objects_binders_binder_id_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_post(Ctx, BinderId) ->
    objects_binders_binder_id_post(Ctx, BinderId, #{}).

-spec objects_binders_binder_id_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_post(Ctx, BinderId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/binders/", BinderId, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update Binder
%% 
-spec objects_binders_binder_id_put(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_put(Ctx, BinderId) ->
    objects_binders_binder_id_put(Ctx, BinderId, #{}).

-spec objects_binders_binder_id_put(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_put(Ctx, BinderId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/objects/binders/", BinderId, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Remove Users & Groups from Roles on a Single Binder
%% 
-spec objects_binders_binder_id_roles_role_name_and_user_or_group_id_delete(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_roles_role_name_and_user_or_group_id_delete(Ctx, BinderId, RoleNameAndUserOrGroup, Id) ->
    objects_binders_binder_id_roles_role_name_and_user_or_group_id_delete(Ctx, BinderId, RoleNameAndUserOrGroup, Id, #{}).

-spec objects_binders_binder_id_roles_role_name_and_user_or_group_id_delete(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_roles_role_name_and_user_or_group_id_delete(Ctx, BinderId, RoleNameAndUserOrGroup, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/objects/binders/", BinderId, "/roles/", RoleNameAndUserOrGroup, "/", Id, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update Binder Section Binding Rule
%% 
-spec objects_binders_binder_id_sections_node_id_binding_rule_put(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_sections_node_id_binding_rule_put(Ctx, BinderId, NodeId) ->
    objects_binders_binder_id_sections_node_id_binding_rule_put(Ctx, BinderId, NodeId, #{}).

-spec objects_binders_binder_id_sections_node_id_binding_rule_put(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_sections_node_id_binding_rule_put(Ctx, BinderId, NodeId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/objects/binders/", BinderId, "/sections/", NodeId, "/binding_rule"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Content-Type', 'Accept', 'Authorization', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update Binder Section
%% 
-spec objects_binders_binder_id_sections_node_id_put(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_sections_node_id_put(Ctx, BinderId, NodeId) ->
    objects_binders_binder_id_sections_node_id_put(Ctx, BinderId, NodeId, #{}).

-spec objects_binders_binder_id_sections_node_id_put(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_sections_node_id_put(Ctx, BinderId, NodeId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/objects/binders/", BinderId, "/sections/", NodeId, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create Binder Section
%% 
-spec objects_binders_binder_id_sections_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_sections_post(Ctx, BinderId) ->
    objects_binders_binder_id_sections_post(Ctx, BinderId, #{}).

-spec objects_binders_binder_id_sections_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_sections_post(Ctx, BinderId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/binders/", BinderId, "/sections"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete Binder Section
%% 
-spec objects_binders_binder_id_sections_section_id_delete(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_sections_section_id_delete(Ctx, BinderId, SectionId) ->
    objects_binders_binder_id_sections_section_id_delete(Ctx, BinderId, SectionId, #{}).

-spec objects_binders_binder_id_sections_section_id_delete(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_sections_section_id_delete(Ctx, BinderId, SectionId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/objects/binders/", BinderId, "/sections/", SectionId, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Binder Sections
%% 
-spec objects_binders_binder_id_sections_section_id_get(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_sections_section_id_get(Ctx, BinderId, SectionId) ->
    objects_binders_binder_id_sections_section_id_get(Ctx, BinderId, SectionId, #{}).

-spec objects_binders_binder_id_sections_section_id_get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_sections_section_id_get(Ctx, BinderId, SectionId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/binders/", BinderId, "/sections/", SectionId, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve All Binder Versions
%% 
-spec objects_binders_binder_id_versions_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_versions_get(Ctx, BinderId) ->
    objects_binders_binder_id_versions_get(Ctx, BinderId, #{}).

-spec objects_binders_binder_id_versions_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_versions_get(Ctx, BinderId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/binders/", BinderId, "/versions"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Export Binder (Specific Version)
%% 
-spec objects_binders_binder_id_versions_major_version_minor_version_actions_export_post(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_versions_major_version_minor_version_actions_export_post(Ctx, BinderId, MajorVersion, MinorVersion) ->
    objects_binders_binder_id_versions_major_version_minor_version_actions_export_post(Ctx, BinderId, MajorVersion, MinorVersion, #{}).

-spec objects_binders_binder_id_versions_major_version_minor_version_actions_export_post(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_versions_major_version_minor_version_actions_export_post(Ctx, BinderId, MajorVersion, MinorVersion, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/binders/", BinderId, "/versions/", MajorVersion, "/", MinorVersion, "/actions/export"],
    QS = lists:flatten([])++openapi_utils:optional_params(['source', 'renditiontype', 'docversion', 'attachments', 'export', 'docfield'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete Binder Version
%% 
-spec objects_binders_binder_id_versions_major_version_minor_version_delete(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_versions_major_version_minor_version_delete(Ctx, BinderId, MajorVersion, MinorVersion) ->
    objects_binders_binder_id_versions_major_version_minor_version_delete(Ctx, BinderId, MajorVersion, MinorVersion, #{}).

-spec objects_binders_binder_id_versions_major_version_minor_version_delete(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_versions_major_version_minor_version_delete(Ctx, BinderId, MajorVersion, MinorVersion, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/objects/binders/", BinderId, "/versions/", MajorVersion, "/", MinorVersion, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Binder Version
%% 
-spec objects_binders_binder_id_versions_major_version_minor_version_get(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_versions_major_version_minor_version_get(Ctx, BinderId, MajorVersion, MinorVersion) ->
    objects_binders_binder_id_versions_major_version_minor_version_get(Ctx, BinderId, MajorVersion, MinorVersion, #{}).

-spec objects_binders_binder_id_versions_major_version_minor_version_get(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_versions_major_version_minor_version_get(Ctx, BinderId, MajorVersion, MinorVersion, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/binders/", BinderId, "/versions/", MajorVersion, "/", MinorVersion, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update Binder Version
%% 
-spec objects_binders_binder_id_versions_major_version_minor_version_put(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_versions_major_version_minor_version_put(Ctx, BinderId, MajorVersion, MinorVersion) ->
    objects_binders_binder_id_versions_major_version_minor_version_put(Ctx, BinderId, MajorVersion, MinorVersion, #{}).

-spec objects_binders_binder_id_versions_major_version_minor_version_put(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_versions_major_version_minor_version_put(Ctx, BinderId, MajorVersion, MinorVersion, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/objects/binders/", BinderId, "/versions/", MajorVersion, "/", MinorVersion, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create Binder Relationship
%% 
-spec objects_binders_binder_id_versions_major_version_minor_version_relationships_post(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_versions_major_version_minor_version_relationships_post(Ctx, BinderId, MajorVersion, MinorVersion) ->
    objects_binders_binder_id_versions_major_version_minor_version_relationships_post(Ctx, BinderId, MajorVersion, MinorVersion, #{}).

-spec objects_binders_binder_id_versions_major_version_minor_version_relationships_post(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_versions_major_version_minor_version_relationships_post(Ctx, BinderId, MajorVersion, MinorVersion, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/binders/", BinderId, "/versions/", MajorVersion, "/", MinorVersion, "/relationships"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete Binder Relationship
%% 
-spec objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_delete(ctx:ctx(), binary(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_delete(Ctx, BinderId, MajorVersion, MinorVersion, RelationshipId) ->
    objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_delete(Ctx, BinderId, MajorVersion, MinorVersion, RelationshipId, #{}).

-spec objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_delete(ctx:ctx(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_delete(Ctx, BinderId, MajorVersion, MinorVersion, RelationshipId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/objects/binders/", BinderId, "/versions/", MajorVersion, "/", MinorVersion, "/relationships/", RelationshipId, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Binder Relationship
%% 
-spec objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_get(ctx:ctx(), binary(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_get(Ctx, BinderId, MajorVersion, MinorVersion, RelationshipId) ->
    objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_get(Ctx, BinderId, MajorVersion, MinorVersion, RelationshipId, #{}).

-spec objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_get(ctx:ctx(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_get(Ctx, BinderId, MajorVersion, MinorVersion, RelationshipId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/binders/", BinderId, "/versions/", MajorVersion, "/", MinorVersion, "/relationships/", RelationshipId, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Binder Version Section
%% 
-spec objects_binders_binder_id_versions_major_version_minor_version_sections_section_id_get(ctx:ctx(), binary(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_versions_major_version_minor_version_sections_section_id_get(Ctx, BinderId, MajorVersion, MinorVersion, SectionId) ->
    objects_binders_binder_id_versions_major_version_minor_version_sections_section_id_get(Ctx, BinderId, MajorVersion, MinorVersion, SectionId, #{}).

-spec objects_binders_binder_id_versions_major_version_minor_version_sections_section_id_get(ctx:ctx(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_binder_id_versions_major_version_minor_version_sections_section_id_get(Ctx, BinderId, MajorVersion, MinorVersion, SectionId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/binders/", BinderId, "/versions/", MajorVersion, "/", MinorVersion, "/sections/", SectionId, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve All Binder Roles
%% 
-spec objects_binders_id_roles_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_id_roles_get(Ctx, Id) ->
    objects_binders_id_roles_get(Ctx, Id, #{}).

-spec objects_binders_id_roles_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_id_roles_get(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/binders/", Id, "/roles"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Assign Users & Groups to Roles on a Single Binder
%% 
-spec objects_binders_id_roles_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_id_roles_post(Ctx, Id) ->
    objects_binders_id_roles_post(Ctx, Id, #{}).

-spec objects_binders_id_roles_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_id_roles_post(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/binders/", Id, "/roles"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Document Role
%% 
-spec objects_binders_id_roles_role_name_get(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_id_roles_role_name_get(Ctx, Id, RoleName) ->
    objects_binders_id_roles_role_name_get(Ctx, Id, RoleName, #{}).

-spec objects_binders_id_roles_role_name_get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_id_roles_role_name_get(Ctx, Id, RoleName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/binders/", Id, "/roles/", RoleName, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Binder User Actions
%% 
-spec objects_binders_id_versions_major_version_minor_version_lifecycle_actions_get(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_id_versions_major_version_minor_version_lifecycle_actions_get(Ctx, Id, MajorVersion, MinorVersion) ->
    objects_binders_id_versions_major_version_minor_version_lifecycle_actions_get(Ctx, Id, MajorVersion, MinorVersion, #{}).

-spec objects_binders_id_versions_major_version_minor_version_lifecycle_actions_get(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_id_versions_major_version_minor_version_lifecycle_actions_get(Ctx, Id, MajorVersion, MinorVersion, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/binders/", Id, "/versions/", MajorVersion, "/", MinorVersion, "/lifecycle_actions"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Binder Entry Criteria
%% 
-spec objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get(ctx:ctx(), binary(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get(Ctx, Id, MajorVersion, MinorVersion, NameV) ->
    objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get(Ctx, Id, MajorVersion, MinorVersion, NameV, #{}).

-spec objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get(ctx:ctx(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get(Ctx, Id, MajorVersion, MinorVersion, NameV, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/binders/", Id, "/versions/", MajorVersion, "/", MinorVersion, "/lifecycle_actions/", NameV, "/entry_requirements"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Initiate Binder User Action
%% 
-spec objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_put(ctx:ctx(), binary(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_put(Ctx, Id, MajorVersion, MinorVersion, NameV) ->
    objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_put(Ctx, Id, MajorVersion, MinorVersion, NameV, #{}).

-spec objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_put(ctx:ctx(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_put(Ctx, Id, MajorVersion, MinorVersion, NameV, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/objects/binders/", Id, "/versions/", MajorVersion, "/", MinorVersion, "/lifecycle_actions/", NameV, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve User Actions on Multiple Binders
%% 
-spec objects_binders_lifecycle_actions_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_lifecycle_actions_post(Ctx) ->
    objects_binders_lifecycle_actions_post(Ctx, #{}).

-spec objects_binders_lifecycle_actions_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_lifecycle_actions_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/binders/lifecycle_actions"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Initiate Bulk Binder User Actions
%% 
-spec objects_binders_lifecycle_actions_user_action_name_put(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_lifecycle_actions_user_action_name_put(Ctx, UserActionName) ->
    objects_binders_lifecycle_actions_user_action_name_put(Ctx, UserActionName, #{}).

-spec objects_binders_lifecycle_actions_user_action_name_put(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_lifecycle_actions_user_action_name_put(Ctx, UserActionName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/objects/binders/lifecycle_actions/", UserActionName, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create Binder
%% 
-spec objects_binders_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_post(Ctx) ->
    objects_binders_post(Ctx, #{}).

-spec objects_binders_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/binders"],
    QS = lists:flatten([])++openapi_utils:optional_params(['async'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Binder Template Collection
%% 
-spec objects_binders_templates_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_templates_get(Ctx) ->
    objects_binders_templates_get(Ctx, #{}).

-spec objects_binders_templates_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_templates_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/binders/templates"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create Binder Template
%% 
-spec objects_binders_templates_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_templates_post(Ctx) ->
    objects_binders_templates_post(Ctx, #{}).

-spec objects_binders_templates_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_templates_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/binders/templates"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update Binder Template
%% 
-spec objects_binders_templates_put(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_templates_put(Ctx) ->
    objects_binders_templates_put(Ctx, #{}).

-spec objects_binders_templates_put(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_templates_put(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/objects/binders/templates"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Binder Template Node Attributes
%% 
-spec objects_binders_templates_template_name_bindernodes_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_templates_template_name_bindernodes_get(Ctx, TemplateName) ->
    objects_binders_templates_template_name_bindernodes_get(Ctx, TemplateName, #{}).

-spec objects_binders_templates_template_name_bindernodes_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_templates_template_name_bindernodes_get(Ctx, TemplateName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/binders/templates/", TemplateName, "/bindernodes"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create Binder Template Node
%% 
-spec objects_binders_templates_template_name_bindernodes_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_templates_template_name_bindernodes_post(Ctx, TemplateName) ->
    objects_binders_templates_template_name_bindernodes_post(Ctx, TemplateName, #{}).

-spec objects_binders_templates_template_name_bindernodes_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_templates_template_name_bindernodes_post(Ctx, TemplateName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/binders/templates/", TemplateName, "/bindernodes"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Replace Binder Template Nodes
%% 
-spec objects_binders_templates_template_name_bindernodes_put(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_templates_template_name_bindernodes_put(Ctx, TemplateName) ->
    objects_binders_templates_template_name_bindernodes_put(Ctx, TemplateName, #{}).

-spec objects_binders_templates_template_name_bindernodes_put(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_templates_template_name_bindernodes_put(Ctx, TemplateName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/objects/binders/templates/", TemplateName, "/bindernodes"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete Binder Template
%% 
-spec objects_binders_templates_template_name_delete(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_templates_template_name_delete(Ctx, TemplateName) ->
    objects_binders_templates_template_name_delete(Ctx, TemplateName, #{}).

-spec objects_binders_templates_template_name_delete(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_templates_template_name_delete(Ctx, TemplateName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/objects/binders/templates/", TemplateName, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Binder Template Attributes
%% 
-spec objects_binders_templates_template_name_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_templates_template_name_get(Ctx, TemplateName) ->
    objects_binders_templates_template_name_get(Ctx, TemplateName, #{}).

-spec objects_binders_templates_template_name_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_binders_templates_template_name_get(Ctx, TemplateName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/binders/templates/", TemplateName, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Deleted Document IDs
%% 
-spec objects_deletions_documents_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_deletions_documents_get(Ctx) ->
    objects_deletions_documents_get(Ctx, #{}).

-spec objects_deletions_documents_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_deletions_documents_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/deletions/documents"],
    QS = lists:flatten([])++openapi_utils:optional_params(['start_date', 'end_date'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Deleted Object Record ID
%% 
-spec objects_deletions_vobjects_object_name_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_deletions_vobjects_object_name_get(Ctx, ObjectName) ->
    objects_deletions_vobjects_object_name_get(Ctx, ObjectName, #{}).

-spec objects_deletions_vobjects_object_name_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_deletions_vobjects_object_name_get(Ctx, ObjectName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/deletions/vobjects/", ObjectName, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve All Document Workflows
%% 
-spec objects_documents_actions_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_actions_get(Ctx) ->
    objects_documents_actions_get(Ctx, #{}).

-spec objects_documents_actions_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_actions_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/actions"],
    QS = lists:flatten([])++openapi_utils:optional_params(['loc'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Download Controlled Copy Job Results
%% 
-spec objects_documents_actions_lifecycle_and_state_and_action_job_id_results_get(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_actions_lifecycle_and_state_and_action_job_id_results_get(Ctx, LifecycleAndStateAndAction, JobId) ->
    objects_documents_actions_lifecycle_and_state_and_action_job_id_results_get(Ctx, LifecycleAndStateAndAction, JobId, #{}).

-spec objects_documents_actions_lifecycle_and_state_and_action_job_id_results_get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_actions_lifecycle_and_state_and_action_job_id_results_get(Ctx, LifecycleAndStateAndAction, JobId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/actions/", LifecycleAndStateAndAction, "/", JobId, "/results"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Document Workflow Details
%% 
-spec objects_documents_actions_workflow_name_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_actions_workflow_name_get(Ctx, WorkflowName) ->
    objects_documents_actions_workflow_name_get(Ctx, WorkflowName, #{}).

-spec objects_documents_actions_workflow_name_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_actions_workflow_name_get(Ctx, WorkflowName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/actions/", WorkflowName, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['loc'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Initiate Document Workflow
%% 
-spec objects_documents_actions_workflow_name_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_actions_workflow_name_post(Ctx, WorkflowName) ->
    objects_documents_actions_workflow_name_post(Ctx, WorkflowName, #{}).

-spec objects_documents_actions_workflow_name_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_actions_workflow_name_post(Ctx, WorkflowName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/documents/actions/", WorkflowName, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete Annotations
%% 
-spec objects_documents_annotations_batch_delete(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_annotations_batch_delete(Ctx) ->
    objects_documents_annotations_batch_delete(Ctx, #{}).

-spec objects_documents_annotations_batch_delete(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_annotations_batch_delete(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/objects/documents/annotations/batch"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create Multiple Annotations
%% 
-spec objects_documents_annotations_batch_post(ctx:ctx(), binary(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_annotations_batch_post(Ctx, Authorization, ContentType, Accept, XVaultAPIClientID) ->
    objects_documents_annotations_batch_post(Ctx, Authorization, ContentType, Accept, XVaultAPIClientID, #{}).

-spec objects_documents_annotations_batch_post(ctx:ctx(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_annotations_batch_post(Ctx, Authorization, ContentType, Accept, XVaultAPIClientID, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/documents/annotations/batch"],
    QS = [],
    Headers = [  {<<"Authorization">>, Authorization}  {<<"Content-Type">>, ContentType}  {<<"Accept">>, Accept}  {<<"X-VaultAPI-ClientID">>, XVaultAPIClientID}]++openapi_utils:optional_params([], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update Annotations
%% 
-spec objects_documents_annotations_batch_put(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_annotations_batch_put(Ctx) ->
    objects_documents_annotations_batch_put(Ctx, #{}).

-spec objects_documents_annotations_batch_put(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_annotations_batch_put(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/objects/documents/annotations/batch"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Add Annotation Replies
%% 
-spec objects_documents_annotations_replies_batch_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_annotations_replies_batch_post(Ctx) ->
    objects_documents_annotations_replies_batch_post(Ctx, #{}).

-spec objects_documents_annotations_replies_batch_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_annotations_replies_batch_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/documents/annotations/replies/batch"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete Multiple Document Attachments
%% 
-spec objects_documents_attachments_batch_delete(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_attachments_batch_delete(Ctx) ->
    objects_documents_attachments_batch_delete(Ctx, #{}).

-spec objects_documents_attachments_batch_delete(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_attachments_batch_delete(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/objects/documents/attachments/batch"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Accept', 'Authorization', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create Multiple Document Attachments
%% 
-spec objects_documents_attachments_batch_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_attachments_batch_post(Ctx) ->
    objects_documents_attachments_batch_post(Ctx, #{}).

-spec objects_documents_attachments_batch_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_attachments_batch_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/documents/attachments/batch"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Accept', 'Authorization', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update Multiple Document Attachment Descriptions
%% 
-spec objects_documents_attachments_batch_put(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_attachments_batch_put(Ctx) ->
    objects_documents_attachments_batch_put(Ctx, #{}).

-spec objects_documents_attachments_batch_put(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_attachments_batch_put(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/objects/documents/attachments/batch"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Accept', 'Authorization', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Document Export Results
%% 
-spec objects_documents_batch_actions_fileextract_job_id_results_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_batch_actions_fileextract_job_id_results_get(Ctx, JobId) ->
    objects_documents_batch_actions_fileextract_job_id_results_get(Ctx, JobId, #{}).

-spec objects_documents_batch_actions_fileextract_job_id_results_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_batch_actions_fileextract_job_id_results_get(Ctx, JobId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/batch/actions/fileextract/", JobId, "/results"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Export Documents
%% 
-spec objects_documents_batch_actions_fileextract_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_batch_actions_fileextract_post(Ctx) ->
    objects_documents_batch_actions_fileextract_post(Ctx, #{}).

-spec objects_documents_batch_actions_fileextract_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_batch_actions_fileextract_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/documents/batch/actions/fileextract"],
    QS = lists:flatten([])++openapi_utils:optional_params(['source', 'renditions', 'allversions'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Reclassify Multiple Documents
%% 
-spec objects_documents_batch_actions_reclassify_put(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_batch_actions_reclassify_put(Ctx) ->
    objects_documents_batch_actions_reclassify_put(Ctx, #{}).

-spec objects_documents_batch_actions_reclassify_put(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_batch_actions_reclassify_put(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/objects/documents/batch/actions/reclassify"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-MigrationMode', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update Multiple Document Renditions
%% 
-spec objects_documents_batch_actions_rerender_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_batch_actions_rerender_post(Ctx) ->
    objects_documents_batch_actions_rerender_post(Ctx, #{}).

-spec objects_documents_batch_actions_rerender_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_batch_actions_rerender_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/documents/batch/actions/rerender"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete Multiple Documents
%% 
-spec objects_documents_batch_delete(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_batch_delete(Ctx) ->
    objects_documents_batch_delete(Ctx, #{}).

-spec objects_documents_batch_delete(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_batch_delete(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/objects/documents/batch"],
    QS = lists:flatten([])++openapi_utils:optional_params(['idParam'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Undo Collaborative Authoring Checkout
%% 
-spec objects_documents_batch_lock_delete(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_batch_lock_delete(Ctx) ->
    objects_documents_batch_lock_delete(Ctx, #{}).

-spec objects_documents_batch_lock_delete(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_batch_lock_delete(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/objects/documents/batch/lock"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create Multiple Documents
%% 
-spec objects_documents_batch_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_batch_post(Ctx) ->
    objects_documents_batch_post(Ctx, #{}).

-spec objects_documents_batch_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_batch_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/documents/batch"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-MigrationMode', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update Multiple Documents
%% 
-spec objects_documents_batch_put(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_batch_put(Ctx) ->
    objects_documents_batch_put(Ctx, #{}).

-spec objects_documents_batch_put(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_batch_put(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/objects/documents/batch"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-MigrationMode', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Anchor IDs
%% 
-spec objects_documents_doc_id_anchors_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_anchors_get(Ctx, DocId) ->
    objects_documents_doc_id_anchors_get(Ctx, DocId, #{}).

-spec objects_documents_doc_id_anchors_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_anchors_get(Ctx, DocId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/anchors"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Export Document Annotations to PDF
%% 
-spec objects_documents_doc_id_annotations_file_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_annotations_file_get(Ctx, DocId) ->
    objects_documents_doc_id_annotations_file_get(Ctx, DocId, #{}).

-spec objects_documents_doc_id_annotations_file_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_annotations_file_get(Ctx, DocId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/annotations/file"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Import Document Annotations from PDF
%% 
-spec objects_documents_doc_id_annotations_file_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_annotations_file_post(Ctx, DocId) ->
    objects_documents_doc_id_annotations_file_post(Ctx, DocId, #{}).

-spec objects_documents_doc_id_annotations_file_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_annotations_file_post(Ctx, DocId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/annotations/file"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete Single Document Attachment
%% 
-spec objects_documents_doc_id_attachments_attachment_id_delete(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_attachments_attachment_id_delete(Ctx, DocId, AttachmentId) ->
    objects_documents_doc_id_attachments_attachment_id_delete(Ctx, DocId, AttachmentId, #{}).

-spec objects_documents_doc_id_attachments_attachment_id_delete(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_attachments_attachment_id_delete(Ctx, DocId, AttachmentId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/attachments/", AttachmentId, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Accept', 'Authorization', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Download Document Attachment
%% 
-spec objects_documents_doc_id_attachments_attachment_id_file_get(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_attachments_attachment_id_file_get(Ctx, DocId, AttachmentId) ->
    objects_documents_doc_id_attachments_attachment_id_file_get(Ctx, DocId, AttachmentId, #{}).

-spec objects_documents_doc_id_attachments_attachment_id_file_get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_attachments_attachment_id_file_get(Ctx, DocId, AttachmentId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/attachments/", AttachmentId, "/file"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Accept', 'Authorization', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Document Attachment Metadata
%% 
-spec objects_documents_doc_id_attachments_attachment_id_get(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_attachments_attachment_id_get(Ctx, DocId, AttachmentId) ->
    objects_documents_doc_id_attachments_attachment_id_get(Ctx, DocId, AttachmentId, #{}).

-spec objects_documents_doc_id_attachments_attachment_id_get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_attachments_attachment_id_get(Ctx, DocId, AttachmentId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/attachments/", AttachmentId, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Accept', 'Authorization', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update Document Attachment Description
%% 
-spec objects_documents_doc_id_attachments_attachment_id_put(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_attachments_attachment_id_put(Ctx, DocId, AttachmentId) ->
    objects_documents_doc_id_attachments_attachment_id_put(Ctx, DocId, AttachmentId, #{}).

-spec objects_documents_doc_id_attachments_attachment_id_put(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_attachments_attachment_id_put(Ctx, DocId, AttachmentId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/attachments/", AttachmentId, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Accept', 'Authorization', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete Single Document Attachment Version
%% 
-spec objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_delete(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_delete(Ctx, DocId, AttachmentId, AttachmentVersion) ->
    objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_delete(Ctx, DocId, AttachmentId, AttachmentVersion, #{}).

-spec objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_delete(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_delete(Ctx, DocId, AttachmentId, AttachmentVersion, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/attachments/", AttachmentId, "/versions/", AttachmentVersion, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Accept', 'Authorization', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Download Document Attachment Version
%% 
-spec objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_file_get(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_file_get(Ctx, DocId, AttachmentId, AttachmentVersion) ->
    objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_file_get(Ctx, DocId, AttachmentId, AttachmentVersion, #{}).

-spec objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_file_get(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_file_get(Ctx, DocId, AttachmentId, AttachmentVersion, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/attachments/", AttachmentId, "/versions/", AttachmentVersion, "/file"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Accept', 'Authorization', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Document Attachment Version Metadata
%% 
-spec objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_get(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_get(Ctx, DocId, AttachmentId, AttachmentVersion) ->
    objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_get(Ctx, DocId, AttachmentId, AttachmentVersion, #{}).

-spec objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_get(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_get(Ctx, DocId, AttachmentId, AttachmentVersion, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/attachments/", AttachmentId, "/versions/", AttachmentVersion, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Accept', 'Authorization', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Restore Document Attachment Version
%% 
-spec objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_post(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_post(Ctx, DocId, AttachmentId, AttachmentVersion) ->
    objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_post(Ctx, DocId, AttachmentId, AttachmentVersion, #{}).

-spec objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_post(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_post(Ctx, DocId, AttachmentId, AttachmentVersion, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/attachments/", AttachmentId, "/versions/", AttachmentVersion, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['restore'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Accept', 'Authorization', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Document Attachment Versions
%% 
-spec objects_documents_doc_id_attachments_attachment_id_versions_get(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_attachments_attachment_id_versions_get(Ctx, DocId, AttachmentId) ->
    objects_documents_doc_id_attachments_attachment_id_versions_get(Ctx, DocId, AttachmentId, #{}).

-spec objects_documents_doc_id_attachments_attachment_id_versions_get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_attachments_attachment_id_versions_get(Ctx, DocId, AttachmentId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/attachments/", AttachmentId, "/versions"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Accept', 'Authorization', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Download All Document Attachments
%% 
-spec objects_documents_doc_id_attachments_file_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_attachments_file_get(Ctx, DocId) ->
    objects_documents_doc_id_attachments_file_get(Ctx, DocId, #{}).

-spec objects_documents_doc_id_attachments_file_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_attachments_file_get(Ctx, DocId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/attachments/file"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Accept', 'Authorization', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Document Attachments
%% 
-spec objects_documents_doc_id_attachments_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_attachments_get(Ctx, DocId) ->
    objects_documents_doc_id_attachments_get(Ctx, DocId, #{}).

-spec objects_documents_doc_id_attachments_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_attachments_get(Ctx, DocId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/attachments"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Accept', 'Authorization', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create Document Attachment
%% 
-spec objects_documents_doc_id_attachments_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_attachments_post(Ctx, DocId) ->
    objects_documents_doc_id_attachments_post(Ctx, DocId, #{}).

-spec objects_documents_doc_id_attachments_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_attachments_post(Ctx, DocId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/attachments"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Accept', 'Authorization', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Complete Audit History for a Single Document
%% 
-spec objects_documents_doc_id_audittrail_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_audittrail_get(Ctx, DocId) ->
    objects_documents_doc_id_audittrail_get(Ctx, DocId, #{}).

-spec objects_documents_doc_id_audittrail_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_audittrail_get(Ctx, DocId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/audittrail"],
    QS = lists:flatten([])++openapi_utils:optional_params(['start_date', 'end_date', 'format_result', 'limit', 'offset', 'events'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete Single Document
%% 
-spec objects_documents_doc_id_delete(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_delete(Ctx, DocId) ->
    objects_documents_doc_id_delete(Ctx, DocId, #{}).

-spec objects_documents_doc_id_delete(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_delete(Ctx, DocId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/objects/documents/", DocId, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Document Events
%% 
-spec objects_documents_doc_id_events_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_events_get(Ctx, DocId) ->
    objects_documents_doc_id_events_get(Ctx, DocId, #{}).

-spec objects_documents_doc_id_events_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_events_get(Ctx, DocId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/events"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Download Document File
%% 
-spec objects_documents_doc_id_file_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_file_get(Ctx, DocId) ->
    objects_documents_doc_id_file_get(Ctx, DocId, #{}).

-spec objects_documents_doc_id_file_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_file_get(Ctx, DocId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/file"],
    QS = lists:flatten([])++openapi_utils:optional_params(['lockDocument'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Accept', 'Authorization', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Document
%% 
-spec objects_documents_doc_id_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_get(Ctx, DocId) ->
    objects_documents_doc_id_get(Ctx, DocId, #{}).

-spec objects_documents_doc_id_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_get(Ctx, DocId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/", DocId, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete Document Lock
%% 
-spec objects_documents_doc_id_lock_delete(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_lock_delete(Ctx, DocId) ->
    objects_documents_doc_id_lock_delete(Ctx, DocId, #{}).

-spec objects_documents_doc_id_lock_delete(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_lock_delete(Ctx, DocId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/lock"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Document Lock
%% 
-spec objects_documents_doc_id_lock_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_lock_get(Ctx, DocId) ->
    objects_documents_doc_id_lock_get(Ctx, DocId, #{}).

-spec objects_documents_doc_id_lock_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_lock_get(Ctx, DocId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/lock"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create Document Lock
%% 
-spec objects_documents_doc_id_lock_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_lock_post(Ctx, DocId) ->
    objects_documents_doc_id_lock_post(Ctx, DocId, #{}).

-spec objects_documents_doc_id_lock_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_lock_post(Ctx, DocId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/lock"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Download All Document Version Attachments
%% 
-spec objects_documents_doc_id_major_version_minor_version_attachments_file_get(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_major_version_minor_version_attachments_file_get(Ctx, DocId, MajorVersion, MinorVersion) ->
    objects_documents_doc_id_major_version_minor_version_attachments_file_get(Ctx, DocId, MajorVersion, MinorVersion, #{}).

-spec objects_documents_doc_id_major_version_minor_version_attachments_file_get(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_major_version_minor_version_attachments_file_get(Ctx, DocId, MajorVersion, MinorVersion, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/", MajorVersion, "/", MinorVersion, "/attachments/file"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Accept', 'Authorization', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create Single Document Version
%% 
-spec objects_documents_doc_id_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_post(Ctx, DocId) ->
    objects_documents_doc_id_post(Ctx, DocId, #{}).

-spec objects_documents_doc_id_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_post(Ctx, DocId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/documents/", DocId, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['suppressRendition'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update Single Document
%% 
-spec objects_documents_doc_id_put(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_put(Ctx, DocId) ->
    objects_documents_doc_id_put(Ctx, DocId, #{}).

-spec objects_documents_doc_id_put(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_put(Ctx, DocId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/objects/documents/", DocId, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-MigrationMode', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Document Renditions
%% 
-spec objects_documents_doc_id_renditions_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_renditions_get(Ctx, DocId) ->
    objects_documents_doc_id_renditions_get(Ctx, DocId, #{}).

-spec objects_documents_doc_id_renditions_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_renditions_get(Ctx, DocId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/renditions"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete Single Document Rendition
%% 
-spec objects_documents_doc_id_renditions_rendition_type_delete(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_renditions_rendition_type_delete(Ctx, DocId, RenditionType) ->
    objects_documents_doc_id_renditions_rendition_type_delete(Ctx, DocId, RenditionType, #{}).

-spec objects_documents_doc_id_renditions_rendition_type_delete(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_renditions_rendition_type_delete(Ctx, DocId, RenditionType, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/renditions/", RenditionType, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Download Document Rendition File
%% 
-spec objects_documents_doc_id_renditions_rendition_type_get(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_renditions_rendition_type_get(Ctx, DocId, RenditionType) ->
    objects_documents_doc_id_renditions_rendition_type_get(Ctx, DocId, RenditionType, #{}).

-spec objects_documents_doc_id_renditions_rendition_type_get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_renditions_rendition_type_get(Ctx, DocId, RenditionType, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/renditions/", RenditionType, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['steadyState'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Add Single Document Rendition
%% 
-spec objects_documents_doc_id_renditions_rendition_type_post(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_renditions_rendition_type_post(Ctx, DocId, RenditionType) ->
    objects_documents_doc_id_renditions_rendition_type_post(Ctx, DocId, RenditionType, #{}).

-spec objects_documents_doc_id_renditions_rendition_type_post(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_renditions_rendition_type_post(Ctx, DocId, RenditionType, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/renditions/", RenditionType, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Replace Document Rendition
%% 
-spec objects_documents_doc_id_renditions_rendition_type_put(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_renditions_rendition_type_put(Ctx, DocId, RenditionType) ->
    objects_documents_doc_id_renditions_rendition_type_put(Ctx, DocId, RenditionType, #{}).

-spec objects_documents_doc_id_renditions_rendition_type_put(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_renditions_rendition_type_put(Ctx, DocId, RenditionType, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/renditions/", RenditionType, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Remove Users & Groups from Roles on a Single Document
%% 
-spec objects_documents_doc_id_roles_role_name_and_user_or_group_id_delete(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_roles_role_name_and_user_or_group_id_delete(Ctx, DocId, RoleNameAndUserOrGroup, Id) ->
    objects_documents_doc_id_roles_role_name_and_user_or_group_id_delete(Ctx, DocId, RoleNameAndUserOrGroup, Id, #{}).

-spec objects_documents_doc_id_roles_role_name_and_user_or_group_id_delete(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_roles_role_name_and_user_or_group_id_delete(Ctx, DocId, RoleNameAndUserOrGroup, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/roles/", RoleNameAndUserOrGroup, "/", Id, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Document Version Attachments
%% 
-spec objects_documents_doc_id_version_major_version_minor_version_attachments_get(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_version_major_version_minor_version_attachments_get(Ctx, DocId, MajorVersion, MinorVersion) ->
    objects_documents_doc_id_version_major_version_minor_version_attachments_get(Ctx, DocId, MajorVersion, MinorVersion, #{}).

-spec objects_documents_doc_id_version_major_version_minor_version_attachments_get(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_version_major_version_minor_version_attachments_get(Ctx, DocId, MajorVersion, MinorVersion, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/version/", MajorVersion, "/", MinorVersion, "/attachments"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Accept', 'Authorization', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Document Versions
%% 
-spec objects_documents_doc_id_versions_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_get(Ctx, DocId) ->
    objects_documents_doc_id_versions_get(Ctx, DocId, #{}).

-spec objects_documents_doc_id_versions_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_get(Ctx, DocId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/versions"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Read Annotations by ID
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_get(ctx:ctx(), binary(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_get(Ctx, DocId, MajorVersion, MinorVersion, AnnotationId) ->
    objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_get(Ctx, DocId, MajorVersion, MinorVersion, AnnotationId, #{}).

-spec objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_get(ctx:ctx(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_get(Ctx, DocId, MajorVersion, MinorVersion, AnnotationId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/annotations/", AnnotationId, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Read Replies of Parent Annotation
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_replies_get(ctx:ctx(), binary(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_replies_get(Ctx, DocId, MajorVersion, MinorVersion, AnnotationId) ->
    objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_replies_get(Ctx, DocId, MajorVersion, MinorVersion, AnnotationId, #{}).

-spec objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_replies_get(ctx:ctx(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_replies_get(Ctx, DocId, MajorVersion, MinorVersion, AnnotationId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/annotations/", AnnotationId, "/replies"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Export Document Version Annotations to PDF
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_annotations_file_get(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_annotations_file_get(Ctx, DocId, MajorVersion, MinorVersion) ->
    objects_documents_doc_id_versions_major_version_minor_version_annotations_file_get(Ctx, DocId, MajorVersion, MinorVersion, #{}).

-spec objects_documents_doc_id_versions_major_version_minor_version_annotations_file_get(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_annotations_file_get(Ctx, DocId, MajorVersion, MinorVersion, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/annotations/file"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Import Document Version Annotations from PDF
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_annotations_file_post(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_annotations_file_post(Ctx, DocId, MajorVersion, MinorVersion) ->
    objects_documents_doc_id_versions_major_version_minor_version_annotations_file_post(Ctx, DocId, MajorVersion, MinorVersion, #{}).

-spec objects_documents_doc_id_versions_major_version_minor_version_annotations_file_post(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_annotations_file_post(Ctx, DocId, MajorVersion, MinorVersion, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/annotations/file"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Read Annotations by Document Version and Type
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_annotations_get(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_annotations_get(Ctx, DocId, MajorVersion, MinorVersion) ->
    objects_documents_doc_id_versions_major_version_minor_version_annotations_get(Ctx, DocId, MajorVersion, MinorVersion, #{}).

-spec objects_documents_doc_id_versions_major_version_minor_version_annotations_get(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_annotations_get(Ctx, DocId, MajorVersion, MinorVersion, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/annotations"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'annotation_types', 'pagination_id'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Download Document Version Attachment Version
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_file_get(ctx:ctx(), binary(), binary(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_file_get(Ctx, DocId, MajorVersion, MinorVersion, AttachmentId, AttachmentVersion) ->
    objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_file_get(Ctx, DocId, MajorVersion, MinorVersion, AttachmentId, AttachmentVersion, #{}).

-spec objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_file_get(ctx:ctx(), binary(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_file_get(Ctx, DocId, MajorVersion, MinorVersion, AttachmentId, AttachmentVersion, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/attachments/", AttachmentId, "/versions/", AttachmentVersion, "/file"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Accept', 'Authorization', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Document Version Attachment Versions
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_get(ctx:ctx(), binary(), binary(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_get(Ctx, DocId, MajorVersion, MinorVersion, AttachmentId, AttachmentVersion) ->
    objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_get(Ctx, DocId, MajorVersion, MinorVersion, AttachmentId, AttachmentVersion, #{}).

-spec objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_get(ctx:ctx(), binary(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_get(Ctx, DocId, MajorVersion, MinorVersion, AttachmentId, AttachmentVersion, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/attachments/", AttachmentId, "/versions/", AttachmentVersion, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Accept', 'Authorization', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete Single Document Version
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_delete(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_delete(Ctx, DocId, MajorVersion, MinorVersion) ->
    objects_documents_doc_id_versions_major_version_minor_version_delete(Ctx, DocId, MajorVersion, MinorVersion, #{}).

-spec objects_documents_doc_id_versions_major_version_minor_version_delete(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_delete(Ctx, DocId, MajorVersion, MinorVersion, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Document Version Notes as CSV
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_doc_export_annotations_to_csv_get(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_doc_export_annotations_to_csv_get(Ctx, DocId, MajorVersion, MinorVersion) ->
    objects_documents_doc_id_versions_major_version_minor_version_doc_export_annotations_to_csv_get(Ctx, DocId, MajorVersion, MinorVersion, #{}).

-spec objects_documents_doc_id_versions_major_version_minor_version_doc_export_annotations_to_csv_get(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_doc_export_annotations_to_csv_get(Ctx, DocId, MajorVersion, MinorVersion, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/doc-export-annotations-to-csv"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create Document Event
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_events_post(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_events_post(Ctx, DocId, MajorVersion, MinorVersion) ->
    objects_documents_doc_id_versions_major_version_minor_version_events_post(Ctx, DocId, MajorVersion, MinorVersion, #{}).

-spec objects_documents_doc_id_versions_major_version_minor_version_events_post(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_events_post(Ctx, DocId, MajorVersion, MinorVersion, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/events"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Video Annotations
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_export_video_annotations_get(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_export_video_annotations_get(Ctx, DocId, MajorVersion, MinorVersion) ->
    objects_documents_doc_id_versions_major_version_minor_version_export_video_annotations_get(Ctx, DocId, MajorVersion, MinorVersion, #{}).

-spec objects_documents_doc_id_versions_major_version_minor_version_export_video_annotations_get(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_export_video_annotations_get(Ctx, DocId, MajorVersion, MinorVersion, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/export-video-annotations"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Download Document Version File
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_file_get(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_file_get(Ctx, DocId, MajorVersion, MinorVersion) ->
    objects_documents_doc_id_versions_major_version_minor_version_file_get(Ctx, DocId, MajorVersion, MinorVersion, #{}).

-spec objects_documents_doc_id_versions_major_version_minor_version_file_get(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_file_get(Ctx, DocId, MajorVersion, MinorVersion, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/file"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Accept', 'Authorization', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Document Version
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_get(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_get(Ctx, DocId, MajorVersion, MinorVersion) ->
    objects_documents_doc_id_versions_major_version_minor_version_get(Ctx, DocId, MajorVersion, MinorVersion, #{}).

-spec objects_documents_doc_id_versions_major_version_minor_version_get(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_get(Ctx, DocId, MajorVersion, MinorVersion, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update Document Version
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_put(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_put(Ctx, DocId, MajorVersion, MinorVersion) ->
    objects_documents_doc_id_versions_major_version_minor_version_put(Ctx, DocId, MajorVersion, MinorVersion, #{}).

-spec objects_documents_doc_id_versions_major_version_minor_version_put(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_put(Ctx, DocId, MajorVersion, MinorVersion, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-MigrationMode', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Document Relationships
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_relationships_get(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_relationships_get(Ctx, DocId, MajorVersion, MinorVersion) ->
    objects_documents_doc_id_versions_major_version_minor_version_relationships_get(Ctx, DocId, MajorVersion, MinorVersion, #{}).

-spec objects_documents_doc_id_versions_major_version_minor_version_relationships_get(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_relationships_get(Ctx, DocId, MajorVersion, MinorVersion, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/relationships"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create Single Document Relationship
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_relationships_post(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_relationships_post(Ctx, DocId, MajorVersion, MinorVersion) ->
    objects_documents_doc_id_versions_major_version_minor_version_relationships_post(Ctx, DocId, MajorVersion, MinorVersion, #{}).

-spec objects_documents_doc_id_versions_major_version_minor_version_relationships_post(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_relationships_post(Ctx, DocId, MajorVersion, MinorVersion, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/relationships"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete Single Document Relationship
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_delete(ctx:ctx(), binary(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_delete(Ctx, DocId, MajorVersion, MinorVersion, RelationshipId) ->
    objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_delete(Ctx, DocId, MajorVersion, MinorVersion, RelationshipId, #{}).

-spec objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_delete(ctx:ctx(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_delete(Ctx, DocId, MajorVersion, MinorVersion, RelationshipId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/relationships/", RelationshipId, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Document Relationship
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_get(ctx:ctx(), binary(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_get(Ctx, DocId, MajorVersion, MinorVersion, RelationshipId) ->
    objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_get(Ctx, DocId, MajorVersion, MinorVersion, RelationshipId, #{}).

-spec objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_get(ctx:ctx(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_get(Ctx, DocId, MajorVersion, MinorVersion, RelationshipId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/relationships/", RelationshipId, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Document Version Renditions
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_renditions_get(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_renditions_get(Ctx, DocId, MajorVersion, MinorVersion) ->
    objects_documents_doc_id_versions_major_version_minor_version_renditions_get(Ctx, DocId, MajorVersion, MinorVersion, #{}).

-spec objects_documents_doc_id_versions_major_version_minor_version_renditions_get(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_renditions_get(Ctx, DocId, MajorVersion, MinorVersion, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/renditions"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete Document Version Rendition
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_delete(ctx:ctx(), binary(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_delete(Ctx, DocId, MajorVersion, MinorVersion, RenditionType) ->
    objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_delete(Ctx, DocId, MajorVersion, MinorVersion, RenditionType, #{}).

-spec objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_delete(ctx:ctx(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_delete(Ctx, DocId, MajorVersion, MinorVersion, RenditionType, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/renditions/", RenditionType, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Download Document Version Rendition File
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_get(ctx:ctx(), binary(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_get(Ctx, DocId, MajorVersion, MinorVersion, RenditionType) ->
    objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_get(Ctx, DocId, MajorVersion, MinorVersion, RenditionType, #{}).

-spec objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_get(ctx:ctx(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_get(Ctx, DocId, MajorVersion, MinorVersion, RenditionType, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/renditions/", RenditionType, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Upload Document Version Rendition
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_post(ctx:ctx(), binary(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_post(Ctx, DocId, MajorVersion, MinorVersion, RenditionType) ->
    objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_post(Ctx, DocId, MajorVersion, MinorVersion, RenditionType, #{}).

-spec objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_post(ctx:ctx(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_post(Ctx, DocId, MajorVersion, MinorVersion, RenditionType, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/renditions/", RenditionType, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Replace Document Version Rendition
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_put(ctx:ctx(), binary(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_put(Ctx, DocId, MajorVersion, MinorVersion, RenditionType) ->
    objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_put(Ctx, DocId, MajorVersion, MinorVersion, RenditionType, #{}).

-spec objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_put(ctx:ctx(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_put(Ctx, DocId, MajorVersion, MinorVersion, RenditionType, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/renditions/", RenditionType, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Download Document Version Thumbnail File
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_thumbnail_get(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_thumbnail_get(Ctx, DocId, MajorVersion, MinorVersion) ->
    objects_documents_doc_id_versions_major_version_minor_version_thumbnail_get(Ctx, DocId, MajorVersion, MinorVersion, #{}).

-spec objects_documents_doc_id_versions_major_version_minor_version_thumbnail_get(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_doc_id_versions_major_version_minor_version_thumbnail_get(Ctx, DocId, MajorVersion, MinorVersion, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/thumbnail"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Accept', 'Authorization', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve All Documents
%% 
-spec objects_documents_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_get(Ctx) ->
    objects_documents_get(Ctx, #{}).

-spec objects_documents_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents"],
    QS = lists:flatten([])++openapi_utils:optional_params(['named_filter', 'scope', 'versionscope', 'search', 'limit', 'sort', 'start'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve All Document Roles
%% 
-spec objects_documents_id_roles_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_id_roles_get(Ctx, Id) ->
    objects_documents_id_roles_get(Ctx, Id, #{}).

-spec objects_documents_id_roles_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_id_roles_get(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/", Id, "/roles"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Assign Users & Groups to Roles on a Single Document
%% 
-spec objects_documents_id_roles_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_id_roles_post(Ctx, Id) ->
    objects_documents_id_roles_post(Ctx, Id, #{}).

-spec objects_documents_id_roles_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_id_roles_post(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/documents/", Id, "/roles"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Document Role
%% 
-spec objects_documents_id_roles_role_name_get(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_id_roles_role_name_get(Ctx, Id, RoleName) ->
    objects_documents_id_roles_role_name_get(Ctx, Id, RoleName, #{}).

-spec objects_documents_id_roles_role_name_get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_id_roles_role_name_get(Ctx, Id, RoleName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/", Id, "/roles/", RoleName, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Document User Actions
%% 
-spec objects_documents_id_versions_major_version_minor_version_lifecycle_actions_get(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_id_versions_major_version_minor_version_lifecycle_actions_get(Ctx, Id, MajorVersion, MinorVersion) ->
    objects_documents_id_versions_major_version_minor_version_lifecycle_actions_get(Ctx, Id, MajorVersion, MinorVersion, #{}).

-spec objects_documents_id_versions_major_version_minor_version_lifecycle_actions_get(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_id_versions_major_version_minor_version_lifecycle_actions_get(Ctx, Id, MajorVersion, MinorVersion, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/", Id, "/versions/", MajorVersion, "/", MinorVersion, "/lifecycle_actions"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Document Entry Criteria
%% 
-spec objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get(ctx:ctx(), binary(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get(Ctx, Id, MajorVersion, MinorVersion, NameV) ->
    objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get(Ctx, Id, MajorVersion, MinorVersion, NameV, #{}).

-spec objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get(ctx:ctx(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get(Ctx, Id, MajorVersion, MinorVersion, NameV, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/", Id, "/versions/", MajorVersion, "/", MinorVersion, "/lifecycle_actions/", NameV, "/entry_requirements"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Initiate Document User Action
%% 
-spec objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_put(ctx:ctx(), binary(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_put(Ctx, Id, MajorVersion, MinorVersion, NameV) ->
    objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_put(Ctx, Id, MajorVersion, MinorVersion, NameV, #{}).

-spec objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_put(ctx:ctx(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_put(Ctx, Id, MajorVersion, MinorVersion, NameV, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/objects/documents/", Id, "/versions/", MajorVersion, "/", MinorVersion, "/lifecycle_actions/", NameV, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve User Actions on Multiple Documents
%% 
-spec objects_documents_lifecycle_actions_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_lifecycle_actions_post(Ctx) ->
    objects_documents_lifecycle_actions_post(Ctx, #{}).

-spec objects_documents_lifecycle_actions_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_lifecycle_actions_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/documents/lifecycle_actions"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Initiate Bulk Document User Actions
%% 
-spec objects_documents_lifecycle_actions_user_action_name_put(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_lifecycle_actions_user_action_name_put(Ctx, UserActionName) ->
    objects_documents_lifecycle_actions_user_action_name_put(Ctx, UserActionName, #{}).

-spec objects_documents_lifecycle_actions_user_action_name_put(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_lifecycle_actions_user_action_name_put(Ctx, UserActionName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/objects/documents/lifecycle_actions/", UserActionName, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create Single Document
%% 
-spec objects_documents_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_post(Ctx) ->
    objects_documents_post(Ctx, #{}).

-spec objects_documents_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/documents"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-MigrationMode', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete Multiple Document Relationships
%% 
-spec objects_documents_relationships_batch_delete(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_relationships_batch_delete(Ctx) ->
    objects_documents_relationships_batch_delete(Ctx, #{}).

-spec objects_documents_relationships_batch_delete(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_relationships_batch_delete(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/objects/documents/relationships/batch"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create Multiple Document Relationships
%% 
-spec objects_documents_relationships_batch_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_relationships_batch_post(Ctx) ->
    objects_documents_relationships_batch_post(Ctx, #{}).

-spec objects_documents_relationships_batch_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_relationships_batch_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/documents/relationships/batch"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete Multiple Document Renditions
%% 
-spec objects_documents_renditions_batch_delete(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_renditions_batch_delete(Ctx) ->
    objects_documents_renditions_batch_delete(Ctx, #{}).

-spec objects_documents_renditions_batch_delete(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_renditions_batch_delete(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/objects/documents/renditions/batch"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Add Multiple Document Renditions
%% 
-spec objects_documents_renditions_batch_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_renditions_batch_post(Ctx) ->
    objects_documents_renditions_batch_post(Ctx, #{}).

-spec objects_documents_renditions_batch_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_renditions_batch_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/documents/renditions/batch"],
    QS = lists:flatten([])++openapi_utils:optional_params(['idParam', 'largeSizeAsset'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-MigrationMode', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Remove Users and Groups from Roles on Multiple Documents & Binders
%% 
-spec objects_documents_roles_batch_delete(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_roles_batch_delete(Ctx) ->
    objects_documents_roles_batch_delete(Ctx, #{}).

-spec objects_documents_roles_batch_delete(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_roles_batch_delete(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/objects/documents/roles/batch"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Assign Users & Groups to Roles on Multiple Documents & Binders
%% 
-spec objects_documents_roles_batch_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_roles_batch_post(Ctx) ->
    objects_documents_roles_batch_post(Ctx, #{}).

-spec objects_documents_roles_batch_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_roles_batch_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/documents/roles/batch"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Document Template Collection
%% 
-spec objects_documents_templates_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_templates_get(Ctx) ->
    objects_documents_templates_get(Ctx, #{}).

-spec objects_documents_templates_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_templates_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/templates"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create Single Document Template
%% 
-spec objects_documents_templates_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_templates_post(Ctx) ->
    objects_documents_templates_post(Ctx, #{}).

-spec objects_documents_templates_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_templates_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/documents/templates"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update Multiple Document Templates
%% 
-spec objects_documents_templates_put(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_templates_put(Ctx) ->
    objects_documents_templates_put(Ctx, #{}).

-spec objects_documents_templates_put(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_templates_put(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/objects/documents/templates"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete Basic Document Template
%% 
-spec objects_documents_templates_template_name_delete(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_templates_template_name_delete(Ctx, TemplateName) ->
    objects_documents_templates_template_name_delete(Ctx, TemplateName, #{}).

-spec objects_documents_templates_template_name_delete(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_templates_template_name_delete(Ctx, TemplateName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/objects/documents/templates/", TemplateName, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Download Document Template File
%% 
-spec objects_documents_templates_template_name_file_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_templates_template_name_file_get(Ctx, TemplateName) ->
    objects_documents_templates_template_name_file_get(Ctx, TemplateName, #{}).

-spec objects_documents_templates_template_name_file_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_templates_template_name_file_get(Ctx, TemplateName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/templates/", TemplateName, "/file"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Document Template Attributes
%% 
-spec objects_documents_templates_template_name_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_templates_template_name_get(Ctx, TemplateName) ->
    objects_documents_templates_template_name_get(Ctx, TemplateName, #{}).

-spec objects_documents_templates_template_name_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_templates_template_name_get(Ctx, TemplateName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/documents/templates/", TemplateName, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update Single Document Template
%% 
-spec objects_documents_templates_template_name_put(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_templates_template_name_put(Ctx, TemplateName) ->
    objects_documents_templates_template_name_put(Ctx, TemplateName, #{}).

-spec objects_documents_templates_template_name_put(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_templates_template_name_put(Ctx, TemplateName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/objects/documents/templates/", TemplateName, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Document Tokens
%% 
-spec objects_documents_tokens_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_tokens_post(Ctx) ->
    objects_documents_tokens_post(Ctx, #{}).

-spec objects_documents_tokens_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_tokens_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/documents/tokens"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Export Document Versions
%% 
-spec objects_documents_versions_batch_actions_fileextract_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_versions_batch_actions_fileextract_post(Ctx) ->
    objects_documents_versions_batch_actions_fileextract_post(Ctx, #{}).

-spec objects_documents_versions_batch_actions_fileextract_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_versions_batch_actions_fileextract_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/documents/versions/batch/actions/fileextract"],
    QS = lists:flatten([])++openapi_utils:optional_params(['source', 'renditions'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete Multiple Document Versions
%% 
-spec objects_documents_versions_batch_delete(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_versions_batch_delete(Ctx) ->
    objects_documents_versions_batch_delete(Ctx, #{}).

-spec objects_documents_versions_batch_delete(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_versions_batch_delete(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/objects/documents/versions/batch"],
    QS = lists:flatten([])++openapi_utils:optional_params(['idParam'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create Multiple Document Versions
%% 
-spec objects_documents_versions_batch_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_versions_batch_post(Ctx) ->
    objects_documents_versions_batch_post(Ctx, #{}).

-spec objects_documents_versions_batch_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_documents_versions_batch_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/documents/versions/batch"],
    QS = lists:flatten([])++openapi_utils:optional_params(['idParam'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-MigrationMode', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Domain Information
%% 
-spec objects_domain_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_domain_get(Ctx) ->
    objects_domain_get(Ctx, #{}).

-spec objects_domain_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_domain_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/domain"],
    QS = lists:flatten([])++openapi_utils:optional_params(['include_application'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Domains
%% 
-spec objects_domains_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_domains_get(Ctx) ->
    objects_domains_get(Ctx, #{}).

-spec objects_domains_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_domains_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/domains"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Add EDL Matched Documents
%% 
-spec objects_edl_matched_documents_batch_actions_add_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_edl_matched_documents_batch_actions_add_post(Ctx) ->
    objects_edl_matched_documents_batch_actions_add_post(Ctx, #{}).

-spec objects_edl_matched_documents_batch_actions_add_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_edl_matched_documents_batch_actions_add_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/edl_matched_documents/batch/actions/add"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Remove EDL Matched Documents
%% 
-spec objects_edl_matched_documents_batch_actions_remove_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_edl_matched_documents_batch_actions_remove_post(Ctx) ->
    objects_edl_matched_documents_batch_actions_remove_post(Ctx, #{}).

-spec objects_edl_matched_documents_batch_actions_remove_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_edl_matched_documents_batch_actions_remove_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/edl_matched_documents/batch/actions/remove"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Auto Managed Groups
%% 
-spec objects_groups_auto_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_groups_auto_get(Ctx) ->
    objects_groups_auto_get(Ctx, #{}).

-spec objects_groups_auto_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_groups_auto_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/groups/auto"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve All Groups
%% 
-spec objects_groups_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_groups_get(Ctx) ->
    objects_groups_get(Ctx, #{}).

-spec objects_groups_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_groups_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/groups"],
    QS = lists:flatten([])++openapi_utils:optional_params(['includeImplied'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete Group
%% 
-spec objects_groups_group_id_delete(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_groups_group_id_delete(Ctx, GroupId) ->
    objects_groups_group_id_delete(Ctx, GroupId, #{}).

-spec objects_groups_group_id_delete(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_groups_group_id_delete(Ctx, GroupId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/objects/groups/", GroupId, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Group
%% 
-spec objects_groups_group_id_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_groups_group_id_get(Ctx, GroupId) ->
    objects_groups_group_id_get(Ctx, GroupId, #{}).

-spec objects_groups_group_id_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_groups_group_id_get(Ctx, GroupId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/groups/", GroupId, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['includeImplied'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update Group
%% 
-spec objects_groups_group_id_put(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_groups_group_id_put(Ctx, GroupId) ->
    objects_groups_group_id_put(Ctx, GroupId, #{}).

-spec objects_groups_group_id_put(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_groups_group_id_put(Ctx, GroupId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/objects/groups/", GroupId, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create Group 
%% 
-spec objects_groups_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_groups_post(Ctx) ->
    objects_groups_post(Ctx, #{}).

-spec objects_groups_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_groups_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/groups"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Application License Usage
%% 
-spec objects_licenses_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_licenses_get(Ctx) ->
    objects_licenses_get(Ctx, #{}).

-spec objects_licenses_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_licenses_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/licenses"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve All Multi-Record Workflows
%% 
-spec objects_objectworkflows_actions_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_actions_get(Ctx) ->
    objects_objectworkflows_actions_get(Ctx, #{}).

-spec objects_objectworkflows_actions_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_actions_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/objectworkflows/actions"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Multi-Record Workflow Details
%% 
-spec objects_objectworkflows_actions_workflow_name_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_actions_workflow_name_get(Ctx, WorkflowName) ->
    objects_objectworkflows_actions_workflow_name_get(Ctx, WorkflowName, #{}).

-spec objects_objectworkflows_actions_workflow_name_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_actions_workflow_name_get(Ctx, WorkflowName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/objectworkflows/actions/", WorkflowName, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Initiate Multi-Record Workflow
%% 
-spec objects_objectworkflows_actions_workflow_name_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_actions_workflow_name_post(Ctx, WorkflowName) ->
    objects_objectworkflows_actions_workflow_name_post(Ctx, WorkflowName, #{}).

-spec objects_objectworkflows_actions_workflow_name_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_actions_workflow_name_post(Ctx, WorkflowName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/objectworkflows/actions/", WorkflowName, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Workflows
%% 
-spec objects_objectworkflows_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_get(Ctx) ->
    objects_objectworkflows_get(Ctx, #{}).

-spec objects_objectworkflows_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/objectworkflows"],
    QS = lists:flatten([])++openapi_utils:optional_params(['object__v', 'record_id__v', 'participant', 'status__v', 'offset', 'page_size', 'loc'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Workflow Tasks
%% 
-spec objects_objectworkflows_tasks_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_tasks_get(Ctx) ->
    objects_objectworkflows_tasks_get(Ctx, #{}).

-spec objects_objectworkflows_tasks_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_tasks_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/objectworkflows/tasks"],
    QS = lists:flatten([])++openapi_utils:optional_params(['object__v', 'record_id__v', 'assignee__v', 'status__v', 'offset', 'page_size', 'loc'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Accept Single Record Workflow Task
%% 
-spec objects_objectworkflows_tasks_task_id_actions_accept_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_tasks_task_id_actions_accept_post(Ctx, TaskId) ->
    objects_objectworkflows_tasks_task_id_actions_accept_post(Ctx, TaskId, #{}).

-spec objects_objectworkflows_tasks_task_id_actions_accept_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_tasks_task_id_actions_accept_post(Ctx, TaskId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/objectworkflows/tasks/", TaskId, "/actions/accept"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Cancel Workflow Task
%% 
-spec objects_objectworkflows_tasks_task_id_actions_cancel_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_tasks_task_id_actions_cancel_post(Ctx, TaskId) ->
    objects_objectworkflows_tasks_task_id_actions_cancel_post(Ctx, TaskId, #{}).

-spec objects_objectworkflows_tasks_task_id_actions_cancel_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_tasks_task_id_actions_cancel_post(Ctx, TaskId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/objectworkflows/tasks/", TaskId, "/actions/cancel"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Complete Single Record Workflow Task
%% 
-spec objects_objectworkflows_tasks_task_id_actions_complete_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_tasks_task_id_actions_complete_post(Ctx, TaskId) ->
    objects_objectworkflows_tasks_task_id_actions_complete_post(Ctx, TaskId, #{}).

-spec objects_objectworkflows_tasks_task_id_actions_complete_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_tasks_task_id_actions_complete_post(Ctx, TaskId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/objectworkflows/tasks/", TaskId, "/actions/complete"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Workflow Task Actions
%% 
-spec objects_objectworkflows_tasks_task_id_actions_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_tasks_task_id_actions_get(Ctx, TaskId) ->
    objects_objectworkflows_tasks_task_id_actions_get(Ctx, TaskId, #{}).

-spec objects_objectworkflows_tasks_task_id_actions_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_tasks_task_id_actions_get(Ctx, TaskId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/objectworkflows/tasks/", TaskId, "/actions"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Accept Multi-item Workflow Task
%% 
-spec objects_objectworkflows_tasks_task_id_actions_mdwaccept_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_tasks_task_id_actions_mdwaccept_post(Ctx, TaskId) ->
    objects_objectworkflows_tasks_task_id_actions_mdwaccept_post(Ctx, TaskId, #{}).

-spec objects_objectworkflows_tasks_task_id_actions_mdwaccept_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_tasks_task_id_actions_mdwaccept_post(Ctx, TaskId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/objectworkflows/tasks/", TaskId, "/actions/mdwaccept"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Complete Multi-item Workflow Task
%% 
-spec objects_objectworkflows_tasks_task_id_actions_mdwcomplete_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_tasks_task_id_actions_mdwcomplete_post(Ctx, TaskId) ->
    objects_objectworkflows_tasks_task_id_actions_mdwcomplete_post(Ctx, TaskId, #{}).

-spec objects_objectworkflows_tasks_task_id_actions_mdwcomplete_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_tasks_task_id_actions_mdwcomplete_post(Ctx, TaskId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/objectworkflows/tasks/", TaskId, "/actions/mdwcomplete"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Manage Multi-Item Workflow Content
%% 
-spec objects_objectworkflows_tasks_task_id_actions_mdwmanagecontent_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_tasks_task_id_actions_mdwmanagecontent_post(Ctx, TaskId) ->
    objects_objectworkflows_tasks_task_id_actions_mdwmanagecontent_post(Ctx, TaskId, #{}).

-spec objects_objectworkflows_tasks_task_id_actions_mdwmanagecontent_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_tasks_task_id_actions_mdwmanagecontent_post(Ctx, TaskId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/objectworkflows/tasks/", TaskId, "/actions/mdwmanagecontent"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Reassign Multi-item Workflow Task
%% 
-spec objects_objectworkflows_tasks_task_id_actions_mdwreassign_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_tasks_task_id_actions_mdwreassign_post(Ctx, TaskId) ->
    objects_objectworkflows_tasks_task_id_actions_mdwreassign_post(Ctx, TaskId, #{}).

-spec objects_objectworkflows_tasks_task_id_actions_mdwreassign_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_tasks_task_id_actions_mdwreassign_post(Ctx, TaskId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/objectworkflows/tasks/", TaskId, "/actions/mdwreassign"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Reassign Single Record Workflow Task
%% 
-spec objects_objectworkflows_tasks_task_id_actions_reassign_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_tasks_task_id_actions_reassign_post(Ctx, TaskId) ->
    objects_objectworkflows_tasks_task_id_actions_reassign_post(Ctx, TaskId, #{}).

-spec objects_objectworkflows_tasks_task_id_actions_reassign_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_tasks_task_id_actions_reassign_post(Ctx, TaskId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/objectworkflows/tasks/", TaskId, "/actions/reassign"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Workflow Task Action Details
%% 
-spec objects_objectworkflows_tasks_task_id_actions_task_action_get(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_tasks_task_id_actions_task_action_get(Ctx, TaskId, TaskAction) ->
    objects_objectworkflows_tasks_task_id_actions_task_action_get(Ctx, TaskId, TaskAction, #{}).

-spec objects_objectworkflows_tasks_task_id_actions_task_action_get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_tasks_task_id_actions_task_action_get(Ctx, TaskId, TaskAction, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/objectworkflows/tasks/", TaskId, "/actions/", TaskAction, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['loc'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Undo Workflow Task Acceptance
%% 
-spec objects_objectworkflows_tasks_task_id_actions_undoaccept_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_tasks_task_id_actions_undoaccept_post(Ctx, TaskId) ->
    objects_objectworkflows_tasks_task_id_actions_undoaccept_post(Ctx, TaskId, #{}).

-spec objects_objectworkflows_tasks_task_id_actions_undoaccept_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_tasks_task_id_actions_undoaccept_post(Ctx, TaskId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/objectworkflows/tasks/", TaskId, "/actions/undoaccept"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update Workflow Task Due Date
%% 
-spec objects_objectworkflows_tasks_task_id_actions_updateduedate_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_tasks_task_id_actions_updateduedate_post(Ctx, TaskId) ->
    objects_objectworkflows_tasks_task_id_actions_updateduedate_post(Ctx, TaskId, #{}).

-spec objects_objectworkflows_tasks_task_id_actions_updateduedate_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_tasks_task_id_actions_updateduedate_post(Ctx, TaskId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/objectworkflows/tasks/", TaskId, "/actions/updateduedate"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Workflow Task Details
%% 
-spec objects_objectworkflows_tasks_task_id_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_tasks_task_id_get(Ctx, TaskId) ->
    objects_objectworkflows_tasks_task_id_get(Ctx, TaskId, #{}).

-spec objects_objectworkflows_tasks_task_id_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_tasks_task_id_get(Ctx, TaskId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/objectworkflows/tasks/", TaskId, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['loc'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Workflow Actions
%% 
-spec objects_objectworkflows_workflow_id_actions_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_workflow_id_actions_get(Ctx, WorkflowId) ->
    objects_objectworkflows_workflow_id_actions_get(Ctx, WorkflowId, #{}).

-spec objects_objectworkflows_workflow_id_actions_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_workflow_id_actions_get(Ctx, WorkflowId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/objectworkflows/", WorkflowId, "/actions"],
    QS = lists:flatten([])++openapi_utils:optional_params(['loc'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Workflow Action Details
%% 
-spec objects_objectworkflows_workflow_id_actions_workflow_action_get(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_workflow_id_actions_workflow_action_get(Ctx, WorkflowId, WorkflowAction) ->
    objects_objectworkflows_workflow_id_actions_workflow_action_get(Ctx, WorkflowId, WorkflowAction, #{}).

-spec objects_objectworkflows_workflow_id_actions_workflow_action_get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_workflow_id_actions_workflow_action_get(Ctx, WorkflowId, WorkflowAction, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/objectworkflows/", WorkflowId, "/actions/", WorkflowAction, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Initiate Workflow Action
%% 
-spec objects_objectworkflows_workflow_id_actions_workflow_action_post(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_workflow_id_actions_workflow_action_post(Ctx, WorkflowId, WorkflowAction) ->
    objects_objectworkflows_workflow_id_actions_workflow_action_post(Ctx, WorkflowId, WorkflowAction, #{}).

-spec objects_objectworkflows_workflow_id_actions_workflow_action_post(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_workflow_id_actions_workflow_action_post(Ctx, WorkflowId, WorkflowAction, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/objectworkflows/", WorkflowId, "/actions/", WorkflowAction, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['documents__sys'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Workflow Details
%% 
-spec objects_objectworkflows_workflow_id_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_workflow_id_get(Ctx, WorkflowId) ->
    objects_objectworkflows_workflow_id_get(Ctx, WorkflowId, #{}).

-spec objects_objectworkflows_workflow_id_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_objectworkflows_workflow_id_get(Ctx, WorkflowId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/objectworkflows/", WorkflowId, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['loc'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve All Picklists
%% 
-spec objects_picklists_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_picklists_get(Ctx) ->
    objects_picklists_get(Ctx, #{}).

-spec objects_picklists_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_picklists_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/picklists"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Picklist Values
%% 
-spec objects_picklists_picklist_name_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_picklists_picklist_name_get(Ctx, PicklistName) ->
    objects_picklists_picklist_name_get(Ctx, PicklistName, #{}).

-spec objects_picklists_picklist_name_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_picklists_picklist_name_get(Ctx, PicklistName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/picklists/", PicklistName, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Inactivate Picklist Value
%% 
-spec objects_picklists_picklist_name_picklist_value_name_delete(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_picklists_picklist_name_picklist_value_name_delete(Ctx, PicklistName, PicklistValueName) ->
    objects_picklists_picklist_name_picklist_value_name_delete(Ctx, PicklistName, PicklistValueName, #{}).

-spec objects_picklists_picklist_name_picklist_value_name_delete(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_picklists_picklist_name_picklist_value_name_delete(Ctx, PicklistName, PicklistValueName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/objects/picklists/", PicklistName, "/", PicklistValueName, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update Picklist Value
%% 
-spec objects_picklists_picklist_name_picklist_value_name_put(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_picklists_picklist_name_picklist_value_name_put(Ctx, PicklistName, PicklistValueName) ->
    objects_picklists_picklist_name_picklist_value_name_put(Ctx, PicklistName, PicklistValueName, #{}).

-spec objects_picklists_picklist_name_picklist_value_name_put(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_picklists_picklist_name_picklist_value_name_put(Ctx, PicklistName, PicklistValueName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/objects/picklists/", PicklistName, "/", PicklistValueName, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create Picklist Values
%% 
-spec objects_picklists_picklist_name_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_picklists_picklist_name_post(Ctx, PicklistName) ->
    objects_picklists_picklist_name_post(Ctx, PicklistName, #{}).

-spec objects_picklists_picklist_name_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_picklists_picklist_name_post(Ctx, PicklistName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/picklists/", PicklistName, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update Picklist Value Label
%% 
-spec objects_picklists_picklist_name_put(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_picklists_picklist_name_put(Ctx, PicklistName) ->
    objects_picklists_picklist_name_put(Ctx, PicklistName, #{}).

-spec objects_picklists_picklist_name_put(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_picklists_picklist_name_put(Ctx, PicklistName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/objects/picklists/", PicklistName, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Build Production Vault
%% 
-spec objects_sandbox_actions_buildproduction_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_sandbox_actions_buildproduction_post(Ctx) ->
    objects_sandbox_actions_buildproduction_post(Ctx, #{}).

-spec objects_sandbox_actions_buildproduction_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_sandbox_actions_buildproduction_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/sandbox/actions/buildproduction"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Promote to Production
%% 
-spec objects_sandbox_actions_promoteproduction_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_sandbox_actions_promoteproduction_post(Ctx) ->
    objects_sandbox_actions_promoteproduction_post(Ctx, #{}).

-spec objects_sandbox_actions_promoteproduction_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_sandbox_actions_promoteproduction_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/sandbox/actions/promoteproduction"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Recheck Sandbox Usage Limit
%% 
-spec objects_sandbox_actions_recheckusage_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_sandbox_actions_recheckusage_post(Ctx) ->
    objects_sandbox_actions_recheckusage_post(Ctx, #{}).

-spec objects_sandbox_actions_recheckusage_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_sandbox_actions_recheckusage_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/sandbox/actions/recheckusage"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Change Sandbox Size
%% 
-spec objects_sandbox_batch_changesize_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_sandbox_batch_changesize_post(Ctx) ->
    objects_sandbox_batch_changesize_post(Ctx, #{}).

-spec objects_sandbox_batch_changesize_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_sandbox_batch_changesize_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/sandbox/batch/changesize"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Set Sandbox Entitlements
%% 
-spec objects_sandbox_entitlements_set_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_sandbox_entitlements_set_post(Ctx) ->
    objects_sandbox_entitlements_set_post(Ctx, #{}).

-spec objects_sandbox_entitlements_set_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_sandbox_entitlements_set_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/sandbox/entitlements/set"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Sandboxes
%% 
-spec objects_sandbox_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_sandbox_get(Ctx) ->
    objects_sandbox_get(Ctx, #{}).

-spec objects_sandbox_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_sandbox_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/sandbox"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete Sandbox
%% 
-spec objects_sandbox_name_delete(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_sandbox_name_delete(Ctx, Name) ->
    objects_sandbox_name_delete(Ctx, Name, #{}).

-spec objects_sandbox_name_delete(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_sandbox_name_delete(Ctx, Name, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/objects/sandbox/", Name, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create or Refresh Sandbox
%% 
-spec objects_sandbox_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_sandbox_post(Ctx) ->
    objects_sandbox_post(Ctx, #{}).

-spec objects_sandbox_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_sandbox_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/sandbox"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update Sandbox Snapshot
%% 
-spec objects_sandbox_snapshot_api_name_actions_update_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_sandbox_snapshot_api_name_actions_update_post(Ctx, ApiName) ->
    objects_sandbox_snapshot_api_name_actions_update_post(Ctx, ApiName, #{}).

-spec objects_sandbox_snapshot_api_name_actions_update_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_sandbox_snapshot_api_name_actions_update_post(Ctx, ApiName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/sandbox/snapshot/", ApiName, "/actions/update"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Upgrade Sandbox Snapshot
%% 
-spec objects_sandbox_snapshot_api_name_actions_upgrade_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_sandbox_snapshot_api_name_actions_upgrade_post(Ctx, ApiName) ->
    objects_sandbox_snapshot_api_name_actions_upgrade_post(Ctx, ApiName, #{}).

-spec objects_sandbox_snapshot_api_name_actions_upgrade_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_sandbox_snapshot_api_name_actions_upgrade_post(Ctx, ApiName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/sandbox/snapshot/", ApiName, "/actions/upgrade"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete Sandbox Snapshot
%% 
-spec objects_sandbox_snapshot_api_name_delete(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_sandbox_snapshot_api_name_delete(Ctx, ApiName) ->
    objects_sandbox_snapshot_api_name_delete(Ctx, ApiName, #{}).

-spec objects_sandbox_snapshot_api_name_delete(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_sandbox_snapshot_api_name_delete(Ctx, ApiName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/objects/sandbox/snapshot/", ApiName, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Sandbox Snapshots
%% 
-spec objects_sandbox_snapshot_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_sandbox_snapshot_get(Ctx) ->
    objects_sandbox_snapshot_get(Ctx, #{}).

-spec objects_sandbox_snapshot_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_sandbox_snapshot_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/sandbox/snapshot"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create Sandbox Snapshot
%% 
-spec objects_sandbox_snapshot_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_sandbox_snapshot_post(Ctx) ->
    objects_sandbox_snapshot_post(Ctx, #{}).

-spec objects_sandbox_snapshot_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_sandbox_snapshot_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/sandbox/snapshot"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Refresh Sandbox from Snapshot
%% 
-spec objects_sandbox_vault_id_actions_refresh_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_sandbox_vault_id_actions_refresh_post(Ctx, VaultId) ->
    objects_sandbox_vault_id_actions_refresh_post(Ctx, VaultId, #{}).

-spec objects_sandbox_vault_id_actions_refresh_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_sandbox_vault_id_actions_refresh_post(Ctx, VaultId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/sandbox/", VaultId, "/actions/refresh"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Sandbox Details by ID
%% 
-spec objects_sandbox_vault_id_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_sandbox_vault_id_get(Ctx, VaultId) ->
    objects_sandbox_vault_id_get(Ctx, VaultId, #{}).

-spec objects_sandbox_vault_id_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_sandbox_vault_id_get(Ctx, VaultId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/sandbox/", VaultId, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve All Security Policies
%% 
-spec objects_securitypolicies_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_securitypolicies_get(Ctx) ->
    objects_securitypolicies_get(Ctx, #{}).

-spec objects_securitypolicies_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_securitypolicies_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/securitypolicies"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Security Policy
%% 
-spec objects_securitypolicies_security_policy_name_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_securitypolicies_security_policy_name_get(Ctx, SecurityPolicyName) ->
    objects_securitypolicies_security_policy_name_get(Ctx, SecurityPolicyName, #{}).

-spec objects_securitypolicies_security_policy_name_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_securitypolicies_security_policy_name_get(Ctx, SecurityPolicyName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/securitypolicies/", SecurityPolicyName, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve All Users
%% 
-spec objects_users_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_users_get(Ctx) ->
    objects_users_get(Ctx, #{}).

-spec objects_users_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_users_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/users/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['vaults', 'exclude_vault_membership', 'exclude_app_licensing'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve User
%% 
-spec objects_users_id_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_users_id_get(Ctx, Id) ->
    objects_users_id_get(Ctx, Id, #{}).

-spec objects_users_id_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_users_id_get(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/users/", Id, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['exclude_vault_membership', 'exclude_app_licensing'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve User Permissions
%% 
-spec objects_users_id_permissions_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_users_id_permissions_get(Ctx, Id) ->
    objects_users_id_permissions_get(Ctx, Id, #{}).

-spec objects_users_id_permissions_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_users_id_permissions_get(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/users/", Id, "/permissions"],
    QS = lists:flatten([])++openapi_utils:optional_params(['filter'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update Single User
%% 
-spec objects_users_id_put(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_users_id_put(Ctx, Id) ->
    objects_users_id_put(Ctx, Id, #{}).

-spec objects_users_id_put(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_users_id_put(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/objects/users/", Id, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Validate Session User
%% 
-spec objects_users_me_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_users_me_get(Ctx) ->
    objects_users_me_get(Ctx, #{}).

-spec objects_users_me_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_users_me_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/users/me"],
    QS = lists:flatten([])++openapi_utils:optional_params(['exclude_vault_membership', 'exclude_app_licensing'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Change My Password
%% 
-spec objects_users_me_password_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_users_me_password_post(Ctx) ->
    objects_users_me_password_post(Ctx, #{}).

-spec objects_users_me_password_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_users_me_password_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/users/me/password"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve My User Permissions
%% 
-spec objects_users_me_permissions_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_users_me_permissions_get(Ctx) ->
    objects_users_me_permissions_get(Ctx, #{}).

-spec objects_users_me_permissions_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_users_me_permissions_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/objects/users/me/permissions"],
    QS = lists:flatten([])++openapi_utils:optional_params(['filter'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update My User
%% 
-spec objects_users_me_put(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_users_me_put(Ctx) ->
    objects_users_me_put(Ctx, #{}).

-spec objects_users_me_put(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_users_me_put(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/objects/users/me"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create Single User
%% 
-spec objects_users_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_users_post(Ctx) ->
    objects_users_post(Ctx, #{}).

-spec objects_users_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_users_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/users"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update Multiple Users
%% 
-spec objects_users_put(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_users_put(Ctx) ->
    objects_users_put(Ctx, #{}).

-spec objects_users_put(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_users_put(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/objects/users"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Disable User
%% 
-spec objects_users_user_id_delete(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_users_user_id_delete(Ctx, UserId) ->
    objects_users_user_id_delete(Ctx, UserId, #{}).

-spec objects_users_user_id_delete(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_users_user_id_delete(Ctx, UserId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/objects/users/", UserId, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['domain'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update Vault Membership
%% 
-spec objects_users_user_id_vault_membership_vault_id_put(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_users_user_id_vault_membership_vault_id_put(Ctx, UserId, VaultId) ->
    objects_users_user_id_vault_membership_vault_id_put(Ctx, UserId, VaultId, #{}).

-spec objects_users_user_id_vault_membership_vault_id_put(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_users_user_id_vault_membership_vault_id_put(Ctx, UserId, VaultId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/objects/users/", UserId, "/vault_membership/", VaultId, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Vault Compare
%% 
-spec objects_vault_actions_compare_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_vault_actions_compare_post(Ctx) ->
    objects_vault_actions_compare_post(Ctx, #{}).

-spec objects_vault_actions_compare_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_vault_actions_compare_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/vault/actions/compare"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Vault Configuration Report
%% 
-spec objects_vault_actions_configreport_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_vault_actions_configreport_post(Ctx) ->
    objects_vault_actions_configreport_post(Ctx, #{}).

-spec objects_vault_actions_configreport_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
objects_vault_actions_configreport_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/objects/vault/actions/configreport"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Component Definition Query
%% 
-spec query_components_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
query_components_post(Ctx) ->
    query_components_post(Ctx, #{}).

-spec query_components_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
query_components_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/query/components"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Next Page URL
%% 
-spec query_next_page_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
query_next_page_post(Ctx, NextPage) ->
    query_next_page_post(Ctx, NextPage, #{}).

-spec query_next_page_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
query_next_page_post(Ctx, NextPage, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/query/", NextPage, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-DescribeQuery', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Submitting a Query
%% 
-spec query_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
query_post(Ctx) ->
    query_post(Ctx, #{}).

-spec query_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
query_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/query"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-DescribeQuery', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Previous Page URL
%% 
-spec query_previous_page_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
query_previous_page_post(Ctx, PreviousPage) ->
    query_previous_page_post(Ctx, PreviousPage, #{}).

-spec query_previous_page_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
query_previous_page_post(Ctx, PreviousPage, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/query/", PreviousPage, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-DescribeQuery', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Current User with SCIM
%% 
-spec scim_v2_me_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
scim_v2_me_get(Ctx) ->
    scim_v2_me_get(Ctx, #{}).

-spec scim_v2_me_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
scim_v2_me_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/scim/v2/Me"],
    QS = lists:flatten([])++openapi_utils:optional_params(['attributes', 'excludedAttributes'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update Current User with SCIM
%% 
-spec scim_v2_me_put(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
scim_v2_me_put(Ctx) ->
    scim_v2_me_put(Ctx, #{}).

-spec scim_v2_me_put(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
scim_v2_me_put(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/scim/v2/Me"],
    QS = lists:flatten([])++openapi_utils:optional_params(['attributes', 'excludedAttributes'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve All SCIM Resource Types
%% 
-spec scim_v2_resource_types_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
scim_v2_resource_types_get(Ctx) ->
    scim_v2_resource_types_get(Ctx, #{}).

-spec scim_v2_resource_types_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
scim_v2_resource_types_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/scim/v2/ResourceTypes"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Single SCIM Resource Type
%% 
-spec scim_v2_resource_types_type_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
scim_v2_resource_types_type_get(Ctx, Type) ->
    scim_v2_resource_types_type_get(Ctx, Type, #{}).

-spec scim_v2_resource_types_type_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
scim_v2_resource_types_type_get(Ctx, Type, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/scim/v2/ResourceTypes/", Type, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve All SCIM Schema Information
%% 
-spec scim_v2_schemas_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
scim_v2_schemas_get(Ctx) ->
    scim_v2_schemas_get(Ctx, #{}).

-spec scim_v2_schemas_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
scim_v2_schemas_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/scim/v2/Schemas"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Single SCIM Schema Information
%% 
-spec scim_v2_schemas_id_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
scim_v2_schemas_id_get(Ctx, Id) ->
    scim_v2_schemas_id_get(Ctx, Id, #{}).

-spec scim_v2_schemas_id_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
scim_v2_schemas_id_get(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/scim/v2/Schemas/", Id, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve SCIM Provider
%% 
-spec scim_v2_service_provider_config_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
scim_v2_service_provider_config_get(Ctx) ->
    scim_v2_service_provider_config_get(Ctx, #{}).

-spec scim_v2_service_provider_config_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
scim_v2_service_provider_config_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/scim/v2/ServiceProviderConfig"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve SCIM Resources
%% 
-spec scim_v2_type_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
scim_v2_type_get(Ctx, Type) ->
    scim_v2_type_get(Ctx, Type, #{}).

-spec scim_v2_type_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
scim_v2_type_get(Ctx, Type, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/scim/v2/", Type, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['filter', 'attributes', 'excludedAttributes', 'sortBy', 'sortOrder', 'startIndex'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Single SCIM Resource
%% 
-spec scim_v2_type_id_get(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
scim_v2_type_id_get(Ctx, Type, Id) ->
    scim_v2_type_id_get(Ctx, Type, Id, #{}).

-spec scim_v2_type_id_get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
scim_v2_type_id_get(Ctx, Type, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/scim/v2/", Type, "/", Id, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['attributes', 'excludedAttributes'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve All Users with SCIM
%% 
-spec scim_v2_users_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
scim_v2_users_get(Ctx) ->
    scim_v2_users_get(Ctx, #{}).

-spec scim_v2_users_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
scim_v2_users_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/scim/v2/Users"],
    QS = lists:flatten([])++openapi_utils:optional_params(['filter', 'attributes', 'excludedAttributes', 'sortBy', 'sortOrder', 'count', 'startIndex'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Single User with SCIM
%% 
-spec scim_v2_users_id_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
scim_v2_users_id_get(Ctx, Id) ->
    scim_v2_users_id_get(Ctx, Id, #{}).

-spec scim_v2_users_id_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
scim_v2_users_id_get(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/scim/v2/Users/", Id, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['filter', 'attributes', 'excludedAttributes'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update User with SCIM
%% 
-spec scim_v2_users_id_put(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
scim_v2_users_id_put(Ctx, Id) ->
    scim_v2_users_id_put(Ctx, Id, #{}).

-spec scim_v2_users_id_put(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
scim_v2_users_id_put(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/scim/v2/Users/", Id, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create User with SCIM
%% 
-spec scim_v2_users_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
scim_v2_users_post(Ctx) ->
    scim_v2_users_post(Ctx, #{}).

-spec scim_v2_users_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
scim_v2_users_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/scim/v2/Users"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Signing Certificate
%% 
-spec services_certificate_cert_id_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_certificate_cert_id_get(Ctx, CertId) ->
    services_certificate_cert_id_get(Ctx, CertId, #{}).

-spec services_certificate_cert_id_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_certificate_cert_id_get(Ctx, CertId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/services/certificate/", CertId, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Disable Configuration Mode
%% 
-spec services_configuration_mode_actions_disable_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_configuration_mode_actions_disable_post(Ctx) ->
    services_configuration_mode_actions_disable_post(Ctx, #{}).

-spec services_configuration_mode_actions_disable_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_configuration_mode_actions_disable_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/services/configuration_mode/actions/disable"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Enable Configuration Mode
%% 
-spec services_configuration_mode_actions_enable_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_configuration_mode_actions_enable_post(Ctx) ->
    services_configuration_mode_actions_enable_post(Ctx, #{}).

-spec services_configuration_mode_actions_enable_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_configuration_mode_actions_enable_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/services/configuration_mode/actions/enable"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Available Direct Data Files
%% 
-spec services_directdata_files_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_directdata_files_get(Ctx) ->
    services_directdata_files_get(Ctx, #{}).

-spec services_directdata_files_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_directdata_files_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/services/directdata/files"],
    QS = lists:flatten([])++openapi_utils:optional_params(['extract_type', 'start_time', 'stop_time'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Accept', 'Authorization', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Download Direct Data File
%% 
-spec services_directdata_files_name_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_directdata_files_name_get(Ctx, Name) ->
    services_directdata_files_name_get(Ctx, Name, #{}).

-spec services_directdata_files_name_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_directdata_files_name_get(Ctx, Name, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/services/directdata/files/", Name, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Accept', 'Authorization', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Download Item Content
%% 
-spec services_file_staging_items_content_item_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_file_staging_items_content_item_get(Ctx, Item) ->
    services_file_staging_items_content_item_get(Ctx, Item, #{}).

-spec services_file_staging_items_content_item_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_file_staging_items_content_item_get(Ctx, Item, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/services/file_staging/items/content/", Item, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Range', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete File or Folder
%% 
-spec services_file_staging_items_item_delete(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_file_staging_items_item_delete(Ctx, Item) ->
    services_file_staging_items_item_delete(Ctx, Item, #{}).

-spec services_file_staging_items_item_delete(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_file_staging_items_item_delete(Ctx, Item, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/services/file_staging/items/", Item, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['recursive'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List Items at a Path
%% 
-spec services_file_staging_items_item_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_file_staging_items_item_get(Ctx, Item) ->
    services_file_staging_items_item_get(Ctx, Item, #{}).

-spec services_file_staging_items_item_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_file_staging_items_item_get(Ctx, Item, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/services/file_staging/items/", Item, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['recursive', 'limit', 'format_result'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update Folder or File
%% 
-spec services_file_staging_items_item_put(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_file_staging_items_item_put(Ctx, Item) ->
    services_file_staging_items_item_put(Ctx, Item, #{}).

-spec services_file_staging_items_item_put(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_file_staging_items_item_put(Ctx, Item, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/services/file_staging/items/", Item, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create Folder or File
%% 
-spec services_file_staging_items_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_file_staging_items_post(Ctx) ->
    services_file_staging_items_post(Ctx, #{}).

-spec services_file_staging_items_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_file_staging_items_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/services/file_staging/items"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-MD5', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List Upload Sessions
%% 
-spec services_file_staging_upload_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_file_staging_upload_get(Ctx) ->
    services_file_staging_upload_get(Ctx, #{}).

-spec services_file_staging_upload_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_file_staging_upload_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/services/file_staging/upload/"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create Resumable Upload Session
%% 
-spec services_file_staging_upload_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_file_staging_upload_post(Ctx) ->
    services_file_staging_upload_post(Ctx, #{}).

-spec services_file_staging_upload_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_file_staging_upload_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/services/file_staging/upload"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Abort Upload Session
%% 
-spec services_file_staging_upload_upload_session_id_delete(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_file_staging_upload_upload_session_id_delete(Ctx, UploadSessionId) ->
    services_file_staging_upload_upload_session_id_delete(Ctx, UploadSessionId, #{}).

-spec services_file_staging_upload_upload_session_id_delete(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_file_staging_upload_upload_session_id_delete(Ctx, UploadSessionId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/services/file_staging/upload/", UploadSessionId, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get Upload Session Details
%% 
-spec services_file_staging_upload_upload_session_id_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_file_staging_upload_upload_session_id_get(Ctx, UploadSessionId) ->
    services_file_staging_upload_upload_session_id_get(Ctx, UploadSessionId, #{}).

-spec services_file_staging_upload_upload_session_id_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_file_staging_upload_upload_session_id_get(Ctx, UploadSessionId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/services/file_staging/upload/", UploadSessionId, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List File Parts Uploaded to Session
%% 
-spec services_file_staging_upload_upload_session_id_parts_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_file_staging_upload_upload_session_id_parts_get(Ctx, UploadSessionId) ->
    services_file_staging_upload_upload_session_id_parts_get(Ctx, UploadSessionId, #{}).

-spec services_file_staging_upload_upload_session_id_parts_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_file_staging_upload_upload_session_id_parts_get(Ctx, UploadSessionId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/services/file_staging/upload/", UploadSessionId, "/parts"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Commit Upload Session
%% 
-spec services_file_staging_upload_upload_session_id_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_file_staging_upload_upload_session_id_post(Ctx, UploadSessionId) ->
    services_file_staging_upload_upload_session_id_post(Ctx, UploadSessionId, #{}).

-spec services_file_staging_upload_upload_session_id_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_file_staging_upload_upload_session_id_post(Ctx, UploadSessionId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/services/file_staging/upload/", UploadSessionId, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Upload to a Session
%% 
-spec services_file_staging_upload_upload_session_id_put(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_file_staging_upload_upload_session_id_put(Ctx, UploadSessionId) ->
    services_file_staging_upload_upload_session_id_put(Ctx, UploadSessionId, #{}).

-spec services_file_staging_upload_upload_session_id_put(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_file_staging_upload_upload_session_id_put(Ctx, UploadSessionId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/services/file_staging/upload/", UploadSessionId, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-FilePartNumber', 'Content-MD5', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Job Histories
%% 
-spec services_jobs_histories_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_jobs_histories_get(Ctx) ->
    services_jobs_histories_get(Ctx, #{}).

-spec services_jobs_histories_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_jobs_histories_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/services/jobs/histories"],
    QS = lists:flatten([])++openapi_utils:optional_params(['start_date', 'end_date', 'status', 'limit', 'offset'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Import Bulk Translation File Job Errors
%% 
-spec services_jobs_job_id_errors_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_jobs_job_id_errors_get(Ctx, JobId) ->
    services_jobs_job_id_errors_get(Ctx, JobId, #{}).

-spec services_jobs_job_id_errors_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_jobs_job_id_errors_get(Ctx, JobId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/services/jobs/", JobId, "/errors"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Job Status
%% 
-spec services_jobs_job_id_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_jobs_job_id_get(Ctx, JobId) ->
    services_jobs_job_id_get(Ctx, JobId, #{}).

-spec services_jobs_job_id_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_jobs_job_id_get(Ctx, JobId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/services/jobs/", JobId, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Import Bulk Translation File Job Summary
%% 
-spec services_jobs_job_id_summary_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_jobs_job_id_summary_get(Ctx, JobId) ->
    services_jobs_job_id_summary_get(Ctx, JobId, #{}).

-spec services_jobs_job_id_summary_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_jobs_job_id_summary_get(Ctx, JobId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/services/jobs/", JobId, "/summary"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve SDK Job Tasks
%% 
-spec services_jobs_job_id_tasks_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_jobs_job_id_tasks_get(Ctx, JobId) ->
    services_jobs_job_id_tasks_get(Ctx, JobId, #{}).

-spec services_jobs_job_id_tasks_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_jobs_job_id_tasks_get(Ctx, JobId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/services/jobs/", JobId, "/tasks"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Job Monitors
%% 
-spec services_jobs_monitors_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_jobs_monitors_get(Ctx) ->
    services_jobs_monitors_get(Ctx, #{}).

-spec services_jobs_monitors_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_jobs_monitors_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/services/jobs/monitors"],
    QS = lists:flatten([])++openapi_utils:optional_params(['start_date', 'end_date', 'status', 'limit', 'offset'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Start Job
%% 
-spec services_jobs_start_now_job_id_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_jobs_start_now_job_id_post(Ctx, JobId) ->
    services_jobs_start_now_job_id_post(Ctx, JobId, #{}).

-spec services_jobs_start_now_job_id_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_jobs_start_now_job_id_post(Ctx, JobId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/services/jobs/start_now/", JobId, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Extract Data Files
%% 
-spec services_loader_extract_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_loader_extract_post(Ctx) ->
    services_loader_extract_post(Ctx, #{}).

-spec services_loader_extract_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_loader_extract_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/services/loader/extract"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Load Failure Log Results
%% 
-spec services_loader_job_id_tasks_task_id_failurelog_get(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_loader_job_id_tasks_task_id_failurelog_get(Ctx, JobId, TaskId) ->
    services_loader_job_id_tasks_task_id_failurelog_get(Ctx, JobId, TaskId, #{}).

-spec services_loader_job_id_tasks_task_id_failurelog_get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_loader_job_id_tasks_task_id_failurelog_get(Ctx, JobId, TaskId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/services/loader/", JobId, "/tasks/", TaskId, "/failurelog"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Loader Extract Results
%% 
-spec services_loader_job_id_tasks_task_id_results_get(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_loader_job_id_tasks_task_id_results_get(Ctx, JobId, TaskId) ->
    services_loader_job_id_tasks_task_id_results_get(Ctx, JobId, TaskId, #{}).

-spec services_loader_job_id_tasks_task_id_results_get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_loader_job_id_tasks_task_id_results_get(Ctx, JobId, TaskId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/services/loader/", JobId, "/tasks/", TaskId, "/results"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Loader Extract Renditions Results
%% 
-spec services_loader_job_id_tasks_task_id_results_renditions_get(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_loader_job_id_tasks_task_id_results_renditions_get(Ctx, JobId, TaskId) ->
    services_loader_job_id_tasks_task_id_results_renditions_get(Ctx, JobId, TaskId, #{}).

-spec services_loader_job_id_tasks_task_id_results_renditions_get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_loader_job_id_tasks_task_id_results_renditions_get(Ctx, JobId, TaskId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/services/loader/", JobId, "/tasks/", TaskId, "/results/renditions"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Load Success Log Results
%% 
-spec services_loader_job_id_tasks_task_id_successlog_get(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_loader_job_id_tasks_task_id_successlog_get(Ctx, JobId, TaskId) ->
    services_loader_job_id_tasks_task_id_successlog_get(Ctx, JobId, TaskId, #{}).

-spec services_loader_job_id_tasks_task_id_successlog_get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_loader_job_id_tasks_task_id_successlog_get(Ctx, JobId, TaskId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/services/loader/", JobId, "/tasks/", TaskId, "/successlog"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Load Data Objects
%% 
-spec services_loader_load_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_loader_load_post(Ctx) ->
    services_loader_load_post(Ctx, #{}).

-spec services_loader_load_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_loader_load_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/services/loader/load"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Validate Package
%% 
-spec services_package_actions_validate_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_package_actions_validate_post(Ctx) ->
    services_package_actions_validate_post(Ctx, #{}).

-spec services_package_actions_validate_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_package_actions_validate_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/services/package/actions/validate"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Export Package
%% 
-spec services_package_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_package_post(Ctx) ->
    services_package_post(Ctx, #{}).

-spec services_package_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_package_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/services/package"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Import Package
%% 
-spec services_package_put(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_package_put(Ctx) ->
    services_package_put(Ctx, #{}).

-spec services_package_put(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_package_put(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/services/package"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve All Queues
%% 
-spec services_queues_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_queues_get(Ctx) ->
    services_queues_get(Ctx, #{}).

-spec services_queues_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_queues_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/services/queues"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Disable Delivery
%% 
-spec services_queues_queue_name_actions_disable_delivery_put(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_queues_queue_name_actions_disable_delivery_put(Ctx, QueueName) ->
    services_queues_queue_name_actions_disable_delivery_put(Ctx, QueueName, #{}).

-spec services_queues_queue_name_actions_disable_delivery_put(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_queues_queue_name_actions_disable_delivery_put(Ctx, QueueName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/services/queues/", QueueName, "/actions/disable_delivery"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Enable Delivery
%% 
-spec services_queues_queue_name_actions_enable_delivery_put(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_queues_queue_name_actions_enable_delivery_put(Ctx, QueueName) ->
    services_queues_queue_name_actions_enable_delivery_put(Ctx, QueueName, #{}).

-spec services_queues_queue_name_actions_enable_delivery_put(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_queues_queue_name_actions_enable_delivery_put(Ctx, QueueName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/services/queues/", QueueName, "/actions/enable_delivery"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Reset Queue
%% 
-spec services_queues_queue_name_actions_reset_put(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_queues_queue_name_actions_reset_put(Ctx, QueueName) ->
    services_queues_queue_name_actions_reset_put(Ctx, QueueName, #{}).

-spec services_queues_queue_name_actions_reset_put(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_queues_queue_name_actions_reset_put(Ctx, QueueName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/services/queues/", QueueName, "/actions/reset"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Queue Status
%% 
-spec services_queues_queue_name_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_queues_queue_name_get(Ctx, QueueName) ->
    services_queues_queue_name_get(Ctx, QueueName, #{}).

-spec services_queues_queue_name_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_queues_queue_name_get(Ctx, QueueName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/services/queues/", QueueName, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Validate Imported Package
%% 
-spec services_vobject_vault_package_v_package_id_actions_validate_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_vobject_vault_package_v_package_id_actions_validate_post(Ctx, PackageId) ->
    services_vobject_vault_package_v_package_id_actions_validate_post(Ctx, PackageId, #{}).

-spec services_vobject_vault_package_v_package_id_actions_validate_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
services_vobject_vault_package_v_package_id_actions_validate_post(Ctx, PackageId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/services/vobject/vault_package__v/", PackageId, "/actions/validate"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc End Session
%% 
-spec session_delete(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
session_delete(Ctx) ->
    session_delete(Ctx, #{}).

-spec session_delete(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
session_delete(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/session"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Accept', 'Authorization', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Download Single Client Code Distribution
%% 
-spec uicode_distributions_distribution_name_code_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uicode_distributions_distribution_name_code_get(Ctx, DistributionName) ->
    uicode_distributions_distribution_name_code_get(Ctx, DistributionName, #{}).

-spec uicode_distributions_distribution_name_code_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uicode_distributions_distribution_name_code_get(Ctx, DistributionName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/uicode/distributions/", DistributionName, "/code"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Accept', 'Authorization', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete Single Client Code Distribution
%% 
-spec uicode_distributions_distribution_name_delete(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uicode_distributions_distribution_name_delete(Ctx, DistributionName) ->
    uicode_distributions_distribution_name_delete(Ctx, DistributionName, #{}).

-spec uicode_distributions_distribution_name_delete(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uicode_distributions_distribution_name_delete(Ctx, DistributionName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/uicode/distributions/", DistributionName, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Accept', 'Authorization', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Single Client Code Distribution Metadata
%% 
-spec uicode_distributions_distribution_name_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uicode_distributions_distribution_name_get(Ctx, DistributionName) ->
    uicode_distributions_distribution_name_get(Ctx, DistributionName, #{}).

-spec uicode_distributions_distribution_name_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uicode_distributions_distribution_name_get(Ctx, DistributionName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/uicode/distributions/", DistributionName, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Accept', 'Authorization', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve All Client Code Distribution Metadata
%% 
-spec uicode_distributions_get(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uicode_distributions_get(Ctx) ->
    uicode_distributions_get(Ctx, #{}).

-spec uicode_distributions_get(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uicode_distributions_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/uicode/distributions"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Accept', 'Authorization', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Add or Replace Single Client Code Distribution
%% 
-spec uicode_distributions_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uicode_distributions_post(Ctx) ->
    uicode_distributions_post(Ctx, #{}).

-spec uicode_distributions_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uicode_distributions_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/uicode/distributions"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Accept', 'Authorization', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Deploy Package
%% 
-spec vobject_vault_package_v_package_id_actions_deploy_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobject_vault_package_v_package_id_actions_deploy_post(Ctx, PackageId) ->
    vobject_vault_package_v_package_id_actions_deploy_post(Ctx, PackageId, #{}).

-spec vobject_vault_package_v_package_id_actions_deploy_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobject_vault_package_v_package_id_actions_deploy_post(Ctx, PackageId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/vobject/vault_package__v/", PackageId, "/actions/deploy"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Package Deploy Results
%% 
-spec vobject_vault_package_v_package_id_actions_deploy_results_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobject_vault_package_v_package_id_actions_deploy_results_get(Ctx, PackageId) ->
    vobject_vault_package_v_package_id_actions_deploy_results_get(Ctx, PackageId, #{}).

-spec vobject_vault_package_v_package_id_actions_deploy_results_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobject_vault_package_v_package_id_actions_deploy_results_get(Ctx, PackageId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/vobject/vault_package__v/", PackageId, "/actions/deploy/results"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Results of Cascade Delete Job
%% 
-spec vobjects_cascadedelete_results_object_name_job_status_job_id_get(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_cascadedelete_results_object_name_job_status_job_id_get(Ctx, ObjectName, JobStatus, JobId) ->
    vobjects_cascadedelete_results_object_name_job_status_job_id_get(Ctx, ObjectName, JobStatus, JobId, #{}).

-spec vobjects_cascadedelete_results_object_name_job_status_job_id_get(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_cascadedelete_results_object_name_job_status_job_id_get(Ctx, ObjectName, JobStatus, JobId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/vobjects/cascadedelete/results/", ObjectName, "/", JobStatus, "/", JobId, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Results of Deep Copy Job
%% 
-spec vobjects_deepcopy_results_object_name_job_status_job_id_get(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_deepcopy_results_object_name_job_status_job_id_get(Ctx, ObjectName, JobStatus, JobId) ->
    vobjects_deepcopy_results_object_name_job_status_job_id_get(Ctx, ObjectName, JobStatus, JobId, #{}).

-spec vobjects_deepcopy_results_object_name_job_status_job_id_get(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_deepcopy_results_object_name_job_status_job_id_get(Ctx, ObjectName, JobStatus, JobId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/vobjects/deepcopy/results/", ObjectName, "/", JobStatus, "/", JobId, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create a Placeholder from an EDL Item
%% 
-spec vobjects_edl_item_v_actions_createplaceholder_post(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_edl_item_v_actions_createplaceholder_post(Ctx) ->
    vobjects_edl_item_v_actions_createplaceholder_post(Ctx, #{}).

-spec vobjects_edl_item_v_actions_createplaceholder_post(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_edl_item_v_actions_createplaceholder_post(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/vobjects/edl_item__v/actions/createplaceholder"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Download Merge Records Job Log
%% 
-spec vobjects_merges_job_id_log_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_merges_job_id_log_get(Ctx, JobId) ->
    vobjects_merges_job_id_log_get(Ctx, JobId, #{}).

-spec vobjects_merges_job_id_log_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_merges_job_id_log_get(Ctx, JobId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/vobjects/merges/", JobId, "/log"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Record Merge Results
%% 
-spec vobjects_merges_job_id_results_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_merges_job_id_results_get(Ctx, JobId) ->
    vobjects_merges_job_id_results_get(Ctx, JobId, #{}).

-spec vobjects_merges_job_id_results_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_merges_job_id_results_get(Ctx, JobId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/vobjects/merges/", JobId, "/results"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Record Merge Status
%% 
-spec vobjects_merges_job_id_status_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_merges_job_id_status_get(Ctx, JobId) ->
    vobjects_merges_job_id_status_get(Ctx, JobId, #{}).

-spec vobjects_merges_job_id_status_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_merges_job_id_status_get(Ctx, JobId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/vobjects/merges/", JobId, "/status"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Initiate Object Action on Multiple Records
%% 
-spec vobjects_object_name_actions_action_name_post(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_actions_action_name_post(Ctx, ObjectName, ActionName) ->
    vobjects_object_name_actions_action_name_post(Ctx, ObjectName, ActionName, #{}).

-spec vobjects_object_name_actions_action_name_post(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_actions_action_name_post(Ctx, ObjectName, ActionName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/vobjects/", ObjectName, "/actions/", ActionName, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Change Object Type
%% 
-spec vobjects_object_name_actions_changetype_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_actions_changetype_post(Ctx, ObjectName) ->
    vobjects_object_name_actions_changetype_post(Ctx, ObjectName, #{}).

-spec vobjects_object_name_actions_changetype_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_actions_changetype_post(Ctx, ObjectName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/vobjects/", ObjectName, "/actions/changetype"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Initiate Record Merge
%% 
-spec vobjects_object_name_actions_merge_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_actions_merge_post(Ctx, ObjectName) ->
    vobjects_object_name_actions_merge_post(Ctx, ObjectName, #{}).

-spec vobjects_object_name_actions_merge_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_actions_merge_post(Ctx, ObjectName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/vobjects/", ObjectName, "/actions/merge"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = OpenapiVobjectsObjectNameActionsMergePostRequestInnerArray,
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Roll-up Field Recalculation Status
%% 
-spec vobjects_object_name_actions_recalculaterollups_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_actions_recalculaterollups_get(Ctx, ObjectName) ->
    vobjects_object_name_actions_recalculaterollups_get(Ctx, ObjectName, #{}).

-spec vobjects_object_name_actions_recalculaterollups_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_actions_recalculaterollups_get(Ctx, ObjectName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/vobjects/", ObjectName, "/actions/recalculaterollups"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Recalculate Roll-up Fields
%% 
-spec vobjects_object_name_actions_recalculaterollups_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_actions_recalculaterollups_post(Ctx, ObjectName) ->
    vobjects_object_name_actions_recalculaterollups_post(Ctx, ObjectName, #{}).

-spec vobjects_object_name_actions_recalculaterollups_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_actions_recalculaterollups_post(Ctx, ObjectName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/vobjects/", ObjectName, "/actions/recalculaterollups"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update Corporate Currency Fields
%% 
-spec vobjects_object_name_actions_updatecorporatecurrency_put(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_actions_updatecorporatecurrency_put(Ctx, ObjectName) ->
    vobjects_object_name_actions_updatecorporatecurrency_put(Ctx, ObjectName, #{}).

-spec vobjects_object_name_actions_updatecorporatecurrency_put(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_actions_updatecorporatecurrency_put(Ctx, ObjectName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/vobjects/", ObjectName, "/actions/updatecorporatecurrency"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete Multiple Object Record Attachments
%% 
-spec vobjects_object_name_attachments_batch_delete(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_attachments_batch_delete(Ctx, ObjectName) ->
    vobjects_object_name_attachments_batch_delete(Ctx, ObjectName, #{}).

-spec vobjects_object_name_attachments_batch_delete(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_attachments_batch_delete(Ctx, ObjectName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/vobjects/", ObjectName, "/attachments/batch"],
    QS = lists:flatten([])++openapi_utils:optional_params(['idParam'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create Multiple Object Record Attachments
%% 
-spec vobjects_object_name_attachments_batch_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_attachments_batch_post(Ctx, ObjectName) ->
    vobjects_object_name_attachments_batch_post(Ctx, ObjectName, #{}).

-spec vobjects_object_name_attachments_batch_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_attachments_batch_post(Ctx, ObjectName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/vobjects/", ObjectName, "/attachments/batch"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update Multiple Object Record Attachment Descriptions
%% 
-spec vobjects_object_name_attachments_batch_put(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_attachments_batch_put(Ctx, ObjectName) ->
    vobjects_object_name_attachments_batch_put(Ctx, ObjectName, #{}).

-spec vobjects_object_name_attachments_batch_put(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_attachments_batch_put(Ctx, ObjectName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/vobjects/", ObjectName, "/attachments/batch"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete Object Records
%% 
-spec vobjects_object_name_delete(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_delete(Ctx, ObjectName) ->
    vobjects_object_name_delete(Ctx, ObjectName, #{}).

-spec vobjects_object_name_delete(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_delete(Ctx, ObjectName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/vobjects/", ObjectName, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Object Record Roles
%% 
-spec vobjects_object_name_id_roles_role_name_get(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_id_roles_role_name_get(Ctx, ObjectName, Id, RoleName) ->
    vobjects_object_name_id_roles_role_name_get(Ctx, ObjectName, Id, RoleName, #{}).

-spec vobjects_object_name_id_roles_role_name_get(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_id_roles_role_name_get(Ctx, ObjectName, Id, RoleName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/vobjects/", ObjectName, "/", Id, "/roles/", RoleName, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Object User Actions Details
%% 
-spec vobjects_object_name_object_record_id_actions_action_name_get(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_actions_action_name_get(Ctx, ObjectName, ObjectRecordId, ActionName) ->
    vobjects_object_name_object_record_id_actions_action_name_get(Ctx, ObjectName, ObjectRecordId, ActionName, #{}).

-spec vobjects_object_name_object_record_id_actions_action_name_get(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_actions_action_name_get(Ctx, ObjectName, ObjectRecordId, ActionName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/vobjects/", ObjectName, "/", ObjectRecordId, "/actions/", ActionName, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Initiate Object Action on a Single Record
%% 
-spec vobjects_object_name_object_record_id_actions_action_name_post(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_actions_action_name_post(Ctx, ObjectName, ObjectRecordId, ActionName) ->
    vobjects_object_name_object_record_id_actions_action_name_post(Ctx, ObjectName, ObjectRecordId, ActionName, #{}).

-spec vobjects_object_name_object_record_id_actions_action_name_post(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_actions_action_name_post(Ctx, ObjectName, ObjectRecordId, ActionName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/vobjects/", ObjectName, "/", ObjectRecordId, "/actions/", ActionName, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Cascade Delete Object Record
%% 
-spec vobjects_object_name_object_record_id_actions_cascadedelete_post(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_actions_cascadedelete_post(Ctx, ObjectName, ObjectRecordId) ->
    vobjects_object_name_object_record_id_actions_cascadedelete_post(Ctx, ObjectName, ObjectRecordId, #{}).

-spec vobjects_object_name_object_record_id_actions_cascadedelete_post(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_actions_cascadedelete_post(Ctx, ObjectName, ObjectRecordId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/vobjects/", ObjectName, "/", ObjectRecordId, "/actions/cascadedelete"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Deep Copy Object Record
%% 
-spec vobjects_object_name_object_record_id_actions_deepcopy_post(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_actions_deepcopy_post(Ctx, ObjectName, ObjectRecordId) ->
    vobjects_object_name_object_record_id_actions_deepcopy_post(Ctx, ObjectName, ObjectRecordId, #{}).

-spec vobjects_object_name_object_record_id_actions_deepcopy_post(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_actions_deepcopy_post(Ctx, ObjectName, ObjectRecordId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/vobjects/", ObjectName, "/", ObjectRecordId, "/actions/deepcopy"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Object Record User Actions
%% 
-spec vobjects_object_name_object_record_id_actions_get(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_actions_get(Ctx, ObjectName, ObjectRecordId) ->
    vobjects_object_name_object_record_id_actions_get(Ctx, ObjectName, ObjectRecordId, #{}).

-spec vobjects_object_name_object_record_id_actions_get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_actions_get(Ctx, ObjectName, ObjectRecordId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/vobjects/", ObjectName, "/", ObjectRecordId, "/actions"],
    QS = lists:flatten([])++openapi_utils:optional_params(['loc'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Download Attachment Field File
%% 
-spec vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_get(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_get(Ctx, ObjectName, ObjectRecordId, AttachmentFieldName) ->
    vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_get(Ctx, ObjectName, ObjectRecordId, AttachmentFieldName, #{}).

-spec vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_get(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_get(Ctx, ObjectName, ObjectRecordId, AttachmentFieldName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/vobjects/", ObjectName, "/", ObjectRecordId, "/attachment_fields/", AttachmentFieldName, "/file"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update Attachment Field File
%% 
-spec vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_post(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_post(Ctx, ObjectName, ObjectRecordId, AttachmentFieldName) ->
    vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_post(Ctx, ObjectName, ObjectRecordId, AttachmentFieldName, #{}).

-spec vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_post(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_post(Ctx, ObjectName, ObjectRecordId, AttachmentFieldName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/vobjects/", ObjectName, "/", ObjectRecordId, "/attachment_fields/", AttachmentFieldName, "/file"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Download All Attachment Field Files
%% 
-spec vobjects_object_name_object_record_id_attachment_fields_file_get(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_attachment_fields_file_get(Ctx, ObjectName, ObjectRecordId) ->
    vobjects_object_name_object_record_id_attachment_fields_file_get(Ctx, ObjectName, ObjectRecordId, #{}).

-spec vobjects_object_name_object_record_id_attachment_fields_file_get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_attachment_fields_file_get(Ctx, ObjectName, ObjectRecordId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/vobjects/", ObjectName, "/", ObjectRecordId, "/attachment_fields/file"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete Object Record Attachment
%% 
-spec vobjects_object_name_object_record_id_attachments_attachment_id_delete(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_attachments_attachment_id_delete(Ctx, ObjectName, ObjectRecordId, AttachmentId) ->
    vobjects_object_name_object_record_id_attachments_attachment_id_delete(Ctx, ObjectName, ObjectRecordId, AttachmentId, #{}).

-spec vobjects_object_name_object_record_id_attachments_attachment_id_delete(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_attachments_attachment_id_delete(Ctx, ObjectName, ObjectRecordId, AttachmentId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/vobjects/", ObjectName, "/", ObjectRecordId, "/attachments/", AttachmentId, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Object Record Attachment Metadata
%% 
-spec vobjects_object_name_object_record_id_attachments_attachment_id_get(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_attachments_attachment_id_get(Ctx, ObjectName, ObjectRecordId, AttachmentId) ->
    vobjects_object_name_object_record_id_attachments_attachment_id_get(Ctx, ObjectName, ObjectRecordId, AttachmentId, #{}).

-spec vobjects_object_name_object_record_id_attachments_attachment_id_get(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_attachments_attachment_id_get(Ctx, ObjectName, ObjectRecordId, AttachmentId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/vobjects/", ObjectName, "/", ObjectRecordId, "/attachments/", AttachmentId, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update Object Record Attachment Description
%% 
-spec vobjects_object_name_object_record_id_attachments_attachment_id_put(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_attachments_attachment_id_put(Ctx, ObjectName, ObjectRecordId, AttachmentId) ->
    vobjects_object_name_object_record_id_attachments_attachment_id_put(Ctx, ObjectName, ObjectRecordId, AttachmentId, #{}).

-spec vobjects_object_name_object_record_id_attachments_attachment_id_put(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_attachments_attachment_id_put(Ctx, ObjectName, ObjectRecordId, AttachmentId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/vobjects/", ObjectName, "/", ObjectRecordId, "/attachments/", AttachmentId, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Delete Object Record Attachment Version
%% 
-spec vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_delete(ctx:ctx(), binary(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_delete(Ctx, ObjectName, ObjectRecordId, AttachmentId, AttachmentVersion) ->
    vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_delete(Ctx, ObjectName, ObjectRecordId, AttachmentId, AttachmentVersion, #{}).

-spec vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_delete(ctx:ctx(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_delete(Ctx, ObjectName, ObjectRecordId, AttachmentId, AttachmentVersion, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/vobjects/", ObjectName, "/", ObjectRecordId, "/attachments/", AttachmentId, "/versions/", AttachmentVersion, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Download Object Record Attachment File
%% 
-spec vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_file_get(ctx:ctx(), binary(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_file_get(Ctx, ObjectName, ObjectRecordId, AttachmentId, AttachmentVersion) ->
    vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_file_get(Ctx, ObjectName, ObjectRecordId, AttachmentId, AttachmentVersion, #{}).

-spec vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_file_get(ctx:ctx(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_file_get(Ctx, ObjectName, ObjectRecordId, AttachmentId, AttachmentVersion, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/vobjects/", ObjectName, "/", ObjectRecordId, "/attachments/", AttachmentId, "/versions/", AttachmentVersion, "/file"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Object Record Attachment Version Metadata
%% 
-spec vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_get(ctx:ctx(), binary(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_get(Ctx, ObjectName, ObjectRecordId, AttachmentId, AttachmentVersion) ->
    vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_get(Ctx, ObjectName, ObjectRecordId, AttachmentId, AttachmentVersion, #{}).

-spec vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_get(ctx:ctx(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_get(Ctx, ObjectName, ObjectRecordId, AttachmentId, AttachmentVersion, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/vobjects/", ObjectName, "/", ObjectRecordId, "/attachments/", AttachmentId, "/versions/", AttachmentVersion, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Restore Object Record Attachment Version
%% 
-spec vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_post(ctx:ctx(), binary(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_post(Ctx, ObjectName, ObjectRecordId, AttachmentId, AttachmentVersion) ->
    vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_post(Ctx, ObjectName, ObjectRecordId, AttachmentId, AttachmentVersion, #{}).

-spec vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_post(ctx:ctx(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_post(Ctx, ObjectName, ObjectRecordId, AttachmentId, AttachmentVersion, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/vobjects/", ObjectName, "/", ObjectRecordId, "/attachments/", AttachmentId, "/versions/", AttachmentVersion, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['restore'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Object Record Attachment Versions
%% 
-spec vobjects_object_name_object_record_id_attachments_attachment_id_versions_get(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_attachments_attachment_id_versions_get(Ctx, ObjectName, ObjectRecordId, AttachmentId) ->
    vobjects_object_name_object_record_id_attachments_attachment_id_versions_get(Ctx, ObjectName, ObjectRecordId, AttachmentId, #{}).

-spec vobjects_object_name_object_record_id_attachments_attachment_id_versions_get(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_attachments_attachment_id_versions_get(Ctx, ObjectName, ObjectRecordId, AttachmentId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/vobjects/", ObjectName, "/", ObjectRecordId, "/attachments/", AttachmentId, "/versions"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Download All Object Record Attachment Files
%% 
-spec vobjects_object_name_object_record_id_attachments_file_get(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_attachments_file_get(Ctx, ObjectName, ObjectRecordId) ->
    vobjects_object_name_object_record_id_attachments_file_get(Ctx, ObjectName, ObjectRecordId, #{}).

-spec vobjects_object_name_object_record_id_attachments_file_get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_attachments_file_get(Ctx, ObjectName, ObjectRecordId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/vobjects/", ObjectName, "/", ObjectRecordId, "/attachments/file"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Object Record Attachments
%% 
-spec vobjects_object_name_object_record_id_attachments_get(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_attachments_get(Ctx, ObjectName, ObjectRecordId) ->
    vobjects_object_name_object_record_id_attachments_get(Ctx, ObjectName, ObjectRecordId, #{}).

-spec vobjects_object_name_object_record_id_attachments_get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_attachments_get(Ctx, ObjectName, ObjectRecordId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/vobjects/", ObjectName, "/", ObjectRecordId, "/attachments"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create Object Record Attachment
%% 
-spec vobjects_object_name_object_record_id_attachments_post(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_attachments_post(Ctx, ObjectName, ObjectRecordId) ->
    vobjects_object_name_object_record_id_attachments_post(Ctx, ObjectName, ObjectRecordId, #{}).

-spec vobjects_object_name_object_record_id_attachments_post(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_attachments_post(Ctx, ObjectName, ObjectRecordId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/vobjects/", ObjectName, "/", ObjectRecordId, "/attachments"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Complete Audit History for a Single Object Record
%% 
-spec vobjects_object_name_object_record_id_audittrail_get(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_audittrail_get(Ctx, ObjectName, ObjectRecordId) ->
    vobjects_object_name_object_record_id_audittrail_get(Ctx, ObjectName, ObjectRecordId, #{}).

-spec vobjects_object_name_object_record_id_audittrail_get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_audittrail_get(Ctx, ObjectName, ObjectRecordId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/vobjects/", ObjectName, "/", ObjectRecordId, "/audittrail"],
    QS = lists:flatten([])++openapi_utils:optional_params(['start_date', 'end_date', 'format_result', 'limit', 'offset', 'events'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Object Record
%% 
-spec vobjects_object_name_object_record_id_get(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_get(Ctx, ObjectName, ObjectRecordId) ->
    vobjects_object_name_object_record_id_get(Ctx, ObjectName, ObjectRecordId, #{}).

-spec vobjects_object_name_object_record_id_get(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_object_record_id_get(Ctx, ObjectName, ObjectRecordId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/vobjects/", ObjectName, "/", ObjectRecordId, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Create & Upsert Object Records
%% 
-spec vobjects_object_name_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_post(Ctx, ObjectName) ->
    vobjects_object_name_post(Ctx, ObjectName, #{}).

-spec vobjects_object_name_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_post(Ctx, ObjectName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/vobjects/", ObjectName, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['idParam'], _OptionalParams),
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-MigrationMode', 'X-VaultAPI-NoTriggers', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Update Object Records
%% 
-spec vobjects_object_name_put(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_put(Ctx, ObjectName) ->
    vobjects_object_name_put(Ctx, ObjectName, #{}).

-spec vobjects_object_name_put(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_put(Ctx, ObjectName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/vobjects/", ObjectName, ""],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Content-Type', 'Accept', 'X-VaultAPI-MigrationMode', 'X-VaultAPI-NoTriggers', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Remove Users & Groups from Roles on Object Records
%% 
-spec vobjects_object_name_roles_delete(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_roles_delete(Ctx, ObjectName) ->
    vobjects_object_name_roles_delete(Ctx, ObjectName, #{}).

-spec vobjects_object_name_roles_delete(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_roles_delete(Ctx, ObjectName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/vobjects/", ObjectName, "/roles"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Assign Users & Groups to Roles on Object Records
%% 
-spec vobjects_object_name_roles_post(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_roles_post(Ctx, ObjectName) ->
    vobjects_object_name_roles_post(Ctx, ObjectName, #{}).

-spec vobjects_object_name_roles_post(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_object_name_roles_post(Ctx, ObjectName, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/vobjects/", ObjectName, "/roles"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'Content-Type', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Retrieve Outbound Package Dependencies
%% 
-spec vobjects_outbound_package_v_package_id_dependencies_get(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_outbound_package_v_package_id_dependencies_get(Ctx, PackageId) ->
    vobjects_outbound_package_v_package_id_dependencies_get(Ctx, PackageId, #{}).

-spec vobjects_outbound_package_v_package_id_dependencies_get(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
vobjects_outbound_package_v_package_id_dependencies_get(Ctx, PackageId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/vobjects/outbound_package__v/", PackageId, "/dependencies"],
    QS = [],
    Headers = []++openapi_utils:optional_params(['Authorization', 'Accept', 'X-VaultAPI-ClientID'], _OptionalParams),
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


