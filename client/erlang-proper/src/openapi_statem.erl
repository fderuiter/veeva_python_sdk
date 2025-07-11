-module(openapi_statem).

-behaviour(proper_statem).

-include("openapi.hrl").
-include_lib("proper/include/proper_common.hrl").
-include_lib("stdlib/include/assert.hrl").

-compile(export_all).
-compile(nowarn_export_all).

-include("openapi_statem.hrl").

%%==============================================================================
%% The statem's property
%%==============================================================================

prop_main() ->
  setup(),
  ?FORALL( Cmds
         , proper_statem:commands(?MODULE)
         , begin
             cleanup(),
             { History
             , State
             , Result
             } = proper_statem:run_commands(?MODULE, Cmds),
             ?WHENFAIL(
                io:format("History: ~p\nState: ~p\nResult: ~p\nCmds: ~p\n",
                          [ History
                          , State
                          , Result
                          , proper_statem:command_names(Cmds)
                          ]),
                proper:aggregate( proper_statem:command_names(Cmds)
                                , Result =:= ok
                                )
               )
           end
         ).

%%==============================================================================
%% Setup
%%==============================================================================

setup() -> ok.

%%==============================================================================
%% Cleanup
%%==============================================================================

cleanup() -> ok.

%%==============================================================================
%% Initial State
%%==============================================================================

initial_state() -> #{}.

%%==============================================================================
%% api_get
%%==============================================================================

api_get() ->
  openapi_api:api_get().

api_get_args(_S) ->
  [].

%%==============================================================================
%% api_mdl_components_component_type_and_record_name_files_get
%%==============================================================================

api_mdl_components_component_type_and_record_name_files_get(ComponentTypeAndRecordName) ->
  openapi_api:api_mdl_components_component_type_and_record_name_files_get(ComponentTypeAndRecordName).

api_mdl_components_component_type_and_record_name_files_get_args(_S) ->
  [binary()].

%%==============================================================================
%% api_mdl_components_component_type_and_record_name_get
%%==============================================================================

api_mdl_components_component_type_and_record_name_get(ComponentTypeAndRecordName) ->
  openapi_api:api_mdl_components_component_type_and_record_name_get(ComponentTypeAndRecordName).

api_mdl_components_component_type_and_record_name_get_args(_S) ->
  [binary()].

%%==============================================================================
%% api_mdl_execute_async_job_id_results_get
%%==============================================================================

api_mdl_execute_async_job_id_results_get(JobId) ->
  openapi_api:api_mdl_execute_async_job_id_results_get(JobId).

api_mdl_execute_async_job_id_results_get_args(_S) ->
  [binary()].

%%==============================================================================
%% api_mdl_execute_async_post
%%==============================================================================

api_mdl_execute_async_post() ->
  openapi_api:api_mdl_execute_async_post().

api_mdl_execute_async_post_args(_S) ->
  [].

%%==============================================================================
%% api_mdl_execute_post
%%==============================================================================

api_mdl_execute_post() ->
  openapi_api:api_mdl_execute_post().

api_mdl_execute_post_args(_S) ->
  [].

%%==============================================================================
%% api_mdl_files_post
%%==============================================================================

api_mdl_files_post() ->
  openapi_api:api_mdl_files_post().

api_mdl_files_post_args(_S) ->
  [].

%%==============================================================================
%% audittrail_audit_trail_type_get
%%==============================================================================

audittrail_audit_trail_type_get(AuditTrailType) ->
  openapi_api:audittrail_audit_trail_type_get(AuditTrailType).

audittrail_audit_trail_type_get_args(_S) ->
  [binary()].

%%==============================================================================
%% auth_discovery_post
%%==============================================================================

auth_discovery_post() ->
  openapi_api:auth_discovery_post().

auth_discovery_post_args(_S) ->
  [].

%%==============================================================================
%% auth_oauth_session_oath_oidc_profile_id_post
%%==============================================================================

auth_oauth_session_oath_oidc_profile_id_post(OathOidcProfileId) ->
  openapi_api:auth_oauth_session_oath_oidc_profile_id_post(OathOidcProfileId).

auth_oauth_session_oath_oidc_profile_id_post_args(_S) ->
  [binary()].

%%==============================================================================
%% auth_post
%%==============================================================================

auth_post() ->
  openapi_api:auth_post().

auth_post_args(_S) ->
  [].

%%==============================================================================
%% code_class_name_delete
%%==============================================================================

code_class_name_delete(ClassName) ->
  openapi_api:code_class_name_delete(ClassName).

code_class_name_delete_args(_S) ->
  [binary()].

%%==============================================================================
%% code_class_name_disable_put
%%==============================================================================

code_class_name_disable_put(ClassName) ->
  openapi_api:code_class_name_disable_put(ClassName).

code_class_name_disable_put_args(_S) ->
  [binary()].

%%==============================================================================
%% code_class_name_enable_put
%%==============================================================================

code_class_name_enable_put(ClassName) ->
  openapi_api:code_class_name_enable_put(ClassName).

code_class_name_enable_put_args(_S) ->
  [binary()].

%%==============================================================================
%% code_class_name_get
%%==============================================================================

code_class_name_get(ClassName) ->
  openapi_api:code_class_name_get(ClassName).

code_class_name_get_args(_S) ->
  [binary()].

%%==============================================================================
%% code_profiler_get
%%==============================================================================

code_profiler_get() ->
  openapi_api:code_profiler_get().

code_profiler_get_args(_S) ->
  [].

%%==============================================================================
%% code_profiler_post
%%==============================================================================

code_profiler_post() ->
  openapi_api:code_profiler_post().

code_profiler_post_args(_S) ->
  [].

%%==============================================================================
%% code_profiler_session_name_actions_end_post
%%==============================================================================

code_profiler_session_name_actions_end_post(SessionName) ->
  openapi_api:code_profiler_session_name_actions_end_post(SessionName).

code_profiler_session_name_actions_end_post_args(_S) ->
  [binary()].

%%==============================================================================
%% code_profiler_session_name_delete
%%==============================================================================

code_profiler_session_name_delete(SessionName) ->
  openapi_api:code_profiler_session_name_delete(SessionName).

code_profiler_session_name_delete_args(_S) ->
  [binary()].

%%==============================================================================
%% code_profiler_session_name_get
%%==============================================================================

code_profiler_session_name_get(SessionName) ->
  openapi_api:code_profiler_session_name_get(SessionName).

code_profiler_session_name_get_args(_S) ->
  [binary()].

%%==============================================================================
%% code_profiler_session_name_results_get
%%==============================================================================

code_profiler_session_name_results_get(SessionName) ->
  openapi_api:code_profiler_session_name_results_get(SessionName).

code_profiler_session_name_results_get_args(_S) ->
  [binary()].

%%==============================================================================
%% code_put
%%==============================================================================

code_put() ->
  openapi_api:code_put().

code_put_args(_S) ->
  [].

%%==============================================================================
%% composites_trees_edl_hierarchy_or_template_actions_listnodes_post
%%==============================================================================

composites_trees_edl_hierarchy_or_template_actions_listnodes_post(EdlHierarchyOrTemplate) ->
  openapi_api:composites_trees_edl_hierarchy_or_template_actions_listnodes_post(EdlHierarchyOrTemplate).

composites_trees_edl_hierarchy_or_template_actions_listnodes_post_args(_S) ->
  [binary()].

%%==============================================================================
%% composites_trees_edl_hierarchy_or_template_get
%%==============================================================================

composites_trees_edl_hierarchy_or_template_get(EdlHierarchyOrTemplate) ->
  openapi_api:composites_trees_edl_hierarchy_or_template_get(EdlHierarchyOrTemplate).

composites_trees_edl_hierarchy_or_template_get_args(_S) ->
  [binary()].

%%==============================================================================
%% composites_trees_edl_hierarchy_v_parent_node_id_children_get
%%==============================================================================

composites_trees_edl_hierarchy_v_parent_node_id_children_get(ParentNodeId) ->
  openapi_api:composites_trees_edl_hierarchy_v_parent_node_id_children_get(ParentNodeId).

composites_trees_edl_hierarchy_v_parent_node_id_children_get_args(_S) ->
  [binary()].

%%==============================================================================
%% composites_trees_edl_hierarchy_v_parent_node_id_children_put
%%==============================================================================

composites_trees_edl_hierarchy_v_parent_node_id_children_put(ParentNodeId) ->
  openapi_api:composites_trees_edl_hierarchy_v_parent_node_id_children_put(ParentNodeId).

composites_trees_edl_hierarchy_v_parent_node_id_children_put_args(_S) ->
  [binary()].

%%==============================================================================
%% configuration_component_type_and_record_name_get
%%==============================================================================

configuration_component_type_and_record_name_get(ComponentTypeAndRecordName) ->
  openapi_api:configuration_component_type_and_record_name_get(ComponentTypeAndRecordName).

configuration_component_type_and_record_name_get_args(_S) ->
  [binary()].

%%==============================================================================
%% configuration_component_type_get
%%==============================================================================

configuration_component_type_get(ComponentType) ->
  openapi_api:configuration_component_type_get(ComponentType).

configuration_component_type_get_args(_S) ->
  [binary()].

%%==============================================================================
%% configuration_object_name_and_object_type_get
%%==============================================================================

configuration_object_name_and_object_type_get(ObjectNameAndObjectType) ->
  openapi_api:configuration_object_name_and_object_type_get(ObjectNameAndObjectType).

configuration_object_name_and_object_type_get_args(_S) ->
  [binary()].

%%==============================================================================
%% configuration_objecttype_get
%%==============================================================================

configuration_objecttype_get() ->
  openapi_api:configuration_objecttype_get().

configuration_objecttype_get_args(_S) ->
  [].

%%==============================================================================
%% configuration_role_assignment_rule_delete
%%==============================================================================

configuration_role_assignment_rule_delete() ->
  openapi_api:configuration_role_assignment_rule_delete().

configuration_role_assignment_rule_delete_args(_S) ->
  [].

%%==============================================================================
%% configuration_role_assignment_rule_get
%%==============================================================================

configuration_role_assignment_rule_get() ->
  openapi_api:configuration_role_assignment_rule_get().

configuration_role_assignment_rule_get_args(_S) ->
  [].

%%==============================================================================
%% configuration_role_assignment_rule_post
%%==============================================================================

configuration_role_assignment_rule_post() ->
  openapi_api:configuration_role_assignment_rule_post().

configuration_role_assignment_rule_post_args(_S) ->
  [].

%%==============================================================================
%% configuration_role_assignment_rule_put
%%==============================================================================

configuration_role_assignment_rule_put() ->
  openapi_api:configuration_role_assignment_rule_put().

configuration_role_assignment_rule_put_args(_S) ->
  [].

%%==============================================================================
%% delegation_login_post
%%==============================================================================

delegation_login_post() ->
  openapi_api:delegation_login_post().

delegation_login_post_args(_S) ->
  [].

%%==============================================================================
%% delegation_vaults_get
%%==============================================================================

delegation_vaults_get() ->
  openapi_api:delegation_vaults_get().

delegation_vaults_get_args(_S) ->
  [].

%%==============================================================================
%% keep_alive_post
%%==============================================================================

keep_alive_post() ->
  openapi_api:keep_alive_post().

keep_alive_post_args(_S) ->
  [].

%%==============================================================================
%% limits_get
%%==============================================================================

limits_get() ->
  openapi_api:limits_get().

limits_get_args(_S) ->
  [].

%%==============================================================================
%% logs_api_usage_get
%%==============================================================================

logs_api_usage_get() ->
  openapi_api:logs_api_usage_get().

logs_api_usage_get_args(_S) ->
  [].

%%==============================================================================
%% logs_code_debug_get
%%==============================================================================

logs_code_debug_get() ->
  openapi_api:logs_code_debug_get().

logs_code_debug_get_args(_S) ->
  [].

%%==============================================================================
%% logs_code_debug_id_actions_reset_delete
%%==============================================================================

logs_code_debug_id_actions_reset_delete(Id) ->
  openapi_api:logs_code_debug_id_actions_reset_delete(Id).

logs_code_debug_id_actions_reset_delete_args(_S) ->
  [binary()].

%%==============================================================================
%% logs_code_debug_id_actions_reset_post
%%==============================================================================

logs_code_debug_id_actions_reset_post(Id) ->
  openapi_api:logs_code_debug_id_actions_reset_post(Id).

logs_code_debug_id_actions_reset_post_args(_S) ->
  [binary()].

%%==============================================================================
%% logs_code_debug_id_files_get
%%==============================================================================

logs_code_debug_id_files_get(Id) ->
  openapi_api:logs_code_debug_id_files_get(Id).

logs_code_debug_id_files_get_args(_S) ->
  [binary()].

%%==============================================================================
%% logs_code_debug_id_get
%%==============================================================================

logs_code_debug_id_get(Id) ->
  openapi_api:logs_code_debug_id_get(Id).

logs_code_debug_id_get_args(_S) ->
  [binary()].

%%==============================================================================
%% logs_code_debug_post
%%==============================================================================

logs_code_debug_post() ->
  openapi_api:logs_code_debug_post().

logs_code_debug_post_args(_S) ->
  [].

%%==============================================================================
%% logs_code_runtime_get
%%==============================================================================

logs_code_runtime_get() ->
  openapi_api:logs_code_runtime_get().

logs_code_runtime_get_args(_S) ->
  [].

%%==============================================================================
%% messages_message_type_actions_import_post
%%==============================================================================

messages_message_type_actions_import_post(MessageType) ->
  openapi_api:messages_message_type_actions_import_post(MessageType).

messages_message_type_actions_import_post_args(_S) ->
  [binary()].

%%==============================================================================
%% messages_message_type_language_lang_actions_export_post
%%==============================================================================

messages_message_type_language_lang_actions_export_post(MessageType, Lang) ->
  openapi_api:messages_message_type_language_lang_actions_export_post(MessageType, Lang).

messages_message_type_language_lang_actions_export_post_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% metadata_audittrail_audit_trail_type_get
%%==============================================================================

metadata_audittrail_audit_trail_type_get(AuditTrailType) ->
  openapi_api:metadata_audittrail_audit_trail_type_get(AuditTrailType).

metadata_audittrail_audit_trail_type_get_args(_S) ->
  [binary()].

%%==============================================================================
%% metadata_audittrail_get
%%==============================================================================

metadata_audittrail_get() ->
  openapi_api:metadata_audittrail_get().

metadata_audittrail_get_args(_S) ->
  [].

%%==============================================================================
%% metadata_components_component_type_get
%%==============================================================================

metadata_components_component_type_get(ComponentType) ->
  openapi_api:metadata_components_component_type_get(ComponentType).

metadata_components_component_type_get_args(_S) ->
  [binary()].

%%==============================================================================
%% metadata_components_get
%%==============================================================================

metadata_components_get() ->
  openapi_api:metadata_components_get().

metadata_components_get_args(_S) ->
  [].

%%==============================================================================
%% metadata_objects_binders_templates_bindernodes_get
%%==============================================================================

metadata_objects_binders_templates_bindernodes_get() ->
  openapi_api:metadata_objects_binders_templates_bindernodes_get().

metadata_objects_binders_templates_bindernodes_get_args(_S) ->
  [].

%%==============================================================================
%% metadata_objects_binders_templates_get
%%==============================================================================

metadata_objects_binders_templates_get() ->
  openapi_api:metadata_objects_binders_templates_get().

metadata_objects_binders_templates_get_args(_S) ->
  [].

%%==============================================================================
%% metadata_objects_documents_annotations_placemarks_types_placemark_type_get
%%==============================================================================

metadata_objects_documents_annotations_placemarks_types_placemark_type_get(PlacemarkType) ->
  openapi_api:metadata_objects_documents_annotations_placemarks_types_placemark_type_get(PlacemarkType).

metadata_objects_documents_annotations_placemarks_types_placemark_type_get_args(_S) ->
  [binary()].

%%==============================================================================
%% metadata_objects_documents_annotations_references_types_reference_type_get
%%==============================================================================

metadata_objects_documents_annotations_references_types_reference_type_get(ReferenceType) ->
  openapi_api:metadata_objects_documents_annotations_references_types_reference_type_get(ReferenceType).

metadata_objects_documents_annotations_references_types_reference_type_get_args(_S) ->
  [binary()].

%%==============================================================================
%% metadata_objects_documents_annotations_types_annotation_type_get
%%==============================================================================

metadata_objects_documents_annotations_types_annotation_type_get(AnnotationType) ->
  openapi_api:metadata_objects_documents_annotations_types_annotation_type_get(AnnotationType).

metadata_objects_documents_annotations_types_annotation_type_get_args(_S) ->
  [binary()].

%%==============================================================================
%% metadata_objects_documents_events_event_type_types_event_subtype_get
%%==============================================================================

metadata_objects_documents_events_event_type_types_event_subtype_get(EventType, EventSubtype) ->
  openapi_api:metadata_objects_documents_events_event_type_types_event_subtype_get(EventType, EventSubtype).

metadata_objects_documents_events_event_type_types_event_subtype_get_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% metadata_objects_documents_events_get
%%==============================================================================

metadata_objects_documents_events_get() ->
  openapi_api:metadata_objects_documents_events_get().

metadata_objects_documents_events_get_args(_S) ->
  [].

%%==============================================================================
%% metadata_objects_documents_lock_get
%%==============================================================================

metadata_objects_documents_lock_get() ->
  openapi_api:metadata_objects_documents_lock_get().

metadata_objects_documents_lock_get_args(_S) ->
  [].

%%==============================================================================
%% metadata_objects_documents_properties_find_common_post
%%==============================================================================

metadata_objects_documents_properties_find_common_post() ->
  openapi_api:metadata_objects_documents_properties_find_common_post().

metadata_objects_documents_properties_find_common_post_args(_S) ->
  [].

%%==============================================================================
%% metadata_objects_documents_properties_get
%%==============================================================================

metadata_objects_documents_properties_get() ->
  openapi_api:metadata_objects_documents_properties_get().

metadata_objects_documents_properties_get_args(_S) ->
  [].

%%==============================================================================
%% metadata_objects_documents_templates_get
%%==============================================================================

metadata_objects_documents_templates_get() ->
  openapi_api:metadata_objects_documents_templates_get().

metadata_objects_documents_templates_get_args(_S) ->
  [].

%%==============================================================================
%% metadata_objects_documents_types_get
%%==============================================================================

metadata_objects_documents_types_get() ->
  openapi_api:metadata_objects_documents_types_get().

metadata_objects_documents_types_get_args(_S) ->
  [].

%%==============================================================================
%% metadata_objects_documents_types_type_get
%%==============================================================================

metadata_objects_documents_types_type_get(Type) ->
  openapi_api:metadata_objects_documents_types_type_get(Type).

metadata_objects_documents_types_type_get_args(_S) ->
  [binary()].

%%==============================================================================
%% metadata_objects_documents_types_type_relationships_get
%%==============================================================================

metadata_objects_documents_types_type_relationships_get(Type) ->
  openapi_api:metadata_objects_documents_types_type_relationships_get(Type).

metadata_objects_documents_types_type_relationships_get_args(_S) ->
  [binary()].

%%==============================================================================
%% metadata_objects_documents_types_type_subtypes_subtype_classifications_classification_get
%%==============================================================================

metadata_objects_documents_types_type_subtypes_subtype_classifications_classification_get(Type, Subtype, Classification) ->
  openapi_api:metadata_objects_documents_types_type_subtypes_subtype_classifications_classification_get(Type, Subtype, Classification).

metadata_objects_documents_types_type_subtypes_subtype_classifications_classification_get_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% metadata_objects_documents_types_type_subtypes_subtype_get
%%==============================================================================

metadata_objects_documents_types_type_subtypes_subtype_get(Type, Subtype) ->
  openapi_api:metadata_objects_documents_types_type_subtypes_subtype_get(Type, Subtype).

metadata_objects_documents_types_type_subtypes_subtype_get_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% metadata_objects_groups_get
%%==============================================================================

metadata_objects_groups_get() ->
  openapi_api:metadata_objects_groups_get().

metadata_objects_groups_get_args(_S) ->
  [].

%%==============================================================================
%% metadata_objects_securitypolicies_get
%%==============================================================================

metadata_objects_securitypolicies_get() ->
  openapi_api:metadata_objects_securitypolicies_get().

metadata_objects_securitypolicies_get_args(_S) ->
  [].

%%==============================================================================
%% metadata_objects_users_get
%%==============================================================================

metadata_objects_users_get() ->
  openapi_api:metadata_objects_users_get().

metadata_objects_users_get_args(_S) ->
  [].

%%==============================================================================
%% metadata_query_archived_documents_relationships_document_signature_sysr_get
%%==============================================================================

metadata_query_archived_documents_relationships_document_signature_sysr_get() ->
  openapi_api:metadata_query_archived_documents_relationships_document_signature_sysr_get().

metadata_query_archived_documents_relationships_document_signature_sysr_get_args(_S) ->
  [].

%%==============================================================================
%% metadata_query_documents_relationships_document_signature_sysr_get
%%==============================================================================

metadata_query_documents_relationships_document_signature_sysr_get() ->
  openapi_api:metadata_query_documents_relationships_document_signature_sysr_get().

metadata_query_documents_relationships_document_signature_sysr_get_args(_S) ->
  [].

%%==============================================================================
%% metadata_vobjects_get
%%==============================================================================

metadata_vobjects_get() ->
  openapi_api:metadata_vobjects_get().

metadata_vobjects_get_args(_S) ->
  [].

%%==============================================================================
%% metadata_vobjects_object_name_actions_canceldeployment_post
%%==============================================================================

metadata_vobjects_object_name_actions_canceldeployment_post(ObjectName) ->
  openapi_api:metadata_vobjects_object_name_actions_canceldeployment_post(ObjectName).

metadata_vobjects_object_name_actions_canceldeployment_post_args(_S) ->
  [binary()].

%%==============================================================================
%% metadata_vobjects_object_name_fields_object_field_name_get
%%==============================================================================

metadata_vobjects_object_name_fields_object_field_name_get(ObjectName, ObjectFieldName) ->
  openapi_api:metadata_vobjects_object_name_fields_object_field_name_get(ObjectName, ObjectFieldName).

metadata_vobjects_object_name_fields_object_field_name_get_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% metadata_vobjects_object_name_get
%%==============================================================================

metadata_vobjects_object_name_get(ObjectName) ->
  openapi_api:metadata_vobjects_object_name_get(ObjectName).

metadata_vobjects_object_name_get_args(_S) ->
  [binary()].

%%==============================================================================
%% metadata_vobjects_object_name_page_layouts_get
%%==============================================================================

metadata_vobjects_object_name_page_layouts_get(ObjectName) ->
  openapi_api:metadata_vobjects_object_name_page_layouts_get(ObjectName).

metadata_vobjects_object_name_page_layouts_get_args(_S) ->
  [binary()].

%%==============================================================================
%% metadata_vobjects_object_name_page_layouts_layout_name_get
%%==============================================================================

metadata_vobjects_object_name_page_layouts_layout_name_get(ObjectName, LayoutName) ->
  openapi_api:metadata_vobjects_object_name_page_layouts_layout_name_get(ObjectName, LayoutName).

metadata_vobjects_object_name_page_layouts_layout_name_get_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% notifications_histories_get
%%==============================================================================

notifications_histories_get() ->
  openapi_api:notifications_histories_get().

notifications_histories_get_args(_S) ->
  [].

%%==============================================================================
%% object_workflow_actions_action_get
%%==============================================================================

object_workflow_actions_action_get(Action) ->
  openapi_api:object_workflow_actions_action_get(Action).

object_workflow_actions_action_get_args(_S) ->
  [binary()].

%%==============================================================================
%% object_workflow_actions_action_post
%%==============================================================================

object_workflow_actions_action_post(Action) ->
  openapi_api:object_workflow_actions_action_post(Action).

object_workflow_actions_action_post_args(_S) ->
  [binary()].

%%==============================================================================
%% object_workflow_actions_canceltasks_post
%%==============================================================================

object_workflow_actions_canceltasks_post() ->
  openapi_api:object_workflow_actions_canceltasks_post().

object_workflow_actions_canceltasks_post_args(_S) ->
  [].

%%==============================================================================
%% object_workflow_actions_cancelworkflows_post
%%==============================================================================

object_workflow_actions_cancelworkflows_post() ->
  openapi_api:object_workflow_actions_cancelworkflows_post().

object_workflow_actions_cancelworkflows_post_args(_S) ->
  [].

%%==============================================================================
%% object_workflow_actions_get
%%==============================================================================

object_workflow_actions_get() ->
  openapi_api:object_workflow_actions_get().

object_workflow_actions_get_args(_S) ->
  [].

%%==============================================================================
%% object_workflow_actions_reassigntasks_post
%%==============================================================================

object_workflow_actions_reassigntasks_post() ->
  openapi_api:object_workflow_actions_reassigntasks_post().

object_workflow_actions_reassigntasks_post_args(_S) ->
  [].

%%==============================================================================
%% object_workflow_actions_replaceworkflowowner_post
%%==============================================================================

object_workflow_actions_replaceworkflowowner_post() ->
  openapi_api:object_workflow_actions_replaceworkflowowner_post().

object_workflow_actions_replaceworkflowowner_post_args(_S) ->
  [].

%%==============================================================================
%% objects_binders_actions_export_job_id_results_get
%%==============================================================================

objects_binders_actions_export_job_id_results_get(JobId) ->
  openapi_api:objects_binders_actions_export_job_id_results_get(JobId).

objects_binders_actions_export_job_id_results_get_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_binders_binder_id_actions_export_post
%%==============================================================================

objects_binders_binder_id_actions_export_post(BinderId) ->
  openapi_api:objects_binders_binder_id_actions_export_post(BinderId).

objects_binders_binder_id_actions_export_post_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_binders_binder_id_actions_post
%%==============================================================================

objects_binders_binder_id_actions_post(BinderId) ->
  openapi_api:objects_binders_binder_id_actions_post(BinderId).

objects_binders_binder_id_actions_post_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_binders_binder_id_binding_rule_put
%%==============================================================================

objects_binders_binder_id_binding_rule_put(BinderId) ->
  openapi_api:objects_binders_binder_id_binding_rule_put(BinderId).

objects_binders_binder_id_binding_rule_put_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_binders_binder_id_delete
%%==============================================================================

objects_binders_binder_id_delete(BinderId) ->
  openapi_api:objects_binders_binder_id_delete(BinderId).

objects_binders_binder_id_delete_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_binders_binder_id_documents_node_id_binding_rule_put
%%==============================================================================

objects_binders_binder_id_documents_node_id_binding_rule_put(BinderId, NodeId) ->
  openapi_api:objects_binders_binder_id_documents_node_id_binding_rule_put(BinderId, NodeId).

objects_binders_binder_id_documents_node_id_binding_rule_put_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% objects_binders_binder_id_documents_post
%%==============================================================================

objects_binders_binder_id_documents_post(BinderId) ->
  openapi_api:objects_binders_binder_id_documents_post(BinderId).

objects_binders_binder_id_documents_post_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_binders_binder_id_documents_section_id_delete
%%==============================================================================

objects_binders_binder_id_documents_section_id_delete(BinderId, SectionId) ->
  openapi_api:objects_binders_binder_id_documents_section_id_delete(BinderId, SectionId).

objects_binders_binder_id_documents_section_id_delete_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% objects_binders_binder_id_documents_section_id_put
%%==============================================================================

objects_binders_binder_id_documents_section_id_put(BinderId, SectionId) ->
  openapi_api:objects_binders_binder_id_documents_section_id_put(BinderId, SectionId).

objects_binders_binder_id_documents_section_id_put_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% objects_binders_binder_id_get
%%==============================================================================

objects_binders_binder_id_get(BinderId) ->
  openapi_api:objects_binders_binder_id_get(BinderId).

objects_binders_binder_id_get_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_binders_binder_id_post
%%==============================================================================

objects_binders_binder_id_post(BinderId) ->
  openapi_api:objects_binders_binder_id_post(BinderId).

objects_binders_binder_id_post_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_binders_binder_id_put
%%==============================================================================

objects_binders_binder_id_put(BinderId) ->
  openapi_api:objects_binders_binder_id_put(BinderId).

objects_binders_binder_id_put_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_binders_binder_id_roles_role_name_and_user_or_group_id_delete
%%==============================================================================

objects_binders_binder_id_roles_role_name_and_user_or_group_id_delete(BinderId, RoleNameAndUserOrGroup, Id) ->
  openapi_api:objects_binders_binder_id_roles_role_name_and_user_or_group_id_delete(BinderId, RoleNameAndUserOrGroup, Id).

objects_binders_binder_id_roles_role_name_and_user_or_group_id_delete_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% objects_binders_binder_id_sections_node_id_binding_rule_put
%%==============================================================================

objects_binders_binder_id_sections_node_id_binding_rule_put(BinderId, NodeId) ->
  openapi_api:objects_binders_binder_id_sections_node_id_binding_rule_put(BinderId, NodeId).

objects_binders_binder_id_sections_node_id_binding_rule_put_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% objects_binders_binder_id_sections_node_id_put
%%==============================================================================

objects_binders_binder_id_sections_node_id_put(BinderId, NodeId) ->
  openapi_api:objects_binders_binder_id_sections_node_id_put(BinderId, NodeId).

objects_binders_binder_id_sections_node_id_put_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% objects_binders_binder_id_sections_post
%%==============================================================================

objects_binders_binder_id_sections_post(BinderId) ->
  openapi_api:objects_binders_binder_id_sections_post(BinderId).

objects_binders_binder_id_sections_post_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_binders_binder_id_sections_section_id_delete
%%==============================================================================

objects_binders_binder_id_sections_section_id_delete(BinderId, SectionId) ->
  openapi_api:objects_binders_binder_id_sections_section_id_delete(BinderId, SectionId).

objects_binders_binder_id_sections_section_id_delete_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% objects_binders_binder_id_sections_section_id_get
%%==============================================================================

objects_binders_binder_id_sections_section_id_get(BinderId, SectionId) ->
  openapi_api:objects_binders_binder_id_sections_section_id_get(BinderId, SectionId).

objects_binders_binder_id_sections_section_id_get_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% objects_binders_binder_id_versions_get
%%==============================================================================

objects_binders_binder_id_versions_get(BinderId) ->
  openapi_api:objects_binders_binder_id_versions_get(BinderId).

objects_binders_binder_id_versions_get_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_binders_binder_id_versions_major_version_minor_version_actions_export_post
%%==============================================================================

objects_binders_binder_id_versions_major_version_minor_version_actions_export_post(BinderId, MajorVersion, MinorVersion) ->
  openapi_api:objects_binders_binder_id_versions_major_version_minor_version_actions_export_post(BinderId, MajorVersion, MinorVersion).

objects_binders_binder_id_versions_major_version_minor_version_actions_export_post_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% objects_binders_binder_id_versions_major_version_minor_version_delete
%%==============================================================================

objects_binders_binder_id_versions_major_version_minor_version_delete(BinderId, MajorVersion, MinorVersion) ->
  openapi_api:objects_binders_binder_id_versions_major_version_minor_version_delete(BinderId, MajorVersion, MinorVersion).

objects_binders_binder_id_versions_major_version_minor_version_delete_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% objects_binders_binder_id_versions_major_version_minor_version_get
%%==============================================================================

objects_binders_binder_id_versions_major_version_minor_version_get(BinderId, MajorVersion, MinorVersion) ->
  openapi_api:objects_binders_binder_id_versions_major_version_minor_version_get(BinderId, MajorVersion, MinorVersion).

objects_binders_binder_id_versions_major_version_minor_version_get_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% objects_binders_binder_id_versions_major_version_minor_version_put
%%==============================================================================

objects_binders_binder_id_versions_major_version_minor_version_put(BinderId, MajorVersion, MinorVersion) ->
  openapi_api:objects_binders_binder_id_versions_major_version_minor_version_put(BinderId, MajorVersion, MinorVersion).

objects_binders_binder_id_versions_major_version_minor_version_put_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% objects_binders_binder_id_versions_major_version_minor_version_relationships_post
%%==============================================================================

objects_binders_binder_id_versions_major_version_minor_version_relationships_post(BinderId, MajorVersion, MinorVersion) ->
  openapi_api:objects_binders_binder_id_versions_major_version_minor_version_relationships_post(BinderId, MajorVersion, MinorVersion).

objects_binders_binder_id_versions_major_version_minor_version_relationships_post_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_delete
%%==============================================================================

objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_delete(BinderId, MajorVersion, MinorVersion, RelationshipId) ->
  openapi_api:objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_delete(BinderId, MajorVersion, MinorVersion, RelationshipId).

objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_delete_args(_S) ->
  [binary(), binary(), binary(), binary()].

%%==============================================================================
%% objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_get
%%==============================================================================

objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_get(BinderId, MajorVersion, MinorVersion, RelationshipId) ->
  openapi_api:objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_get(BinderId, MajorVersion, MinorVersion, RelationshipId).

objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_get_args(_S) ->
  [binary(), binary(), binary(), binary()].

%%==============================================================================
%% objects_binders_binder_id_versions_major_version_minor_version_sections_section_id_get
%%==============================================================================

objects_binders_binder_id_versions_major_version_minor_version_sections_section_id_get(BinderId, MajorVersion, MinorVersion, SectionId) ->
  openapi_api:objects_binders_binder_id_versions_major_version_minor_version_sections_section_id_get(BinderId, MajorVersion, MinorVersion, SectionId).

objects_binders_binder_id_versions_major_version_minor_version_sections_section_id_get_args(_S) ->
  [binary(), binary(), binary(), binary()].

%%==============================================================================
%% objects_binders_id_roles_get
%%==============================================================================

objects_binders_id_roles_get(Id) ->
  openapi_api:objects_binders_id_roles_get(Id).

objects_binders_id_roles_get_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_binders_id_roles_post
%%==============================================================================

objects_binders_id_roles_post(Id) ->
  openapi_api:objects_binders_id_roles_post(Id).

objects_binders_id_roles_post_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_binders_id_roles_role_name_get
%%==============================================================================

objects_binders_id_roles_role_name_get(Id, RoleName) ->
  openapi_api:objects_binders_id_roles_role_name_get(Id, RoleName).

objects_binders_id_roles_role_name_get_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% objects_binders_id_versions_major_version_minor_version_lifecycle_actions_get
%%==============================================================================

objects_binders_id_versions_major_version_minor_version_lifecycle_actions_get(Id, MajorVersion, MinorVersion) ->
  openapi_api:objects_binders_id_versions_major_version_minor_version_lifecycle_actions_get(Id, MajorVersion, MinorVersion).

objects_binders_id_versions_major_version_minor_version_lifecycle_actions_get_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get
%%==============================================================================

objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get(Id, MajorVersion, MinorVersion, NameV) ->
  openapi_api:objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get(Id, MajorVersion, MinorVersion, NameV).

objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get_args(_S) ->
  [binary(), binary(), binary(), binary()].

%%==============================================================================
%% objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_put
%%==============================================================================

objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_put(Id, MajorVersion, MinorVersion, NameV) ->
  openapi_api:objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_put(Id, MajorVersion, MinorVersion, NameV).

objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_v_put_args(_S) ->
  [binary(), binary(), binary(), binary()].

%%==============================================================================
%% objects_binders_lifecycle_actions_post
%%==============================================================================

objects_binders_lifecycle_actions_post() ->
  openapi_api:objects_binders_lifecycle_actions_post().

objects_binders_lifecycle_actions_post_args(_S) ->
  [].

%%==============================================================================
%% objects_binders_lifecycle_actions_user_action_name_put
%%==============================================================================

objects_binders_lifecycle_actions_user_action_name_put(UserActionName) ->
  openapi_api:objects_binders_lifecycle_actions_user_action_name_put(UserActionName).

objects_binders_lifecycle_actions_user_action_name_put_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_binders_post
%%==============================================================================

objects_binders_post() ->
  openapi_api:objects_binders_post().

objects_binders_post_args(_S) ->
  [].

%%==============================================================================
%% objects_binders_templates_get
%%==============================================================================

objects_binders_templates_get() ->
  openapi_api:objects_binders_templates_get().

objects_binders_templates_get_args(_S) ->
  [].

%%==============================================================================
%% objects_binders_templates_post
%%==============================================================================

objects_binders_templates_post() ->
  openapi_api:objects_binders_templates_post().

objects_binders_templates_post_args(_S) ->
  [].

%%==============================================================================
%% objects_binders_templates_put
%%==============================================================================

objects_binders_templates_put() ->
  openapi_api:objects_binders_templates_put().

objects_binders_templates_put_args(_S) ->
  [].

%%==============================================================================
%% objects_binders_templates_template_name_bindernodes_get
%%==============================================================================

objects_binders_templates_template_name_bindernodes_get(TemplateName) ->
  openapi_api:objects_binders_templates_template_name_bindernodes_get(TemplateName).

objects_binders_templates_template_name_bindernodes_get_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_binders_templates_template_name_bindernodes_post
%%==============================================================================

objects_binders_templates_template_name_bindernodes_post(TemplateName) ->
  openapi_api:objects_binders_templates_template_name_bindernodes_post(TemplateName).

objects_binders_templates_template_name_bindernodes_post_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_binders_templates_template_name_bindernodes_put
%%==============================================================================

objects_binders_templates_template_name_bindernodes_put(TemplateName) ->
  openapi_api:objects_binders_templates_template_name_bindernodes_put(TemplateName).

objects_binders_templates_template_name_bindernodes_put_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_binders_templates_template_name_delete
%%==============================================================================

objects_binders_templates_template_name_delete(TemplateName) ->
  openapi_api:objects_binders_templates_template_name_delete(TemplateName).

objects_binders_templates_template_name_delete_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_binders_templates_template_name_get
%%==============================================================================

objects_binders_templates_template_name_get(TemplateName) ->
  openapi_api:objects_binders_templates_template_name_get(TemplateName).

objects_binders_templates_template_name_get_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_deletions_documents_get
%%==============================================================================

objects_deletions_documents_get() ->
  openapi_api:objects_deletions_documents_get().

objects_deletions_documents_get_args(_S) ->
  [].

%%==============================================================================
%% objects_deletions_vobjects_object_name_get
%%==============================================================================

objects_deletions_vobjects_object_name_get(ObjectName) ->
  openapi_api:objects_deletions_vobjects_object_name_get(ObjectName).

objects_deletions_vobjects_object_name_get_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_documents_actions_get
%%==============================================================================

objects_documents_actions_get() ->
  openapi_api:objects_documents_actions_get().

objects_documents_actions_get_args(_S) ->
  [].

%%==============================================================================
%% objects_documents_actions_lifecycle_and_state_and_action_job_id_results_get
%%==============================================================================

objects_documents_actions_lifecycle_and_state_and_action_job_id_results_get(LifecycleAndStateAndAction, JobId) ->
  openapi_api:objects_documents_actions_lifecycle_and_state_and_action_job_id_results_get(LifecycleAndStateAndAction, JobId).

objects_documents_actions_lifecycle_and_state_and_action_job_id_results_get_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% objects_documents_actions_workflow_name_get
%%==============================================================================

objects_documents_actions_workflow_name_get(WorkflowName) ->
  openapi_api:objects_documents_actions_workflow_name_get(WorkflowName).

objects_documents_actions_workflow_name_get_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_documents_actions_workflow_name_post
%%==============================================================================

objects_documents_actions_workflow_name_post(WorkflowName) ->
  openapi_api:objects_documents_actions_workflow_name_post(WorkflowName).

objects_documents_actions_workflow_name_post_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_documents_annotations_batch_delete
%%==============================================================================

objects_documents_annotations_batch_delete() ->
  openapi_api:objects_documents_annotations_batch_delete().

objects_documents_annotations_batch_delete_args(_S) ->
  [].

%%==============================================================================
%% objects_documents_annotations_batch_post
%%==============================================================================

objects_documents_annotations_batch_post(Authorization, ContentType, Accept, XVaultAPIClientID) ->
  openapi_api:objects_documents_annotations_batch_post(Authorization, ContentType, Accept, XVaultAPIClientID).

objects_documents_annotations_batch_post_args(_S) ->
  [binary(), binary(), binary(), binary()].

%%==============================================================================
%% objects_documents_annotations_batch_put
%%==============================================================================

objects_documents_annotations_batch_put() ->
  openapi_api:objects_documents_annotations_batch_put().

objects_documents_annotations_batch_put_args(_S) ->
  [].

%%==============================================================================
%% objects_documents_annotations_replies_batch_post
%%==============================================================================

objects_documents_annotations_replies_batch_post() ->
  openapi_api:objects_documents_annotations_replies_batch_post().

objects_documents_annotations_replies_batch_post_args(_S) ->
  [].

%%==============================================================================
%% objects_documents_attachments_batch_delete
%%==============================================================================

objects_documents_attachments_batch_delete() ->
  openapi_api:objects_documents_attachments_batch_delete().

objects_documents_attachments_batch_delete_args(_S) ->
  [].

%%==============================================================================
%% objects_documents_attachments_batch_post
%%==============================================================================

objects_documents_attachments_batch_post() ->
  openapi_api:objects_documents_attachments_batch_post().

objects_documents_attachments_batch_post_args(_S) ->
  [].

%%==============================================================================
%% objects_documents_attachments_batch_put
%%==============================================================================

objects_documents_attachments_batch_put() ->
  openapi_api:objects_documents_attachments_batch_put().

objects_documents_attachments_batch_put_args(_S) ->
  [].

%%==============================================================================
%% objects_documents_batch_actions_fileextract_job_id_results_get
%%==============================================================================

objects_documents_batch_actions_fileextract_job_id_results_get(JobId) ->
  openapi_api:objects_documents_batch_actions_fileextract_job_id_results_get(JobId).

objects_documents_batch_actions_fileextract_job_id_results_get_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_documents_batch_actions_fileextract_post
%%==============================================================================

objects_documents_batch_actions_fileextract_post() ->
  openapi_api:objects_documents_batch_actions_fileextract_post().

objects_documents_batch_actions_fileextract_post_args(_S) ->
  [].

%%==============================================================================
%% objects_documents_batch_actions_reclassify_put
%%==============================================================================

objects_documents_batch_actions_reclassify_put() ->
  openapi_api:objects_documents_batch_actions_reclassify_put().

objects_documents_batch_actions_reclassify_put_args(_S) ->
  [].

%%==============================================================================
%% objects_documents_batch_actions_rerender_post
%%==============================================================================

objects_documents_batch_actions_rerender_post() ->
  openapi_api:objects_documents_batch_actions_rerender_post().

objects_documents_batch_actions_rerender_post_args(_S) ->
  [].

%%==============================================================================
%% objects_documents_batch_delete
%%==============================================================================

objects_documents_batch_delete() ->
  openapi_api:objects_documents_batch_delete().

objects_documents_batch_delete_args(_S) ->
  [].

%%==============================================================================
%% objects_documents_batch_lock_delete
%%==============================================================================

objects_documents_batch_lock_delete() ->
  openapi_api:objects_documents_batch_lock_delete().

objects_documents_batch_lock_delete_args(_S) ->
  [].

%%==============================================================================
%% objects_documents_batch_post
%%==============================================================================

objects_documents_batch_post() ->
  openapi_api:objects_documents_batch_post().

objects_documents_batch_post_args(_S) ->
  [].

%%==============================================================================
%% objects_documents_batch_put
%%==============================================================================

objects_documents_batch_put() ->
  openapi_api:objects_documents_batch_put().

objects_documents_batch_put_args(_S) ->
  [].

%%==============================================================================
%% objects_documents_doc_id_anchors_get
%%==============================================================================

objects_documents_doc_id_anchors_get(DocId) ->
  openapi_api:objects_documents_doc_id_anchors_get(DocId).

objects_documents_doc_id_anchors_get_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_documents_doc_id_annotations_file_get
%%==============================================================================

objects_documents_doc_id_annotations_file_get(DocId) ->
  openapi_api:objects_documents_doc_id_annotations_file_get(DocId).

objects_documents_doc_id_annotations_file_get_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_documents_doc_id_annotations_file_post
%%==============================================================================

objects_documents_doc_id_annotations_file_post(DocId) ->
  openapi_api:objects_documents_doc_id_annotations_file_post(DocId).

objects_documents_doc_id_annotations_file_post_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_documents_doc_id_attachments_attachment_id_delete
%%==============================================================================

objects_documents_doc_id_attachments_attachment_id_delete(DocId, AttachmentId) ->
  openapi_api:objects_documents_doc_id_attachments_attachment_id_delete(DocId, AttachmentId).

objects_documents_doc_id_attachments_attachment_id_delete_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_attachments_attachment_id_file_get
%%==============================================================================

objects_documents_doc_id_attachments_attachment_id_file_get(DocId, AttachmentId) ->
  openapi_api:objects_documents_doc_id_attachments_attachment_id_file_get(DocId, AttachmentId).

objects_documents_doc_id_attachments_attachment_id_file_get_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_attachments_attachment_id_get
%%==============================================================================

objects_documents_doc_id_attachments_attachment_id_get(DocId, AttachmentId) ->
  openapi_api:objects_documents_doc_id_attachments_attachment_id_get(DocId, AttachmentId).

objects_documents_doc_id_attachments_attachment_id_get_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_attachments_attachment_id_put
%%==============================================================================

objects_documents_doc_id_attachments_attachment_id_put(DocId, AttachmentId) ->
  openapi_api:objects_documents_doc_id_attachments_attachment_id_put(DocId, AttachmentId).

objects_documents_doc_id_attachments_attachment_id_put_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_delete
%%==============================================================================

objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_delete(DocId, AttachmentId, AttachmentVersion) ->
  openapi_api:objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_delete(DocId, AttachmentId, AttachmentVersion).

objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_delete_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_file_get
%%==============================================================================

objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_file_get(DocId, AttachmentId, AttachmentVersion) ->
  openapi_api:objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_file_get(DocId, AttachmentId, AttachmentVersion).

objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_file_get_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_get
%%==============================================================================

objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_get(DocId, AttachmentId, AttachmentVersion) ->
  openapi_api:objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_get(DocId, AttachmentId, AttachmentVersion).

objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_get_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_post
%%==============================================================================

objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_post(DocId, AttachmentId, AttachmentVersion) ->
  openapi_api:objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_post(DocId, AttachmentId, AttachmentVersion).

objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_post_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_attachments_attachment_id_versions_get
%%==============================================================================

objects_documents_doc_id_attachments_attachment_id_versions_get(DocId, AttachmentId) ->
  openapi_api:objects_documents_doc_id_attachments_attachment_id_versions_get(DocId, AttachmentId).

objects_documents_doc_id_attachments_attachment_id_versions_get_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_attachments_file_get
%%==============================================================================

objects_documents_doc_id_attachments_file_get(DocId) ->
  openapi_api:objects_documents_doc_id_attachments_file_get(DocId).

objects_documents_doc_id_attachments_file_get_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_documents_doc_id_attachments_get
%%==============================================================================

objects_documents_doc_id_attachments_get(DocId) ->
  openapi_api:objects_documents_doc_id_attachments_get(DocId).

objects_documents_doc_id_attachments_get_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_documents_doc_id_attachments_post
%%==============================================================================

objects_documents_doc_id_attachments_post(DocId) ->
  openapi_api:objects_documents_doc_id_attachments_post(DocId).

objects_documents_doc_id_attachments_post_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_documents_doc_id_audittrail_get
%%==============================================================================

objects_documents_doc_id_audittrail_get(DocId) ->
  openapi_api:objects_documents_doc_id_audittrail_get(DocId).

objects_documents_doc_id_audittrail_get_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_documents_doc_id_delete
%%==============================================================================

objects_documents_doc_id_delete(DocId) ->
  openapi_api:objects_documents_doc_id_delete(DocId).

objects_documents_doc_id_delete_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_documents_doc_id_events_get
%%==============================================================================

objects_documents_doc_id_events_get(DocId) ->
  openapi_api:objects_documents_doc_id_events_get(DocId).

objects_documents_doc_id_events_get_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_documents_doc_id_file_get
%%==============================================================================

objects_documents_doc_id_file_get(DocId) ->
  openapi_api:objects_documents_doc_id_file_get(DocId).

objects_documents_doc_id_file_get_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_documents_doc_id_get
%%==============================================================================

objects_documents_doc_id_get(DocId) ->
  openapi_api:objects_documents_doc_id_get(DocId).

objects_documents_doc_id_get_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_documents_doc_id_lock_delete
%%==============================================================================

objects_documents_doc_id_lock_delete(DocId) ->
  openapi_api:objects_documents_doc_id_lock_delete(DocId).

objects_documents_doc_id_lock_delete_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_documents_doc_id_lock_get
%%==============================================================================

objects_documents_doc_id_lock_get(DocId) ->
  openapi_api:objects_documents_doc_id_lock_get(DocId).

objects_documents_doc_id_lock_get_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_documents_doc_id_lock_post
%%==============================================================================

objects_documents_doc_id_lock_post(DocId) ->
  openapi_api:objects_documents_doc_id_lock_post(DocId).

objects_documents_doc_id_lock_post_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_documents_doc_id_major_version_minor_version_attachments_file_get
%%==============================================================================

objects_documents_doc_id_major_version_minor_version_attachments_file_get(DocId, MajorVersion, MinorVersion) ->
  openapi_api:objects_documents_doc_id_major_version_minor_version_attachments_file_get(DocId, MajorVersion, MinorVersion).

objects_documents_doc_id_major_version_minor_version_attachments_file_get_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_post
%%==============================================================================

objects_documents_doc_id_post(DocId) ->
  openapi_api:objects_documents_doc_id_post(DocId).

objects_documents_doc_id_post_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_documents_doc_id_put
%%==============================================================================

objects_documents_doc_id_put(DocId) ->
  openapi_api:objects_documents_doc_id_put(DocId).

objects_documents_doc_id_put_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_documents_doc_id_renditions_get
%%==============================================================================

objects_documents_doc_id_renditions_get(DocId) ->
  openapi_api:objects_documents_doc_id_renditions_get(DocId).

objects_documents_doc_id_renditions_get_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_documents_doc_id_renditions_rendition_type_delete
%%==============================================================================

objects_documents_doc_id_renditions_rendition_type_delete(DocId, RenditionType) ->
  openapi_api:objects_documents_doc_id_renditions_rendition_type_delete(DocId, RenditionType).

objects_documents_doc_id_renditions_rendition_type_delete_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_renditions_rendition_type_get
%%==============================================================================

objects_documents_doc_id_renditions_rendition_type_get(DocId, RenditionType) ->
  openapi_api:objects_documents_doc_id_renditions_rendition_type_get(DocId, RenditionType).

objects_documents_doc_id_renditions_rendition_type_get_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_renditions_rendition_type_post
%%==============================================================================

objects_documents_doc_id_renditions_rendition_type_post(DocId, RenditionType) ->
  openapi_api:objects_documents_doc_id_renditions_rendition_type_post(DocId, RenditionType).

objects_documents_doc_id_renditions_rendition_type_post_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_renditions_rendition_type_put
%%==============================================================================

objects_documents_doc_id_renditions_rendition_type_put(DocId, RenditionType) ->
  openapi_api:objects_documents_doc_id_renditions_rendition_type_put(DocId, RenditionType).

objects_documents_doc_id_renditions_rendition_type_put_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_roles_role_name_and_user_or_group_id_delete
%%==============================================================================

objects_documents_doc_id_roles_role_name_and_user_or_group_id_delete(DocId, RoleNameAndUserOrGroup, Id) ->
  openapi_api:objects_documents_doc_id_roles_role_name_and_user_or_group_id_delete(DocId, RoleNameAndUserOrGroup, Id).

objects_documents_doc_id_roles_role_name_and_user_or_group_id_delete_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_version_major_version_minor_version_attachments_get
%%==============================================================================

objects_documents_doc_id_version_major_version_minor_version_attachments_get(DocId, MajorVersion, MinorVersion) ->
  openapi_api:objects_documents_doc_id_version_major_version_minor_version_attachments_get(DocId, MajorVersion, MinorVersion).

objects_documents_doc_id_version_major_version_minor_version_attachments_get_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_versions_get
%%==============================================================================

objects_documents_doc_id_versions_get(DocId) ->
  openapi_api:objects_documents_doc_id_versions_get(DocId).

objects_documents_doc_id_versions_get_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_get
%%==============================================================================

objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_get(DocId, MajorVersion, MinorVersion, AnnotationId) ->
  openapi_api:objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_get(DocId, MajorVersion, MinorVersion, AnnotationId).

objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_get_args(_S) ->
  [binary(), binary(), binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_replies_get
%%==============================================================================

objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_replies_get(DocId, MajorVersion, MinorVersion, AnnotationId) ->
  openapi_api:objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_replies_get(DocId, MajorVersion, MinorVersion, AnnotationId).

objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_replies_get_args(_S) ->
  [binary(), binary(), binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_versions_major_version_minor_version_annotations_file_get
%%==============================================================================

objects_documents_doc_id_versions_major_version_minor_version_annotations_file_get(DocId, MajorVersion, MinorVersion) ->
  openapi_api:objects_documents_doc_id_versions_major_version_minor_version_annotations_file_get(DocId, MajorVersion, MinorVersion).

objects_documents_doc_id_versions_major_version_minor_version_annotations_file_get_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_versions_major_version_minor_version_annotations_file_post
%%==============================================================================

objects_documents_doc_id_versions_major_version_minor_version_annotations_file_post(DocId, MajorVersion, MinorVersion) ->
  openapi_api:objects_documents_doc_id_versions_major_version_minor_version_annotations_file_post(DocId, MajorVersion, MinorVersion).

objects_documents_doc_id_versions_major_version_minor_version_annotations_file_post_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_versions_major_version_minor_version_annotations_get
%%==============================================================================

objects_documents_doc_id_versions_major_version_minor_version_annotations_get(DocId, MajorVersion, MinorVersion) ->
  openapi_api:objects_documents_doc_id_versions_major_version_minor_version_annotations_get(DocId, MajorVersion, MinorVersion).

objects_documents_doc_id_versions_major_version_minor_version_annotations_get_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_file_get
%%==============================================================================

objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_file_get(DocId, MajorVersion, MinorVersion, AttachmentId, AttachmentVersion) ->
  openapi_api:objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_file_get(DocId, MajorVersion, MinorVersion, AttachmentId, AttachmentVersion).

objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_file_get_args(_S) ->
  [binary(), binary(), binary(), binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_get
%%==============================================================================

objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_get(DocId, MajorVersion, MinorVersion, AttachmentId, AttachmentVersion) ->
  openapi_api:objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_get(DocId, MajorVersion, MinorVersion, AttachmentId, AttachmentVersion).

objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_get_args(_S) ->
  [binary(), binary(), binary(), binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_versions_major_version_minor_version_delete
%%==============================================================================

objects_documents_doc_id_versions_major_version_minor_version_delete(DocId, MajorVersion, MinorVersion) ->
  openapi_api:objects_documents_doc_id_versions_major_version_minor_version_delete(DocId, MajorVersion, MinorVersion).

objects_documents_doc_id_versions_major_version_minor_version_delete_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_versions_major_version_minor_version_doc_export_annotations_to_csv_get
%%==============================================================================

objects_documents_doc_id_versions_major_version_minor_version_doc_export_annotations_to_csv_get(DocId, MajorVersion, MinorVersion) ->
  openapi_api:objects_documents_doc_id_versions_major_version_minor_version_doc_export_annotations_to_csv_get(DocId, MajorVersion, MinorVersion).

objects_documents_doc_id_versions_major_version_minor_version_doc_export_annotations_to_csv_get_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_versions_major_version_minor_version_events_post
%%==============================================================================

objects_documents_doc_id_versions_major_version_minor_version_events_post(DocId, MajorVersion, MinorVersion) ->
  openapi_api:objects_documents_doc_id_versions_major_version_minor_version_events_post(DocId, MajorVersion, MinorVersion).

objects_documents_doc_id_versions_major_version_minor_version_events_post_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_versions_major_version_minor_version_export_video_annotations_get
%%==============================================================================

objects_documents_doc_id_versions_major_version_minor_version_export_video_annotations_get(DocId, MajorVersion, MinorVersion) ->
  openapi_api:objects_documents_doc_id_versions_major_version_minor_version_export_video_annotations_get(DocId, MajorVersion, MinorVersion).

objects_documents_doc_id_versions_major_version_minor_version_export_video_annotations_get_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_versions_major_version_minor_version_file_get
%%==============================================================================

objects_documents_doc_id_versions_major_version_minor_version_file_get(DocId, MajorVersion, MinorVersion) ->
  openapi_api:objects_documents_doc_id_versions_major_version_minor_version_file_get(DocId, MajorVersion, MinorVersion).

objects_documents_doc_id_versions_major_version_minor_version_file_get_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_versions_major_version_minor_version_get
%%==============================================================================

objects_documents_doc_id_versions_major_version_minor_version_get(DocId, MajorVersion, MinorVersion) ->
  openapi_api:objects_documents_doc_id_versions_major_version_minor_version_get(DocId, MajorVersion, MinorVersion).

objects_documents_doc_id_versions_major_version_minor_version_get_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_versions_major_version_minor_version_put
%%==============================================================================

objects_documents_doc_id_versions_major_version_minor_version_put(DocId, MajorVersion, MinorVersion) ->
  openapi_api:objects_documents_doc_id_versions_major_version_minor_version_put(DocId, MajorVersion, MinorVersion).

objects_documents_doc_id_versions_major_version_minor_version_put_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_versions_major_version_minor_version_relationships_get
%%==============================================================================

objects_documents_doc_id_versions_major_version_minor_version_relationships_get(DocId, MajorVersion, MinorVersion) ->
  openapi_api:objects_documents_doc_id_versions_major_version_minor_version_relationships_get(DocId, MajorVersion, MinorVersion).

objects_documents_doc_id_versions_major_version_minor_version_relationships_get_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_versions_major_version_minor_version_relationships_post
%%==============================================================================

objects_documents_doc_id_versions_major_version_minor_version_relationships_post(DocId, MajorVersion, MinorVersion) ->
  openapi_api:objects_documents_doc_id_versions_major_version_minor_version_relationships_post(DocId, MajorVersion, MinorVersion).

objects_documents_doc_id_versions_major_version_minor_version_relationships_post_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_delete
%%==============================================================================

objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_delete(DocId, MajorVersion, MinorVersion, RelationshipId) ->
  openapi_api:objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_delete(DocId, MajorVersion, MinorVersion, RelationshipId).

objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_delete_args(_S) ->
  [binary(), binary(), binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_get
%%==============================================================================

objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_get(DocId, MajorVersion, MinorVersion, RelationshipId) ->
  openapi_api:objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_get(DocId, MajorVersion, MinorVersion, RelationshipId).

objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_get_args(_S) ->
  [binary(), binary(), binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_versions_major_version_minor_version_renditions_get
%%==============================================================================

objects_documents_doc_id_versions_major_version_minor_version_renditions_get(DocId, MajorVersion, MinorVersion) ->
  openapi_api:objects_documents_doc_id_versions_major_version_minor_version_renditions_get(DocId, MajorVersion, MinorVersion).

objects_documents_doc_id_versions_major_version_minor_version_renditions_get_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_delete
%%==============================================================================

objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_delete(DocId, MajorVersion, MinorVersion, RenditionType) ->
  openapi_api:objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_delete(DocId, MajorVersion, MinorVersion, RenditionType).

objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_delete_args(_S) ->
  [binary(), binary(), binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_get
%%==============================================================================

objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_get(DocId, MajorVersion, MinorVersion, RenditionType) ->
  openapi_api:objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_get(DocId, MajorVersion, MinorVersion, RenditionType).

objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_get_args(_S) ->
  [binary(), binary(), binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_post
%%==============================================================================

objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_post(DocId, MajorVersion, MinorVersion, RenditionType) ->
  openapi_api:objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_post(DocId, MajorVersion, MinorVersion, RenditionType).

objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_post_args(_S) ->
  [binary(), binary(), binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_put
%%==============================================================================

objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_put(DocId, MajorVersion, MinorVersion, RenditionType) ->
  openapi_api:objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_put(DocId, MajorVersion, MinorVersion, RenditionType).

objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_put_args(_S) ->
  [binary(), binary(), binary(), binary()].

%%==============================================================================
%% objects_documents_doc_id_versions_major_version_minor_version_thumbnail_get
%%==============================================================================

objects_documents_doc_id_versions_major_version_minor_version_thumbnail_get(DocId, MajorVersion, MinorVersion) ->
  openapi_api:objects_documents_doc_id_versions_major_version_minor_version_thumbnail_get(DocId, MajorVersion, MinorVersion).

objects_documents_doc_id_versions_major_version_minor_version_thumbnail_get_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% objects_documents_get
%%==============================================================================

objects_documents_get() ->
  openapi_api:objects_documents_get().

objects_documents_get_args(_S) ->
  [].

%%==============================================================================
%% objects_documents_id_roles_get
%%==============================================================================

objects_documents_id_roles_get(Id) ->
  openapi_api:objects_documents_id_roles_get(Id).

objects_documents_id_roles_get_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_documents_id_roles_post
%%==============================================================================

objects_documents_id_roles_post(Id) ->
  openapi_api:objects_documents_id_roles_post(Id).

objects_documents_id_roles_post_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_documents_id_roles_role_name_get
%%==============================================================================

objects_documents_id_roles_role_name_get(Id, RoleName) ->
  openapi_api:objects_documents_id_roles_role_name_get(Id, RoleName).

objects_documents_id_roles_role_name_get_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% objects_documents_id_versions_major_version_minor_version_lifecycle_actions_get
%%==============================================================================

objects_documents_id_versions_major_version_minor_version_lifecycle_actions_get(Id, MajorVersion, MinorVersion) ->
  openapi_api:objects_documents_id_versions_major_version_minor_version_lifecycle_actions_get(Id, MajorVersion, MinorVersion).

objects_documents_id_versions_major_version_minor_version_lifecycle_actions_get_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get
%%==============================================================================

objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get(Id, MajorVersion, MinorVersion, NameV) ->
  openapi_api:objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get(Id, MajorVersion, MinorVersion, NameV).

objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_entry_requirements_get_args(_S) ->
  [binary(), binary(), binary(), binary()].

%%==============================================================================
%% objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_put
%%==============================================================================

objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_put(Id, MajorVersion, MinorVersion, NameV) ->
  openapi_api:objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_put(Id, MajorVersion, MinorVersion, NameV).

objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_v_put_args(_S) ->
  [binary(), binary(), binary(), binary()].

%%==============================================================================
%% objects_documents_lifecycle_actions_post
%%==============================================================================

objects_documents_lifecycle_actions_post() ->
  openapi_api:objects_documents_lifecycle_actions_post().

objects_documents_lifecycle_actions_post_args(_S) ->
  [].

%%==============================================================================
%% objects_documents_lifecycle_actions_user_action_name_put
%%==============================================================================

objects_documents_lifecycle_actions_user_action_name_put(UserActionName) ->
  openapi_api:objects_documents_lifecycle_actions_user_action_name_put(UserActionName).

objects_documents_lifecycle_actions_user_action_name_put_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_documents_post
%%==============================================================================

objects_documents_post() ->
  openapi_api:objects_documents_post().

objects_documents_post_args(_S) ->
  [].

%%==============================================================================
%% objects_documents_relationships_batch_delete
%%==============================================================================

objects_documents_relationships_batch_delete() ->
  openapi_api:objects_documents_relationships_batch_delete().

objects_documents_relationships_batch_delete_args(_S) ->
  [].

%%==============================================================================
%% objects_documents_relationships_batch_post
%%==============================================================================

objects_documents_relationships_batch_post() ->
  openapi_api:objects_documents_relationships_batch_post().

objects_documents_relationships_batch_post_args(_S) ->
  [].

%%==============================================================================
%% objects_documents_renditions_batch_delete
%%==============================================================================

objects_documents_renditions_batch_delete() ->
  openapi_api:objects_documents_renditions_batch_delete().

objects_documents_renditions_batch_delete_args(_S) ->
  [].

%%==============================================================================
%% objects_documents_renditions_batch_post
%%==============================================================================

objects_documents_renditions_batch_post() ->
  openapi_api:objects_documents_renditions_batch_post().

objects_documents_renditions_batch_post_args(_S) ->
  [].

%%==============================================================================
%% objects_documents_roles_batch_delete
%%==============================================================================

objects_documents_roles_batch_delete() ->
  openapi_api:objects_documents_roles_batch_delete().

objects_documents_roles_batch_delete_args(_S) ->
  [].

%%==============================================================================
%% objects_documents_roles_batch_post
%%==============================================================================

objects_documents_roles_batch_post() ->
  openapi_api:objects_documents_roles_batch_post().

objects_documents_roles_batch_post_args(_S) ->
  [].

%%==============================================================================
%% objects_documents_templates_get
%%==============================================================================

objects_documents_templates_get() ->
  openapi_api:objects_documents_templates_get().

objects_documents_templates_get_args(_S) ->
  [].

%%==============================================================================
%% objects_documents_templates_post
%%==============================================================================

objects_documents_templates_post() ->
  openapi_api:objects_documents_templates_post().

objects_documents_templates_post_args(_S) ->
  [].

%%==============================================================================
%% objects_documents_templates_put
%%==============================================================================

objects_documents_templates_put() ->
  openapi_api:objects_documents_templates_put().

objects_documents_templates_put_args(_S) ->
  [].

%%==============================================================================
%% objects_documents_templates_template_name_delete
%%==============================================================================

objects_documents_templates_template_name_delete(TemplateName) ->
  openapi_api:objects_documents_templates_template_name_delete(TemplateName).

objects_documents_templates_template_name_delete_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_documents_templates_template_name_file_get
%%==============================================================================

objects_documents_templates_template_name_file_get(TemplateName) ->
  openapi_api:objects_documents_templates_template_name_file_get(TemplateName).

objects_documents_templates_template_name_file_get_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_documents_templates_template_name_get
%%==============================================================================

objects_documents_templates_template_name_get(TemplateName) ->
  openapi_api:objects_documents_templates_template_name_get(TemplateName).

objects_documents_templates_template_name_get_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_documents_templates_template_name_put
%%==============================================================================

objects_documents_templates_template_name_put(TemplateName) ->
  openapi_api:objects_documents_templates_template_name_put(TemplateName).

objects_documents_templates_template_name_put_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_documents_tokens_post
%%==============================================================================

objects_documents_tokens_post() ->
  openapi_api:objects_documents_tokens_post().

objects_documents_tokens_post_args(_S) ->
  [].

%%==============================================================================
%% objects_documents_versions_batch_actions_fileextract_post
%%==============================================================================

objects_documents_versions_batch_actions_fileextract_post() ->
  openapi_api:objects_documents_versions_batch_actions_fileextract_post().

objects_documents_versions_batch_actions_fileextract_post_args(_S) ->
  [].

%%==============================================================================
%% objects_documents_versions_batch_delete
%%==============================================================================

objects_documents_versions_batch_delete() ->
  openapi_api:objects_documents_versions_batch_delete().

objects_documents_versions_batch_delete_args(_S) ->
  [].

%%==============================================================================
%% objects_documents_versions_batch_post
%%==============================================================================

objects_documents_versions_batch_post() ->
  openapi_api:objects_documents_versions_batch_post().

objects_documents_versions_batch_post_args(_S) ->
  [].

%%==============================================================================
%% objects_domain_get
%%==============================================================================

objects_domain_get() ->
  openapi_api:objects_domain_get().

objects_domain_get_args(_S) ->
  [].

%%==============================================================================
%% objects_domains_get
%%==============================================================================

objects_domains_get() ->
  openapi_api:objects_domains_get().

objects_domains_get_args(_S) ->
  [].

%%==============================================================================
%% objects_edl_matched_documents_batch_actions_add_post
%%==============================================================================

objects_edl_matched_documents_batch_actions_add_post() ->
  openapi_api:objects_edl_matched_documents_batch_actions_add_post().

objects_edl_matched_documents_batch_actions_add_post_args(_S) ->
  [].

%%==============================================================================
%% objects_edl_matched_documents_batch_actions_remove_post
%%==============================================================================

objects_edl_matched_documents_batch_actions_remove_post() ->
  openapi_api:objects_edl_matched_documents_batch_actions_remove_post().

objects_edl_matched_documents_batch_actions_remove_post_args(_S) ->
  [].

%%==============================================================================
%% objects_groups_auto_get
%%==============================================================================

objects_groups_auto_get() ->
  openapi_api:objects_groups_auto_get().

objects_groups_auto_get_args(_S) ->
  [].

%%==============================================================================
%% objects_groups_get
%%==============================================================================

objects_groups_get() ->
  openapi_api:objects_groups_get().

objects_groups_get_args(_S) ->
  [].

%%==============================================================================
%% objects_groups_group_id_delete
%%==============================================================================

objects_groups_group_id_delete(GroupId) ->
  openapi_api:objects_groups_group_id_delete(GroupId).

objects_groups_group_id_delete_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_groups_group_id_get
%%==============================================================================

objects_groups_group_id_get(GroupId) ->
  openapi_api:objects_groups_group_id_get(GroupId).

objects_groups_group_id_get_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_groups_group_id_put
%%==============================================================================

objects_groups_group_id_put(GroupId) ->
  openapi_api:objects_groups_group_id_put(GroupId).

objects_groups_group_id_put_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_groups_post
%%==============================================================================

objects_groups_post() ->
  openapi_api:objects_groups_post().

objects_groups_post_args(_S) ->
  [].

%%==============================================================================
%% objects_licenses_get
%%==============================================================================

objects_licenses_get() ->
  openapi_api:objects_licenses_get().

objects_licenses_get_args(_S) ->
  [].

%%==============================================================================
%% objects_objectworkflows_actions_get
%%==============================================================================

objects_objectworkflows_actions_get() ->
  openapi_api:objects_objectworkflows_actions_get().

objects_objectworkflows_actions_get_args(_S) ->
  [].

%%==============================================================================
%% objects_objectworkflows_actions_workflow_name_get
%%==============================================================================

objects_objectworkflows_actions_workflow_name_get(WorkflowName) ->
  openapi_api:objects_objectworkflows_actions_workflow_name_get(WorkflowName).

objects_objectworkflows_actions_workflow_name_get_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_objectworkflows_actions_workflow_name_post
%%==============================================================================

objects_objectworkflows_actions_workflow_name_post(WorkflowName) ->
  openapi_api:objects_objectworkflows_actions_workflow_name_post(WorkflowName).

objects_objectworkflows_actions_workflow_name_post_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_objectworkflows_get
%%==============================================================================

objects_objectworkflows_get() ->
  openapi_api:objects_objectworkflows_get().

objects_objectworkflows_get_args(_S) ->
  [].

%%==============================================================================
%% objects_objectworkflows_tasks_get
%%==============================================================================

objects_objectworkflows_tasks_get() ->
  openapi_api:objects_objectworkflows_tasks_get().

objects_objectworkflows_tasks_get_args(_S) ->
  [].

%%==============================================================================
%% objects_objectworkflows_tasks_task_id_actions_accept_post
%%==============================================================================

objects_objectworkflows_tasks_task_id_actions_accept_post(TaskId) ->
  openapi_api:objects_objectworkflows_tasks_task_id_actions_accept_post(TaskId).

objects_objectworkflows_tasks_task_id_actions_accept_post_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_objectworkflows_tasks_task_id_actions_cancel_post
%%==============================================================================

objects_objectworkflows_tasks_task_id_actions_cancel_post(TaskId) ->
  openapi_api:objects_objectworkflows_tasks_task_id_actions_cancel_post(TaskId).

objects_objectworkflows_tasks_task_id_actions_cancel_post_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_objectworkflows_tasks_task_id_actions_complete_post
%%==============================================================================

objects_objectworkflows_tasks_task_id_actions_complete_post(TaskId) ->
  openapi_api:objects_objectworkflows_tasks_task_id_actions_complete_post(TaskId).

objects_objectworkflows_tasks_task_id_actions_complete_post_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_objectworkflows_tasks_task_id_actions_get
%%==============================================================================

objects_objectworkflows_tasks_task_id_actions_get(TaskId) ->
  openapi_api:objects_objectworkflows_tasks_task_id_actions_get(TaskId).

objects_objectworkflows_tasks_task_id_actions_get_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_objectworkflows_tasks_task_id_actions_mdwaccept_post
%%==============================================================================

objects_objectworkflows_tasks_task_id_actions_mdwaccept_post(TaskId) ->
  openapi_api:objects_objectworkflows_tasks_task_id_actions_mdwaccept_post(TaskId).

objects_objectworkflows_tasks_task_id_actions_mdwaccept_post_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_objectworkflows_tasks_task_id_actions_mdwcomplete_post
%%==============================================================================

objects_objectworkflows_tasks_task_id_actions_mdwcomplete_post(TaskId) ->
  openapi_api:objects_objectworkflows_tasks_task_id_actions_mdwcomplete_post(TaskId).

objects_objectworkflows_tasks_task_id_actions_mdwcomplete_post_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_objectworkflows_tasks_task_id_actions_mdwmanagecontent_post
%%==============================================================================

objects_objectworkflows_tasks_task_id_actions_mdwmanagecontent_post(TaskId) ->
  openapi_api:objects_objectworkflows_tasks_task_id_actions_mdwmanagecontent_post(TaskId).

objects_objectworkflows_tasks_task_id_actions_mdwmanagecontent_post_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_objectworkflows_tasks_task_id_actions_mdwreassign_post
%%==============================================================================

objects_objectworkflows_tasks_task_id_actions_mdwreassign_post(TaskId) ->
  openapi_api:objects_objectworkflows_tasks_task_id_actions_mdwreassign_post(TaskId).

objects_objectworkflows_tasks_task_id_actions_mdwreassign_post_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_objectworkflows_tasks_task_id_actions_reassign_post
%%==============================================================================

objects_objectworkflows_tasks_task_id_actions_reassign_post(TaskId) ->
  openapi_api:objects_objectworkflows_tasks_task_id_actions_reassign_post(TaskId).

objects_objectworkflows_tasks_task_id_actions_reassign_post_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_objectworkflows_tasks_task_id_actions_task_action_get
%%==============================================================================

objects_objectworkflows_tasks_task_id_actions_task_action_get(TaskId, TaskAction) ->
  openapi_api:objects_objectworkflows_tasks_task_id_actions_task_action_get(TaskId, TaskAction).

objects_objectworkflows_tasks_task_id_actions_task_action_get_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% objects_objectworkflows_tasks_task_id_actions_undoaccept_post
%%==============================================================================

objects_objectworkflows_tasks_task_id_actions_undoaccept_post(TaskId) ->
  openapi_api:objects_objectworkflows_tasks_task_id_actions_undoaccept_post(TaskId).

objects_objectworkflows_tasks_task_id_actions_undoaccept_post_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_objectworkflows_tasks_task_id_actions_updateduedate_post
%%==============================================================================

objects_objectworkflows_tasks_task_id_actions_updateduedate_post(TaskId) ->
  openapi_api:objects_objectworkflows_tasks_task_id_actions_updateduedate_post(TaskId).

objects_objectworkflows_tasks_task_id_actions_updateduedate_post_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_objectworkflows_tasks_task_id_get
%%==============================================================================

objects_objectworkflows_tasks_task_id_get(TaskId) ->
  openapi_api:objects_objectworkflows_tasks_task_id_get(TaskId).

objects_objectworkflows_tasks_task_id_get_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_objectworkflows_workflow_id_actions_get
%%==============================================================================

objects_objectworkflows_workflow_id_actions_get(WorkflowId) ->
  openapi_api:objects_objectworkflows_workflow_id_actions_get(WorkflowId).

objects_objectworkflows_workflow_id_actions_get_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_objectworkflows_workflow_id_actions_workflow_action_get
%%==============================================================================

objects_objectworkflows_workflow_id_actions_workflow_action_get(WorkflowId, WorkflowAction) ->
  openapi_api:objects_objectworkflows_workflow_id_actions_workflow_action_get(WorkflowId, WorkflowAction).

objects_objectworkflows_workflow_id_actions_workflow_action_get_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% objects_objectworkflows_workflow_id_actions_workflow_action_post
%%==============================================================================

objects_objectworkflows_workflow_id_actions_workflow_action_post(WorkflowId, WorkflowAction) ->
  openapi_api:objects_objectworkflows_workflow_id_actions_workflow_action_post(WorkflowId, WorkflowAction).

objects_objectworkflows_workflow_id_actions_workflow_action_post_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% objects_objectworkflows_workflow_id_get
%%==============================================================================

objects_objectworkflows_workflow_id_get(WorkflowId) ->
  openapi_api:objects_objectworkflows_workflow_id_get(WorkflowId).

objects_objectworkflows_workflow_id_get_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_picklists_get
%%==============================================================================

objects_picklists_get() ->
  openapi_api:objects_picklists_get().

objects_picklists_get_args(_S) ->
  [].

%%==============================================================================
%% objects_picklists_picklist_name_get
%%==============================================================================

objects_picklists_picklist_name_get(PicklistName) ->
  openapi_api:objects_picklists_picklist_name_get(PicklistName).

objects_picklists_picklist_name_get_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_picklists_picklist_name_picklist_value_name_delete
%%==============================================================================

objects_picklists_picklist_name_picklist_value_name_delete(PicklistName, PicklistValueName) ->
  openapi_api:objects_picklists_picklist_name_picklist_value_name_delete(PicklistName, PicklistValueName).

objects_picklists_picklist_name_picklist_value_name_delete_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% objects_picklists_picklist_name_picklist_value_name_put
%%==============================================================================

objects_picklists_picklist_name_picklist_value_name_put(PicklistName, PicklistValueName) ->
  openapi_api:objects_picklists_picklist_name_picklist_value_name_put(PicklistName, PicklistValueName).

objects_picklists_picklist_name_picklist_value_name_put_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% objects_picklists_picklist_name_post
%%==============================================================================

objects_picklists_picklist_name_post(PicklistName) ->
  openapi_api:objects_picklists_picklist_name_post(PicklistName).

objects_picklists_picklist_name_post_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_picklists_picklist_name_put
%%==============================================================================

objects_picklists_picklist_name_put(PicklistName) ->
  openapi_api:objects_picklists_picklist_name_put(PicklistName).

objects_picklists_picklist_name_put_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_sandbox_actions_buildproduction_post
%%==============================================================================

objects_sandbox_actions_buildproduction_post() ->
  openapi_api:objects_sandbox_actions_buildproduction_post().

objects_sandbox_actions_buildproduction_post_args(_S) ->
  [].

%%==============================================================================
%% objects_sandbox_actions_promoteproduction_post
%%==============================================================================

objects_sandbox_actions_promoteproduction_post() ->
  openapi_api:objects_sandbox_actions_promoteproduction_post().

objects_sandbox_actions_promoteproduction_post_args(_S) ->
  [].

%%==============================================================================
%% objects_sandbox_actions_recheckusage_post
%%==============================================================================

objects_sandbox_actions_recheckusage_post() ->
  openapi_api:objects_sandbox_actions_recheckusage_post().

objects_sandbox_actions_recheckusage_post_args(_S) ->
  [].

%%==============================================================================
%% objects_sandbox_batch_changesize_post
%%==============================================================================

objects_sandbox_batch_changesize_post() ->
  openapi_api:objects_sandbox_batch_changesize_post().

objects_sandbox_batch_changesize_post_args(_S) ->
  [].

%%==============================================================================
%% objects_sandbox_entitlements_set_post
%%==============================================================================

objects_sandbox_entitlements_set_post() ->
  openapi_api:objects_sandbox_entitlements_set_post().

objects_sandbox_entitlements_set_post_args(_S) ->
  [].

%%==============================================================================
%% objects_sandbox_get
%%==============================================================================

objects_sandbox_get() ->
  openapi_api:objects_sandbox_get().

objects_sandbox_get_args(_S) ->
  [].

%%==============================================================================
%% objects_sandbox_name_delete
%%==============================================================================

objects_sandbox_name_delete(Name) ->
  openapi_api:objects_sandbox_name_delete(Name).

objects_sandbox_name_delete_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_sandbox_post
%%==============================================================================

objects_sandbox_post() ->
  openapi_api:objects_sandbox_post().

objects_sandbox_post_args(_S) ->
  [].

%%==============================================================================
%% objects_sandbox_snapshot_api_name_actions_update_post
%%==============================================================================

objects_sandbox_snapshot_api_name_actions_update_post(ApiName) ->
  openapi_api:objects_sandbox_snapshot_api_name_actions_update_post(ApiName).

objects_sandbox_snapshot_api_name_actions_update_post_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_sandbox_snapshot_api_name_actions_upgrade_post
%%==============================================================================

objects_sandbox_snapshot_api_name_actions_upgrade_post(ApiName) ->
  openapi_api:objects_sandbox_snapshot_api_name_actions_upgrade_post(ApiName).

objects_sandbox_snapshot_api_name_actions_upgrade_post_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_sandbox_snapshot_api_name_delete
%%==============================================================================

objects_sandbox_snapshot_api_name_delete(ApiName) ->
  openapi_api:objects_sandbox_snapshot_api_name_delete(ApiName).

objects_sandbox_snapshot_api_name_delete_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_sandbox_snapshot_get
%%==============================================================================

objects_sandbox_snapshot_get() ->
  openapi_api:objects_sandbox_snapshot_get().

objects_sandbox_snapshot_get_args(_S) ->
  [].

%%==============================================================================
%% objects_sandbox_snapshot_post
%%==============================================================================

objects_sandbox_snapshot_post() ->
  openapi_api:objects_sandbox_snapshot_post().

objects_sandbox_snapshot_post_args(_S) ->
  [].

%%==============================================================================
%% objects_sandbox_vault_id_actions_refresh_post
%%==============================================================================

objects_sandbox_vault_id_actions_refresh_post(VaultId) ->
  openapi_api:objects_sandbox_vault_id_actions_refresh_post(VaultId).

objects_sandbox_vault_id_actions_refresh_post_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_sandbox_vault_id_get
%%==============================================================================

objects_sandbox_vault_id_get(VaultId) ->
  openapi_api:objects_sandbox_vault_id_get(VaultId).

objects_sandbox_vault_id_get_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_securitypolicies_get
%%==============================================================================

objects_securitypolicies_get() ->
  openapi_api:objects_securitypolicies_get().

objects_securitypolicies_get_args(_S) ->
  [].

%%==============================================================================
%% objects_securitypolicies_security_policy_name_get
%%==============================================================================

objects_securitypolicies_security_policy_name_get(SecurityPolicyName) ->
  openapi_api:objects_securitypolicies_security_policy_name_get(SecurityPolicyName).

objects_securitypolicies_security_policy_name_get_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_users_get
%%==============================================================================

objects_users_get() ->
  openapi_api:objects_users_get().

objects_users_get_args(_S) ->
  [].

%%==============================================================================
%% objects_users_id_get
%%==============================================================================

objects_users_id_get(Id) ->
  openapi_api:objects_users_id_get(Id).

objects_users_id_get_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_users_id_permissions_get
%%==============================================================================

objects_users_id_permissions_get(Id) ->
  openapi_api:objects_users_id_permissions_get(Id).

objects_users_id_permissions_get_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_users_id_put
%%==============================================================================

objects_users_id_put(Id) ->
  openapi_api:objects_users_id_put(Id).

objects_users_id_put_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_users_me_get
%%==============================================================================

objects_users_me_get() ->
  openapi_api:objects_users_me_get().

objects_users_me_get_args(_S) ->
  [].

%%==============================================================================
%% objects_users_me_password_post
%%==============================================================================

objects_users_me_password_post() ->
  openapi_api:objects_users_me_password_post().

objects_users_me_password_post_args(_S) ->
  [].

%%==============================================================================
%% objects_users_me_permissions_get
%%==============================================================================

objects_users_me_permissions_get() ->
  openapi_api:objects_users_me_permissions_get().

objects_users_me_permissions_get_args(_S) ->
  [].

%%==============================================================================
%% objects_users_me_put
%%==============================================================================

objects_users_me_put() ->
  openapi_api:objects_users_me_put().

objects_users_me_put_args(_S) ->
  [].

%%==============================================================================
%% objects_users_post
%%==============================================================================

objects_users_post() ->
  openapi_api:objects_users_post().

objects_users_post_args(_S) ->
  [].

%%==============================================================================
%% objects_users_put
%%==============================================================================

objects_users_put() ->
  openapi_api:objects_users_put().

objects_users_put_args(_S) ->
  [].

%%==============================================================================
%% objects_users_user_id_delete
%%==============================================================================

objects_users_user_id_delete(UserId) ->
  openapi_api:objects_users_user_id_delete(UserId).

objects_users_user_id_delete_args(_S) ->
  [binary()].

%%==============================================================================
%% objects_users_user_id_vault_membership_vault_id_put
%%==============================================================================

objects_users_user_id_vault_membership_vault_id_put(UserId, VaultId) ->
  openapi_api:objects_users_user_id_vault_membership_vault_id_put(UserId, VaultId).

objects_users_user_id_vault_membership_vault_id_put_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% objects_vault_actions_compare_post
%%==============================================================================

objects_vault_actions_compare_post() ->
  openapi_api:objects_vault_actions_compare_post().

objects_vault_actions_compare_post_args(_S) ->
  [].

%%==============================================================================
%% objects_vault_actions_configreport_post
%%==============================================================================

objects_vault_actions_configreport_post() ->
  openapi_api:objects_vault_actions_configreport_post().

objects_vault_actions_configreport_post_args(_S) ->
  [].

%%==============================================================================
%% query_components_post
%%==============================================================================

query_components_post() ->
  openapi_api:query_components_post().

query_components_post_args(_S) ->
  [].

%%==============================================================================
%% query_next_page_post
%%==============================================================================

query_next_page_post(NextPage) ->
  openapi_api:query_next_page_post(NextPage).

query_next_page_post_args(_S) ->
  [binary()].

%%==============================================================================
%% query_post
%%==============================================================================

query_post() ->
  openapi_api:query_post().

query_post_args(_S) ->
  [].

%%==============================================================================
%% query_previous_page_post
%%==============================================================================

query_previous_page_post(PreviousPage) ->
  openapi_api:query_previous_page_post(PreviousPage).

query_previous_page_post_args(_S) ->
  [binary()].

%%==============================================================================
%% scim_v2_me_get
%%==============================================================================

scim_v2_me_get() ->
  openapi_api:scim_v2_me_get().

scim_v2_me_get_args(_S) ->
  [].

%%==============================================================================
%% scim_v2_me_put
%%==============================================================================

scim_v2_me_put() ->
  openapi_api:scim_v2_me_put().

scim_v2_me_put_args(_S) ->
  [].

%%==============================================================================
%% scim_v2_resource_types_get
%%==============================================================================

scim_v2_resource_types_get() ->
  openapi_api:scim_v2_resource_types_get().

scim_v2_resource_types_get_args(_S) ->
  [].

%%==============================================================================
%% scim_v2_resource_types_type_get
%%==============================================================================

scim_v2_resource_types_type_get(Type) ->
  openapi_api:scim_v2_resource_types_type_get(Type).

scim_v2_resource_types_type_get_args(_S) ->
  [binary()].

%%==============================================================================
%% scim_v2_schemas_get
%%==============================================================================

scim_v2_schemas_get() ->
  openapi_api:scim_v2_schemas_get().

scim_v2_schemas_get_args(_S) ->
  [].

%%==============================================================================
%% scim_v2_schemas_id_get
%%==============================================================================

scim_v2_schemas_id_get(Id) ->
  openapi_api:scim_v2_schemas_id_get(Id).

scim_v2_schemas_id_get_args(_S) ->
  [binary()].

%%==============================================================================
%% scim_v2_service_provider_config_get
%%==============================================================================

scim_v2_service_provider_config_get() ->
  openapi_api:scim_v2_service_provider_config_get().

scim_v2_service_provider_config_get_args(_S) ->
  [].

%%==============================================================================
%% scim_v2_type_get
%%==============================================================================

scim_v2_type_get(Type) ->
  openapi_api:scim_v2_type_get(Type).

scim_v2_type_get_args(_S) ->
  [binary()].

%%==============================================================================
%% scim_v2_type_id_get
%%==============================================================================

scim_v2_type_id_get(Type, Id) ->
  openapi_api:scim_v2_type_id_get(Type, Id).

scim_v2_type_id_get_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% scim_v2_users_get
%%==============================================================================

scim_v2_users_get() ->
  openapi_api:scim_v2_users_get().

scim_v2_users_get_args(_S) ->
  [].

%%==============================================================================
%% scim_v2_users_id_get
%%==============================================================================

scim_v2_users_id_get(Id) ->
  openapi_api:scim_v2_users_id_get(Id).

scim_v2_users_id_get_args(_S) ->
  [binary()].

%%==============================================================================
%% scim_v2_users_id_put
%%==============================================================================

scim_v2_users_id_put(Id) ->
  openapi_api:scim_v2_users_id_put(Id).

scim_v2_users_id_put_args(_S) ->
  [binary()].

%%==============================================================================
%% scim_v2_users_post
%%==============================================================================

scim_v2_users_post() ->
  openapi_api:scim_v2_users_post().

scim_v2_users_post_args(_S) ->
  [].

%%==============================================================================
%% services_certificate_cert_id_get
%%==============================================================================

services_certificate_cert_id_get(CertId) ->
  openapi_api:services_certificate_cert_id_get(CertId).

services_certificate_cert_id_get_args(_S) ->
  [binary()].

%%==============================================================================
%% services_configuration_mode_actions_disable_post
%%==============================================================================

services_configuration_mode_actions_disable_post() ->
  openapi_api:services_configuration_mode_actions_disable_post().

services_configuration_mode_actions_disable_post_args(_S) ->
  [].

%%==============================================================================
%% services_configuration_mode_actions_enable_post
%%==============================================================================

services_configuration_mode_actions_enable_post() ->
  openapi_api:services_configuration_mode_actions_enable_post().

services_configuration_mode_actions_enable_post_args(_S) ->
  [].

%%==============================================================================
%% services_directdata_files_get
%%==============================================================================

services_directdata_files_get() ->
  openapi_api:services_directdata_files_get().

services_directdata_files_get_args(_S) ->
  [].

%%==============================================================================
%% services_directdata_files_name_get
%%==============================================================================

services_directdata_files_name_get(Name) ->
  openapi_api:services_directdata_files_name_get(Name).

services_directdata_files_name_get_args(_S) ->
  [binary()].

%%==============================================================================
%% services_file_staging_items_content_item_get
%%==============================================================================

services_file_staging_items_content_item_get(Item) ->
  openapi_api:services_file_staging_items_content_item_get(Item).

services_file_staging_items_content_item_get_args(_S) ->
  [binary()].

%%==============================================================================
%% services_file_staging_items_item_delete
%%==============================================================================

services_file_staging_items_item_delete(Item) ->
  openapi_api:services_file_staging_items_item_delete(Item).

services_file_staging_items_item_delete_args(_S) ->
  [binary()].

%%==============================================================================
%% services_file_staging_items_item_get
%%==============================================================================

services_file_staging_items_item_get(Item) ->
  openapi_api:services_file_staging_items_item_get(Item).

services_file_staging_items_item_get_args(_S) ->
  [binary()].

%%==============================================================================
%% services_file_staging_items_item_put
%%==============================================================================

services_file_staging_items_item_put(Item) ->
  openapi_api:services_file_staging_items_item_put(Item).

services_file_staging_items_item_put_args(_S) ->
  [binary()].

%%==============================================================================
%% services_file_staging_items_post
%%==============================================================================

services_file_staging_items_post() ->
  openapi_api:services_file_staging_items_post().

services_file_staging_items_post_args(_S) ->
  [].

%%==============================================================================
%% services_file_staging_upload_get
%%==============================================================================

services_file_staging_upload_get() ->
  openapi_api:services_file_staging_upload_get().

services_file_staging_upload_get_args(_S) ->
  [].

%%==============================================================================
%% services_file_staging_upload_post
%%==============================================================================

services_file_staging_upload_post() ->
  openapi_api:services_file_staging_upload_post().

services_file_staging_upload_post_args(_S) ->
  [].

%%==============================================================================
%% services_file_staging_upload_upload_session_id_delete
%%==============================================================================

services_file_staging_upload_upload_session_id_delete(UploadSessionId) ->
  openapi_api:services_file_staging_upload_upload_session_id_delete(UploadSessionId).

services_file_staging_upload_upload_session_id_delete_args(_S) ->
  [binary()].

%%==============================================================================
%% services_file_staging_upload_upload_session_id_get
%%==============================================================================

services_file_staging_upload_upload_session_id_get(UploadSessionId) ->
  openapi_api:services_file_staging_upload_upload_session_id_get(UploadSessionId).

services_file_staging_upload_upload_session_id_get_args(_S) ->
  [binary()].

%%==============================================================================
%% services_file_staging_upload_upload_session_id_parts_get
%%==============================================================================

services_file_staging_upload_upload_session_id_parts_get(UploadSessionId) ->
  openapi_api:services_file_staging_upload_upload_session_id_parts_get(UploadSessionId).

services_file_staging_upload_upload_session_id_parts_get_args(_S) ->
  [binary()].

%%==============================================================================
%% services_file_staging_upload_upload_session_id_post
%%==============================================================================

services_file_staging_upload_upload_session_id_post(UploadSessionId) ->
  openapi_api:services_file_staging_upload_upload_session_id_post(UploadSessionId).

services_file_staging_upload_upload_session_id_post_args(_S) ->
  [binary()].

%%==============================================================================
%% services_file_staging_upload_upload_session_id_put
%%==============================================================================

services_file_staging_upload_upload_session_id_put(UploadSessionId) ->
  openapi_api:services_file_staging_upload_upload_session_id_put(UploadSessionId).

services_file_staging_upload_upload_session_id_put_args(_S) ->
  [binary()].

%%==============================================================================
%% services_jobs_histories_get
%%==============================================================================

services_jobs_histories_get() ->
  openapi_api:services_jobs_histories_get().

services_jobs_histories_get_args(_S) ->
  [].

%%==============================================================================
%% services_jobs_job_id_errors_get
%%==============================================================================

services_jobs_job_id_errors_get(JobId) ->
  openapi_api:services_jobs_job_id_errors_get(JobId).

services_jobs_job_id_errors_get_args(_S) ->
  [binary()].

%%==============================================================================
%% services_jobs_job_id_get
%%==============================================================================

services_jobs_job_id_get(JobId) ->
  openapi_api:services_jobs_job_id_get(JobId).

services_jobs_job_id_get_args(_S) ->
  [binary()].

%%==============================================================================
%% services_jobs_job_id_summary_get
%%==============================================================================

services_jobs_job_id_summary_get(JobId) ->
  openapi_api:services_jobs_job_id_summary_get(JobId).

services_jobs_job_id_summary_get_args(_S) ->
  [binary()].

%%==============================================================================
%% services_jobs_job_id_tasks_get
%%==============================================================================

services_jobs_job_id_tasks_get(JobId) ->
  openapi_api:services_jobs_job_id_tasks_get(JobId).

services_jobs_job_id_tasks_get_args(_S) ->
  [binary()].

%%==============================================================================
%% services_jobs_monitors_get
%%==============================================================================

services_jobs_monitors_get() ->
  openapi_api:services_jobs_monitors_get().

services_jobs_monitors_get_args(_S) ->
  [].

%%==============================================================================
%% services_jobs_start_now_job_id_post
%%==============================================================================

services_jobs_start_now_job_id_post(JobId) ->
  openapi_api:services_jobs_start_now_job_id_post(JobId).

services_jobs_start_now_job_id_post_args(_S) ->
  [binary()].

%%==============================================================================
%% services_loader_extract_post
%%==============================================================================

services_loader_extract_post() ->
  openapi_api:services_loader_extract_post().

services_loader_extract_post_args(_S) ->
  [].

%%==============================================================================
%% services_loader_job_id_tasks_task_id_failurelog_get
%%==============================================================================

services_loader_job_id_tasks_task_id_failurelog_get(JobId, TaskId) ->
  openapi_api:services_loader_job_id_tasks_task_id_failurelog_get(JobId, TaskId).

services_loader_job_id_tasks_task_id_failurelog_get_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% services_loader_job_id_tasks_task_id_results_get
%%==============================================================================

services_loader_job_id_tasks_task_id_results_get(JobId, TaskId) ->
  openapi_api:services_loader_job_id_tasks_task_id_results_get(JobId, TaskId).

services_loader_job_id_tasks_task_id_results_get_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% services_loader_job_id_tasks_task_id_results_renditions_get
%%==============================================================================

services_loader_job_id_tasks_task_id_results_renditions_get(JobId, TaskId) ->
  openapi_api:services_loader_job_id_tasks_task_id_results_renditions_get(JobId, TaskId).

services_loader_job_id_tasks_task_id_results_renditions_get_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% services_loader_job_id_tasks_task_id_successlog_get
%%==============================================================================

services_loader_job_id_tasks_task_id_successlog_get(JobId, TaskId) ->
  openapi_api:services_loader_job_id_tasks_task_id_successlog_get(JobId, TaskId).

services_loader_job_id_tasks_task_id_successlog_get_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% services_loader_load_post
%%==============================================================================

services_loader_load_post() ->
  openapi_api:services_loader_load_post().

services_loader_load_post_args(_S) ->
  [].

%%==============================================================================
%% services_package_actions_validate_post
%%==============================================================================

services_package_actions_validate_post() ->
  openapi_api:services_package_actions_validate_post().

services_package_actions_validate_post_args(_S) ->
  [].

%%==============================================================================
%% services_package_post
%%==============================================================================

services_package_post() ->
  openapi_api:services_package_post().

services_package_post_args(_S) ->
  [].

%%==============================================================================
%% services_package_put
%%==============================================================================

services_package_put() ->
  openapi_api:services_package_put().

services_package_put_args(_S) ->
  [].

%%==============================================================================
%% services_queues_get
%%==============================================================================

services_queues_get() ->
  openapi_api:services_queues_get().

services_queues_get_args(_S) ->
  [].

%%==============================================================================
%% services_queues_queue_name_actions_disable_delivery_put
%%==============================================================================

services_queues_queue_name_actions_disable_delivery_put(QueueName) ->
  openapi_api:services_queues_queue_name_actions_disable_delivery_put(QueueName).

services_queues_queue_name_actions_disable_delivery_put_args(_S) ->
  [binary()].

%%==============================================================================
%% services_queues_queue_name_actions_enable_delivery_put
%%==============================================================================

services_queues_queue_name_actions_enable_delivery_put(QueueName) ->
  openapi_api:services_queues_queue_name_actions_enable_delivery_put(QueueName).

services_queues_queue_name_actions_enable_delivery_put_args(_S) ->
  [binary()].

%%==============================================================================
%% services_queues_queue_name_actions_reset_put
%%==============================================================================

services_queues_queue_name_actions_reset_put(QueueName) ->
  openapi_api:services_queues_queue_name_actions_reset_put(QueueName).

services_queues_queue_name_actions_reset_put_args(_S) ->
  [binary()].

%%==============================================================================
%% services_queues_queue_name_get
%%==============================================================================

services_queues_queue_name_get(QueueName) ->
  openapi_api:services_queues_queue_name_get(QueueName).

services_queues_queue_name_get_args(_S) ->
  [binary()].

%%==============================================================================
%% services_vobject_vault_package_v_package_id_actions_validate_post
%%==============================================================================

services_vobject_vault_package_v_package_id_actions_validate_post(PackageId) ->
  openapi_api:services_vobject_vault_package_v_package_id_actions_validate_post(PackageId).

services_vobject_vault_package_v_package_id_actions_validate_post_args(_S) ->
  [binary()].

%%==============================================================================
%% session_delete
%%==============================================================================

session_delete() ->
  openapi_api:session_delete().

session_delete_args(_S) ->
  [].

%%==============================================================================
%% uicode_distributions_distribution_name_code_get
%%==============================================================================

uicode_distributions_distribution_name_code_get(DistributionName) ->
  openapi_api:uicode_distributions_distribution_name_code_get(DistributionName).

uicode_distributions_distribution_name_code_get_args(_S) ->
  [binary()].

%%==============================================================================
%% uicode_distributions_distribution_name_delete
%%==============================================================================

uicode_distributions_distribution_name_delete(DistributionName) ->
  openapi_api:uicode_distributions_distribution_name_delete(DistributionName).

uicode_distributions_distribution_name_delete_args(_S) ->
  [binary()].

%%==============================================================================
%% uicode_distributions_distribution_name_get
%%==============================================================================

uicode_distributions_distribution_name_get(DistributionName) ->
  openapi_api:uicode_distributions_distribution_name_get(DistributionName).

uicode_distributions_distribution_name_get_args(_S) ->
  [binary()].

%%==============================================================================
%% uicode_distributions_get
%%==============================================================================

uicode_distributions_get() ->
  openapi_api:uicode_distributions_get().

uicode_distributions_get_args(_S) ->
  [].

%%==============================================================================
%% uicode_distributions_post
%%==============================================================================

uicode_distributions_post() ->
  openapi_api:uicode_distributions_post().

uicode_distributions_post_args(_S) ->
  [].

%%==============================================================================
%% vobject_vault_package_v_package_id_actions_deploy_post
%%==============================================================================

vobject_vault_package_v_package_id_actions_deploy_post(PackageId) ->
  openapi_api:vobject_vault_package_v_package_id_actions_deploy_post(PackageId).

vobject_vault_package_v_package_id_actions_deploy_post_args(_S) ->
  [binary()].

%%==============================================================================
%% vobject_vault_package_v_package_id_actions_deploy_results_get
%%==============================================================================

vobject_vault_package_v_package_id_actions_deploy_results_get(PackageId) ->
  openapi_api:vobject_vault_package_v_package_id_actions_deploy_results_get(PackageId).

vobject_vault_package_v_package_id_actions_deploy_results_get_args(_S) ->
  [binary()].

%%==============================================================================
%% vobjects_cascadedelete_results_object_name_job_status_job_id_get
%%==============================================================================

vobjects_cascadedelete_results_object_name_job_status_job_id_get(ObjectName, JobStatus, JobId) ->
  openapi_api:vobjects_cascadedelete_results_object_name_job_status_job_id_get(ObjectName, JobStatus, JobId).

vobjects_cascadedelete_results_object_name_job_status_job_id_get_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% vobjects_deepcopy_results_object_name_job_status_job_id_get
%%==============================================================================

vobjects_deepcopy_results_object_name_job_status_job_id_get(ObjectName, JobStatus, JobId) ->
  openapi_api:vobjects_deepcopy_results_object_name_job_status_job_id_get(ObjectName, JobStatus, JobId).

vobjects_deepcopy_results_object_name_job_status_job_id_get_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% vobjects_edl_item_v_actions_createplaceholder_post
%%==============================================================================

vobjects_edl_item_v_actions_createplaceholder_post() ->
  openapi_api:vobjects_edl_item_v_actions_createplaceholder_post().

vobjects_edl_item_v_actions_createplaceholder_post_args(_S) ->
  [].

%%==============================================================================
%% vobjects_merges_job_id_log_get
%%==============================================================================

vobjects_merges_job_id_log_get(JobId) ->
  openapi_api:vobjects_merges_job_id_log_get(JobId).

vobjects_merges_job_id_log_get_args(_S) ->
  [binary()].

%%==============================================================================
%% vobjects_merges_job_id_results_get
%%==============================================================================

vobjects_merges_job_id_results_get(JobId) ->
  openapi_api:vobjects_merges_job_id_results_get(JobId).

vobjects_merges_job_id_results_get_args(_S) ->
  [binary()].

%%==============================================================================
%% vobjects_merges_job_id_status_get
%%==============================================================================

vobjects_merges_job_id_status_get(JobId) ->
  openapi_api:vobjects_merges_job_id_status_get(JobId).

vobjects_merges_job_id_status_get_args(_S) ->
  [binary()].

%%==============================================================================
%% vobjects_object_name_actions_action_name_post
%%==============================================================================

vobjects_object_name_actions_action_name_post(ObjectName, ActionName) ->
  openapi_api:vobjects_object_name_actions_action_name_post(ObjectName, ActionName).

vobjects_object_name_actions_action_name_post_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% vobjects_object_name_actions_changetype_post
%%==============================================================================

vobjects_object_name_actions_changetype_post(ObjectName) ->
  openapi_api:vobjects_object_name_actions_changetype_post(ObjectName).

vobjects_object_name_actions_changetype_post_args(_S) ->
  [binary()].

%%==============================================================================
%% vobjects_object_name_actions_merge_post
%%==============================================================================

vobjects_object_name_actions_merge_post(ObjectName) ->
  openapi_api:vobjects_object_name_actions_merge_post(ObjectName).

vobjects_object_name_actions_merge_post_args(_S) ->
  [binary()].

%%==============================================================================
%% vobjects_object_name_actions_recalculaterollups_get
%%==============================================================================

vobjects_object_name_actions_recalculaterollups_get(ObjectName) ->
  openapi_api:vobjects_object_name_actions_recalculaterollups_get(ObjectName).

vobjects_object_name_actions_recalculaterollups_get_args(_S) ->
  [binary()].

%%==============================================================================
%% vobjects_object_name_actions_recalculaterollups_post
%%==============================================================================

vobjects_object_name_actions_recalculaterollups_post(ObjectName) ->
  openapi_api:vobjects_object_name_actions_recalculaterollups_post(ObjectName).

vobjects_object_name_actions_recalculaterollups_post_args(_S) ->
  [binary()].

%%==============================================================================
%% vobjects_object_name_actions_updatecorporatecurrency_put
%%==============================================================================

vobjects_object_name_actions_updatecorporatecurrency_put(ObjectName) ->
  openapi_api:vobjects_object_name_actions_updatecorporatecurrency_put(ObjectName).

vobjects_object_name_actions_updatecorporatecurrency_put_args(_S) ->
  [binary()].

%%==============================================================================
%% vobjects_object_name_attachments_batch_delete
%%==============================================================================

vobjects_object_name_attachments_batch_delete(ObjectName) ->
  openapi_api:vobjects_object_name_attachments_batch_delete(ObjectName).

vobjects_object_name_attachments_batch_delete_args(_S) ->
  [binary()].

%%==============================================================================
%% vobjects_object_name_attachments_batch_post
%%==============================================================================

vobjects_object_name_attachments_batch_post(ObjectName) ->
  openapi_api:vobjects_object_name_attachments_batch_post(ObjectName).

vobjects_object_name_attachments_batch_post_args(_S) ->
  [binary()].

%%==============================================================================
%% vobjects_object_name_attachments_batch_put
%%==============================================================================

vobjects_object_name_attachments_batch_put(ObjectName) ->
  openapi_api:vobjects_object_name_attachments_batch_put(ObjectName).

vobjects_object_name_attachments_batch_put_args(_S) ->
  [binary()].

%%==============================================================================
%% vobjects_object_name_delete
%%==============================================================================

vobjects_object_name_delete(ObjectName) ->
  openapi_api:vobjects_object_name_delete(ObjectName).

vobjects_object_name_delete_args(_S) ->
  [binary()].

%%==============================================================================
%% vobjects_object_name_id_roles_role_name_get
%%==============================================================================

vobjects_object_name_id_roles_role_name_get(ObjectName, Id, RoleName) ->
  openapi_api:vobjects_object_name_id_roles_role_name_get(ObjectName, Id, RoleName).

vobjects_object_name_id_roles_role_name_get_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% vobjects_object_name_object_record_id_actions_action_name_get
%%==============================================================================

vobjects_object_name_object_record_id_actions_action_name_get(ObjectName, ObjectRecordId, ActionName) ->
  openapi_api:vobjects_object_name_object_record_id_actions_action_name_get(ObjectName, ObjectRecordId, ActionName).

vobjects_object_name_object_record_id_actions_action_name_get_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% vobjects_object_name_object_record_id_actions_action_name_post
%%==============================================================================

vobjects_object_name_object_record_id_actions_action_name_post(ObjectName, ObjectRecordId, ActionName) ->
  openapi_api:vobjects_object_name_object_record_id_actions_action_name_post(ObjectName, ObjectRecordId, ActionName).

vobjects_object_name_object_record_id_actions_action_name_post_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% vobjects_object_name_object_record_id_actions_cascadedelete_post
%%==============================================================================

vobjects_object_name_object_record_id_actions_cascadedelete_post(ObjectName, ObjectRecordId) ->
  openapi_api:vobjects_object_name_object_record_id_actions_cascadedelete_post(ObjectName, ObjectRecordId).

vobjects_object_name_object_record_id_actions_cascadedelete_post_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% vobjects_object_name_object_record_id_actions_deepcopy_post
%%==============================================================================

vobjects_object_name_object_record_id_actions_deepcopy_post(ObjectName, ObjectRecordId) ->
  openapi_api:vobjects_object_name_object_record_id_actions_deepcopy_post(ObjectName, ObjectRecordId).

vobjects_object_name_object_record_id_actions_deepcopy_post_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% vobjects_object_name_object_record_id_actions_get
%%==============================================================================

vobjects_object_name_object_record_id_actions_get(ObjectName, ObjectRecordId) ->
  openapi_api:vobjects_object_name_object_record_id_actions_get(ObjectName, ObjectRecordId).

vobjects_object_name_object_record_id_actions_get_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_get
%%==============================================================================

vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_get(ObjectName, ObjectRecordId, AttachmentFieldName) ->
  openapi_api:vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_get(ObjectName, ObjectRecordId, AttachmentFieldName).

vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_get_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_post
%%==============================================================================

vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_post(ObjectName, ObjectRecordId, AttachmentFieldName) ->
  openapi_api:vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_post(ObjectName, ObjectRecordId, AttachmentFieldName).

vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_post_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% vobjects_object_name_object_record_id_attachment_fields_file_get
%%==============================================================================

vobjects_object_name_object_record_id_attachment_fields_file_get(ObjectName, ObjectRecordId) ->
  openapi_api:vobjects_object_name_object_record_id_attachment_fields_file_get(ObjectName, ObjectRecordId).

vobjects_object_name_object_record_id_attachment_fields_file_get_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% vobjects_object_name_object_record_id_attachments_attachment_id_delete
%%==============================================================================

vobjects_object_name_object_record_id_attachments_attachment_id_delete(ObjectName, ObjectRecordId, AttachmentId) ->
  openapi_api:vobjects_object_name_object_record_id_attachments_attachment_id_delete(ObjectName, ObjectRecordId, AttachmentId).

vobjects_object_name_object_record_id_attachments_attachment_id_delete_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% vobjects_object_name_object_record_id_attachments_attachment_id_get
%%==============================================================================

vobjects_object_name_object_record_id_attachments_attachment_id_get(ObjectName, ObjectRecordId, AttachmentId) ->
  openapi_api:vobjects_object_name_object_record_id_attachments_attachment_id_get(ObjectName, ObjectRecordId, AttachmentId).

vobjects_object_name_object_record_id_attachments_attachment_id_get_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% vobjects_object_name_object_record_id_attachments_attachment_id_put
%%==============================================================================

vobjects_object_name_object_record_id_attachments_attachment_id_put(ObjectName, ObjectRecordId, AttachmentId) ->
  openapi_api:vobjects_object_name_object_record_id_attachments_attachment_id_put(ObjectName, ObjectRecordId, AttachmentId).

vobjects_object_name_object_record_id_attachments_attachment_id_put_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_delete
%%==============================================================================

vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_delete(ObjectName, ObjectRecordId, AttachmentId, AttachmentVersion) ->
  openapi_api:vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_delete(ObjectName, ObjectRecordId, AttachmentId, AttachmentVersion).

vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_delete_args(_S) ->
  [binary(), binary(), binary(), binary()].

%%==============================================================================
%% vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_file_get
%%==============================================================================

vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_file_get(ObjectName, ObjectRecordId, AttachmentId, AttachmentVersion) ->
  openapi_api:vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_file_get(ObjectName, ObjectRecordId, AttachmentId, AttachmentVersion).

vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_file_get_args(_S) ->
  [binary(), binary(), binary(), binary()].

%%==============================================================================
%% vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_get
%%==============================================================================

vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_get(ObjectName, ObjectRecordId, AttachmentId, AttachmentVersion) ->
  openapi_api:vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_get(ObjectName, ObjectRecordId, AttachmentId, AttachmentVersion).

vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_get_args(_S) ->
  [binary(), binary(), binary(), binary()].

%%==============================================================================
%% vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_post
%%==============================================================================

vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_post(ObjectName, ObjectRecordId, AttachmentId, AttachmentVersion) ->
  openapi_api:vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_post(ObjectName, ObjectRecordId, AttachmentId, AttachmentVersion).

vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_post_args(_S) ->
  [binary(), binary(), binary(), binary()].

%%==============================================================================
%% vobjects_object_name_object_record_id_attachments_attachment_id_versions_get
%%==============================================================================

vobjects_object_name_object_record_id_attachments_attachment_id_versions_get(ObjectName, ObjectRecordId, AttachmentId) ->
  openapi_api:vobjects_object_name_object_record_id_attachments_attachment_id_versions_get(ObjectName, ObjectRecordId, AttachmentId).

vobjects_object_name_object_record_id_attachments_attachment_id_versions_get_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% vobjects_object_name_object_record_id_attachments_file_get
%%==============================================================================

vobjects_object_name_object_record_id_attachments_file_get(ObjectName, ObjectRecordId) ->
  openapi_api:vobjects_object_name_object_record_id_attachments_file_get(ObjectName, ObjectRecordId).

vobjects_object_name_object_record_id_attachments_file_get_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% vobjects_object_name_object_record_id_attachments_get
%%==============================================================================

vobjects_object_name_object_record_id_attachments_get(ObjectName, ObjectRecordId) ->
  openapi_api:vobjects_object_name_object_record_id_attachments_get(ObjectName, ObjectRecordId).

vobjects_object_name_object_record_id_attachments_get_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% vobjects_object_name_object_record_id_attachments_post
%%==============================================================================

vobjects_object_name_object_record_id_attachments_post(ObjectName, ObjectRecordId) ->
  openapi_api:vobjects_object_name_object_record_id_attachments_post(ObjectName, ObjectRecordId).

vobjects_object_name_object_record_id_attachments_post_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% vobjects_object_name_object_record_id_audittrail_get
%%==============================================================================

vobjects_object_name_object_record_id_audittrail_get(ObjectName, ObjectRecordId) ->
  openapi_api:vobjects_object_name_object_record_id_audittrail_get(ObjectName, ObjectRecordId).

vobjects_object_name_object_record_id_audittrail_get_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% vobjects_object_name_object_record_id_get
%%==============================================================================

vobjects_object_name_object_record_id_get(ObjectName, ObjectRecordId) ->
  openapi_api:vobjects_object_name_object_record_id_get(ObjectName, ObjectRecordId).

vobjects_object_name_object_record_id_get_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% vobjects_object_name_post
%%==============================================================================

vobjects_object_name_post(ObjectName) ->
  openapi_api:vobjects_object_name_post(ObjectName).

vobjects_object_name_post_args(_S) ->
  [binary()].

%%==============================================================================
%% vobjects_object_name_put
%%==============================================================================

vobjects_object_name_put(ObjectName) ->
  openapi_api:vobjects_object_name_put(ObjectName).

vobjects_object_name_put_args(_S) ->
  [binary()].

%%==============================================================================
%% vobjects_object_name_roles_delete
%%==============================================================================

vobjects_object_name_roles_delete(ObjectName) ->
  openapi_api:vobjects_object_name_roles_delete(ObjectName).

vobjects_object_name_roles_delete_args(_S) ->
  [binary()].

%%==============================================================================
%% vobjects_object_name_roles_post
%%==============================================================================

vobjects_object_name_roles_post(ObjectName) ->
  openapi_api:vobjects_object_name_roles_post(ObjectName).

vobjects_object_name_roles_post_args(_S) ->
  [binary()].

%%==============================================================================
%% vobjects_outbound_package_v_package_id_dependencies_get
%%==============================================================================

vobjects_outbound_package_v_package_id_dependencies_get(PackageId) ->
  openapi_api:vobjects_outbound_package_v_package_id_dependencies_get(PackageId).

vobjects_outbound_package_v_package_id_dependencies_get_args(_S) ->
  [binary()].

