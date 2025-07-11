(ns veeva-vault-api-v25/1.api.default
  (:require [veeva-vault-api-v25/1.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]
            [veeva-vault-api-v25/1.specs.-vobjects-object-name-actions-merge-post-request-inner :refer :all]
            )
  (:import (java.io File)))


(defn-spec api-get-with-http-info any?
  "Retrieve API Versions"
  ([] (api-get-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/api/" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec api-get any?
  "Retrieve API Versions"
  ([] (api-get nil))
  ([optional-params any?]
   (let [res (:data (api-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec api-mdl-components-component-type-and-record-name-files-get-with-http-info any?
  "Retrieve Content File"
  ([component_type_and_record_name string?, ] (api-mdl-components-component-type-and-record-name-files-get-with-http-info component_type_and_record_name nil))
  ([component_type_and_record_name string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params component_type_and_record_name)
   (call-api "/api/mdl/components/{component_type_and_record_name}/files" :get
             {:path-params   {"component_type_and_record_name" component_type_and_record_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec api-mdl-components-component-type-and-record-name-files-get any?
  "Retrieve Content File"
  ([component_type_and_record_name string?, ] (api-mdl-components-component-type-and-record-name-files-get component_type_and_record_name nil))
  ([component_type_and_record_name string?, optional-params any?]
   (let [res (:data (api-mdl-components-component-type-and-record-name-files-get-with-http-info component_type_and_record_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec api-mdl-components-component-type-and-record-name-get-with-http-info any?
  "Retrieve Component Record (MDL)"
  ([component_type_and_record_name string?, ] (api-mdl-components-component-type-and-record-name-get-with-http-info component_type_and_record_name nil))
  ([component_type_and_record_name string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params component_type_and_record_name)
   (call-api "/api/mdl/components/{component_type_and_record_name}" :get
             {:path-params   {"component_type_and_record_name" component_type_and_record_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec api-mdl-components-component-type-and-record-name-get any?
  "Retrieve Component Record (MDL)"
  ([component_type_and_record_name string?, ] (api-mdl-components-component-type-and-record-name-get component_type_and_record_name nil))
  ([component_type_and_record_name string?, optional-params any?]
   (let [res (:data (api-mdl-components-component-type-and-record-name-get-with-http-info component_type_and_record_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec api-mdl-execute-async-job-id-results-get-with-http-info any?
  "Retrieve Asynchronous MDL Script Results"
  ([job_id string?, ] (api-mdl-execute-async-job-id-results-get-with-http-info job_id nil))
  ([job_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params job_id)
   (call-api "/api/mdl/execute_async/{job_id}/results" :get
             {:path-params   {"job_id" job_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec api-mdl-execute-async-job-id-results-get any?
  "Retrieve Asynchronous MDL Script Results"
  ([job_id string?, ] (api-mdl-execute-async-job-id-results-get job_id nil))
  ([job_id string?, optional-params any?]
   (let [res (:data (api-mdl-execute-async-job-id-results-get-with-http-info job_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec api-mdl-execute-async-post-with-http-info any?
  "Execute MDL Script Asynchronously"
  ([] (api-mdl-execute-async-post-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/api/mdl/execute_async" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec api-mdl-execute-async-post any?
  "Execute MDL Script Asynchronously"
  ([] (api-mdl-execute-async-post nil))
  ([optional-params any?]
   (let [res (:data (api-mdl-execute-async-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec api-mdl-execute-post-with-http-info any?
  "Execute MDL Script"
  ([] (api-mdl-execute-post-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/api/mdl/execute" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec api-mdl-execute-post any?
  "Execute MDL Script"
  ([] (api-mdl-execute-post nil))
  ([optional-params any?]
   (let [res (:data (api-mdl-execute-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec api-mdl-files-post-with-http-info any?
  "Upload Content File"
  ([] (api-mdl-files-post-with-http-info nil))
  ([{:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/api/mdl/files" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec api-mdl-files-post any?
  "Upload Content File"
  ([] (api-mdl-files-post nil))
  ([optional-params any?]
   (let [res (:data (api-mdl-files-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec audittrail-audit-trail-type-get-with-http-info any?
  "Retrieve Audit Details"
  ([audit_trail_type string?, ] (audittrail-audit-trail-type-get-with-http-info audit_trail_type nil))
  ([audit_trail_type string?, {:keys [start_date end_date all_dates format_result limit offset objects events Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params audit_trail_type)
   (call-api "/audittrail/{audit_trail_type}" :get
             {:path-params   {"audit_trail_type" audit_trail_type }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"start_date" start_date "end_date" end_date "all_dates" all_dates "format_result" format_result "limit" limit "offset" offset "objects" objects "events" events }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec audittrail-audit-trail-type-get any?
  "Retrieve Audit Details"
  ([audit_trail_type string?, ] (audittrail-audit-trail-type-get audit_trail_type nil))
  ([audit_trail_type string?, optional-params any?]
   (let [res (:data (audittrail-audit-trail-type-get-with-http-info audit_trail_type optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec auth-discovery-post-with-http-info any?
  "Authentication Type Discovery"
  ([] (auth-discovery-post-with-http-info nil))
  ([{:keys [Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/auth/discovery" :post
             {:path-params   {}
              :header-params {"Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec auth-discovery-post any?
  "Authentication Type Discovery"
  ([] (auth-discovery-post nil))
  ([optional-params any?]
   (let [res (:data (auth-discovery-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec auth-oauth-session-oath-oidc-profile-id-post-with-http-info any?
  "OAuth 2.0 / OpenID Connect"
  ([oath_oidc_profile_id string?, ] (auth-oauth-session-oath-oidc-profile-id-post-with-http-info oath_oidc_profile_id nil))
  ([oath_oidc_profile_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params oath_oidc_profile_id)
   (call-api "/auth/oauth/session/{oath_oidc_profile_id}" :post
             {:path-params   {"oath_oidc_profile_id" oath_oidc_profile_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec auth-oauth-session-oath-oidc-profile-id-post any?
  "OAuth 2.0 / OpenID Connect"
  ([oath_oidc_profile_id string?, ] (auth-oauth-session-oath-oidc-profile-id-post oath_oidc_profile_id nil))
  ([oath_oidc_profile_id string?, optional-params any?]
   (let [res (:data (auth-oauth-session-oath-oidc-profile-id-post-with-http-info oath_oidc_profile_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec auth-post-with-http-info any?
  "User Name and Password"
  ([] (auth-post-with-http-info nil))
  ([{:keys [Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/auth" :post
             {:path-params   {}
              :header-params {"Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec auth-post any?
  "User Name and Password"
  ([] (auth-post nil))
  ([optional-params any?]
   (let [res (:data (auth-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec code-class-name-delete-with-http-info any?
  "Delete Single Source Code File"
  ([class_name string?, ] (code-class-name-delete-with-http-info class_name nil))
  ([class_name string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params class_name)
   (call-api "/code/{class_name}" :delete
             {:path-params   {"class_name" class_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec code-class-name-delete any?
  "Delete Single Source Code File"
  ([class_name string?, ] (code-class-name-delete class_name nil))
  ([class_name string?, optional-params any?]
   (let [res (:data (code-class-name-delete-with-http-info class_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec code-class-name-disable-put-with-http-info any?
  "Disable Vault Extension"
  ([class_name string?, ] (code-class-name-disable-put-with-http-info class_name nil))
  ([class_name string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params class_name)
   (call-api "/code/{class_name}/disable" :put
             {:path-params   {"class_name" class_name }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec code-class-name-disable-put any?
  "Disable Vault Extension"
  ([class_name string?, ] (code-class-name-disable-put class_name nil))
  ([class_name string?, optional-params any?]
   (let [res (:data (code-class-name-disable-put-with-http-info class_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec code-class-name-enable-put-with-http-info any?
  "Enable Vault Extension"
  ([class_name string?, ] (code-class-name-enable-put-with-http-info class_name nil))
  ([class_name string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params class_name)
   (call-api "/code/{class_name}/enable" :put
             {:path-params   {"class_name" class_name }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec code-class-name-enable-put any?
  "Enable Vault Extension"
  ([class_name string?, ] (code-class-name-enable-put class_name nil))
  ([class_name string?, optional-params any?]
   (let [res (:data (code-class-name-enable-put-with-http-info class_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec code-class-name-get-with-http-info any?
  "Retrieve Single Source Code File"
  ([class_name string?, ] (code-class-name-get-with-http-info class_name nil))
  ([class_name string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params class_name)
   (call-api "/code/{class_name}" :get
             {:path-params   {"class_name" class_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec code-class-name-get any?
  "Retrieve Single Source Code File"
  ([class_name string?, ] (code-class-name-get class_name nil))
  ([class_name string?, optional-params any?]
   (let [res (:data (code-class-name-get-with-http-info class_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec code-profiler-get-with-http-info any?
  "Retrieve All Profiling Sessions"
  ([] (code-profiler-get-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/code/profiler" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec code-profiler-get any?
  "Retrieve All Profiling Sessions"
  ([] (code-profiler-get nil))
  ([optional-params any?]
   (let [res (:data (code-profiler-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec code-profiler-post-with-http-info any?
  "Create Profiling Session"
  ([] (code-profiler-post-with-http-info nil))
  ([{:keys [Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/code/profiler" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec code-profiler-post any?
  "Create Profiling Session"
  ([] (code-profiler-post nil))
  ([optional-params any?]
   (let [res (:data (code-profiler-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec code-profiler-session-name-actions-end-post-with-http-info any?
  "End Profiling Session"
  ([session_name string?, ] (code-profiler-session-name-actions-end-post-with-http-info session_name nil))
  ([session_name string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params session_name)
   (call-api "/code/profiler/{session_name}/actions/end" :post
             {:path-params   {"session_name" session_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec code-profiler-session-name-actions-end-post any?
  "End Profiling Session"
  ([session_name string?, ] (code-profiler-session-name-actions-end-post session_name nil))
  ([session_name string?, optional-params any?]
   (let [res (:data (code-profiler-session-name-actions-end-post-with-http-info session_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec code-profiler-session-name-delete-with-http-info any?
  "Delete Profiling Session"
  ([session_name string?, ] (code-profiler-session-name-delete-with-http-info session_name nil))
  ([session_name string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params session_name)
   (call-api "/code/profiler/{session_name}" :delete
             {:path-params   {"session_name" session_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec code-profiler-session-name-delete any?
  "Delete Profiling Session"
  ([session_name string?, ] (code-profiler-session-name-delete session_name nil))
  ([session_name string?, optional-params any?]
   (let [res (:data (code-profiler-session-name-delete-with-http-info session_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec code-profiler-session-name-get-with-http-info any?
  "Retrieve Profiling Session"
  ([session_name string?, ] (code-profiler-session-name-get-with-http-info session_name nil))
  ([session_name string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params session_name)
   (call-api "/code/profiler/{session_name}" :get
             {:path-params   {"session_name" session_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec code-profiler-session-name-get any?
  "Retrieve Profiling Session"
  ([session_name string?, ] (code-profiler-session-name-get session_name nil))
  ([session_name string?, optional-params any?]
   (let [res (:data (code-profiler-session-name-get-with-http-info session_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec code-profiler-session-name-results-get-with-http-info any?
  "Download Profiling Session Results"
  ([session_name string?, ] (code-profiler-session-name-results-get-with-http-info session_name nil))
  ([session_name string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params session_name)
   (call-api "/code/profiler/{session_name}/results" :get
             {:path-params   {"session_name" session_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec code-profiler-session-name-results-get any?
  "Download Profiling Session Results"
  ([session_name string?, ] (code-profiler-session-name-results-get session_name nil))
  ([session_name string?, optional-params any?]
   (let [res (:data (code-profiler-session-name-results-get-with-http-info session_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec code-put-with-http-info any?
  "Add or Replace Single Source Code File"
  ([] (code-put-with-http-info nil))
  ([{:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/code" :put
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec code-put any?
  "Add or Replace Single Source Code File"
  ([] (code-put nil))
  ([optional-params any?]
   (let [res (:data (code-put-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec composites-trees-edl-hierarchy-or-template-actions-listnodes-post-with-http-info any?
  "Retrieve Specific Root Nodes"
  ([edl_hierarchy_or_template string?, ] (composites-trees-edl-hierarchy-or-template-actions-listnodes-post-with-http-info edl_hierarchy_or_template nil))
  ([edl_hierarchy_or_template string?, {:keys [Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params edl_hierarchy_or_template)
   (call-api "/composites/trees/{edl_hierarchy_or_template}/actions/listnodes" :post
             {:path-params   {"edl_hierarchy_or_template" edl_hierarchy_or_template }
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec composites-trees-edl-hierarchy-or-template-actions-listnodes-post any?
  "Retrieve Specific Root Nodes"
  ([edl_hierarchy_or_template string?, ] (composites-trees-edl-hierarchy-or-template-actions-listnodes-post edl_hierarchy_or_template nil))
  ([edl_hierarchy_or_template string?, optional-params any?]
   (let [res (:data (composites-trees-edl-hierarchy-or-template-actions-listnodes-post-with-http-info edl_hierarchy_or_template optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec composites-trees-edl-hierarchy-or-template-get-with-http-info any?
  "Retrieve All Root Nodes"
  ([edl_hierarchy_or_template string?, ] (composites-trees-edl-hierarchy-or-template-get-with-http-info edl_hierarchy_or_template nil))
  ([edl_hierarchy_or_template string?, {:keys [Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params edl_hierarchy_or_template)
   (call-api "/composites/trees/{edl_hierarchy_or_template}" :get
             {:path-params   {"edl_hierarchy_or_template" edl_hierarchy_or_template }
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec composites-trees-edl-hierarchy-or-template-get any?
  "Retrieve All Root Nodes"
  ([edl_hierarchy_or_template string?, ] (composites-trees-edl-hierarchy-or-template-get edl_hierarchy_or_template nil))
  ([edl_hierarchy_or_template string?, optional-params any?]
   (let [res (:data (composites-trees-edl-hierarchy-or-template-get-with-http-info edl_hierarchy_or_template optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec composites-trees-edl-hierarchy-v-parent-node-id-children-get-with-http-info any?
  "Retrieve a Node's Children"
  ([parent_node_id string?, ] (composites-trees-edl-hierarchy-v-parent-node-id-children-get-with-http-info parent_node_id nil))
  ([parent_node_id string?, {:keys [Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params parent_node_id)
   (call-api "/composites/trees/edl_hierarchy__v/{parent_node_id}/children" :get
             {:path-params   {"parent_node_id" parent_node_id }
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec composites-trees-edl-hierarchy-v-parent-node-id-children-get any?
  "Retrieve a Node's Children"
  ([parent_node_id string?, ] (composites-trees-edl-hierarchy-v-parent-node-id-children-get parent_node_id nil))
  ([parent_node_id string?, optional-params any?]
   (let [res (:data (composites-trees-edl-hierarchy-v-parent-node-id-children-get-with-http-info parent_node_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec composites-trees-edl-hierarchy-v-parent-node-id-children-put-with-http-info any?
  "Update Node Order"
  ([parent_node_id string?, ] (composites-trees-edl-hierarchy-v-parent-node-id-children-put-with-http-info parent_node_id nil))
  ([parent_node_id string?, {:keys [Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params parent_node_id)
   (call-api "/composites/trees/edl_hierarchy__v/{parent_node_id}/children" :put
             {:path-params   {"parent_node_id" parent_node_id }
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec composites-trees-edl-hierarchy-v-parent-node-id-children-put any?
  "Update Node Order"
  ([parent_node_id string?, ] (composites-trees-edl-hierarchy-v-parent-node-id-children-put parent_node_id nil))
  ([parent_node_id string?, optional-params any?]
   (let [res (:data (composites-trees-edl-hierarchy-v-parent-node-id-children-put-with-http-info parent_node_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec configuration-component-type-and-record-name-get-with-http-info any?
  "Retrieve Component Record (XML/JSON)"
  ([component_type_and_record_name string?, ] (configuration-component-type-and-record-name-get-with-http-info component_type_and_record_name nil))
  ([component_type_and_record_name string?, {:keys [loc Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params component_type_and_record_name)
   (call-api "/configuration/{component_type_and_record_name}" :get
             {:path-params   {"component_type_and_record_name" component_type_and_record_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"loc" loc }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec configuration-component-type-and-record-name-get any?
  "Retrieve Component Record (XML/JSON)"
  ([component_type_and_record_name string?, ] (configuration-component-type-and-record-name-get component_type_and_record_name nil))
  ([component_type_and_record_name string?, optional-params any?]
   (let [res (:data (configuration-component-type-and-record-name-get-with-http-info component_type_and_record_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec configuration-component-type-get-with-http-info any?
  "Retrieve Component Record Collection"
  ([component_type string?, ] (configuration-component-type-get-with-http-info component_type nil))
  ([component_type string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params component_type)
   (call-api "/configuration/{component_type}" :get
             {:path-params   {"component_type" component_type }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec configuration-component-type-get any?
  "Retrieve Component Record Collection"
  ([component_type string?, ] (configuration-component-type-get component_type nil))
  ([component_type string?, optional-params any?]
   (let [res (:data (configuration-component-type-get-with-http-info component_type optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec configuration-object-name-and-object-type-get-with-http-info any?
  "Retrieve Details from a Specific Object"
  ([object_name_and_object_type string?, ] (configuration-object-name-and-object-type-get-with-http-info object_name_and_object_type nil))
  ([object_name_and_object_type string?, {:keys [loc Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name_and_object_type)
   (call-api "/configuration/{object_name_and_object_type}" :get
             {:path-params   {"object_name_and_object_type" object_name_and_object_type }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"loc" loc }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec configuration-object-name-and-object-type-get any?
  "Retrieve Details from a Specific Object"
  ([object_name_and_object_type string?, ] (configuration-object-name-and-object-type-get object_name_and_object_type nil))
  ([object_name_and_object_type string?, optional-params any?]
   (let [res (:data (configuration-object-name-and-object-type-get-with-http-info object_name_and_object_type optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec configuration-objecttype-get-with-http-info any?
  "Retrieve Details from All Object Types"
  ([] (configuration-objecttype-get-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/configuration/Objecttype" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec configuration-objecttype-get any?
  "Retrieve Details from All Object Types"
  ([] (configuration-objecttype-get nil))
  ([optional-params any?]
   (let [res (:data (configuration-objecttype-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec configuration-role-assignment-rule-delete-with-http-info any?
  "Delete Lifecycle Role Assignment Override Rules"
  ([] (configuration-role-assignment-rule-delete-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/configuration/role_assignment_rule" :delete
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec configuration-role-assignment-rule-delete any?
  "Delete Lifecycle Role Assignment Override Rules"
  ([] (configuration-role-assignment-rule-delete nil))
  ([optional-params any?]
   (let [res (:data (configuration-role-assignment-rule-delete-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec configuration-role-assignment-rule-get-with-http-info any?
  "Retrieve Lifecycle Role Assignment Rules (Default & Override)"
  ([] (configuration-role-assignment-rule-get-with-http-info nil))
  ([{:keys [lifecycle__v role__v product__v country__v study__v study_country__v Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/configuration/role_assignment_rule" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"lifecycle__v" lifecycle__v "role__v" role__v "product__v" product__v "country__v" country__v "study__v" study__v "study_country__v" study_country__v }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec configuration-role-assignment-rule-get any?
  "Retrieve Lifecycle Role Assignment Rules (Default & Override)"
  ([] (configuration-role-assignment-rule-get nil))
  ([optional-params any?]
   (let [res (:data (configuration-role-assignment-rule-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec configuration-role-assignment-rule-post-with-http-info any?
  "Create Lifecycle Role Assignment Override Rules"
  ([] (configuration-role-assignment-rule-post-with-http-info nil))
  ([{:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/configuration/role_assignment_rule" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec configuration-role-assignment-rule-post any?
  "Create Lifecycle Role Assignment Override Rules"
  ([] (configuration-role-assignment-rule-post nil))
  ([optional-params any?]
   (let [res (:data (configuration-role-assignment-rule-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec configuration-role-assignment-rule-put-with-http-info any?
  "Update Lifecycle Role Assignment Rules (Default & Override)"
  ([] (configuration-role-assignment-rule-put-with-http-info nil))
  ([{:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/configuration/role_assignment_rule" :put
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec configuration-role-assignment-rule-put any?
  "Update Lifecycle Role Assignment Rules (Default & Override)"
  ([] (configuration-role-assignment-rule-put nil))
  ([optional-params any?]
   (let [res (:data (configuration-role-assignment-rule-put-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec delegation-login-post-with-http-info any?
  "Initiate Delegated Session"
  ([] (delegation-login-post-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/delegation/login" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec delegation-login-post any?
  "Initiate Delegated Session"
  ([] (delegation-login-post nil))
  ([optional-params any?]
   (let [res (:data (delegation-login-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec delegation-vaults-get-with-http-info any?
  "Retrieve Delegations"
  ([] (delegation-vaults-get-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/delegation/vaults" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec delegation-vaults-get any?
  "Retrieve Delegations"
  ([] (delegation-vaults-get nil))
  ([optional-params any?]
   (let [res (:data (delegation-vaults-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec keep-alive-post-with-http-info any?
  "Session Keep Alive"
  ([] (keep-alive-post-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/keep-alive" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec keep-alive-post any?
  "Session Keep Alive"
  ([] (keep-alive-post nil))
  ([optional-params any?]
   (let [res (:data (keep-alive-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec limits-get-with-http-info any?
  "Retrieve Limits on Objects"
  ([] (limits-get-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/limits" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec limits-get any?
  "Retrieve Limits on Objects"
  ([] (limits-get nil))
  ([optional-params any?]
   (let [res (:data (limits-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec logs-api-usage-get-with-http-info any?
  "Download Daily API Usage"
  ([] (logs-api-usage-get-with-http-info nil))
  ([{:keys [date log_format Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/logs/api_usage" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"date" date "log_format" log_format }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec logs-api-usage-get any?
  "Download Daily API Usage"
  ([] (logs-api-usage-get nil))
  ([optional-params any?]
   (let [res (:data (logs-api-usage-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec logs-code-debug-get-with-http-info any?
  "Retrieve All Debug Logs"
  ([] (logs-code-debug-get-with-http-info nil))
  ([{:keys [user_id include_inactive Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/logs/code/debug" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"user_id" user_id "include_inactive" include_inactive }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec logs-code-debug-get any?
  "Retrieve All Debug Logs"
  ([] (logs-code-debug-get nil))
  ([optional-params any?]
   (let [res (:data (logs-code-debug-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec logs-code-debug-id-actions-reset-delete-with-http-info any?
  "Delete Debug Log"
  ([id string?, ] (logs-code-debug-id-actions-reset-delete-with-http-info id nil))
  ([id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params id)
   (call-api "/logs/code/debug/{id}/actions/reset" :delete
             {:path-params   {"id" id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec logs-code-debug-id-actions-reset-delete any?
  "Delete Debug Log"
  ([id string?, ] (logs-code-debug-id-actions-reset-delete id nil))
  ([id string?, optional-params any?]
   (let [res (:data (logs-code-debug-id-actions-reset-delete-with-http-info id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec logs-code-debug-id-actions-reset-post-with-http-info any?
  "Reset Debug Log"
  ([id string?, ] (logs-code-debug-id-actions-reset-post-with-http-info id nil))
  ([id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params id)
   (call-api "/logs/code/debug/{id}/actions/reset" :post
             {:path-params   {"id" id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec logs-code-debug-id-actions-reset-post any?
  "Reset Debug Log"
  ([id string?, ] (logs-code-debug-id-actions-reset-post id nil))
  ([id string?, optional-params any?]
   (let [res (:data (logs-code-debug-id-actions-reset-post-with-http-info id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec logs-code-debug-id-files-get-with-http-info any?
  "Download Debug Log Files"
  ([id string?, ] (logs-code-debug-id-files-get-with-http-info id nil))
  ([id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params id)
   (call-api "/logs/code/debug/{id}/files" :get
             {:path-params   {"id" id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec logs-code-debug-id-files-get any?
  "Download Debug Log Files"
  ([id string?, ] (logs-code-debug-id-files-get id nil))
  ([id string?, optional-params any?]
   (let [res (:data (logs-code-debug-id-files-get-with-http-info id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec logs-code-debug-id-get-with-http-info any?
  "Retrieve Single Debug Log"
  ([id string?, ] (logs-code-debug-id-get-with-http-info id nil))
  ([id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params id)
   (call-api "/logs/code/debug/{id}" :get
             {:path-params   {"id" id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec logs-code-debug-id-get any?
  "Retrieve Single Debug Log"
  ([id string?, ] (logs-code-debug-id-get id nil))
  ([id string?, optional-params any?]
   (let [res (:data (logs-code-debug-id-get-with-http-info id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec logs-code-debug-post-with-http-info any?
  "Create Debug Log"
  ([] (logs-code-debug-post-with-http-info nil))
  ([{:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/logs/code/debug" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec logs-code-debug-post any?
  "Create Debug Log"
  ([] (logs-code-debug-post nil))
  ([optional-params any?]
   (let [res (:data (logs-code-debug-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec logs-code-runtime-get-with-http-info any?
  "Download SDK Runtime Log"
  ([] (logs-code-runtime-get-with-http-info nil))
  ([{:keys [date log_format Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/logs/code/runtime" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"date" date "log_format" log_format }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec logs-code-runtime-get any?
  "Download SDK Runtime Log"
  ([] (logs-code-runtime-get nil))
  ([optional-params any?]
   (let [res (:data (logs-code-runtime-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec messages-message-type-actions-import-post-with-http-info any?
  "Import Bulk Translation File"
  ([message_type string?, ] (messages-message-type-actions-import-post-with-http-info message_type nil))
  ([message_type string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params message_type)
   (call-api "/messages/{message_type}/actions/import" :post
             {:path-params   {"message_type" message_type }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec messages-message-type-actions-import-post any?
  "Import Bulk Translation File"
  ([message_type string?, ] (messages-message-type-actions-import-post message_type nil))
  ([message_type string?, optional-params any?]
   (let [res (:data (messages-message-type-actions-import-post-with-http-info message_type optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec messages-message-type-language-lang-actions-export-post-with-http-info any?
  "Export Bulk Translation File"
  ([message_type string?, lang string?, ] (messages-message-type-language-lang-actions-export-post-with-http-info message_type lang nil))
  ([message_type string?, lang string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params message_type lang)
   (call-api "/messages/{message_type}/language/{lang}/actions/export" :post
             {:path-params   {"message_type" message_type "lang" lang }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec messages-message-type-language-lang-actions-export-post any?
  "Export Bulk Translation File"
  ([message_type string?, lang string?, ] (messages-message-type-language-lang-actions-export-post message_type lang nil))
  ([message_type string?, lang string?, optional-params any?]
   (let [res (:data (messages-message-type-language-lang-actions-export-post-with-http-info message_type lang optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec metadata-audittrail-audit-trail-type-get-with-http-info any?
  "Retrieve Audit Metadata"
  ([audit_trail_type string?, ] (metadata-audittrail-audit-trail-type-get-with-http-info audit_trail_type nil))
  ([audit_trail_type string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params audit_trail_type)
   (call-api "/metadata/audittrail/{audit_trail_type}" :get
             {:path-params   {"audit_trail_type" audit_trail_type }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec metadata-audittrail-audit-trail-type-get any?
  "Retrieve Audit Metadata"
  ([audit_trail_type string?, ] (metadata-audittrail-audit-trail-type-get audit_trail_type nil))
  ([audit_trail_type string?, optional-params any?]
   (let [res (:data (metadata-audittrail-audit-trail-type-get-with-http-info audit_trail_type optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec metadata-audittrail-get-with-http-info any?
  "Retrieve Audit Types"
  ([] (metadata-audittrail-get-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/metadata/audittrail" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec metadata-audittrail-get any?
  "Retrieve Audit Types"
  ([] (metadata-audittrail-get nil))
  ([optional-params any?]
   (let [res (:data (metadata-audittrail-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec metadata-components-component-type-get-with-http-info any?
  "Retrieve Component Type Metadata"
  ([component_type string?, ] (metadata-components-component-type-get-with-http-info component_type nil))
  ([component_type string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params component_type)
   (call-api "/metadata/components/{component_type}" :get
             {:path-params   {"component_type" component_type }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec metadata-components-component-type-get any?
  "Retrieve Component Type Metadata"
  ([component_type string?, ] (metadata-components-component-type-get component_type nil))
  ([component_type string?, optional-params any?]
   (let [res (:data (metadata-components-component-type-get-with-http-info component_type optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec metadata-components-get-with-http-info any?
  "Retrieve All Component Metadata"
  ([] (metadata-components-get-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/metadata/components" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec metadata-components-get any?
  "Retrieve All Component Metadata"
  ([] (metadata-components-get nil))
  ([optional-params any?]
   (let [res (:data (metadata-components-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec metadata-objects-binders-templates-bindernodes-get-with-http-info any?
  "Retrieve Binder Template Node Metadata"
  ([] (metadata-objects-binders-templates-bindernodes-get-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/metadata/objects/binders/templates/bindernodes" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec metadata-objects-binders-templates-bindernodes-get any?
  "Retrieve Binder Template Node Metadata"
  ([] (metadata-objects-binders-templates-bindernodes-get nil))
  ([optional-params any?]
   (let [res (:data (metadata-objects-binders-templates-bindernodes-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec metadata-objects-binders-templates-get-with-http-info any?
  "Retrieve Binder Template Metadata"
  ([] (metadata-objects-binders-templates-get-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/metadata/objects/binders/templates" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec metadata-objects-binders-templates-get any?
  "Retrieve Binder Template Metadata"
  ([] (metadata-objects-binders-templates-get nil))
  ([optional-params any?]
   (let [res (:data (metadata-objects-binders-templates-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec metadata-objects-documents-annotations-placemarks-types-placemark-type-get-with-http-info any?
  "Retrieve Annotation Placemark Type Metadata"
  ([placemark_type string?, ] (metadata-objects-documents-annotations-placemarks-types-placemark-type-get-with-http-info placemark_type nil))
  ([placemark_type string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params placemark_type)
   (call-api "/metadata/objects/documents/annotations/placemarks/types/{placemark_type}" :get
             {:path-params   {"placemark_type" placemark_type }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec metadata-objects-documents-annotations-placemarks-types-placemark-type-get any?
  "Retrieve Annotation Placemark Type Metadata"
  ([placemark_type string?, ] (metadata-objects-documents-annotations-placemarks-types-placemark-type-get placemark_type nil))
  ([placemark_type string?, optional-params any?]
   (let [res (:data (metadata-objects-documents-annotations-placemarks-types-placemark-type-get-with-http-info placemark_type optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec metadata-objects-documents-annotations-references-types-reference-type-get-with-http-info any?
  "Retrieve Annotation Reference Type Metadata"
  ([reference_type string?, ] (metadata-objects-documents-annotations-references-types-reference-type-get-with-http-info reference_type nil))
  ([reference_type string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params reference_type)
   (call-api "/metadata/objects/documents/annotations/references/types/{reference_type}" :get
             {:path-params   {"reference_type" reference_type }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec metadata-objects-documents-annotations-references-types-reference-type-get any?
  "Retrieve Annotation Reference Type Metadata"
  ([reference_type string?, ] (metadata-objects-documents-annotations-references-types-reference-type-get reference_type nil))
  ([reference_type string?, optional-params any?]
   (let [res (:data (metadata-objects-documents-annotations-references-types-reference-type-get-with-http-info reference_type optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec metadata-objects-documents-annotations-types-annotation-type-get-with-http-info any?
  "Retrieve Annotation Type Metadata"
  ([annotation_type string?, ] (metadata-objects-documents-annotations-types-annotation-type-get-with-http-info annotation_type nil))
  ([annotation_type string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params annotation_type)
   (call-api "/metadata/objects/documents/annotations/types/{annotation_type}" :get
             {:path-params   {"annotation_type" annotation_type }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec metadata-objects-documents-annotations-types-annotation-type-get any?
  "Retrieve Annotation Type Metadata"
  ([annotation_type string?, ] (metadata-objects-documents-annotations-types-annotation-type-get annotation_type nil))
  ([annotation_type string?, optional-params any?]
   (let [res (:data (metadata-objects-documents-annotations-types-annotation-type-get-with-http-info annotation_type optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec metadata-objects-documents-events-event-type-types-event-subtype-get-with-http-info any?
  "Retrieve Document Event SubType Metadata"
  ([event_type string?, event_subtype string?, ] (metadata-objects-documents-events-event-type-types-event-subtype-get-with-http-info event_type event_subtype nil))
  ([event_type string?, event_subtype string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params event_type event_subtype)
   (call-api "/metadata/objects/documents/events/{event_type}/types/{event_subtype}" :get
             {:path-params   {"event_type" event_type "event_subtype" event_subtype }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec metadata-objects-documents-events-event-type-types-event-subtype-get any?
  "Retrieve Document Event SubType Metadata"
  ([event_type string?, event_subtype string?, ] (metadata-objects-documents-events-event-type-types-event-subtype-get event_type event_subtype nil))
  ([event_type string?, event_subtype string?, optional-params any?]
   (let [res (:data (metadata-objects-documents-events-event-type-types-event-subtype-get-with-http-info event_type event_subtype optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec metadata-objects-documents-events-get-with-http-info any?
  "Retrieve Document Event Types and Subtypes"
  ([] (metadata-objects-documents-events-get-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/metadata/objects/documents/events" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec metadata-objects-documents-events-get any?
  "Retrieve Document Event Types and Subtypes"
  ([] (metadata-objects-documents-events-get nil))
  ([optional-params any?]
   (let [res (:data (metadata-objects-documents-events-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec metadata-objects-documents-lock-get-with-http-info any?
  "Retrieve Document Lock Metadata"
  ([] (metadata-objects-documents-lock-get-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/metadata/objects/documents/lock" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec metadata-objects-documents-lock-get any?
  "Retrieve Document Lock Metadata"
  ([] (metadata-objects-documents-lock-get nil))
  ([optional-params any?]
   (let [res (:data (metadata-objects-documents-lock-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec metadata-objects-documents-properties-find-common-post-with-http-info any?
  "Retrieve Common Document Fields"
  ([] (metadata-objects-documents-properties-find-common-post-with-http-info nil))
  ([{:keys [Content-Type Accept Authorization X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/metadata/objects/documents/properties/find_common" :post
             {:path-params   {}
              :header-params {"Content-Type" Content-Type "Accept" Accept "Authorization" Authorization "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec metadata-objects-documents-properties-find-common-post any?
  "Retrieve Common Document Fields"
  ([] (metadata-objects-documents-properties-find-common-post nil))
  ([optional-params any?]
   (let [res (:data (metadata-objects-documents-properties-find-common-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec metadata-objects-documents-properties-get-with-http-info any?
  "Retrieve All Document Fields"
  ([] (metadata-objects-documents-properties-get-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/metadata/objects/documents/properties" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec metadata-objects-documents-properties-get any?
  "Retrieve All Document Fields"
  ([] (metadata-objects-documents-properties-get nil))
  ([optional-params any?]
   (let [res (:data (metadata-objects-documents-properties-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec metadata-objects-documents-templates-get-with-http-info any?
  "Retrieve Document Template Metadata"
  ([] (metadata-objects-documents-templates-get-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/metadata/objects/documents/templates" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec metadata-objects-documents-templates-get any?
  "Retrieve Document Template Metadata"
  ([] (metadata-objects-documents-templates-get nil))
  ([optional-params any?]
   (let [res (:data (metadata-objects-documents-templates-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec metadata-objects-documents-types-get-with-http-info any?
  "Retrieve All Document Types"
  ([] (metadata-objects-documents-types-get-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/metadata/objects/documents/types" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec metadata-objects-documents-types-get any?
  "Retrieve All Document Types"
  ([] (metadata-objects-documents-types-get nil))
  ([optional-params any?]
   (let [res (:data (metadata-objects-documents-types-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec metadata-objects-documents-types-type-get-with-http-info any?
  "Retrieve Document Type"
  ([type string?, ] (metadata-objects-documents-types-type-get-with-http-info type nil))
  ([type string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params type)
   (call-api "/metadata/objects/documents/types/{type}" :get
             {:path-params   {"type" type }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec metadata-objects-documents-types-type-get any?
  "Retrieve Document Type"
  ([type string?, ] (metadata-objects-documents-types-type-get type nil))
  ([type string?, optional-params any?]
   (let [res (:data (metadata-objects-documents-types-type-get-with-http-info type optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec metadata-objects-documents-types-type-relationships-get-with-http-info any?
  "Retrieve Document Type Relationships"
  ([type string?, ] (metadata-objects-documents-types-type-relationships-get-with-http-info type nil))
  ([type string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params type)
   (call-api "/metadata/objects/documents/types/{type}/relationships" :get
             {:path-params   {"type" type }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec metadata-objects-documents-types-type-relationships-get any?
  "Retrieve Document Type Relationships"
  ([type string?, ] (metadata-objects-documents-types-type-relationships-get type nil))
  ([type string?, optional-params any?]
   (let [res (:data (metadata-objects-documents-types-type-relationships-get-with-http-info type optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec metadata-objects-documents-types-type-subtypes-subtype-classifications-classification-get-with-http-info any?
  "Retrieve Document Classification"
  ([type string?, subtype string?, classification string?, ] (metadata-objects-documents-types-type-subtypes-subtype-classifications-classification-get-with-http-info type subtype classification nil))
  ([type string?, subtype string?, classification string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params type subtype classification)
   (call-api "/metadata/objects/documents/types/{type}/subtypes/{subtype}/classifications/{classification}" :get
             {:path-params   {"type" type "subtype" subtype "classification" classification }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec metadata-objects-documents-types-type-subtypes-subtype-classifications-classification-get any?
  "Retrieve Document Classification"
  ([type string?, subtype string?, classification string?, ] (metadata-objects-documents-types-type-subtypes-subtype-classifications-classification-get type subtype classification nil))
  ([type string?, subtype string?, classification string?, optional-params any?]
   (let [res (:data (metadata-objects-documents-types-type-subtypes-subtype-classifications-classification-get-with-http-info type subtype classification optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec metadata-objects-documents-types-type-subtypes-subtype-get-with-http-info any?
  "Retrieve Document Subtype"
  ([type string?, subtype string?, ] (metadata-objects-documents-types-type-subtypes-subtype-get-with-http-info type subtype nil))
  ([type string?, subtype string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params type subtype)
   (call-api "/metadata/objects/documents/types/{type}/subtypes/{subtype}" :get
             {:path-params   {"type" type "subtype" subtype }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec metadata-objects-documents-types-type-subtypes-subtype-get any?
  "Retrieve Document Subtype"
  ([type string?, subtype string?, ] (metadata-objects-documents-types-type-subtypes-subtype-get type subtype nil))
  ([type string?, subtype string?, optional-params any?]
   (let [res (:data (metadata-objects-documents-types-type-subtypes-subtype-get-with-http-info type subtype optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec metadata-objects-groups-get-with-http-info any?
  "Retrieve Group Metadata"
  ([] (metadata-objects-groups-get-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/metadata/objects/groups" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec metadata-objects-groups-get any?
  "Retrieve Group Metadata"
  ([] (metadata-objects-groups-get nil))
  ([optional-params any?]
   (let [res (:data (metadata-objects-groups-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec metadata-objects-securitypolicies-get-with-http-info any?
  "Retrieve Security Policy Metadata"
  ([] (metadata-objects-securitypolicies-get-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/metadata/objects/securitypolicies" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec metadata-objects-securitypolicies-get any?
  "Retrieve Security Policy Metadata"
  ([] (metadata-objects-securitypolicies-get nil))
  ([optional-params any?]
   (let [res (:data (metadata-objects-securitypolicies-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec metadata-objects-users-get-with-http-info any?
  "Retrieve User Metadata"
  ([] (metadata-objects-users-get-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/metadata/objects/users" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec metadata-objects-users-get any?
  "Retrieve User Metadata"
  ([] (metadata-objects-users-get nil))
  ([optional-params any?]
   (let [res (:data (metadata-objects-users-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec metadata-query-archived-documents-relationships-document-signature-sysr-get-with-http-info any?
  "Retrieve Archived Document Signature Metadata"
  ([] (metadata-query-archived-documents-relationships-document-signature-sysr-get-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/metadata/query/archived_documents/relationships/document_signature__sysr" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec metadata-query-archived-documents-relationships-document-signature-sysr-get any?
  "Retrieve Archived Document Signature Metadata"
  ([] (metadata-query-archived-documents-relationships-document-signature-sysr-get nil))
  ([optional-params any?]
   (let [res (:data (metadata-query-archived-documents-relationships-document-signature-sysr-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec metadata-query-documents-relationships-document-signature-sysr-get-with-http-info any?
  "Retrieve Document Signature Metadata"
  ([] (metadata-query-documents-relationships-document-signature-sysr-get-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/metadata/query/documents/relationships/document_signature__sysr" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec metadata-query-documents-relationships-document-signature-sysr-get any?
  "Retrieve Document Signature Metadata"
  ([] (metadata-query-documents-relationships-document-signature-sysr-get nil))
  ([optional-params any?]
   (let [res (:data (metadata-query-documents-relationships-document-signature-sysr-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec metadata-vobjects-get-with-http-info any?
  "Retrieve Object Collection"
  ([] (metadata-vobjects-get-with-http-info nil))
  ([{:keys [loc Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/metadata/vobjects" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"loc" loc }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec metadata-vobjects-get any?
  "Retrieve Object Collection"
  ([] (metadata-vobjects-get nil))
  ([optional-params any?]
   (let [res (:data (metadata-vobjects-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec metadata-vobjects-object-name-actions-canceldeployment-post-with-http-info any?
  "Cancel Raw Object Deployment"
  ([object_name string?, ] (metadata-vobjects-object-name-actions-canceldeployment-post-with-http-info object_name nil))
  ([object_name string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name)
   (call-api "/metadata/vobjects/{object_name}/actions/canceldeployment" :post
             {:path-params   {"object_name" object_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec metadata-vobjects-object-name-actions-canceldeployment-post any?
  "Cancel Raw Object Deployment"
  ([object_name string?, ] (metadata-vobjects-object-name-actions-canceldeployment-post object_name nil))
  ([object_name string?, optional-params any?]
   (let [res (:data (metadata-vobjects-object-name-actions-canceldeployment-post-with-http-info object_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec metadata-vobjects-object-name-fields-object-field-name-get-with-http-info any?
  "Retrieve Object Field Metadata"
  ([object_name string?, object_field_name string?, ] (metadata-vobjects-object-name-fields-object-field-name-get-with-http-info object_name object_field_name nil))
  ([object_name string?, object_field_name string?, {:keys [loc Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name object_field_name)
   (call-api "/metadata/vobjects/{object_name}/fields/{object_field_name}" :get
             {:path-params   {"object_name" object_name "object_field_name" object_field_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"loc" loc }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec metadata-vobjects-object-name-fields-object-field-name-get any?
  "Retrieve Object Field Metadata"
  ([object_name string?, object_field_name string?, ] (metadata-vobjects-object-name-fields-object-field-name-get object_name object_field_name nil))
  ([object_name string?, object_field_name string?, optional-params any?]
   (let [res (:data (metadata-vobjects-object-name-fields-object-field-name-get-with-http-info object_name object_field_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec metadata-vobjects-object-name-get-with-http-info any?
  "Retrieve Object Metadata"
  ([object_name string?, ] (metadata-vobjects-object-name-get-with-http-info object_name nil))
  ([object_name string?, {:keys [loc Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name)
   (call-api "/metadata/vobjects/{object_name}" :get
             {:path-params   {"object_name" object_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"loc" loc }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec metadata-vobjects-object-name-get any?
  "Retrieve Object Metadata"
  ([object_name string?, ] (metadata-vobjects-object-name-get object_name nil))
  ([object_name string?, optional-params any?]
   (let [res (:data (metadata-vobjects-object-name-get-with-http-info object_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec metadata-vobjects-object-name-page-layouts-get-with-http-info any?
  "Retrieve Page Layouts"
  ([object_name string?, ] (metadata-vobjects-object-name-page-layouts-get-with-http-info object_name nil))
  ([object_name string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name)
   (call-api "/metadata/vobjects/{object_name}/page_layouts" :get
             {:path-params   {"object_name" object_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec metadata-vobjects-object-name-page-layouts-get any?
  "Retrieve Page Layouts"
  ([object_name string?, ] (metadata-vobjects-object-name-page-layouts-get object_name nil))
  ([object_name string?, optional-params any?]
   (let [res (:data (metadata-vobjects-object-name-page-layouts-get-with-http-info object_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec metadata-vobjects-object-name-page-layouts-layout-name-get-with-http-info any?
  "Retrieve Page Layout Metadata"
  ([object_name string?, layout_name string?, ] (metadata-vobjects-object-name-page-layouts-layout-name-get-with-http-info object_name layout_name nil))
  ([object_name string?, layout_name string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name layout_name)
   (call-api "/metadata/vobjects/{object_name}/page_layouts/{layout_name}" :get
             {:path-params   {"object_name" object_name "layout_name" layout_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec metadata-vobjects-object-name-page-layouts-layout-name-get any?
  "Retrieve Page Layout Metadata"
  ([object_name string?, layout_name string?, ] (metadata-vobjects-object-name-page-layouts-layout-name-get object_name layout_name nil))
  ([object_name string?, layout_name string?, optional-params any?]
   (let [res (:data (metadata-vobjects-object-name-page-layouts-layout-name-get-with-http-info object_name layout_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec notifications-histories-get-with-http-info any?
  "Retrieve Email Notification Histories"
  ([] (notifications-histories-get-with-http-info nil))
  ([{:keys [start_date end_date all_dates format_result limit offset Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/notifications/histories" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"start_date" start_date "end_date" end_date "all_dates" all_dates "format_result" format_result "limit" limit "offset" offset }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec notifications-histories-get any?
  "Retrieve Email Notification Histories"
  ([] (notifications-histories-get nil))
  ([optional-params any?]
   (let [res (:data (notifications-histories-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec object-workflow-actions-action-get-with-http-info any?
  "Retrieve Bulk Workflow Action Details"
  ([action string?, ] (object-workflow-actions-action-get-with-http-info action nil))
  ([action string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params action)
   (call-api "/object/workflow/actions/{action}" :get
             {:path-params   {"action" action }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec object-workflow-actions-action-get any?
  "Retrieve Bulk Workflow Action Details"
  ([action string?, ] (object-workflow-actions-action-get action nil))
  ([action string?, optional-params any?]
   (let [res (:data (object-workflow-actions-action-get-with-http-info action optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec object-workflow-actions-action-post-with-http-info any?
  "Initiate Workflow Actions on Multiple Workflows"
  ([action string?, ] (object-workflow-actions-action-post-with-http-info action nil))
  ([action string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params action)
   (call-api "/object/workflow/actions/{action}" :post
             {:path-params   {"action" action }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec object-workflow-actions-action-post any?
  "Initiate Workflow Actions on Multiple Workflows"
  ([action string?, ] (object-workflow-actions-action-post action nil))
  ([action string?, optional-params any?]
   (let [res (:data (object-workflow-actions-action-post-with-http-info action optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec object-workflow-actions-canceltasks-post-with-http-info any?
  "Cancel Workflow Tasks"
  ([] (object-workflow-actions-canceltasks-post-with-http-info nil))
  ([{:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/object/workflow/actions/canceltasks" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec object-workflow-actions-canceltasks-post any?
  "Cancel Workflow Tasks"
  ([] (object-workflow-actions-canceltasks-post nil))
  ([optional-params any?]
   (let [res (:data (object-workflow-actions-canceltasks-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec object-workflow-actions-cancelworkflows-post-with-http-info any?
  "Cancel Workflows"
  ([] (object-workflow-actions-cancelworkflows-post-with-http-info nil))
  ([{:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/object/workflow/actions/cancelworkflows" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec object-workflow-actions-cancelworkflows-post any?
  "Cancel Workflows"
  ([] (object-workflow-actions-cancelworkflows-post nil))
  ([optional-params any?]
   (let [res (:data (object-workflow-actions-cancelworkflows-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec object-workflow-actions-get-with-http-info any?
  "Retrieve Bulk Workflow Actions"
  ([] (object-workflow-actions-get-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/object/workflow/actions" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec object-workflow-actions-get any?
  "Retrieve Bulk Workflow Actions"
  ([] (object-workflow-actions-get nil))
  ([optional-params any?]
   (let [res (:data (object-workflow-actions-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec object-workflow-actions-reassigntasks-post-with-http-info any?
  "Reassign Workflow Tasks"
  ([] (object-workflow-actions-reassigntasks-post-with-http-info nil))
  ([{:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/object/workflow/actions/reassigntasks" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec object-workflow-actions-reassigntasks-post any?
  "Reassign Workflow Tasks"
  ([] (object-workflow-actions-reassigntasks-post nil))
  ([optional-params any?]
   (let [res (:data (object-workflow-actions-reassigntasks-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec object-workflow-actions-replaceworkflowowner-post-with-http-info any?
  "Replace Workflow Owner"
  ([] (object-workflow-actions-replaceworkflowowner-post-with-http-info nil))
  ([{:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/object/workflow/actions/replaceworkflowowner" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec object-workflow-actions-replaceworkflowowner-post any?
  "Replace Workflow Owner"
  ([] (object-workflow-actions-replaceworkflowowner-post nil))
  ([optional-params any?]
   (let [res (:data (object-workflow-actions-replaceworkflowowner-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-actions-export-job-id-results-get-with-http-info any?
  "Retrieve Binder Export Results"
  ([job_id string?, ] (objects-binders-actions-export-job-id-results-get-with-http-info job_id nil))
  ([job_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params job_id)
   (call-api "/objects/binders/actions/export/{job_id}/results" :get
             {:path-params   {"job_id" job_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-actions-export-job-id-results-get any?
  "Retrieve Binder Export Results"
  ([job_id string?, ] (objects-binders-actions-export-job-id-results-get job_id nil))
  ([job_id string?, optional-params any?]
   (let [res (:data (objects-binders-actions-export-job-id-results-get-with-http-info job_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-binder-id-actions-export-post-with-http-info any?
  "Export Binder (Latest Version)"
  ([binder_id string?, ] (objects-binders-binder-id-actions-export-post-with-http-info binder_id nil))
  ([binder_id string?, {:keys [source renditiontype docversion attachments export docfield Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params binder_id)
   (call-api "/objects/binders/{binder_id}/actions/export" :post
             {:path-params   {"binder_id" binder_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"source" source "renditiontype" renditiontype "docversion" docversion "attachments" attachments "export" export "docfield" docfield }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-binder-id-actions-export-post any?
  "Export Binder (Latest Version)"
  ([binder_id string?, ] (objects-binders-binder-id-actions-export-post binder_id nil))
  ([binder_id string?, optional-params any?]
   (let [res (:data (objects-binders-binder-id-actions-export-post-with-http-info binder_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-binder-id-actions-post-with-http-info any?
  "Refresh Binder Auto-Filing"
  ([binder_id string?, ] (objects-binders-binder-id-actions-post-with-http-info binder_id nil))
  ([binder_id string?, {:keys [Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params binder_id)
   (call-api "/objects/binders/{binder_id}/actions" :post
             {:path-params   {"binder_id" binder_id }
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-binder-id-actions-post any?
  "Refresh Binder Auto-Filing"
  ([binder_id string?, ] (objects-binders-binder-id-actions-post binder_id nil))
  ([binder_id string?, optional-params any?]
   (let [res (:data (objects-binders-binder-id-actions-post-with-http-info binder_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-binder-id-binding-rule-put-with-http-info any?
  "Update Binding Rule"
  ([binder_id string?, ] (objects-binders-binder-id-binding-rule-put-with-http-info binder_id nil))
  ([binder_id string?, {:keys [Content-Type Accept Authorization X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params binder_id)
   (call-api "/objects/binders/{binder_id}/binding_rule" :put
             {:path-params   {"binder_id" binder_id }
              :header-params {"Content-Type" Content-Type "Accept" Accept "Authorization" Authorization "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-binder-id-binding-rule-put any?
  "Update Binding Rule"
  ([binder_id string?, ] (objects-binders-binder-id-binding-rule-put binder_id nil))
  ([binder_id string?, optional-params any?]
   (let [res (:data (objects-binders-binder-id-binding-rule-put-with-http-info binder_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-binder-id-delete-with-http-info any?
  "Delete Binder"
  ([binder_id string?, ] (objects-binders-binder-id-delete-with-http-info binder_id nil))
  ([binder_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params binder_id)
   (call-api "/objects/binders/{binder_id}" :delete
             {:path-params   {"binder_id" binder_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-binder-id-delete any?
  "Delete Binder"
  ([binder_id string?, ] (objects-binders-binder-id-delete binder_id nil))
  ([binder_id string?, optional-params any?]
   (let [res (:data (objects-binders-binder-id-delete-with-http-info binder_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-binder-id-documents-node-id-binding-rule-put-with-http-info any?
  "Update Binder Document Binding Rule"
  ([binder_id string?, node_id string?, ] (objects-binders-binder-id-documents-node-id-binding-rule-put-with-http-info binder_id node_id nil))
  ([binder_id string?, node_id string?, {:keys [Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params binder_id node_id)
   (call-api "/objects/binders/{binder_id}/documents/{node_id}/binding_rule" :put
             {:path-params   {"binder_id" binder_id "node_id" node_id }
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-binder-id-documents-node-id-binding-rule-put any?
  "Update Binder Document Binding Rule"
  ([binder_id string?, node_id string?, ] (objects-binders-binder-id-documents-node-id-binding-rule-put binder_id node_id nil))
  ([binder_id string?, node_id string?, optional-params any?]
   (let [res (:data (objects-binders-binder-id-documents-node-id-binding-rule-put-with-http-info binder_id node_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-binder-id-documents-post-with-http-info any?
  "Add Document to Binder"
  ([binder_id string?, ] (objects-binders-binder-id-documents-post-with-http-info binder_id nil))
  ([binder_id string?, {:keys [Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params binder_id)
   (call-api "/objects/binders/{binder_id}/documents" :post
             {:path-params   {"binder_id" binder_id }
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-binder-id-documents-post any?
  "Add Document to Binder"
  ([binder_id string?, ] (objects-binders-binder-id-documents-post binder_id nil))
  ([binder_id string?, optional-params any?]
   (let [res (:data (objects-binders-binder-id-documents-post-with-http-info binder_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-binder-id-documents-section-id-delete-with-http-info any?
  "Remove Document from Binder"
  ([binder_id string?, section_id string?, ] (objects-binders-binder-id-documents-section-id-delete-with-http-info binder_id section_id nil))
  ([binder_id string?, section_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params binder_id section_id)
   (call-api "/objects/binders/{binder_id}/documents/{section_id}" :delete
             {:path-params   {"binder_id" binder_id "section_id" section_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-binder-id-documents-section-id-delete any?
  "Remove Document from Binder"
  ([binder_id string?, section_id string?, ] (objects-binders-binder-id-documents-section-id-delete binder_id section_id nil))
  ([binder_id string?, section_id string?, optional-params any?]
   (let [res (:data (objects-binders-binder-id-documents-section-id-delete-with-http-info binder_id section_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-binder-id-documents-section-id-put-with-http-info any?
  "Move Document in Binder"
  ([binder_id string?, section_id string?, ] (objects-binders-binder-id-documents-section-id-put-with-http-info binder_id section_id nil))
  ([binder_id string?, section_id string?, {:keys [Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params binder_id section_id)
   (call-api "/objects/binders/{binder_id}/documents/{section_id}" :put
             {:path-params   {"binder_id" binder_id "section_id" section_id }
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-binder-id-documents-section-id-put any?
  "Move Document in Binder"
  ([binder_id string?, section_id string?, ] (objects-binders-binder-id-documents-section-id-put binder_id section_id nil))
  ([binder_id string?, section_id string?, optional-params any?]
   (let [res (:data (objects-binders-binder-id-documents-section-id-put-with-http-info binder_id section_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-binder-id-get-with-http-info any?
  "Retrieve Binder"
  ([binder_id string?, ] (objects-binders-binder-id-get-with-http-info binder_id nil))
  ([binder_id string?, {:keys [depth Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params binder_id)
   (call-api "/objects/binders/{binder_id}" :get
             {:path-params   {"binder_id" binder_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"depth" depth }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-binder-id-get any?
  "Retrieve Binder"
  ([binder_id string?, ] (objects-binders-binder-id-get binder_id nil))
  ([binder_id string?, optional-params any?]
   (let [res (:data (objects-binders-binder-id-get-with-http-info binder_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-binder-id-post-with-http-info any?
  "Create Binder Version"
  ([binder_id string?, ] (objects-binders-binder-id-post-with-http-info binder_id nil))
  ([binder_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params binder_id)
   (call-api "/objects/binders/{binder_id}" :post
             {:path-params   {"binder_id" binder_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-binder-id-post any?
  "Create Binder Version"
  ([binder_id string?, ] (objects-binders-binder-id-post binder_id nil))
  ([binder_id string?, optional-params any?]
   (let [res (:data (objects-binders-binder-id-post-with-http-info binder_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-binder-id-put-with-http-info any?
  "Update Binder"
  ([binder_id string?, ] (objects-binders-binder-id-put-with-http-info binder_id nil))
  ([binder_id string?, {:keys [Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params binder_id)
   (call-api "/objects/binders/{binder_id}" :put
             {:path-params   {"binder_id" binder_id }
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-binder-id-put any?
  "Update Binder"
  ([binder_id string?, ] (objects-binders-binder-id-put binder_id nil))
  ([binder_id string?, optional-params any?]
   (let [res (:data (objects-binders-binder-id-put-with-http-info binder_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-binder-id-roles-role-name-and-user-or-group-id-delete-with-http-info any?
  "Remove Users & Groups from Roles on a Single Binder"
  ([binder_id string?, role_name_and_user_or_group string?, id string?, ] (objects-binders-binder-id-roles-role-name-and-user-or-group-id-delete-with-http-info binder_id role_name_and_user_or_group id nil))
  ([binder_id string?, role_name_and_user_or_group string?, id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params binder_id role_name_and_user_or_group id)
   (call-api "/objects/binders/{binder_id}/roles/{role_name_and_user_or_group}/{id}" :delete
             {:path-params   {"binder_id" binder_id "role_name_and_user_or_group" role_name_and_user_or_group "id" id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-binder-id-roles-role-name-and-user-or-group-id-delete any?
  "Remove Users & Groups from Roles on a Single Binder"
  ([binder_id string?, role_name_and_user_or_group string?, id string?, ] (objects-binders-binder-id-roles-role-name-and-user-or-group-id-delete binder_id role_name_and_user_or_group id nil))
  ([binder_id string?, role_name_and_user_or_group string?, id string?, optional-params any?]
   (let [res (:data (objects-binders-binder-id-roles-role-name-and-user-or-group-id-delete-with-http-info binder_id role_name_and_user_or_group id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-binder-id-sections-node-id-binding-rule-put-with-http-info any?
  "Update Binder Section Binding Rule"
  ([binder_id string?, node_id string?, ] (objects-binders-binder-id-sections-node-id-binding-rule-put-with-http-info binder_id node_id nil))
  ([binder_id string?, node_id string?, {:keys [Content-Type Accept Authorization X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params binder_id node_id)
   (call-api "/objects/binders/{binder_id}/sections/{node_id}/binding_rule" :put
             {:path-params   {"binder_id" binder_id "node_id" node_id }
              :header-params {"Content-Type" Content-Type "Accept" Accept "Authorization" Authorization "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-binder-id-sections-node-id-binding-rule-put any?
  "Update Binder Section Binding Rule"
  ([binder_id string?, node_id string?, ] (objects-binders-binder-id-sections-node-id-binding-rule-put binder_id node_id nil))
  ([binder_id string?, node_id string?, optional-params any?]
   (let [res (:data (objects-binders-binder-id-sections-node-id-binding-rule-put-with-http-info binder_id node_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-binder-id-sections-node-id-put-with-http-info any?
  "Update Binder Section"
  ([binder_id string?, node_id string?, ] (objects-binders-binder-id-sections-node-id-put-with-http-info binder_id node_id nil))
  ([binder_id string?, node_id string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params binder_id node_id)
   (call-api "/objects/binders/{binder_id}/sections/{node_id}" :put
             {:path-params   {"binder_id" binder_id "node_id" node_id }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-binder-id-sections-node-id-put any?
  "Update Binder Section"
  ([binder_id string?, node_id string?, ] (objects-binders-binder-id-sections-node-id-put binder_id node_id nil))
  ([binder_id string?, node_id string?, optional-params any?]
   (let [res (:data (objects-binders-binder-id-sections-node-id-put-with-http-info binder_id node_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-binder-id-sections-post-with-http-info any?
  "Create Binder Section"
  ([binder_id string?, ] (objects-binders-binder-id-sections-post-with-http-info binder_id nil))
  ([binder_id string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params binder_id)
   (call-api "/objects/binders/{binder_id}/sections" :post
             {:path-params   {"binder_id" binder_id }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-binder-id-sections-post any?
  "Create Binder Section"
  ([binder_id string?, ] (objects-binders-binder-id-sections-post binder_id nil))
  ([binder_id string?, optional-params any?]
   (let [res (:data (objects-binders-binder-id-sections-post-with-http-info binder_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-binder-id-sections-section-id-delete-with-http-info any?
  "Delete Binder Section"
  ([binder_id string?, section_id string?, ] (objects-binders-binder-id-sections-section-id-delete-with-http-info binder_id section_id nil))
  ([binder_id string?, section_id string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params binder_id section_id)
   (call-api "/objects/binders/{binder_id}/sections/{section_id}" :delete
             {:path-params   {"binder_id" binder_id "section_id" section_id }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-binder-id-sections-section-id-delete any?
  "Delete Binder Section"
  ([binder_id string?, section_id string?, ] (objects-binders-binder-id-sections-section-id-delete binder_id section_id nil))
  ([binder_id string?, section_id string?, optional-params any?]
   (let [res (:data (objects-binders-binder-id-sections-section-id-delete-with-http-info binder_id section_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-binder-id-sections-section-id-get-with-http-info any?
  "Retrieve Binder Sections"
  ([binder_id string?, section_id string?, ] (objects-binders-binder-id-sections-section-id-get-with-http-info binder_id section_id nil))
  ([binder_id string?, section_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params binder_id section_id)
   (call-api "/objects/binders/{binder_id}/sections/{section_id}" :get
             {:path-params   {"binder_id" binder_id "section_id" section_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-binder-id-sections-section-id-get any?
  "Retrieve Binder Sections"
  ([binder_id string?, section_id string?, ] (objects-binders-binder-id-sections-section-id-get binder_id section_id nil))
  ([binder_id string?, section_id string?, optional-params any?]
   (let [res (:data (objects-binders-binder-id-sections-section-id-get-with-http-info binder_id section_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-binder-id-versions-get-with-http-info any?
  "Retrieve All Binder Versions"
  ([binder_id string?, ] (objects-binders-binder-id-versions-get-with-http-info binder_id nil))
  ([binder_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params binder_id)
   (call-api "/objects/binders/{binder_id}/versions" :get
             {:path-params   {"binder_id" binder_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-binder-id-versions-get any?
  "Retrieve All Binder Versions"
  ([binder_id string?, ] (objects-binders-binder-id-versions-get binder_id nil))
  ([binder_id string?, optional-params any?]
   (let [res (:data (objects-binders-binder-id-versions-get-with-http-info binder_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-binder-id-versions-major-version-minor-version-actions-export-post-with-http-info any?
  "Export Binder (Specific Version)"
  ([binder_id string?, major_version string?, minor_version string?, ] (objects-binders-binder-id-versions-major-version-minor-version-actions-export-post-with-http-info binder_id major_version minor_version nil))
  ([binder_id string?, major_version string?, minor_version string?, {:keys [source renditiontype docversion attachments export docfield Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params binder_id major_version minor_version)
   (call-api "/objects/binders/{binder_id}/versions/{major_version}/{minor_version}/actions/export" :post
             {:path-params   {"binder_id" binder_id "major_version" major_version "minor_version" minor_version }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"source" source "renditiontype" renditiontype "docversion" docversion "attachments" attachments "export" export "docfield" docfield }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-binder-id-versions-major-version-minor-version-actions-export-post any?
  "Export Binder (Specific Version)"
  ([binder_id string?, major_version string?, minor_version string?, ] (objects-binders-binder-id-versions-major-version-minor-version-actions-export-post binder_id major_version minor_version nil))
  ([binder_id string?, major_version string?, minor_version string?, optional-params any?]
   (let [res (:data (objects-binders-binder-id-versions-major-version-minor-version-actions-export-post-with-http-info binder_id major_version minor_version optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-binder-id-versions-major-version-minor-version-delete-with-http-info any?
  "Delete Binder Version"
  ([binder_id string?, major_version string?, minor_version string?, ] (objects-binders-binder-id-versions-major-version-minor-version-delete-with-http-info binder_id major_version minor_version nil))
  ([binder_id string?, major_version string?, minor_version string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params binder_id major_version minor_version)
   (call-api "/objects/binders/{binder_id}/versions/{major_version}/{minor_version}" :delete
             {:path-params   {"binder_id" binder_id "major_version" major_version "minor_version" minor_version }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-binder-id-versions-major-version-minor-version-delete any?
  "Delete Binder Version"
  ([binder_id string?, major_version string?, minor_version string?, ] (objects-binders-binder-id-versions-major-version-minor-version-delete binder_id major_version minor_version nil))
  ([binder_id string?, major_version string?, minor_version string?, optional-params any?]
   (let [res (:data (objects-binders-binder-id-versions-major-version-minor-version-delete-with-http-info binder_id major_version minor_version optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-binder-id-versions-major-version-minor-version-get-with-http-info any?
  "Retrieve Binder Version"
  ([binder_id string?, major_version string?, minor_version string?, ] (objects-binders-binder-id-versions-major-version-minor-version-get-with-http-info binder_id major_version minor_version nil))
  ([binder_id string?, major_version string?, minor_version string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params binder_id major_version minor_version)
   (call-api "/objects/binders/{binder_id}/versions/{major_version}/{minor_version}" :get
             {:path-params   {"binder_id" binder_id "major_version" major_version "minor_version" minor_version }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-binder-id-versions-major-version-minor-version-get any?
  "Retrieve Binder Version"
  ([binder_id string?, major_version string?, minor_version string?, ] (objects-binders-binder-id-versions-major-version-minor-version-get binder_id major_version minor_version nil))
  ([binder_id string?, major_version string?, minor_version string?, optional-params any?]
   (let [res (:data (objects-binders-binder-id-versions-major-version-minor-version-get-with-http-info binder_id major_version minor_version optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-binder-id-versions-major-version-minor-version-put-with-http-info any?
  "Update Binder Version"
  ([binder_id string?, major_version string?, minor_version string?, ] (objects-binders-binder-id-versions-major-version-minor-version-put-with-http-info binder_id major_version minor_version nil))
  ([binder_id string?, major_version string?, minor_version string?, {:keys [Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params binder_id major_version minor_version)
   (call-api "/objects/binders/{binder_id}/versions/{major_version}/{minor_version}" :put
             {:path-params   {"binder_id" binder_id "major_version" major_version "minor_version" minor_version }
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-binder-id-versions-major-version-minor-version-put any?
  "Update Binder Version"
  ([binder_id string?, major_version string?, minor_version string?, ] (objects-binders-binder-id-versions-major-version-minor-version-put binder_id major_version minor_version nil))
  ([binder_id string?, major_version string?, minor_version string?, optional-params any?]
   (let [res (:data (objects-binders-binder-id-versions-major-version-minor-version-put-with-http-info binder_id major_version minor_version optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-binder-id-versions-major-version-minor-version-relationships-post-with-http-info any?
  "Create Binder Relationship"
  ([binder_id string?, major_version string?, minor_version string?, ] (objects-binders-binder-id-versions-major-version-minor-version-relationships-post-with-http-info binder_id major_version minor_version nil))
  ([binder_id string?, major_version string?, minor_version string?, {:keys [Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params binder_id major_version minor_version)
   (call-api "/objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships" :post
             {:path-params   {"binder_id" binder_id "major_version" major_version "minor_version" minor_version }
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-binder-id-versions-major-version-minor-version-relationships-post any?
  "Create Binder Relationship"
  ([binder_id string?, major_version string?, minor_version string?, ] (objects-binders-binder-id-versions-major-version-minor-version-relationships-post binder_id major_version minor_version nil))
  ([binder_id string?, major_version string?, minor_version string?, optional-params any?]
   (let [res (:data (objects-binders-binder-id-versions-major-version-minor-version-relationships-post-with-http-info binder_id major_version minor_version optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-binder-id-versions-major-version-minor-version-relationships-relationship-id-delete-with-http-info any?
  "Delete Binder Relationship"
  ([binder_id string?, major_version string?, minor_version string?, relationship_id string?, ] (objects-binders-binder-id-versions-major-version-minor-version-relationships-relationship-id-delete-with-http-info binder_id major_version minor_version relationship_id nil))
  ([binder_id string?, major_version string?, minor_version string?, relationship_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params binder_id major_version minor_version relationship_id)
   (call-api "/objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id}" :delete
             {:path-params   {"binder_id" binder_id "major_version" major_version "minor_version" minor_version "relationship_id" relationship_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-binder-id-versions-major-version-minor-version-relationships-relationship-id-delete any?
  "Delete Binder Relationship"
  ([binder_id string?, major_version string?, minor_version string?, relationship_id string?, ] (objects-binders-binder-id-versions-major-version-minor-version-relationships-relationship-id-delete binder_id major_version minor_version relationship_id nil))
  ([binder_id string?, major_version string?, minor_version string?, relationship_id string?, optional-params any?]
   (let [res (:data (objects-binders-binder-id-versions-major-version-minor-version-relationships-relationship-id-delete-with-http-info binder_id major_version minor_version relationship_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-binder-id-versions-major-version-minor-version-relationships-relationship-id-get-with-http-info any?
  "Retrieve Binder Relationship"
  ([binder_id string?, major_version string?, minor_version string?, relationship_id string?, ] (objects-binders-binder-id-versions-major-version-minor-version-relationships-relationship-id-get-with-http-info binder_id major_version minor_version relationship_id nil))
  ([binder_id string?, major_version string?, minor_version string?, relationship_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params binder_id major_version minor_version relationship_id)
   (call-api "/objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id}" :get
             {:path-params   {"binder_id" binder_id "major_version" major_version "minor_version" minor_version "relationship_id" relationship_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-binder-id-versions-major-version-minor-version-relationships-relationship-id-get any?
  "Retrieve Binder Relationship"
  ([binder_id string?, major_version string?, minor_version string?, relationship_id string?, ] (objects-binders-binder-id-versions-major-version-minor-version-relationships-relationship-id-get binder_id major_version minor_version relationship_id nil))
  ([binder_id string?, major_version string?, minor_version string?, relationship_id string?, optional-params any?]
   (let [res (:data (objects-binders-binder-id-versions-major-version-minor-version-relationships-relationship-id-get-with-http-info binder_id major_version minor_version relationship_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-binder-id-versions-major-version-minor-version-sections-section-id-get-with-http-info any?
  "Retrieve Binder Version Section"
  ([binder_id string?, major_version string?, minor_version string?, section_id string?, ] (objects-binders-binder-id-versions-major-version-minor-version-sections-section-id-get-with-http-info binder_id major_version minor_version section_id nil))
  ([binder_id string?, major_version string?, minor_version string?, section_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params binder_id major_version minor_version section_id)
   (call-api "/objects/binders/{binder_id}/versions/{major_version}/{minor_version}/sections/{section_id}" :get
             {:path-params   {"binder_id" binder_id "major_version" major_version "minor_version" minor_version "section_id" section_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-binder-id-versions-major-version-minor-version-sections-section-id-get any?
  "Retrieve Binder Version Section"
  ([binder_id string?, major_version string?, minor_version string?, section_id string?, ] (objects-binders-binder-id-versions-major-version-minor-version-sections-section-id-get binder_id major_version minor_version section_id nil))
  ([binder_id string?, major_version string?, minor_version string?, section_id string?, optional-params any?]
   (let [res (:data (objects-binders-binder-id-versions-major-version-minor-version-sections-section-id-get-with-http-info binder_id major_version minor_version section_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-id-roles-get-with-http-info any?
  "Retrieve All Binder Roles"
  ([id string?, ] (objects-binders-id-roles-get-with-http-info id nil))
  ([id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params id)
   (call-api "/objects/binders/{id}/roles" :get
             {:path-params   {"id" id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-id-roles-get any?
  "Retrieve All Binder Roles"
  ([id string?, ] (objects-binders-id-roles-get id nil))
  ([id string?, optional-params any?]
   (let [res (:data (objects-binders-id-roles-get-with-http-info id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-id-roles-post-with-http-info any?
  "Assign Users & Groups to Roles on a Single Binder"
  ([id string?, ] (objects-binders-id-roles-post-with-http-info id nil))
  ([id string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params id)
   (call-api "/objects/binders/{id}/roles" :post
             {:path-params   {"id" id }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-id-roles-post any?
  "Assign Users & Groups to Roles on a Single Binder"
  ([id string?, ] (objects-binders-id-roles-post id nil))
  ([id string?, optional-params any?]
   (let [res (:data (objects-binders-id-roles-post-with-http-info id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-id-roles-role-name-get-with-http-info any?
  "Retrieve Document Role"
  ([id string?, role_name string?, ] (objects-binders-id-roles-role-name-get-with-http-info id role_name nil))
  ([id string?, role_name string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params id role_name)
   (call-api "/objects/binders/{id}/roles/{role_name}" :get
             {:path-params   {"id" id "role_name" role_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-id-roles-role-name-get any?
  "Retrieve Document Role"
  ([id string?, role_name string?, ] (objects-binders-id-roles-role-name-get id role_name nil))
  ([id string?, role_name string?, optional-params any?]
   (let [res (:data (objects-binders-id-roles-role-name-get-with-http-info id role_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-id-versions-major-version-minor-version-lifecycle-actions-get-with-http-info any?
  "Retrieve Binder User Actions"
  ([id string?, major_version string?, minor_version string?, ] (objects-binders-id-versions-major-version-minor-version-lifecycle-actions-get-with-http-info id major_version minor_version nil))
  ([id string?, major_version string?, minor_version string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params id major_version minor_version)
   (call-api "/objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions" :get
             {:path-params   {"id" id "major_version" major_version "minor_version" minor_version }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-id-versions-major-version-minor-version-lifecycle-actions-get any?
  "Retrieve Binder User Actions"
  ([id string?, major_version string?, minor_version string?, ] (objects-binders-id-versions-major-version-minor-version-lifecycle-actions-get id major_version minor_version nil))
  ([id string?, major_version string?, minor_version string?, optional-params any?]
   (let [res (:data (objects-binders-id-versions-major-version-minor-version-lifecycle-actions-get-with-http-info id major_version minor_version optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-id-versions-major-version-minor-version-lifecycle-actions-name-v-entry-requirements-get-with-http-info any?
  "Retrieve Binder Entry Criteria"
  ([id string?, major_version string?, minor_version string?, name__v string?, ] (objects-binders-id-versions-major-version-minor-version-lifecycle-actions-name-v-entry-requirements-get-with-http-info id major_version minor_version name__v nil))
  ([id string?, major_version string?, minor_version string?, name__v string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params id major_version minor_version name__v)
   (call-api "/objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}/entry_requirements" :get
             {:path-params   {"id" id "major_version" major_version "minor_version" minor_version "name__v" name__v }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-id-versions-major-version-minor-version-lifecycle-actions-name-v-entry-requirements-get any?
  "Retrieve Binder Entry Criteria"
  ([id string?, major_version string?, minor_version string?, name__v string?, ] (objects-binders-id-versions-major-version-minor-version-lifecycle-actions-name-v-entry-requirements-get id major_version minor_version name__v nil))
  ([id string?, major_version string?, minor_version string?, name__v string?, optional-params any?]
   (let [res (:data (objects-binders-id-versions-major-version-minor-version-lifecycle-actions-name-v-entry-requirements-get-with-http-info id major_version minor_version name__v optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-id-versions-major-version-minor-version-lifecycle-actions-name-v-put-with-http-info any?
  "Initiate Binder User Action"
  ([id string?, major_version string?, minor_version string?, name__v string?, ] (objects-binders-id-versions-major-version-minor-version-lifecycle-actions-name-v-put-with-http-info id major_version minor_version name__v nil))
  ([id string?, major_version string?, minor_version string?, name__v string?, {:keys [Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params id major_version minor_version name__v)
   (call-api "/objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}" :put
             {:path-params   {"id" id "major_version" major_version "minor_version" minor_version "name__v" name__v }
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-id-versions-major-version-minor-version-lifecycle-actions-name-v-put any?
  "Initiate Binder User Action"
  ([id string?, major_version string?, minor_version string?, name__v string?, ] (objects-binders-id-versions-major-version-minor-version-lifecycle-actions-name-v-put id major_version minor_version name__v nil))
  ([id string?, major_version string?, minor_version string?, name__v string?, optional-params any?]
   (let [res (:data (objects-binders-id-versions-major-version-minor-version-lifecycle-actions-name-v-put-with-http-info id major_version minor_version name__v optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-lifecycle-actions-post-with-http-info any?
  "Retrieve User Actions on Multiple Binders"
  ([] (objects-binders-lifecycle-actions-post-with-http-info nil))
  ([{:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/binders/lifecycle_actions" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-lifecycle-actions-post any?
  "Retrieve User Actions on Multiple Binders"
  ([] (objects-binders-lifecycle-actions-post nil))
  ([optional-params any?]
   (let [res (:data (objects-binders-lifecycle-actions-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-lifecycle-actions-user-action-name-put-with-http-info any?
  "Initiate Bulk Binder User Actions"
  ([user_action_name string?, ] (objects-binders-lifecycle-actions-user-action-name-put-with-http-info user_action_name nil))
  ([user_action_name string?, {:keys [Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params user_action_name)
   (call-api "/objects/binders/lifecycle_actions/{user_action_name}" :put
             {:path-params   {"user_action_name" user_action_name }
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-lifecycle-actions-user-action-name-put any?
  "Initiate Bulk Binder User Actions"
  ([user_action_name string?, ] (objects-binders-lifecycle-actions-user-action-name-put user_action_name nil))
  ([user_action_name string?, optional-params any?]
   (let [res (:data (objects-binders-lifecycle-actions-user-action-name-put-with-http-info user_action_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-post-with-http-info any?
  "Create Binder"
  ([] (objects-binders-post-with-http-info nil))
  ([{:keys [async Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/binders" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"async" async }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-post any?
  "Create Binder"
  ([] (objects-binders-post nil))
  ([optional-params any?]
   (let [res (:data (objects-binders-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-templates-get-with-http-info any?
  "Retrieve Binder Template Collection"
  ([] (objects-binders-templates-get-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/binders/templates" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-templates-get any?
  "Retrieve Binder Template Collection"
  ([] (objects-binders-templates-get nil))
  ([optional-params any?]
   (let [res (:data (objects-binders-templates-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-templates-post-with-http-info any?
  "Create Binder Template"
  ([] (objects-binders-templates-post-with-http-info nil))
  ([{:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/binders/templates" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-templates-post any?
  "Create Binder Template"
  ([] (objects-binders-templates-post nil))
  ([optional-params any?]
   (let [res (:data (objects-binders-templates-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-templates-put-with-http-info any?
  "Update Binder Template"
  ([] (objects-binders-templates-put-with-http-info nil))
  ([{:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/binders/templates" :put
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-templates-put any?
  "Update Binder Template"
  ([] (objects-binders-templates-put nil))
  ([optional-params any?]
   (let [res (:data (objects-binders-templates-put-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-templates-template-name-bindernodes-get-with-http-info any?
  "Retrieve Binder Template Node Attributes"
  ([template_name string?, ] (objects-binders-templates-template-name-bindernodes-get-with-http-info template_name nil))
  ([template_name string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params template_name)
   (call-api "/objects/binders/templates/{template_name}/bindernodes" :get
             {:path-params   {"template_name" template_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-templates-template-name-bindernodes-get any?
  "Retrieve Binder Template Node Attributes"
  ([template_name string?, ] (objects-binders-templates-template-name-bindernodes-get template_name nil))
  ([template_name string?, optional-params any?]
   (let [res (:data (objects-binders-templates-template-name-bindernodes-get-with-http-info template_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-templates-template-name-bindernodes-post-with-http-info any?
  "Create Binder Template Node"
  ([template_name string?, ] (objects-binders-templates-template-name-bindernodes-post-with-http-info template_name nil))
  ([template_name string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params template_name)
   (call-api "/objects/binders/templates/{template_name}/bindernodes" :post
             {:path-params   {"template_name" template_name }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-templates-template-name-bindernodes-post any?
  "Create Binder Template Node"
  ([template_name string?, ] (objects-binders-templates-template-name-bindernodes-post template_name nil))
  ([template_name string?, optional-params any?]
   (let [res (:data (objects-binders-templates-template-name-bindernodes-post-with-http-info template_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-templates-template-name-bindernodes-put-with-http-info any?
  "Replace Binder Template Nodes"
  ([template_name string?, ] (objects-binders-templates-template-name-bindernodes-put-with-http-info template_name nil))
  ([template_name string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params template_name)
   (call-api "/objects/binders/templates/{template_name}/bindernodes" :put
             {:path-params   {"template_name" template_name }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-templates-template-name-bindernodes-put any?
  "Replace Binder Template Nodes"
  ([template_name string?, ] (objects-binders-templates-template-name-bindernodes-put template_name nil))
  ([template_name string?, optional-params any?]
   (let [res (:data (objects-binders-templates-template-name-bindernodes-put-with-http-info template_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-templates-template-name-delete-with-http-info any?
  "Delete Binder Template"
  ([template_name string?, ] (objects-binders-templates-template-name-delete-with-http-info template_name nil))
  ([template_name string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params template_name)
   (call-api "/objects/binders/templates/{template_name}" :delete
             {:path-params   {"template_name" template_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-templates-template-name-delete any?
  "Delete Binder Template"
  ([template_name string?, ] (objects-binders-templates-template-name-delete template_name nil))
  ([template_name string?, optional-params any?]
   (let [res (:data (objects-binders-templates-template-name-delete-with-http-info template_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-binders-templates-template-name-get-with-http-info any?
  "Retrieve Binder Template Attributes"
  ([template_name string?, ] (objects-binders-templates-template-name-get-with-http-info template_name nil))
  ([template_name string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params template_name)
   (call-api "/objects/binders/templates/{template_name}" :get
             {:path-params   {"template_name" template_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-binders-templates-template-name-get any?
  "Retrieve Binder Template Attributes"
  ([template_name string?, ] (objects-binders-templates-template-name-get template_name nil))
  ([template_name string?, optional-params any?]
   (let [res (:data (objects-binders-templates-template-name-get-with-http-info template_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-deletions-documents-get-with-http-info any?
  "Retrieve Deleted Document IDs"
  ([] (objects-deletions-documents-get-with-http-info nil))
  ([{:keys [start_date end_date Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/deletions/documents" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"start_date" start_date "end_date" end_date }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-deletions-documents-get any?
  "Retrieve Deleted Document IDs"
  ([] (objects-deletions-documents-get nil))
  ([optional-params any?]
   (let [res (:data (objects-deletions-documents-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-deletions-vobjects-object-name-get-with-http-info any?
  "Retrieve Deleted Object Record ID"
  ([object_name string?, ] (objects-deletions-vobjects-object-name-get-with-http-info object_name nil))
  ([object_name string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name)
   (call-api "/objects/deletions/vobjects/{object_name}" :get
             {:path-params   {"object_name" object_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-deletions-vobjects-object-name-get any?
  "Retrieve Deleted Object Record ID"
  ([object_name string?, ] (objects-deletions-vobjects-object-name-get object_name nil))
  ([object_name string?, optional-params any?]
   (let [res (:data (objects-deletions-vobjects-object-name-get-with-http-info object_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-actions-get-with-http-info any?
  "Retrieve All Document Workflows"
  ([] (objects-documents-actions-get-with-http-info nil))
  ([{:keys [loc Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/documents/actions" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"loc" loc }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-actions-get any?
  "Retrieve All Document Workflows"
  ([] (objects-documents-actions-get nil))
  ([optional-params any?]
   (let [res (:data (objects-documents-actions-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-actions-lifecycle-and-state-and-action-job-id-results-get-with-http-info any?
  "Download Controlled Copy Job Results"
  ([lifecycle_and_state_and_action string?, job_id string?, ] (objects-documents-actions-lifecycle-and-state-and-action-job-id-results-get-with-http-info lifecycle_and_state_and_action job_id nil))
  ([lifecycle_and_state_and_action string?, job_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params lifecycle_and_state_and_action job_id)
   (call-api "/objects/documents/actions/{lifecycle_and_state_and_action}/{job_id}/results" :get
             {:path-params   {"lifecycle_and_state_and_action" lifecycle_and_state_and_action "job_id" job_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-actions-lifecycle-and-state-and-action-job-id-results-get any?
  "Download Controlled Copy Job Results"
  ([lifecycle_and_state_and_action string?, job_id string?, ] (objects-documents-actions-lifecycle-and-state-and-action-job-id-results-get lifecycle_and_state_and_action job_id nil))
  ([lifecycle_and_state_and_action string?, job_id string?, optional-params any?]
   (let [res (:data (objects-documents-actions-lifecycle-and-state-and-action-job-id-results-get-with-http-info lifecycle_and_state_and_action job_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-actions-workflow-name-get-with-http-info any?
  "Retrieve Document Workflow Details"
  ([workflow_name string?, ] (objects-documents-actions-workflow-name-get-with-http-info workflow_name nil))
  ([workflow_name string?, {:keys [loc Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params workflow_name)
   (call-api "/objects/documents/actions/{workflow_name}" :get
             {:path-params   {"workflow_name" workflow_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"loc" loc }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-actions-workflow-name-get any?
  "Retrieve Document Workflow Details"
  ([workflow_name string?, ] (objects-documents-actions-workflow-name-get workflow_name nil))
  ([workflow_name string?, optional-params any?]
   (let [res (:data (objects-documents-actions-workflow-name-get-with-http-info workflow_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-actions-workflow-name-post-with-http-info any?
  "Initiate Document Workflow"
  ([workflow_name string?, ] (objects-documents-actions-workflow-name-post-with-http-info workflow_name nil))
  ([workflow_name string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params workflow_name)
   (call-api "/objects/documents/actions/{workflow_name}" :post
             {:path-params   {"workflow_name" workflow_name }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-actions-workflow-name-post any?
  "Initiate Document Workflow"
  ([workflow_name string?, ] (objects-documents-actions-workflow-name-post workflow_name nil))
  ([workflow_name string?, optional-params any?]
   (let [res (:data (objects-documents-actions-workflow-name-post-with-http-info workflow_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-annotations-batch-delete-with-http-info any?
  "Delete Annotations"
  ([] (objects-documents-annotations-batch-delete-with-http-info nil))
  ([{:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/documents/annotations/batch" :delete
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-annotations-batch-delete any?
  "Delete Annotations"
  ([] (objects-documents-annotations-batch-delete nil))
  ([optional-params any?]
   (let [res (:data (objects-documents-annotations-batch-delete-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-annotations-batch-post-with-http-info any?
  "Create Multiple Annotations"
  [Authorization string?, Content-Type string?, Accept string?, X-VaultAPI-ClientID string?]
  (check-required-params Authorization Content-Type Accept X-VaultAPI-ClientID)
  (call-api "/objects/documents/annotations/batch" :post
            {:path-params   {}
             :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    []}))

(defn-spec objects-documents-annotations-batch-post any?
  "Create Multiple Annotations"
  [Authorization string?, Content-Type string?, Accept string?, X-VaultAPI-ClientID string?]
  (let [res (:data (objects-documents-annotations-batch-post-with-http-info Authorization Content-Type Accept X-VaultAPI-ClientID))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec objects-documents-annotations-batch-put-with-http-info any?
  "Update Annotations"
  ([] (objects-documents-annotations-batch-put-with-http-info nil))
  ([{:keys [Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/documents/annotations/batch" :put
             {:path-params   {}
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-annotations-batch-put any?
  "Update Annotations"
  ([] (objects-documents-annotations-batch-put nil))
  ([optional-params any?]
   (let [res (:data (objects-documents-annotations-batch-put-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-annotations-replies-batch-post-with-http-info any?
  "Add Annotation Replies"
  ([] (objects-documents-annotations-replies-batch-post-with-http-info nil))
  ([{:keys [Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/documents/annotations/replies/batch" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-annotations-replies-batch-post any?
  "Add Annotation Replies"
  ([] (objects-documents-annotations-replies-batch-post nil))
  ([optional-params any?]
   (let [res (:data (objects-documents-annotations-replies-batch-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-attachments-batch-delete-with-http-info any?
  "Delete Multiple Document Attachments"
  ([] (objects-documents-attachments-batch-delete-with-http-info nil))
  ([{:keys [Accept Authorization Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/documents/attachments/batch" :delete
             {:path-params   {}
              :header-params {"Accept" Accept "Authorization" Authorization "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-attachments-batch-delete any?
  "Delete Multiple Document Attachments"
  ([] (objects-documents-attachments-batch-delete nil))
  ([optional-params any?]
   (let [res (:data (objects-documents-attachments-batch-delete-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-attachments-batch-post-with-http-info any?
  "Create Multiple Document Attachments"
  ([] (objects-documents-attachments-batch-post-with-http-info nil))
  ([{:keys [Accept Authorization Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/documents/attachments/batch" :post
             {:path-params   {}
              :header-params {"Accept" Accept "Authorization" Authorization "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-attachments-batch-post any?
  "Create Multiple Document Attachments"
  ([] (objects-documents-attachments-batch-post nil))
  ([optional-params any?]
   (let [res (:data (objects-documents-attachments-batch-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-attachments-batch-put-with-http-info any?
  "Update Multiple Document Attachment Descriptions"
  ([] (objects-documents-attachments-batch-put-with-http-info nil))
  ([{:keys [Accept Authorization Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/documents/attachments/batch" :put
             {:path-params   {}
              :header-params {"Accept" Accept "Authorization" Authorization "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-attachments-batch-put any?
  "Update Multiple Document Attachment Descriptions"
  ([] (objects-documents-attachments-batch-put nil))
  ([optional-params any?]
   (let [res (:data (objects-documents-attachments-batch-put-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-batch-actions-fileextract-job-id-results-get-with-http-info any?
  "Retrieve Document Export Results"
  ([job_id string?, ] (objects-documents-batch-actions-fileextract-job-id-results-get-with-http-info job_id nil))
  ([job_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params job_id)
   (call-api "/objects/documents/batch/actions/fileextract/{job_id}/results" :get
             {:path-params   {"job_id" job_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-batch-actions-fileextract-job-id-results-get any?
  "Retrieve Document Export Results"
  ([job_id string?, ] (objects-documents-batch-actions-fileextract-job-id-results-get job_id nil))
  ([job_id string?, optional-params any?]
   (let [res (:data (objects-documents-batch-actions-fileextract-job-id-results-get-with-http-info job_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-batch-actions-fileextract-post-with-http-info any?
  "Export Documents"
  ([] (objects-documents-batch-actions-fileextract-post-with-http-info nil))
  ([{:keys [source renditions allversions Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/documents/batch/actions/fileextract" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"source" source "renditions" renditions "allversions" allversions }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-batch-actions-fileextract-post any?
  "Export Documents"
  ([] (objects-documents-batch-actions-fileextract-post nil))
  ([optional-params any?]
   (let [res (:data (objects-documents-batch-actions-fileextract-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-batch-actions-reclassify-put-with-http-info any?
  "Reclassify Multiple Documents"
  ([] (objects-documents-batch-actions-reclassify-put-with-http-info nil))
  ([{:keys [Authorization Content-Type Accept X-VaultAPI-MigrationMode X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/documents/batch/actions/reclassify" :put
             {:path-params   {}
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-MigrationMode" X-VaultAPI-MigrationMode "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-batch-actions-reclassify-put any?
  "Reclassify Multiple Documents"
  ([] (objects-documents-batch-actions-reclassify-put nil))
  ([optional-params any?]
   (let [res (:data (objects-documents-batch-actions-reclassify-put-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-batch-actions-rerender-post-with-http-info any?
  "Update Multiple Document Renditions"
  ([] (objects-documents-batch-actions-rerender-post-with-http-info nil))
  ([{:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/documents/batch/actions/rerender" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-batch-actions-rerender-post any?
  "Update Multiple Document Renditions"
  ([] (objects-documents-batch-actions-rerender-post nil))
  ([optional-params any?]
   (let [res (:data (objects-documents-batch-actions-rerender-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-batch-delete-with-http-info any?
  "Delete Multiple Documents"
  ([] (objects-documents-batch-delete-with-http-info nil))
  ([{:keys [idParam Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/documents/batch" :delete
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"idParam" idParam }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-batch-delete any?
  "Delete Multiple Documents"
  ([] (objects-documents-batch-delete nil))
  ([optional-params any?]
   (let [res (:data (objects-documents-batch-delete-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-batch-lock-delete-with-http-info any?
  "Undo Collaborative Authoring Checkout"
  ([] (objects-documents-batch-lock-delete-with-http-info nil))
  ([{:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/documents/batch/lock" :delete
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-batch-lock-delete any?
  "Undo Collaborative Authoring Checkout"
  ([] (objects-documents-batch-lock-delete nil))
  ([optional-params any?]
   (let [res (:data (objects-documents-batch-lock-delete-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-batch-post-with-http-info any?
  "Create Multiple Documents"
  ([] (objects-documents-batch-post-with-http-info nil))
  ([{:keys [Authorization Accept Content-Type X-VaultAPI-MigrationMode X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/documents/batch" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-MigrationMode" X-VaultAPI-MigrationMode "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-batch-post any?
  "Create Multiple Documents"
  ([] (objects-documents-batch-post nil))
  ([optional-params any?]
   (let [res (:data (objects-documents-batch-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-batch-put-with-http-info any?
  "Update Multiple Documents"
  ([] (objects-documents-batch-put-with-http-info nil))
  ([{:keys [Authorization Accept Content-Type X-VaultAPI-MigrationMode X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/documents/batch" :put
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-MigrationMode" X-VaultAPI-MigrationMode "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-batch-put any?
  "Update Multiple Documents"
  ([] (objects-documents-batch-put nil))
  ([optional-params any?]
   (let [res (:data (objects-documents-batch-put-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-anchors-get-with-http-info any?
  "Retrieve Anchor IDs"
  ([doc_id string?, ] (objects-documents-doc-id-anchors-get-with-http-info doc_id nil))
  ([doc_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id)
   (call-api "/objects/documents/{doc_id}/anchors" :get
             {:path-params   {"doc_id" doc_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-anchors-get any?
  "Retrieve Anchor IDs"
  ([doc_id string?, ] (objects-documents-doc-id-anchors-get doc_id nil))
  ([doc_id string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-anchors-get-with-http-info doc_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-annotations-file-get-with-http-info any?
  "Export Document Annotations to PDF"
  ([doc_id string?, ] (objects-documents-doc-id-annotations-file-get-with-http-info doc_id nil))
  ([doc_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id)
   (call-api "/objects/documents/{doc_id}/annotations/file" :get
             {:path-params   {"doc_id" doc_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-annotations-file-get any?
  "Export Document Annotations to PDF"
  ([doc_id string?, ] (objects-documents-doc-id-annotations-file-get doc_id nil))
  ([doc_id string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-annotations-file-get-with-http-info doc_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-annotations-file-post-with-http-info any?
  "Import Document Annotations from PDF"
  ([doc_id string?, ] (objects-documents-doc-id-annotations-file-post-with-http-info doc_id nil))
  ([doc_id string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id)
   (call-api "/objects/documents/{doc_id}/annotations/file" :post
             {:path-params   {"doc_id" doc_id }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-annotations-file-post any?
  "Import Document Annotations from PDF"
  ([doc_id string?, ] (objects-documents-doc-id-annotations-file-post doc_id nil))
  ([doc_id string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-annotations-file-post-with-http-info doc_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-attachments-attachment-id-delete-with-http-info any?
  "Delete Single Document Attachment"
  ([doc_id string?, attachment_id string?, ] (objects-documents-doc-id-attachments-attachment-id-delete-with-http-info doc_id attachment_id nil))
  ([doc_id string?, attachment_id string?, {:keys [Accept Authorization X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id attachment_id)
   (call-api "/objects/documents/{doc_id}/attachments/{attachment_id}" :delete
             {:path-params   {"doc_id" doc_id "attachment_id" attachment_id }
              :header-params {"Accept" Accept "Authorization" Authorization "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-attachments-attachment-id-delete any?
  "Delete Single Document Attachment"
  ([doc_id string?, attachment_id string?, ] (objects-documents-doc-id-attachments-attachment-id-delete doc_id attachment_id nil))
  ([doc_id string?, attachment_id string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-attachments-attachment-id-delete-with-http-info doc_id attachment_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-attachments-attachment-id-file-get-with-http-info any?
  "Download Document Attachment"
  ([doc_id string?, attachment_id string?, ] (objects-documents-doc-id-attachments-attachment-id-file-get-with-http-info doc_id attachment_id nil))
  ([doc_id string?, attachment_id string?, {:keys [Accept Authorization X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id attachment_id)
   (call-api "/objects/documents/{doc_id}/attachments/{attachment_id}/file" :get
             {:path-params   {"doc_id" doc_id "attachment_id" attachment_id }
              :header-params {"Accept" Accept "Authorization" Authorization "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-attachments-attachment-id-file-get any?
  "Download Document Attachment"
  ([doc_id string?, attachment_id string?, ] (objects-documents-doc-id-attachments-attachment-id-file-get doc_id attachment_id nil))
  ([doc_id string?, attachment_id string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-attachments-attachment-id-file-get-with-http-info doc_id attachment_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-attachments-attachment-id-get-with-http-info any?
  "Retrieve Document Attachment Metadata"
  ([doc_id string?, attachment_id string?, ] (objects-documents-doc-id-attachments-attachment-id-get-with-http-info doc_id attachment_id nil))
  ([doc_id string?, attachment_id string?, {:keys [Accept Authorization X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id attachment_id)
   (call-api "/objects/documents/{doc_id}/attachments/{attachment_id}" :get
             {:path-params   {"doc_id" doc_id "attachment_id" attachment_id }
              :header-params {"Accept" Accept "Authorization" Authorization "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-attachments-attachment-id-get any?
  "Retrieve Document Attachment Metadata"
  ([doc_id string?, attachment_id string?, ] (objects-documents-doc-id-attachments-attachment-id-get doc_id attachment_id nil))
  ([doc_id string?, attachment_id string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-attachments-attachment-id-get-with-http-info doc_id attachment_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-attachments-attachment-id-put-with-http-info any?
  "Update Document Attachment Description"
  ([doc_id string?, attachment_id string?, ] (objects-documents-doc-id-attachments-attachment-id-put-with-http-info doc_id attachment_id nil))
  ([doc_id string?, attachment_id string?, {:keys [Accept Authorization Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id attachment_id)
   (call-api "/objects/documents/{doc_id}/attachments/{attachment_id}" :put
             {:path-params   {"doc_id" doc_id "attachment_id" attachment_id }
              :header-params {"Accept" Accept "Authorization" Authorization "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-attachments-attachment-id-put any?
  "Update Document Attachment Description"
  ([doc_id string?, attachment_id string?, ] (objects-documents-doc-id-attachments-attachment-id-put doc_id attachment_id nil))
  ([doc_id string?, attachment_id string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-attachments-attachment-id-put-with-http-info doc_id attachment_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-attachments-attachment-id-versions-attachment-version-delete-with-http-info any?
  "Delete Single Document Attachment Version"
  ([doc_id string?, attachment_id string?, attachment_version string?, ] (objects-documents-doc-id-attachments-attachment-id-versions-attachment-version-delete-with-http-info doc_id attachment_id attachment_version nil))
  ([doc_id string?, attachment_id string?, attachment_version string?, {:keys [Accept Authorization X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id attachment_id attachment_version)
   (call-api "/objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}" :delete
             {:path-params   {"doc_id" doc_id "attachment_id" attachment_id "attachment_version" attachment_version }
              :header-params {"Accept" Accept "Authorization" Authorization "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-attachments-attachment-id-versions-attachment-version-delete any?
  "Delete Single Document Attachment Version"
  ([doc_id string?, attachment_id string?, attachment_version string?, ] (objects-documents-doc-id-attachments-attachment-id-versions-attachment-version-delete doc_id attachment_id attachment_version nil))
  ([doc_id string?, attachment_id string?, attachment_version string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-attachments-attachment-id-versions-attachment-version-delete-with-http-info doc_id attachment_id attachment_version optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-attachments-attachment-id-versions-attachment-version-file-get-with-http-info any?
  "Download Document Attachment Version"
  ([doc_id string?, attachment_id string?, attachment_version string?, ] (objects-documents-doc-id-attachments-attachment-id-versions-attachment-version-file-get-with-http-info doc_id attachment_id attachment_version nil))
  ([doc_id string?, attachment_id string?, attachment_version string?, {:keys [Accept Authorization X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id attachment_id attachment_version)
   (call-api "/objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}/file" :get
             {:path-params   {"doc_id" doc_id "attachment_id" attachment_id "attachment_version" attachment_version }
              :header-params {"Accept" Accept "Authorization" Authorization "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-attachments-attachment-id-versions-attachment-version-file-get any?
  "Download Document Attachment Version"
  ([doc_id string?, attachment_id string?, attachment_version string?, ] (objects-documents-doc-id-attachments-attachment-id-versions-attachment-version-file-get doc_id attachment_id attachment_version nil))
  ([doc_id string?, attachment_id string?, attachment_version string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-attachments-attachment-id-versions-attachment-version-file-get-with-http-info doc_id attachment_id attachment_version optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-attachments-attachment-id-versions-attachment-version-get-with-http-info any?
  "Retrieve Document Attachment Version Metadata"
  ([doc_id string?, attachment_id string?, attachment_version string?, ] (objects-documents-doc-id-attachments-attachment-id-versions-attachment-version-get-with-http-info doc_id attachment_id attachment_version nil))
  ([doc_id string?, attachment_id string?, attachment_version string?, {:keys [Accept Authorization X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id attachment_id attachment_version)
   (call-api "/objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}" :get
             {:path-params   {"doc_id" doc_id "attachment_id" attachment_id "attachment_version" attachment_version }
              :header-params {"Accept" Accept "Authorization" Authorization "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-attachments-attachment-id-versions-attachment-version-get any?
  "Retrieve Document Attachment Version Metadata"
  ([doc_id string?, attachment_id string?, attachment_version string?, ] (objects-documents-doc-id-attachments-attachment-id-versions-attachment-version-get doc_id attachment_id attachment_version nil))
  ([doc_id string?, attachment_id string?, attachment_version string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-attachments-attachment-id-versions-attachment-version-get-with-http-info doc_id attachment_id attachment_version optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-attachments-attachment-id-versions-attachment-version-post-with-http-info any?
  "Restore Document Attachment Version"
  ([doc_id string?, attachment_id string?, attachment_version string?, ] (objects-documents-doc-id-attachments-attachment-id-versions-attachment-version-post-with-http-info doc_id attachment_id attachment_version nil))
  ([doc_id string?, attachment_id string?, attachment_version string?, {:keys [restore Accept Authorization X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id attachment_id attachment_version)
   (call-api "/objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}" :post
             {:path-params   {"doc_id" doc_id "attachment_id" attachment_id "attachment_version" attachment_version }
              :header-params {"Accept" Accept "Authorization" Authorization "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"restore" restore }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-attachments-attachment-id-versions-attachment-version-post any?
  "Restore Document Attachment Version"
  ([doc_id string?, attachment_id string?, attachment_version string?, ] (objects-documents-doc-id-attachments-attachment-id-versions-attachment-version-post doc_id attachment_id attachment_version nil))
  ([doc_id string?, attachment_id string?, attachment_version string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-attachments-attachment-id-versions-attachment-version-post-with-http-info doc_id attachment_id attachment_version optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-attachments-attachment-id-versions-get-with-http-info any?
  "Retrieve Document Attachment Versions"
  ([doc_id string?, attachment_id string?, ] (objects-documents-doc-id-attachments-attachment-id-versions-get-with-http-info doc_id attachment_id nil))
  ([doc_id string?, attachment_id string?, {:keys [Accept Authorization X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id attachment_id)
   (call-api "/objects/documents/{doc_id}/attachments/{attachment_id}/versions" :get
             {:path-params   {"doc_id" doc_id "attachment_id" attachment_id }
              :header-params {"Accept" Accept "Authorization" Authorization "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-attachments-attachment-id-versions-get any?
  "Retrieve Document Attachment Versions"
  ([doc_id string?, attachment_id string?, ] (objects-documents-doc-id-attachments-attachment-id-versions-get doc_id attachment_id nil))
  ([doc_id string?, attachment_id string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-attachments-attachment-id-versions-get-with-http-info doc_id attachment_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-attachments-file-get-with-http-info any?
  "Download All Document Attachments"
  ([doc_id string?, ] (objects-documents-doc-id-attachments-file-get-with-http-info doc_id nil))
  ([doc_id string?, {:keys [Accept Authorization X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id)
   (call-api "/objects/documents/{doc_id}/attachments/file" :get
             {:path-params   {"doc_id" doc_id }
              :header-params {"Accept" Accept "Authorization" Authorization "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-attachments-file-get any?
  "Download All Document Attachments"
  ([doc_id string?, ] (objects-documents-doc-id-attachments-file-get doc_id nil))
  ([doc_id string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-attachments-file-get-with-http-info doc_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-attachments-get-with-http-info any?
  "Retrieve Document Attachments"
  ([doc_id string?, ] (objects-documents-doc-id-attachments-get-with-http-info doc_id nil))
  ([doc_id string?, {:keys [Accept Authorization X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id)
   (call-api "/objects/documents/{doc_id}/attachments" :get
             {:path-params   {"doc_id" doc_id }
              :header-params {"Accept" Accept "Authorization" Authorization "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-attachments-get any?
  "Retrieve Document Attachments"
  ([doc_id string?, ] (objects-documents-doc-id-attachments-get doc_id nil))
  ([doc_id string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-attachments-get-with-http-info doc_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-attachments-post-with-http-info any?
  "Create Document Attachment"
  ([doc_id string?, ] (objects-documents-doc-id-attachments-post-with-http-info doc_id nil))
  ([doc_id string?, {:keys [Accept Authorization Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id)
   (call-api "/objects/documents/{doc_id}/attachments" :post
             {:path-params   {"doc_id" doc_id }
              :header-params {"Accept" Accept "Authorization" Authorization "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-attachments-post any?
  "Create Document Attachment"
  ([doc_id string?, ] (objects-documents-doc-id-attachments-post doc_id nil))
  ([doc_id string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-attachments-post-with-http-info doc_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-audittrail-get-with-http-info any?
  "Retrieve Complete Audit History for a Single Document"
  ([doc_id string?, ] (objects-documents-doc-id-audittrail-get-with-http-info doc_id nil))
  ([doc_id string?, {:keys [start_date end_date format_result limit offset events Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id)
   (call-api "/objects/documents/{doc_id}/audittrail" :get
             {:path-params   {"doc_id" doc_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"start_date" start_date "end_date" end_date "format_result" format_result "limit" limit "offset" offset "events" events }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-audittrail-get any?
  "Retrieve Complete Audit History for a Single Document"
  ([doc_id string?, ] (objects-documents-doc-id-audittrail-get doc_id nil))
  ([doc_id string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-audittrail-get-with-http-info doc_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-delete-with-http-info any?
  "Delete Single Document"
  ([doc_id string?, ] (objects-documents-doc-id-delete-with-http-info doc_id nil))
  ([doc_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id)
   (call-api "/objects/documents/{doc_id}" :delete
             {:path-params   {"doc_id" doc_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-delete any?
  "Delete Single Document"
  ([doc_id string?, ] (objects-documents-doc-id-delete doc_id nil))
  ([doc_id string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-delete-with-http-info doc_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-events-get-with-http-info any?
  "Retrieve Document Events"
  ([doc_id string?, ] (objects-documents-doc-id-events-get-with-http-info doc_id nil))
  ([doc_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id)
   (call-api "/objects/documents/{doc_id}/events" :get
             {:path-params   {"doc_id" doc_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-events-get any?
  "Retrieve Document Events"
  ([doc_id string?, ] (objects-documents-doc-id-events-get doc_id nil))
  ([doc_id string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-events-get-with-http-info doc_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-file-get-with-http-info any?
  "Download Document File"
  ([doc_id string?, ] (objects-documents-doc-id-file-get-with-http-info doc_id nil))
  ([doc_id string?, {:keys [lockDocument Accept Authorization X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id)
   (call-api "/objects/documents/{doc_id}/file" :get
             {:path-params   {"doc_id" doc_id }
              :header-params {"Accept" Accept "Authorization" Authorization "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"lockDocument" lockDocument }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-file-get any?
  "Download Document File"
  ([doc_id string?, ] (objects-documents-doc-id-file-get doc_id nil))
  ([doc_id string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-file-get-with-http-info doc_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-get-with-http-info any?
  "Retrieve Document"
  ([doc_id string?, ] (objects-documents-doc-id-get-with-http-info doc_id nil))
  ([doc_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id)
   (call-api "/objects/documents/{doc_id}" :get
             {:path-params   {"doc_id" doc_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-get any?
  "Retrieve Document"
  ([doc_id string?, ] (objects-documents-doc-id-get doc_id nil))
  ([doc_id string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-get-with-http-info doc_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-lock-delete-with-http-info any?
  "Delete Document Lock"
  ([doc_id string?, ] (objects-documents-doc-id-lock-delete-with-http-info doc_id nil))
  ([doc_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id)
   (call-api "/objects/documents/{doc_id}/lock" :delete
             {:path-params   {"doc_id" doc_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-lock-delete any?
  "Delete Document Lock"
  ([doc_id string?, ] (objects-documents-doc-id-lock-delete doc_id nil))
  ([doc_id string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-lock-delete-with-http-info doc_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-lock-get-with-http-info any?
  "Retrieve Document Lock"
  ([doc_id string?, ] (objects-documents-doc-id-lock-get-with-http-info doc_id nil))
  ([doc_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id)
   (call-api "/objects/documents/{doc_id}/lock" :get
             {:path-params   {"doc_id" doc_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-lock-get any?
  "Retrieve Document Lock"
  ([doc_id string?, ] (objects-documents-doc-id-lock-get doc_id nil))
  ([doc_id string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-lock-get-with-http-info doc_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-lock-post-with-http-info any?
  "Create Document Lock"
  ([doc_id string?, ] (objects-documents-doc-id-lock-post-with-http-info doc_id nil))
  ([doc_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id)
   (call-api "/objects/documents/{doc_id}/lock" :post
             {:path-params   {"doc_id" doc_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-lock-post any?
  "Create Document Lock"
  ([doc_id string?, ] (objects-documents-doc-id-lock-post doc_id nil))
  ([doc_id string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-lock-post-with-http-info doc_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-major-version-minor-version-attachments-file-get-with-http-info any?
  "Download All Document Version Attachments"
  ([doc_id string?, major_version string?, minor_version string?, ] (objects-documents-doc-id-major-version-minor-version-attachments-file-get-with-http-info doc_id major_version minor_version nil))
  ([doc_id string?, major_version string?, minor_version string?, {:keys [Accept Authorization X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id major_version minor_version)
   (call-api "/objects/documents/{doc_id}/{major_version}/{minor_version}/attachments/file" :get
             {:path-params   {"doc_id" doc_id "major_version" major_version "minor_version" minor_version }
              :header-params {"Accept" Accept "Authorization" Authorization "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-major-version-minor-version-attachments-file-get any?
  "Download All Document Version Attachments"
  ([doc_id string?, major_version string?, minor_version string?, ] (objects-documents-doc-id-major-version-minor-version-attachments-file-get doc_id major_version minor_version nil))
  ([doc_id string?, major_version string?, minor_version string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-major-version-minor-version-attachments-file-get-with-http-info doc_id major_version minor_version optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-post-with-http-info any?
  "Create Single Document Version"
  ([doc_id string?, ] (objects-documents-doc-id-post-with-http-info doc_id nil))
  ([doc_id string?, {:keys [suppressRendition Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id)
   (call-api "/objects/documents/{doc_id}" :post
             {:path-params   {"doc_id" doc_id }
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"suppressRendition" suppressRendition }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-post any?
  "Create Single Document Version"
  ([doc_id string?, ] (objects-documents-doc-id-post doc_id nil))
  ([doc_id string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-post-with-http-info doc_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-put-with-http-info any?
  "Update Single Document"
  ([doc_id string?, ] (objects-documents-doc-id-put-with-http-info doc_id nil))
  ([doc_id string?, {:keys [Authorization Content-Type Accept X-VaultAPI-MigrationMode X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id)
   (call-api "/objects/documents/{doc_id}" :put
             {:path-params   {"doc_id" doc_id }
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-MigrationMode" X-VaultAPI-MigrationMode "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-put any?
  "Update Single Document"
  ([doc_id string?, ] (objects-documents-doc-id-put doc_id nil))
  ([doc_id string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-put-with-http-info doc_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-renditions-get-with-http-info any?
  "Retrieve Document Renditions"
  ([doc_id string?, ] (objects-documents-doc-id-renditions-get-with-http-info doc_id nil))
  ([doc_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id)
   (call-api "/objects/documents/{doc_id}/renditions" :get
             {:path-params   {"doc_id" doc_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-renditions-get any?
  "Retrieve Document Renditions"
  ([doc_id string?, ] (objects-documents-doc-id-renditions-get doc_id nil))
  ([doc_id string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-renditions-get-with-http-info doc_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-renditions-rendition-type-delete-with-http-info any?
  "Delete Single Document Rendition"
  ([doc_id string?, rendition_type string?, ] (objects-documents-doc-id-renditions-rendition-type-delete-with-http-info doc_id rendition_type nil))
  ([doc_id string?, rendition_type string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id rendition_type)
   (call-api "/objects/documents/{doc_id}/renditions/{rendition_type}" :delete
             {:path-params   {"doc_id" doc_id "rendition_type" rendition_type }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-renditions-rendition-type-delete any?
  "Delete Single Document Rendition"
  ([doc_id string?, rendition_type string?, ] (objects-documents-doc-id-renditions-rendition-type-delete doc_id rendition_type nil))
  ([doc_id string?, rendition_type string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-renditions-rendition-type-delete-with-http-info doc_id rendition_type optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-renditions-rendition-type-get-with-http-info any?
  "Download Document Rendition File"
  ([doc_id string?, rendition_type string?, ] (objects-documents-doc-id-renditions-rendition-type-get-with-http-info doc_id rendition_type nil))
  ([doc_id string?, rendition_type string?, {:keys [steadyState Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id rendition_type)
   (call-api "/objects/documents/{doc_id}/renditions/{rendition_type}" :get
             {:path-params   {"doc_id" doc_id "rendition_type" rendition_type }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"steadyState" steadyState }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-renditions-rendition-type-get any?
  "Download Document Rendition File"
  ([doc_id string?, rendition_type string?, ] (objects-documents-doc-id-renditions-rendition-type-get doc_id rendition_type nil))
  ([doc_id string?, rendition_type string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-renditions-rendition-type-get-with-http-info doc_id rendition_type optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-renditions-rendition-type-post-with-http-info any?
  "Add Single Document Rendition"
  ([doc_id string?, rendition_type string?, ] (objects-documents-doc-id-renditions-rendition-type-post-with-http-info doc_id rendition_type nil))
  ([doc_id string?, rendition_type string?, {:keys [Authorization Accept ContentType X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id rendition_type)
   (call-api "/objects/documents/{doc_id}/renditions/{rendition_type}" :post
             {:path-params   {"doc_id" doc_id "rendition_type" rendition_type }
              :header-params {"Authorization" Authorization "Accept" Accept "Content Type" ContentType "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-renditions-rendition-type-post any?
  "Add Single Document Rendition"
  ([doc_id string?, rendition_type string?, ] (objects-documents-doc-id-renditions-rendition-type-post doc_id rendition_type nil))
  ([doc_id string?, rendition_type string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-renditions-rendition-type-post-with-http-info doc_id rendition_type optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-renditions-rendition-type-put-with-http-info any?
  "Replace Document Rendition"
  ([doc_id string?, rendition_type string?, ] (objects-documents-doc-id-renditions-rendition-type-put-with-http-info doc_id rendition_type nil))
  ([doc_id string?, rendition_type string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id rendition_type)
   (call-api "/objects/documents/{doc_id}/renditions/{rendition_type}" :put
             {:path-params   {"doc_id" doc_id "rendition_type" rendition_type }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-renditions-rendition-type-put any?
  "Replace Document Rendition"
  ([doc_id string?, rendition_type string?, ] (objects-documents-doc-id-renditions-rendition-type-put doc_id rendition_type nil))
  ([doc_id string?, rendition_type string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-renditions-rendition-type-put-with-http-info doc_id rendition_type optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-roles-role-name-and-user-or-group-id-delete-with-http-info any?
  "Remove Users & Groups from Roles on a Single Document"
  ([doc_id string?, role_name_and_user_or_group string?, id string?, ] (objects-documents-doc-id-roles-role-name-and-user-or-group-id-delete-with-http-info doc_id role_name_and_user_or_group id nil))
  ([doc_id string?, role_name_and_user_or_group string?, id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id role_name_and_user_or_group id)
   (call-api "/objects/documents/{doc_id}/roles/{role_name_and_user_or_group}/{id}" :delete
             {:path-params   {"doc_id" doc_id "role_name_and_user_or_group" role_name_and_user_or_group "id" id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-roles-role-name-and-user-or-group-id-delete any?
  "Remove Users & Groups from Roles on a Single Document"
  ([doc_id string?, role_name_and_user_or_group string?, id string?, ] (objects-documents-doc-id-roles-role-name-and-user-or-group-id-delete doc_id role_name_and_user_or_group id nil))
  ([doc_id string?, role_name_and_user_or_group string?, id string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-roles-role-name-and-user-or-group-id-delete-with-http-info doc_id role_name_and_user_or_group id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-version-major-version-minor-version-attachments-get-with-http-info any?
  "Retrieve Document Version Attachments"
  ([doc_id string?, major_version string?, minor_version string?, ] (objects-documents-doc-id-version-major-version-minor-version-attachments-get-with-http-info doc_id major_version minor_version nil))
  ([doc_id string?, major_version string?, minor_version string?, {:keys [Accept Authorization X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id major_version minor_version)
   (call-api "/objects/documents/{doc_id}/version/{major_version}/{minor_version}/attachments" :get
             {:path-params   {"doc_id" doc_id "major_version" major_version "minor_version" minor_version }
              :header-params {"Accept" Accept "Authorization" Authorization "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-version-major-version-minor-version-attachments-get any?
  "Retrieve Document Version Attachments"
  ([doc_id string?, major_version string?, minor_version string?, ] (objects-documents-doc-id-version-major-version-minor-version-attachments-get doc_id major_version minor_version nil))
  ([doc_id string?, major_version string?, minor_version string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-version-major-version-minor-version-attachments-get-with-http-info doc_id major_version minor_version optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-versions-get-with-http-info any?
  "Retrieve Document Versions"
  ([doc_id string?, ] (objects-documents-doc-id-versions-get-with-http-info doc_id nil))
  ([doc_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id)
   (call-api "/objects/documents/{doc_id}/versions" :get
             {:path-params   {"doc_id" doc_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-versions-get any?
  "Retrieve Document Versions"
  ([doc_id string?, ] (objects-documents-doc-id-versions-get doc_id nil))
  ([doc_id string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-versions-get-with-http-info doc_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-versions-major-version-minor-version-annotations-annotation-id-get-with-http-info any?
  "Read Annotations by ID"
  ([doc_id string?, major_version string?, minor_version string?, annotation_id string?, ] (objects-documents-doc-id-versions-major-version-minor-version-annotations-annotation-id-get-with-http-info doc_id major_version minor_version annotation_id nil))
  ([doc_id string?, major_version string?, minor_version string?, annotation_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id major_version minor_version annotation_id)
   (call-api "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/{annotation_id}" :get
             {:path-params   {"doc_id" doc_id "major_version" major_version "minor_version" minor_version "annotation_id" annotation_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-versions-major-version-minor-version-annotations-annotation-id-get any?
  "Read Annotations by ID"
  ([doc_id string?, major_version string?, minor_version string?, annotation_id string?, ] (objects-documents-doc-id-versions-major-version-minor-version-annotations-annotation-id-get doc_id major_version minor_version annotation_id nil))
  ([doc_id string?, major_version string?, minor_version string?, annotation_id string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-versions-major-version-minor-version-annotations-annotation-id-get-with-http-info doc_id major_version minor_version annotation_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-versions-major-version-minor-version-annotations-annotation-id-replies-get-with-http-info any?
  "Read Replies of Parent Annotation"
  ([doc_id string?, major_version string?, minor_version string?, annotation_id string?, ] (objects-documents-doc-id-versions-major-version-minor-version-annotations-annotation-id-replies-get-with-http-info doc_id major_version minor_version annotation_id nil))
  ([doc_id string?, major_version string?, minor_version string?, annotation_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id major_version minor_version annotation_id)
   (call-api "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/{annotation_id}/replies" :get
             {:path-params   {"doc_id" doc_id "major_version" major_version "minor_version" minor_version "annotation_id" annotation_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-versions-major-version-minor-version-annotations-annotation-id-replies-get any?
  "Read Replies of Parent Annotation"
  ([doc_id string?, major_version string?, minor_version string?, annotation_id string?, ] (objects-documents-doc-id-versions-major-version-minor-version-annotations-annotation-id-replies-get doc_id major_version minor_version annotation_id nil))
  ([doc_id string?, major_version string?, minor_version string?, annotation_id string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-versions-major-version-minor-version-annotations-annotation-id-replies-get-with-http-info doc_id major_version minor_version annotation_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-versions-major-version-minor-version-annotations-file-get-with-http-info any?
  "Export Document Version Annotations to PDF"
  ([doc_id string?, major_version string?, minor_version string?, ] (objects-documents-doc-id-versions-major-version-minor-version-annotations-file-get-with-http-info doc_id major_version minor_version nil))
  ([doc_id string?, major_version string?, minor_version string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id major_version minor_version)
   (call-api "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/file" :get
             {:path-params   {"doc_id" doc_id "major_version" major_version "minor_version" minor_version }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-versions-major-version-minor-version-annotations-file-get any?
  "Export Document Version Annotations to PDF"
  ([doc_id string?, major_version string?, minor_version string?, ] (objects-documents-doc-id-versions-major-version-minor-version-annotations-file-get doc_id major_version minor_version nil))
  ([doc_id string?, major_version string?, minor_version string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-versions-major-version-minor-version-annotations-file-get-with-http-info doc_id major_version minor_version optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-versions-major-version-minor-version-annotations-file-post-with-http-info any?
  "Import Document Version Annotations from PDF"
  ([doc_id string?, major_version string?, minor_version string?, ] (objects-documents-doc-id-versions-major-version-minor-version-annotations-file-post-with-http-info doc_id major_version minor_version nil))
  ([doc_id string?, major_version string?, minor_version string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id major_version minor_version)
   (call-api "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/file" :post
             {:path-params   {"doc_id" doc_id "major_version" major_version "minor_version" minor_version }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-versions-major-version-minor-version-annotations-file-post any?
  "Import Document Version Annotations from PDF"
  ([doc_id string?, major_version string?, minor_version string?, ] (objects-documents-doc-id-versions-major-version-minor-version-annotations-file-post doc_id major_version minor_version nil))
  ([doc_id string?, major_version string?, minor_version string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-versions-major-version-minor-version-annotations-file-post-with-http-info doc_id major_version minor_version optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-versions-major-version-minor-version-annotations-get-with-http-info any?
  "Read Annotations by Document Version and Type"
  ([doc_id string?, major_version string?, minor_version string?, ] (objects-documents-doc-id-versions-major-version-minor-version-annotations-get-with-http-info doc_id major_version minor_version nil))
  ([doc_id string?, major_version string?, minor_version string?, {:keys [limit offset annotation_types pagination_id Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id major_version minor_version)
   (call-api "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations" :get
             {:path-params   {"doc_id" doc_id "major_version" major_version "minor_version" minor_version }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"limit" limit "offset" offset "annotation_types" annotation_types "pagination_id" pagination_id }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-versions-major-version-minor-version-annotations-get any?
  "Read Annotations by Document Version and Type"
  ([doc_id string?, major_version string?, minor_version string?, ] (objects-documents-doc-id-versions-major-version-minor-version-annotations-get doc_id major_version minor_version nil))
  ([doc_id string?, major_version string?, minor_version string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-versions-major-version-minor-version-annotations-get-with-http-info doc_id major_version minor_version optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-versions-major-version-minor-version-attachments-attachment-id-versions-attachment-version-file-get-with-http-info any?
  "Download Document Version Attachment Version"
  ([doc_id string?, major_version string?, minor_version string?, attachment_id string?, attachment_version string?, ] (objects-documents-doc-id-versions-major-version-minor-version-attachments-attachment-id-versions-attachment-version-file-get-with-http-info doc_id major_version minor_version attachment_id attachment_version nil))
  ([doc_id string?, major_version string?, minor_version string?, attachment_id string?, attachment_version string?, {:keys [Accept Authorization X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id major_version minor_version attachment_id attachment_version)
   (call-api "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/attachments/{attachment_id}/versions/{attachment_version}/file" :get
             {:path-params   {"doc_id" doc_id "major_version" major_version "minor_version" minor_version "attachment_id" attachment_id "attachment_version" attachment_version }
              :header-params {"Accept" Accept "Authorization" Authorization "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-versions-major-version-minor-version-attachments-attachment-id-versions-attachment-version-file-get any?
  "Download Document Version Attachment Version"
  ([doc_id string?, major_version string?, minor_version string?, attachment_id string?, attachment_version string?, ] (objects-documents-doc-id-versions-major-version-minor-version-attachments-attachment-id-versions-attachment-version-file-get doc_id major_version minor_version attachment_id attachment_version nil))
  ([doc_id string?, major_version string?, minor_version string?, attachment_id string?, attachment_version string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-versions-major-version-minor-version-attachments-attachment-id-versions-attachment-version-file-get-with-http-info doc_id major_version minor_version attachment_id attachment_version optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-versions-major-version-minor-version-attachments-attachment-id-versions-attachment-version-get-with-http-info any?
  "Retrieve Document Version Attachment Versions"
  ([doc_id string?, major_version string?, minor_version string?, attachment_id string?, attachment_version string?, ] (objects-documents-doc-id-versions-major-version-minor-version-attachments-attachment-id-versions-attachment-version-get-with-http-info doc_id major_version minor_version attachment_id attachment_version nil))
  ([doc_id string?, major_version string?, minor_version string?, attachment_id string?, attachment_version string?, {:keys [Accept Authorization X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id major_version minor_version attachment_id attachment_version)
   (call-api "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/attachments/{attachment_id}/versions/{attachment_version}" :get
             {:path-params   {"doc_id" doc_id "major_version" major_version "minor_version" minor_version "attachment_id" attachment_id "attachment_version" attachment_version }
              :header-params {"Accept" Accept "Authorization" Authorization "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-versions-major-version-minor-version-attachments-attachment-id-versions-attachment-version-get any?
  "Retrieve Document Version Attachment Versions"
  ([doc_id string?, major_version string?, minor_version string?, attachment_id string?, attachment_version string?, ] (objects-documents-doc-id-versions-major-version-minor-version-attachments-attachment-id-versions-attachment-version-get doc_id major_version minor_version attachment_id attachment_version nil))
  ([doc_id string?, major_version string?, minor_version string?, attachment_id string?, attachment_version string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-versions-major-version-minor-version-attachments-attachment-id-versions-attachment-version-get-with-http-info doc_id major_version minor_version attachment_id attachment_version optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-versions-major-version-minor-version-delete-with-http-info any?
  "Delete Single Document Version"
  ([doc_id string?, major_version string?, minor_version string?, ] (objects-documents-doc-id-versions-major-version-minor-version-delete-with-http-info doc_id major_version minor_version nil))
  ([doc_id string?, major_version string?, minor_version string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id major_version minor_version)
   (call-api "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}" :delete
             {:path-params   {"doc_id" doc_id "major_version" major_version "minor_version" minor_version }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-versions-major-version-minor-version-delete any?
  "Delete Single Document Version"
  ([doc_id string?, major_version string?, minor_version string?, ] (objects-documents-doc-id-versions-major-version-minor-version-delete doc_id major_version minor_version nil))
  ([doc_id string?, major_version string?, minor_version string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-versions-major-version-minor-version-delete-with-http-info doc_id major_version minor_version optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-versions-major-version-minor-version-doc-export-annotations-to-csv-get-with-http-info any?
  "Retrieve Document Version Notes as CSV"
  ([doc_id string?, major_version string?, minor_version string?, ] (objects-documents-doc-id-versions-major-version-minor-version-doc-export-annotations-to-csv-get-with-http-info doc_id major_version minor_version nil))
  ([doc_id string?, major_version string?, minor_version string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id major_version minor_version)
   (call-api "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/doc-export-annotations-to-csv" :get
             {:path-params   {"doc_id" doc_id "major_version" major_version "minor_version" minor_version }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-versions-major-version-minor-version-doc-export-annotations-to-csv-get any?
  "Retrieve Document Version Notes as CSV"
  ([doc_id string?, major_version string?, minor_version string?, ] (objects-documents-doc-id-versions-major-version-minor-version-doc-export-annotations-to-csv-get doc_id major_version minor_version nil))
  ([doc_id string?, major_version string?, minor_version string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-versions-major-version-minor-version-doc-export-annotations-to-csv-get-with-http-info doc_id major_version minor_version optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-versions-major-version-minor-version-events-post-with-http-info any?
  "Create Document Event"
  ([doc_id string?, major_version string?, minor_version string?, ] (objects-documents-doc-id-versions-major-version-minor-version-events-post-with-http-info doc_id major_version minor_version nil))
  ([doc_id string?, major_version string?, minor_version string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id major_version minor_version)
   (call-api "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/events" :post
             {:path-params   {"doc_id" doc_id "major_version" major_version "minor_version" minor_version }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-versions-major-version-minor-version-events-post any?
  "Create Document Event"
  ([doc_id string?, major_version string?, minor_version string?, ] (objects-documents-doc-id-versions-major-version-minor-version-events-post doc_id major_version minor_version nil))
  ([doc_id string?, major_version string?, minor_version string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-versions-major-version-minor-version-events-post-with-http-info doc_id major_version minor_version optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-versions-major-version-minor-version-export-video-annotations-get-with-http-info any?
  "Retrieve Video Annotations"
  ([doc_id string?, major_version string?, minor_version string?, ] (objects-documents-doc-id-versions-major-version-minor-version-export-video-annotations-get-with-http-info doc_id major_version minor_version nil))
  ([doc_id string?, major_version string?, minor_version string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id major_version minor_version)
   (call-api "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/export-video-annotations" :get
             {:path-params   {"doc_id" doc_id "major_version" major_version "minor_version" minor_version }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-versions-major-version-minor-version-export-video-annotations-get any?
  "Retrieve Video Annotations"
  ([doc_id string?, major_version string?, minor_version string?, ] (objects-documents-doc-id-versions-major-version-minor-version-export-video-annotations-get doc_id major_version minor_version nil))
  ([doc_id string?, major_version string?, minor_version string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-versions-major-version-minor-version-export-video-annotations-get-with-http-info doc_id major_version minor_version optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-versions-major-version-minor-version-file-get-with-http-info any?
  "Download Document Version File"
  ([doc_id string?, major_version string?, minor_version string?, ] (objects-documents-doc-id-versions-major-version-minor-version-file-get-with-http-info doc_id major_version minor_version nil))
  ([doc_id string?, major_version string?, minor_version string?, {:keys [Accept Authorization X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id major_version minor_version)
   (call-api "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/file" :get
             {:path-params   {"doc_id" doc_id "major_version" major_version "minor_version" minor_version }
              :header-params {"Accept" Accept "Authorization" Authorization "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-versions-major-version-minor-version-file-get any?
  "Download Document Version File"
  ([doc_id string?, major_version string?, minor_version string?, ] (objects-documents-doc-id-versions-major-version-minor-version-file-get doc_id major_version minor_version nil))
  ([doc_id string?, major_version string?, minor_version string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-versions-major-version-minor-version-file-get-with-http-info doc_id major_version minor_version optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-versions-major-version-minor-version-get-with-http-info any?
  "Retrieve Document Version"
  ([doc_id string?, major_version string?, minor_version string?, ] (objects-documents-doc-id-versions-major-version-minor-version-get-with-http-info doc_id major_version minor_version nil))
  ([doc_id string?, major_version string?, minor_version string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id major_version minor_version)
   (call-api "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}" :get
             {:path-params   {"doc_id" doc_id "major_version" major_version "minor_version" minor_version }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-versions-major-version-minor-version-get any?
  "Retrieve Document Version"
  ([doc_id string?, major_version string?, minor_version string?, ] (objects-documents-doc-id-versions-major-version-minor-version-get doc_id major_version minor_version nil))
  ([doc_id string?, major_version string?, minor_version string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-versions-major-version-minor-version-get-with-http-info doc_id major_version minor_version optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-versions-major-version-minor-version-put-with-http-info any?
  "Update Document Version"
  ([doc_id string?, major_version string?, minor_version string?, ] (objects-documents-doc-id-versions-major-version-minor-version-put-with-http-info doc_id major_version minor_version nil))
  ([doc_id string?, major_version string?, minor_version string?, {:keys [Authorization Content-Type Accept X-VaultAPI-MigrationMode X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id major_version minor_version)
   (call-api "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}" :put
             {:path-params   {"doc_id" doc_id "major_version" major_version "minor_version" minor_version }
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-MigrationMode" X-VaultAPI-MigrationMode "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-versions-major-version-minor-version-put any?
  "Update Document Version"
  ([doc_id string?, major_version string?, minor_version string?, ] (objects-documents-doc-id-versions-major-version-minor-version-put doc_id major_version minor_version nil))
  ([doc_id string?, major_version string?, minor_version string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-versions-major-version-minor-version-put-with-http-info doc_id major_version minor_version optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-versions-major-version-minor-version-relationships-get-with-http-info any?
  "Retrieve Document Relationships"
  ([doc_id string?, major_version string?, minor_version string?, ] (objects-documents-doc-id-versions-major-version-minor-version-relationships-get-with-http-info doc_id major_version minor_version nil))
  ([doc_id string?, major_version string?, minor_version string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id major_version minor_version)
   (call-api "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships" :get
             {:path-params   {"doc_id" doc_id "major_version" major_version "minor_version" minor_version }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-versions-major-version-minor-version-relationships-get any?
  "Retrieve Document Relationships"
  ([doc_id string?, major_version string?, minor_version string?, ] (objects-documents-doc-id-versions-major-version-minor-version-relationships-get doc_id major_version minor_version nil))
  ([doc_id string?, major_version string?, minor_version string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-versions-major-version-minor-version-relationships-get-with-http-info doc_id major_version minor_version optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-versions-major-version-minor-version-relationships-post-with-http-info any?
  "Create Single Document Relationship"
  ([doc_id string?, major_version string?, minor_version string?, ] (objects-documents-doc-id-versions-major-version-minor-version-relationships-post-with-http-info doc_id major_version minor_version nil))
  ([doc_id string?, major_version string?, minor_version string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id major_version minor_version)
   (call-api "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships" :post
             {:path-params   {"doc_id" doc_id "major_version" major_version "minor_version" minor_version }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-versions-major-version-minor-version-relationships-post any?
  "Create Single Document Relationship"
  ([doc_id string?, major_version string?, minor_version string?, ] (objects-documents-doc-id-versions-major-version-minor-version-relationships-post doc_id major_version minor_version nil))
  ([doc_id string?, major_version string?, minor_version string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-versions-major-version-minor-version-relationships-post-with-http-info doc_id major_version minor_version optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-versions-major-version-minor-version-relationships-relationship-id-delete-with-http-info any?
  "Delete Single Document Relationship"
  ([doc_id string?, major_version string?, minor_version string?, relationship_id string?, ] (objects-documents-doc-id-versions-major-version-minor-version-relationships-relationship-id-delete-with-http-info doc_id major_version minor_version relationship_id nil))
  ([doc_id string?, major_version string?, minor_version string?, relationship_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id major_version minor_version relationship_id)
   (call-api "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id}" :delete
             {:path-params   {"doc_id" doc_id "major_version" major_version "minor_version" minor_version "relationship_id" relationship_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-versions-major-version-minor-version-relationships-relationship-id-delete any?
  "Delete Single Document Relationship"
  ([doc_id string?, major_version string?, minor_version string?, relationship_id string?, ] (objects-documents-doc-id-versions-major-version-minor-version-relationships-relationship-id-delete doc_id major_version minor_version relationship_id nil))
  ([doc_id string?, major_version string?, minor_version string?, relationship_id string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-versions-major-version-minor-version-relationships-relationship-id-delete-with-http-info doc_id major_version minor_version relationship_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-versions-major-version-minor-version-relationships-relationship-id-get-with-http-info any?
  "Retrieve Document Relationship"
  ([doc_id string?, major_version string?, minor_version string?, relationship_id string?, ] (objects-documents-doc-id-versions-major-version-minor-version-relationships-relationship-id-get-with-http-info doc_id major_version minor_version relationship_id nil))
  ([doc_id string?, major_version string?, minor_version string?, relationship_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id major_version minor_version relationship_id)
   (call-api "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id}" :get
             {:path-params   {"doc_id" doc_id "major_version" major_version "minor_version" minor_version "relationship_id" relationship_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-versions-major-version-minor-version-relationships-relationship-id-get any?
  "Retrieve Document Relationship"
  ([doc_id string?, major_version string?, minor_version string?, relationship_id string?, ] (objects-documents-doc-id-versions-major-version-minor-version-relationships-relationship-id-get doc_id major_version minor_version relationship_id nil))
  ([doc_id string?, major_version string?, minor_version string?, relationship_id string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-versions-major-version-minor-version-relationships-relationship-id-get-with-http-info doc_id major_version minor_version relationship_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-versions-major-version-minor-version-renditions-get-with-http-info any?
  "Retrieve Document Version Renditions"
  ([doc_id string?, major_version string?, minor_version string?, ] (objects-documents-doc-id-versions-major-version-minor-version-renditions-get-with-http-info doc_id major_version minor_version nil))
  ([doc_id string?, major_version string?, minor_version string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id major_version minor_version)
   (call-api "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions" :get
             {:path-params   {"doc_id" doc_id "major_version" major_version "minor_version" minor_version }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-versions-major-version-minor-version-renditions-get any?
  "Retrieve Document Version Renditions"
  ([doc_id string?, major_version string?, minor_version string?, ] (objects-documents-doc-id-versions-major-version-minor-version-renditions-get doc_id major_version minor_version nil))
  ([doc_id string?, major_version string?, minor_version string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-versions-major-version-minor-version-renditions-get-with-http-info doc_id major_version minor_version optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-versions-major-version-minor-version-renditions-rendition-type-delete-with-http-info any?
  "Delete Document Version Rendition"
  ([doc_id string?, major_version string?, minor_version string?, rendition_type string?, ] (objects-documents-doc-id-versions-major-version-minor-version-renditions-rendition-type-delete-with-http-info doc_id major_version minor_version rendition_type nil))
  ([doc_id string?, major_version string?, minor_version string?, rendition_type string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id major_version minor_version rendition_type)
   (call-api "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type}" :delete
             {:path-params   {"doc_id" doc_id "major_version" major_version "minor_version" minor_version "rendition_type" rendition_type }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-versions-major-version-minor-version-renditions-rendition-type-delete any?
  "Delete Document Version Rendition"
  ([doc_id string?, major_version string?, minor_version string?, rendition_type string?, ] (objects-documents-doc-id-versions-major-version-minor-version-renditions-rendition-type-delete doc_id major_version minor_version rendition_type nil))
  ([doc_id string?, major_version string?, minor_version string?, rendition_type string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-versions-major-version-minor-version-renditions-rendition-type-delete-with-http-info doc_id major_version minor_version rendition_type optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-versions-major-version-minor-version-renditions-rendition-type-get-with-http-info any?
  "Download Document Version Rendition File"
  ([doc_id string?, major_version string?, minor_version string?, rendition_type string?, ] (objects-documents-doc-id-versions-major-version-minor-version-renditions-rendition-type-get-with-http-info doc_id major_version minor_version rendition_type nil))
  ([doc_id string?, major_version string?, minor_version string?, rendition_type string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id major_version minor_version rendition_type)
   (call-api "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type}" :get
             {:path-params   {"doc_id" doc_id "major_version" major_version "minor_version" minor_version "rendition_type" rendition_type }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-versions-major-version-minor-version-renditions-rendition-type-get any?
  "Download Document Version Rendition File"
  ([doc_id string?, major_version string?, minor_version string?, rendition_type string?, ] (objects-documents-doc-id-versions-major-version-minor-version-renditions-rendition-type-get doc_id major_version minor_version rendition_type nil))
  ([doc_id string?, major_version string?, minor_version string?, rendition_type string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-versions-major-version-minor-version-renditions-rendition-type-get-with-http-info doc_id major_version minor_version rendition_type optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-versions-major-version-minor-version-renditions-rendition-type-post-with-http-info any?
  "Upload Document Version Rendition"
  ([doc_id string?, major_version string?, minor_version string?, rendition_type string?, ] (objects-documents-doc-id-versions-major-version-minor-version-renditions-rendition-type-post-with-http-info doc_id major_version minor_version rendition_type nil))
  ([doc_id string?, major_version string?, minor_version string?, rendition_type string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id major_version minor_version rendition_type)
   (call-api "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type}" :post
             {:path-params   {"doc_id" doc_id "major_version" major_version "minor_version" minor_version "rendition_type" rendition_type }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-versions-major-version-minor-version-renditions-rendition-type-post any?
  "Upload Document Version Rendition"
  ([doc_id string?, major_version string?, minor_version string?, rendition_type string?, ] (objects-documents-doc-id-versions-major-version-minor-version-renditions-rendition-type-post doc_id major_version minor_version rendition_type nil))
  ([doc_id string?, major_version string?, minor_version string?, rendition_type string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-versions-major-version-minor-version-renditions-rendition-type-post-with-http-info doc_id major_version minor_version rendition_type optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-versions-major-version-minor-version-renditions-rendition-type-put-with-http-info any?
  "Replace Document Version Rendition"
  ([doc_id string?, major_version string?, minor_version string?, rendition_type string?, ] (objects-documents-doc-id-versions-major-version-minor-version-renditions-rendition-type-put-with-http-info doc_id major_version minor_version rendition_type nil))
  ([doc_id string?, major_version string?, minor_version string?, rendition_type string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id major_version minor_version rendition_type)
   (call-api "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type}" :put
             {:path-params   {"doc_id" doc_id "major_version" major_version "minor_version" minor_version "rendition_type" rendition_type }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-versions-major-version-minor-version-renditions-rendition-type-put any?
  "Replace Document Version Rendition"
  ([doc_id string?, major_version string?, minor_version string?, rendition_type string?, ] (objects-documents-doc-id-versions-major-version-minor-version-renditions-rendition-type-put doc_id major_version minor_version rendition_type nil))
  ([doc_id string?, major_version string?, minor_version string?, rendition_type string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-versions-major-version-minor-version-renditions-rendition-type-put-with-http-info doc_id major_version minor_version rendition_type optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-doc-id-versions-major-version-minor-version-thumbnail-get-with-http-info any?
  "Download Document Version Thumbnail File"
  ([doc_id string?, major_version string?, minor_version string?, ] (objects-documents-doc-id-versions-major-version-minor-version-thumbnail-get-with-http-info doc_id major_version minor_version nil))
  ([doc_id string?, major_version string?, minor_version string?, {:keys [Accept Authorization X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params doc_id major_version minor_version)
   (call-api "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/thumbnail" :get
             {:path-params   {"doc_id" doc_id "major_version" major_version "minor_version" minor_version }
              :header-params {"Accept" Accept "Authorization" Authorization "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-doc-id-versions-major-version-minor-version-thumbnail-get any?
  "Download Document Version Thumbnail File"
  ([doc_id string?, major_version string?, minor_version string?, ] (objects-documents-doc-id-versions-major-version-minor-version-thumbnail-get doc_id major_version minor_version nil))
  ([doc_id string?, major_version string?, minor_version string?, optional-params any?]
   (let [res (:data (objects-documents-doc-id-versions-major-version-minor-version-thumbnail-get-with-http-info doc_id major_version minor_version optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-get-with-http-info any?
  "Retrieve All Documents"
  ([] (objects-documents-get-with-http-info nil))
  ([{:keys [named_filter scope versionscope search limit sort start Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/documents" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"named_filter" named_filter "scope" scope "versionscope" versionscope "search" search "limit" limit "sort" sort "start" start }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-get any?
  "Retrieve All Documents"
  ([] (objects-documents-get nil))
  ([optional-params any?]
   (let [res (:data (objects-documents-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-id-roles-get-with-http-info any?
  "Retrieve All Document Roles"
  ([id string?, ] (objects-documents-id-roles-get-with-http-info id nil))
  ([id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params id)
   (call-api "/objects/documents/{id}/roles" :get
             {:path-params   {"id" id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-id-roles-get any?
  "Retrieve All Document Roles"
  ([id string?, ] (objects-documents-id-roles-get id nil))
  ([id string?, optional-params any?]
   (let [res (:data (objects-documents-id-roles-get-with-http-info id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-id-roles-post-with-http-info any?
  "Assign Users & Groups to Roles on a Single Document"
  ([id string?, ] (objects-documents-id-roles-post-with-http-info id nil))
  ([id string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params id)
   (call-api "/objects/documents/{id}/roles" :post
             {:path-params   {"id" id }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-id-roles-post any?
  "Assign Users & Groups to Roles on a Single Document"
  ([id string?, ] (objects-documents-id-roles-post id nil))
  ([id string?, optional-params any?]
   (let [res (:data (objects-documents-id-roles-post-with-http-info id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-id-roles-role-name-get-with-http-info any?
  "Retrieve Document Role"
  ([id string?, role_name string?, ] (objects-documents-id-roles-role-name-get-with-http-info id role_name nil))
  ([id string?, role_name string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params id role_name)
   (call-api "/objects/documents/{id}/roles/{role_name}" :get
             {:path-params   {"id" id "role_name" role_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-id-roles-role-name-get any?
  "Retrieve Document Role"
  ([id string?, role_name string?, ] (objects-documents-id-roles-role-name-get id role_name nil))
  ([id string?, role_name string?, optional-params any?]
   (let [res (:data (objects-documents-id-roles-role-name-get-with-http-info id role_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-id-versions-major-version-minor-version-lifecycle-actions-get-with-http-info any?
  "Retrieve Document User Actions"
  ([id string?, major_version string?, minor_version string?, ] (objects-documents-id-versions-major-version-minor-version-lifecycle-actions-get-with-http-info id major_version minor_version nil))
  ([id string?, major_version string?, minor_version string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params id major_version minor_version)
   (call-api "/objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions" :get
             {:path-params   {"id" id "major_version" major_version "minor_version" minor_version }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-id-versions-major-version-minor-version-lifecycle-actions-get any?
  "Retrieve Document User Actions"
  ([id string?, major_version string?, minor_version string?, ] (objects-documents-id-versions-major-version-minor-version-lifecycle-actions-get id major_version minor_version nil))
  ([id string?, major_version string?, minor_version string?, optional-params any?]
   (let [res (:data (objects-documents-id-versions-major-version-minor-version-lifecycle-actions-get-with-http-info id major_version minor_version optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-id-versions-major-version-minor-version-lifecycle-actions-name-v-entry-requirements-get-with-http-info any?
  "Retrieve Document Entry Criteria"
  ([id string?, major_version string?, minor_version string?, name__v string?, ] (objects-documents-id-versions-major-version-minor-version-lifecycle-actions-name-v-entry-requirements-get-with-http-info id major_version minor_version name__v nil))
  ([id string?, major_version string?, minor_version string?, name__v string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params id major_version minor_version name__v)
   (call-api "/objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}/entry_requirements" :get
             {:path-params   {"id" id "major_version" major_version "minor_version" minor_version "name__v" name__v }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-id-versions-major-version-minor-version-lifecycle-actions-name-v-entry-requirements-get any?
  "Retrieve Document Entry Criteria"
  ([id string?, major_version string?, minor_version string?, name__v string?, ] (objects-documents-id-versions-major-version-minor-version-lifecycle-actions-name-v-entry-requirements-get id major_version minor_version name__v nil))
  ([id string?, major_version string?, minor_version string?, name__v string?, optional-params any?]
   (let [res (:data (objects-documents-id-versions-major-version-minor-version-lifecycle-actions-name-v-entry-requirements-get-with-http-info id major_version minor_version name__v optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-id-versions-major-version-minor-version-lifecycle-actions-name-v-put-with-http-info any?
  "Initiate Document User Action"
  ([id string?, major_version string?, minor_version string?, name__v string?, ] (objects-documents-id-versions-major-version-minor-version-lifecycle-actions-name-v-put-with-http-info id major_version minor_version name__v nil))
  ([id string?, major_version string?, minor_version string?, name__v string?, {:keys [Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params id major_version minor_version name__v)
   (call-api "/objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}" :put
             {:path-params   {"id" id "major_version" major_version "minor_version" minor_version "name__v" name__v }
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-id-versions-major-version-minor-version-lifecycle-actions-name-v-put any?
  "Initiate Document User Action"
  ([id string?, major_version string?, minor_version string?, name__v string?, ] (objects-documents-id-versions-major-version-minor-version-lifecycle-actions-name-v-put id major_version minor_version name__v nil))
  ([id string?, major_version string?, minor_version string?, name__v string?, optional-params any?]
   (let [res (:data (objects-documents-id-versions-major-version-minor-version-lifecycle-actions-name-v-put-with-http-info id major_version minor_version name__v optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-lifecycle-actions-post-with-http-info any?
  "Retrieve User Actions on Multiple Documents"
  ([] (objects-documents-lifecycle-actions-post-with-http-info nil))
  ([{:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/documents/lifecycle_actions" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-lifecycle-actions-post any?
  "Retrieve User Actions on Multiple Documents"
  ([] (objects-documents-lifecycle-actions-post nil))
  ([optional-params any?]
   (let [res (:data (objects-documents-lifecycle-actions-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-lifecycle-actions-user-action-name-put-with-http-info any?
  "Initiate Bulk Document User Actions"
  ([user_action_name string?, ] (objects-documents-lifecycle-actions-user-action-name-put-with-http-info user_action_name nil))
  ([user_action_name string?, {:keys [Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params user_action_name)
   (call-api "/objects/documents/lifecycle_actions/{user_action_name}" :put
             {:path-params   {"user_action_name" user_action_name }
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-lifecycle-actions-user-action-name-put any?
  "Initiate Bulk Document User Actions"
  ([user_action_name string?, ] (objects-documents-lifecycle-actions-user-action-name-put user_action_name nil))
  ([user_action_name string?, optional-params any?]
   (let [res (:data (objects-documents-lifecycle-actions-user-action-name-put-with-http-info user_action_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-post-with-http-info any?
  "Create Single Document"
  ([] (objects-documents-post-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-MigrationMode X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/documents" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-MigrationMode" X-VaultAPI-MigrationMode "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-post any?
  "Create Single Document"
  ([] (objects-documents-post nil))
  ([optional-params any?]
   (let [res (:data (objects-documents-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-relationships-batch-delete-with-http-info any?
  "Delete Multiple Document Relationships"
  ([] (objects-documents-relationships-batch-delete-with-http-info nil))
  ([{:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/documents/relationships/batch" :delete
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-relationships-batch-delete any?
  "Delete Multiple Document Relationships"
  ([] (objects-documents-relationships-batch-delete nil))
  ([optional-params any?]
   (let [res (:data (objects-documents-relationships-batch-delete-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-relationships-batch-post-with-http-info any?
  "Create Multiple Document Relationships"
  ([] (objects-documents-relationships-batch-post-with-http-info nil))
  ([{:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/documents/relationships/batch" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-relationships-batch-post any?
  "Create Multiple Document Relationships"
  ([] (objects-documents-relationships-batch-post nil))
  ([optional-params any?]
   (let [res (:data (objects-documents-relationships-batch-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-renditions-batch-delete-with-http-info any?
  "Delete Multiple Document Renditions"
  ([] (objects-documents-renditions-batch-delete-with-http-info nil))
  ([{:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/documents/renditions/batch" :delete
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-renditions-batch-delete any?
  "Delete Multiple Document Renditions"
  ([] (objects-documents-renditions-batch-delete nil))
  ([optional-params any?]
   (let [res (:data (objects-documents-renditions-batch-delete-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-renditions-batch-post-with-http-info any?
  "Add Multiple Document Renditions"
  ([] (objects-documents-renditions-batch-post-with-http-info nil))
  ([{:keys [idParam largeSizeAsset Authorization Accept Content-Type X-VaultAPI-MigrationMode X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/documents/renditions/batch" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-MigrationMode" X-VaultAPI-MigrationMode "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"idParam" idParam "largeSizeAsset" largeSizeAsset }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-renditions-batch-post any?
  "Add Multiple Document Renditions"
  ([] (objects-documents-renditions-batch-post nil))
  ([optional-params any?]
   (let [res (:data (objects-documents-renditions-batch-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-roles-batch-delete-with-http-info any?
  "Remove Users and Groups from Roles on Multiple Documents & Binders"
  ([] (objects-documents-roles-batch-delete-with-http-info nil))
  ([{:keys [Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/documents/roles/batch" :delete
             {:path-params   {}
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-roles-batch-delete any?
  "Remove Users and Groups from Roles on Multiple Documents & Binders"
  ([] (objects-documents-roles-batch-delete nil))
  ([optional-params any?]
   (let [res (:data (objects-documents-roles-batch-delete-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-roles-batch-post-with-http-info any?
  "Assign Users & Groups to Roles on Multiple Documents & Binders"
  ([] (objects-documents-roles-batch-post-with-http-info nil))
  ([{:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/documents/roles/batch" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-roles-batch-post any?
  "Assign Users & Groups to Roles on Multiple Documents & Binders"
  ([] (objects-documents-roles-batch-post nil))
  ([optional-params any?]
   (let [res (:data (objects-documents-roles-batch-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-templates-get-with-http-info any?
  "Retrieve Document Template Collection"
  ([] (objects-documents-templates-get-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/documents/templates" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-templates-get any?
  "Retrieve Document Template Collection"
  ([] (objects-documents-templates-get nil))
  ([optional-params any?]
   (let [res (:data (objects-documents-templates-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-templates-post-with-http-info any?
  "Create Single Document Template"
  ([] (objects-documents-templates-post-with-http-info nil))
  ([{:keys [Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/documents/templates" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-templates-post any?
  "Create Single Document Template"
  ([] (objects-documents-templates-post nil))
  ([optional-params any?]
   (let [res (:data (objects-documents-templates-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-templates-put-with-http-info any?
  "Update Multiple Document Templates"
  ([] (objects-documents-templates-put-with-http-info nil))
  ([{:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/documents/templates" :put
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-templates-put any?
  "Update Multiple Document Templates"
  ([] (objects-documents-templates-put nil))
  ([optional-params any?]
   (let [res (:data (objects-documents-templates-put-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-templates-template-name-delete-with-http-info any?
  "Delete Basic Document Template"
  ([template_name string?, ] (objects-documents-templates-template-name-delete-with-http-info template_name nil))
  ([template_name string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params template_name)
   (call-api "/objects/documents/templates/{template_name}" :delete
             {:path-params   {"template_name" template_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-templates-template-name-delete any?
  "Delete Basic Document Template"
  ([template_name string?, ] (objects-documents-templates-template-name-delete template_name nil))
  ([template_name string?, optional-params any?]
   (let [res (:data (objects-documents-templates-template-name-delete-with-http-info template_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-templates-template-name-file-get-with-http-info any?
  "Download Document Template File"
  ([template_name string?, ] (objects-documents-templates-template-name-file-get-with-http-info template_name nil))
  ([template_name string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params template_name)
   (call-api "/objects/documents/templates/{template_name}/file" :get
             {:path-params   {"template_name" template_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-templates-template-name-file-get any?
  "Download Document Template File"
  ([template_name string?, ] (objects-documents-templates-template-name-file-get template_name nil))
  ([template_name string?, optional-params any?]
   (let [res (:data (objects-documents-templates-template-name-file-get-with-http-info template_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-templates-template-name-get-with-http-info any?
  "Retrieve Document Template Attributes"
  ([template_name string?, ] (objects-documents-templates-template-name-get-with-http-info template_name nil))
  ([template_name string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params template_name)
   (call-api "/objects/documents/templates/{template_name}" :get
             {:path-params   {"template_name" template_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-templates-template-name-get any?
  "Retrieve Document Template Attributes"
  ([template_name string?, ] (objects-documents-templates-template-name-get template_name nil))
  ([template_name string?, optional-params any?]
   (let [res (:data (objects-documents-templates-template-name-get-with-http-info template_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-templates-template-name-put-with-http-info any?
  "Update Single Document Template"
  ([template_name string?, ] (objects-documents-templates-template-name-put-with-http-info template_name nil))
  ([template_name string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params template_name)
   (call-api "/objects/documents/templates/{template_name}" :put
             {:path-params   {"template_name" template_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-templates-template-name-put any?
  "Update Single Document Template"
  ([template_name string?, ] (objects-documents-templates-template-name-put template_name nil))
  ([template_name string?, optional-params any?]
   (let [res (:data (objects-documents-templates-template-name-put-with-http-info template_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-tokens-post-with-http-info any?
  "Document Tokens"
  ([] (objects-documents-tokens-post-with-http-info nil))
  ([{:keys [Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/documents/tokens" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-tokens-post any?
  "Document Tokens"
  ([] (objects-documents-tokens-post nil))
  ([optional-params any?]
   (let [res (:data (objects-documents-tokens-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-versions-batch-actions-fileextract-post-with-http-info any?
  "Export Document Versions"
  ([] (objects-documents-versions-batch-actions-fileextract-post-with-http-info nil))
  ([{:keys [source renditions Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/documents/versions/batch/actions/fileextract" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"source" source "renditions" renditions }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-versions-batch-actions-fileextract-post any?
  "Export Document Versions"
  ([] (objects-documents-versions-batch-actions-fileextract-post nil))
  ([optional-params any?]
   (let [res (:data (objects-documents-versions-batch-actions-fileextract-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-versions-batch-delete-with-http-info any?
  "Delete Multiple Document Versions"
  ([] (objects-documents-versions-batch-delete-with-http-info nil))
  ([{:keys [idParam Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/documents/versions/batch" :delete
             {:path-params   {}
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"idParam" idParam }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-versions-batch-delete any?
  "Delete Multiple Document Versions"
  ([] (objects-documents-versions-batch-delete nil))
  ([optional-params any?]
   (let [res (:data (objects-documents-versions-batch-delete-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-documents-versions-batch-post-with-http-info any?
  "Create Multiple Document Versions"
  ([] (objects-documents-versions-batch-post-with-http-info nil))
  ([{:keys [idParam Authorization Accept Content-Type X-VaultAPI-MigrationMode X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/documents/versions/batch" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-MigrationMode" X-VaultAPI-MigrationMode "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"idParam" idParam }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-documents-versions-batch-post any?
  "Create Multiple Document Versions"
  ([] (objects-documents-versions-batch-post nil))
  ([optional-params any?]
   (let [res (:data (objects-documents-versions-batch-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-domain-get-with-http-info any?
  "Retrieve Domain Information"
  ([] (objects-domain-get-with-http-info nil))
  ([{:keys [include_application Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/domain" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"include_application" include_application }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-domain-get any?
  "Retrieve Domain Information"
  ([] (objects-domain-get nil))
  ([optional-params any?]
   (let [res (:data (objects-domain-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-domains-get-with-http-info any?
  "Retrieve Domains"
  ([] (objects-domains-get-with-http-info nil))
  ([{:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/domains" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-domains-get any?
  "Retrieve Domains"
  ([] (objects-domains-get nil))
  ([optional-params any?]
   (let [res (:data (objects-domains-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-edl-matched-documents-batch-actions-add-post-with-http-info any?
  "Add EDL Matched Documents"
  ([] (objects-edl-matched-documents-batch-actions-add-post-with-http-info nil))
  ([{:keys [Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/edl_matched_documents/batch/actions/add" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-edl-matched-documents-batch-actions-add-post any?
  "Add EDL Matched Documents"
  ([] (objects-edl-matched-documents-batch-actions-add-post nil))
  ([optional-params any?]
   (let [res (:data (objects-edl-matched-documents-batch-actions-add-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-edl-matched-documents-batch-actions-remove-post-with-http-info any?
  "Remove EDL Matched Documents"
  ([] (objects-edl-matched-documents-batch-actions-remove-post-with-http-info nil))
  ([{:keys [Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/edl_matched_documents/batch/actions/remove" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-edl-matched-documents-batch-actions-remove-post any?
  "Remove EDL Matched Documents"
  ([] (objects-edl-matched-documents-batch-actions-remove-post nil))
  ([optional-params any?]
   (let [res (:data (objects-edl-matched-documents-batch-actions-remove-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-groups-auto-get-with-http-info any?
  "Retrieve Auto Managed Groups"
  ([] (objects-groups-auto-get-with-http-info nil))
  ([{:keys [limit offset Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/groups/auto" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"limit" limit "offset" offset }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-groups-auto-get any?
  "Retrieve Auto Managed Groups"
  ([] (objects-groups-auto-get nil))
  ([optional-params any?]
   (let [res (:data (objects-groups-auto-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-groups-get-with-http-info any?
  "Retrieve All Groups"
  ([] (objects-groups-get-with-http-info nil))
  ([{:keys [includeImplied Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/groups" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"includeImplied" includeImplied }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-groups-get any?
  "Retrieve All Groups"
  ([] (objects-groups-get nil))
  ([optional-params any?]
   (let [res (:data (objects-groups-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-groups-group-id-delete-with-http-info any?
  "Delete Group"
  ([group_id string?, ] (objects-groups-group-id-delete-with-http-info group_id nil))
  ([group_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params group_id)
   (call-api "/objects/groups/{group_id}" :delete
             {:path-params   {"group_id" group_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-groups-group-id-delete any?
  "Delete Group"
  ([group_id string?, ] (objects-groups-group-id-delete group_id nil))
  ([group_id string?, optional-params any?]
   (let [res (:data (objects-groups-group-id-delete-with-http-info group_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-groups-group-id-get-with-http-info any?
  "Retrieve Group"
  ([group_id string?, ] (objects-groups-group-id-get-with-http-info group_id nil))
  ([group_id string?, {:keys [includeImplied Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params group_id)
   (call-api "/objects/groups/{group_id}" :get
             {:path-params   {"group_id" group_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"includeImplied" includeImplied }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-groups-group-id-get any?
  "Retrieve Group"
  ([group_id string?, ] (objects-groups-group-id-get group_id nil))
  ([group_id string?, optional-params any?]
   (let [res (:data (objects-groups-group-id-get-with-http-info group_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-groups-group-id-put-with-http-info any?
  "Update Group"
  ([group_id string?, ] (objects-groups-group-id-put-with-http-info group_id nil))
  ([group_id string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params group_id)
   (call-api "/objects/groups/{group_id}" :put
             {:path-params   {"group_id" group_id }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-groups-group-id-put any?
  "Update Group"
  ([group_id string?, ] (objects-groups-group-id-put group_id nil))
  ([group_id string?, optional-params any?]
   (let [res (:data (objects-groups-group-id-put-with-http-info group_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-groups-post-with-http-info any?
  "Create Group"
  ([] (objects-groups-post-with-http-info nil))
  ([{:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/groups" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-groups-post any?
  "Create Group"
  ([] (objects-groups-post nil))
  ([optional-params any?]
   (let [res (:data (objects-groups-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-licenses-get-with-http-info any?
  "Retrieve Application License Usage"
  ([] (objects-licenses-get-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/licenses" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-licenses-get any?
  "Retrieve Application License Usage"
  ([] (objects-licenses-get nil))
  ([optional-params any?]
   (let [res (:data (objects-licenses-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-objectworkflows-actions-get-with-http-info any?
  "Retrieve All Multi-Record Workflows"
  ([] (objects-objectworkflows-actions-get-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/objectworkflows/actions" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-objectworkflows-actions-get any?
  "Retrieve All Multi-Record Workflows"
  ([] (objects-objectworkflows-actions-get nil))
  ([optional-params any?]
   (let [res (:data (objects-objectworkflows-actions-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-objectworkflows-actions-workflow-name-get-with-http-info any?
  "Retrieve Multi-Record Workflow Details"
  ([workflow_name string?, ] (objects-objectworkflows-actions-workflow-name-get-with-http-info workflow_name nil))
  ([workflow_name string?, {:keys [Authorization X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params workflow_name)
   (call-api "/objects/objectworkflows/actions/{workflow_name}" :get
             {:path-params   {"workflow_name" workflow_name }
              :header-params {"Authorization" Authorization "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-objectworkflows-actions-workflow-name-get any?
  "Retrieve Multi-Record Workflow Details"
  ([workflow_name string?, ] (objects-objectworkflows-actions-workflow-name-get workflow_name nil))
  ([workflow_name string?, optional-params any?]
   (let [res (:data (objects-objectworkflows-actions-workflow-name-get-with-http-info workflow_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-objectworkflows-actions-workflow-name-post-with-http-info any?
  "Initiate Multi-Record Workflow"
  ([workflow_name string?, ] (objects-objectworkflows-actions-workflow-name-post-with-http-info workflow_name nil))
  ([workflow_name string?, {:keys [Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params workflow_name)
   (call-api "/objects/objectworkflows/actions/{workflow_name}" :post
             {:path-params   {"workflow_name" workflow_name }
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-objectworkflows-actions-workflow-name-post any?
  "Initiate Multi-Record Workflow"
  ([workflow_name string?, ] (objects-objectworkflows-actions-workflow-name-post workflow_name nil))
  ([workflow_name string?, optional-params any?]
   (let [res (:data (objects-objectworkflows-actions-workflow-name-post-with-http-info workflow_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-objectworkflows-get-with-http-info any?
  "Retrieve Workflows"
  ([] (objects-objectworkflows-get-with-http-info nil))
  ([{:keys [object__v record_id__v participant status__v offset page_size loc Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/objectworkflows" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"object__v" object__v "record_id__v" record_id__v "participant" participant "status__v" status__v "offset" offset "page_size" page_size "loc" loc }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-objectworkflows-get any?
  "Retrieve Workflows"
  ([] (objects-objectworkflows-get nil))
  ([optional-params any?]
   (let [res (:data (objects-objectworkflows-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-objectworkflows-tasks-get-with-http-info any?
  "Retrieve Workflow Tasks"
  ([] (objects-objectworkflows-tasks-get-with-http-info nil))
  ([{:keys [object__v record_id__v assignee__v status__v offset page_size loc Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/objectworkflows/tasks" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"object__v" object__v "record_id__v" record_id__v "assignee__v" assignee__v "status__v" status__v "offset" offset "page_size" page_size "loc" loc }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-objectworkflows-tasks-get any?
  "Retrieve Workflow Tasks"
  ([] (objects-objectworkflows-tasks-get nil))
  ([optional-params any?]
   (let [res (:data (objects-objectworkflows-tasks-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-objectworkflows-tasks-task-id-actions-accept-post-with-http-info any?
  "Accept Single Record Workflow Task"
  ([task_id string?, ] (objects-objectworkflows-tasks-task-id-actions-accept-post-with-http-info task_id nil))
  ([task_id string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params task_id)
   (call-api "/objects/objectworkflows/tasks/{task_id}/actions/accept" :post
             {:path-params   {"task_id" task_id }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-objectworkflows-tasks-task-id-actions-accept-post any?
  "Accept Single Record Workflow Task"
  ([task_id string?, ] (objects-objectworkflows-tasks-task-id-actions-accept-post task_id nil))
  ([task_id string?, optional-params any?]
   (let [res (:data (objects-objectworkflows-tasks-task-id-actions-accept-post-with-http-info task_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-objectworkflows-tasks-task-id-actions-cancel-post-with-http-info any?
  "Cancel Workflow Task"
  ([task_id string?, ] (objects-objectworkflows-tasks-task-id-actions-cancel-post-with-http-info task_id nil))
  ([task_id string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params task_id)
   (call-api "/objects/objectworkflows/tasks/{task_id}/actions/cancel" :post
             {:path-params   {"task_id" task_id }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-objectworkflows-tasks-task-id-actions-cancel-post any?
  "Cancel Workflow Task"
  ([task_id string?, ] (objects-objectworkflows-tasks-task-id-actions-cancel-post task_id nil))
  ([task_id string?, optional-params any?]
   (let [res (:data (objects-objectworkflows-tasks-task-id-actions-cancel-post-with-http-info task_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-objectworkflows-tasks-task-id-actions-complete-post-with-http-info any?
  "Complete Single Record Workflow Task"
  ([task_id string?, ] (objects-objectworkflows-tasks-task-id-actions-complete-post-with-http-info task_id nil))
  ([task_id string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params task_id)
   (call-api "/objects/objectworkflows/tasks/{task_id}/actions/complete" :post
             {:path-params   {"task_id" task_id }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-objectworkflows-tasks-task-id-actions-complete-post any?
  "Complete Single Record Workflow Task"
  ([task_id string?, ] (objects-objectworkflows-tasks-task-id-actions-complete-post task_id nil))
  ([task_id string?, optional-params any?]
   (let [res (:data (objects-objectworkflows-tasks-task-id-actions-complete-post-with-http-info task_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-objectworkflows-tasks-task-id-actions-get-with-http-info any?
  "Retrieve Workflow Task Actions"
  ([task_id string?, ] (objects-objectworkflows-tasks-task-id-actions-get-with-http-info task_id nil))
  ([task_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params task_id)
   (call-api "/objects/objectworkflows/tasks/{task_id}/actions" :get
             {:path-params   {"task_id" task_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-objectworkflows-tasks-task-id-actions-get any?
  "Retrieve Workflow Task Actions"
  ([task_id string?, ] (objects-objectworkflows-tasks-task-id-actions-get task_id nil))
  ([task_id string?, optional-params any?]
   (let [res (:data (objects-objectworkflows-tasks-task-id-actions-get-with-http-info task_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-objectworkflows-tasks-task-id-actions-mdwaccept-post-with-http-info any?
  "Accept Multi-item Workflow Task"
  ([task_id string?, ] (objects-objectworkflows-tasks-task-id-actions-mdwaccept-post-with-http-info task_id nil))
  ([task_id string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params task_id)
   (call-api "/objects/objectworkflows/tasks/{task_id}/actions/mdwaccept" :post
             {:path-params   {"task_id" task_id }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-objectworkflows-tasks-task-id-actions-mdwaccept-post any?
  "Accept Multi-item Workflow Task"
  ([task_id string?, ] (objects-objectworkflows-tasks-task-id-actions-mdwaccept-post task_id nil))
  ([task_id string?, optional-params any?]
   (let [res (:data (objects-objectworkflows-tasks-task-id-actions-mdwaccept-post-with-http-info task_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-objectworkflows-tasks-task-id-actions-mdwcomplete-post-with-http-info any?
  "Complete Multi-item Workflow Task"
  ([task_id string?, ] (objects-objectworkflows-tasks-task-id-actions-mdwcomplete-post-with-http-info task_id nil))
  ([task_id string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params task_id)
   (call-api "/objects/objectworkflows/tasks/{task_id}/actions/mdwcomplete" :post
             {:path-params   {"task_id" task_id }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-objectworkflows-tasks-task-id-actions-mdwcomplete-post any?
  "Complete Multi-item Workflow Task"
  ([task_id string?, ] (objects-objectworkflows-tasks-task-id-actions-mdwcomplete-post task_id nil))
  ([task_id string?, optional-params any?]
   (let [res (:data (objects-objectworkflows-tasks-task-id-actions-mdwcomplete-post-with-http-info task_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-objectworkflows-tasks-task-id-actions-mdwmanagecontent-post-with-http-info any?
  "Manage Multi-Item Workflow Content"
  ([task_id string?, ] (objects-objectworkflows-tasks-task-id-actions-mdwmanagecontent-post-with-http-info task_id nil))
  ([task_id string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params task_id)
   (call-api "/objects/objectworkflows/tasks/{task_id}/actions/mdwmanagecontent" :post
             {:path-params   {"task_id" task_id }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-objectworkflows-tasks-task-id-actions-mdwmanagecontent-post any?
  "Manage Multi-Item Workflow Content"
  ([task_id string?, ] (objects-objectworkflows-tasks-task-id-actions-mdwmanagecontent-post task_id nil))
  ([task_id string?, optional-params any?]
   (let [res (:data (objects-objectworkflows-tasks-task-id-actions-mdwmanagecontent-post-with-http-info task_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-objectworkflows-tasks-task-id-actions-mdwreassign-post-with-http-info any?
  "Reassign Multi-item Workflow Task"
  ([task_id string?, ] (objects-objectworkflows-tasks-task-id-actions-mdwreassign-post-with-http-info task_id nil))
  ([task_id string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params task_id)
   (call-api "/objects/objectworkflows/tasks/{task_id}/actions/mdwreassign" :post
             {:path-params   {"task_id" task_id }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-objectworkflows-tasks-task-id-actions-mdwreassign-post any?
  "Reassign Multi-item Workflow Task"
  ([task_id string?, ] (objects-objectworkflows-tasks-task-id-actions-mdwreassign-post task_id nil))
  ([task_id string?, optional-params any?]
   (let [res (:data (objects-objectworkflows-tasks-task-id-actions-mdwreassign-post-with-http-info task_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-objectworkflows-tasks-task-id-actions-reassign-post-with-http-info any?
  "Reassign Single Record Workflow Task"
  ([task_id string?, ] (objects-objectworkflows-tasks-task-id-actions-reassign-post-with-http-info task_id nil))
  ([task_id string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params task_id)
   (call-api "/objects/objectworkflows/tasks/{task_id}/actions/reassign" :post
             {:path-params   {"task_id" task_id }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-objectworkflows-tasks-task-id-actions-reassign-post any?
  "Reassign Single Record Workflow Task"
  ([task_id string?, ] (objects-objectworkflows-tasks-task-id-actions-reassign-post task_id nil))
  ([task_id string?, optional-params any?]
   (let [res (:data (objects-objectworkflows-tasks-task-id-actions-reassign-post-with-http-info task_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-objectworkflows-tasks-task-id-actions-task-action-get-with-http-info any?
  "Retrieve Workflow Task Action Details"
  ([task_id string?, task_action string?, ] (objects-objectworkflows-tasks-task-id-actions-task-action-get-with-http-info task_id task_action nil))
  ([task_id string?, task_action string?, {:keys [loc Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params task_id task_action)
   (call-api "/objects/objectworkflows/tasks/{task_id}/actions/{task_action}" :get
             {:path-params   {"task_id" task_id "task_action" task_action }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"loc" loc }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-objectworkflows-tasks-task-id-actions-task-action-get any?
  "Retrieve Workflow Task Action Details"
  ([task_id string?, task_action string?, ] (objects-objectworkflows-tasks-task-id-actions-task-action-get task_id task_action nil))
  ([task_id string?, task_action string?, optional-params any?]
   (let [res (:data (objects-objectworkflows-tasks-task-id-actions-task-action-get-with-http-info task_id task_action optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-objectworkflows-tasks-task-id-actions-undoaccept-post-with-http-info any?
  "Undo Workflow Task Acceptance"
  ([task_id string?, ] (objects-objectworkflows-tasks-task-id-actions-undoaccept-post-with-http-info task_id nil))
  ([task_id string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params task_id)
   (call-api "/objects/objectworkflows/tasks/{task_id}/actions/undoaccept" :post
             {:path-params   {"task_id" task_id }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-objectworkflows-tasks-task-id-actions-undoaccept-post any?
  "Undo Workflow Task Acceptance"
  ([task_id string?, ] (objects-objectworkflows-tasks-task-id-actions-undoaccept-post task_id nil))
  ([task_id string?, optional-params any?]
   (let [res (:data (objects-objectworkflows-tasks-task-id-actions-undoaccept-post-with-http-info task_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-objectworkflows-tasks-task-id-actions-updateduedate-post-with-http-info any?
  "Update Workflow Task Due Date"
  ([task_id string?, ] (objects-objectworkflows-tasks-task-id-actions-updateduedate-post-with-http-info task_id nil))
  ([task_id string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params task_id)
   (call-api "/objects/objectworkflows/tasks/{task_id}/actions/updateduedate" :post
             {:path-params   {"task_id" task_id }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-objectworkflows-tasks-task-id-actions-updateduedate-post any?
  "Update Workflow Task Due Date"
  ([task_id string?, ] (objects-objectworkflows-tasks-task-id-actions-updateduedate-post task_id nil))
  ([task_id string?, optional-params any?]
   (let [res (:data (objects-objectworkflows-tasks-task-id-actions-updateduedate-post-with-http-info task_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-objectworkflows-tasks-task-id-get-with-http-info any?
  "Retrieve Workflow Task Details"
  ([task_id string?, ] (objects-objectworkflows-tasks-task-id-get-with-http-info task_id nil))
  ([task_id string?, {:keys [loc Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params task_id)
   (call-api "/objects/objectworkflows/tasks/{task_id}" :get
             {:path-params   {"task_id" task_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"loc" loc }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-objectworkflows-tasks-task-id-get any?
  "Retrieve Workflow Task Details"
  ([task_id string?, ] (objects-objectworkflows-tasks-task-id-get task_id nil))
  ([task_id string?, optional-params any?]
   (let [res (:data (objects-objectworkflows-tasks-task-id-get-with-http-info task_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-objectworkflows-workflow-id-actions-get-with-http-info any?
  "Retrieve Workflow Actions"
  ([workflow_id string?, ] (objects-objectworkflows-workflow-id-actions-get-with-http-info workflow_id nil))
  ([workflow_id string?, {:keys [loc Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params workflow_id)
   (call-api "/objects/objectworkflows/{workflow_id}/actions" :get
             {:path-params   {"workflow_id" workflow_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"loc" loc }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-objectworkflows-workflow-id-actions-get any?
  "Retrieve Workflow Actions"
  ([workflow_id string?, ] (objects-objectworkflows-workflow-id-actions-get workflow_id nil))
  ([workflow_id string?, optional-params any?]
   (let [res (:data (objects-objectworkflows-workflow-id-actions-get-with-http-info workflow_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-objectworkflows-workflow-id-actions-workflow-action-get-with-http-info any?
  "Retrieve Workflow Action Details"
  ([workflow_id string?, workflow_action string?, ] (objects-objectworkflows-workflow-id-actions-workflow-action-get-with-http-info workflow_id workflow_action nil))
  ([workflow_id string?, workflow_action string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params workflow_id workflow_action)
   (call-api "/objects/objectworkflows/{workflow_id}/actions/{workflow_action}" :get
             {:path-params   {"workflow_id" workflow_id "workflow_action" workflow_action }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-objectworkflows-workflow-id-actions-workflow-action-get any?
  "Retrieve Workflow Action Details"
  ([workflow_id string?, workflow_action string?, ] (objects-objectworkflows-workflow-id-actions-workflow-action-get workflow_id workflow_action nil))
  ([workflow_id string?, workflow_action string?, optional-params any?]
   (let [res (:data (objects-objectworkflows-workflow-id-actions-workflow-action-get-with-http-info workflow_id workflow_action optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-objectworkflows-workflow-id-actions-workflow-action-post-with-http-info any?
  "Initiate Workflow Action"
  ([workflow_id string?, workflow_action string?, ] (objects-objectworkflows-workflow-id-actions-workflow-action-post-with-http-info workflow_id workflow_action nil))
  ([workflow_id string?, workflow_action string?, {:keys [documents__sys Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params workflow_id workflow_action)
   (call-api "/objects/objectworkflows/{workflow_id}/actions/{workflow_action}" :post
             {:path-params   {"workflow_id" workflow_id "workflow_action" workflow_action }
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"documents__sys" documents__sys }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-objectworkflows-workflow-id-actions-workflow-action-post any?
  "Initiate Workflow Action"
  ([workflow_id string?, workflow_action string?, ] (objects-objectworkflows-workflow-id-actions-workflow-action-post workflow_id workflow_action nil))
  ([workflow_id string?, workflow_action string?, optional-params any?]
   (let [res (:data (objects-objectworkflows-workflow-id-actions-workflow-action-post-with-http-info workflow_id workflow_action optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-objectworkflows-workflow-id-get-with-http-info any?
  "Retrieve Workflow Details"
  ([workflow_id string?, ] (objects-objectworkflows-workflow-id-get-with-http-info workflow_id nil))
  ([workflow_id string?, {:keys [loc Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params workflow_id)
   (call-api "/objects/objectworkflows/{workflow_id}" :get
             {:path-params   {"workflow_id" workflow_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"loc" loc }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-objectworkflows-workflow-id-get any?
  "Retrieve Workflow Details"
  ([workflow_id string?, ] (objects-objectworkflows-workflow-id-get workflow_id nil))
  ([workflow_id string?, optional-params any?]
   (let [res (:data (objects-objectworkflows-workflow-id-get-with-http-info workflow_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-picklists-get-with-http-info any?
  "Retrieve All Picklists"
  ([] (objects-picklists-get-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/picklists" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-picklists-get any?
  "Retrieve All Picklists"
  ([] (objects-picklists-get nil))
  ([optional-params any?]
   (let [res (:data (objects-picklists-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-picklists-picklist-name-get-with-http-info any?
  "Retrieve Picklist Values"
  ([picklist_name string?, ] (objects-picklists-picklist-name-get-with-http-info picklist_name nil))
  ([picklist_name string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params picklist_name)
   (call-api "/objects/picklists/{picklist_name}" :get
             {:path-params   {"picklist_name" picklist_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-picklists-picklist-name-get any?
  "Retrieve Picklist Values"
  ([picklist_name string?, ] (objects-picklists-picklist-name-get picklist_name nil))
  ([picklist_name string?, optional-params any?]
   (let [res (:data (objects-picklists-picklist-name-get-with-http-info picklist_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-picklists-picklist-name-picklist-value-name-delete-with-http-info any?
  "Inactivate Picklist Value"
  ([picklist_name string?, picklist_value_name string?, ] (objects-picklists-picklist-name-picklist-value-name-delete-with-http-info picklist_name picklist_value_name nil))
  ([picklist_name string?, picklist_value_name string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params picklist_name picklist_value_name)
   (call-api "/objects/picklists/{picklist_name}/{picklist_value_name}" :delete
             {:path-params   {"picklist_name" picklist_name "picklist_value_name" picklist_value_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-picklists-picklist-name-picklist-value-name-delete any?
  "Inactivate Picklist Value"
  ([picklist_name string?, picklist_value_name string?, ] (objects-picklists-picklist-name-picklist-value-name-delete picklist_name picklist_value_name nil))
  ([picklist_name string?, picklist_value_name string?, optional-params any?]
   (let [res (:data (objects-picklists-picklist-name-picklist-value-name-delete-with-http-info picklist_name picklist_value_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-picklists-picklist-name-picklist-value-name-put-with-http-info any?
  "Update Picklist Value"
  ([picklist_name string?, picklist_value_name string?, ] (objects-picklists-picklist-name-picklist-value-name-put-with-http-info picklist_name picklist_value_name nil))
  ([picklist_name string?, picklist_value_name string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params picklist_name picklist_value_name)
   (call-api "/objects/picklists/{picklist_name}/{picklist_value_name}" :put
             {:path-params   {"picklist_name" picklist_name "picklist_value_name" picklist_value_name }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-picklists-picklist-name-picklist-value-name-put any?
  "Update Picklist Value"
  ([picklist_name string?, picklist_value_name string?, ] (objects-picklists-picklist-name-picklist-value-name-put picklist_name picklist_value_name nil))
  ([picklist_name string?, picklist_value_name string?, optional-params any?]
   (let [res (:data (objects-picklists-picklist-name-picklist-value-name-put-with-http-info picklist_name picklist_value_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-picklists-picklist-name-post-with-http-info any?
  "Create Picklist Values"
  ([picklist_name string?, ] (objects-picklists-picklist-name-post-with-http-info picklist_name nil))
  ([picklist_name string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params picklist_name)
   (call-api "/objects/picklists/{picklist_name}" :post
             {:path-params   {"picklist_name" picklist_name }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-picklists-picklist-name-post any?
  "Create Picklist Values"
  ([picklist_name string?, ] (objects-picklists-picklist-name-post picklist_name nil))
  ([picklist_name string?, optional-params any?]
   (let [res (:data (objects-picklists-picklist-name-post-with-http-info picklist_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-picklists-picklist-name-put-with-http-info any?
  "Update Picklist Value Label"
  ([picklist_name string?, ] (objects-picklists-picklist-name-put-with-http-info picklist_name nil))
  ([picklist_name string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params picklist_name)
   (call-api "/objects/picklists/{picklist_name}" :put
             {:path-params   {"picklist_name" picklist_name }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-picklists-picklist-name-put any?
  "Update Picklist Value Label"
  ([picklist_name string?, ] (objects-picklists-picklist-name-put picklist_name nil))
  ([picklist_name string?, optional-params any?]
   (let [res (:data (objects-picklists-picklist-name-put-with-http-info picklist_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-sandbox-actions-buildproduction-post-with-http-info any?
  "Build Production Vault"
  ([] (objects-sandbox-actions-buildproduction-post-with-http-info nil))
  ([{:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/sandbox/actions/buildproduction" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-sandbox-actions-buildproduction-post any?
  "Build Production Vault"
  ([] (objects-sandbox-actions-buildproduction-post nil))
  ([optional-params any?]
   (let [res (:data (objects-sandbox-actions-buildproduction-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-sandbox-actions-promoteproduction-post-with-http-info any?
  "Promote to Production"
  ([] (objects-sandbox-actions-promoteproduction-post-with-http-info nil))
  ([{:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/sandbox/actions/promoteproduction" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-sandbox-actions-promoteproduction-post any?
  "Promote to Production"
  ([] (objects-sandbox-actions-promoteproduction-post nil))
  ([optional-params any?]
   (let [res (:data (objects-sandbox-actions-promoteproduction-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-sandbox-actions-recheckusage-post-with-http-info any?
  "Recheck Sandbox Usage Limit"
  ([] (objects-sandbox-actions-recheckusage-post-with-http-info nil))
  ([{:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/sandbox/actions/recheckusage" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-sandbox-actions-recheckusage-post any?
  "Recheck Sandbox Usage Limit"
  ([] (objects-sandbox-actions-recheckusage-post nil))
  ([optional-params any?]
   (let [res (:data (objects-sandbox-actions-recheckusage-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-sandbox-batch-changesize-post-with-http-info any?
  "Change Sandbox Size"
  ([] (objects-sandbox-batch-changesize-post-with-http-info nil))
  ([{:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/sandbox/batch/changesize" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-sandbox-batch-changesize-post any?
  "Change Sandbox Size"
  ([] (objects-sandbox-batch-changesize-post nil))
  ([optional-params any?]
   (let [res (:data (objects-sandbox-batch-changesize-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-sandbox-entitlements-set-post-with-http-info any?
  "Set Sandbox Entitlements"
  ([] (objects-sandbox-entitlements-set-post-with-http-info nil))
  ([{:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/sandbox/entitlements/set" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-sandbox-entitlements-set-post any?
  "Set Sandbox Entitlements"
  ([] (objects-sandbox-entitlements-set-post nil))
  ([optional-params any?]
   (let [res (:data (objects-sandbox-entitlements-set-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-sandbox-get-with-http-info any?
  "Retrieve Sandboxes"
  ([] (objects-sandbox-get-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/sandbox" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-sandbox-get any?
  "Retrieve Sandboxes"
  ([] (objects-sandbox-get nil))
  ([optional-params any?]
   (let [res (:data (objects-sandbox-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-sandbox-name-delete-with-http-info any?
  "Delete Sandbox"
  ([name string?, ] (objects-sandbox-name-delete-with-http-info name nil))
  ([name string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/objects/sandbox/{name}" :delete
             {:path-params   {"name" name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-sandbox-name-delete any?
  "Delete Sandbox"
  ([name string?, ] (objects-sandbox-name-delete name nil))
  ([name string?, optional-params any?]
   (let [res (:data (objects-sandbox-name-delete-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-sandbox-post-with-http-info any?
  "Create or Refresh Sandbox"
  ([] (objects-sandbox-post-with-http-info nil))
  ([{:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/sandbox" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-sandbox-post any?
  "Create or Refresh Sandbox"
  ([] (objects-sandbox-post nil))
  ([optional-params any?]
   (let [res (:data (objects-sandbox-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-sandbox-snapshot-api-name-actions-update-post-with-http-info any?
  "Update Sandbox Snapshot"
  ([api_name string?, ] (objects-sandbox-snapshot-api-name-actions-update-post-with-http-info api_name nil))
  ([api_name string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params api_name)
   (call-api "/objects/sandbox/snapshot/{api_name}/actions/update" :post
             {:path-params   {"api_name" api_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-sandbox-snapshot-api-name-actions-update-post any?
  "Update Sandbox Snapshot"
  ([api_name string?, ] (objects-sandbox-snapshot-api-name-actions-update-post api_name nil))
  ([api_name string?, optional-params any?]
   (let [res (:data (objects-sandbox-snapshot-api-name-actions-update-post-with-http-info api_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-sandbox-snapshot-api-name-actions-upgrade-post-with-http-info any?
  "Upgrade Sandbox Snapshot"
  ([api_name string?, ] (objects-sandbox-snapshot-api-name-actions-upgrade-post-with-http-info api_name nil))
  ([api_name string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params api_name)
   (call-api "/objects/sandbox/snapshot/{api_name}/actions/upgrade" :post
             {:path-params   {"api_name" api_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-sandbox-snapshot-api-name-actions-upgrade-post any?
  "Upgrade Sandbox Snapshot"
  ([api_name string?, ] (objects-sandbox-snapshot-api-name-actions-upgrade-post api_name nil))
  ([api_name string?, optional-params any?]
   (let [res (:data (objects-sandbox-snapshot-api-name-actions-upgrade-post-with-http-info api_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-sandbox-snapshot-api-name-delete-with-http-info any?
  "Delete Sandbox Snapshot"
  ([api_name string?, ] (objects-sandbox-snapshot-api-name-delete-with-http-info api_name nil))
  ([api_name string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params api_name)
   (call-api "/objects/sandbox/snapshot/{api_name}" :delete
             {:path-params   {"api_name" api_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-sandbox-snapshot-api-name-delete any?
  "Delete Sandbox Snapshot"
  ([api_name string?, ] (objects-sandbox-snapshot-api-name-delete api_name nil))
  ([api_name string?, optional-params any?]
   (let [res (:data (objects-sandbox-snapshot-api-name-delete-with-http-info api_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-sandbox-snapshot-get-with-http-info any?
  "Retrieve Sandbox Snapshots"
  ([] (objects-sandbox-snapshot-get-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/sandbox/snapshot" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-sandbox-snapshot-get any?
  "Retrieve Sandbox Snapshots"
  ([] (objects-sandbox-snapshot-get nil))
  ([optional-params any?]
   (let [res (:data (objects-sandbox-snapshot-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-sandbox-snapshot-post-with-http-info any?
  "Create Sandbox Snapshot"
  ([] (objects-sandbox-snapshot-post-with-http-info nil))
  ([{:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/sandbox/snapshot" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-sandbox-snapshot-post any?
  "Create Sandbox Snapshot"
  ([] (objects-sandbox-snapshot-post nil))
  ([optional-params any?]
   (let [res (:data (objects-sandbox-snapshot-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-sandbox-vault-id-actions-refresh-post-with-http-info any?
  "Refresh Sandbox from Snapshot"
  ([vault_id string?, ] (objects-sandbox-vault-id-actions-refresh-post-with-http-info vault_id nil))
  ([vault_id string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params vault_id)
   (call-api "/objects/sandbox/{vault_id}/actions/refresh" :post
             {:path-params   {"vault_id" vault_id }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-sandbox-vault-id-actions-refresh-post any?
  "Refresh Sandbox from Snapshot"
  ([vault_id string?, ] (objects-sandbox-vault-id-actions-refresh-post vault_id nil))
  ([vault_id string?, optional-params any?]
   (let [res (:data (objects-sandbox-vault-id-actions-refresh-post-with-http-info vault_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-sandbox-vault-id-get-with-http-info any?
  "Retrieve Sandbox Details by ID"
  ([vault_id string?, ] (objects-sandbox-vault-id-get-with-http-info vault_id nil))
  ([vault_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params vault_id)
   (call-api "/objects/sandbox/{vault_id}" :get
             {:path-params   {"vault_id" vault_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-sandbox-vault-id-get any?
  "Retrieve Sandbox Details by ID"
  ([vault_id string?, ] (objects-sandbox-vault-id-get vault_id nil))
  ([vault_id string?, optional-params any?]
   (let [res (:data (objects-sandbox-vault-id-get-with-http-info vault_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-securitypolicies-get-with-http-info any?
  "Retrieve All Security Policies"
  ([] (objects-securitypolicies-get-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/securitypolicies" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-securitypolicies-get any?
  "Retrieve All Security Policies"
  ([] (objects-securitypolicies-get nil))
  ([optional-params any?]
   (let [res (:data (objects-securitypolicies-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-securitypolicies-security-policy-name-get-with-http-info any?
  "Retrieve Security Policy"
  ([security_policy_name string?, ] (objects-securitypolicies-security-policy-name-get-with-http-info security_policy_name nil))
  ([security_policy_name string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params security_policy_name)
   (call-api "/objects/securitypolicies/{security_policy_name}" :get
             {:path-params   {"security_policy_name" security_policy_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-securitypolicies-security-policy-name-get any?
  "Retrieve Security Policy"
  ([security_policy_name string?, ] (objects-securitypolicies-security-policy-name-get security_policy_name nil))
  ([security_policy_name string?, optional-params any?]
   (let [res (:data (objects-securitypolicies-security-policy-name-get-with-http-info security_policy_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-users-get-with-http-info any?
  "Retrieve All Users"
  ([] (objects-users-get-with-http-info nil))
  ([{:keys [vaults exclude_vault_membership exclude_app_licensing Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/users/" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"vaults" vaults "exclude_vault_membership" exclude_vault_membership "exclude_app_licensing" exclude_app_licensing }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-users-get any?
  "Retrieve All Users"
  ([] (objects-users-get nil))
  ([optional-params any?]
   (let [res (:data (objects-users-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-users-id-get-with-http-info any?
  "Retrieve User"
  ([id string?, ] (objects-users-id-get-with-http-info id nil))
  ([id string?, {:keys [exclude_vault_membership exclude_app_licensing Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params id)
   (call-api "/objects/users/{id}" :get
             {:path-params   {"id" id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"exclude_vault_membership" exclude_vault_membership "exclude_app_licensing" exclude_app_licensing }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-users-id-get any?
  "Retrieve User"
  ([id string?, ] (objects-users-id-get id nil))
  ([id string?, optional-params any?]
   (let [res (:data (objects-users-id-get-with-http-info id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-users-id-permissions-get-with-http-info any?
  "Retrieve User Permissions"
  ([id string?, ] (objects-users-id-permissions-get-with-http-info id nil))
  ([id string?, {:keys [filter Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params id)
   (call-api "/objects/users/{id}/permissions" :get
             {:path-params   {"id" id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"filter" filter }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-users-id-permissions-get any?
  "Retrieve User Permissions"
  ([id string?, ] (objects-users-id-permissions-get id nil))
  ([id string?, optional-params any?]
   (let [res (:data (objects-users-id-permissions-get-with-http-info id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-users-id-put-with-http-info any?
  "Update Single User"
  ([id string?, ] (objects-users-id-put-with-http-info id nil))
  ([id string?, {:keys [Authorization Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params id)
   (call-api "/objects/users/{id}" :put
             {:path-params   {"id" id }
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-users-id-put any?
  "Update Single User"
  ([id string?, ] (objects-users-id-put id nil))
  ([id string?, optional-params any?]
   (let [res (:data (objects-users-id-put-with-http-info id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-users-me-get-with-http-info any?
  "Validate Session User"
  ([] (objects-users-me-get-with-http-info nil))
  ([{:keys [exclude_vault_membership exclude_app_licensing Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/users/me" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"exclude_vault_membership" exclude_vault_membership "exclude_app_licensing" exclude_app_licensing }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-users-me-get any?
  "Validate Session User"
  ([] (objects-users-me-get nil))
  ([optional-params any?]
   (let [res (:data (objects-users-me-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-users-me-password-post-with-http-info any?
  "Change My Password"
  ([] (objects-users-me-password-post-with-http-info nil))
  ([{:keys [Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/users/me/password" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-users-me-password-post any?
  "Change My Password"
  ([] (objects-users-me-password-post nil))
  ([optional-params any?]
   (let [res (:data (objects-users-me-password-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-users-me-permissions-get-with-http-info any?
  "Retrieve My User Permissions"
  ([] (objects-users-me-permissions-get-with-http-info nil))
  ([{:keys [filter Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/users/me/permissions" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"filter" filter }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-users-me-permissions-get any?
  "Retrieve My User Permissions"
  ([] (objects-users-me-permissions-get nil))
  ([optional-params any?]
   (let [res (:data (objects-users-me-permissions-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-users-me-put-with-http-info any?
  "Update My User"
  ([] (objects-users-me-put-with-http-info nil))
  ([{:keys [Authorization Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/users/me" :put
             {:path-params   {}
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-users-me-put any?
  "Update My User"
  ([] (objects-users-me-put nil))
  ([optional-params any?]
   (let [res (:data (objects-users-me-put-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-users-post-with-http-info any?
  "Create Single User"
  ([] (objects-users-post-with-http-info nil))
  ([{:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/users" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-users-post any?
  "Create Single User"
  ([] (objects-users-post nil))
  ([optional-params any?]
   (let [res (:data (objects-users-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-users-put-with-http-info any?
  "Update Multiple Users"
  ([] (objects-users-put-with-http-info nil))
  ([{:keys [Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/users" :put
             {:path-params   {}
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-users-put any?
  "Update Multiple Users"
  ([] (objects-users-put nil))
  ([optional-params any?]
   (let [res (:data (objects-users-put-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-users-user-id-delete-with-http-info any?
  "Disable User"
  ([user_id string?, ] (objects-users-user-id-delete-with-http-info user_id nil))
  ([user_id string?, {:keys [domain Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params user_id)
   (call-api "/objects/users/{user_id}" :delete
             {:path-params   {"user_id" user_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"domain" domain }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-users-user-id-delete any?
  "Disable User"
  ([user_id string?, ] (objects-users-user-id-delete user_id nil))
  ([user_id string?, optional-params any?]
   (let [res (:data (objects-users-user-id-delete-with-http-info user_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-users-user-id-vault-membership-vault-id-put-with-http-info any?
  "Update Vault Membership"
  ([user_id string?, vault_id string?, ] (objects-users-user-id-vault-membership-vault-id-put-with-http-info user_id vault_id nil))
  ([user_id string?, vault_id string?, {:keys [Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params user_id vault_id)
   (call-api "/objects/users/{user_id}/vault_membership/{vault_id}" :put
             {:path-params   {"user_id" user_id "vault_id" vault_id }
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-users-user-id-vault-membership-vault-id-put any?
  "Update Vault Membership"
  ([user_id string?, vault_id string?, ] (objects-users-user-id-vault-membership-vault-id-put user_id vault_id nil))
  ([user_id string?, vault_id string?, optional-params any?]
   (let [res (:data (objects-users-user-id-vault-membership-vault-id-put-with-http-info user_id vault_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-vault-actions-compare-post-with-http-info any?
  "Vault Compare"
  ([] (objects-vault-actions-compare-post-with-http-info nil))
  ([{:keys [Authorization Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/vault/actions/compare" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-vault-actions-compare-post any?
  "Vault Compare"
  ([] (objects-vault-actions-compare-post nil))
  ([optional-params any?]
   (let [res (:data (objects-vault-actions-compare-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec objects-vault-actions-configreport-post-with-http-info any?
  "Vault Configuration Report"
  ([] (objects-vault-actions-configreport-post-with-http-info nil))
  ([{:keys [Authorization Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/objects/vault/actions/configreport" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec objects-vault-actions-configreport-post any?
  "Vault Configuration Report"
  ([] (objects-vault-actions-configreport-post nil))
  ([optional-params any?]
   (let [res (:data (objects-vault-actions-configreport-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec query-components-post-with-http-info any?
  "Component Definition Query"
  ([] (query-components-post-with-http-info nil))
  ([{:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/query/components" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec query-components-post any?
  "Component Definition Query"
  ([] (query-components-post nil))
  ([optional-params any?]
   (let [res (:data (query-components-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec query-next-page-post-with-http-info any?
  "Next Page URL"
  ([next_page string?, ] (query-next-page-post-with-http-info next_page nil))
  ([next_page string?, {:keys [Authorization Accept X-VaultAPI-DescribeQuery Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params next_page)
   (call-api "/query/{next_page}" :post
             {:path-params   {"next_page" next_page }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-DescribeQuery" X-VaultAPI-DescribeQuery "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec query-next-page-post any?
  "Next Page URL"
  ([next_page string?, ] (query-next-page-post next_page nil))
  ([next_page string?, optional-params any?]
   (let [res (:data (query-next-page-post-with-http-info next_page optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec query-post-with-http-info any?
  "Submitting a Query"
  ([] (query-post-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-DescribeQuery Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/query" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-DescribeQuery" X-VaultAPI-DescribeQuery "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec query-post any?
  "Submitting a Query"
  ([] (query-post nil))
  ([optional-params any?]
   (let [res (:data (query-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec query-previous-page-post-with-http-info any?
  "Previous Page URL"
  ([previous_page string?, ] (query-previous-page-post-with-http-info previous_page nil))
  ([previous_page string?, {:keys [Authorization Accept X-VaultAPI-DescribeQuery Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params previous_page)
   (call-api "/query/{previous_page}" :post
             {:path-params   {"previous_page" previous_page }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-DescribeQuery" X-VaultAPI-DescribeQuery "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec query-previous-page-post any?
  "Previous Page URL"
  ([previous_page string?, ] (query-previous-page-post previous_page nil))
  ([previous_page string?, optional-params any?]
   (let [res (:data (query-previous-page-post-with-http-info previous_page optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec scim-v2-me-get-with-http-info any?
  "Retrieve Current User with SCIM"
  ([] (scim-v2-me-get-with-http-info nil))
  ([{:keys [attributes excludedAttributes Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/scim/v2/Me" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"attributes" attributes "excludedAttributes" excludedAttributes }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec scim-v2-me-get any?
  "Retrieve Current User with SCIM"
  ([] (scim-v2-me-get nil))
  ([optional-params any?]
   (let [res (:data (scim-v2-me-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec scim-v2-me-put-with-http-info any?
  "Update Current User with SCIM"
  ([] (scim-v2-me-put-with-http-info nil))
  ([{:keys [attributes excludedAttributes Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/scim/v2/Me" :put
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"attributes" attributes "excludedAttributes" excludedAttributes }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec scim-v2-me-put any?
  "Update Current User with SCIM"
  ([] (scim-v2-me-put nil))
  ([optional-params any?]
   (let [res (:data (scim-v2-me-put-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec scim-v2-resource-types-get-with-http-info any?
  "Retrieve All SCIM Resource Types"
  ([] (scim-v2-resource-types-get-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/scim/v2/ResourceTypes" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec scim-v2-resource-types-get any?
  "Retrieve All SCIM Resource Types"
  ([] (scim-v2-resource-types-get nil))
  ([optional-params any?]
   (let [res (:data (scim-v2-resource-types-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec scim-v2-resource-types-type-get-with-http-info any?
  "Retrieve Single SCIM Resource Type"
  ([type string?, ] (scim-v2-resource-types-type-get-with-http-info type nil))
  ([type string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params type)
   (call-api "/scim/v2/ResourceTypes/{type}" :get
             {:path-params   {"type" type }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec scim-v2-resource-types-type-get any?
  "Retrieve Single SCIM Resource Type"
  ([type string?, ] (scim-v2-resource-types-type-get type nil))
  ([type string?, optional-params any?]
   (let [res (:data (scim-v2-resource-types-type-get-with-http-info type optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec scim-v2-schemas-get-with-http-info any?
  "Retrieve All SCIM Schema Information"
  ([] (scim-v2-schemas-get-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/scim/v2/Schemas" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec scim-v2-schemas-get any?
  "Retrieve All SCIM Schema Information"
  ([] (scim-v2-schemas-get nil))
  ([optional-params any?]
   (let [res (:data (scim-v2-schemas-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec scim-v2-schemas-id-get-with-http-info any?
  "Retrieve Single SCIM Schema Information"
  ([id string?, ] (scim-v2-schemas-id-get-with-http-info id nil))
  ([id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params id)
   (call-api "/scim/v2/Schemas/{id}" :get
             {:path-params   {"id" id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec scim-v2-schemas-id-get any?
  "Retrieve Single SCIM Schema Information"
  ([id string?, ] (scim-v2-schemas-id-get id nil))
  ([id string?, optional-params any?]
   (let [res (:data (scim-v2-schemas-id-get-with-http-info id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec scim-v2-service-provider-config-get-with-http-info any?
  "Retrieve SCIM Provider"
  ([] (scim-v2-service-provider-config-get-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/scim/v2/ServiceProviderConfig" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec scim-v2-service-provider-config-get any?
  "Retrieve SCIM Provider"
  ([] (scim-v2-service-provider-config-get nil))
  ([optional-params any?]
   (let [res (:data (scim-v2-service-provider-config-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec scim-v2-type-get-with-http-info any?
  "Retrieve SCIM Resources"
  ([type string?, ] (scim-v2-type-get-with-http-info type nil))
  ([type string?, {:keys [filter attributes excludedAttributes sortBy sortOrder startIndex Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params type)
   (call-api "/scim/v2/{type}" :get
             {:path-params   {"type" type }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"filter" filter "attributes" attributes "excludedAttributes" excludedAttributes "sortBy" sortBy "sortOrder" sortOrder "startIndex" startIndex }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec scim-v2-type-get any?
  "Retrieve SCIM Resources"
  ([type string?, ] (scim-v2-type-get type nil))
  ([type string?, optional-params any?]
   (let [res (:data (scim-v2-type-get-with-http-info type optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec scim-v2-type-id-get-with-http-info any?
  "Retrieve Single SCIM Resource"
  ([type string?, id string?, ] (scim-v2-type-id-get-with-http-info type id nil))
  ([type string?, id string?, {:keys [attributes excludedAttributes Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params type id)
   (call-api "/scim/v2/{type}/{id}" :get
             {:path-params   {"type" type "id" id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"attributes" attributes "excludedAttributes" excludedAttributes }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec scim-v2-type-id-get any?
  "Retrieve Single SCIM Resource"
  ([type string?, id string?, ] (scim-v2-type-id-get type id nil))
  ([type string?, id string?, optional-params any?]
   (let [res (:data (scim-v2-type-id-get-with-http-info type id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec scim-v2-users-get-with-http-info any?
  "Retrieve All Users with SCIM"
  ([] (scim-v2-users-get-with-http-info nil))
  ([{:keys [filter attributes excludedAttributes sortBy sortOrder count startIndex Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/scim/v2/Users" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"filter" filter "attributes" attributes "excludedAttributes" excludedAttributes "sortBy" sortBy "sortOrder" sortOrder "count" count "startIndex" startIndex }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec scim-v2-users-get any?
  "Retrieve All Users with SCIM"
  ([] (scim-v2-users-get nil))
  ([optional-params any?]
   (let [res (:data (scim-v2-users-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec scim-v2-users-id-get-with-http-info any?
  "Retrieve Single User with SCIM"
  ([id string?, ] (scim-v2-users-id-get-with-http-info id nil))
  ([id string?, {:keys [filter attributes excludedAttributes Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params id)
   (call-api "/scim/v2/Users/{id}" :get
             {:path-params   {"id" id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"filter" filter "attributes" attributes "excludedAttributes" excludedAttributes }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec scim-v2-users-id-get any?
  "Retrieve Single User with SCIM"
  ([id string?, ] (scim-v2-users-id-get id nil))
  ([id string?, optional-params any?]
   (let [res (:data (scim-v2-users-id-get-with-http-info id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec scim-v2-users-id-put-with-http-info any?
  "Update User with SCIM"
  ([id string?, ] (scim-v2-users-id-put-with-http-info id nil))
  ([id string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params id)
   (call-api "/scim/v2/Users/{id}" :put
             {:path-params   {"id" id }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec scim-v2-users-id-put any?
  "Update User with SCIM"
  ([id string?, ] (scim-v2-users-id-put id nil))
  ([id string?, optional-params any?]
   (let [res (:data (scim-v2-users-id-put-with-http-info id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec scim-v2-users-post-with-http-info any?
  "Create User with SCIM"
  ([] (scim-v2-users-post-with-http-info nil))
  ([{:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/scim/v2/Users" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec scim-v2-users-post any?
  "Create User with SCIM"
  ([] (scim-v2-users-post nil))
  ([optional-params any?]
   (let [res (:data (scim-v2-users-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-certificate-cert-id-get-with-http-info any?
  "Retrieve Signing Certificate"
  ([cert_id string?, ] (services-certificate-cert-id-get-with-http-info cert_id nil))
  ([cert_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params cert_id)
   (call-api "/services/certificate/{cert_id}" :get
             {:path-params   {"cert_id" cert_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-certificate-cert-id-get any?
  "Retrieve Signing Certificate"
  ([cert_id string?, ] (services-certificate-cert-id-get cert_id nil))
  ([cert_id string?, optional-params any?]
   (let [res (:data (services-certificate-cert-id-get-with-http-info cert_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-configuration-mode-actions-disable-post-with-http-info any?
  "Disable Configuration Mode"
  ([] (services-configuration-mode-actions-disable-post-with-http-info nil))
  ([{:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/services/configuration_mode/actions/disable" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-configuration-mode-actions-disable-post any?
  "Disable Configuration Mode"
  ([] (services-configuration-mode-actions-disable-post nil))
  ([optional-params any?]
   (let [res (:data (services-configuration-mode-actions-disable-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-configuration-mode-actions-enable-post-with-http-info any?
  "Enable Configuration Mode"
  ([] (services-configuration-mode-actions-enable-post-with-http-info nil))
  ([{:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/services/configuration_mode/actions/enable" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-configuration-mode-actions-enable-post any?
  "Enable Configuration Mode"
  ([] (services-configuration-mode-actions-enable-post nil))
  ([optional-params any?]
   (let [res (:data (services-configuration-mode-actions-enable-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-directdata-files-get-with-http-info any?
  "Retrieve Available Direct Data Files"
  ([] (services-directdata-files-get-with-http-info nil))
  ([{:keys [extract_type start_time stop_time Accept Authorization X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/services/directdata/files" :get
             {:path-params   {}
              :header-params {"Accept" Accept "Authorization" Authorization "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"extract_type" extract_type "start_time" start_time "stop_time" stop_time }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-directdata-files-get any?
  "Retrieve Available Direct Data Files"
  ([] (services-directdata-files-get nil))
  ([optional-params any?]
   (let [res (:data (services-directdata-files-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-directdata-files-name-get-with-http-info any?
  "Download Direct Data File"
  ([name string?, ] (services-directdata-files-name-get-with-http-info name nil))
  ([name string?, {:keys [Accept Authorization X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params name)
   (call-api "/services/directdata/files/{name}" :get
             {:path-params   {"name" name }
              :header-params {"Accept" Accept "Authorization" Authorization "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-directdata-files-name-get any?
  "Download Direct Data File"
  ([name string?, ] (services-directdata-files-name-get name nil))
  ([name string?, optional-params any?]
   (let [res (:data (services-directdata-files-name-get-with-http-info name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-file-staging-items-content-item-get-with-http-info any?
  "Download Item Content"
  ([item string?, ] (services-file-staging-items-content-item-get-with-http-info item nil))
  ([item string?, {:keys [Authorization Accept Range X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params item)
   (call-api "/services/file_staging/items/content/{item}" :get
             {:path-params   {"item" item }
              :header-params {"Authorization" Authorization "Accept" Accept "Range" Range "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-file-staging-items-content-item-get any?
  "Download Item Content"
  ([item string?, ] (services-file-staging-items-content-item-get item nil))
  ([item string?, optional-params any?]
   (let [res (:data (services-file-staging-items-content-item-get-with-http-info item optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-file-staging-items-item-delete-with-http-info any?
  "Delete File or Folder"
  ([item string?, ] (services-file-staging-items-item-delete-with-http-info item nil))
  ([item string?, {:keys [recursive Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params item)
   (call-api "/services/file_staging/items/{item}" :delete
             {:path-params   {"item" item }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"recursive" recursive }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-file-staging-items-item-delete any?
  "Delete File or Folder"
  ([item string?, ] (services-file-staging-items-item-delete item nil))
  ([item string?, optional-params any?]
   (let [res (:data (services-file-staging-items-item-delete-with-http-info item optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-file-staging-items-item-get-with-http-info any?
  "List Items at a Path"
  ([item string?, ] (services-file-staging-items-item-get-with-http-info item nil))
  ([item string?, {:keys [recursive limit format_result Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params item)
   (call-api "/services/file_staging/items/{item}" :get
             {:path-params   {"item" item }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"recursive" recursive "limit" limit "format_result" format_result }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-file-staging-items-item-get any?
  "List Items at a Path"
  ([item string?, ] (services-file-staging-items-item-get item nil))
  ([item string?, optional-params any?]
   (let [res (:data (services-file-staging-items-item-get-with-http-info item optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-file-staging-items-item-put-with-http-info any?
  "Update Folder or File"
  ([item string?, ] (services-file-staging-items-item-put-with-http-info item nil))
  ([item string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params item)
   (call-api "/services/file_staging/items/{item}" :put
             {:path-params   {"item" item }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-file-staging-items-item-put any?
  "Update Folder or File"
  ([item string?, ] (services-file-staging-items-item-put item nil))
  ([item string?, optional-params any?]
   (let [res (:data (services-file-staging-items-item-put-with-http-info item optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-file-staging-items-post-with-http-info any?
  "Create Folder or File"
  ([] (services-file-staging-items-post-with-http-info nil))
  ([{:keys [Authorization Accept Content-MD5 X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/services/file_staging/items" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-MD5" Content-MD5 "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-file-staging-items-post any?
  "Create Folder or File"
  ([] (services-file-staging-items-post nil))
  ([optional-params any?]
   (let [res (:data (services-file-staging-items-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-file-staging-upload-get-with-http-info any?
  "List Upload Sessions"
  ([] (services-file-staging-upload-get-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/services/file_staging/upload/" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-file-staging-upload-get any?
  "List Upload Sessions"
  ([] (services-file-staging-upload-get nil))
  ([optional-params any?]
   (let [res (:data (services-file-staging-upload-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-file-staging-upload-post-with-http-info any?
  "Create Resumable Upload Session"
  ([] (services-file-staging-upload-post-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/services/file_staging/upload" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-file-staging-upload-post any?
  "Create Resumable Upload Session"
  ([] (services-file-staging-upload-post nil))
  ([optional-params any?]
   (let [res (:data (services-file-staging-upload-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-file-staging-upload-upload-session-id-delete-with-http-info any?
  "Abort Upload Session"
  ([upload_session_id string?, ] (services-file-staging-upload-upload-session-id-delete-with-http-info upload_session_id nil))
  ([upload_session_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params upload_session_id)
   (call-api "/services/file_staging/upload/{upload_session_id}" :delete
             {:path-params   {"upload_session_id" upload_session_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-file-staging-upload-upload-session-id-delete any?
  "Abort Upload Session"
  ([upload_session_id string?, ] (services-file-staging-upload-upload-session-id-delete upload_session_id nil))
  ([upload_session_id string?, optional-params any?]
   (let [res (:data (services-file-staging-upload-upload-session-id-delete-with-http-info upload_session_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-file-staging-upload-upload-session-id-get-with-http-info any?
  "Get Upload Session Details"
  ([upload_session_id string?, ] (services-file-staging-upload-upload-session-id-get-with-http-info upload_session_id nil))
  ([upload_session_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params upload_session_id)
   (call-api "/services/file_staging/upload/{upload_session_id}" :get
             {:path-params   {"upload_session_id" upload_session_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-file-staging-upload-upload-session-id-get any?
  "Get Upload Session Details"
  ([upload_session_id string?, ] (services-file-staging-upload-upload-session-id-get upload_session_id nil))
  ([upload_session_id string?, optional-params any?]
   (let [res (:data (services-file-staging-upload-upload-session-id-get-with-http-info upload_session_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-file-staging-upload-upload-session-id-parts-get-with-http-info any?
  "List File Parts Uploaded to Session"
  ([upload_session_id string?, ] (services-file-staging-upload-upload-session-id-parts-get-with-http-info upload_session_id nil))
  ([upload_session_id string?, {:keys [limit Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params upload_session_id)
   (call-api "/services/file_staging/upload/{upload_session_id}/parts" :get
             {:path-params   {"upload_session_id" upload_session_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"limit" limit }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-file-staging-upload-upload-session-id-parts-get any?
  "List File Parts Uploaded to Session"
  ([upload_session_id string?, ] (services-file-staging-upload-upload-session-id-parts-get upload_session_id nil))
  ([upload_session_id string?, optional-params any?]
   (let [res (:data (services-file-staging-upload-upload-session-id-parts-get-with-http-info upload_session_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-file-staging-upload-upload-session-id-post-with-http-info any?
  "Commit Upload Session"
  ([upload_session_id string?, ] (services-file-staging-upload-upload-session-id-post-with-http-info upload_session_id nil))
  ([upload_session_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params upload_session_id)
   (call-api "/services/file_staging/upload/{upload_session_id}" :post
             {:path-params   {"upload_session_id" upload_session_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-file-staging-upload-upload-session-id-post any?
  "Commit Upload Session"
  ([upload_session_id string?, ] (services-file-staging-upload-upload-session-id-post upload_session_id nil))
  ([upload_session_id string?, optional-params any?]
   (let [res (:data (services-file-staging-upload-upload-session-id-post-with-http-info upload_session_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-file-staging-upload-upload-session-id-put-with-http-info any?
  "Upload to a Session"
  ([upload_session_id string?, ] (services-file-staging-upload-upload-session-id-put-with-http-info upload_session_id nil))
  ([upload_session_id string?, {:keys [Authorization Accept Content-Type X-VaultAPI-FilePartNumber Content-MD5 X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params upload_session_id)
   (call-api "/services/file_staging/upload/{upload_session_id}" :put
             {:path-params   {"upload_session_id" upload_session_id }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-FilePartNumber" X-VaultAPI-FilePartNumber "Content-MD5" Content-MD5 "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-file-staging-upload-upload-session-id-put any?
  "Upload to a Session"
  ([upload_session_id string?, ] (services-file-staging-upload-upload-session-id-put upload_session_id nil))
  ([upload_session_id string?, optional-params any?]
   (let [res (:data (services-file-staging-upload-upload-session-id-put-with-http-info upload_session_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-jobs-histories-get-with-http-info any?
  "Retrieve Job Histories"
  ([] (services-jobs-histories-get-with-http-info nil))
  ([{:keys [start_date end_date status limit offset Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/services/jobs/histories" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"start_date" start_date "end_date" end_date "status" status "limit" limit "offset" offset }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-jobs-histories-get any?
  "Retrieve Job Histories"
  ([] (services-jobs-histories-get nil))
  ([optional-params any?]
   (let [res (:data (services-jobs-histories-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-jobs-job-id-errors-get-with-http-info any?
  "Retrieve Import Bulk Translation File Job Errors"
  ([job_id string?, ] (services-jobs-job-id-errors-get-with-http-info job_id nil))
  ([job_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params job_id)
   (call-api "/services/jobs/{job_id}/errors" :get
             {:path-params   {"job_id" job_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-jobs-job-id-errors-get any?
  "Retrieve Import Bulk Translation File Job Errors"
  ([job_id string?, ] (services-jobs-job-id-errors-get job_id nil))
  ([job_id string?, optional-params any?]
   (let [res (:data (services-jobs-job-id-errors-get-with-http-info job_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-jobs-job-id-get-with-http-info any?
  "Retrieve Job Status"
  ([job_id string?, ] (services-jobs-job-id-get-with-http-info job_id nil))
  ([job_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params job_id)
   (call-api "/services/jobs/{job_id}" :get
             {:path-params   {"job_id" job_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-jobs-job-id-get any?
  "Retrieve Job Status"
  ([job_id string?, ] (services-jobs-job-id-get job_id nil))
  ([job_id string?, optional-params any?]
   (let [res (:data (services-jobs-job-id-get-with-http-info job_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-jobs-job-id-summary-get-with-http-info any?
  "Retrieve Import Bulk Translation File Job Summary"
  ([job_id string?, ] (services-jobs-job-id-summary-get-with-http-info job_id nil))
  ([job_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params job_id)
   (call-api "/services/jobs/{job_id}/summary" :get
             {:path-params   {"job_id" job_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-jobs-job-id-summary-get any?
  "Retrieve Import Bulk Translation File Job Summary"
  ([job_id string?, ] (services-jobs-job-id-summary-get job_id nil))
  ([job_id string?, optional-params any?]
   (let [res (:data (services-jobs-job-id-summary-get-with-http-info job_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-jobs-job-id-tasks-get-with-http-info any?
  "Retrieve SDK Job Tasks"
  ([job_id string?, ] (services-jobs-job-id-tasks-get-with-http-info job_id nil))
  ([job_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params job_id)
   (call-api "/services/jobs/{job_id}/tasks" :get
             {:path-params   {"job_id" job_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-jobs-job-id-tasks-get any?
  "Retrieve SDK Job Tasks"
  ([job_id string?, ] (services-jobs-job-id-tasks-get job_id nil))
  ([job_id string?, optional-params any?]
   (let [res (:data (services-jobs-job-id-tasks-get-with-http-info job_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-jobs-monitors-get-with-http-info any?
  "Retrieve Job Monitors"
  ([] (services-jobs-monitors-get-with-http-info nil))
  ([{:keys [start_date end_date status limit offset Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/services/jobs/monitors" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"start_date" start_date "end_date" end_date "status" status "limit" limit "offset" offset }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-jobs-monitors-get any?
  "Retrieve Job Monitors"
  ([] (services-jobs-monitors-get nil))
  ([optional-params any?]
   (let [res (:data (services-jobs-monitors-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-jobs-start-now-job-id-post-with-http-info any?
  "Start Job"
  ([job_id string?, ] (services-jobs-start-now-job-id-post-with-http-info job_id nil))
  ([job_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params job_id)
   (call-api "/services/jobs/start_now/{job_id}" :post
             {:path-params   {"job_id" job_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-jobs-start-now-job-id-post any?
  "Start Job"
  ([job_id string?, ] (services-jobs-start-now-job-id-post job_id nil))
  ([job_id string?, optional-params any?]
   (let [res (:data (services-jobs-start-now-job-id-post-with-http-info job_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-loader-extract-post-with-http-info any?
  "Extract Data Files"
  ([] (services-loader-extract-post-with-http-info nil))
  ([{:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/services/loader/extract" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-loader-extract-post any?
  "Extract Data Files"
  ([] (services-loader-extract-post nil))
  ([optional-params any?]
   (let [res (:data (services-loader-extract-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-loader-job-id-tasks-task-id-failurelog-get-with-http-info any?
  "Retrieve Load Failure Log Results"
  ([job_id string?, task_id string?, ] (services-loader-job-id-tasks-task-id-failurelog-get-with-http-info job_id task_id nil))
  ([job_id string?, task_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params job_id task_id)
   (call-api "/services/loader/{job_id}/tasks/{task_id}/failurelog" :get
             {:path-params   {"job_id" job_id "task_id" task_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-loader-job-id-tasks-task-id-failurelog-get any?
  "Retrieve Load Failure Log Results"
  ([job_id string?, task_id string?, ] (services-loader-job-id-tasks-task-id-failurelog-get job_id task_id nil))
  ([job_id string?, task_id string?, optional-params any?]
   (let [res (:data (services-loader-job-id-tasks-task-id-failurelog-get-with-http-info job_id task_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-loader-job-id-tasks-task-id-results-get-with-http-info any?
  "Retrieve Loader Extract Results"
  ([job_id string?, task_id string?, ] (services-loader-job-id-tasks-task-id-results-get-with-http-info job_id task_id nil))
  ([job_id string?, task_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params job_id task_id)
   (call-api "/services/loader/{job_id}/tasks/{task_id}/results" :get
             {:path-params   {"job_id" job_id "task_id" task_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-loader-job-id-tasks-task-id-results-get any?
  "Retrieve Loader Extract Results"
  ([job_id string?, task_id string?, ] (services-loader-job-id-tasks-task-id-results-get job_id task_id nil))
  ([job_id string?, task_id string?, optional-params any?]
   (let [res (:data (services-loader-job-id-tasks-task-id-results-get-with-http-info job_id task_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-loader-job-id-tasks-task-id-results-renditions-get-with-http-info any?
  "Retrieve Loader Extract Renditions Results"
  ([job_id string?, task_id string?, ] (services-loader-job-id-tasks-task-id-results-renditions-get-with-http-info job_id task_id nil))
  ([job_id string?, task_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params job_id task_id)
   (call-api "/services/loader/{job_id}/tasks/{task_id}/results/renditions" :get
             {:path-params   {"job_id" job_id "task_id" task_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-loader-job-id-tasks-task-id-results-renditions-get any?
  "Retrieve Loader Extract Renditions Results"
  ([job_id string?, task_id string?, ] (services-loader-job-id-tasks-task-id-results-renditions-get job_id task_id nil))
  ([job_id string?, task_id string?, optional-params any?]
   (let [res (:data (services-loader-job-id-tasks-task-id-results-renditions-get-with-http-info job_id task_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-loader-job-id-tasks-task-id-successlog-get-with-http-info any?
  "Retrieve Load Success Log Results"
  ([job_id string?, task_id string?, ] (services-loader-job-id-tasks-task-id-successlog-get-with-http-info job_id task_id nil))
  ([job_id string?, task_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params job_id task_id)
   (call-api "/services/loader/{job_id}/tasks/{task_id}/successlog" :get
             {:path-params   {"job_id" job_id "task_id" task_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-loader-job-id-tasks-task-id-successlog-get any?
  "Retrieve Load Success Log Results"
  ([job_id string?, task_id string?, ] (services-loader-job-id-tasks-task-id-successlog-get job_id task_id nil))
  ([job_id string?, task_id string?, optional-params any?]
   (let [res (:data (services-loader-job-id-tasks-task-id-successlog-get-with-http-info job_id task_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-loader-load-post-with-http-info any?
  "Load Data Objects"
  ([] (services-loader-load-post-with-http-info nil))
  ([{:keys [Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/services/loader/load" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-loader-load-post any?
  "Load Data Objects"
  ([] (services-loader-load-post nil))
  ([optional-params any?]
   (let [res (:data (services-loader-load-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-package-actions-validate-post-with-http-info any?
  "Validate Package"
  ([] (services-package-actions-validate-post-with-http-info nil))
  ([{:keys [Authorization Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/services/package/actions/validate" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-package-actions-validate-post any?
  "Validate Package"
  ([] (services-package-actions-validate-post nil))
  ([optional-params any?]
   (let [res (:data (services-package-actions-validate-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-package-post-with-http-info any?
  "Export Package"
  ([] (services-package-post-with-http-info nil))
  ([{:keys [Authorization Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/services/package" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-package-post any?
  "Export Package"
  ([] (services-package-post nil))
  ([optional-params any?]
   (let [res (:data (services-package-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-package-put-with-http-info any?
  "Import Package"
  ([] (services-package-put-with-http-info nil))
  ([{:keys [Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/services/package" :put
             {:path-params   {}
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-package-put any?
  "Import Package"
  ([] (services-package-put nil))
  ([optional-params any?]
   (let [res (:data (services-package-put-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-queues-get-with-http-info any?
  "Retrieve All Queues"
  ([] (services-queues-get-with-http-info nil))
  ([{:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/services/queues" :get
             {:path-params   {}
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-queues-get any?
  "Retrieve All Queues"
  ([] (services-queues-get nil))
  ([optional-params any?]
   (let [res (:data (services-queues-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-queues-queue-name-actions-disable-delivery-put-with-http-info any?
  "Disable Delivery"
  ([queue_name string?, ] (services-queues-queue-name-actions-disable-delivery-put-with-http-info queue_name nil))
  ([queue_name string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params queue_name)
   (call-api "/services/queues/{queue_name}/actions/disable_delivery" :put
             {:path-params   {"queue_name" queue_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-queues-queue-name-actions-disable-delivery-put any?
  "Disable Delivery"
  ([queue_name string?, ] (services-queues-queue-name-actions-disable-delivery-put queue_name nil))
  ([queue_name string?, optional-params any?]
   (let [res (:data (services-queues-queue-name-actions-disable-delivery-put-with-http-info queue_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-queues-queue-name-actions-enable-delivery-put-with-http-info any?
  "Enable Delivery"
  ([queue_name string?, ] (services-queues-queue-name-actions-enable-delivery-put-with-http-info queue_name nil))
  ([queue_name string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params queue_name)
   (call-api "/services/queues/{queue_name}/actions/enable_delivery" :put
             {:path-params   {"queue_name" queue_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-queues-queue-name-actions-enable-delivery-put any?
  "Enable Delivery"
  ([queue_name string?, ] (services-queues-queue-name-actions-enable-delivery-put queue_name nil))
  ([queue_name string?, optional-params any?]
   (let [res (:data (services-queues-queue-name-actions-enable-delivery-put-with-http-info queue_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-queues-queue-name-actions-reset-put-with-http-info any?
  "Reset Queue"
  ([queue_name string?, ] (services-queues-queue-name-actions-reset-put-with-http-info queue_name nil))
  ([queue_name string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params queue_name)
   (call-api "/services/queues/{queue_name}/actions/reset" :put
             {:path-params   {"queue_name" queue_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-queues-queue-name-actions-reset-put any?
  "Reset Queue"
  ([queue_name string?, ] (services-queues-queue-name-actions-reset-put queue_name nil))
  ([queue_name string?, optional-params any?]
   (let [res (:data (services-queues-queue-name-actions-reset-put-with-http-info queue_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-queues-queue-name-get-with-http-info any?
  "Retrieve Queue Status"
  ([queue_name string?, ] (services-queues-queue-name-get-with-http-info queue_name nil))
  ([queue_name string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params queue_name)
   (call-api "/services/queues/{queue_name}" :get
             {:path-params   {"queue_name" queue_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-queues-queue-name-get any?
  "Retrieve Queue Status"
  ([queue_name string?, ] (services-queues-queue-name-get queue_name nil))
  ([queue_name string?, optional-params any?]
   (let [res (:data (services-queues-queue-name-get-with-http-info queue_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec services-vobject-vault-package-v-package-id-actions-validate-post-with-http-info any?
  "Validate Imported Package"
  ([package_id string?, ] (services-vobject-vault-package-v-package-id-actions-validate-post-with-http-info package_id nil))
  ([package_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params package_id)
   (call-api "/services/vobject/vault_package__v/{package_id}/actions/validate" :post
             {:path-params   {"package_id" package_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec services-vobject-vault-package-v-package-id-actions-validate-post any?
  "Validate Imported Package"
  ([package_id string?, ] (services-vobject-vault-package-v-package-id-actions-validate-post package_id nil))
  ([package_id string?, optional-params any?]
   (let [res (:data (services-vobject-vault-package-v-package-id-actions-validate-post-with-http-info package_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec session-delete-with-http-info any?
  "End Session"
  ([] (session-delete-with-http-info nil))
  ([{:keys [Accept Authorization X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/session" :delete
             {:path-params   {}
              :header-params {"Accept" Accept "Authorization" Authorization "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec session-delete any?
  "End Session"
  ([] (session-delete nil))
  ([optional-params any?]
   (let [res (:data (session-delete-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec uicode-distributions-distribution-name-code-get-with-http-info any?
  "Download Single Client Code Distribution"
  ([distribution_name string?, ] (uicode-distributions-distribution-name-code-get-with-http-info distribution_name nil))
  ([distribution_name string?, {:keys [Accept Authorization X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params distribution_name)
   (call-api "/uicode/distributions/{distribution_name}/code" :get
             {:path-params   {"distribution_name" distribution_name }
              :header-params {"Accept" Accept "Authorization" Authorization "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec uicode-distributions-distribution-name-code-get any?
  "Download Single Client Code Distribution"
  ([distribution_name string?, ] (uicode-distributions-distribution-name-code-get distribution_name nil))
  ([distribution_name string?, optional-params any?]
   (let [res (:data (uicode-distributions-distribution-name-code-get-with-http-info distribution_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec uicode-distributions-distribution-name-delete-with-http-info any?
  "Delete Single Client Code Distribution"
  ([distribution_name string?, ] (uicode-distributions-distribution-name-delete-with-http-info distribution_name nil))
  ([distribution_name string?, {:keys [Accept Authorization X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params distribution_name)
   (call-api "/uicode/distributions/{distribution_name}" :delete
             {:path-params   {"distribution_name" distribution_name }
              :header-params {"Accept" Accept "Authorization" Authorization "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec uicode-distributions-distribution-name-delete any?
  "Delete Single Client Code Distribution"
  ([distribution_name string?, ] (uicode-distributions-distribution-name-delete distribution_name nil))
  ([distribution_name string?, optional-params any?]
   (let [res (:data (uicode-distributions-distribution-name-delete-with-http-info distribution_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec uicode-distributions-distribution-name-get-with-http-info any?
  "Retrieve Single Client Code Distribution Metadata"
  ([distribution_name string?, ] (uicode-distributions-distribution-name-get-with-http-info distribution_name nil))
  ([distribution_name string?, {:keys [Accept Authorization X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params distribution_name)
   (call-api "/uicode/distributions/{distribution_name}" :get
             {:path-params   {"distribution_name" distribution_name }
              :header-params {"Accept" Accept "Authorization" Authorization "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec uicode-distributions-distribution-name-get any?
  "Retrieve Single Client Code Distribution Metadata"
  ([distribution_name string?, ] (uicode-distributions-distribution-name-get distribution_name nil))
  ([distribution_name string?, optional-params any?]
   (let [res (:data (uicode-distributions-distribution-name-get-with-http-info distribution_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec uicode-distributions-get-with-http-info any?
  "Retrieve All Client Code Distribution Metadata"
  ([] (uicode-distributions-get-with-http-info nil))
  ([{:keys [Accept Authorization X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/uicode/distributions" :get
             {:path-params   {}
              :header-params {"Accept" Accept "Authorization" Authorization "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec uicode-distributions-get any?
  "Retrieve All Client Code Distribution Metadata"
  ([] (uicode-distributions-get nil))
  ([optional-params any?]
   (let [res (:data (uicode-distributions-get-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec uicode-distributions-post-with-http-info any?
  "Add or Replace Single Client Code Distribution"
  ([] (uicode-distributions-post-with-http-info nil))
  ([{:keys [Accept Authorization Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/uicode/distributions" :post
             {:path-params   {}
              :header-params {"Accept" Accept "Authorization" Authorization "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec uicode-distributions-post any?
  "Add or Replace Single Client Code Distribution"
  ([] (uicode-distributions-post nil))
  ([optional-params any?]
   (let [res (:data (uicode-distributions-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobject-vault-package-v-package-id-actions-deploy-post-with-http-info any?
  "Deploy Package"
  ([package_id string?, ] (vobject-vault-package-v-package-id-actions-deploy-post-with-http-info package_id nil))
  ([package_id string?, {:keys [Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params package_id)
   (call-api "/vobject/vault_package__v/{package_id}/actions/deploy" :post
             {:path-params   {"package_id" package_id }
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobject-vault-package-v-package-id-actions-deploy-post any?
  "Deploy Package"
  ([package_id string?, ] (vobject-vault-package-v-package-id-actions-deploy-post package_id nil))
  ([package_id string?, optional-params any?]
   (let [res (:data (vobject-vault-package-v-package-id-actions-deploy-post-with-http-info package_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobject-vault-package-v-package-id-actions-deploy-results-get-with-http-info any?
  "Retrieve Package Deploy Results"
  ([package_id string?, ] (vobject-vault-package-v-package-id-actions-deploy-results-get-with-http-info package_id nil))
  ([package_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params package_id)
   (call-api "/vobject/vault_package__v/{package_id}/actions/deploy/results" :get
             {:path-params   {"package_id" package_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobject-vault-package-v-package-id-actions-deploy-results-get any?
  "Retrieve Package Deploy Results"
  ([package_id string?, ] (vobject-vault-package-v-package-id-actions-deploy-results-get package_id nil))
  ([package_id string?, optional-params any?]
   (let [res (:data (vobject-vault-package-v-package-id-actions-deploy-results-get-with-http-info package_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-cascadedelete-results-object-name-job-status-job-id-get-with-http-info any?
  "Retrieve Results of Cascade Delete Job"
  ([object_name string?, job_status string?, job_id string?, ] (vobjects-cascadedelete-results-object-name-job-status-job-id-get-with-http-info object_name job_status job_id nil))
  ([object_name string?, job_status string?, job_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name job_status job_id)
   (call-api "/vobjects/cascadedelete/results/{object_name}/{job_status}/{job_id}" :get
             {:path-params   {"object_name" object_name "job_status" job_status "job_id" job_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-cascadedelete-results-object-name-job-status-job-id-get any?
  "Retrieve Results of Cascade Delete Job"
  ([object_name string?, job_status string?, job_id string?, ] (vobjects-cascadedelete-results-object-name-job-status-job-id-get object_name job_status job_id nil))
  ([object_name string?, job_status string?, job_id string?, optional-params any?]
   (let [res (:data (vobjects-cascadedelete-results-object-name-job-status-job-id-get-with-http-info object_name job_status job_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-deepcopy-results-object-name-job-status-job-id-get-with-http-info any?
  "Retrieve Results of Deep Copy Job"
  ([object_name string?, job_status string?, job_id string?, ] (vobjects-deepcopy-results-object-name-job-status-job-id-get-with-http-info object_name job_status job_id nil))
  ([object_name string?, job_status string?, job_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name job_status job_id)
   (call-api "/vobjects/deepcopy/results/{object_name}/{job_status}/{job_id}" :get
             {:path-params   {"object_name" object_name "job_status" job_status "job_id" job_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-deepcopy-results-object-name-job-status-job-id-get any?
  "Retrieve Results of Deep Copy Job"
  ([object_name string?, job_status string?, job_id string?, ] (vobjects-deepcopy-results-object-name-job-status-job-id-get object_name job_status job_id nil))
  ([object_name string?, job_status string?, job_id string?, optional-params any?]
   (let [res (:data (vobjects-deepcopy-results-object-name-job-status-job-id-get-with-http-info object_name job_status job_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-edl-item-v-actions-createplaceholder-post-with-http-info any?
  "Create a Placeholder from an EDL Item"
  ([] (vobjects-edl-item-v-actions-createplaceholder-post-with-http-info nil))
  ([{:keys [Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (call-api "/vobjects/edl_item__v/actions/createplaceholder" :post
             {:path-params   {}
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-edl-item-v-actions-createplaceholder-post any?
  "Create a Placeholder from an EDL Item"
  ([] (vobjects-edl-item-v-actions-createplaceholder-post nil))
  ([optional-params any?]
   (let [res (:data (vobjects-edl-item-v-actions-createplaceholder-post-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-merges-job-id-log-get-with-http-info any?
  "Download Merge Records Job Log"
  ([job_id string?, ] (vobjects-merges-job-id-log-get-with-http-info job_id nil))
  ([job_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params job_id)
   (call-api "/vobjects/merges/{job_id}/log" :get
             {:path-params   {"job_id" job_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-merges-job-id-log-get any?
  "Download Merge Records Job Log"
  ([job_id string?, ] (vobjects-merges-job-id-log-get job_id nil))
  ([job_id string?, optional-params any?]
   (let [res (:data (vobjects-merges-job-id-log-get-with-http-info job_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-merges-job-id-results-get-with-http-info any?
  "Retrieve Record Merge Results"
  ([job_id string?, ] (vobjects-merges-job-id-results-get-with-http-info job_id nil))
  ([job_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params job_id)
   (call-api "/vobjects/merges/{job_id}/results" :get
             {:path-params   {"job_id" job_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-merges-job-id-results-get any?
  "Retrieve Record Merge Results"
  ([job_id string?, ] (vobjects-merges-job-id-results-get job_id nil))
  ([job_id string?, optional-params any?]
   (let [res (:data (vobjects-merges-job-id-results-get-with-http-info job_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-merges-job-id-status-get-with-http-info any?
  "Retrieve Record Merge Status"
  ([job_id string?, ] (vobjects-merges-job-id-status-get-with-http-info job_id nil))
  ([job_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params job_id)
   (call-api "/vobjects/merges/{job_id}/status" :get
             {:path-params   {"job_id" job_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-merges-job-id-status-get any?
  "Retrieve Record Merge Status"
  ([job_id string?, ] (vobjects-merges-job-id-status-get job_id nil))
  ([job_id string?, optional-params any?]
   (let [res (:data (vobjects-merges-job-id-status-get-with-http-info job_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-object-name-actions-action-name-post-with-http-info any?
  "Initiate Object Action on Multiple Records"
  ([object_name string?, action_name string?, ] (vobjects-object-name-actions-action-name-post-with-http-info object_name action_name nil))
  ([object_name string?, action_name string?, {:keys [Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name action_name)
   (call-api "/vobjects/{object_name}/actions/{action_name}" :post
             {:path-params   {"object_name" object_name "action_name" action_name }
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-object-name-actions-action-name-post any?
  "Initiate Object Action on Multiple Records"
  ([object_name string?, action_name string?, ] (vobjects-object-name-actions-action-name-post object_name action_name nil))
  ([object_name string?, action_name string?, optional-params any?]
   (let [res (:data (vobjects-object-name-actions-action-name-post-with-http-info object_name action_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-object-name-actions-changetype-post-with-http-info any?
  "Change Object Type"
  ([object_name string?, ] (vobjects-object-name-actions-changetype-post-with-http-info object_name nil))
  ([object_name string?, {:keys [Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name)
   (call-api "/vobjects/{object_name}/actions/changetype" :post
             {:path-params   {"object_name" object_name }
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-object-name-actions-changetype-post any?
  "Change Object Type"
  ([object_name string?, ] (vobjects-object-name-actions-changetype-post object_name nil))
  ([object_name string?, optional-params any?]
   (let [res (:data (vobjects-object-name-actions-changetype-post-with-http-info object_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-object-name-actions-merge-post-with-http-info any?
  "Initiate Record Merge"
  ([object_name string?, ] (vobjects-object-name-actions-merge-post-with-http-info object_name nil))
  ([object_name string?, {:keys [Authorization Content-Type Accept X-VaultAPI-ClientID -vobjects-object-name-actions-merge-post-request-inner]} (s/map-of keyword? any?)]
   (check-required-params object_name)
   (call-api "/vobjects/{object_name}/actions/merge" :post
             {:path-params   {"object_name" object_name }
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :body-param    -vobjects-object-name-actions-merge-post-request-inner
              :content-types ["application/json"]
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-object-name-actions-merge-post any?
  "Initiate Record Merge"
  ([object_name string?, ] (vobjects-object-name-actions-merge-post object_name nil))
  ([object_name string?, optional-params any?]
   (let [res (:data (vobjects-object-name-actions-merge-post-with-http-info object_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-object-name-actions-recalculaterollups-get-with-http-info any?
  "Retrieve Roll-up Field Recalculation Status"
  ([object_name string?, ] (vobjects-object-name-actions-recalculaterollups-get-with-http-info object_name nil))
  ([object_name string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name)
   (call-api "/vobjects/{object_name}/actions/recalculaterollups" :get
             {:path-params   {"object_name" object_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-object-name-actions-recalculaterollups-get any?
  "Retrieve Roll-up Field Recalculation Status"
  ([object_name string?, ] (vobjects-object-name-actions-recalculaterollups-get object_name nil))
  ([object_name string?, optional-params any?]
   (let [res (:data (vobjects-object-name-actions-recalculaterollups-get-with-http-info object_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-object-name-actions-recalculaterollups-post-with-http-info any?
  "Recalculate Roll-up Fields"
  ([object_name string?, ] (vobjects-object-name-actions-recalculaterollups-post-with-http-info object_name nil))
  ([object_name string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name)
   (call-api "/vobjects/{object_name}/actions/recalculaterollups" :post
             {:path-params   {"object_name" object_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-object-name-actions-recalculaterollups-post any?
  "Recalculate Roll-up Fields"
  ([object_name string?, ] (vobjects-object-name-actions-recalculaterollups-post object_name nil))
  ([object_name string?, optional-params any?]
   (let [res (:data (vobjects-object-name-actions-recalculaterollups-post-with-http-info object_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-object-name-actions-updatecorporatecurrency-put-with-http-info any?
  "Update Corporate Currency Fields"
  ([object_name string?, ] (vobjects-object-name-actions-updatecorporatecurrency-put-with-http-info object_name nil))
  ([object_name string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name)
   (call-api "/vobjects/{object_name}/actions/updatecorporatecurrency" :put
             {:path-params   {"object_name" object_name }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-object-name-actions-updatecorporatecurrency-put any?
  "Update Corporate Currency Fields"
  ([object_name string?, ] (vobjects-object-name-actions-updatecorporatecurrency-put object_name nil))
  ([object_name string?, optional-params any?]
   (let [res (:data (vobjects-object-name-actions-updatecorporatecurrency-put-with-http-info object_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-object-name-attachments-batch-delete-with-http-info any?
  "Delete Multiple Object Record Attachments"
  ([object_name string?, ] (vobjects-object-name-attachments-batch-delete-with-http-info object_name nil))
  ([object_name string?, {:keys [idParam Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name)
   (call-api "/vobjects/{object_name}/attachments/batch" :delete
             {:path-params   {"object_name" object_name }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"idParam" idParam }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-object-name-attachments-batch-delete any?
  "Delete Multiple Object Record Attachments"
  ([object_name string?, ] (vobjects-object-name-attachments-batch-delete object_name nil))
  ([object_name string?, optional-params any?]
   (let [res (:data (vobjects-object-name-attachments-batch-delete-with-http-info object_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-object-name-attachments-batch-post-with-http-info any?
  "Create Multiple Object Record Attachments"
  ([object_name string?, ] (vobjects-object-name-attachments-batch-post-with-http-info object_name nil))
  ([object_name string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name)
   (call-api "/vobjects/{object_name}/attachments/batch" :post
             {:path-params   {"object_name" object_name }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-object-name-attachments-batch-post any?
  "Create Multiple Object Record Attachments"
  ([object_name string?, ] (vobjects-object-name-attachments-batch-post object_name nil))
  ([object_name string?, optional-params any?]
   (let [res (:data (vobjects-object-name-attachments-batch-post-with-http-info object_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-object-name-attachments-batch-put-with-http-info any?
  "Update Multiple Object Record Attachment Descriptions"
  ([object_name string?, ] (vobjects-object-name-attachments-batch-put-with-http-info object_name nil))
  ([object_name string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name)
   (call-api "/vobjects/{object_name}/attachments/batch" :put
             {:path-params   {"object_name" object_name }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-object-name-attachments-batch-put any?
  "Update Multiple Object Record Attachment Descriptions"
  ([object_name string?, ] (vobjects-object-name-attachments-batch-put object_name nil))
  ([object_name string?, optional-params any?]
   (let [res (:data (vobjects-object-name-attachments-batch-put-with-http-info object_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-object-name-delete-with-http-info any?
  "Delete Object Records"
  ([object_name string?, ] (vobjects-object-name-delete-with-http-info object_name nil))
  ([object_name string?, {:keys [Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name)
   (call-api "/vobjects/{object_name}" :delete
             {:path-params   {"object_name" object_name }
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-object-name-delete any?
  "Delete Object Records"
  ([object_name string?, ] (vobjects-object-name-delete object_name nil))
  ([object_name string?, optional-params any?]
   (let [res (:data (vobjects-object-name-delete-with-http-info object_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-object-name-id-roles-role-name-get-with-http-info any?
  "Retrieve Object Record Roles"
  ([object_name string?, id string?, role_name string?, ] (vobjects-object-name-id-roles-role-name-get-with-http-info object_name id role_name nil))
  ([object_name string?, id string?, role_name string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name id role_name)
   (call-api "/vobjects/{object_name}/{id}/roles/{role_name}" :get
             {:path-params   {"object_name" object_name "id" id "role_name" role_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-object-name-id-roles-role-name-get any?
  "Retrieve Object Record Roles"
  ([object_name string?, id string?, role_name string?, ] (vobjects-object-name-id-roles-role-name-get object_name id role_name nil))
  ([object_name string?, id string?, role_name string?, optional-params any?]
   (let [res (:data (vobjects-object-name-id-roles-role-name-get-with-http-info object_name id role_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-object-name-object-record-id-actions-action-name-get-with-http-info any?
  "Retrieve Object User Actions Details"
  ([object_name string?, object_record_id string?, action_name string?, ] (vobjects-object-name-object-record-id-actions-action-name-get-with-http-info object_name object_record_id action_name nil))
  ([object_name string?, object_record_id string?, action_name string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name object_record_id action_name)
   (call-api "/vobjects/{object_name}/{object_record_id}/actions/{action_name}" :get
             {:path-params   {"object_name" object_name "object_record_id" object_record_id "action_name" action_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-object-name-object-record-id-actions-action-name-get any?
  "Retrieve Object User Actions Details"
  ([object_name string?, object_record_id string?, action_name string?, ] (vobjects-object-name-object-record-id-actions-action-name-get object_name object_record_id action_name nil))
  ([object_name string?, object_record_id string?, action_name string?, optional-params any?]
   (let [res (:data (vobjects-object-name-object-record-id-actions-action-name-get-with-http-info object_name object_record_id action_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-object-name-object-record-id-actions-action-name-post-with-http-info any?
  "Initiate Object Action on a Single Record"
  ([object_name string?, object_record_id string?, action_name string?, ] (vobjects-object-name-object-record-id-actions-action-name-post-with-http-info object_name object_record_id action_name nil))
  ([object_name string?, object_record_id string?, action_name string?, {:keys [Authorization Content-Type Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name object_record_id action_name)
   (call-api "/vobjects/{object_name}/{object_record_id}/actions/{action_name}" :post
             {:path-params   {"object_name" object_name "object_record_id" object_record_id "action_name" action_name }
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-object-name-object-record-id-actions-action-name-post any?
  "Initiate Object Action on a Single Record"
  ([object_name string?, object_record_id string?, action_name string?, ] (vobjects-object-name-object-record-id-actions-action-name-post object_name object_record_id action_name nil))
  ([object_name string?, object_record_id string?, action_name string?, optional-params any?]
   (let [res (:data (vobjects-object-name-object-record-id-actions-action-name-post-with-http-info object_name object_record_id action_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-object-name-object-record-id-actions-cascadedelete-post-with-http-info any?
  "Cascade Delete Object Record"
  ([object_name string?, object_record_id string?, ] (vobjects-object-name-object-record-id-actions-cascadedelete-post-with-http-info object_name object_record_id nil))
  ([object_name string?, object_record_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name object_record_id)
   (call-api "/vobjects/{object_name}/{object_record_id}/actions/cascadedelete" :post
             {:path-params   {"object_name" object_name "object_record_id" object_record_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-object-name-object-record-id-actions-cascadedelete-post any?
  "Cascade Delete Object Record"
  ([object_name string?, object_record_id string?, ] (vobjects-object-name-object-record-id-actions-cascadedelete-post object_name object_record_id nil))
  ([object_name string?, object_record_id string?, optional-params any?]
   (let [res (:data (vobjects-object-name-object-record-id-actions-cascadedelete-post-with-http-info object_name object_record_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-object-name-object-record-id-actions-deepcopy-post-with-http-info any?
  "Deep Copy Object Record"
  ([object_name string?, object_record_id string?, ] (vobjects-object-name-object-record-id-actions-deepcopy-post-with-http-info object_name object_record_id nil))
  ([object_name string?, object_record_id string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name object_record_id)
   (call-api "/vobjects/{object_name}/{object_record_id}/actions/deepcopy" :post
             {:path-params   {"object_name" object_name "object_record_id" object_record_id }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-object-name-object-record-id-actions-deepcopy-post any?
  "Deep Copy Object Record"
  ([object_name string?, object_record_id string?, ] (vobjects-object-name-object-record-id-actions-deepcopy-post object_name object_record_id nil))
  ([object_name string?, object_record_id string?, optional-params any?]
   (let [res (:data (vobjects-object-name-object-record-id-actions-deepcopy-post-with-http-info object_name object_record_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-object-name-object-record-id-actions-get-with-http-info any?
  "Retrieve Object Record User Actions"
  ([object_name string?, object_record_id string?, ] (vobjects-object-name-object-record-id-actions-get-with-http-info object_name object_record_id nil))
  ([object_name string?, object_record_id string?, {:keys [loc Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name object_record_id)
   (call-api "/vobjects/{object_name}/{object_record_id}/actions" :get
             {:path-params   {"object_name" object_name "object_record_id" object_record_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"loc" loc }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-object-name-object-record-id-actions-get any?
  "Retrieve Object Record User Actions"
  ([object_name string?, object_record_id string?, ] (vobjects-object-name-object-record-id-actions-get object_name object_record_id nil))
  ([object_name string?, object_record_id string?, optional-params any?]
   (let [res (:data (vobjects-object-name-object-record-id-actions-get-with-http-info object_name object_record_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-object-name-object-record-id-attachment-fields-attachment-field-name-file-get-with-http-info any?
  "Download Attachment Field File"
  ([object_name string?, object_record_id string?, attachment_field_name string?, ] (vobjects-object-name-object-record-id-attachment-fields-attachment-field-name-file-get-with-http-info object_name object_record_id attachment_field_name nil))
  ([object_name string?, object_record_id string?, attachment_field_name string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name object_record_id attachment_field_name)
   (call-api "/vobjects/{object_name}/{object_record_id}/attachment_fields/{attachment_field_name}/file" :get
             {:path-params   {"object_name" object_name "object_record_id" object_record_id "attachment_field_name" attachment_field_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-object-name-object-record-id-attachment-fields-attachment-field-name-file-get any?
  "Download Attachment Field File"
  ([object_name string?, object_record_id string?, attachment_field_name string?, ] (vobjects-object-name-object-record-id-attachment-fields-attachment-field-name-file-get object_name object_record_id attachment_field_name nil))
  ([object_name string?, object_record_id string?, attachment_field_name string?, optional-params any?]
   (let [res (:data (vobjects-object-name-object-record-id-attachment-fields-attachment-field-name-file-get-with-http-info object_name object_record_id attachment_field_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-object-name-object-record-id-attachment-fields-attachment-field-name-file-post-with-http-info any?
  "Update Attachment Field File"
  ([object_name string?, object_record_id string?, attachment_field_name string?, ] (vobjects-object-name-object-record-id-attachment-fields-attachment-field-name-file-post-with-http-info object_name object_record_id attachment_field_name nil))
  ([object_name string?, object_record_id string?, attachment_field_name string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name object_record_id attachment_field_name)
   (call-api "/vobjects/{object_name}/{object_record_id}/attachment_fields/{attachment_field_name}/file" :post
             {:path-params   {"object_name" object_name "object_record_id" object_record_id "attachment_field_name" attachment_field_name }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-object-name-object-record-id-attachment-fields-attachment-field-name-file-post any?
  "Update Attachment Field File"
  ([object_name string?, object_record_id string?, attachment_field_name string?, ] (vobjects-object-name-object-record-id-attachment-fields-attachment-field-name-file-post object_name object_record_id attachment_field_name nil))
  ([object_name string?, object_record_id string?, attachment_field_name string?, optional-params any?]
   (let [res (:data (vobjects-object-name-object-record-id-attachment-fields-attachment-field-name-file-post-with-http-info object_name object_record_id attachment_field_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-object-name-object-record-id-attachment-fields-file-get-with-http-info any?
  "Download All Attachment Field Files"
  ([object_name string?, object_record_id string?, ] (vobjects-object-name-object-record-id-attachment-fields-file-get-with-http-info object_name object_record_id nil))
  ([object_name string?, object_record_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name object_record_id)
   (call-api "/vobjects/{object_name}/{object_record_id}/attachment_fields/file" :get
             {:path-params   {"object_name" object_name "object_record_id" object_record_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-object-name-object-record-id-attachment-fields-file-get any?
  "Download All Attachment Field Files"
  ([object_name string?, object_record_id string?, ] (vobjects-object-name-object-record-id-attachment-fields-file-get object_name object_record_id nil))
  ([object_name string?, object_record_id string?, optional-params any?]
   (let [res (:data (vobjects-object-name-object-record-id-attachment-fields-file-get-with-http-info object_name object_record_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-object-name-object-record-id-attachments-attachment-id-delete-with-http-info any?
  "Delete Object Record Attachment"
  ([object_name string?, object_record_id string?, attachment_id string?, ] (vobjects-object-name-object-record-id-attachments-attachment-id-delete-with-http-info object_name object_record_id attachment_id nil))
  ([object_name string?, object_record_id string?, attachment_id string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name object_record_id attachment_id)
   (call-api "/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}" :delete
             {:path-params   {"object_name" object_name "object_record_id" object_record_id "attachment_id" attachment_id }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-object-name-object-record-id-attachments-attachment-id-delete any?
  "Delete Object Record Attachment"
  ([object_name string?, object_record_id string?, attachment_id string?, ] (vobjects-object-name-object-record-id-attachments-attachment-id-delete object_name object_record_id attachment_id nil))
  ([object_name string?, object_record_id string?, attachment_id string?, optional-params any?]
   (let [res (:data (vobjects-object-name-object-record-id-attachments-attachment-id-delete-with-http-info object_name object_record_id attachment_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-object-name-object-record-id-attachments-attachment-id-get-with-http-info any?
  "Retrieve Object Record Attachment Metadata"
  ([object_name string?, object_record_id string?, attachment_id string?, ] (vobjects-object-name-object-record-id-attachments-attachment-id-get-with-http-info object_name object_record_id attachment_id nil))
  ([object_name string?, object_record_id string?, attachment_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name object_record_id attachment_id)
   (call-api "/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}" :get
             {:path-params   {"object_name" object_name "object_record_id" object_record_id "attachment_id" attachment_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-object-name-object-record-id-attachments-attachment-id-get any?
  "Retrieve Object Record Attachment Metadata"
  ([object_name string?, object_record_id string?, attachment_id string?, ] (vobjects-object-name-object-record-id-attachments-attachment-id-get object_name object_record_id attachment_id nil))
  ([object_name string?, object_record_id string?, attachment_id string?, optional-params any?]
   (let [res (:data (vobjects-object-name-object-record-id-attachments-attachment-id-get-with-http-info object_name object_record_id attachment_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-object-name-object-record-id-attachments-attachment-id-put-with-http-info any?
  "Update Object Record Attachment Description"
  ([object_name string?, object_record_id string?, attachment_id string?, ] (vobjects-object-name-object-record-id-attachments-attachment-id-put-with-http-info object_name object_record_id attachment_id nil))
  ([object_name string?, object_record_id string?, attachment_id string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name object_record_id attachment_id)
   (call-api "/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}" :put
             {:path-params   {"object_name" object_name "object_record_id" object_record_id "attachment_id" attachment_id }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-object-name-object-record-id-attachments-attachment-id-put any?
  "Update Object Record Attachment Description"
  ([object_name string?, object_record_id string?, attachment_id string?, ] (vobjects-object-name-object-record-id-attachments-attachment-id-put object_name object_record_id attachment_id nil))
  ([object_name string?, object_record_id string?, attachment_id string?, optional-params any?]
   (let [res (:data (vobjects-object-name-object-record-id-attachments-attachment-id-put-with-http-info object_name object_record_id attachment_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-object-name-object-record-id-attachments-attachment-id-versions-attachment-version-delete-with-http-info any?
  "Delete Object Record Attachment Version"
  ([object_name string?, object_record_id string?, attachment_id string?, attachment_version string?, ] (vobjects-object-name-object-record-id-attachments-attachment-id-versions-attachment-version-delete-with-http-info object_name object_record_id attachment_id attachment_version nil))
  ([object_name string?, object_record_id string?, attachment_id string?, attachment_version string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name object_record_id attachment_id attachment_version)
   (call-api "/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}" :delete
             {:path-params   {"object_name" object_name "object_record_id" object_record_id "attachment_id" attachment_id "attachment_version" attachment_version }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-object-name-object-record-id-attachments-attachment-id-versions-attachment-version-delete any?
  "Delete Object Record Attachment Version"
  ([object_name string?, object_record_id string?, attachment_id string?, attachment_version string?, ] (vobjects-object-name-object-record-id-attachments-attachment-id-versions-attachment-version-delete object_name object_record_id attachment_id attachment_version nil))
  ([object_name string?, object_record_id string?, attachment_id string?, attachment_version string?, optional-params any?]
   (let [res (:data (vobjects-object-name-object-record-id-attachments-attachment-id-versions-attachment-version-delete-with-http-info object_name object_record_id attachment_id attachment_version optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-object-name-object-record-id-attachments-attachment-id-versions-attachment-version-file-get-with-http-info any?
  "Download Object Record Attachment File"
  ([object_name string?, object_record_id string?, attachment_id string?, attachment_version string?, ] (vobjects-object-name-object-record-id-attachments-attachment-id-versions-attachment-version-file-get-with-http-info object_name object_record_id attachment_id attachment_version nil))
  ([object_name string?, object_record_id string?, attachment_id string?, attachment_version string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name object_record_id attachment_id attachment_version)
   (call-api "/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}/file" :get
             {:path-params   {"object_name" object_name "object_record_id" object_record_id "attachment_id" attachment_id "attachment_version" attachment_version }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-object-name-object-record-id-attachments-attachment-id-versions-attachment-version-file-get any?
  "Download Object Record Attachment File"
  ([object_name string?, object_record_id string?, attachment_id string?, attachment_version string?, ] (vobjects-object-name-object-record-id-attachments-attachment-id-versions-attachment-version-file-get object_name object_record_id attachment_id attachment_version nil))
  ([object_name string?, object_record_id string?, attachment_id string?, attachment_version string?, optional-params any?]
   (let [res (:data (vobjects-object-name-object-record-id-attachments-attachment-id-versions-attachment-version-file-get-with-http-info object_name object_record_id attachment_id attachment_version optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-object-name-object-record-id-attachments-attachment-id-versions-attachment-version-get-with-http-info any?
  "Retrieve Object Record Attachment Version Metadata"
  ([object_name string?, object_record_id string?, attachment_id string?, attachment_version string?, ] (vobjects-object-name-object-record-id-attachments-attachment-id-versions-attachment-version-get-with-http-info object_name object_record_id attachment_id attachment_version nil))
  ([object_name string?, object_record_id string?, attachment_id string?, attachment_version string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name object_record_id attachment_id attachment_version)
   (call-api "/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}" :get
             {:path-params   {"object_name" object_name "object_record_id" object_record_id "attachment_id" attachment_id "attachment_version" attachment_version }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-object-name-object-record-id-attachments-attachment-id-versions-attachment-version-get any?
  "Retrieve Object Record Attachment Version Metadata"
  ([object_name string?, object_record_id string?, attachment_id string?, attachment_version string?, ] (vobjects-object-name-object-record-id-attachments-attachment-id-versions-attachment-version-get object_name object_record_id attachment_id attachment_version nil))
  ([object_name string?, object_record_id string?, attachment_id string?, attachment_version string?, optional-params any?]
   (let [res (:data (vobjects-object-name-object-record-id-attachments-attachment-id-versions-attachment-version-get-with-http-info object_name object_record_id attachment_id attachment_version optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-object-name-object-record-id-attachments-attachment-id-versions-attachment-version-post-with-http-info any?
  "Restore Object Record Attachment Version"
  ([object_name string?, object_record_id string?, attachment_id string?, attachment_version string?, ] (vobjects-object-name-object-record-id-attachments-attachment-id-versions-attachment-version-post-with-http-info object_name object_record_id attachment_id attachment_version nil))
  ([object_name string?, object_record_id string?, attachment_id string?, attachment_version string?, {:keys [restore Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name object_record_id attachment_id attachment_version)
   (call-api "/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}" :post
             {:path-params   {"object_name" object_name "object_record_id" object_record_id "attachment_id" attachment_id "attachment_version" attachment_version }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"restore" restore }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-object-name-object-record-id-attachments-attachment-id-versions-attachment-version-post any?
  "Restore Object Record Attachment Version"
  ([object_name string?, object_record_id string?, attachment_id string?, attachment_version string?, ] (vobjects-object-name-object-record-id-attachments-attachment-id-versions-attachment-version-post object_name object_record_id attachment_id attachment_version nil))
  ([object_name string?, object_record_id string?, attachment_id string?, attachment_version string?, optional-params any?]
   (let [res (:data (vobjects-object-name-object-record-id-attachments-attachment-id-versions-attachment-version-post-with-http-info object_name object_record_id attachment_id attachment_version optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-object-name-object-record-id-attachments-attachment-id-versions-get-with-http-info any?
  "Retrieve Object Record Attachment Versions"
  ([object_name string?, object_record_id string?, attachment_id string?, ] (vobjects-object-name-object-record-id-attachments-attachment-id-versions-get-with-http-info object_name object_record_id attachment_id nil))
  ([object_name string?, object_record_id string?, attachment_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name object_record_id attachment_id)
   (call-api "/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions" :get
             {:path-params   {"object_name" object_name "object_record_id" object_record_id "attachment_id" attachment_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-object-name-object-record-id-attachments-attachment-id-versions-get any?
  "Retrieve Object Record Attachment Versions"
  ([object_name string?, object_record_id string?, attachment_id string?, ] (vobjects-object-name-object-record-id-attachments-attachment-id-versions-get object_name object_record_id attachment_id nil))
  ([object_name string?, object_record_id string?, attachment_id string?, optional-params any?]
   (let [res (:data (vobjects-object-name-object-record-id-attachments-attachment-id-versions-get-with-http-info object_name object_record_id attachment_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-object-name-object-record-id-attachments-file-get-with-http-info any?
  "Download All Object Record Attachment Files"
  ([object_name string?, object_record_id string?, ] (vobjects-object-name-object-record-id-attachments-file-get-with-http-info object_name object_record_id nil))
  ([object_name string?, object_record_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name object_record_id)
   (call-api "/vobjects/{object_name}/{object_record_id}/attachments/file" :get
             {:path-params   {"object_name" object_name "object_record_id" object_record_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-object-name-object-record-id-attachments-file-get any?
  "Download All Object Record Attachment Files"
  ([object_name string?, object_record_id string?, ] (vobjects-object-name-object-record-id-attachments-file-get object_name object_record_id nil))
  ([object_name string?, object_record_id string?, optional-params any?]
   (let [res (:data (vobjects-object-name-object-record-id-attachments-file-get-with-http-info object_name object_record_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-object-name-object-record-id-attachments-get-with-http-info any?
  "Retrieve Object Record Attachments"
  ([object_name string?, object_record_id string?, ] (vobjects-object-name-object-record-id-attachments-get-with-http-info object_name object_record_id nil))
  ([object_name string?, object_record_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name object_record_id)
   (call-api "/vobjects/{object_name}/{object_record_id}/attachments" :get
             {:path-params   {"object_name" object_name "object_record_id" object_record_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-object-name-object-record-id-attachments-get any?
  "Retrieve Object Record Attachments"
  ([object_name string?, object_record_id string?, ] (vobjects-object-name-object-record-id-attachments-get object_name object_record_id nil))
  ([object_name string?, object_record_id string?, optional-params any?]
   (let [res (:data (vobjects-object-name-object-record-id-attachments-get-with-http-info object_name object_record_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-object-name-object-record-id-attachments-post-with-http-info any?
  "Create Object Record Attachment"
  ([object_name string?, object_record_id string?, ] (vobjects-object-name-object-record-id-attachments-post-with-http-info object_name object_record_id nil))
  ([object_name string?, object_record_id string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name object_record_id)
   (call-api "/vobjects/{object_name}/{object_record_id}/attachments" :post
             {:path-params   {"object_name" object_name "object_record_id" object_record_id }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-object-name-object-record-id-attachments-post any?
  "Create Object Record Attachment"
  ([object_name string?, object_record_id string?, ] (vobjects-object-name-object-record-id-attachments-post object_name object_record_id nil))
  ([object_name string?, object_record_id string?, optional-params any?]
   (let [res (:data (vobjects-object-name-object-record-id-attachments-post-with-http-info object_name object_record_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-object-name-object-record-id-audittrail-get-with-http-info any?
  "Retrieve Complete Audit History for a Single Object Record"
  ([object_name string?, object_record_id string?, ] (vobjects-object-name-object-record-id-audittrail-get-with-http-info object_name object_record_id nil))
  ([object_name string?, object_record_id string?, {:keys [start_date end_date format_result limit offset events Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name object_record_id)
   (call-api "/vobjects/{object_name}/{object_record_id}/audittrail" :get
             {:path-params   {"object_name" object_name "object_record_id" object_record_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"start_date" start_date "end_date" end_date "format_result" format_result "limit" limit "offset" offset "events" events }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-object-name-object-record-id-audittrail-get any?
  "Retrieve Complete Audit History for a Single Object Record"
  ([object_name string?, object_record_id string?, ] (vobjects-object-name-object-record-id-audittrail-get object_name object_record_id nil))
  ([object_name string?, object_record_id string?, optional-params any?]
   (let [res (:data (vobjects-object-name-object-record-id-audittrail-get-with-http-info object_name object_record_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-object-name-object-record-id-get-with-http-info any?
  "Retrieve Object Record"
  ([object_name string?, object_record_id string?, ] (vobjects-object-name-object-record-id-get-with-http-info object_name object_record_id nil))
  ([object_name string?, object_record_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name object_record_id)
   (call-api "/vobjects/{object_name}/{object_record_id}" :get
             {:path-params   {"object_name" object_name "object_record_id" object_record_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-object-name-object-record-id-get any?
  "Retrieve Object Record"
  ([object_name string?, object_record_id string?, ] (vobjects-object-name-object-record-id-get object_name object_record_id nil))
  ([object_name string?, object_record_id string?, optional-params any?]
   (let [res (:data (vobjects-object-name-object-record-id-get-with-http-info object_name object_record_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-object-name-post-with-http-info any?
  "Create & Upsert Object Records"
  ([object_name string?, ] (vobjects-object-name-post-with-http-info object_name nil))
  ([object_name string?, {:keys [idParam Authorization Content-Type Accept X-VaultAPI-MigrationMode X-VaultAPI-NoTriggers X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name)
   (call-api "/vobjects/{object_name}" :post
             {:path-params   {"object_name" object_name }
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-MigrationMode" X-VaultAPI-MigrationMode "X-VaultAPI-NoTriggers" X-VaultAPI-NoTriggers "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {"idParam" idParam }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-object-name-post any?
  "Create & Upsert Object Records"
  ([object_name string?, ] (vobjects-object-name-post object_name nil))
  ([object_name string?, optional-params any?]
   (let [res (:data (vobjects-object-name-post-with-http-info object_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-object-name-put-with-http-info any?
  "Update Object Records"
  ([object_name string?, ] (vobjects-object-name-put-with-http-info object_name nil))
  ([object_name string?, {:keys [Authorization Content-Type Accept X-VaultAPI-MigrationMode X-VaultAPI-NoTriggers X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name)
   (call-api "/vobjects/{object_name}" :put
             {:path-params   {"object_name" object_name }
              :header-params {"Authorization" Authorization "Content-Type" Content-Type "Accept" Accept "X-VaultAPI-MigrationMode" X-VaultAPI-MigrationMode "X-VaultAPI-NoTriggers" X-VaultAPI-NoTriggers "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-object-name-put any?
  "Update Object Records"
  ([object_name string?, ] (vobjects-object-name-put object_name nil))
  ([object_name string?, optional-params any?]
   (let [res (:data (vobjects-object-name-put-with-http-info object_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-object-name-roles-delete-with-http-info any?
  "Remove Users & Groups from Roles on Object Records"
  ([object_name string?, ] (vobjects-object-name-roles-delete-with-http-info object_name nil))
  ([object_name string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name)
   (call-api "/vobjects/{object_name}/roles" :delete
             {:path-params   {"object_name" object_name }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-object-name-roles-delete any?
  "Remove Users & Groups from Roles on Object Records"
  ([object_name string?, ] (vobjects-object-name-roles-delete object_name nil))
  ([object_name string?, optional-params any?]
   (let [res (:data (vobjects-object-name-roles-delete-with-http-info object_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-object-name-roles-post-with-http-info any?
  "Assign Users & Groups to Roles on Object Records"
  ([object_name string?, ] (vobjects-object-name-roles-post-with-http-info object_name nil))
  ([object_name string?, {:keys [Authorization Accept Content-Type X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params object_name)
   (call-api "/vobjects/{object_name}/roles" :post
             {:path-params   {"object_name" object_name }
              :header-params {"Authorization" Authorization "Accept" Accept "Content-Type" Content-Type "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-object-name-roles-post any?
  "Assign Users & Groups to Roles on Object Records"
  ([object_name string?, ] (vobjects-object-name-roles-post object_name nil))
  ([object_name string?, optional-params any?]
   (let [res (:data (vobjects-object-name-roles-post-with-http-info object_name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec vobjects-outbound-package-v-package-id-dependencies-get-with-http-info any?
  "Retrieve Outbound Package Dependencies"
  ([package_id string?, ] (vobjects-outbound-package-v-package-id-dependencies-get-with-http-info package_id nil))
  ([package_id string?, {:keys [Authorization Accept X-VaultAPI-ClientID]} (s/map-of keyword? any?)]
   (check-required-params package_id)
   (call-api "/vobjects/outbound_package__v/{package_id}/dependencies" :get
             {:path-params   {"package_id" package_id }
              :header-params {"Authorization" Authorization "Accept" Accept "X-VaultAPI-ClientID" X-VaultAPI-ClientID }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec vobjects-outbound-package-v-package-id-dependencies-get any?
  "Retrieve Outbound Package Dependencies"
  ([package_id string?, ] (vobjects-outbound-package-v-package-id-dependencies-get package_id nil))
  ([package_id string?, optional-params any?]
   (let [res (:data (vobjects-outbound-package-v-package-id-dependencies-get-with-http-info package_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


