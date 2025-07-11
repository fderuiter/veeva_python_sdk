note
    description: "API tests for DEFAULT_API"
    date: "$Date$"
    revision: "$Revision$"


class DEFAULT_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_api_get
            -- Retrieve API Versions
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.api_get(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_api_mdl_components_component_type_and_record_name_files_get
            -- Retrieve Content File
            --
            -- 
        local
            l_component_type_and_record_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_component_type_and_record_name

            -- api.api_mdl_components_component_type_and_record_name_files_get(l_component_type_and_record_name, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_api_mdl_components_component_type_and_record_name_get
            -- Retrieve Component Record (MDL)
            --
            -- 
        local
            l_component_type_and_record_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_component_type_and_record_name

            -- api.api_mdl_components_component_type_and_record_name_get(l_component_type_and_record_name, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_api_mdl_execute_async_job_id_results_get
            -- Retrieve Asynchronous MDL Script Results
            --
            -- 
        local
            l_job_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_job_id

            -- api.api_mdl_execute_async_job_id_results_get(l_job_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_api_mdl_execute_async_post
            -- Execute MDL Script Asynchronously
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.api_mdl_execute_async_post(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_api_mdl_execute_post
            -- Execute MDL Script
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.api_mdl_execute_post(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_api_mdl_files_post
            -- Upload Content File
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.api_mdl_files_post(l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_audittrail_audit_trail_type_get
            -- Retrieve Audit Details
            --
            -- 
        local
            l_audit_trail_type: STRING_32
            l_start_date: STRING_32
            l_end_date: STRING_32
            l_all_dates: STRING_32
            l_format_result: STRING_32
            l_limit: STRING_32
            l_offset: STRING_32
            l_objects: STRING_32
            l_events: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_audit_trail_type

            -- api.audittrail_audit_trail_type_get(l_audit_trail_type, l_start_date, l_end_date, l_all_dates, l_format_result, l_limit, l_offset, l_objects, l_events, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_auth_discovery_post
            -- Authentication Type Discovery
            --
            -- 
        local
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.auth_discovery_post(l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_auth_oauth_session_oath_oidc_profile_id_post
            -- OAuth 2.0 / OpenID Connect
            --
            -- 
        local
            l_oath_oidc_profile_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_oath_oidc_profile_id

            -- api.auth_oauth_session_oath_oidc_profile_id_post(l_oath_oidc_profile_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_auth_post
            -- User Name and Password
            --
            -- 
        local
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.auth_post(l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_code_class_name_delete
            -- Delete Single Source Code File
            --
            -- 
        local
            l_class_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_class_name

            -- api.code_class_name_delete(l_class_name, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_code_class_name_disable_put
            -- Disable Vault Extension
            --
            -- 
        local
            l_class_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_class_name

            -- api.code_class_name_disable_put(l_class_name, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_code_class_name_enable_put
            -- Enable Vault Extension
            --
            -- 
        local
            l_class_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_class_name

            -- api.code_class_name_enable_put(l_class_name, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_code_class_name_get
            -- Retrieve Single Source Code File
            --
            -- 
        local
            l_class_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_class_name

            -- api.code_class_name_get(l_class_name, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_code_profiler_get
            -- Retrieve All Profiling Sessions
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.code_profiler_get(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_code_profiler_post
            -- Create Profiling Session
            --
            -- 
        local
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.code_profiler_post(l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_code_profiler_session_name_actions_end_post
            -- End Profiling Session
            --
            -- 
        local
            l_session_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_session_name

            -- api.code_profiler_session_name_actions_end_post(l_session_name, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_code_profiler_session_name_delete
            -- Delete Profiling Session
            --
            -- 
        local
            l_session_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_session_name

            -- api.code_profiler_session_name_delete(l_session_name, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_code_profiler_session_name_get
            -- Retrieve Profiling Session
            --
            -- 
        local
            l_session_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_session_name

            -- api.code_profiler_session_name_get(l_session_name, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_code_profiler_session_name_results_get
            -- Download Profiling Session Results
            --
            -- 
        local
            l_session_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_session_name

            -- api.code_profiler_session_name_results_get(l_session_name, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_code_put
            -- Add or Replace Single Source Code File
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.code_put(l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_composites_trees_edl_hierarchy_or_template_actions_listnodes_post
            -- Retrieve Specific Root Nodes
            --
            -- 
        local
            l_edl_hierarchy_or_template: STRING_32
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_edl_hierarchy_or_template

            -- api.composites_trees_edl_hierarchy_or_template_actions_listnodes_post(l_edl_hierarchy_or_template, l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_composites_trees_edl_hierarchy_or_template_get
            -- Retrieve All Root Nodes
            --
            -- 
        local
            l_edl_hierarchy_or_template: STRING_32
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_edl_hierarchy_or_template

            -- api.composites_trees_edl_hierarchy_or_template_get(l_edl_hierarchy_or_template, l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_composites_trees_edl_hierarchy_vparent_node_id_children_get
            -- Retrieve a Node&#39;s Children
            --
            -- 
        local
            l_parent_node_id: STRING_32
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_parent_node_id

            -- api.composites_trees_edl_hierarchy_vparent_node_id_children_get(l_parent_node_id, l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_composites_trees_edl_hierarchy_vparent_node_id_children_put
            -- Update Node Order
            --
            -- 
        local
            l_parent_node_id: STRING_32
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_parent_node_id

            -- api.composites_trees_edl_hierarchy_vparent_node_id_children_put(l_parent_node_id, l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_configuration_component_type_and_record_name_get
            -- Retrieve Component Record (XML/JSON)
            --
            -- 
        local
            l_component_type_and_record_name: STRING_32
            l_loc: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_component_type_and_record_name

            -- api.configuration_component_type_and_record_name_get(l_component_type_and_record_name, l_loc, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_configuration_component_type_get
            -- Retrieve Component Record Collection
            --
            -- 
        local
            l_component_type: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_component_type

            -- api.configuration_component_type_get(l_component_type, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_configuration_object_name_and_object_type_get
            -- Retrieve Details from a Specific Object
            --
            -- 
        local
            l_object_name_and_object_type: STRING_32
            l_loc: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name_and_object_type

            -- api.configuration_object_name_and_object_type_get(l_object_name_and_object_type, l_loc, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_configuration_objecttype_get
            -- Retrieve Details from All Object Types
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.configuration_objecttype_get(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_configuration_role_assignment_rule_delete
            -- Delete Lifecycle Role Assignment Override Rules
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.configuration_role_assignment_rule_delete(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_configuration_role_assignment_rule_get
            -- Retrieve Lifecycle Role Assignment Rules (Default &amp; Override)
            --
            -- 
        local
            l_lifecycle__v: STRING_32
            l_role__v: STRING_32
            l_product__v: STRING_32
            l_country__v: STRING_32
            l_study__v: STRING_32
            l_study_country__v: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.configuration_role_assignment_rule_get(l_lifecycle__v, l_role__v, l_product__v, l_country__v, l_study__v, l_study_country__v, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_configuration_role_assignment_rule_post
            -- Create Lifecycle Role Assignment Override Rules
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.configuration_role_assignment_rule_post(l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_configuration_role_assignment_rule_put
            -- Update Lifecycle Role Assignment Rules (Default &amp; Override)
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.configuration_role_assignment_rule_put(l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_delegation_login_post
            -- Initiate Delegated Session
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.delegation_login_post(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_delegation_vaults_get
            -- Retrieve Delegations
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.delegation_vaults_get(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_keep_alive_post
            -- Session Keep Alive
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.keep_alive_post(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_limits_get
            -- Retrieve Limits on Objects
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.limits_get(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_logs_api_usage_get
            -- Download Daily API Usage
            --
            -- 
        local
            l_date: STRING_32
            l_log_format: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.logs_api_usage_get(l_date, l_log_format, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_logs_code_debug_get
            -- Retrieve All Debug Logs
            --
            -- 
        local
            l_user_id: STRING_32
            l_include_inactive: BOOLEAN
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.logs_code_debug_get(l_user_id, l_include_inactive, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_logs_code_debug_id_actions_reset_delete
            -- Delete Debug Log
            --
            -- 
        local
            l_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- api.logs_code_debug_id_actions_reset_delete(l_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_logs_code_debug_id_actions_reset_post
            -- Reset Debug Log
            --
            -- 
        local
            l_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- api.logs_code_debug_id_actions_reset_post(l_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_logs_code_debug_id_files_get
            -- Download Debug Log Files
            --
            -- 
        local
            l_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- api.logs_code_debug_id_files_get(l_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_logs_code_debug_id_get
            -- Retrieve Single Debug Log
            --
            -- 
        local
            l_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- api.logs_code_debug_id_get(l_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_logs_code_debug_post
            -- Create Debug Log
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.logs_code_debug_post(l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_logs_code_runtime_get
            -- Download SDK Runtime Log
            --
            -- 
        local
            l_date: STRING_32
            l_log_format: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.logs_code_runtime_get(l_date, l_log_format, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_messages_message_type_actions_import_post
            -- Import Bulk Translation File
            --
            -- 
        local
            l_message_type: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_message_type

            -- api.messages_message_type_actions_import_post(l_message_type, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_messages_message_type_language_lang_actions_export_post
            -- Export Bulk Translation File
            --
            -- 
        local
            l_message_type: STRING_32
            l_lang: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_message_type
            -- l_lang

            -- api.messages_message_type_language_lang_actions_export_post(l_message_type, l_lang, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_metadata_audittrail_audit_trail_type_get
            -- Retrieve Audit Metadata
            --
            -- 
        local
            l_audit_trail_type: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_audit_trail_type

            -- api.metadata_audittrail_audit_trail_type_get(l_audit_trail_type, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_metadata_audittrail_get
            -- Retrieve Audit Types
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.metadata_audittrail_get(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_metadata_components_component_type_get
            -- Retrieve Component Type Metadata
            --
            -- 
        local
            l_component_type: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_component_type

            -- api.metadata_components_component_type_get(l_component_type, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_metadata_components_get
            -- Retrieve All Component Metadata
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.metadata_components_get(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_metadata_objects_binders_templates_bindernodes_get
            -- Retrieve Binder Template Node Metadata
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.metadata_objects_binders_templates_bindernodes_get(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_metadata_objects_binders_templates_get
            -- Retrieve Binder Template Metadata
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.metadata_objects_binders_templates_get(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_metadata_objects_documents_annotations_placemarks_types_placemark_type_get
            -- Retrieve Annotation Placemark Type Metadata
            --
            -- 
        local
            l_placemark_type: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_placemark_type

            -- api.metadata_objects_documents_annotations_placemarks_types_placemark_type_get(l_placemark_type, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_metadata_objects_documents_annotations_references_types_reference_type_get
            -- Retrieve Annotation Reference Type Metadata
            --
            -- 
        local
            l_reference_type: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_reference_type

            -- api.metadata_objects_documents_annotations_references_types_reference_type_get(l_reference_type, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_metadata_objects_documents_annotations_types_annotation_type_get
            -- Retrieve Annotation Type Metadata
            --
            -- 
        local
            l_annotation_type: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_annotation_type

            -- api.metadata_objects_documents_annotations_types_annotation_type_get(l_annotation_type, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_metadata_objects_documents_events_event_type_types_event_subtype_get
            -- Retrieve Document Event SubType Metadata
            --
            -- 
        local
            l_event_type: STRING_32
            l_event_subtype: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_event_type
            -- l_event_subtype

            -- api.metadata_objects_documents_events_event_type_types_event_subtype_get(l_event_type, l_event_subtype, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_metadata_objects_documents_events_get
            -- Retrieve Document Event Types and Subtypes
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.metadata_objects_documents_events_get(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_metadata_objects_documents_lock_get
            -- Retrieve Document Lock Metadata
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.metadata_objects_documents_lock_get(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_metadata_objects_documents_properties_find_common_post
            -- Retrieve Common Document Fields
            --
            -- 
        local
            l_content__type: STRING_32
            l_accept: STRING_32
            l_authorization: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.metadata_objects_documents_properties_find_common_post(l_content__type, l_accept, l_authorization, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_metadata_objects_documents_properties_get
            -- Retrieve All Document Fields
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.metadata_objects_documents_properties_get(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_metadata_objects_documents_templates_get
            -- Retrieve Document Template Metadata
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.metadata_objects_documents_templates_get(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_metadata_objects_documents_types_get
            -- Retrieve All Document Types
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.metadata_objects_documents_types_get(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_metadata_objects_documents_types_type_get
            -- Retrieve Document Type
            --
            -- 
        local
            l_type: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_type

            -- api.metadata_objects_documents_types_type_get(l_type, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_metadata_objects_documents_types_type_relationships_get
            -- Retrieve Document Type Relationships
            --
            -- 
        local
            l_type: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_type

            -- api.metadata_objects_documents_types_type_relationships_get(l_type, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_metadata_objects_documents_types_type_subtypes_subtype_classifications_classification_get
            -- Retrieve Document Classification
            --
            -- 
        local
            l_type: STRING_32
            l_subtype: STRING_32
            l_classification: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_type
            -- l_subtype
            -- l_classification

            -- api.metadata_objects_documents_types_type_subtypes_subtype_classifications_classification_get(l_type, l_subtype, l_classification, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_metadata_objects_documents_types_type_subtypes_subtype_get
            -- Retrieve Document Subtype
            --
            -- 
        local
            l_type: STRING_32
            l_subtype: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_type
            -- l_subtype

            -- api.metadata_objects_documents_types_type_subtypes_subtype_get(l_type, l_subtype, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_metadata_objects_groups_get
            -- Retrieve Group Metadata
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.metadata_objects_groups_get(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_metadata_objects_securitypolicies_get
            -- Retrieve Security Policy Metadata
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.metadata_objects_securitypolicies_get(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_metadata_objects_users_get
            -- Retrieve User Metadata
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.metadata_objects_users_get(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_metadata_query_archived_documents_relationships_document_signature_sysr_get
            -- Retrieve Archived Document Signature Metadata
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.metadata_query_archived_documents_relationships_document_signature_sysr_get(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_metadata_query_documents_relationships_document_signature_sysr_get
            -- Retrieve Document Signature Metadata
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.metadata_query_documents_relationships_document_signature_sysr_get(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_metadata_vobjects_get
            -- Retrieve Object Collection
            --
            -- 
        local
            l_loc: BOOLEAN
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.metadata_vobjects_get(l_loc, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_metadata_vobjects_object_name_actions_canceldeployment_post
            -- Cancel Raw Object Deployment
            --
            -- 
        local
            l_object_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name

            -- api.metadata_vobjects_object_name_actions_canceldeployment_post(l_object_name, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_metadata_vobjects_object_name_fields_object_field_name_get
            -- Retrieve Object Field Metadata
            --
            -- 
        local
            l_object_name: STRING_32
            l_object_field_name: STRING_32
            l_loc: BOOLEAN
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name
            -- l_object_field_name

            -- api.metadata_vobjects_object_name_fields_object_field_name_get(l_object_name, l_object_field_name, l_loc, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_metadata_vobjects_object_name_get
            -- Retrieve Object Metadata
            --
            -- 
        local
            l_object_name: STRING_32
            l_loc: BOOLEAN
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name

            -- api.metadata_vobjects_object_name_get(l_object_name, l_loc, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_metadata_vobjects_object_name_page_layouts_get
            -- Retrieve Page Layouts
            --
            -- 
        local
            l_object_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name

            -- api.metadata_vobjects_object_name_page_layouts_get(l_object_name, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_metadata_vobjects_object_name_page_layouts_layout_name_get
            -- Retrieve Page Layout Metadata
            --
            -- 
        local
            l_object_name: STRING_32
            l_layout_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name
            -- l_layout_name

            -- api.metadata_vobjects_object_name_page_layouts_layout_name_get(l_object_name, l_layout_name, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_notifications_histories_get
            -- Retrieve Email Notification Histories
            --
            -- 
        local
            l_start_date: STRING_32
            l_end_date: STRING_32
            l_all_dates: BOOLEAN
            l_format_result: STRING_32
            l_limit: STRING_32
            l_offset: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.notifications_histories_get(l_start_date, l_end_date, l_all_dates, l_format_result, l_limit, l_offset, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_object_workflow_actions_action_get
            -- Retrieve Bulk Workflow Action Details
            --
            -- 
        local
            l_action: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_action

            -- api.object_workflow_actions_action_get(l_action, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_object_workflow_actions_action_post
            -- Initiate Workflow Actions on Multiple Workflows
            --
            -- 
        local
            l_action: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_action

            -- api.object_workflow_actions_action_post(l_action, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_object_workflow_actions_canceltasks_post
            -- Cancel Workflow Tasks
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.object_workflow_actions_canceltasks_post(l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_object_workflow_actions_cancelworkflows_post
            -- Cancel Workflows
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.object_workflow_actions_cancelworkflows_post(l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_object_workflow_actions_get
            -- Retrieve Bulk Workflow Actions
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.object_workflow_actions_get(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_object_workflow_actions_reassigntasks_post
            -- Reassign Workflow Tasks
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.object_workflow_actions_reassigntasks_post(l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_object_workflow_actions_replaceworkflowowner_post
            -- Replace Workflow Owner
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.object_workflow_actions_replaceworkflowowner_post(l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_actions_export_job_id_results_get
            -- Retrieve Binder Export Results
            --
            -- 
        local
            l_job_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_job_id

            -- api.objects_binders_actions_export_job_id_results_get(l_job_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_binder_id_actions_export_post
            -- Export Binder (Latest Version)
            --
            -- 
        local
            l_binder_id: STRING_32
            l_source: BOOLEAN
            l_renditiontype: STRING_32
            l_docversion: STRING_32
            l_attachments: STRING_32
            l_var_export: STRING_32
            l_docfield: BOOLEAN
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_binder_id

            -- api.objects_binders_binder_id_actions_export_post(l_binder_id, l_source, l_renditiontype, l_docversion, l_attachments, l_var_export, l_docfield, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_binder_id_actions_post
            -- Refresh Binder Auto-Filing
            --
            -- 
        local
            l_binder_id: STRING_32
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_binder_id

            -- api.objects_binders_binder_id_actions_post(l_binder_id, l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_binder_id_binding_rule_put
            -- Update Binding Rule
            --
            -- 
        local
            l_binder_id: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_authorization: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_binder_id

            -- api.objects_binders_binder_id_binding_rule_put(l_binder_id, l_content__type, l_accept, l_authorization, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_binder_id_delete
            -- Delete Binder
            --
            -- 
        local
            l_binder_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_binder_id

            -- api.objects_binders_binder_id_delete(l_binder_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_binder_id_documents_node_id_binding_rule_put
            -- Update Binder Document Binding Rule
            --
            -- 
        local
            l_binder_id: STRING_32
            l_node_id: STRING_32
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_binder_id
            -- l_node_id

            -- api.objects_binders_binder_id_documents_node_id_binding_rule_put(l_binder_id, l_node_id, l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_binder_id_documents_post
            -- Add Document to Binder
            --
            -- 
        local
            l_binder_id: STRING_32
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_binder_id

            -- api.objects_binders_binder_id_documents_post(l_binder_id, l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_binder_id_documents_section_id_delete
            -- Remove Document from Binder
            --
            -- 
        local
            l_binder_id: STRING_32
            l_section_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_binder_id
            -- l_section_id

            -- api.objects_binders_binder_id_documents_section_id_delete(l_binder_id, l_section_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_binder_id_documents_section_id_put
            -- Move Document in Binder
            --
            -- 
        local
            l_binder_id: STRING_32
            l_section_id: STRING_32
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_binder_id
            -- l_section_id

            -- api.objects_binders_binder_id_documents_section_id_put(l_binder_id, l_section_id, l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_binder_id_get
            -- Retrieve Binder
            --
            -- 
        local
            l_binder_id: STRING_32
            l_depth: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_binder_id

            -- api.objects_binders_binder_id_get(l_binder_id, l_depth, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_binder_id_post
            -- Create Binder Version
            --
            -- 
        local
            l_binder_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_binder_id

            -- api.objects_binders_binder_id_post(l_binder_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_binder_id_put
            -- Update Binder
            --
            -- 
        local
            l_binder_id: STRING_32
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_binder_id

            -- api.objects_binders_binder_id_put(l_binder_id, l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_binder_id_roles_role_name_and_user_or_group_id_delete
            -- Remove Users &amp; Groups from Roles on a Single Binder
            --
            -- 
        local
            l_binder_id: STRING_32
            l_role_name_and_user_or_group: STRING_32
            l_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_binder_id
            -- l_role_name_and_user_or_group
            -- l_id

            -- api.objects_binders_binder_id_roles_role_name_and_user_or_group_id_delete(l_binder_id, l_role_name_and_user_or_group, l_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_binder_id_sections_node_id_binding_rule_put
            -- Update Binder Section Binding Rule
            --
            -- 
        local
            l_binder_id: STRING_32
            l_node_id: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_authorization: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_binder_id
            -- l_node_id

            -- api.objects_binders_binder_id_sections_node_id_binding_rule_put(l_binder_id, l_node_id, l_content__type, l_accept, l_authorization, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_binder_id_sections_node_id_put
            -- Update Binder Section
            --
            -- 
        local
            l_binder_id: STRING_32
            l_node_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_binder_id
            -- l_node_id

            -- api.objects_binders_binder_id_sections_node_id_put(l_binder_id, l_node_id, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_binder_id_sections_post
            -- Create Binder Section
            --
            -- 
        local
            l_binder_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_binder_id

            -- api.objects_binders_binder_id_sections_post(l_binder_id, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_binder_id_sections_section_id_delete
            -- Delete Binder Section
            --
            -- 
        local
            l_binder_id: STRING_32
            l_section_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_binder_id
            -- l_section_id

            -- api.objects_binders_binder_id_sections_section_id_delete(l_binder_id, l_section_id, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_binder_id_sections_section_id_get
            -- Retrieve Binder Sections
            --
            -- 
        local
            l_binder_id: STRING_32
            l_section_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_binder_id
            -- l_section_id

            -- api.objects_binders_binder_id_sections_section_id_get(l_binder_id, l_section_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_binder_id_versions_get
            -- Retrieve All Binder Versions
            --
            -- 
        local
            l_binder_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_binder_id

            -- api.objects_binders_binder_id_versions_get(l_binder_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_binder_id_versions_major_version_minor_version_actions_export_post
            -- Export Binder (Specific Version)
            --
            -- 
        local
            l_binder_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_source: BOOLEAN
            l_renditiontype: STRING_32
            l_docversion: STRING_32
            l_attachments: STRING_32
            l_var_export: STRING_32
            l_docfield: BOOLEAN
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_binder_id
            -- l_major_version
            -- l_minor_version

            -- api.objects_binders_binder_id_versions_major_version_minor_version_actions_export_post(l_binder_id, l_major_version, l_minor_version, l_source, l_renditiontype, l_docversion, l_attachments, l_var_export, l_docfield, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_binder_id_versions_major_version_minor_version_delete
            -- Delete Binder Version
            --
            -- 
        local
            l_binder_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_binder_id
            -- l_major_version
            -- l_minor_version

            -- api.objects_binders_binder_id_versions_major_version_minor_version_delete(l_binder_id, l_major_version, l_minor_version, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_binder_id_versions_major_version_minor_version_get
            -- Retrieve Binder Version
            --
            -- 
        local
            l_binder_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_binder_id
            -- l_major_version
            -- l_minor_version

            -- api.objects_binders_binder_id_versions_major_version_minor_version_get(l_binder_id, l_major_version, l_minor_version, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_binder_id_versions_major_version_minor_version_put
            -- Update Binder Version
            --
            -- 
        local
            l_binder_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_binder_id
            -- l_major_version
            -- l_minor_version

            -- api.objects_binders_binder_id_versions_major_version_minor_version_put(l_binder_id, l_major_version, l_minor_version, l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_binder_id_versions_major_version_minor_version_relationships_post
            -- Create Binder Relationship
            --
            -- 
        local
            l_binder_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_binder_id
            -- l_major_version
            -- l_minor_version

            -- api.objects_binders_binder_id_versions_major_version_minor_version_relationships_post(l_binder_id, l_major_version, l_minor_version, l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_delete
            -- Delete Binder Relationship
            --
            -- 
        local
            l_binder_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_relationship_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_binder_id
            -- l_major_version
            -- l_minor_version
            -- l_relationship_id

            -- api.objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_delete(l_binder_id, l_major_version, l_minor_version, l_relationship_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_get
            -- Retrieve Binder Relationship
            --
            -- 
        local
            l_binder_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_relationship_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_binder_id
            -- l_major_version
            -- l_minor_version
            -- l_relationship_id

            -- api.objects_binders_binder_id_versions_major_version_minor_version_relationships_relationship_id_get(l_binder_id, l_major_version, l_minor_version, l_relationship_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_binder_id_versions_major_version_minor_version_sections_section_id_get
            -- Retrieve Binder Version Section
            --
            -- 
        local
            l_binder_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_section_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_binder_id
            -- l_major_version
            -- l_minor_version
            -- l_section_id

            -- api.objects_binders_binder_id_versions_major_version_minor_version_sections_section_id_get(l_binder_id, l_major_version, l_minor_version, l_section_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_id_roles_get
            -- Retrieve All Binder Roles
            --
            -- 
        local
            l_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- api.objects_binders_id_roles_get(l_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_id_roles_post
            -- Assign Users &amp; Groups to Roles on a Single Binder
            --
            -- 
        local
            l_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- api.objects_binders_id_roles_post(l_id, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_id_roles_role_name_get
            -- Retrieve Document Role
            --
            -- 
        local
            l_id: STRING_32
            l_role_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id
            -- l_role_name

            -- api.objects_binders_id_roles_role_name_get(l_id, l_role_name, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_id_versions_major_version_minor_version_lifecycle_actions_get
            -- Retrieve Binder User Actions
            --
            -- 
        local
            l_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id
            -- l_major_version
            -- l_minor_version

            -- api.objects_binders_id_versions_major_version_minor_version_lifecycle_actions_get(l_id, l_major_version, l_minor_version, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_ventry_requirements_get
            -- Retrieve Binder Entry Criteria
            --
            -- 
        local
            l_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_name__v: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id
            -- l_major_version
            -- l_minor_version
            -- l_name__v

            -- api.objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_ventry_requirements_get(l_id, l_major_version, l_minor_version, l_name__v, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_vput
            -- Initiate Binder User Action
            --
            -- 
        local
            l_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_name__v: STRING_32
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id
            -- l_major_version
            -- l_minor_version
            -- l_name__v

            -- api.objects_binders_id_versions_major_version_minor_version_lifecycle_actions_name_vput(l_id, l_major_version, l_minor_version, l_name__v, l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_lifecycle_actions_post
            -- Retrieve User Actions on Multiple Binders
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_binders_lifecycle_actions_post(l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_lifecycle_actions_user_action_name_put
            -- Initiate Bulk Binder User Actions
            --
            -- 
        local
            l_user_action_name: STRING_32
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_user_action_name

            -- api.objects_binders_lifecycle_actions_user_action_name_put(l_user_action_name, l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_post
            -- Create Binder
            --
            -- 
        local
            l_async: BOOLEAN
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_binders_post(l_async, l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_templates_get
            -- Retrieve Binder Template Collection
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_binders_templates_get(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_templates_post
            -- Create Binder Template
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_binders_templates_post(l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_templates_put
            -- Update Binder Template
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_binders_templates_put(l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_templates_template_name_bindernodes_get
            -- Retrieve Binder Template Node Attributes
            --
            -- 
        local
            l_template_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_template_name

            -- api.objects_binders_templates_template_name_bindernodes_get(l_template_name, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_templates_template_name_bindernodes_post
            -- Create Binder Template Node
            --
            -- 
        local
            l_template_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_template_name

            -- api.objects_binders_templates_template_name_bindernodes_post(l_template_name, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_templates_template_name_bindernodes_put
            -- Replace Binder Template Nodes
            --
            -- 
        local
            l_template_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_template_name

            -- api.objects_binders_templates_template_name_bindernodes_put(l_template_name, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_templates_template_name_delete
            -- Delete Binder Template
            --
            -- 
        local
            l_template_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_template_name

            -- api.objects_binders_templates_template_name_delete(l_template_name, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_binders_templates_template_name_get
            -- Retrieve Binder Template Attributes
            --
            -- 
        local
            l_template_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_template_name

            -- api.objects_binders_templates_template_name_get(l_template_name, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_deletions_documents_get
            -- Retrieve Deleted Document IDs
            --
            -- 
        local
            l_start_date: STRING_32
            l_end_date: STRING_32
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_deletions_documents_get(l_start_date, l_end_date, l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_deletions_vobjects_object_name_get
            -- Retrieve Deleted Object Record ID
            --
            -- 
        local
            l_object_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name

            -- api.objects_deletions_vobjects_object_name_get(l_object_name, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_actions_get
            -- Retrieve All Document Workflows
            --
            -- 
        local
            l_loc: BOOLEAN
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_documents_actions_get(l_loc, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_actions_lifecycle_and_state_and_action_job_id_results_get
            -- Download Controlled Copy Job Results
            --
            -- 
        local
            l_lifecycle_and_state_and_action: STRING_32
            l_job_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_lifecycle_and_state_and_action
            -- l_job_id

            -- api.objects_documents_actions_lifecycle_and_state_and_action_job_id_results_get(l_lifecycle_and_state_and_action, l_job_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_actions_workflow_name_get
            -- Retrieve Document Workflow Details
            --
            -- 
        local
            l_workflow_name: STRING_32
            l_loc: BOOLEAN
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_workflow_name

            -- api.objects_documents_actions_workflow_name_get(l_workflow_name, l_loc, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_actions_workflow_name_post
            -- Initiate Document Workflow
            --
            -- 
        local
            l_workflow_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_workflow_name

            -- api.objects_documents_actions_workflow_name_post(l_workflow_name, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_annotations_batch_delete
            -- Delete Annotations
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_documents_annotations_batch_delete(l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_annotations_batch_post
            -- Create Multiple Annotations
            --
            -- 
        local
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_authorization
            -- l_content__type
            -- l_accept
            -- l_x__vault_ap_i__client_id

            -- api.objects_documents_annotations_batch_post(l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_annotations_batch_put
            -- Update Annotations
            --
            -- 
        local
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_documents_annotations_batch_put(l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_annotations_replies_batch_post
            -- Add Annotation Replies
            --
            -- 
        local
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_documents_annotations_replies_batch_post(l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_attachments_batch_delete
            -- Delete Multiple Document Attachments
            --
            -- 
        local
            l_accept: STRING_32
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_documents_attachments_batch_delete(l_accept, l_authorization, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_attachments_batch_post
            -- Create Multiple Document Attachments
            --
            -- 
        local
            l_accept: STRING_32
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_documents_attachments_batch_post(l_accept, l_authorization, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_attachments_batch_put
            -- Update Multiple Document Attachment Descriptions
            --
            -- 
        local
            l_accept: STRING_32
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_documents_attachments_batch_put(l_accept, l_authorization, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_batch_actions_fileextract_job_id_results_get
            -- Retrieve Document Export Results
            --
            -- 
        local
            l_job_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_job_id

            -- api.objects_documents_batch_actions_fileextract_job_id_results_get(l_job_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_batch_actions_fileextract_post
            -- Export Documents
            --
            -- 
        local
            l_source: BOOLEAN
            l_renditions: BOOLEAN
            l_allversions: BOOLEAN
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_documents_batch_actions_fileextract_post(l_source, l_renditions, l_allversions, l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_batch_actions_reclassify_put
            -- Reclassify Multiple Documents
            --
            -- 
        local
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__migration_mode: BOOLEAN
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_documents_batch_actions_reclassify_put(l_authorization, l_content__type, l_accept, l_x__vault_ap_i__migration_mode, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_batch_actions_rerender_post
            -- Update Multiple Document Renditions
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_documents_batch_actions_rerender_post(l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_batch_delete
            -- Delete Multiple Documents
            --
            -- 
        local
            l_id_param: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_documents_batch_delete(l_id_param, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_batch_lock_delete
            -- Undo Collaborative Authoring Checkout
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_documents_batch_lock_delete(l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_batch_post
            -- Create Multiple Documents
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__migration_mode: BOOLEAN
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_documents_batch_post(l_authorization, l_accept, l_content__type, l_x__vault_ap_i__migration_mode, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_batch_put
            -- Update Multiple Documents
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__migration_mode: BOOLEAN
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_documents_batch_put(l_authorization, l_accept, l_content__type, l_x__vault_ap_i__migration_mode, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_anchors_get
            -- Retrieve Anchor IDs
            --
            -- 
        local
            l_doc_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id

            -- api.objects_documents_doc_id_anchors_get(l_doc_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_annotations_file_get
            -- Export Document Annotations to PDF
            --
            -- 
        local
            l_doc_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id

            -- api.objects_documents_doc_id_annotations_file_get(l_doc_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_annotations_file_post
            -- Import Document Annotations from PDF
            --
            -- 
        local
            l_doc_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id

            -- api.objects_documents_doc_id_annotations_file_post(l_doc_id, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_attachments_attachment_id_delete
            -- Delete Single Document Attachment
            --
            -- 
        local
            l_doc_id: STRING_32
            l_attachment_id: STRING_32
            l_accept: STRING_32
            l_authorization: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_attachment_id

            -- api.objects_documents_doc_id_attachments_attachment_id_delete(l_doc_id, l_attachment_id, l_accept, l_authorization, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_attachments_attachment_id_file_get
            -- Download Document Attachment
            --
            -- 
        local
            l_doc_id: STRING_32
            l_attachment_id: STRING_32
            l_accept: STRING_32
            l_authorization: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_attachment_id

            -- api.objects_documents_doc_id_attachments_attachment_id_file_get(l_doc_id, l_attachment_id, l_accept, l_authorization, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_attachments_attachment_id_get
            -- Retrieve Document Attachment Metadata
            --
            -- 
        local
            l_doc_id: STRING_32
            l_attachment_id: STRING_32
            l_accept: STRING_32
            l_authorization: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_attachment_id

            -- api.objects_documents_doc_id_attachments_attachment_id_get(l_doc_id, l_attachment_id, l_accept, l_authorization, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_attachments_attachment_id_put
            -- Update Document Attachment Description
            --
            -- 
        local
            l_doc_id: STRING_32
            l_attachment_id: STRING_32
            l_accept: STRING_32
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_attachment_id

            -- api.objects_documents_doc_id_attachments_attachment_id_put(l_doc_id, l_attachment_id, l_accept, l_authorization, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_delete
            -- Delete Single Document Attachment Version
            --
            -- 
        local
            l_doc_id: STRING_32
            l_attachment_id: STRING_32
            l_attachment_version: STRING_32
            l_accept: STRING_32
            l_authorization: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_attachment_id
            -- l_attachment_version

            -- api.objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_delete(l_doc_id, l_attachment_id, l_attachment_version, l_accept, l_authorization, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_file_get
            -- Download Document Attachment Version
            --
            -- 
        local
            l_doc_id: STRING_32
            l_attachment_id: STRING_32
            l_attachment_version: STRING_32
            l_accept: STRING_32
            l_authorization: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_attachment_id
            -- l_attachment_version

            -- api.objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_file_get(l_doc_id, l_attachment_id, l_attachment_version, l_accept, l_authorization, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_get
            -- Retrieve Document Attachment Version Metadata
            --
            -- 
        local
            l_doc_id: STRING_32
            l_attachment_id: STRING_32
            l_attachment_version: STRING_32
            l_accept: STRING_32
            l_authorization: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_attachment_id
            -- l_attachment_version

            -- api.objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_get(l_doc_id, l_attachment_id, l_attachment_version, l_accept, l_authorization, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_post
            -- Restore Document Attachment Version
            --
            -- 
        local
            l_doc_id: STRING_32
            l_attachment_id: STRING_32
            l_attachment_version: STRING_32
            l_restore: BOOLEAN
            l_accept: STRING_32
            l_authorization: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_attachment_id
            -- l_attachment_version

            -- api.objects_documents_doc_id_attachments_attachment_id_versions_attachment_version_post(l_doc_id, l_attachment_id, l_attachment_version, l_restore, l_accept, l_authorization, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_attachments_attachment_id_versions_get
            -- Retrieve Document Attachment Versions
            --
            -- 
        local
            l_doc_id: STRING_32
            l_attachment_id: STRING_32
            l_accept: STRING_32
            l_authorization: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_attachment_id

            -- api.objects_documents_doc_id_attachments_attachment_id_versions_get(l_doc_id, l_attachment_id, l_accept, l_authorization, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_attachments_file_get
            -- Download All Document Attachments
            --
            -- 
        local
            l_doc_id: STRING_32
            l_accept: STRING_32
            l_authorization: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id

            -- api.objects_documents_doc_id_attachments_file_get(l_doc_id, l_accept, l_authorization, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_attachments_get
            -- Retrieve Document Attachments
            --
            -- 
        local
            l_doc_id: STRING_32
            l_accept: STRING_32
            l_authorization: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id

            -- api.objects_documents_doc_id_attachments_get(l_doc_id, l_accept, l_authorization, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_attachments_post
            -- Create Document Attachment
            --
            -- 
        local
            l_doc_id: STRING_32
            l_accept: STRING_32
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id

            -- api.objects_documents_doc_id_attachments_post(l_doc_id, l_accept, l_authorization, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_audittrail_get
            -- Retrieve Complete Audit History for a Single Document
            --
            -- 
        local
            l_doc_id: STRING_32
            l_start_date: STRING_32
            l_end_date: STRING_32
            l_format_result: STRING_32
            l_limit: STRING_32
            l_offset: STRING_32
            l_events: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id

            -- api.objects_documents_doc_id_audittrail_get(l_doc_id, l_start_date, l_end_date, l_format_result, l_limit, l_offset, l_events, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_delete
            -- Delete Single Document
            --
            -- 
        local
            l_doc_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id

            -- api.objects_documents_doc_id_delete(l_doc_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_events_get
            -- Retrieve Document Events
            --
            -- 
        local
            l_doc_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id

            -- api.objects_documents_doc_id_events_get(l_doc_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_file_get
            -- Download Document File
            --
            -- 
        local
            l_doc_id: STRING_32
            l_lock_document: BOOLEAN
            l_accept: STRING_32
            l_authorization: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id

            -- api.objects_documents_doc_id_file_get(l_doc_id, l_lock_document, l_accept, l_authorization, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_get
            -- Retrieve Document
            --
            -- 
        local
            l_doc_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id

            -- api.objects_documents_doc_id_get(l_doc_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_lock_delete
            -- Delete Document Lock
            --
            -- 
        local
            l_doc_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id

            -- api.objects_documents_doc_id_lock_delete(l_doc_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_lock_get
            -- Retrieve Document Lock
            --
            -- 
        local
            l_doc_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id

            -- api.objects_documents_doc_id_lock_get(l_doc_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_lock_post
            -- Create Document Lock
            --
            -- 
        local
            l_doc_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id

            -- api.objects_documents_doc_id_lock_post(l_doc_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_major_version_minor_version_attachments_file_get
            -- Download All Document Version Attachments
            --
            -- 
        local
            l_doc_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_accept: STRING_32
            l_authorization: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_major_version
            -- l_minor_version

            -- api.objects_documents_doc_id_major_version_minor_version_attachments_file_get(l_doc_id, l_major_version, l_minor_version, l_accept, l_authorization, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_post
            -- Create Single Document Version
            --
            -- 
        local
            l_doc_id: STRING_32
            l_suppress_rendition: STRING_32
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id

            -- api.objects_documents_doc_id_post(l_doc_id, l_suppress_rendition, l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_put
            -- Update Single Document
            --
            -- 
        local
            l_doc_id: STRING_32
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__migration_mode: BOOLEAN
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id

            -- api.objects_documents_doc_id_put(l_doc_id, l_authorization, l_content__type, l_accept, l_x__vault_ap_i__migration_mode, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_renditions_get
            -- Retrieve Document Renditions
            --
            -- 
        local
            l_doc_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id

            -- api.objects_documents_doc_id_renditions_get(l_doc_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_renditions_rendition_type_delete
            -- Delete Single Document Rendition
            --
            -- 
        local
            l_doc_id: STRING_32
            l_rendition_type: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_rendition_type

            -- api.objects_documents_doc_id_renditions_rendition_type_delete(l_doc_id, l_rendition_type, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_renditions_rendition_type_get
            -- Download Document Rendition File
            --
            -- 
        local
            l_doc_id: STRING_32
            l_rendition_type: STRING_32
            l_steady_state: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_rendition_type

            -- api.objects_documents_doc_id_renditions_rendition_type_get(l_doc_id, l_rendition_type, l_steady_state, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_renditions_rendition_type_post
            -- Add Single Document Rendition
            --
            -- 
        local
            l_doc_id: STRING_32
            l_rendition_type: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_rendition_type

            -- api.objects_documents_doc_id_renditions_rendition_type_post(l_doc_id, l_rendition_type, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_renditions_rendition_type_put
            -- Replace Document Rendition
            --
            -- 
        local
            l_doc_id: STRING_32
            l_rendition_type: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_rendition_type

            -- api.objects_documents_doc_id_renditions_rendition_type_put(l_doc_id, l_rendition_type, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_roles_role_name_and_user_or_group_id_delete
            -- Remove Users &amp; Groups from Roles on a Single Document
            --
            -- 
        local
            l_doc_id: STRING_32
            l_role_name_and_user_or_group: STRING_32
            l_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_role_name_and_user_or_group
            -- l_id

            -- api.objects_documents_doc_id_roles_role_name_and_user_or_group_id_delete(l_doc_id, l_role_name_and_user_or_group, l_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_version_major_version_minor_version_attachments_get
            -- Retrieve Document Version Attachments
            --
            -- 
        local
            l_doc_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_accept: STRING_32
            l_authorization: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_major_version
            -- l_minor_version

            -- api.objects_documents_doc_id_version_major_version_minor_version_attachments_get(l_doc_id, l_major_version, l_minor_version, l_accept, l_authorization, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_versions_get
            -- Retrieve Document Versions
            --
            -- 
        local
            l_doc_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id

            -- api.objects_documents_doc_id_versions_get(l_doc_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_get
            -- Read Annotations by ID
            --
            -- 
        local
            l_doc_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_annotation_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_major_version
            -- l_minor_version
            -- l_annotation_id

            -- api.objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_get(l_doc_id, l_major_version, l_minor_version, l_annotation_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_replies_get
            -- Read Replies of Parent Annotation
            --
            -- 
        local
            l_doc_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_annotation_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_major_version
            -- l_minor_version
            -- l_annotation_id

            -- api.objects_documents_doc_id_versions_major_version_minor_version_annotations_annotation_id_replies_get(l_doc_id, l_major_version, l_minor_version, l_annotation_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_versions_major_version_minor_version_annotations_file_get
            -- Export Document Version Annotations to PDF
            --
            -- 
        local
            l_doc_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_major_version
            -- l_minor_version

            -- api.objects_documents_doc_id_versions_major_version_minor_version_annotations_file_get(l_doc_id, l_major_version, l_minor_version, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_versions_major_version_minor_version_annotations_file_post
            -- Import Document Version Annotations from PDF
            --
            -- 
        local
            l_doc_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_major_version
            -- l_minor_version

            -- api.objects_documents_doc_id_versions_major_version_minor_version_annotations_file_post(l_doc_id, l_major_version, l_minor_version, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_versions_major_version_minor_version_annotations_get
            -- Read Annotations by Document Version and Type
            --
            -- 
        local
            l_doc_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_limit: STRING_32
            l_offset: STRING_32
            l_annotation_types: STRING_32
            l_pagination_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_major_version
            -- l_minor_version

            -- api.objects_documents_doc_id_versions_major_version_minor_version_annotations_get(l_doc_id, l_major_version, l_minor_version, l_limit, l_offset, l_annotation_types, l_pagination_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_file_get
            -- Download Document Version Attachment Version
            --
            -- 
        local
            l_doc_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_attachment_id: STRING_32
            l_attachment_version: STRING_32
            l_accept: STRING_32
            l_authorization: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_major_version
            -- l_minor_version
            -- l_attachment_id
            -- l_attachment_version

            -- api.objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_file_get(l_doc_id, l_major_version, l_minor_version, l_attachment_id, l_attachment_version, l_accept, l_authorization, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_get
            -- Retrieve Document Version Attachment Versions
            --
            -- 
        local
            l_doc_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_attachment_id: STRING_32
            l_attachment_version: STRING_32
            l_accept: STRING_32
            l_authorization: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_major_version
            -- l_minor_version
            -- l_attachment_id
            -- l_attachment_version

            -- api.objects_documents_doc_id_versions_major_version_minor_version_attachments_attachment_id_versions_attachment_version_get(l_doc_id, l_major_version, l_minor_version, l_attachment_id, l_attachment_version, l_accept, l_authorization, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_versions_major_version_minor_version_delete
            -- Delete Single Document Version
            --
            -- 
        local
            l_doc_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_major_version
            -- l_minor_version

            -- api.objects_documents_doc_id_versions_major_version_minor_version_delete(l_doc_id, l_major_version, l_minor_version, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_versions_major_version_minor_version_doc_export_annotations_to_csv_get
            -- Retrieve Document Version Notes as CSV
            --
            -- 
        local
            l_doc_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_major_version
            -- l_minor_version

            -- api.objects_documents_doc_id_versions_major_version_minor_version_doc_export_annotations_to_csv_get(l_doc_id, l_major_version, l_minor_version, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_versions_major_version_minor_version_events_post
            -- Create Document Event
            --
            -- 
        local
            l_doc_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_major_version
            -- l_minor_version

            -- api.objects_documents_doc_id_versions_major_version_minor_version_events_post(l_doc_id, l_major_version, l_minor_version, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_versions_major_version_minor_version_export_video_annotations_get
            -- Retrieve Video Annotations
            --
            -- 
        local
            l_doc_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_major_version
            -- l_minor_version

            -- api.objects_documents_doc_id_versions_major_version_minor_version_export_video_annotations_get(l_doc_id, l_major_version, l_minor_version, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_versions_major_version_minor_version_file_get
            -- Download Document Version File
            --
            -- 
        local
            l_doc_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_accept: STRING_32
            l_authorization: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_major_version
            -- l_minor_version

            -- api.objects_documents_doc_id_versions_major_version_minor_version_file_get(l_doc_id, l_major_version, l_minor_version, l_accept, l_authorization, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_versions_major_version_minor_version_get
            -- Retrieve Document Version
            --
            -- 
        local
            l_doc_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_major_version
            -- l_minor_version

            -- api.objects_documents_doc_id_versions_major_version_minor_version_get(l_doc_id, l_major_version, l_minor_version, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_versions_major_version_minor_version_put
            -- Update Document Version
            --
            -- 
        local
            l_doc_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__migration_mode: BOOLEAN
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_major_version
            -- l_minor_version

            -- api.objects_documents_doc_id_versions_major_version_minor_version_put(l_doc_id, l_major_version, l_minor_version, l_authorization, l_content__type, l_accept, l_x__vault_ap_i__migration_mode, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_versions_major_version_minor_version_relationships_get
            -- Retrieve Document Relationships
            --
            -- 
        local
            l_doc_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_major_version
            -- l_minor_version

            -- api.objects_documents_doc_id_versions_major_version_minor_version_relationships_get(l_doc_id, l_major_version, l_minor_version, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_versions_major_version_minor_version_relationships_post
            -- Create Single Document Relationship
            --
            -- 
        local
            l_doc_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_major_version
            -- l_minor_version

            -- api.objects_documents_doc_id_versions_major_version_minor_version_relationships_post(l_doc_id, l_major_version, l_minor_version, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_delete
            -- Delete Single Document Relationship
            --
            -- 
        local
            l_doc_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_relationship_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_major_version
            -- l_minor_version
            -- l_relationship_id

            -- api.objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_delete(l_doc_id, l_major_version, l_minor_version, l_relationship_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_get
            -- Retrieve Document Relationship
            --
            -- 
        local
            l_doc_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_relationship_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_major_version
            -- l_minor_version
            -- l_relationship_id

            -- api.objects_documents_doc_id_versions_major_version_minor_version_relationships_relationship_id_get(l_doc_id, l_major_version, l_minor_version, l_relationship_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_versions_major_version_minor_version_renditions_get
            -- Retrieve Document Version Renditions
            --
            -- 
        local
            l_doc_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_major_version
            -- l_minor_version

            -- api.objects_documents_doc_id_versions_major_version_minor_version_renditions_get(l_doc_id, l_major_version, l_minor_version, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_delete
            -- Delete Document Version Rendition
            --
            -- 
        local
            l_doc_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_rendition_type: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_major_version
            -- l_minor_version
            -- l_rendition_type

            -- api.objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_delete(l_doc_id, l_major_version, l_minor_version, l_rendition_type, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_get
            -- Download Document Version Rendition File
            --
            -- 
        local
            l_doc_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_rendition_type: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_major_version
            -- l_minor_version
            -- l_rendition_type

            -- api.objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_get(l_doc_id, l_major_version, l_minor_version, l_rendition_type, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_post
            -- Upload Document Version Rendition
            --
            -- 
        local
            l_doc_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_rendition_type: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_major_version
            -- l_minor_version
            -- l_rendition_type

            -- api.objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_post(l_doc_id, l_major_version, l_minor_version, l_rendition_type, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_put
            -- Replace Document Version Rendition
            --
            -- 
        local
            l_doc_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_rendition_type: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_major_version
            -- l_minor_version
            -- l_rendition_type

            -- api.objects_documents_doc_id_versions_major_version_minor_version_renditions_rendition_type_put(l_doc_id, l_major_version, l_minor_version, l_rendition_type, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_doc_id_versions_major_version_minor_version_thumbnail_get
            -- Download Document Version Thumbnail File
            --
            -- 
        local
            l_doc_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_accept: STRING_32
            l_authorization: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_doc_id
            -- l_major_version
            -- l_minor_version

            -- api.objects_documents_doc_id_versions_major_version_minor_version_thumbnail_get(l_doc_id, l_major_version, l_minor_version, l_accept, l_authorization, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_get
            -- Retrieve All Documents
            --
            -- 
        local
            l_named_filter: STRING_32
            l_scope: STRING_32
            l_versionscope: STRING_32
            l_search: STRING_32
            l_limit: STRING_32
            l_sort: STRING_32
            l_start: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_documents_get(l_named_filter, l_scope, l_versionscope, l_search, l_limit, l_sort, l_start, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_id_roles_get
            -- Retrieve All Document Roles
            --
            -- 
        local
            l_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- api.objects_documents_id_roles_get(l_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_id_roles_post
            -- Assign Users &amp; Groups to Roles on a Single Document
            --
            -- 
        local
            l_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- api.objects_documents_id_roles_post(l_id, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_id_roles_role_name_get
            -- Retrieve Document Role
            --
            -- 
        local
            l_id: STRING_32
            l_role_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id
            -- l_role_name

            -- api.objects_documents_id_roles_role_name_get(l_id, l_role_name, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_id_versions_major_version_minor_version_lifecycle_actions_get
            -- Retrieve Document User Actions
            --
            -- 
        local
            l_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id
            -- l_major_version
            -- l_minor_version

            -- api.objects_documents_id_versions_major_version_minor_version_lifecycle_actions_get(l_id, l_major_version, l_minor_version, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_ventry_requirements_get
            -- Retrieve Document Entry Criteria
            --
            -- 
        local
            l_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_name__v: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id
            -- l_major_version
            -- l_minor_version
            -- l_name__v

            -- api.objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_ventry_requirements_get(l_id, l_major_version, l_minor_version, l_name__v, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_vput
            -- Initiate Document User Action
            --
            -- 
        local
            l_id: STRING_32
            l_major_version: STRING_32
            l_minor_version: STRING_32
            l_name__v: STRING_32
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id
            -- l_major_version
            -- l_minor_version
            -- l_name__v

            -- api.objects_documents_id_versions_major_version_minor_version_lifecycle_actions_name_vput(l_id, l_major_version, l_minor_version, l_name__v, l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_lifecycle_actions_post
            -- Retrieve User Actions on Multiple Documents
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_documents_lifecycle_actions_post(l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_lifecycle_actions_user_action_name_put
            -- Initiate Bulk Document User Actions
            --
            -- 
        local
            l_user_action_name: STRING_32
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_user_action_name

            -- api.objects_documents_lifecycle_actions_user_action_name_put(l_user_action_name, l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_post
            -- Create Single Document
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__migration_mode: BOOLEAN
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_documents_post(l_authorization, l_accept, l_x__vault_ap_i__migration_mode, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_relationships_batch_delete
            -- Delete Multiple Document Relationships
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_documents_relationships_batch_delete(l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_relationships_batch_post
            -- Create Multiple Document Relationships
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_documents_relationships_batch_post(l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_renditions_batch_delete
            -- Delete Multiple Document Renditions
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_documents_renditions_batch_delete(l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_renditions_batch_post
            -- Add Multiple Document Renditions
            --
            -- 
        local
            l_id_param: STRING_32
            l_large_size_asset: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__migration_mode: BOOLEAN
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_documents_renditions_batch_post(l_id_param, l_large_size_asset, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__migration_mode, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_roles_batch_delete
            -- Remove Users and Groups from Roles on Multiple Documents &amp; Binders
            --
            -- 
        local
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_documents_roles_batch_delete(l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_roles_batch_post
            -- Assign Users &amp; Groups to Roles on Multiple Documents &amp; Binders
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_documents_roles_batch_post(l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_templates_get
            -- Retrieve Document Template Collection
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_documents_templates_get(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_templates_post
            -- Create Single Document Template
            --
            -- 
        local
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_documents_templates_post(l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_templates_put
            -- Update Multiple Document Templates
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_documents_templates_put(l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_templates_template_name_delete
            -- Delete Basic Document Template
            --
            -- 
        local
            l_template_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_template_name

            -- api.objects_documents_templates_template_name_delete(l_template_name, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_templates_template_name_file_get
            -- Download Document Template File
            --
            -- 
        local
            l_template_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_template_name

            -- api.objects_documents_templates_template_name_file_get(l_template_name, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_templates_template_name_get
            -- Retrieve Document Template Attributes
            --
            -- 
        local
            l_template_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_template_name

            -- api.objects_documents_templates_template_name_get(l_template_name, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_templates_template_name_put
            -- Update Single Document Template
            --
            -- 
        local
            l_template_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_template_name

            -- api.objects_documents_templates_template_name_put(l_template_name, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_tokens_post
            -- Document Tokens
            --
            -- 
        local
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_documents_tokens_post(l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_versions_batch_actions_fileextract_post
            -- Export Document Versions
            --
            -- 
        local
            l_source: BOOLEAN
            l_renditions: BOOLEAN
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_documents_versions_batch_actions_fileextract_post(l_source, l_renditions, l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_versions_batch_delete
            -- Delete Multiple Document Versions
            --
            -- 
        local
            l_id_param: STRING_32
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_documents_versions_batch_delete(l_id_param, l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_documents_versions_batch_post
            -- Create Multiple Document Versions
            --
            -- 
        local
            l_id_param: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__migration_mode: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_documents_versions_batch_post(l_id_param, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__migration_mode, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_domain_get
            -- Retrieve Domain Information
            --
            -- 
        local
            l_include_application: BOOLEAN
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_domain_get(l_include_application, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_domains_get
            -- Retrieve Domains
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_domains_get(l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_edl_matched_documents_batch_actions_add_post
            -- Add EDL Matched Documents
            --
            -- 
        local
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_edl_matched_documents_batch_actions_add_post(l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_edl_matched_documents_batch_actions_remove_post
            -- Remove EDL Matched Documents
            --
            -- 
        local
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_edl_matched_documents_batch_actions_remove_post(l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_groups_auto_get
            -- Retrieve Auto Managed Groups
            --
            -- 
        local
            l_limit: STRING_32
            l_offset: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_groups_auto_get(l_limit, l_offset, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_groups_get
            -- Retrieve All Groups
            --
            -- 
        local
            l_include_implied: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_groups_get(l_include_implied, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_groups_group_id_delete
            -- Delete Group
            --
            -- 
        local
            l_group_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_group_id

            -- api.objects_groups_group_id_delete(l_group_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_groups_group_id_get
            -- Retrieve Group
            --
            -- 
        local
            l_group_id: STRING_32
            l_include_implied: BOOLEAN
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_group_id

            -- api.objects_groups_group_id_get(l_group_id, l_include_implied, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_groups_group_id_put
            -- Update Group
            --
            -- 
        local
            l_group_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_group_id

            -- api.objects_groups_group_id_put(l_group_id, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_groups_post
            -- Create Group 
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_groups_post(l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_licenses_get
            -- Retrieve Application License Usage
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_licenses_get(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_objectworkflows_actions_get
            -- Retrieve All Multi-Record Workflows
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_objectworkflows_actions_get(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_objectworkflows_actions_workflow_name_get
            -- Retrieve Multi-Record Workflow Details
            --
            -- 
        local
            l_workflow_name: STRING_32
            l_authorization: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_workflow_name

            -- api.objects_objectworkflows_actions_workflow_name_get(l_workflow_name, l_authorization, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_objectworkflows_actions_workflow_name_post
            -- Initiate Multi-Record Workflow
            --
            -- 
        local
            l_workflow_name: STRING_32
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_workflow_name

            -- api.objects_objectworkflows_actions_workflow_name_post(l_workflow_name, l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_objectworkflows_get
            -- Retrieve Workflows
            --
            -- 
        local
            l_object__v: STRING_32
            l_record_id__v: STRING_32
            l_participant: STRING_32
            l_status__v: STRING_32
            l_offset: STRING_32
            l_page_size: STRING_32
            l_loc: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_objectworkflows_get(l_object__v, l_record_id__v, l_participant, l_status__v, l_offset, l_page_size, l_loc, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_objectworkflows_tasks_get
            -- Retrieve Workflow Tasks
            --
            -- 
        local
            l_object__v: STRING_32
            l_record_id__v: STRING_32
            l_assignee__v: STRING_32
            l_status__v: STRING_32
            l_offset: STRING_32
            l_page_size: STRING_32
            l_loc: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_objectworkflows_tasks_get(l_object__v, l_record_id__v, l_assignee__v, l_status__v, l_offset, l_page_size, l_loc, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_objectworkflows_tasks_task_id_actions_accept_post
            -- Accept Single Record Workflow Task
            --
            -- 
        local
            l_task_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_task_id

            -- api.objects_objectworkflows_tasks_task_id_actions_accept_post(l_task_id, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_objectworkflows_tasks_task_id_actions_cancel_post
            -- Cancel Workflow Task
            --
            -- 
        local
            l_task_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_task_id

            -- api.objects_objectworkflows_tasks_task_id_actions_cancel_post(l_task_id, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_objectworkflows_tasks_task_id_actions_complete_post
            -- Complete Single Record Workflow Task
            --
            -- 
        local
            l_task_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_task_id

            -- api.objects_objectworkflows_tasks_task_id_actions_complete_post(l_task_id, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_objectworkflows_tasks_task_id_actions_get
            -- Retrieve Workflow Task Actions
            --
            -- 
        local
            l_task_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_task_id

            -- api.objects_objectworkflows_tasks_task_id_actions_get(l_task_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_objectworkflows_tasks_task_id_actions_mdwaccept_post
            -- Accept Multi-item Workflow Task
            --
            -- 
        local
            l_task_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_task_id

            -- api.objects_objectworkflows_tasks_task_id_actions_mdwaccept_post(l_task_id, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_objectworkflows_tasks_task_id_actions_mdwcomplete_post
            -- Complete Multi-item Workflow Task
            --
            -- 
        local
            l_task_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_task_id

            -- api.objects_objectworkflows_tasks_task_id_actions_mdwcomplete_post(l_task_id, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_objectworkflows_tasks_task_id_actions_mdwmanagecontent_post
            -- Manage Multi-Item Workflow Content
            --
            -- 
        local
            l_task_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_task_id

            -- api.objects_objectworkflows_tasks_task_id_actions_mdwmanagecontent_post(l_task_id, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_objectworkflows_tasks_task_id_actions_mdwreassign_post
            -- Reassign Multi-item Workflow Task
            --
            -- 
        local
            l_task_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_task_id

            -- api.objects_objectworkflows_tasks_task_id_actions_mdwreassign_post(l_task_id, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_objectworkflows_tasks_task_id_actions_reassign_post
            -- Reassign Single Record Workflow Task
            --
            -- 
        local
            l_task_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_task_id

            -- api.objects_objectworkflows_tasks_task_id_actions_reassign_post(l_task_id, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_objectworkflows_tasks_task_id_actions_task_action_get
            -- Retrieve Workflow Task Action Details
            --
            -- 
        local
            l_task_id: STRING_32
            l_task_action: STRING_32
            l_loc: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_task_id
            -- l_task_action

            -- api.objects_objectworkflows_tasks_task_id_actions_task_action_get(l_task_id, l_task_action, l_loc, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_objectworkflows_tasks_task_id_actions_undoaccept_post
            -- Undo Workflow Task Acceptance
            --
            -- 
        local
            l_task_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_task_id

            -- api.objects_objectworkflows_tasks_task_id_actions_undoaccept_post(l_task_id, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_objectworkflows_tasks_task_id_actions_updateduedate_post
            -- Update Workflow Task Due Date
            --
            -- 
        local
            l_task_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_task_id

            -- api.objects_objectworkflows_tasks_task_id_actions_updateduedate_post(l_task_id, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_objectworkflows_tasks_task_id_get
            -- Retrieve Workflow Task Details
            --
            -- 
        local
            l_task_id: STRING_32
            l_loc: BOOLEAN
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_task_id

            -- api.objects_objectworkflows_tasks_task_id_get(l_task_id, l_loc, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_objectworkflows_workflow_id_actions_get
            -- Retrieve Workflow Actions
            --
            -- 
        local
            l_workflow_id: STRING_32
            l_loc: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_workflow_id

            -- api.objects_objectworkflows_workflow_id_actions_get(l_workflow_id, l_loc, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_objectworkflows_workflow_id_actions_workflow_action_get
            -- Retrieve Workflow Action Details
            --
            -- 
        local
            l_workflow_id: STRING_32
            l_workflow_action: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_workflow_id
            -- l_workflow_action

            -- api.objects_objectworkflows_workflow_id_actions_workflow_action_get(l_workflow_id, l_workflow_action, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_objectworkflows_workflow_id_actions_workflow_action_post
            -- Initiate Workflow Action
            --
            -- 
        local
            l_workflow_id: STRING_32
            l_workflow_action: STRING_32
            l_documents__sys: STRING_32
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_workflow_id
            -- l_workflow_action

            -- api.objects_objectworkflows_workflow_id_actions_workflow_action_post(l_workflow_id, l_workflow_action, l_documents__sys, l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_objectworkflows_workflow_id_get
            -- Retrieve Workflow Details
            --
            -- 
        local
            l_workflow_id: STRING_32
            l_loc: BOOLEAN
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_workflow_id

            -- api.objects_objectworkflows_workflow_id_get(l_workflow_id, l_loc, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_picklists_get
            -- Retrieve All Picklists
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_picklists_get(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_picklists_picklist_name_get
            -- Retrieve Picklist Values
            --
            -- 
        local
            l_picklist_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_picklist_name

            -- api.objects_picklists_picklist_name_get(l_picklist_name, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_picklists_picklist_name_picklist_value_name_delete
            -- Inactivate Picklist Value
            --
            -- 
        local
            l_picklist_name: STRING_32
            l_picklist_value_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_picklist_name
            -- l_picklist_value_name

            -- api.objects_picklists_picklist_name_picklist_value_name_delete(l_picklist_name, l_picklist_value_name, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_picklists_picklist_name_picklist_value_name_put
            -- Update Picklist Value
            --
            -- 
        local
            l_picklist_name: STRING_32
            l_picklist_value_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_picklist_name
            -- l_picklist_value_name

            -- api.objects_picklists_picklist_name_picklist_value_name_put(l_picklist_name, l_picklist_value_name, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_picklists_picklist_name_post
            -- Create Picklist Values
            --
            -- 
        local
            l_picklist_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_picklist_name

            -- api.objects_picklists_picklist_name_post(l_picklist_name, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_picklists_picklist_name_put
            -- Update Picklist Value Label
            --
            -- 
        local
            l_picklist_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_picklist_name

            -- api.objects_picklists_picklist_name_put(l_picklist_name, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_sandbox_actions_buildproduction_post
            -- Build Production Vault
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_sandbox_actions_buildproduction_post(l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_sandbox_actions_promoteproduction_post
            -- Promote to Production
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_sandbox_actions_promoteproduction_post(l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_sandbox_actions_recheckusage_post
            -- Recheck Sandbox Usage Limit
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_sandbox_actions_recheckusage_post(l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_sandbox_batch_changesize_post
            -- Change Sandbox Size
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_sandbox_batch_changesize_post(l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_sandbox_entitlements_set_post
            -- Set Sandbox Entitlements
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_sandbox_entitlements_set_post(l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_sandbox_get
            -- Retrieve Sandboxes
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_sandbox_get(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_sandbox_name_delete
            -- Delete Sandbox
            --
            -- 
        local
            l_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_name

            -- api.objects_sandbox_name_delete(l_name, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_sandbox_post
            -- Create or Refresh Sandbox
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_sandbox_post(l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_sandbox_snapshot_api_name_actions_update_post
            -- Update Sandbox Snapshot
            --
            -- 
        local
            l_api_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_api_name

            -- api.objects_sandbox_snapshot_api_name_actions_update_post(l_api_name, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_sandbox_snapshot_api_name_actions_upgrade_post
            -- Upgrade Sandbox Snapshot
            --
            -- 
        local
            l_api_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_api_name

            -- api.objects_sandbox_snapshot_api_name_actions_upgrade_post(l_api_name, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_sandbox_snapshot_api_name_delete
            -- Delete Sandbox Snapshot
            --
            -- 
        local
            l_api_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_api_name

            -- api.objects_sandbox_snapshot_api_name_delete(l_api_name, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_sandbox_snapshot_get
            -- Retrieve Sandbox Snapshots
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_sandbox_snapshot_get(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_sandbox_snapshot_post
            -- Create Sandbox Snapshot
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_sandbox_snapshot_post(l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_sandbox_vault_id_actions_refresh_post
            -- Refresh Sandbox from Snapshot
            --
            -- 
        local
            l_vault_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_vault_id

            -- api.objects_sandbox_vault_id_actions_refresh_post(l_vault_id, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_sandbox_vault_id_get
            -- Retrieve Sandbox Details by ID
            --
            -- 
        local
            l_vault_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_vault_id

            -- api.objects_sandbox_vault_id_get(l_vault_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_securitypolicies_get
            -- Retrieve All Security Policies
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_securitypolicies_get(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_securitypolicies_security_policy_name_get
            -- Retrieve Security Policy
            --
            -- 
        local
            l_security_policy_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_security_policy_name

            -- api.objects_securitypolicies_security_policy_name_get(l_security_policy_name, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_users_get
            -- Retrieve All Users
            --
            -- 
        local
            l_vaults: STRING_32
            l_exclude_vault_membership: STRING_32
            l_exclude_app_licensing: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_users_get(l_vaults, l_exclude_vault_membership, l_exclude_app_licensing, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_users_id_get
            -- Retrieve User
            --
            -- 
        local
            l_id: STRING_32
            l_exclude_vault_membership: STRING_32
            l_exclude_app_licensing: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- api.objects_users_id_get(l_id, l_exclude_vault_membership, l_exclude_app_licensing, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_users_id_permissions_get
            -- Retrieve User Permissions
            --
            -- 
        local
            l_id: STRING_32
            l_filter: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- api.objects_users_id_permissions_get(l_id, l_filter, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_users_id_put
            -- Update Single User
            --
            -- 
        local
            l_id: STRING_32
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- api.objects_users_id_put(l_id, l_authorization, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_users_me_get
            -- Validate Session User
            --
            -- 
        local
            l_exclude_vault_membership: STRING_32
            l_exclude_app_licensing: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_users_me_get(l_exclude_vault_membership, l_exclude_app_licensing, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_users_me_password_post
            -- Change My Password
            --
            -- 
        local
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_users_me_password_post(l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_users_me_permissions_get
            -- Retrieve My User Permissions
            --
            -- 
        local
            l_filter: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_users_me_permissions_get(l_filter, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_users_me_put
            -- Update My User
            --
            -- 
        local
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_users_me_put(l_authorization, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_users_post
            -- Create Single User
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_users_post(l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_users_put
            -- Update Multiple Users
            --
            -- 
        local
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_users_put(l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_users_user_id_delete
            -- Disable User
            --
            -- 
        local
            l_user_id: STRING_32
            l_domain: BOOLEAN
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_user_id

            -- api.objects_users_user_id_delete(l_user_id, l_domain, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_users_user_id_vault_membership_vault_id_put
            -- Update Vault Membership
            --
            -- 
        local
            l_user_id: STRING_32
            l_vault_id: STRING_32
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_user_id
            -- l_vault_id

            -- api.objects_users_user_id_vault_membership_vault_id_put(l_user_id, l_vault_id, l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_vault_actions_compare_post
            -- Vault Compare
            --
            -- 
        local
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_vault_actions_compare_post(l_authorization, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_objects_vault_actions_configreport_post
            -- Vault Configuration Report
            --
            -- 
        local
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.objects_vault_actions_configreport_post(l_authorization, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_query_components_post
            -- Component Definition Query
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.query_components_post(l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_query_next_page_post
            -- Next Page URL
            --
            -- 
        local
            l_next_page: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__describe_query: BOOLEAN
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_next_page

            -- api.query_next_page_post(l_next_page, l_authorization, l_accept, l_x__vault_ap_i__describe_query, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_query_post
            -- Submitting a Query
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__describe_query: BOOLEAN
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.query_post(l_authorization, l_accept, l_x__vault_ap_i__describe_query, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_query_previous_page_post
            -- Previous Page URL
            --
            -- 
        local
            l_previous_page: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__describe_query: BOOLEAN
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_previous_page

            -- api.query_previous_page_post(l_previous_page, l_authorization, l_accept, l_x__vault_ap_i__describe_query, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_scim_v2_me_get
            -- Retrieve Current User with SCIM
            --
            -- 
        local
            l_attributes: STRING_32
            l_excluded_attributes: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.scim_v2_me_get(l_attributes, l_excluded_attributes, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_scim_v2_me_put
            -- Update Current User with SCIM
            --
            -- 
        local
            l_attributes: STRING_32
            l_excluded_attributes: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.scim_v2_me_put(l_attributes, l_excluded_attributes, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_scim_v2_resource_types_get
            -- Retrieve All SCIM Resource Types
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.scim_v2_resource_types_get(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_scim_v2_resource_types_type_get
            -- Retrieve Single SCIM Resource Type
            --
            -- 
        local
            l_type: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_type

            -- api.scim_v2_resource_types_type_get(l_type, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_scim_v2_schemas_get
            -- Retrieve All SCIM Schema Information
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.scim_v2_schemas_get(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_scim_v2_schemas_id_get
            -- Retrieve Single SCIM Schema Information
            --
            -- 
        local
            l_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- api.scim_v2_schemas_id_get(l_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_scim_v2_service_provider_config_get
            -- Retrieve SCIM Provider
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.scim_v2_service_provider_config_get(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_scim_v2_type_get
            -- Retrieve SCIM Resources
            --
            -- 
        local
            l_type: STRING_32
            l_filter: STRING_32
            l_attributes: STRING_32
            l_excluded_attributes: STRING_32
            l_sort_by: STRING_32
            l_sort_order: STRING_32
            l_start_index: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_type

            -- api.scim_v2_type_get(l_type, l_filter, l_attributes, l_excluded_attributes, l_sort_by, l_sort_order, l_start_index, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_scim_v2_type_id_get
            -- Retrieve Single SCIM Resource
            --
            -- 
        local
            l_type: STRING_32
            l_id: STRING_32
            l_attributes: STRING_32
            l_excluded_attributes: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_type
            -- l_id

            -- api.scim_v2_type_id_get(l_type, l_id, l_attributes, l_excluded_attributes, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_scim_v2_users_get
            -- Retrieve All Users with SCIM
            --
            -- 
        local
            l_filter: STRING_32
            l_attributes: STRING_32
            l_excluded_attributes: STRING_32
            l_sort_by: STRING_32
            l_sort_order: STRING_32
            l_count: STRING_32
            l_start_index: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.scim_v2_users_get(l_filter, l_attributes, l_excluded_attributes, l_sort_by, l_sort_order, l_count, l_start_index, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_scim_v2_users_id_get
            -- Retrieve Single User with SCIM
            --
            -- 
        local
            l_id: STRING_32
            l_filter: STRING_32
            l_attributes: STRING_32
            l_excluded_attributes: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- api.scim_v2_users_id_get(l_id, l_filter, l_attributes, l_excluded_attributes, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_scim_v2_users_id_put
            -- Update User with SCIM
            --
            -- 
        local
            l_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- api.scim_v2_users_id_put(l_id, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_scim_v2_users_post
            -- Create User with SCIM
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.scim_v2_users_post(l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_certificate_cert_id_get
            -- Retrieve Signing Certificate
            --
            -- 
        local
            l_cert_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_cert_id

            -- api.services_certificate_cert_id_get(l_cert_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_configuration_mode_actions_disable_post
            -- Disable Configuration Mode
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.services_configuration_mode_actions_disable_post(l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_configuration_mode_actions_enable_post
            -- Enable Configuration Mode
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.services_configuration_mode_actions_enable_post(l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_directdata_files_get
            -- Retrieve Available Direct Data Files
            --
            -- 
        local
            l_extract_type: STRING_32
            l_start_time: INTEGER_32
            l_stop_time: INTEGER_32
            l_accept: STRING_32
            l_authorization: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.services_directdata_files_get(l_extract_type, l_start_time, l_stop_time, l_accept, l_authorization, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_directdata_files_name_get
            -- Download Direct Data File
            --
            -- 
        local
            l_name: STRING_32
            l_accept: STRING_32
            l_authorization: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_name

            -- api.services_directdata_files_name_get(l_name, l_accept, l_authorization, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_file_staging_items_content_item_get
            -- Download Item Content
            --
            -- 
        local
            l_item: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_range: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_item

            -- api.services_file_staging_items_content_item_get(l_item, l_authorization, l_accept, l_range, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_file_staging_items_item_delete
            -- Delete File or Folder
            --
            -- 
        local
            l_item: STRING_32
            l_recursive: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_item

            -- api.services_file_staging_items_item_delete(l_item, l_recursive, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_file_staging_items_item_get
            -- List Items at a Path
            --
            -- 
        local
            l_item: STRING_32
            l_recursive: STRING_32
            l_limit: STRING_32
            l_format_result: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_item

            -- api.services_file_staging_items_item_get(l_item, l_recursive, l_limit, l_format_result, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_file_staging_items_item_put
            -- Update Folder or File
            --
            -- 
        local
            l_item: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_item

            -- api.services_file_staging_items_item_put(l_item, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_file_staging_items_post
            -- Create Folder or File
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__md5: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.services_file_staging_items_post(l_authorization, l_accept, l_content__md5, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_file_staging_upload_get
            -- List Upload Sessions
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.services_file_staging_upload_get(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_file_staging_upload_post
            -- Create Resumable Upload Session
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.services_file_staging_upload_post(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_file_staging_upload_upload_session_id_delete
            -- Abort Upload Session
            --
            -- 
        local
            l_upload_session_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_upload_session_id

            -- api.services_file_staging_upload_upload_session_id_delete(l_upload_session_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_file_staging_upload_upload_session_id_get
            -- Get Upload Session Details
            --
            -- 
        local
            l_upload_session_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_upload_session_id

            -- api.services_file_staging_upload_upload_session_id_get(l_upload_session_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_file_staging_upload_upload_session_id_parts_get
            -- List File Parts Uploaded to Session
            --
            -- 
        local
            l_upload_session_id: STRING_32
            l_limit: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_upload_session_id

            -- api.services_file_staging_upload_upload_session_id_parts_get(l_upload_session_id, l_limit, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_file_staging_upload_upload_session_id_post
            -- Commit Upload Session
            --
            -- 
        local
            l_upload_session_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_upload_session_id

            -- api.services_file_staging_upload_upload_session_id_post(l_upload_session_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_file_staging_upload_upload_session_id_put
            -- Upload to a Session
            --
            -- 
        local
            l_upload_session_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__file_part_number: STRING_32
            l_content__md5: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_upload_session_id

            -- api.services_file_staging_upload_upload_session_id_put(l_upload_session_id, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__file_part_number, l_content__md5, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_jobs_histories_get
            -- Retrieve Job Histories
            --
            -- 
        local
            l_start_date: STRING_32
            l_end_date: STRING_32
            l_status: STRING_32
            l_limit: STRING_32
            l_offset: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.services_jobs_histories_get(l_start_date, l_end_date, l_status, l_limit, l_offset, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_jobs_job_id_errors_get
            -- Retrieve Import Bulk Translation File Job Errors
            --
            -- 
        local
            l_job_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_job_id

            -- api.services_jobs_job_id_errors_get(l_job_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_jobs_job_id_get
            -- Retrieve Job Status
            --
            -- 
        local
            l_job_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_job_id

            -- api.services_jobs_job_id_get(l_job_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_jobs_job_id_summary_get
            -- Retrieve Import Bulk Translation File Job Summary
            --
            -- 
        local
            l_job_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_job_id

            -- api.services_jobs_job_id_summary_get(l_job_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_jobs_job_id_tasks_get
            -- Retrieve SDK Job Tasks
            --
            -- 
        local
            l_job_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_job_id

            -- api.services_jobs_job_id_tasks_get(l_job_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_jobs_monitors_get
            -- Retrieve Job Monitors
            --
            -- 
        local
            l_start_date: STRING_32
            l_end_date: STRING_32
            l_status: STRING_32
            l_limit: STRING_32
            l_offset: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.services_jobs_monitors_get(l_start_date, l_end_date, l_status, l_limit, l_offset, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_jobs_start_now_job_id_post
            -- Start Job
            --
            -- 
        local
            l_job_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_job_id

            -- api.services_jobs_start_now_job_id_post(l_job_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_loader_extract_post
            -- Extract Data Files
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.services_loader_extract_post(l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_loader_job_id_tasks_task_id_failurelog_get
            -- Retrieve Load Failure Log Results
            --
            -- 
        local
            l_job_id: STRING_32
            l_task_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_job_id
            -- l_task_id

            -- api.services_loader_job_id_tasks_task_id_failurelog_get(l_job_id, l_task_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_loader_job_id_tasks_task_id_results_get
            -- Retrieve Loader Extract Results
            --
            -- 
        local
            l_job_id: STRING_32
            l_task_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_job_id
            -- l_task_id

            -- api.services_loader_job_id_tasks_task_id_results_get(l_job_id, l_task_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_loader_job_id_tasks_task_id_results_renditions_get
            -- Retrieve Loader Extract Renditions Results
            --
            -- 
        local
            l_job_id: STRING_32
            l_task_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_job_id
            -- l_task_id

            -- api.services_loader_job_id_tasks_task_id_results_renditions_get(l_job_id, l_task_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_loader_job_id_tasks_task_id_successlog_get
            -- Retrieve Load Success Log Results
            --
            -- 
        local
            l_job_id: STRING_32
            l_task_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_job_id
            -- l_task_id

            -- api.services_loader_job_id_tasks_task_id_successlog_get(l_job_id, l_task_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_loader_load_post
            -- Load Data Objects
            --
            -- 
        local
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.services_loader_load_post(l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_package_actions_validate_post
            -- Validate Package
            --
            -- 
        local
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.services_package_actions_validate_post(l_authorization, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_package_post
            -- Export Package
            --
            -- 
        local
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.services_package_post(l_authorization, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_package_put
            -- Import Package
            --
            -- 
        local
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.services_package_put(l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_queues_get
            -- Retrieve All Queues
            --
            -- 
        local
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.services_queues_get(l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_queues_queue_name_actions_disable_delivery_put
            -- Disable Delivery
            --
            -- 
        local
            l_queue_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_queue_name

            -- api.services_queues_queue_name_actions_disable_delivery_put(l_queue_name, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_queues_queue_name_actions_enable_delivery_put
            -- Enable Delivery
            --
            -- 
        local
            l_queue_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_queue_name

            -- api.services_queues_queue_name_actions_enable_delivery_put(l_queue_name, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_queues_queue_name_actions_reset_put
            -- Reset Queue
            --
            -- 
        local
            l_queue_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_queue_name

            -- api.services_queues_queue_name_actions_reset_put(l_queue_name, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_queues_queue_name_get
            -- Retrieve Queue Status
            --
            -- 
        local
            l_queue_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_queue_name

            -- api.services_queues_queue_name_get(l_queue_name, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_services_vobject_vault_package_vpackage_id_actions_validate_post
            -- Validate Imported Package
            --
            -- 
        local
            l_package_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_package_id

            -- api.services_vobject_vault_package_vpackage_id_actions_validate_post(l_package_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_session_delete
            -- End Session
            --
            -- 
        local
            l_accept: STRING_32
            l_authorization: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.session_delete(l_accept, l_authorization, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_uicode_distributions_distribution_name_code_get
            -- Download Single Client Code Distribution
            --
            -- 
        local
            l_distribution_name: STRING_32
            l_accept: STRING_32
            l_authorization: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_distribution_name

            -- api.uicode_distributions_distribution_name_code_get(l_distribution_name, l_accept, l_authorization, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_uicode_distributions_distribution_name_delete
            -- Delete Single Client Code Distribution
            --
            -- 
        local
            l_distribution_name: STRING_32
            l_accept: STRING_32
            l_authorization: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_distribution_name

            -- api.uicode_distributions_distribution_name_delete(l_distribution_name, l_accept, l_authorization, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_uicode_distributions_distribution_name_get
            -- Retrieve Single Client Code Distribution Metadata
            --
            -- 
        local
            l_distribution_name: STRING_32
            l_accept: STRING_32
            l_authorization: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_distribution_name

            -- api.uicode_distributions_distribution_name_get(l_distribution_name, l_accept, l_authorization, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_uicode_distributions_get
            -- Retrieve All Client Code Distribution Metadata
            --
            -- 
        local
            l_accept: STRING_32
            l_authorization: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.uicode_distributions_get(l_accept, l_authorization, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_uicode_distributions_post
            -- Add or Replace Single Client Code Distribution
            --
            -- 
        local
            l_accept: STRING_32
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.uicode_distributions_post(l_accept, l_authorization, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobject_vault_package_vpackage_id_actions_deploy_post
            -- Deploy Package
            --
            -- 
        local
            l_package_id: STRING_32
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_package_id

            -- api.vobject_vault_package_vpackage_id_actions_deploy_post(l_package_id, l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobject_vault_package_vpackage_id_actions_deploy_results_get
            -- Retrieve Package Deploy Results
            --
            -- 
        local
            l_package_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_package_id

            -- api.vobject_vault_package_vpackage_id_actions_deploy_results_get(l_package_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_cascadedelete_results_object_name_job_status_job_id_get
            -- Retrieve Results of Cascade Delete Job
            --
            -- 
        local
            l_object_name: STRING_32
            l_job_status: STRING_32
            l_job_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name
            -- l_job_status
            -- l_job_id

            -- api.vobjects_cascadedelete_results_object_name_job_status_job_id_get(l_object_name, l_job_status, l_job_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_deepcopy_results_object_name_job_status_job_id_get
            -- Retrieve Results of Deep Copy Job
            --
            -- 
        local
            l_object_name: STRING_32
            l_job_status: STRING_32
            l_job_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name
            -- l_job_status
            -- l_job_id

            -- api.vobjects_deepcopy_results_object_name_job_status_job_id_get(l_object_name, l_job_status, l_job_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_edl_item_vactions_createplaceholder_post
            -- Create a Placeholder from an EDL Item
            --
            -- 
        local
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.

            -- api.vobjects_edl_item_vactions_createplaceholder_post(l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_merges_job_id_log_get
            -- Download Merge Records Job Log
            --
            -- 
        local
            l_job_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_job_id

            -- api.vobjects_merges_job_id_log_get(l_job_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_merges_job_id_results_get
            -- Retrieve Record Merge Results
            --
            -- 
        local
            l_job_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_job_id

            -- api.vobjects_merges_job_id_results_get(l_job_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_merges_job_id_status_get
            -- Retrieve Record Merge Status
            --
            -- 
        local
            l_job_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_job_id

            -- api.vobjects_merges_job_id_status_get(l_job_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_object_name_actions_action_name_post
            -- Initiate Object Action on Multiple Records
            --
            -- 
        local
            l_object_name: STRING_32
            l_action_name: STRING_32
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name
            -- l_action_name

            -- api.vobjects_object_name_actions_action_name_post(l_object_name, l_action_name, l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_object_name_actions_changetype_post
            -- Change Object Type
            --
            -- 
        local
            l_object_name: STRING_32
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name

            -- api.vobjects_object_name_actions_changetype_post(l_object_name, l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_object_name_actions_merge_post
            -- Initiate Record Merge
            --
            -- 
        local
            l_object_name: STRING_32
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
            l_var_vobjects__object_name__actions_merge_post_request_inner: LIST [MODEL_VOBJECTS__OBJECT_NAME__ACTIONS_MERGE_POST_REQUEST_INNER]
        do
            -- TODO: Initialize required params.
            -- l_object_name

            -- api.vobjects_object_name_actions_merge_post(l_object_name, l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id, l_var_vobjects__object_name__actions_merge_post_request_inner)
            assert ("not_implemented", False)
        end

    test_vobjects_object_name_actions_recalculaterollups_get
            -- Retrieve Roll-up Field Recalculation Status
            --
            -- 
        local
            l_object_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name

            -- api.vobjects_object_name_actions_recalculaterollups_get(l_object_name, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_object_name_actions_recalculaterollups_post
            -- Recalculate Roll-up Fields
            --
            -- 
        local
            l_object_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name

            -- api.vobjects_object_name_actions_recalculaterollups_post(l_object_name, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_object_name_actions_updatecorporatecurrency_put
            -- Update Corporate Currency Fields
            --
            -- 
        local
            l_object_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name

            -- api.vobjects_object_name_actions_updatecorporatecurrency_put(l_object_name, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_object_name_attachments_batch_delete
            -- Delete Multiple Object Record Attachments
            --
            -- 
        local
            l_object_name: STRING_32
            l_id_param: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name

            -- api.vobjects_object_name_attachments_batch_delete(l_object_name, l_id_param, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_object_name_attachments_batch_post
            -- Create Multiple Object Record Attachments
            --
            -- 
        local
            l_object_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name

            -- api.vobjects_object_name_attachments_batch_post(l_object_name, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_object_name_attachments_batch_put
            -- Update Multiple Object Record Attachment Descriptions
            --
            -- 
        local
            l_object_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name

            -- api.vobjects_object_name_attachments_batch_put(l_object_name, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_object_name_delete
            -- Delete Object Records
            --
            -- 
        local
            l_object_name: STRING_32
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name

            -- api.vobjects_object_name_delete(l_object_name, l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_object_name_id_roles_role_name_get
            -- Retrieve Object Record Roles
            --
            -- 
        local
            l_object_name: STRING_32
            l_id: STRING_32
            l_role_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name
            -- l_id
            -- l_role_name

            -- api.vobjects_object_name_id_roles_role_name_get(l_object_name, l_id, l_role_name, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_object_name_object_record_id_actions_action_name_get
            -- Retrieve Object User Actions Details
            --
            -- 
        local
            l_object_name: STRING_32
            l_object_record_id: STRING_32
            l_action_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name
            -- l_object_record_id
            -- l_action_name

            -- api.vobjects_object_name_object_record_id_actions_action_name_get(l_object_name, l_object_record_id, l_action_name, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_object_name_object_record_id_actions_action_name_post
            -- Initiate Object Action on a Single Record
            --
            -- 
        local
            l_object_name: STRING_32
            l_object_record_id: STRING_32
            l_action_name: STRING_32
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name
            -- l_object_record_id
            -- l_action_name

            -- api.vobjects_object_name_object_record_id_actions_action_name_post(l_object_name, l_object_record_id, l_action_name, l_authorization, l_content__type, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_object_name_object_record_id_actions_cascadedelete_post
            -- Cascade Delete Object Record
            --
            -- 
        local
            l_object_name: STRING_32
            l_object_record_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name
            -- l_object_record_id

            -- api.vobjects_object_name_object_record_id_actions_cascadedelete_post(l_object_name, l_object_record_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_object_name_object_record_id_actions_deepcopy_post
            -- Deep Copy Object Record
            --
            -- 
        local
            l_object_name: STRING_32
            l_object_record_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name
            -- l_object_record_id

            -- api.vobjects_object_name_object_record_id_actions_deepcopy_post(l_object_name, l_object_record_id, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_object_name_object_record_id_actions_get
            -- Retrieve Object Record User Actions
            --
            -- 
        local
            l_object_name: STRING_32
            l_object_record_id: STRING_32
            l_loc: BOOLEAN
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name
            -- l_object_record_id

            -- api.vobjects_object_name_object_record_id_actions_get(l_object_name, l_object_record_id, l_loc, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_get
            -- Download Attachment Field File
            --
            -- 
        local
            l_object_name: STRING_32
            l_object_record_id: STRING_32
            l_attachment_field_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name
            -- l_object_record_id
            -- l_attachment_field_name

            -- api.vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_get(l_object_name, l_object_record_id, l_attachment_field_name, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_post
            -- Update Attachment Field File
            --
            -- 
        local
            l_object_name: STRING_32
            l_object_record_id: STRING_32
            l_attachment_field_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name
            -- l_object_record_id
            -- l_attachment_field_name

            -- api.vobjects_object_name_object_record_id_attachment_fields_attachment_field_name_file_post(l_object_name, l_object_record_id, l_attachment_field_name, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_object_name_object_record_id_attachment_fields_file_get
            -- Download All Attachment Field Files
            --
            -- 
        local
            l_object_name: STRING_32
            l_object_record_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name
            -- l_object_record_id

            -- api.vobjects_object_name_object_record_id_attachment_fields_file_get(l_object_name, l_object_record_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_object_name_object_record_id_attachments_attachment_id_delete
            -- Delete Object Record Attachment
            --
            -- 
        local
            l_object_name: STRING_32
            l_object_record_id: STRING_32
            l_attachment_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name
            -- l_object_record_id
            -- l_attachment_id

            -- api.vobjects_object_name_object_record_id_attachments_attachment_id_delete(l_object_name, l_object_record_id, l_attachment_id, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_object_name_object_record_id_attachments_attachment_id_get
            -- Retrieve Object Record Attachment Metadata
            --
            -- 
        local
            l_object_name: STRING_32
            l_object_record_id: STRING_32
            l_attachment_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name
            -- l_object_record_id
            -- l_attachment_id

            -- api.vobjects_object_name_object_record_id_attachments_attachment_id_get(l_object_name, l_object_record_id, l_attachment_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_object_name_object_record_id_attachments_attachment_id_put
            -- Update Object Record Attachment Description
            --
            -- 
        local
            l_object_name: STRING_32
            l_object_record_id: STRING_32
            l_attachment_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name
            -- l_object_record_id
            -- l_attachment_id

            -- api.vobjects_object_name_object_record_id_attachments_attachment_id_put(l_object_name, l_object_record_id, l_attachment_id, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_delete
            -- Delete Object Record Attachment Version
            --
            -- 
        local
            l_object_name: STRING_32
            l_object_record_id: STRING_32
            l_attachment_id: STRING_32
            l_attachment_version: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name
            -- l_object_record_id
            -- l_attachment_id
            -- l_attachment_version

            -- api.vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_delete(l_object_name, l_object_record_id, l_attachment_id, l_attachment_version, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_file_get
            -- Download Object Record Attachment File
            --
            -- 
        local
            l_object_name: STRING_32
            l_object_record_id: STRING_32
            l_attachment_id: STRING_32
            l_attachment_version: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name
            -- l_object_record_id
            -- l_attachment_id
            -- l_attachment_version

            -- api.vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_file_get(l_object_name, l_object_record_id, l_attachment_id, l_attachment_version, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_get
            -- Retrieve Object Record Attachment Version Metadata
            --
            -- 
        local
            l_object_name: STRING_32
            l_object_record_id: STRING_32
            l_attachment_id: STRING_32
            l_attachment_version: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name
            -- l_object_record_id
            -- l_attachment_id
            -- l_attachment_version

            -- api.vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_get(l_object_name, l_object_record_id, l_attachment_id, l_attachment_version, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_post
            -- Restore Object Record Attachment Version
            --
            -- 
        local
            l_object_name: STRING_32
            l_object_record_id: STRING_32
            l_attachment_id: STRING_32
            l_attachment_version: STRING_32
            l_restore: BOOLEAN
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name
            -- l_object_record_id
            -- l_attachment_id
            -- l_attachment_version

            -- api.vobjects_object_name_object_record_id_attachments_attachment_id_versions_attachment_version_post(l_object_name, l_object_record_id, l_attachment_id, l_attachment_version, l_restore, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_object_name_object_record_id_attachments_attachment_id_versions_get
            -- Retrieve Object Record Attachment Versions
            --
            -- 
        local
            l_object_name: STRING_32
            l_object_record_id: STRING_32
            l_attachment_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name
            -- l_object_record_id
            -- l_attachment_id

            -- api.vobjects_object_name_object_record_id_attachments_attachment_id_versions_get(l_object_name, l_object_record_id, l_attachment_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_object_name_object_record_id_attachments_file_get
            -- Download All Object Record Attachment Files
            --
            -- 
        local
            l_object_name: STRING_32
            l_object_record_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name
            -- l_object_record_id

            -- api.vobjects_object_name_object_record_id_attachments_file_get(l_object_name, l_object_record_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_object_name_object_record_id_attachments_get
            -- Retrieve Object Record Attachments
            --
            -- 
        local
            l_object_name: STRING_32
            l_object_record_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name
            -- l_object_record_id

            -- api.vobjects_object_name_object_record_id_attachments_get(l_object_name, l_object_record_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_object_name_object_record_id_attachments_post
            -- Create Object Record Attachment
            --
            -- 
        local
            l_object_name: STRING_32
            l_object_record_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name
            -- l_object_record_id

            -- api.vobjects_object_name_object_record_id_attachments_post(l_object_name, l_object_record_id, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_object_name_object_record_id_audittrail_get
            -- Retrieve Complete Audit History for a Single Object Record
            --
            -- 
        local
            l_object_name: STRING_32
            l_object_record_id: STRING_32
            l_start_date: STRING_32
            l_end_date: STRING_32
            l_format_result: STRING_32
            l_limit: STRING_32
            l_offset: STRING_32
            l_events: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name
            -- l_object_record_id

            -- api.vobjects_object_name_object_record_id_audittrail_get(l_object_name, l_object_record_id, l_start_date, l_end_date, l_format_result, l_limit, l_offset, l_events, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_object_name_object_record_id_get
            -- Retrieve Object Record
            --
            -- 
        local
            l_object_name: STRING_32
            l_object_record_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name
            -- l_object_record_id

            -- api.vobjects_object_name_object_record_id_get(l_object_name, l_object_record_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_object_name_post
            -- Create &amp; Upsert Object Records
            --
            -- 
        local
            l_object_name: STRING_32
            l_id_param: STRING_32
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__migration_mode: BOOLEAN
            l_x__vault_ap_i__no_triggers: BOOLEAN
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name

            -- api.vobjects_object_name_post(l_object_name, l_id_param, l_authorization, l_content__type, l_accept, l_x__vault_ap_i__migration_mode, l_x__vault_ap_i__no_triggers, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_object_name_put
            -- Update Object Records
            --
            -- 
        local
            l_object_name: STRING_32
            l_authorization: STRING_32
            l_content__type: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__migration_mode: BOOLEAN
            l_x__vault_ap_i__no_triggers: BOOLEAN
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name

            -- api.vobjects_object_name_put(l_object_name, l_authorization, l_content__type, l_accept, l_x__vault_ap_i__migration_mode, l_x__vault_ap_i__no_triggers, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_object_name_roles_delete
            -- Remove Users &amp; Groups from Roles on Object Records
            --
            -- 
        local
            l_object_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name

            -- api.vobjects_object_name_roles_delete(l_object_name, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_object_name_roles_post
            -- Assign Users &amp; Groups to Roles on Object Records
            --
            -- 
        local
            l_object_name: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_content__type: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_object_name

            -- api.vobjects_object_name_roles_post(l_object_name, l_authorization, l_accept, l_content__type, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

    test_vobjects_outbound_package_vpackage_id_dependencies_get
            -- Retrieve Outbound Package Dependencies
            --
            -- 
        local
            l_package_id: STRING_32
            l_authorization: STRING_32
            l_accept: STRING_32
            l_x__vault_ap_i__client_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_package_id

            -- api.vobjects_outbound_package_vpackage_id_dependencies_get(l_package_id, l_authorization, l_accept, l_x__vault_ap_i__client_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: DEFAULT_API
            -- Create an object instance of `DEFAULT_API'.
        once
            create { DEFAULT_API } Result
        end

end
