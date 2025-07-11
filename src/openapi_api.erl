-module(openapi_api).

-export([ api_get/0
        , api_mdl_components_component_type_and_record_name_files_get/1
        , api_mdl_components_component_type_and_record_name_get/1
        , api_mdl_execute_async_job_id_results_get/1
        , api_mdl_execute_async_post/0
        , api_mdl_execute_post/0
        , api_mdl_files_post/0
        , audittrail_audit_trail_type_get/1
        , auth_discovery_post/0
        , auth_oauth_session_oath_oidc_profile_id_post/1
        , auth_post/0
        , code_class_name_delete/1
        , code_class_name_disable_put/1
        , code_class_name_enable_put/1
        , code_class_name_get/1
        , code_profiler_get/0
        , code_profiler_post/0
        , code_profiler_session_name_actions_end_post/1
        , code_profiler_session_name_delete/1
        , code_profiler_session_name_get/1
        , code_profiler_session_name_results_get/1
        , code_put/0
        , composites_trees_edl_hierarchy_or_template_actions_listnodes_post/1
        , composites_trees_edl_hierarchy_or_template_get/1
        , composites_trees_edl_hierarchy_v_parent_node_id_children_get/1
        , composites_trees_edl_hierarchy_v_parent_node_id_children_put/1
        , configuration_component_type_and_record_name_get/1
        , configuration_component_type_get/1
        , configuration_object_name_and_object_type_get/1
        , configuration_objecttype_get/0
        , configuration_role_assignment_rule_delete/0
        , configuration_role_assignment_rule_get/0
        , configuration_role_assignment_rule_post/0
        , configuration_role_assignment_rule_put/0
        , delegation_login_post/0
        , delegation_vaults_get/0
        , keep_alive_post/0
        , limits_get/0
        , logs_api_usage_get/0
        , logs_code_debug_get/0
        , logs_code_debug_id_actions_reset_delete/1
        , logs_code_debug_id_actions_reset_post/1
        , logs_code_debug_id_files_get/1
        , logs_code_debug_id_get/1
        , logs_code_debug_post/0
        , logs_code_runtime_get/0
        , messages_message_type_actions_import_post/1
        , messages_message_type_language_lang_actions_export_post/2
        , metadata_audittrail_audit_trail_type_get/1
        , metadata_audittrail_get/0
        , metadata_components_component_type_get/1
        , metadata_components_get/0
        , metadata_objects_binders_templates_bindernodes_get/0
        , metadata_objects_binders_templates_get/0
        , metadata_objects_documents_annotations_placemarks_types_placemark_type_get/1
        , metadata_objects_documents_annotations_references_types_reference_type_get/1
        , metadata_objects_documents_annotations_types_annotation_type_get/1
        , metadata_objects_documents_events_event_type_types_event_subtype_get/2
        , metadata_objects_documents_events_get/0
        , metadata_objects_documents_lock_get/0
        , metadata_objects_documents_properties_find_common_post/0
        , metadata_objects_documents_properties_get/0
        , metadata_objects_documents_templates_get/0
        , metadata_objects_documents_types_get/0
        , metadata_objects_documents_types_type_get/1
        , metadata_objects_documents_types_type_relationships_get/1
        , metadata_objects_documents_types_type_subtypes_subtype_classifications_classification_get/3
        , metadata_objects_documents_types_type_subtypes_subtype_get/2
        , metadata_objects_groups_get/0
        , metadata_objects_securitypolicies_get/0
        , metadata_objects_users_get/0
        , metadata_query_archived_documents_relationships_document_signature_sysr_get/0
        , metadata_query_documents_relationships_document_signature_sysr_get/0
        , metadata_vobjects_get/0
        , metadata_vobjects_object_name_actions_canceldeployment_post/1
        , metadata_vobjects_object_name_fields_object_field_name_get/2
        , metadata_vobjects_object_name_get/1
        , metadata_vobjects_object_name_page_layouts_get/1
        , metadata_vobjects_object_name_page_layouts_layout_name_get/2
        , notifications_histories_get/0
        , object_workflow_actions_action_get/1
        , object_workflow_actions_action_post/1
        , object_workflow_actions_canceltasks_post/0
        , object_workflow_actions_cancelworkflows_post/0
        , object_workflow_actions_get/0
        , object_workflow_actions_reassigntasks_post/0
        , object_workflow_actions_replaceworkflowowner_post/0
        , objects_binders_actions_export_job_id_results_get/1
        , objects_binders_binder_id_actions_export_post/1
        , objects_binders_binder_id_actions_post/1
        , objects_binders_binder_id_binding_rule_put/1
        , objects_binders_binder_id_delete/1
        , objects_binders_binder_id_documents_node_id_binding_rule_put/2
        , objects_binders_binder_id_documents_post/1
        , objects_binders_binder_id_documents_section_id_delete/2
        , objects_binders_binder_id_documents_section_id_put/2
        , objects_binders_binder_id_get/1
        , objects_binders_binder_id_post/1
        , objects_binders_binder_id_put/1
        , objects_binders_binder_id_roles_role_name_and_user_or_group_id_delete/3
        , objects_binders_binder_id_sections_node_id_binding_rule_put/2
        , objects_binders_binder_id_sections_node_id_put/2
        , objects_binders_binder_id_sections_post/1
        , objects_binders_binder_id_sections_section_id_delete/2
        , objects_binders_binder_id_sections_section_id_get/2
        , objects_binders_binder_id_versions_get/1
        , objects_binders_binder_id_versions_major_version_minor_version_actions_export_post/3
        , objects_binders_binder_id_versions_major_version_minor_version_delete/3
        , objects_binders_binder_id_versions_major_version_minor_version_get/3
        , objects_binders_binder_id_versions_major_version_minor_version_put/3
        , objects_binders_binder_id_versions_major_version_minor_version_relationships_post/3
        , objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_delete/4
        , objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_get/4
        , objects_binders_binder_id_versions_major_version_minor_version_sections_section_id_get/4
        , objects_binders_id_roles_get/1
        , objects_binders_id_roles_post/1
        , objects_binders_id_roles_role_name_get/2
        , objects_binders_id_versions_major_version_minor_version_lifecycle_actions_get/3
        , objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get/4
        , objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_put/4
        , objects_binders_lifecycle_actions_post/0
        , objects_binders_lifecycle_actions_user_action_name_put/1
        , objects_binders_post/0
        , objects_binders_templates_get/0
        , objects_binders_templates_post/0
        , objects_binders_templates_put/0
        , objects_binders_templates_template_name_bindernodes_get/1
        , objects_binders_templates_template_name_bindernodes_post/1
        , objects_binders_templates_template_name_bindernodes_put/1
        , objects_binders_templates_template_name_delete/1
        , objects_binders_templates_template_name_get/1
        , objects_deletions_documents_get/0
        , objects_deletions_vobjects_object_name_get/1
        , objects_documents_actions_get/0
        , objects_documents_actions_lifecycle_and_state_and_action_job_id_results_get/2
        , objects_documents_actions_workflow_name_get/1
        , objects_documents_actions_workflow_name_post/1
        , objects_documents_annotations_batch_delete/0
        , objects_documents_annotations_batch_post/4
        , objects_documents_annotations_batch_put/0
        , objects_documents_annotations_replies_batch_post/0
        , objects_documents_attachments_batch_delete/0
        , objects_documents_attachments_batch_post/0
        , objects_documents_attachments_batch_put/0
        , objects_documents_batch_actions_fileextract_job_id_results_get/1
        , objects_documents_batch_actions_fileextract_post/0
        , objects_documents_batch_actions_reclassify_put/0
        , objects_documents_batch_actions_rerender_post/0
        , objects_documents_batch_delete/0
        , objects_documents_batch_lock_delete/0
        , objects_documents_batch_post/0
        , objects_documents_batch_put/0
        , objects_documents_doc_id_anchors_get/1
        , objects_documents_doc_id_annotations_file_get/1
        , objects_documents_doc_id_annotations_file_post/1
        , objects_documents_doc_id_attachments_attachment_id_delete/2
        , objects_documents_doc_id_attachments_attachment_id_file_get/2
        , objects_documents_doc_id_attachments_attachment_id_get/2
        , objects_documents_doc_id_attachments_attachment_id_put/2
        , objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_delete/3
        , objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_file_get/3
        , objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_get/3
        , objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_post/3
        , objects_documents_doc_id_attachments_attachment_id_versions_get/2
        , objects_documents_doc_id_attachments_file_get/1
        , objects_documents_doc_id_attachments_get/1
        , objects_documents_doc_id_attachments_post/1
        , objects_documents_doc_id_audittrail_get/1
        , objects_documents_doc_id_delete/1
        , objects_documents_doc_id_events_get/1
        , objects_documents_doc_id_file_get/1
        , objects_documents_doc_id_get/1
        , objects_documents_doc_id_lock_delete/1
        , objects_documents_doc_id_lock_get/1
        , objects_documents_doc_id_lock_post/1
        , objects_documents_doc_id_major_version_minor_version_attachments_file_get/3
        , objects_documents_doc_id_post/1
        , objects_documents_doc_id_put/1
        , objects_documents_doc_id_renditions_get/1
        , objects_documents_doc_id_renditions_rendition_type_delete/2
        , objects_documents_doc_id_renditions_rendition_type_get/2
        , objects_documents_doc_id_renditions_rendition_type_post/2
        , objects_documents_doc_id_renditions_rendition_type_put/2
        , objects_documents_doc_id_roles_role_name_and_user_or_group_id_delete/3
        , objects_documents_doc_id_version_major_version_minor_version_attachments_get/3
        , objects_documents_doc_id_versions_get/1
        , objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_get/4
        , objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_replies_get/4
        , objects_documents_doc_id_versions_major_version_minor_version_annotations_file_get/3
        , objects_documents_doc_id_versions_major_version_minor_version_annotations_file_post/3
        , objects_documents_doc_id_versions_major_version_minor_version_annotations_get/3
        , objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_file_get/5
        , objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_get/5
        , objects_documents_doc_id_versions_major_version_minor_version_delete/3
        , objects_documents_doc_id_versions_major_version_minor_version_doc_export_annotations_to_csv_get/3
        , objects_documents_doc_id_versions_major_version_minor_version_events_post/3
        , objects_documents_doc_id_versions_major_version_minor_version_export_video_annotations_get/3
        , objects_documents_doc_id_versions_major_version_minor_version_file_get/3
        , objects_documents_doc_id_versions_major_version_minor_version_get/3
        , objects_documents_doc_id_versions_major_version_minor_version_put/3
        , objects_documents_doc_id_versions_major_version_minor_version_relationships_get/3
        , objects_documents_doc_id_versions_major_version_minor_version_relationships_post/3
        , objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_delete/4
        , objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_get/4
        , objects_documents_doc_id_versions_major_version_minor_version_renditions_get/3
        , objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_delete/4
        , objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_get/4
        , objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_post/4
        , objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_put/4
        , objects_documents_doc_id_versions_major_version_minor_version_thumbnail_get/3
        , objects_documents_get/0
        , objects_documents_id_roles_get/1
        , objects_documents_id_roles_post/1
        , objects_documents_id_roles_role_name_get/2
        , objects_documents_id_versions_major_version_minor_version_lifecycle_actions_get/3
        , objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get/4
        , objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_put/4
        , objects_documents_lifecycle_actions_post/0
        , objects_documents_lifecycle_actions_user_action_name_put/1
        , objects_documents_post/0
        , objects_documents_relationships_batch_delete/0
        , objects_documents_relationships_batch_post/0
        , objects_documents_renditions_batch_delete/0
        , objects_documents_renditions_batch_post/0
        , objects_documents_roles_batch_delete/0
        , objects_documents_roles_batch_post/0
        , objects_documents_templates_get/0
        , objects_documents_templates_post/0
        , objects_documents_templates_put/0
        , objects_documents_templates_template_name_delete/1
        , objects_documents_templates_template_name_file_get/1
        , objects_documents_templates_template_name_get/1
        , objects_documents_templates_template_name_put/1
        , objects_documents_tokens_post/0
        , objects_documents_versions_batch_actions_fileextract_post/0
        , objects_documents_versions_batch_delete/0
        , objects_documents_versions_batch_post/0
        , objects_domain_get/0
        , objects_domains_get/0
        , objects_edl_matched_documents_batch_actions_add_post/0
        , objects_edl_matched_documents_batch_actions_remove_post/0
        , objects_groups_auto_get/0
        , objects_groups_get/0
        , objects_groups_group_id_delete/1
        , objects_groups_group_id_get/1
        , objects_groups_group_id_put/1
        , objects_groups_post/0
        , objects_licenses_get/0
        , objects_objectworkflows_actions_get/0
        , objects_objectworkflows_actions_workflow_name_get/1
        , objects_objectworkflows_actions_workflow_name_post/1
        , objects_objectworkflows_get/0
        , objects_objectworkflows_tasks_get/0
        , objects_objectworkflows_tasks_task_id_actions_accept_post/1
        , objects_objectworkflows_tasks_task_id_actions_cancel_post/1
        , objects_objectworkflows_tasks_task_id_actions_complete_post/1
        , objects_objectworkflows_tasks_task_id_actions_get/1
        , objects_objectworkflows_tasks_task_id_actions_mdwaccept_post/1
        , objects_objectworkflows_tasks_task_id_actions_mdwcomplete_post/1
        , objects_objectworkflows_tasks_task_id_actions_mdwmanagecontent_post/1
        , objects_objectworkflows_tasks_task_id_actions_mdwreassign_post/1
        , objects_objectworkflows_tasks_task_id_actions_reassign_post/1
        , objects_objectworkflows_tasks_task_id_actions_task_action_get/2
        , objects_objectworkflows_tasks_task_id_actions_undoaccept_post/1
        , objects_objectworkflows_tasks_task_id_actions_updateduedate_post/1
        , objects_objectworkflows_tasks_task_id_get/1
        , objects_objectworkflows_workflow_id_actions_get/1
        , objects_objectworkflows_workflow_id_actions_workflow_action_get/2
        , objects_objectworkflows_workflow_id_actions_workflow_action_post/2
        , objects_objectworkflows_workflow_id_get/1
        , objects_picklists_get/0
        , objects_picklists_picklist_name_get/1
        , objects_picklists_picklist_name_picklist_value_name_delete/2
        , objects_picklists_picklist_name_picklist_value_name_put/2
        , objects_picklists_picklist_name_post/1
        , objects_picklists_picklist_name_put/1
        , objects_sandbox_actions_buildproduction_post/0
        , objects_sandbox_actions_promoteproduction_post/0
        , objects_sandbox_actions_recheckusage_post/0
        , objects_sandbox_batch_changesize_post/0
        , objects_sandbox_entitlements_set_post/0
        , objects_sandbox_get/0
        , objects_sandbox_name_delete/1
        , objects_sandbox_post/0
        , objects_sandbox_snapshot_api_name_actions_update_post/1
        , objects_sandbox_snapshot_api_name_actions_upgrade_post/1
        , objects_sandbox_snapshot_api_name_delete/1
        , objects_sandbox_snapshot_get/0
        , objects_sandbox_snapshot_post/0
        , objects_sandbox_vault_id_actions_refresh_post/1
        , objects_sandbox_vault_id_get/1
        , objects_securitypolicies_get/0
        , objects_securitypolicies_security_policy_name_get/1
        , objects_users_get/0
        , objects_users_id_get/1
        , objects_users_id_permissions_get/1
        , objects_users_id_put/1
        , objects_users_me_get/0
        , objects_users_me_password_post/0
        , objects_users_me_permissions_get/0
        , objects_users_me_put/0
        , objects_users_post/0
        , objects_users_put/0
        , objects_users_user_id_delete/1
        , objects_users_user_id_vault_membership_vault_id_put/2
        , objects_vault_actions_compare_post/0
        , objects_vault_actions_configreport_post/0
        , query_components_post/0
        , query_next_page_post/1
        , query_post/0
        , query_previous_page_post/1
        , scim_v2_me_get/0
        , scim_v2_me_put/0
        , scim_v2_resource_types_get/0
        , scim_v2_resource_types_type_get/1
        , scim_v2_schemas_get/0
        , scim_v2_schemas_id_get/1
        , scim_v2_service_provider_config_get/0
        , scim_v2_type_get/1
        , scim_v2_type_id_get/2
        , scim_v2_users_get/0
        , scim_v2_users_id_get/1
        , scim_v2_users_id_put/1
        , scim_v2_users_post/0
        , services_certificate_cert_id_get/1
        , services_configuration_mode_actions_disable_post/0
        , services_configuration_mode_actions_enable_post/0
        , services_directdata_files_get/0
        , services_directdata_files_name_get/1
        , services_file_staging_items_content_item_get/1
        , services_file_staging_items_item_delete/1
        , services_file_staging_items_item_get/1
        , services_file_staging_items_item_put/1
        , services_file_staging_items_post/0
        , services_file_staging_upload_get/0
        , services_file_staging_upload_post/0
        , services_file_staging_upload_upload_session_id_delete/1
        , services_file_staging_upload_upload_session_id_get/1
        , services_file_staging_upload_upload_session_id_parts_get/1
        , services_file_staging_upload_upload_session_id_post/1
        , services_file_staging_upload_upload_session_id_put/1
        , services_jobs_histories_get/0
        , services_jobs_job_id_errors_get/1
        , services_jobs_job_id_get/1
        , services_jobs_job_id_summary_get/1
        , services_jobs_job_id_tasks_get/1
        , services_jobs_monitors_get/0
        , services_jobs_start_now_job_id_post/1
        , services_loader_extract_post/0
        , services_loader_job_id_tasks_task_id_failurelog_get/2
        , services_loader_job_id_tasks_task_id_results_get/2
        , services_loader_job_id_tasks_task_id_results_renditions_get/2
        , services_loader_job_id_tasks_task_id_successlog_get/2
        , services_loader_load_post/0
        , services_package_actions_validate_post/0
        , services_package_post/0
        , services_package_put/0
        , services_queues_get/0
        , services_queues_queue_name_actions_disable_delivery_put/1
        , services_queues_queue_name_actions_enable_delivery_put/1
        , services_queues_queue_name_actions_reset_put/1
        , services_queues_queue_name_get/1
        , services_vobject_vault_package_v_package_id_actions_validate_post/1
        , session_delete/0
        , uicode_distributions_distribution_name_code_get/1
        , uicode_distributions_distribution_name_delete/1
        , uicode_distributions_distribution_name_get/1
        , uicode_distributions_get/0
        , uicode_distributions_post/0
        , vobject_vault_package_v_package_id_actions_deploy_post/1
        , vobject_vault_package_v_package_id_actions_deploy_results_get/1
        , vobjects_cascadedelete_results_object_name_job_status_job_id_get/3
        , vobjects_deepcopy_results_object_name_job_status_job_id_get/3
        , vobjects_edl_item_v_actions_createplaceholder_post/0
        , vobjects_merges_job_id_log_get/1
        , vobjects_merges_job_id_results_get/1
        , vobjects_merges_job_id_status_get/1
        , vobjects_object_name_actions_action_name_post/2
        , vobjects_object_name_actions_changetype_post/1
        , vobjects_object_name_actions_merge_post/2
        , vobjects_object_name_actions_recalculaterollups_get/1
        , vobjects_object_name_actions_recalculaterollups_post/1
        , vobjects_object_name_actions_updatecorporatecurrency_put/1
        , vobjects_object_name_attachments_batch_delete/1
        , vobjects_object_name_attachments_batch_post/1
        , vobjects_object_name_attachments_batch_put/1
        , vobjects_object_name_delete/1
        , vobjects_object_name_id_roles_role_name_get/3
        , vobjects_object_name_object_record_id_actions_action_name_get/3
        , vobjects_object_name_object_record_id_actions_action_name_post/3
        , vobjects_object_name_object_record_id_actions_cascadedelete_post/2
        , vobjects_object_name_object_record_id_actions_deepcopy_post/2
        , vobjects_object_name_object_record_id_actions_get/2
        , vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_get/3
        , vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_post/3
        , vobjects_object_name_object_record_id_attachment_fields_file_get/2
        , vobjects_object_name_object_record_id_attachments_attachment_id_delete/3
        , vobjects_object_name_object_record_id_attachments_attachment_id_get/3
        , vobjects_object_name_object_record_id_attachments_attachment_id_put/3
        , vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_delete/4
        , vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_file_get/4
        , vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_get/4
        , vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_post/4
        , vobjects_object_name_object_record_id_attachments_attachment_id_versions_get/3
        , vobjects_object_name_object_record_id_attachments_file_get/2
        , vobjects_object_name_object_record_id_attachments_get/2
        , vobjects_object_name_object_record_id_attachments_post/2
        , vobjects_object_name_object_record_id_audittrail_get/2
        , vobjects_object_name_object_record_id_get/2
        , vobjects_object_name_post/1
        , vobjects_object_name_put/1
        , vobjects_object_name_roles_delete/1
        , vobjects_object_name_roles_post/1
        , vobjects_outbound_package_v_package_id_dependencies_get/1
        ]).

-define(BASE_URL, "/api/v25.1").

%% @doc Retrieve API Versions
%% 
-spec api_get() ->
  openapi_utils:response().
api_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/api/"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Content File
%% 
-spec api_mdl_components_component_type_and_record_name_files_get(binary()) ->
  openapi_utils:response().
api_mdl_components_component_type_and_record_name_files_get(ComponentTypeAndRecordName) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/api/mdl/components/", ComponentTypeAndRecordName, "/files"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Component Record (MDL)
%% 
-spec api_mdl_components_component_type_and_record_name_get(binary()) ->
  openapi_utils:response().
api_mdl_components_component_type_and_record_name_get(ComponentTypeAndRecordName) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/api/mdl/components/", ComponentTypeAndRecordName, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Asynchronous MDL Script Results
%% 
-spec api_mdl_execute_async_job_id_results_get(binary()) ->
  openapi_utils:response().
api_mdl_execute_async_job_id_results_get(JobId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/api/mdl/execute_async/", JobId, "/results"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Execute MDL Script Asynchronously
%% 
-spec api_mdl_execute_async_post() ->
  openapi_utils:response().
api_mdl_execute_async_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/api/mdl/execute_async"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Execute MDL Script
%% 
-spec api_mdl_execute_post() ->
  openapi_utils:response().
api_mdl_execute_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/api/mdl/execute"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Upload Content File
%% 
-spec api_mdl_files_post() ->
  openapi_utils:response().
api_mdl_files_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/api/mdl/files"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Audit Details
%% 
-spec audittrail_audit_trail_type_get(binary()) ->
  openapi_utils:response().
audittrail_audit_trail_type_get(AuditTrailType) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/audittrail/", AuditTrailType, ""],
  QueryString = [<<"start_date=">>, StartDate, <<"&">>, <<"end_date=">>, EndDate, <<"&">>, <<"all_dates=">>, AllDates, <<"&">>, <<"format_result=">>, FormatResult, <<"&">>, <<"limit=">>, Limit, <<"&">>, <<"offset=">>, Offset, <<"&">>, <<"objects=">>, Objects, <<"&">>, <<"events=">>, Events, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Authentication Type Discovery
%% 
-spec auth_discovery_post() ->
  openapi_utils:response().
auth_discovery_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/auth/discovery"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc OAuth 2.0 / OpenID Connect
%% 
-spec auth_oauth_session_oath_oidc_profile_id_post(binary()) ->
  openapi_utils:response().
auth_oauth_session_oath_oidc_profile_id_post(OathOidcProfileId) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/auth/oauth/session/", OathOidcProfileId, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc User Name and Password
%% 
-spec auth_post() ->
  openapi_utils:response().
auth_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/auth"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Delete Single Source Code File
%% 
-spec code_class_name_delete(binary()) ->
  openapi_utils:response().
code_class_name_delete(ClassName) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/code/", ClassName, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Disable Vault Extension
%% 
-spec code_class_name_disable_put(binary()) ->
  openapi_utils:response().
code_class_name_disable_put(ClassName) ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/code/", ClassName, "/disable"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Enable Vault Extension
%% 
-spec code_class_name_enable_put(binary()) ->
  openapi_utils:response().
code_class_name_enable_put(ClassName) ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/code/", ClassName, "/enable"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Single Source Code File
%% 
-spec code_class_name_get(binary()) ->
  openapi_utils:response().
code_class_name_get(ClassName) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/code/", ClassName, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve All Profiling Sessions
%% 
-spec code_profiler_get() ->
  openapi_utils:response().
code_profiler_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/code/profiler"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Create Profiling Session
%% 
-spec code_profiler_post() ->
  openapi_utils:response().
code_profiler_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/code/profiler"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc End Profiling Session
%% 
-spec code_profiler_session_name_actions_end_post(binary()) ->
  openapi_utils:response().
code_profiler_session_name_actions_end_post(SessionName) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/code/profiler/", SessionName, "/actions/end"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Delete Profiling Session
%% 
-spec code_profiler_session_name_delete(binary()) ->
  openapi_utils:response().
code_profiler_session_name_delete(SessionName) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/code/profiler/", SessionName, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Profiling Session
%% 
-spec code_profiler_session_name_get(binary()) ->
  openapi_utils:response().
code_profiler_session_name_get(SessionName) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/code/profiler/", SessionName, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Download Profiling Session Results
%% 
-spec code_profiler_session_name_results_get(binary()) ->
  openapi_utils:response().
code_profiler_session_name_results_get(SessionName) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/code/profiler/", SessionName, "/results"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Add or Replace Single Source Code File
%% 
-spec code_put() ->
  openapi_utils:response().
code_put() ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/code"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Specific Root Nodes
%% 
-spec composites_trees_edl_hierarchy_or_template_actions_listnodes_post(binary()) ->
  openapi_utils:response().
composites_trees_edl_hierarchy_or_template_actions_listnodes_post(EdlHierarchyOrTemplate) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/composites/trees/", EdlHierarchyOrTemplate, "/actions/listnodes"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve All Root Nodes
%% 
-spec composites_trees_edl_hierarchy_or_template_get(binary()) ->
  openapi_utils:response().
composites_trees_edl_hierarchy_or_template_get(EdlHierarchyOrTemplate) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/composites/trees/", EdlHierarchyOrTemplate, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve a Node's Children
%% 
-spec composites_trees_edl_hierarchy_v_parent_node_id_children_get(binary()) ->
  openapi_utils:response().
composites_trees_edl_hierarchy_v_parent_node_id_children_get(ParentNodeId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/composites/trees/edl_hierarchy__v/", ParentNodeId, "/children"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Update Node Order
%% 
-spec composites_trees_edl_hierarchy_v_parent_node_id_children_put(binary()) ->
  openapi_utils:response().
composites_trees_edl_hierarchy_v_parent_node_id_children_put(ParentNodeId) ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/composites/trees/edl_hierarchy__v/", ParentNodeId, "/children"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Component Record (XML/JSON)
%% 
-spec configuration_component_type_and_record_name_get(binary()) ->
  openapi_utils:response().
configuration_component_type_and_record_name_get(ComponentTypeAndRecordName) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/configuration/", ComponentTypeAndRecordName, ""],
  QueryString = [<<"loc=">>, Loc, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Retrieve Component Record Collection
%% 
-spec configuration_component_type_get(binary()) ->
  openapi_utils:response().
configuration_component_type_get(ComponentType) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/configuration/", ComponentType, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Details from a Specific Object
%% 
-spec configuration_object_name_and_object_type_get(binary()) ->
  openapi_utils:response().
configuration_object_name_and_object_type_get(ObjectNameAndObjectType) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/configuration/", ObjectNameAndObjectType, ""],
  QueryString = [<<"loc=">>, Loc, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Retrieve Details from All Object Types
%% 
-spec configuration_objecttype_get() ->
  openapi_utils:response().
configuration_objecttype_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/configuration/Objecttype"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Delete Lifecycle Role Assignment Override Rules
%% 
-spec configuration_role_assignment_rule_delete() ->
  openapi_utils:response().
configuration_role_assignment_rule_delete() ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/configuration/role_assignment_rule"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Lifecycle Role Assignment Rules (Default & Override)
%% 
-spec configuration_role_assignment_rule_get() ->
  openapi_utils:response().
configuration_role_assignment_rule_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/configuration/role_assignment_rule"],
  QueryString = [<<"lifecycle__v=">>, LifecycleV, <<"&">>, <<"role__v=">>, RoleV, <<"&">>, <<"product__v=">>, ProductV, <<"&">>, <<"country__v=">>, CountryV, <<"&">>, <<"study__v=">>, StudyV, <<"&">>, <<"study_country__v=">>, StudyCountryV, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Create Lifecycle Role Assignment Override Rules
%% 
-spec configuration_role_assignment_rule_post() ->
  openapi_utils:response().
configuration_role_assignment_rule_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/configuration/role_assignment_rule"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Update Lifecycle Role Assignment Rules (Default & Override)
%% 
-spec configuration_role_assignment_rule_put() ->
  openapi_utils:response().
configuration_role_assignment_rule_put() ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/configuration/role_assignment_rule"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Initiate Delegated Session
%% 
-spec delegation_login_post() ->
  openapi_utils:response().
delegation_login_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/delegation/login"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Delegations
%% 
-spec delegation_vaults_get() ->
  openapi_utils:response().
delegation_vaults_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/delegation/vaults"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Session Keep Alive
%% 
-spec keep_alive_post() ->
  openapi_utils:response().
keep_alive_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/keep-alive"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Limits on Objects
%% 
-spec limits_get() ->
  openapi_utils:response().
limits_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/limits"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Download Daily API Usage
%% 
-spec logs_api_usage_get() ->
  openapi_utils:response().
logs_api_usage_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/logs/api_usage"],
  QueryString = [<<"date=">>, Date, <<"&">>, <<"log_format=">>, LogFormat, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Retrieve All Debug Logs
%% 
-spec logs_code_debug_get() ->
  openapi_utils:response().
logs_code_debug_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/logs/code/debug"],
  QueryString = [<<"user_id=">>, UserId, <<"&">>, <<"include_inactive=">>, IncludeInactive, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Delete Debug Log
%% 
-spec logs_code_debug_id_actions_reset_delete(binary()) ->
  openapi_utils:response().
logs_code_debug_id_actions_reset_delete(Id) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/logs/code/debug/", Id, "/actions/reset"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Reset Debug Log
%% 
-spec logs_code_debug_id_actions_reset_post(binary()) ->
  openapi_utils:response().
logs_code_debug_id_actions_reset_post(Id) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/logs/code/debug/", Id, "/actions/reset"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Download Debug Log Files
%% 
-spec logs_code_debug_id_files_get(binary()) ->
  openapi_utils:response().
logs_code_debug_id_files_get(Id) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/logs/code/debug/", Id, "/files"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Single Debug Log
%% 
-spec logs_code_debug_id_get(binary()) ->
  openapi_utils:response().
logs_code_debug_id_get(Id) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/logs/code/debug/", Id, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Create Debug Log
%% 
-spec logs_code_debug_post() ->
  openapi_utils:response().
logs_code_debug_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/logs/code/debug"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Download SDK Runtime Log
%% 
-spec logs_code_runtime_get() ->
  openapi_utils:response().
logs_code_runtime_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/logs/code/runtime"],
  QueryString = [<<"date=">>, Date, <<"&">>, <<"log_format=">>, LogFormat, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Import Bulk Translation File
%% 
-spec messages_message_type_actions_import_post(binary()) ->
  openapi_utils:response().
messages_message_type_actions_import_post(MessageType) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/messages/", MessageType, "/actions/import"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Export Bulk Translation File
%% 
-spec messages_message_type_language_lang_actions_export_post(binary(), binary()) ->
  openapi_utils:response().
messages_message_type_language_lang_actions_export_post(MessageType, Lang) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/messages/", MessageType, "/language/", Lang, "/actions/export"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Audit Metadata
%% 
-spec metadata_audittrail_audit_trail_type_get(binary()) ->
  openapi_utils:response().
metadata_audittrail_audit_trail_type_get(AuditTrailType) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/metadata/audittrail/", AuditTrailType, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Audit Types
%% 
-spec metadata_audittrail_get() ->
  openapi_utils:response().
metadata_audittrail_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/metadata/audittrail"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Component Type Metadata
%% 
-spec metadata_components_component_type_get(binary()) ->
  openapi_utils:response().
metadata_components_component_type_get(ComponentType) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/metadata/components/", ComponentType, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve All Component Metadata
%% 
-spec metadata_components_get() ->
  openapi_utils:response().
metadata_components_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/metadata/components"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Binder Template Node Metadata
%% 
-spec metadata_objects_binders_templates_bindernodes_get() ->
  openapi_utils:response().
metadata_objects_binders_templates_bindernodes_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/metadata/objects/binders/templates/bindernodes"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Binder Template Metadata
%% 
-spec metadata_objects_binders_templates_get() ->
  openapi_utils:response().
metadata_objects_binders_templates_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/metadata/objects/binders/templates"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Annotation Placemark Type Metadata
%% 
-spec metadata_objects_documents_annotations_placemarks_types_placemark_type_get(binary()) ->
  openapi_utils:response().
metadata_objects_documents_annotations_placemarks_types_placemark_type_get(PlacemarkType) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/metadata/objects/documents/annotations/placemarks/types/", PlacemarkType, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Annotation Reference Type Metadata
%% 
-spec metadata_objects_documents_annotations_references_types_reference_type_get(binary()) ->
  openapi_utils:response().
metadata_objects_documents_annotations_references_types_reference_type_get(ReferenceType) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/metadata/objects/documents/annotations/references/types/", ReferenceType, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Annotation Type Metadata
%% 
-spec metadata_objects_documents_annotations_types_annotation_type_get(binary()) ->
  openapi_utils:response().
metadata_objects_documents_annotations_types_annotation_type_get(AnnotationType) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/metadata/objects/documents/annotations/types/", AnnotationType, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Document Event SubType Metadata
%% 
-spec metadata_objects_documents_events_event_type_types_event_subtype_get(binary(), binary()) ->
  openapi_utils:response().
metadata_objects_documents_events_event_type_types_event_subtype_get(EventType, EventSubtype) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/metadata/objects/documents/events/", EventType, "/types/", EventSubtype, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Document Event Types and Subtypes
%% 
-spec metadata_objects_documents_events_get() ->
  openapi_utils:response().
metadata_objects_documents_events_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/metadata/objects/documents/events"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Document Lock Metadata
%% 
-spec metadata_objects_documents_lock_get() ->
  openapi_utils:response().
metadata_objects_documents_lock_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/metadata/objects/documents/lock"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Common Document Fields
%% 
-spec metadata_objects_documents_properties_find_common_post() ->
  openapi_utils:response().
metadata_objects_documents_properties_find_common_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/metadata/objects/documents/properties/find_common"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve All Document Fields
%% 
-spec metadata_objects_documents_properties_get() ->
  openapi_utils:response().
metadata_objects_documents_properties_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/metadata/objects/documents/properties"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Document Template Metadata
%% 
-spec metadata_objects_documents_templates_get() ->
  openapi_utils:response().
metadata_objects_documents_templates_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/metadata/objects/documents/templates"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve All Document Types
%% 
-spec metadata_objects_documents_types_get() ->
  openapi_utils:response().
metadata_objects_documents_types_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/metadata/objects/documents/types"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Document Type
%% 
-spec metadata_objects_documents_types_type_get(binary()) ->
  openapi_utils:response().
metadata_objects_documents_types_type_get(Type) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/metadata/objects/documents/types/", Type, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Document Type Relationships
%% 
-spec metadata_objects_documents_types_type_relationships_get(binary()) ->
  openapi_utils:response().
metadata_objects_documents_types_type_relationships_get(Type) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/metadata/objects/documents/types/", Type, "/relationships"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Document Classification
%% 
-spec metadata_objects_documents_types_type_subtypes_subtype_classifications_classification_get(binary(), binary(), binary()) ->
  openapi_utils:response().
metadata_objects_documents_types_type_subtypes_subtype_classifications_classification_get(Type, Subtype, Classification) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/metadata/objects/documents/types/", Type, "/subtypes/", Subtype, "/classifications/", Classification, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Document Subtype
%% 
-spec metadata_objects_documents_types_type_subtypes_subtype_get(binary(), binary()) ->
  openapi_utils:response().
metadata_objects_documents_types_type_subtypes_subtype_get(Type, Subtype) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/metadata/objects/documents/types/", Type, "/subtypes/", Subtype, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Group Metadata
%% 
-spec metadata_objects_groups_get() ->
  openapi_utils:response().
metadata_objects_groups_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/metadata/objects/groups"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Security Policy Metadata
%% 
-spec metadata_objects_securitypolicies_get() ->
  openapi_utils:response().
metadata_objects_securitypolicies_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/metadata/objects/securitypolicies"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve User Metadata
%% 
-spec metadata_objects_users_get() ->
  openapi_utils:response().
metadata_objects_users_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/metadata/objects/users"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Archived Document Signature Metadata
%% 
-spec metadata_query_archived_documents_relationships_document_signature_sysr_get() ->
  openapi_utils:response().
metadata_query_archived_documents_relationships_document_signature_sysr_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/metadata/query/archived_documents/relationships/document_signature__sysr"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Document Signature Metadata
%% 
-spec metadata_query_documents_relationships_document_signature_sysr_get() ->
  openapi_utils:response().
metadata_query_documents_relationships_document_signature_sysr_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/metadata/query/documents/relationships/document_signature__sysr"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Object Collection
%% 
-spec metadata_vobjects_get() ->
  openapi_utils:response().
metadata_vobjects_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/metadata/vobjects"],
  QueryString = [<<"loc=">>, Loc, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Cancel Raw Object Deployment
%% 
-spec metadata_vobjects_object_name_actions_canceldeployment_post(binary()) ->
  openapi_utils:response().
metadata_vobjects_object_name_actions_canceldeployment_post(ObjectName) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/metadata/vobjects/", ObjectName, "/actions/canceldeployment"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Object Field Metadata
%% 
-spec metadata_vobjects_object_name_fields_object_field_name_get(binary(), binary()) ->
  openapi_utils:response().
metadata_vobjects_object_name_fields_object_field_name_get(ObjectName, ObjectFieldName) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/metadata/vobjects/", ObjectName, "/fields/", ObjectFieldName, ""],
  QueryString = [<<"loc=">>, Loc, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Retrieve Object Metadata
%% 
-spec metadata_vobjects_object_name_get(binary()) ->
  openapi_utils:response().
metadata_vobjects_object_name_get(ObjectName) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/metadata/vobjects/", ObjectName, ""],
  QueryString = [<<"loc=">>, Loc, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Retrieve Page Layouts
%% 
-spec metadata_vobjects_object_name_page_layouts_get(binary()) ->
  openapi_utils:response().
metadata_vobjects_object_name_page_layouts_get(ObjectName) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/metadata/vobjects/", ObjectName, "/page_layouts"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Page Layout Metadata
%% 
-spec metadata_vobjects_object_name_page_layouts_layout_name_get(binary(), binary()) ->
  openapi_utils:response().
metadata_vobjects_object_name_page_layouts_layout_name_get(ObjectName, LayoutName) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/metadata/vobjects/", ObjectName, "/page_layouts/", LayoutName, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Email Notification Histories
%% 
-spec notifications_histories_get() ->
  openapi_utils:response().
notifications_histories_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/notifications/histories"],
  QueryString = [<<"start_date=">>, StartDate, <<"&">>, <<"end_date=">>, EndDate, <<"&">>, <<"all_dates=">>, AllDates, <<"&">>, <<"format_result=">>, FormatResult, <<"&">>, <<"limit=">>, Limit, <<"&">>, <<"offset=">>, Offset, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Retrieve Bulk Workflow Action Details
%% 
-spec object_workflow_actions_action_get(binary()) ->
  openapi_utils:response().
object_workflow_actions_action_get(Action) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/object/workflow/actions/", Action, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Initiate Workflow Actions on Multiple Workflows
%% 
-spec object_workflow_actions_action_post(binary()) ->
  openapi_utils:response().
object_workflow_actions_action_post(Action) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/object/workflow/actions/", Action, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Cancel Workflow Tasks
%% 
-spec object_workflow_actions_canceltasks_post() ->
  openapi_utils:response().
object_workflow_actions_canceltasks_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/object/workflow/actions/canceltasks"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Cancel Workflows
%% 
-spec object_workflow_actions_cancelworkflows_post() ->
  openapi_utils:response().
object_workflow_actions_cancelworkflows_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/object/workflow/actions/cancelworkflows"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Bulk Workflow Actions
%% 
-spec object_workflow_actions_get() ->
  openapi_utils:response().
object_workflow_actions_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/object/workflow/actions"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Reassign Workflow Tasks
%% 
-spec object_workflow_actions_reassigntasks_post() ->
  openapi_utils:response().
object_workflow_actions_reassigntasks_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/object/workflow/actions/reassigntasks"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Replace Workflow Owner
%% 
-spec object_workflow_actions_replaceworkflowowner_post() ->
  openapi_utils:response().
object_workflow_actions_replaceworkflowowner_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/object/workflow/actions/replaceworkflowowner"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Binder Export Results
%% 
-spec objects_binders_actions_export_job_id_results_get(binary()) ->
  openapi_utils:response().
objects_binders_actions_export_job_id_results_get(JobId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/actions/export/", JobId, "/results"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Export Binder (Latest Version)
%% 
-spec objects_binders_binder_id_actions_export_post(binary()) ->
  openapi_utils:response().
objects_binders_binder_id_actions_export_post(BinderId) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/", BinderId, "/actions/export"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"source=">>, Source, <<"&">>, <<"renditiontype=">>, Renditiontype, <<"&">>, <<"docversion=">>, Docversion, <<"&">>, <<"attachments=">>, Attachments, <<"&">>, <<"export=">>, Export, <<"&">>, <<"docfield=">>, Docfield, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc Refresh Binder Auto-Filing
%% 
-spec objects_binders_binder_id_actions_post(binary()) ->
  openapi_utils:response().
objects_binders_binder_id_actions_post(BinderId) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/", BinderId, "/actions"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Update Binding Rule
%% 
-spec objects_binders_binder_id_binding_rule_put(binary()) ->
  openapi_utils:response().
objects_binders_binder_id_binding_rule_put(BinderId) ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/", BinderId, "/binding_rule"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Delete Binder
%% 
-spec objects_binders_binder_id_delete(binary()) ->
  openapi_utils:response().
objects_binders_binder_id_delete(BinderId) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/", BinderId, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Update Binder Document Binding Rule
%% 
-spec objects_binders_binder_id_documents_node_id_binding_rule_put(binary(), binary()) ->
  openapi_utils:response().
objects_binders_binder_id_documents_node_id_binding_rule_put(BinderId, NodeId) ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/", BinderId, "/documents/", NodeId, "/binding_rule"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Add Document to Binder
%% 
-spec objects_binders_binder_id_documents_post(binary()) ->
  openapi_utils:response().
objects_binders_binder_id_documents_post(BinderId) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/", BinderId, "/documents"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Remove Document from Binder
%% 
-spec objects_binders_binder_id_documents_section_id_delete(binary(), binary()) ->
  openapi_utils:response().
objects_binders_binder_id_documents_section_id_delete(BinderId, SectionId) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/", BinderId, "/documents/", SectionId, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Move Document in Binder
%% 
-spec objects_binders_binder_id_documents_section_id_put(binary(), binary()) ->
  openapi_utils:response().
objects_binders_binder_id_documents_section_id_put(BinderId, SectionId) ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/", BinderId, "/documents/", SectionId, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Binder
%% 
-spec objects_binders_binder_id_get(binary()) ->
  openapi_utils:response().
objects_binders_binder_id_get(BinderId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/", BinderId, ""],
  QueryString = [<<"depth=">>, Depth, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Create Binder Version
%% 
-spec objects_binders_binder_id_post(binary()) ->
  openapi_utils:response().
objects_binders_binder_id_post(BinderId) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/", BinderId, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Update Binder
%% 
-spec objects_binders_binder_id_put(binary()) ->
  openapi_utils:response().
objects_binders_binder_id_put(BinderId) ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/", BinderId, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Remove Users & Groups from Roles on a Single Binder
%% 
-spec objects_binders_binder_id_roles_role_name_and_user_or_group_id_delete(binary(), binary(), binary()) ->
  openapi_utils:response().
objects_binders_binder_id_roles_role_name_and_user_or_group_id_delete(BinderId, RoleNameAndUserOrGroup, Id) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/", BinderId, "/roles/", RoleNameAndUserOrGroup, "/", Id, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Update Binder Section Binding Rule
%% 
-spec objects_binders_binder_id_sections_node_id_binding_rule_put(binary(), binary()) ->
  openapi_utils:response().
objects_binders_binder_id_sections_node_id_binding_rule_put(BinderId, NodeId) ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/", BinderId, "/sections/", NodeId, "/binding_rule"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Update Binder Section
%% 
-spec objects_binders_binder_id_sections_node_id_put(binary(), binary()) ->
  openapi_utils:response().
objects_binders_binder_id_sections_node_id_put(BinderId, NodeId) ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/", BinderId, "/sections/", NodeId, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Create Binder Section
%% 
-spec objects_binders_binder_id_sections_post(binary()) ->
  openapi_utils:response().
objects_binders_binder_id_sections_post(BinderId) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/", BinderId, "/sections"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Delete Binder Section
%% 
-spec objects_binders_binder_id_sections_section_id_delete(binary(), binary()) ->
  openapi_utils:response().
objects_binders_binder_id_sections_section_id_delete(BinderId, SectionId) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/", BinderId, "/sections/", SectionId, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Binder Sections
%% 
-spec objects_binders_binder_id_sections_section_id_get(binary(), binary()) ->
  openapi_utils:response().
objects_binders_binder_id_sections_section_id_get(BinderId, SectionId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/", BinderId, "/sections/", SectionId, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve All Binder Versions
%% 
-spec objects_binders_binder_id_versions_get(binary()) ->
  openapi_utils:response().
objects_binders_binder_id_versions_get(BinderId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/", BinderId, "/versions"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Export Binder (Specific Version)
%% 
-spec objects_binders_binder_id_versions_major_version_minor_version_actions_export_post(binary(), binary(), binary()) ->
  openapi_utils:response().
objects_binders_binder_id_versions_major_version_minor_version_actions_export_post(BinderId, MajorVersion, MinorVersion) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/", BinderId, "/versions/", MajorVersion, "/", MinorVersion, "/actions/export"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"source=">>, Source, <<"&">>, <<"renditiontype=">>, Renditiontype, <<"&">>, <<"docversion=">>, Docversion, <<"&">>, <<"attachments=">>, Attachments, <<"&">>, <<"export=">>, Export, <<"&">>, <<"docfield=">>, Docfield, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc Delete Binder Version
%% 
-spec objects_binders_binder_id_versions_major_version_minor_version_delete(binary(), binary(), binary()) ->
  openapi_utils:response().
objects_binders_binder_id_versions_major_version_minor_version_delete(BinderId, MajorVersion, MinorVersion) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/", BinderId, "/versions/", MajorVersion, "/", MinorVersion, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Binder Version
%% 
-spec objects_binders_binder_id_versions_major_version_minor_version_get(binary(), binary(), binary()) ->
  openapi_utils:response().
objects_binders_binder_id_versions_major_version_minor_version_get(BinderId, MajorVersion, MinorVersion) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/", BinderId, "/versions/", MajorVersion, "/", MinorVersion, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Update Binder Version
%% 
-spec objects_binders_binder_id_versions_major_version_minor_version_put(binary(), binary(), binary()) ->
  openapi_utils:response().
objects_binders_binder_id_versions_major_version_minor_version_put(BinderId, MajorVersion, MinorVersion) ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/", BinderId, "/versions/", MajorVersion, "/", MinorVersion, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Create Binder Relationship
%% 
-spec objects_binders_binder_id_versions_major_version_minor_version_relationships_post(binary(), binary(), binary()) ->
  openapi_utils:response().
objects_binders_binder_id_versions_major_version_minor_version_relationships_post(BinderId, MajorVersion, MinorVersion) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/", BinderId, "/versions/", MajorVersion, "/", MinorVersion, "/relationships"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Delete Binder Relationship
%% 
-spec objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_delete(binary(), binary(), binary(), binary()) ->
  openapi_utils:response().
objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_delete(BinderId, MajorVersion, MinorVersion, RelationshipId) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/", BinderId, "/versions/", MajorVersion, "/", MinorVersion, "/relationships/", RelationshipId, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Binder Relationship
%% 
-spec objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_get(binary(), binary(), binary(), binary()) ->
  openapi_utils:response().
objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_get(BinderId, MajorVersion, MinorVersion, RelationshipId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/", BinderId, "/versions/", MajorVersion, "/", MinorVersion, "/relationships/", RelationshipId, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Binder Version Section
%% 
-spec objects_binders_binder_id_versions_major_version_minor_version_sections_section_id_get(binary(), binary(), binary(), binary()) ->
  openapi_utils:response().
objects_binders_binder_id_versions_major_version_minor_version_sections_section_id_get(BinderId, MajorVersion, MinorVersion, SectionId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/", BinderId, "/versions/", MajorVersion, "/", MinorVersion, "/sections/", SectionId, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve All Binder Roles
%% 
-spec objects_binders_id_roles_get(binary()) ->
  openapi_utils:response().
objects_binders_id_roles_get(Id) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/", Id, "/roles"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Assign Users & Groups to Roles on a Single Binder
%% 
-spec objects_binders_id_roles_post(binary()) ->
  openapi_utils:response().
objects_binders_id_roles_post(Id) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/", Id, "/roles"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Document Role
%% 
-spec objects_binders_id_roles_role_name_get(binary(), binary()) ->
  openapi_utils:response().
objects_binders_id_roles_role_name_get(Id, RoleName) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/", Id, "/roles/", RoleName, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Binder User Actions
%% 
-spec objects_binders_id_versions_major_version_minor_version_lifecycle_actions_get(binary(), binary(), binary()) ->
  openapi_utils:response().
objects_binders_id_versions_major_version_minor_version_lifecycle_actions_get(Id, MajorVersion, MinorVersion) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/", Id, "/versions/", MajorVersion, "/", MinorVersion, "/lifecycle_actions"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Binder Entry Criteria
%% 
-spec objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get(binary(), binary(), binary(), binary()) ->
  openapi_utils:response().
objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get(Id, MajorVersion, MinorVersion, NameV) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/", Id, "/versions/", MajorVersion, "/", MinorVersion, "/lifecycle_actions/", NameV, "/entry_requirements"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Initiate Binder User Action
%% 
-spec objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_put(binary(), binary(), binary(), binary()) ->
  openapi_utils:response().
objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_put(Id, MajorVersion, MinorVersion, NameV) ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/", Id, "/versions/", MajorVersion, "/", MinorVersion, "/lifecycle_actions/", NameV, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve User Actions on Multiple Binders
%% 
-spec objects_binders_lifecycle_actions_post() ->
  openapi_utils:response().
objects_binders_lifecycle_actions_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/lifecycle_actions"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Initiate Bulk Binder User Actions
%% 
-spec objects_binders_lifecycle_actions_user_action_name_put(binary()) ->
  openapi_utils:response().
objects_binders_lifecycle_actions_user_action_name_put(UserActionName) ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/lifecycle_actions/", UserActionName, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Create Binder
%% 
-spec objects_binders_post() ->
  openapi_utils:response().
objects_binders_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"async=">>, Async, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc Retrieve Binder Template Collection
%% 
-spec objects_binders_templates_get() ->
  openapi_utils:response().
objects_binders_templates_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/templates"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Create Binder Template
%% 
-spec objects_binders_templates_post() ->
  openapi_utils:response().
objects_binders_templates_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/templates"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Update Binder Template
%% 
-spec objects_binders_templates_put() ->
  openapi_utils:response().
objects_binders_templates_put() ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/templates"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Binder Template Node Attributes
%% 
-spec objects_binders_templates_template_name_bindernodes_get(binary()) ->
  openapi_utils:response().
objects_binders_templates_template_name_bindernodes_get(TemplateName) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/templates/", TemplateName, "/bindernodes"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Create Binder Template Node
%% 
-spec objects_binders_templates_template_name_bindernodes_post(binary()) ->
  openapi_utils:response().
objects_binders_templates_template_name_bindernodes_post(TemplateName) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/templates/", TemplateName, "/bindernodes"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Replace Binder Template Nodes
%% 
-spec objects_binders_templates_template_name_bindernodes_put(binary()) ->
  openapi_utils:response().
objects_binders_templates_template_name_bindernodes_put(TemplateName) ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/templates/", TemplateName, "/bindernodes"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Delete Binder Template
%% 
-spec objects_binders_templates_template_name_delete(binary()) ->
  openapi_utils:response().
objects_binders_templates_template_name_delete(TemplateName) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/templates/", TemplateName, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Binder Template Attributes
%% 
-spec objects_binders_templates_template_name_get(binary()) ->
  openapi_utils:response().
objects_binders_templates_template_name_get(TemplateName) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/binders/templates/", TemplateName, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Deleted Document IDs
%% 
-spec objects_deletions_documents_get() ->
  openapi_utils:response().
objects_deletions_documents_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/deletions/documents"],
  QueryString = [<<"start_date=">>, StartDate, <<"&">>, <<"end_date=">>, EndDate, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Retrieve Deleted Object Record ID
%% 
-spec objects_deletions_vobjects_object_name_get(binary()) ->
  openapi_utils:response().
objects_deletions_vobjects_object_name_get(ObjectName) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/deletions/vobjects/", ObjectName, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve All Document Workflows
%% 
-spec objects_documents_actions_get() ->
  openapi_utils:response().
objects_documents_actions_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/actions"],
  QueryString = [<<"loc=">>, Loc, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Download Controlled Copy Job Results
%% 
-spec objects_documents_actions_lifecycle_and_state_and_action_job_id_results_get(binary(), binary()) ->
  openapi_utils:response().
objects_documents_actions_lifecycle_and_state_and_action_job_id_results_get(LifecycleAndStateAndAction, JobId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/actions/", LifecycleAndStateAndAction, "/", JobId, "/results"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Document Workflow Details
%% 
-spec objects_documents_actions_workflow_name_get(binary()) ->
  openapi_utils:response().
objects_documents_actions_workflow_name_get(WorkflowName) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/actions/", WorkflowName, ""],
  QueryString = [<<"loc=">>, Loc, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Initiate Document Workflow
%% 
-spec objects_documents_actions_workflow_name_post(binary()) ->
  openapi_utils:response().
objects_documents_actions_workflow_name_post(WorkflowName) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/actions/", WorkflowName, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Delete Annotations
%% 
-spec objects_documents_annotations_batch_delete() ->
  openapi_utils:response().
objects_documents_annotations_batch_delete() ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/annotations/batch"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Create Multiple Annotations
%% 
-spec objects_documents_annotations_batch_post(binary(), binary(), binary(), binary()) ->
  openapi_utils:response().
objects_documents_annotations_batch_post(Authorization, ContentType, Accept, XVaultAPIClientID) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/annotations/batch"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Update Annotations
%% 
-spec objects_documents_annotations_batch_put() ->
  openapi_utils:response().
objects_documents_annotations_batch_put() ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/annotations/batch"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Add Annotation Replies
%% 
-spec objects_documents_annotations_replies_batch_post() ->
  openapi_utils:response().
objects_documents_annotations_replies_batch_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/annotations/replies/batch"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Delete Multiple Document Attachments
%% 
-spec objects_documents_attachments_batch_delete() ->
  openapi_utils:response().
objects_documents_attachments_batch_delete() ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/attachments/batch"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Create Multiple Document Attachments
%% 
-spec objects_documents_attachments_batch_post() ->
  openapi_utils:response().
objects_documents_attachments_batch_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/attachments/batch"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Update Multiple Document Attachment Descriptions
%% 
-spec objects_documents_attachments_batch_put() ->
  openapi_utils:response().
objects_documents_attachments_batch_put() ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/attachments/batch"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Document Export Results
%% 
-spec objects_documents_batch_actions_fileextract_job_id_results_get(binary()) ->
  openapi_utils:response().
objects_documents_batch_actions_fileextract_job_id_results_get(JobId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/batch/actions/fileextract/", JobId, "/results"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Export Documents
%% 
-spec objects_documents_batch_actions_fileextract_post() ->
  openapi_utils:response().
objects_documents_batch_actions_fileextract_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/batch/actions/fileextract"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"source=">>, Source, <<"&">>, <<"renditions=">>, Renditions, <<"&">>, <<"allversions=">>, Allversions, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc Reclassify Multiple Documents
%% 
-spec objects_documents_batch_actions_reclassify_put() ->
  openapi_utils:response().
objects_documents_batch_actions_reclassify_put() ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/batch/actions/reclassify"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Update Multiple Document Renditions
%% 
-spec objects_documents_batch_actions_rerender_post() ->
  openapi_utils:response().
objects_documents_batch_actions_rerender_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/batch/actions/rerender"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Delete Multiple Documents
%% 
-spec objects_documents_batch_delete() ->
  openapi_utils:response().
objects_documents_batch_delete() ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/batch"],
  QueryString = [<<"idParam=">>, IdParam, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Undo Collaborative Authoring Checkout
%% 
-spec objects_documents_batch_lock_delete() ->
  openapi_utils:response().
objects_documents_batch_lock_delete() ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/batch/lock"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Create Multiple Documents
%% 
-spec objects_documents_batch_post() ->
  openapi_utils:response().
objects_documents_batch_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/batch"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Update Multiple Documents
%% 
-spec objects_documents_batch_put() ->
  openapi_utils:response().
objects_documents_batch_put() ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/batch"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Anchor IDs
%% 
-spec objects_documents_doc_id_anchors_get(binary()) ->
  openapi_utils:response().
objects_documents_doc_id_anchors_get(DocId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/anchors"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Export Document Annotations to PDF
%% 
-spec objects_documents_doc_id_annotations_file_get(binary()) ->
  openapi_utils:response().
objects_documents_doc_id_annotations_file_get(DocId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/annotations/file"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Import Document Annotations from PDF
%% 
-spec objects_documents_doc_id_annotations_file_post(binary()) ->
  openapi_utils:response().
objects_documents_doc_id_annotations_file_post(DocId) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/annotations/file"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Delete Single Document Attachment
%% 
-spec objects_documents_doc_id_attachments_attachment_id_delete(binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_attachments_attachment_id_delete(DocId, AttachmentId) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/attachments/", AttachmentId, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Download Document Attachment
%% 
-spec objects_documents_doc_id_attachments_attachment_id_file_get(binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_attachments_attachment_id_file_get(DocId, AttachmentId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/attachments/", AttachmentId, "/file"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Document Attachment Metadata
%% 
-spec objects_documents_doc_id_attachments_attachment_id_get(binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_attachments_attachment_id_get(DocId, AttachmentId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/attachments/", AttachmentId, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Update Document Attachment Description
%% 
-spec objects_documents_doc_id_attachments_attachment_id_put(binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_attachments_attachment_id_put(DocId, AttachmentId) ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/attachments/", AttachmentId, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Delete Single Document Attachment Version
%% 
-spec objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_delete(binary(), binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_delete(DocId, AttachmentId, AttachmentVersion) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/attachments/", AttachmentId, "/versions/", AttachmentVersion, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Download Document Attachment Version
%% 
-spec objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_file_get(binary(), binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_file_get(DocId, AttachmentId, AttachmentVersion) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/attachments/", AttachmentId, "/versions/", AttachmentVersion, "/file"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Document Attachment Version Metadata
%% 
-spec objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_get(binary(), binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_get(DocId, AttachmentId, AttachmentVersion) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/attachments/", AttachmentId, "/versions/", AttachmentVersion, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Restore Document Attachment Version
%% 
-spec objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_post(binary(), binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_post(DocId, AttachmentId, AttachmentVersion) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/attachments/", AttachmentId, "/versions/", AttachmentVersion, ""],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"restore=">>, Restore, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc Retrieve Document Attachment Versions
%% 
-spec objects_documents_doc_id_attachments_attachment_id_versions_get(binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_attachments_attachment_id_versions_get(DocId, AttachmentId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/attachments/", AttachmentId, "/versions"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Download All Document Attachments
%% 
-spec objects_documents_doc_id_attachments_file_get(binary()) ->
  openapi_utils:response().
objects_documents_doc_id_attachments_file_get(DocId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/attachments/file"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Document Attachments
%% 
-spec objects_documents_doc_id_attachments_get(binary()) ->
  openapi_utils:response().
objects_documents_doc_id_attachments_get(DocId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/attachments"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Create Document Attachment
%% 
-spec objects_documents_doc_id_attachments_post(binary()) ->
  openapi_utils:response().
objects_documents_doc_id_attachments_post(DocId) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/attachments"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Complete Audit History for a Single Document
%% 
-spec objects_documents_doc_id_audittrail_get(binary()) ->
  openapi_utils:response().
objects_documents_doc_id_audittrail_get(DocId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/audittrail"],
  QueryString = [<<"start_date=">>, StartDate, <<"&">>, <<"end_date=">>, EndDate, <<"&">>, <<"format_result=">>, FormatResult, <<"&">>, <<"limit=">>, Limit, <<"&">>, <<"offset=">>, Offset, <<"&">>, <<"events=">>, Events, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Delete Single Document
%% 
-spec objects_documents_doc_id_delete(binary()) ->
  openapi_utils:response().
objects_documents_doc_id_delete(DocId) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Document Events
%% 
-spec objects_documents_doc_id_events_get(binary()) ->
  openapi_utils:response().
objects_documents_doc_id_events_get(DocId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/events"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Download Document File
%% 
-spec objects_documents_doc_id_file_get(binary()) ->
  openapi_utils:response().
objects_documents_doc_id_file_get(DocId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/file"],
  QueryString = [<<"lockDocument=">>, LockDocument, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Retrieve Document
%% 
-spec objects_documents_doc_id_get(binary()) ->
  openapi_utils:response().
objects_documents_doc_id_get(DocId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Delete Document Lock
%% 
-spec objects_documents_doc_id_lock_delete(binary()) ->
  openapi_utils:response().
objects_documents_doc_id_lock_delete(DocId) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/lock"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Document Lock
%% 
-spec objects_documents_doc_id_lock_get(binary()) ->
  openapi_utils:response().
objects_documents_doc_id_lock_get(DocId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/lock"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Create Document Lock
%% 
-spec objects_documents_doc_id_lock_post(binary()) ->
  openapi_utils:response().
objects_documents_doc_id_lock_post(DocId) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/lock"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Download All Document Version Attachments
%% 
-spec objects_documents_doc_id_major_version_minor_version_attachments_file_get(binary(), binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_major_version_minor_version_attachments_file_get(DocId, MajorVersion, MinorVersion) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/", MajorVersion, "/", MinorVersion, "/attachments/file"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Create Single Document Version
%% 
-spec objects_documents_doc_id_post(binary()) ->
  openapi_utils:response().
objects_documents_doc_id_post(DocId) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, ""],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"suppressRendition=">>, SuppressRendition, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc Update Single Document
%% 
-spec objects_documents_doc_id_put(binary()) ->
  openapi_utils:response().
objects_documents_doc_id_put(DocId) ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Document Renditions
%% 
-spec objects_documents_doc_id_renditions_get(binary()) ->
  openapi_utils:response().
objects_documents_doc_id_renditions_get(DocId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/renditions"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Delete Single Document Rendition
%% 
-spec objects_documents_doc_id_renditions_rendition_type_delete(binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_renditions_rendition_type_delete(DocId, RenditionType) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/renditions/", RenditionType, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Download Document Rendition File
%% 
-spec objects_documents_doc_id_renditions_rendition_type_get(binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_renditions_rendition_type_get(DocId, RenditionType) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/renditions/", RenditionType, ""],
  QueryString = [<<"steadyState=">>, SteadyState, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Add Single Document Rendition
%% 
-spec objects_documents_doc_id_renditions_rendition_type_post(binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_renditions_rendition_type_post(DocId, RenditionType) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/renditions/", RenditionType, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Replace Document Rendition
%% 
-spec objects_documents_doc_id_renditions_rendition_type_put(binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_renditions_rendition_type_put(DocId, RenditionType) ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/renditions/", RenditionType, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Remove Users & Groups from Roles on a Single Document
%% 
-spec objects_documents_doc_id_roles_role_name_and_user_or_group_id_delete(binary(), binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_roles_role_name_and_user_or_group_id_delete(DocId, RoleNameAndUserOrGroup, Id) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/roles/", RoleNameAndUserOrGroup, "/", Id, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Document Version Attachments
%% 
-spec objects_documents_doc_id_version_major_version_minor_version_attachments_get(binary(), binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_version_major_version_minor_version_attachments_get(DocId, MajorVersion, MinorVersion) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/version/", MajorVersion, "/", MinorVersion, "/attachments"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Document Versions
%% 
-spec objects_documents_doc_id_versions_get(binary()) ->
  openapi_utils:response().
objects_documents_doc_id_versions_get(DocId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/versions"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Read Annotations by ID
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_get(binary(), binary(), binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_get(DocId, MajorVersion, MinorVersion, AnnotationId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/annotations/", AnnotationId, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Read Replies of Parent Annotation
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_replies_get(binary(), binary(), binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_replies_get(DocId, MajorVersion, MinorVersion, AnnotationId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/annotations/", AnnotationId, "/replies"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Export Document Version Annotations to PDF
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_annotations_file_get(binary(), binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_versions_major_version_minor_version_annotations_file_get(DocId, MajorVersion, MinorVersion) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/annotations/file"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Import Document Version Annotations from PDF
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_annotations_file_post(binary(), binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_versions_major_version_minor_version_annotations_file_post(DocId, MajorVersion, MinorVersion) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/annotations/file"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Read Annotations by Document Version and Type
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_annotations_get(binary(), binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_versions_major_version_minor_version_annotations_get(DocId, MajorVersion, MinorVersion) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/annotations"],
  QueryString = [<<"limit=">>, Limit, <<"&">>, <<"offset=">>, Offset, <<"&">>, <<"annotation_types=">>, AnnotationTypes, <<"&">>, <<"pagination_id=">>, PaginationId, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Download Document Version Attachment Version
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_file_get(binary(), binary(), binary(), binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_file_get(DocId, MajorVersion, MinorVersion, AttachmentId, AttachmentVersion) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/attachments/", AttachmentId, "/versions/", AttachmentVersion, "/file"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Document Version Attachment Versions
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_get(binary(), binary(), binary(), binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_get(DocId, MajorVersion, MinorVersion, AttachmentId, AttachmentVersion) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/attachments/", AttachmentId, "/versions/", AttachmentVersion, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Delete Single Document Version
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_delete(binary(), binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_versions_major_version_minor_version_delete(DocId, MajorVersion, MinorVersion) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Document Version Notes as CSV
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_doc_export_annotations_to_csv_get(binary(), binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_versions_major_version_minor_version_doc_export_annotations_to_csv_get(DocId, MajorVersion, MinorVersion) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/doc-export-annotations-to-csv"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Create Document Event
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_events_post(binary(), binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_versions_major_version_minor_version_events_post(DocId, MajorVersion, MinorVersion) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/events"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Video Annotations
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_export_video_annotations_get(binary(), binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_versions_major_version_minor_version_export_video_annotations_get(DocId, MajorVersion, MinorVersion) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/export-video-annotations"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Download Document Version File
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_file_get(binary(), binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_versions_major_version_minor_version_file_get(DocId, MajorVersion, MinorVersion) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/file"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Document Version
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_get(binary(), binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_versions_major_version_minor_version_get(DocId, MajorVersion, MinorVersion) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Update Document Version
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_put(binary(), binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_versions_major_version_minor_version_put(DocId, MajorVersion, MinorVersion) ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Document Relationships
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_relationships_get(binary(), binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_versions_major_version_minor_version_relationships_get(DocId, MajorVersion, MinorVersion) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/relationships"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Create Single Document Relationship
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_relationships_post(binary(), binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_versions_major_version_minor_version_relationships_post(DocId, MajorVersion, MinorVersion) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/relationships"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Delete Single Document Relationship
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_delete(binary(), binary(), binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_delete(DocId, MajorVersion, MinorVersion, RelationshipId) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/relationships/", RelationshipId, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Document Relationship
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_get(binary(), binary(), binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_get(DocId, MajorVersion, MinorVersion, RelationshipId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/relationships/", RelationshipId, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Document Version Renditions
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_renditions_get(binary(), binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_versions_major_version_minor_version_renditions_get(DocId, MajorVersion, MinorVersion) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/renditions"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Delete Document Version Rendition
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_delete(binary(), binary(), binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_delete(DocId, MajorVersion, MinorVersion, RenditionType) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/renditions/", RenditionType, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Download Document Version Rendition File
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_get(binary(), binary(), binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_get(DocId, MajorVersion, MinorVersion, RenditionType) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/renditions/", RenditionType, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Upload Document Version Rendition
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_post(binary(), binary(), binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_post(DocId, MajorVersion, MinorVersion, RenditionType) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/renditions/", RenditionType, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Replace Document Version Rendition
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_put(binary(), binary(), binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_put(DocId, MajorVersion, MinorVersion, RenditionType) ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/renditions/", RenditionType, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Download Document Version Thumbnail File
%% 
-spec objects_documents_doc_id_versions_major_version_minor_version_thumbnail_get(binary(), binary(), binary()) ->
  openapi_utils:response().
objects_documents_doc_id_versions_major_version_minor_version_thumbnail_get(DocId, MajorVersion, MinorVersion) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", DocId, "/versions/", MajorVersion, "/", MinorVersion, "/thumbnail"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve All Documents
%% 
-spec objects_documents_get() ->
  openapi_utils:response().
objects_documents_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents"],
  QueryString = [<<"named_filter=">>, NamedFilter, <<"&">>, <<"scope=">>, Scope, <<"&">>, <<"versionscope=">>, Versionscope, <<"&">>, <<"search=">>, Search, <<"&">>, <<"limit=">>, Limit, <<"&">>, <<"sort=">>, Sort, <<"&">>, <<"start=">>, Start, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Retrieve All Document Roles
%% 
-spec objects_documents_id_roles_get(binary()) ->
  openapi_utils:response().
objects_documents_id_roles_get(Id) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", Id, "/roles"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Assign Users & Groups to Roles on a Single Document
%% 
-spec objects_documents_id_roles_post(binary()) ->
  openapi_utils:response().
objects_documents_id_roles_post(Id) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", Id, "/roles"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Document Role
%% 
-spec objects_documents_id_roles_role_name_get(binary(), binary()) ->
  openapi_utils:response().
objects_documents_id_roles_role_name_get(Id, RoleName) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", Id, "/roles/", RoleName, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Document User Actions
%% 
-spec objects_documents_id_versions_major_version_minor_version_lifecycle_actions_get(binary(), binary(), binary()) ->
  openapi_utils:response().
objects_documents_id_versions_major_version_minor_version_lifecycle_actions_get(Id, MajorVersion, MinorVersion) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", Id, "/versions/", MajorVersion, "/", MinorVersion, "/lifecycle_actions"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Document Entry Criteria
%% 
-spec objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get(binary(), binary(), binary(), binary()) ->
  openapi_utils:response().
objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get(Id, MajorVersion, MinorVersion, NameV) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", Id, "/versions/", MajorVersion, "/", MinorVersion, "/lifecycle_actions/", NameV, "/entry_requirements"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Initiate Document User Action
%% 
-spec objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_put(binary(), binary(), binary(), binary()) ->
  openapi_utils:response().
objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_put(Id, MajorVersion, MinorVersion, NameV) ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/", Id, "/versions/", MajorVersion, "/", MinorVersion, "/lifecycle_actions/", NameV, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve User Actions on Multiple Documents
%% 
-spec objects_documents_lifecycle_actions_post() ->
  openapi_utils:response().
objects_documents_lifecycle_actions_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/lifecycle_actions"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Initiate Bulk Document User Actions
%% 
-spec objects_documents_lifecycle_actions_user_action_name_put(binary()) ->
  openapi_utils:response().
objects_documents_lifecycle_actions_user_action_name_put(UserActionName) ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/lifecycle_actions/", UserActionName, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Create Single Document
%% 
-spec objects_documents_post() ->
  openapi_utils:response().
objects_documents_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Delete Multiple Document Relationships
%% 
-spec objects_documents_relationships_batch_delete() ->
  openapi_utils:response().
objects_documents_relationships_batch_delete() ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/relationships/batch"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Create Multiple Document Relationships
%% 
-spec objects_documents_relationships_batch_post() ->
  openapi_utils:response().
objects_documents_relationships_batch_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/relationships/batch"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Delete Multiple Document Renditions
%% 
-spec objects_documents_renditions_batch_delete() ->
  openapi_utils:response().
objects_documents_renditions_batch_delete() ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/renditions/batch"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Add Multiple Document Renditions
%% 
-spec objects_documents_renditions_batch_post() ->
  openapi_utils:response().
objects_documents_renditions_batch_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/renditions/batch"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"idParam=">>, IdParam, <<"&">>, <<"largeSizeAsset=">>, LargeSizeAsset, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc Remove Users and Groups from Roles on Multiple Documents & Binders
%% 
-spec objects_documents_roles_batch_delete() ->
  openapi_utils:response().
objects_documents_roles_batch_delete() ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/roles/batch"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Assign Users & Groups to Roles on Multiple Documents & Binders
%% 
-spec objects_documents_roles_batch_post() ->
  openapi_utils:response().
objects_documents_roles_batch_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/roles/batch"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Document Template Collection
%% 
-spec objects_documents_templates_get() ->
  openapi_utils:response().
objects_documents_templates_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/templates"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Create Single Document Template
%% 
-spec objects_documents_templates_post() ->
  openapi_utils:response().
objects_documents_templates_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/templates"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Update Multiple Document Templates
%% 
-spec objects_documents_templates_put() ->
  openapi_utils:response().
objects_documents_templates_put() ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/templates"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Delete Basic Document Template
%% 
-spec objects_documents_templates_template_name_delete(binary()) ->
  openapi_utils:response().
objects_documents_templates_template_name_delete(TemplateName) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/templates/", TemplateName, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Download Document Template File
%% 
-spec objects_documents_templates_template_name_file_get(binary()) ->
  openapi_utils:response().
objects_documents_templates_template_name_file_get(TemplateName) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/templates/", TemplateName, "/file"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Document Template Attributes
%% 
-spec objects_documents_templates_template_name_get(binary()) ->
  openapi_utils:response().
objects_documents_templates_template_name_get(TemplateName) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/templates/", TemplateName, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Update Single Document Template
%% 
-spec objects_documents_templates_template_name_put(binary()) ->
  openapi_utils:response().
objects_documents_templates_template_name_put(TemplateName) ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/templates/", TemplateName, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Document Tokens
%% 
-spec objects_documents_tokens_post() ->
  openapi_utils:response().
objects_documents_tokens_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/tokens"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Export Document Versions
%% 
-spec objects_documents_versions_batch_actions_fileextract_post() ->
  openapi_utils:response().
objects_documents_versions_batch_actions_fileextract_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/versions/batch/actions/fileextract"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"source=">>, Source, <<"&">>, <<"renditions=">>, Renditions, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc Delete Multiple Document Versions
%% 
-spec objects_documents_versions_batch_delete() ->
  openapi_utils:response().
objects_documents_versions_batch_delete() ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/versions/batch"],
  QueryString = [<<"idParam=">>, IdParam, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Create Multiple Document Versions
%% 
-spec objects_documents_versions_batch_post() ->
  openapi_utils:response().
objects_documents_versions_batch_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/documents/versions/batch"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"idParam=">>, IdParam, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc Retrieve Domain Information
%% 
-spec objects_domain_get() ->
  openapi_utils:response().
objects_domain_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/domain"],
  QueryString = [<<"include_application=">>, IncludeApplication, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Retrieve Domains
%% 
-spec objects_domains_get() ->
  openapi_utils:response().
objects_domains_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/domains"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Add EDL Matched Documents
%% 
-spec objects_edl_matched_documents_batch_actions_add_post() ->
  openapi_utils:response().
objects_edl_matched_documents_batch_actions_add_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/edl_matched_documents/batch/actions/add"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Remove EDL Matched Documents
%% 
-spec objects_edl_matched_documents_batch_actions_remove_post() ->
  openapi_utils:response().
objects_edl_matched_documents_batch_actions_remove_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/edl_matched_documents/batch/actions/remove"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Auto Managed Groups
%% 
-spec objects_groups_auto_get() ->
  openapi_utils:response().
objects_groups_auto_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/groups/auto"],
  QueryString = [<<"limit=">>, Limit, <<"&">>, <<"offset=">>, Offset, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Retrieve All Groups
%% 
-spec objects_groups_get() ->
  openapi_utils:response().
objects_groups_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/groups"],
  QueryString = [<<"includeImplied=">>, IncludeImplied, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Delete Group
%% 
-spec objects_groups_group_id_delete(binary()) ->
  openapi_utils:response().
objects_groups_group_id_delete(GroupId) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/groups/", GroupId, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Group
%% 
-spec objects_groups_group_id_get(binary()) ->
  openapi_utils:response().
objects_groups_group_id_get(GroupId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/groups/", GroupId, ""],
  QueryString = [<<"includeImplied=">>, IncludeImplied, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Update Group
%% 
-spec objects_groups_group_id_put(binary()) ->
  openapi_utils:response().
objects_groups_group_id_put(GroupId) ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/groups/", GroupId, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Create Group 
%% 
-spec objects_groups_post() ->
  openapi_utils:response().
objects_groups_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/groups"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Application License Usage
%% 
-spec objects_licenses_get() ->
  openapi_utils:response().
objects_licenses_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/licenses"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve All Multi-Record Workflows
%% 
-spec objects_objectworkflows_actions_get() ->
  openapi_utils:response().
objects_objectworkflows_actions_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/objectworkflows/actions"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Multi-Record Workflow Details
%% 
-spec objects_objectworkflows_actions_workflow_name_get(binary()) ->
  openapi_utils:response().
objects_objectworkflows_actions_workflow_name_get(WorkflowName) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/objectworkflows/actions/", WorkflowName, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Initiate Multi-Record Workflow
%% 
-spec objects_objectworkflows_actions_workflow_name_post(binary()) ->
  openapi_utils:response().
objects_objectworkflows_actions_workflow_name_post(WorkflowName) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/objectworkflows/actions/", WorkflowName, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Workflows
%% 
-spec objects_objectworkflows_get() ->
  openapi_utils:response().
objects_objectworkflows_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/objectworkflows"],
  QueryString = [<<"object__v=">>, ObjectV, <<"&">>, <<"record_id__v=">>, RecordIdV, <<"&">>, <<"participant=">>, Participant, <<"&">>, <<"status__v=">>, StatusV, <<"&">>, <<"offset=">>, Offset, <<"&">>, <<"page_size=">>, PageSize, <<"&">>, <<"loc=">>, Loc, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Retrieve Workflow Tasks
%% 
-spec objects_objectworkflows_tasks_get() ->
  openapi_utils:response().
objects_objectworkflows_tasks_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/objectworkflows/tasks"],
  QueryString = [<<"object__v=">>, ObjectV, <<"&">>, <<"record_id__v=">>, RecordIdV, <<"&">>, <<"assignee__v=">>, AssigneeV, <<"&">>, <<"status__v=">>, StatusV, <<"&">>, <<"offset=">>, Offset, <<"&">>, <<"page_size=">>, PageSize, <<"&">>, <<"loc=">>, Loc, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Accept Single Record Workflow Task
%% 
-spec objects_objectworkflows_tasks_task_id_actions_accept_post(binary()) ->
  openapi_utils:response().
objects_objectworkflows_tasks_task_id_actions_accept_post(TaskId) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/objectworkflows/tasks/", TaskId, "/actions/accept"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Cancel Workflow Task
%% 
-spec objects_objectworkflows_tasks_task_id_actions_cancel_post(binary()) ->
  openapi_utils:response().
objects_objectworkflows_tasks_task_id_actions_cancel_post(TaskId) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/objectworkflows/tasks/", TaskId, "/actions/cancel"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Complete Single Record Workflow Task
%% 
-spec objects_objectworkflows_tasks_task_id_actions_complete_post(binary()) ->
  openapi_utils:response().
objects_objectworkflows_tasks_task_id_actions_complete_post(TaskId) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/objectworkflows/tasks/", TaskId, "/actions/complete"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Workflow Task Actions
%% 
-spec objects_objectworkflows_tasks_task_id_actions_get(binary()) ->
  openapi_utils:response().
objects_objectworkflows_tasks_task_id_actions_get(TaskId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/objectworkflows/tasks/", TaskId, "/actions"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Accept Multi-item Workflow Task
%% 
-spec objects_objectworkflows_tasks_task_id_actions_mdwaccept_post(binary()) ->
  openapi_utils:response().
objects_objectworkflows_tasks_task_id_actions_mdwaccept_post(TaskId) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/objectworkflows/tasks/", TaskId, "/actions/mdwaccept"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Complete Multi-item Workflow Task
%% 
-spec objects_objectworkflows_tasks_task_id_actions_mdwcomplete_post(binary()) ->
  openapi_utils:response().
objects_objectworkflows_tasks_task_id_actions_mdwcomplete_post(TaskId) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/objectworkflows/tasks/", TaskId, "/actions/mdwcomplete"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Manage Multi-Item Workflow Content
%% 
-spec objects_objectworkflows_tasks_task_id_actions_mdwmanagecontent_post(binary()) ->
  openapi_utils:response().
objects_objectworkflows_tasks_task_id_actions_mdwmanagecontent_post(TaskId) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/objectworkflows/tasks/", TaskId, "/actions/mdwmanagecontent"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Reassign Multi-item Workflow Task
%% 
-spec objects_objectworkflows_tasks_task_id_actions_mdwreassign_post(binary()) ->
  openapi_utils:response().
objects_objectworkflows_tasks_task_id_actions_mdwreassign_post(TaskId) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/objectworkflows/tasks/", TaskId, "/actions/mdwreassign"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Reassign Single Record Workflow Task
%% 
-spec objects_objectworkflows_tasks_task_id_actions_reassign_post(binary()) ->
  openapi_utils:response().
objects_objectworkflows_tasks_task_id_actions_reassign_post(TaskId) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/objectworkflows/tasks/", TaskId, "/actions/reassign"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Workflow Task Action Details
%% 
-spec objects_objectworkflows_tasks_task_id_actions_task_action_get(binary(), binary()) ->
  openapi_utils:response().
objects_objectworkflows_tasks_task_id_actions_task_action_get(TaskId, TaskAction) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/objectworkflows/tasks/", TaskId, "/actions/", TaskAction, ""],
  QueryString = [<<"loc=">>, Loc, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Undo Workflow Task Acceptance
%% 
-spec objects_objectworkflows_tasks_task_id_actions_undoaccept_post(binary()) ->
  openapi_utils:response().
objects_objectworkflows_tasks_task_id_actions_undoaccept_post(TaskId) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/objectworkflows/tasks/", TaskId, "/actions/undoaccept"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Update Workflow Task Due Date
%% 
-spec objects_objectworkflows_tasks_task_id_actions_updateduedate_post(binary()) ->
  openapi_utils:response().
objects_objectworkflows_tasks_task_id_actions_updateduedate_post(TaskId) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/objectworkflows/tasks/", TaskId, "/actions/updateduedate"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Workflow Task Details
%% 
-spec objects_objectworkflows_tasks_task_id_get(binary()) ->
  openapi_utils:response().
objects_objectworkflows_tasks_task_id_get(TaskId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/objectworkflows/tasks/", TaskId, ""],
  QueryString = [<<"loc=">>, Loc, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Retrieve Workflow Actions
%% 
-spec objects_objectworkflows_workflow_id_actions_get(binary()) ->
  openapi_utils:response().
objects_objectworkflows_workflow_id_actions_get(WorkflowId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/objectworkflows/", WorkflowId, "/actions"],
  QueryString = [<<"loc=">>, Loc, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Retrieve Workflow Action Details
%% 
-spec objects_objectworkflows_workflow_id_actions_workflow_action_get(binary(), binary()) ->
  openapi_utils:response().
objects_objectworkflows_workflow_id_actions_workflow_action_get(WorkflowId, WorkflowAction) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/objectworkflows/", WorkflowId, "/actions/", WorkflowAction, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Initiate Workflow Action
%% 
-spec objects_objectworkflows_workflow_id_actions_workflow_action_post(binary(), binary()) ->
  openapi_utils:response().
objects_objectworkflows_workflow_id_actions_workflow_action_post(WorkflowId, WorkflowAction) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/objectworkflows/", WorkflowId, "/actions/", WorkflowAction, ""],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"documents__sys=">>, DocumentsSys, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc Retrieve Workflow Details
%% 
-spec objects_objectworkflows_workflow_id_get(binary()) ->
  openapi_utils:response().
objects_objectworkflows_workflow_id_get(WorkflowId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/objectworkflows/", WorkflowId, ""],
  QueryString = [<<"loc=">>, Loc, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Retrieve All Picklists
%% 
-spec objects_picklists_get() ->
  openapi_utils:response().
objects_picklists_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/picklists"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Picklist Values
%% 
-spec objects_picklists_picklist_name_get(binary()) ->
  openapi_utils:response().
objects_picklists_picklist_name_get(PicklistName) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/picklists/", PicklistName, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Inactivate Picklist Value
%% 
-spec objects_picklists_picklist_name_picklist_value_name_delete(binary(), binary()) ->
  openapi_utils:response().
objects_picklists_picklist_name_picklist_value_name_delete(PicklistName, PicklistValueName) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/picklists/", PicklistName, "/", PicklistValueName, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Update Picklist Value
%% 
-spec objects_picklists_picklist_name_picklist_value_name_put(binary(), binary()) ->
  openapi_utils:response().
objects_picklists_picklist_name_picklist_value_name_put(PicklistName, PicklistValueName) ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/picklists/", PicklistName, "/", PicklistValueName, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Create Picklist Values
%% 
-spec objects_picklists_picklist_name_post(binary()) ->
  openapi_utils:response().
objects_picklists_picklist_name_post(PicklistName) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/picklists/", PicklistName, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Update Picklist Value Label
%% 
-spec objects_picklists_picklist_name_put(binary()) ->
  openapi_utils:response().
objects_picklists_picklist_name_put(PicklistName) ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/picklists/", PicklistName, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Build Production Vault
%% 
-spec objects_sandbox_actions_buildproduction_post() ->
  openapi_utils:response().
objects_sandbox_actions_buildproduction_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/sandbox/actions/buildproduction"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Promote to Production
%% 
-spec objects_sandbox_actions_promoteproduction_post() ->
  openapi_utils:response().
objects_sandbox_actions_promoteproduction_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/sandbox/actions/promoteproduction"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Recheck Sandbox Usage Limit
%% 
-spec objects_sandbox_actions_recheckusage_post() ->
  openapi_utils:response().
objects_sandbox_actions_recheckusage_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/sandbox/actions/recheckusage"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Change Sandbox Size
%% 
-spec objects_sandbox_batch_changesize_post() ->
  openapi_utils:response().
objects_sandbox_batch_changesize_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/sandbox/batch/changesize"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Set Sandbox Entitlements
%% 
-spec objects_sandbox_entitlements_set_post() ->
  openapi_utils:response().
objects_sandbox_entitlements_set_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/sandbox/entitlements/set"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Sandboxes
%% 
-spec objects_sandbox_get() ->
  openapi_utils:response().
objects_sandbox_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/sandbox"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Delete Sandbox
%% 
-spec objects_sandbox_name_delete(binary()) ->
  openapi_utils:response().
objects_sandbox_name_delete(Name) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/sandbox/", Name, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Create or Refresh Sandbox
%% 
-spec objects_sandbox_post() ->
  openapi_utils:response().
objects_sandbox_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/sandbox"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Update Sandbox Snapshot
%% 
-spec objects_sandbox_snapshot_api_name_actions_update_post(binary()) ->
  openapi_utils:response().
objects_sandbox_snapshot_api_name_actions_update_post(ApiName) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/sandbox/snapshot/", ApiName, "/actions/update"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Upgrade Sandbox Snapshot
%% 
-spec objects_sandbox_snapshot_api_name_actions_upgrade_post(binary()) ->
  openapi_utils:response().
objects_sandbox_snapshot_api_name_actions_upgrade_post(ApiName) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/sandbox/snapshot/", ApiName, "/actions/upgrade"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Delete Sandbox Snapshot
%% 
-spec objects_sandbox_snapshot_api_name_delete(binary()) ->
  openapi_utils:response().
objects_sandbox_snapshot_api_name_delete(ApiName) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/sandbox/snapshot/", ApiName, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Sandbox Snapshots
%% 
-spec objects_sandbox_snapshot_get() ->
  openapi_utils:response().
objects_sandbox_snapshot_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/sandbox/snapshot"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Create Sandbox Snapshot
%% 
-spec objects_sandbox_snapshot_post() ->
  openapi_utils:response().
objects_sandbox_snapshot_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/sandbox/snapshot"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Refresh Sandbox from Snapshot
%% 
-spec objects_sandbox_vault_id_actions_refresh_post(binary()) ->
  openapi_utils:response().
objects_sandbox_vault_id_actions_refresh_post(VaultId) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/sandbox/", VaultId, "/actions/refresh"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Sandbox Details by ID
%% 
-spec objects_sandbox_vault_id_get(binary()) ->
  openapi_utils:response().
objects_sandbox_vault_id_get(VaultId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/sandbox/", VaultId, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve All Security Policies
%% 
-spec objects_securitypolicies_get() ->
  openapi_utils:response().
objects_securitypolicies_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/securitypolicies"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Security Policy
%% 
-spec objects_securitypolicies_security_policy_name_get(binary()) ->
  openapi_utils:response().
objects_securitypolicies_security_policy_name_get(SecurityPolicyName) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/securitypolicies/", SecurityPolicyName, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve All Users
%% 
-spec objects_users_get() ->
  openapi_utils:response().
objects_users_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/users/"],
  QueryString = [<<"vaults=">>, Vaults, <<"&">>, <<"exclude_vault_membership=">>, ExcludeVaultMembership, <<"&">>, <<"exclude_app_licensing=">>, ExcludeAppLicensing, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Retrieve User
%% 
-spec objects_users_id_get(binary()) ->
  openapi_utils:response().
objects_users_id_get(Id) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/users/", Id, ""],
  QueryString = [<<"exclude_vault_membership=">>, ExcludeVaultMembership, <<"&">>, <<"exclude_app_licensing=">>, ExcludeAppLicensing, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Retrieve User Permissions
%% 
-spec objects_users_id_permissions_get(binary()) ->
  openapi_utils:response().
objects_users_id_permissions_get(Id) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/users/", Id, "/permissions"],
  QueryString = [<<"filter=">>, Filter, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Update Single User
%% 
-spec objects_users_id_put(binary()) ->
  openapi_utils:response().
objects_users_id_put(Id) ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/users/", Id, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Validate Session User
%% 
-spec objects_users_me_get() ->
  openapi_utils:response().
objects_users_me_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/users/me"],
  QueryString = [<<"exclude_vault_membership=">>, ExcludeVaultMembership, <<"&">>, <<"exclude_app_licensing=">>, ExcludeAppLicensing, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Change My Password
%% 
-spec objects_users_me_password_post() ->
  openapi_utils:response().
objects_users_me_password_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/users/me/password"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve My User Permissions
%% 
-spec objects_users_me_permissions_get() ->
  openapi_utils:response().
objects_users_me_permissions_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/users/me/permissions"],
  QueryString = [<<"filter=">>, Filter, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Update My User
%% 
-spec objects_users_me_put() ->
  openapi_utils:response().
objects_users_me_put() ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/users/me"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Create Single User
%% 
-spec objects_users_post() ->
  openapi_utils:response().
objects_users_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/users"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Update Multiple Users
%% 
-spec objects_users_put() ->
  openapi_utils:response().
objects_users_put() ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/users"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Disable User
%% 
-spec objects_users_user_id_delete(binary()) ->
  openapi_utils:response().
objects_users_user_id_delete(UserId) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/users/", UserId, ""],
  QueryString = [<<"domain=">>, Domain, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Update Vault Membership
%% 
-spec objects_users_user_id_vault_membership_vault_id_put(binary(), binary()) ->
  openapi_utils:response().
objects_users_user_id_vault_membership_vault_id_put(UserId, VaultId) ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/users/", UserId, "/vault_membership/", VaultId, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Vault Compare
%% 
-spec objects_vault_actions_compare_post() ->
  openapi_utils:response().
objects_vault_actions_compare_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/vault/actions/compare"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Vault Configuration Report
%% 
-spec objects_vault_actions_configreport_post() ->
  openapi_utils:response().
objects_vault_actions_configreport_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/objects/vault/actions/configreport"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Component Definition Query
%% 
-spec query_components_post() ->
  openapi_utils:response().
query_components_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/query/components"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Next Page URL
%% 
-spec query_next_page_post(binary()) ->
  openapi_utils:response().
query_next_page_post(NextPage) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/query/", NextPage, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Submitting a Query
%% 
-spec query_post() ->
  openapi_utils:response().
query_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/query"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Previous Page URL
%% 
-spec query_previous_page_post(binary()) ->
  openapi_utils:response().
query_previous_page_post(PreviousPage) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/query/", PreviousPage, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Current User with SCIM
%% 
-spec scim_v2_me_get() ->
  openapi_utils:response().
scim_v2_me_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/scim/v2/Me"],
  QueryString = [<<"attributes=">>, Attributes, <<"&">>, <<"excludedAttributes=">>, ExcludedAttributes, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Update Current User with SCIM
%% 
-spec scim_v2_me_put() ->
  openapi_utils:response().
scim_v2_me_put() ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/scim/v2/Me"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"attributes=">>, Attributes, <<"&">>, <<"excludedAttributes=">>, ExcludedAttributes, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc Retrieve All SCIM Resource Types
%% 
-spec scim_v2_resource_types_get() ->
  openapi_utils:response().
scim_v2_resource_types_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/scim/v2/ResourceTypes"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Single SCIM Resource Type
%% 
-spec scim_v2_resource_types_type_get(binary()) ->
  openapi_utils:response().
scim_v2_resource_types_type_get(Type) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/scim/v2/ResourceTypes/", Type, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve All SCIM Schema Information
%% 
-spec scim_v2_schemas_get() ->
  openapi_utils:response().
scim_v2_schemas_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/scim/v2/Schemas"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Single SCIM Schema Information
%% 
-spec scim_v2_schemas_id_get(binary()) ->
  openapi_utils:response().
scim_v2_schemas_id_get(Id) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/scim/v2/Schemas/", Id, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve SCIM Provider
%% 
-spec scim_v2_service_provider_config_get() ->
  openapi_utils:response().
scim_v2_service_provider_config_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/scim/v2/ServiceProviderConfig"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve SCIM Resources
%% 
-spec scim_v2_type_get(binary()) ->
  openapi_utils:response().
scim_v2_type_get(Type) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/scim/v2/", Type, ""],
  QueryString = [<<"filter=">>, Filter, <<"&">>, <<"attributes=">>, Attributes, <<"&">>, <<"excludedAttributes=">>, ExcludedAttributes, <<"&">>, <<"sortBy=">>, SortBy, <<"&">>, <<"sortOrder=">>, SortOrder, <<"&">>, <<"startIndex=">>, StartIndex, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Retrieve Single SCIM Resource
%% 
-spec scim_v2_type_id_get(binary(), binary()) ->
  openapi_utils:response().
scim_v2_type_id_get(Type, Id) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/scim/v2/", Type, "/", Id, ""],
  QueryString = [<<"attributes=">>, Attributes, <<"&">>, <<"excludedAttributes=">>, ExcludedAttributes, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Retrieve All Users with SCIM
%% 
-spec scim_v2_users_get() ->
  openapi_utils:response().
scim_v2_users_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/scim/v2/Users"],
  QueryString = [<<"filter=">>, Filter, <<"&">>, <<"attributes=">>, Attributes, <<"&">>, <<"excludedAttributes=">>, ExcludedAttributes, <<"&">>, <<"sortBy=">>, SortBy, <<"&">>, <<"sortOrder=">>, SortOrder, <<"&">>, <<"count=">>, Count, <<"&">>, <<"startIndex=">>, StartIndex, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Retrieve Single User with SCIM
%% 
-spec scim_v2_users_id_get(binary()) ->
  openapi_utils:response().
scim_v2_users_id_get(Id) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/scim/v2/Users/", Id, ""],
  QueryString = [<<"filter=">>, Filter, <<"&">>, <<"attributes=">>, Attributes, <<"&">>, <<"excludedAttributes=">>, ExcludedAttributes, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Update User with SCIM
%% 
-spec scim_v2_users_id_put(binary()) ->
  openapi_utils:response().
scim_v2_users_id_put(Id) ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/scim/v2/Users/", Id, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Create User with SCIM
%% 
-spec scim_v2_users_post() ->
  openapi_utils:response().
scim_v2_users_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/scim/v2/Users"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Signing Certificate
%% 
-spec services_certificate_cert_id_get(binary()) ->
  openapi_utils:response().
services_certificate_cert_id_get(CertId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/certificate/", CertId, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Disable Configuration Mode
%% 
-spec services_configuration_mode_actions_disable_post() ->
  openapi_utils:response().
services_configuration_mode_actions_disable_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/configuration_mode/actions/disable"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Enable Configuration Mode
%% 
-spec services_configuration_mode_actions_enable_post() ->
  openapi_utils:response().
services_configuration_mode_actions_enable_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/configuration_mode/actions/enable"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Available Direct Data Files
%% 
-spec services_directdata_files_get() ->
  openapi_utils:response().
services_directdata_files_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/directdata/files"],
  QueryString = [<<"extract_type=">>, ExtractType, <<"&">>, <<"start_time=">>, StartTime, <<"&">>, <<"stop_time=">>, StopTime, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Download Direct Data File
%% 
-spec services_directdata_files_name_get(binary()) ->
  openapi_utils:response().
services_directdata_files_name_get(Name) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/directdata/files/", Name, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Download Item Content
%% 
-spec services_file_staging_items_content_item_get(binary()) ->
  openapi_utils:response().
services_file_staging_items_content_item_get(Item) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/file_staging/items/content/", Item, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Delete File or Folder
%% 
-spec services_file_staging_items_item_delete(binary()) ->
  openapi_utils:response().
services_file_staging_items_item_delete(Item) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/file_staging/items/", Item, ""],
  QueryString = [<<"recursive=">>, Recursive, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc List Items at a Path
%% 
-spec services_file_staging_items_item_get(binary()) ->
  openapi_utils:response().
services_file_staging_items_item_get(Item) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/file_staging/items/", Item, ""],
  QueryString = [<<"recursive=">>, Recursive, <<"&">>, <<"limit=">>, Limit, <<"&">>, <<"format_result=">>, FormatResult, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Update Folder or File
%% 
-spec services_file_staging_items_item_put(binary()) ->
  openapi_utils:response().
services_file_staging_items_item_put(Item) ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/file_staging/items/", Item, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Create Folder or File
%% 
-spec services_file_staging_items_post() ->
  openapi_utils:response().
services_file_staging_items_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/file_staging/items"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc List Upload Sessions
%% 
-spec services_file_staging_upload_get() ->
  openapi_utils:response().
services_file_staging_upload_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/file_staging/upload/"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Create Resumable Upload Session
%% 
-spec services_file_staging_upload_post() ->
  openapi_utils:response().
services_file_staging_upload_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/file_staging/upload"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Abort Upload Session
%% 
-spec services_file_staging_upload_upload_session_id_delete(binary()) ->
  openapi_utils:response().
services_file_staging_upload_upload_session_id_delete(UploadSessionId) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/file_staging/upload/", UploadSessionId, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Get Upload Session Details
%% 
-spec services_file_staging_upload_upload_session_id_get(binary()) ->
  openapi_utils:response().
services_file_staging_upload_upload_session_id_get(UploadSessionId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/file_staging/upload/", UploadSessionId, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc List File Parts Uploaded to Session
%% 
-spec services_file_staging_upload_upload_session_id_parts_get(binary()) ->
  openapi_utils:response().
services_file_staging_upload_upload_session_id_parts_get(UploadSessionId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/file_staging/upload/", UploadSessionId, "/parts"],
  QueryString = [<<"limit=">>, Limit, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Commit Upload Session
%% 
-spec services_file_staging_upload_upload_session_id_post(binary()) ->
  openapi_utils:response().
services_file_staging_upload_upload_session_id_post(UploadSessionId) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/file_staging/upload/", UploadSessionId, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Upload to a Session
%% 
-spec services_file_staging_upload_upload_session_id_put(binary()) ->
  openapi_utils:response().
services_file_staging_upload_upload_session_id_put(UploadSessionId) ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/file_staging/upload/", UploadSessionId, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Job Histories
%% 
-spec services_jobs_histories_get() ->
  openapi_utils:response().
services_jobs_histories_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/jobs/histories"],
  QueryString = [<<"start_date=">>, StartDate, <<"&">>, <<"end_date=">>, EndDate, <<"&">>, <<"status=">>, Status, <<"&">>, <<"limit=">>, Limit, <<"&">>, <<"offset=">>, Offset, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Retrieve Import Bulk Translation File Job Errors
%% 
-spec services_jobs_job_id_errors_get(binary()) ->
  openapi_utils:response().
services_jobs_job_id_errors_get(JobId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/jobs/", JobId, "/errors"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Job Status
%% 
-spec services_jobs_job_id_get(binary()) ->
  openapi_utils:response().
services_jobs_job_id_get(JobId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/jobs/", JobId, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Import Bulk Translation File Job Summary
%% 
-spec services_jobs_job_id_summary_get(binary()) ->
  openapi_utils:response().
services_jobs_job_id_summary_get(JobId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/jobs/", JobId, "/summary"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve SDK Job Tasks
%% 
-spec services_jobs_job_id_tasks_get(binary()) ->
  openapi_utils:response().
services_jobs_job_id_tasks_get(JobId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/jobs/", JobId, "/tasks"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Job Monitors
%% 
-spec services_jobs_monitors_get() ->
  openapi_utils:response().
services_jobs_monitors_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/jobs/monitors"],
  QueryString = [<<"start_date=">>, StartDate, <<"&">>, <<"end_date=">>, EndDate, <<"&">>, <<"status=">>, Status, <<"&">>, <<"limit=">>, Limit, <<"&">>, <<"offset=">>, Offset, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Start Job
%% 
-spec services_jobs_start_now_job_id_post(binary()) ->
  openapi_utils:response().
services_jobs_start_now_job_id_post(JobId) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/jobs/start_now/", JobId, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Extract Data Files
%% 
-spec services_loader_extract_post() ->
  openapi_utils:response().
services_loader_extract_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/loader/extract"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Load Failure Log Results
%% 
-spec services_loader_job_id_tasks_task_id_failurelog_get(binary(), binary()) ->
  openapi_utils:response().
services_loader_job_id_tasks_task_id_failurelog_get(JobId, TaskId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/loader/", JobId, "/tasks/", TaskId, "/failurelog"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Loader Extract Results
%% 
-spec services_loader_job_id_tasks_task_id_results_get(binary(), binary()) ->
  openapi_utils:response().
services_loader_job_id_tasks_task_id_results_get(JobId, TaskId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/loader/", JobId, "/tasks/", TaskId, "/results"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Loader Extract Renditions Results
%% 
-spec services_loader_job_id_tasks_task_id_results_renditions_get(binary(), binary()) ->
  openapi_utils:response().
services_loader_job_id_tasks_task_id_results_renditions_get(JobId, TaskId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/loader/", JobId, "/tasks/", TaskId, "/results/renditions"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Load Success Log Results
%% 
-spec services_loader_job_id_tasks_task_id_successlog_get(binary(), binary()) ->
  openapi_utils:response().
services_loader_job_id_tasks_task_id_successlog_get(JobId, TaskId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/loader/", JobId, "/tasks/", TaskId, "/successlog"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Load Data Objects
%% 
-spec services_loader_load_post() ->
  openapi_utils:response().
services_loader_load_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/loader/load"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Validate Package
%% 
-spec services_package_actions_validate_post() ->
  openapi_utils:response().
services_package_actions_validate_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/package/actions/validate"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Export Package
%% 
-spec services_package_post() ->
  openapi_utils:response().
services_package_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/package"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Import Package
%% 
-spec services_package_put() ->
  openapi_utils:response().
services_package_put() ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/package"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve All Queues
%% 
-spec services_queues_get() ->
  openapi_utils:response().
services_queues_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/queues"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Disable Delivery
%% 
-spec services_queues_queue_name_actions_disable_delivery_put(binary()) ->
  openapi_utils:response().
services_queues_queue_name_actions_disable_delivery_put(QueueName) ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/queues/", QueueName, "/actions/disable_delivery"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Enable Delivery
%% 
-spec services_queues_queue_name_actions_enable_delivery_put(binary()) ->
  openapi_utils:response().
services_queues_queue_name_actions_enable_delivery_put(QueueName) ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/queues/", QueueName, "/actions/enable_delivery"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Reset Queue
%% 
-spec services_queues_queue_name_actions_reset_put(binary()) ->
  openapi_utils:response().
services_queues_queue_name_actions_reset_put(QueueName) ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/queues/", QueueName, "/actions/reset"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Queue Status
%% 
-spec services_queues_queue_name_get(binary()) ->
  openapi_utils:response().
services_queues_queue_name_get(QueueName) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/queues/", QueueName, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Validate Imported Package
%% 
-spec services_vobject_vault_package_v_package_id_actions_validate_post(binary()) ->
  openapi_utils:response().
services_vobject_vault_package_v_package_id_actions_validate_post(PackageId) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/services/vobject/vault_package__v/", PackageId, "/actions/validate"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc End Session
%% 
-spec session_delete() ->
  openapi_utils:response().
session_delete() ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/session"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Download Single Client Code Distribution
%% 
-spec uicode_distributions_distribution_name_code_get(binary()) ->
  openapi_utils:response().
uicode_distributions_distribution_name_code_get(DistributionName) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/uicode/distributions/", DistributionName, "/code"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Delete Single Client Code Distribution
%% 
-spec uicode_distributions_distribution_name_delete(binary()) ->
  openapi_utils:response().
uicode_distributions_distribution_name_delete(DistributionName) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/uicode/distributions/", DistributionName, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Single Client Code Distribution Metadata
%% 
-spec uicode_distributions_distribution_name_get(binary()) ->
  openapi_utils:response().
uicode_distributions_distribution_name_get(DistributionName) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/uicode/distributions/", DistributionName, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve All Client Code Distribution Metadata
%% 
-spec uicode_distributions_get() ->
  openapi_utils:response().
uicode_distributions_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/uicode/distributions"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Add or Replace Single Client Code Distribution
%% 
-spec uicode_distributions_post() ->
  openapi_utils:response().
uicode_distributions_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/uicode/distributions"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Deploy Package
%% 
-spec vobject_vault_package_v_package_id_actions_deploy_post(binary()) ->
  openapi_utils:response().
vobject_vault_package_v_package_id_actions_deploy_post(PackageId) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobject/vault_package__v/", PackageId, "/actions/deploy"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Package Deploy Results
%% 
-spec vobject_vault_package_v_package_id_actions_deploy_results_get(binary()) ->
  openapi_utils:response().
vobject_vault_package_v_package_id_actions_deploy_results_get(PackageId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobject/vault_package__v/", PackageId, "/actions/deploy/results"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Results of Cascade Delete Job
%% 
-spec vobjects_cascadedelete_results_object_name_job_status_job_id_get(binary(), binary(), binary()) ->
  openapi_utils:response().
vobjects_cascadedelete_results_object_name_job_status_job_id_get(ObjectName, JobStatus, JobId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/cascadedelete/results/", ObjectName, "/", JobStatus, "/", JobId, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Results of Deep Copy Job
%% 
-spec vobjects_deepcopy_results_object_name_job_status_job_id_get(binary(), binary(), binary()) ->
  openapi_utils:response().
vobjects_deepcopy_results_object_name_job_status_job_id_get(ObjectName, JobStatus, JobId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/deepcopy/results/", ObjectName, "/", JobStatus, "/", JobId, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Create a Placeholder from an EDL Item
%% 
-spec vobjects_edl_item_v_actions_createplaceholder_post() ->
  openapi_utils:response().
vobjects_edl_item_v_actions_createplaceholder_post() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/edl_item__v/actions/createplaceholder"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Download Merge Records Job Log
%% 
-spec vobjects_merges_job_id_log_get(binary()) ->
  openapi_utils:response().
vobjects_merges_job_id_log_get(JobId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/merges/", JobId, "/log"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Record Merge Results
%% 
-spec vobjects_merges_job_id_results_get(binary()) ->
  openapi_utils:response().
vobjects_merges_job_id_results_get(JobId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/merges/", JobId, "/results"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Record Merge Status
%% 
-spec vobjects_merges_job_id_status_get(binary()) ->
  openapi_utils:response().
vobjects_merges_job_id_status_get(JobId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/merges/", JobId, "/status"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Initiate Object Action on Multiple Records
%% 
-spec vobjects_object_name_actions_action_name_post(binary(), binary()) ->
  openapi_utils:response().
vobjects_object_name_actions_action_name_post(ObjectName, ActionName) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/", ObjectName, "/actions/", ActionName, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Change Object Type
%% 
-spec vobjects_object_name_actions_changetype_post(binary()) ->
  openapi_utils:response().
vobjects_object_name_actions_changetype_post(ObjectName) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/", ObjectName, "/actions/changetype"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Initiate Record Merge
%% 
-spec vobjects_object_name_actions_merge_post(binary()) ->
  openapi_utils:response().
vobjects_object_name_actions_merge_post(ObjectName) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/", ObjectName, "/actions/merge"],
  Body        = OpenapiVobjectsObjectNameActionsMergePostRequestInnerArray,
  ContentType = hd(["application/json"]),

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Roll-up Field Recalculation Status
%% 
-spec vobjects_object_name_actions_recalculaterollups_get(binary()) ->
  openapi_utils:response().
vobjects_object_name_actions_recalculaterollups_get(ObjectName) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/", ObjectName, "/actions/recalculaterollups"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Recalculate Roll-up Fields
%% 
-spec vobjects_object_name_actions_recalculaterollups_post(binary()) ->
  openapi_utils:response().
vobjects_object_name_actions_recalculaterollups_post(ObjectName) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/", ObjectName, "/actions/recalculaterollups"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Update Corporate Currency Fields
%% 
-spec vobjects_object_name_actions_updatecorporatecurrency_put(binary()) ->
  openapi_utils:response().
vobjects_object_name_actions_updatecorporatecurrency_put(ObjectName) ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/", ObjectName, "/actions/updatecorporatecurrency"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Delete Multiple Object Record Attachments
%% 
-spec vobjects_object_name_attachments_batch_delete(binary()) ->
  openapi_utils:response().
vobjects_object_name_attachments_batch_delete(ObjectName) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/", ObjectName, "/attachments/batch"],
  QueryString = [<<"idParam=">>, IdParam, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Create Multiple Object Record Attachments
%% 
-spec vobjects_object_name_attachments_batch_post(binary()) ->
  openapi_utils:response().
vobjects_object_name_attachments_batch_post(ObjectName) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/", ObjectName, "/attachments/batch"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Update Multiple Object Record Attachment Descriptions
%% 
-spec vobjects_object_name_attachments_batch_put(binary()) ->
  openapi_utils:response().
vobjects_object_name_attachments_batch_put(ObjectName) ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/", ObjectName, "/attachments/batch"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Delete Object Records
%% 
-spec vobjects_object_name_delete(binary()) ->
  openapi_utils:response().
vobjects_object_name_delete(ObjectName) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/", ObjectName, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Object Record Roles
%% 
-spec vobjects_object_name_id_roles_role_name_get(binary(), binary(), binary()) ->
  openapi_utils:response().
vobjects_object_name_id_roles_role_name_get(ObjectName, Id, RoleName) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/", ObjectName, "/", Id, "/roles/", RoleName, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Object User Actions Details
%% 
-spec vobjects_object_name_object_record_id_actions_action_name_get(binary(), binary(), binary()) ->
  openapi_utils:response().
vobjects_object_name_object_record_id_actions_action_name_get(ObjectName, ObjectRecordId, ActionName) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/", ObjectName, "/", ObjectRecordId, "/actions/", ActionName, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Initiate Object Action on a Single Record
%% 
-spec vobjects_object_name_object_record_id_actions_action_name_post(binary(), binary(), binary()) ->
  openapi_utils:response().
vobjects_object_name_object_record_id_actions_action_name_post(ObjectName, ObjectRecordId, ActionName) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/", ObjectName, "/", ObjectRecordId, "/actions/", ActionName, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Cascade Delete Object Record
%% 
-spec vobjects_object_name_object_record_id_actions_cascadedelete_post(binary(), binary()) ->
  openapi_utils:response().
vobjects_object_name_object_record_id_actions_cascadedelete_post(ObjectName, ObjectRecordId) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/", ObjectName, "/", ObjectRecordId, "/actions/cascadedelete"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Deep Copy Object Record
%% 
-spec vobjects_object_name_object_record_id_actions_deepcopy_post(binary(), binary()) ->
  openapi_utils:response().
vobjects_object_name_object_record_id_actions_deepcopy_post(ObjectName, ObjectRecordId) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/", ObjectName, "/", ObjectRecordId, "/actions/deepcopy"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Object Record User Actions
%% 
-spec vobjects_object_name_object_record_id_actions_get(binary(), binary()) ->
  openapi_utils:response().
vobjects_object_name_object_record_id_actions_get(ObjectName, ObjectRecordId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/", ObjectName, "/", ObjectRecordId, "/actions"],
  QueryString = [<<"loc=">>, Loc, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Download Attachment Field File
%% 
-spec vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_get(binary(), binary(), binary()) ->
  openapi_utils:response().
vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_get(ObjectName, ObjectRecordId, AttachmentFieldName) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/", ObjectName, "/", ObjectRecordId, "/attachment_fields/", AttachmentFieldName, "/file"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Update Attachment Field File
%% 
-spec vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_post(binary(), binary(), binary()) ->
  openapi_utils:response().
vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_post(ObjectName, ObjectRecordId, AttachmentFieldName) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/", ObjectName, "/", ObjectRecordId, "/attachment_fields/", AttachmentFieldName, "/file"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Download All Attachment Field Files
%% 
-spec vobjects_object_name_object_record_id_attachment_fields_file_get(binary(), binary()) ->
  openapi_utils:response().
vobjects_object_name_object_record_id_attachment_fields_file_get(ObjectName, ObjectRecordId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/", ObjectName, "/", ObjectRecordId, "/attachment_fields/file"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Delete Object Record Attachment
%% 
-spec vobjects_object_name_object_record_id_attachments_attachment_id_delete(binary(), binary(), binary()) ->
  openapi_utils:response().
vobjects_object_name_object_record_id_attachments_attachment_id_delete(ObjectName, ObjectRecordId, AttachmentId) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/", ObjectName, "/", ObjectRecordId, "/attachments/", AttachmentId, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Object Record Attachment Metadata
%% 
-spec vobjects_object_name_object_record_id_attachments_attachment_id_get(binary(), binary(), binary()) ->
  openapi_utils:response().
vobjects_object_name_object_record_id_attachments_attachment_id_get(ObjectName, ObjectRecordId, AttachmentId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/", ObjectName, "/", ObjectRecordId, "/attachments/", AttachmentId, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Update Object Record Attachment Description
%% 
-spec vobjects_object_name_object_record_id_attachments_attachment_id_put(binary(), binary(), binary()) ->
  openapi_utils:response().
vobjects_object_name_object_record_id_attachments_attachment_id_put(ObjectName, ObjectRecordId, AttachmentId) ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/", ObjectName, "/", ObjectRecordId, "/attachments/", AttachmentId, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Delete Object Record Attachment Version
%% 
-spec vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_delete(binary(), binary(), binary(), binary()) ->
  openapi_utils:response().
vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_delete(ObjectName, ObjectRecordId, AttachmentId, AttachmentVersion) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/", ObjectName, "/", ObjectRecordId, "/attachments/", AttachmentId, "/versions/", AttachmentVersion, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Download Object Record Attachment File
%% 
-spec vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_file_get(binary(), binary(), binary(), binary()) ->
  openapi_utils:response().
vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_file_get(ObjectName, ObjectRecordId, AttachmentId, AttachmentVersion) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/", ObjectName, "/", ObjectRecordId, "/attachments/", AttachmentId, "/versions/", AttachmentVersion, "/file"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Object Record Attachment Version Metadata
%% 
-spec vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_get(binary(), binary(), binary(), binary()) ->
  openapi_utils:response().
vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_get(ObjectName, ObjectRecordId, AttachmentId, AttachmentVersion) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/", ObjectName, "/", ObjectRecordId, "/attachments/", AttachmentId, "/versions/", AttachmentVersion, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Restore Object Record Attachment Version
%% 
-spec vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_post(binary(), binary(), binary(), binary()) ->
  openapi_utils:response().
vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_post(ObjectName, ObjectRecordId, AttachmentId, AttachmentVersion) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/", ObjectName, "/", ObjectRecordId, "/attachments/", AttachmentId, "/versions/", AttachmentVersion, ""],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"restore=">>, Restore, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc Retrieve Object Record Attachment Versions
%% 
-spec vobjects_object_name_object_record_id_attachments_attachment_id_versions_get(binary(), binary(), binary()) ->
  openapi_utils:response().
vobjects_object_name_object_record_id_attachments_attachment_id_versions_get(ObjectName, ObjectRecordId, AttachmentId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/", ObjectName, "/", ObjectRecordId, "/attachments/", AttachmentId, "/versions"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Download All Object Record Attachment Files
%% 
-spec vobjects_object_name_object_record_id_attachments_file_get(binary(), binary()) ->
  openapi_utils:response().
vobjects_object_name_object_record_id_attachments_file_get(ObjectName, ObjectRecordId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/", ObjectName, "/", ObjectRecordId, "/attachments/file"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Retrieve Object Record Attachments
%% 
-spec vobjects_object_name_object_record_id_attachments_get(binary(), binary()) ->
  openapi_utils:response().
vobjects_object_name_object_record_id_attachments_get(ObjectName, ObjectRecordId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/", ObjectName, "/", ObjectRecordId, "/attachments"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Create Object Record Attachment
%% 
-spec vobjects_object_name_object_record_id_attachments_post(binary(), binary()) ->
  openapi_utils:response().
vobjects_object_name_object_record_id_attachments_post(ObjectName, ObjectRecordId) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/", ObjectName, "/", ObjectRecordId, "/attachments"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Complete Audit History for a Single Object Record
%% 
-spec vobjects_object_name_object_record_id_audittrail_get(binary(), binary()) ->
  openapi_utils:response().
vobjects_object_name_object_record_id_audittrail_get(ObjectName, ObjectRecordId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/", ObjectName, "/", ObjectRecordId, "/audittrail"],
  QueryString = [<<"start_date=">>, StartDate, <<"&">>, <<"end_date=">>, EndDate, <<"&">>, <<"format_result=">>, FormatResult, <<"&">>, <<"limit=">>, Limit, <<"&">>, <<"offset=">>, Offset, <<"&">>, <<"events=">>, Events, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc Retrieve Object Record
%% 
-spec vobjects_object_name_object_record_id_get(binary(), binary()) ->
  openapi_utils:response().
vobjects_object_name_object_record_id_get(ObjectName, ObjectRecordId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/", ObjectName, "/", ObjectRecordId, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Create & Upsert Object Records
%% 
-spec vobjects_object_name_post(binary()) ->
  openapi_utils:response().
vobjects_object_name_post(ObjectName) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/", ObjectName, ""],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"idParam=">>, IdParam, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc Update Object Records
%% 
-spec vobjects_object_name_put(binary()) ->
  openapi_utils:response().
vobjects_object_name_put(ObjectName) ->
  Method      = put,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/", ObjectName, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Remove Users & Groups from Roles on Object Records
%% 
-spec vobjects_object_name_roles_delete(binary()) ->
  openapi_utils:response().
vobjects_object_name_roles_delete(ObjectName) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/", ObjectName, "/roles"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Assign Users & Groups to Roles on Object Records
%% 
-spec vobjects_object_name_roles_post(binary()) ->
  openapi_utils:response().
vobjects_object_name_roles_post(ObjectName) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/", ObjectName, "/roles"],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc Retrieve Outbound Package Dependencies
%% 
-spec vobjects_outbound_package_v_package_id_dependencies_get(binary()) ->
  openapi_utils:response().
vobjects_outbound_package_v_package_id_dependencies_get(PackageId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/vobjects/outbound_package__v/", PackageId, "/dependencies"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

