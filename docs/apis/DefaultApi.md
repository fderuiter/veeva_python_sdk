# Org.OpenAPITools.Api.DefaultApi

All URIs are relative to *http://}/api/v25.1*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ApiGet**](DefaultApi.md#apiget) | **GET** /api/ | Retrieve API Versions |
| [**ApiMdlComponentsComponentTypeAndRecordNameFilesGet**](DefaultApi.md#apimdlcomponentscomponenttypeandrecordnamefilesget) | **GET** /api/mdl/components/{component_type_and_record_name}/files | Retrieve Content File |
| [**ApiMdlComponentsComponentTypeAndRecordNameGet**](DefaultApi.md#apimdlcomponentscomponenttypeandrecordnameget) | **GET** /api/mdl/components/{component_type_and_record_name} | Retrieve Component Record (MDL) |
| [**ApiMdlExecuteAsyncJobIdResultsGet**](DefaultApi.md#apimdlexecuteasyncjobidresultsget) | **GET** /api/mdl/execute_async/{job_id}/results | Retrieve Asynchronous MDL Script Results |
| [**ApiMdlExecuteAsyncPost**](DefaultApi.md#apimdlexecuteasyncpost) | **POST** /api/mdl/execute_async | Execute MDL Script Asynchronously |
| [**ApiMdlExecutePost**](DefaultApi.md#apimdlexecutepost) | **POST** /api/mdl/execute | Execute MDL Script |
| [**ApiMdlFilesPost**](DefaultApi.md#apimdlfilespost) | **POST** /api/mdl/files | Upload Content File |
| [**AudittrailAuditTrailTypeGet**](DefaultApi.md#audittrailaudittrailtypeget) | **GET** /audittrail/{audit_trail_type} | Retrieve Audit Details |
| [**AuthDiscoveryPost**](DefaultApi.md#authdiscoverypost) | **POST** /auth/discovery | Authentication Type Discovery |
| [**AuthOauthSessionOathOidcProfileIdPost**](DefaultApi.md#authoauthsessionoathoidcprofileidpost) | **POST** /auth/oauth/session/{oath_oidc_profile_id} | OAuth 2.0 / OpenID Connect |
| [**AuthPost**](DefaultApi.md#authpost) | **POST** /auth | User Name and Password |
| [**CodeClassNameDelete**](DefaultApi.md#codeclassnamedelete) | **DELETE** /code/{class_name} | Delete Single Source Code File |
| [**CodeClassNameDisablePut**](DefaultApi.md#codeclassnamedisableput) | **PUT** /code/{class_name}/disable | Disable Vault Extension |
| [**CodeClassNameEnablePut**](DefaultApi.md#codeclassnameenableput) | **PUT** /code/{class_name}/enable | Enable Vault Extension |
| [**CodeClassNameGet**](DefaultApi.md#codeclassnameget) | **GET** /code/{class_name} | Retrieve Single Source Code File |
| [**CodeProfilerGet**](DefaultApi.md#codeprofilerget) | **GET** /code/profiler | Retrieve All Profiling Sessions |
| [**CodeProfilerPost**](DefaultApi.md#codeprofilerpost) | **POST** /code/profiler | Create Profiling Session |
| [**CodeProfilerSessionNameActionsEndPost**](DefaultApi.md#codeprofilersessionnameactionsendpost) | **POST** /code/profiler/{session_name}/actions/end | End Profiling Session |
| [**CodeProfilerSessionNameDelete**](DefaultApi.md#codeprofilersessionnamedelete) | **DELETE** /code/profiler/{session_name} | Delete Profiling Session |
| [**CodeProfilerSessionNameGet**](DefaultApi.md#codeprofilersessionnameget) | **GET** /code/profiler/{session_name} | Retrieve Profiling Session |
| [**CodeProfilerSessionNameResultsGet**](DefaultApi.md#codeprofilersessionnameresultsget) | **GET** /code/profiler/{session_name}/results | Download Profiling Session Results |
| [**CodePut**](DefaultApi.md#codeput) | **PUT** /code | Add or Replace Single Source Code File |
| [**CompositesTreesEdlHierarchyOrTemplateActionsListnodesPost**](DefaultApi.md#compositestreesedlhierarchyortemplateactionslistnodespost) | **POST** /composites/trees/{edl_hierarchy_or_template}/actions/listnodes | Retrieve Specific Root Nodes |
| [**CompositesTreesEdlHierarchyOrTemplateGet**](DefaultApi.md#compositestreesedlhierarchyortemplateget) | **GET** /composites/trees/{edl_hierarchy_or_template} | Retrieve All Root Nodes |
| [**CompositesTreesEdlHierarchyVParentNodeIdChildrenGet**](DefaultApi.md#compositestreesedlhierarchyvparentnodeidchildrenget) | **GET** /composites/trees/edl_hierarchy__v/{parent_node_id}/children | Retrieve a Node&#39;s Children |
| [**CompositesTreesEdlHierarchyVParentNodeIdChildrenPut**](DefaultApi.md#compositestreesedlhierarchyvparentnodeidchildrenput) | **PUT** /composites/trees/edl_hierarchy__v/{parent_node_id}/children | Update Node Order |
| [**ConfigurationComponentTypeAndRecordNameGet**](DefaultApi.md#configurationcomponenttypeandrecordnameget) | **GET** /configuration/{component_type_and_record_name} | Retrieve Component Record (XML/JSON) |
| [**ConfigurationComponentTypeGet**](DefaultApi.md#configurationcomponenttypeget) | **GET** /configuration/{component_type} | Retrieve Component Record Collection |
| [**ConfigurationObjectNameAndObjectTypeGet**](DefaultApi.md#configurationobjectnameandobjecttypeget) | **GET** /configuration/{object_name_and_object_type} | Retrieve Details from a Specific Object |
| [**ConfigurationObjecttypeGet**](DefaultApi.md#configurationobjecttypeget) | **GET** /configuration/Objecttype | Retrieve Details from All Object Types |
| [**ConfigurationRoleAssignmentRuleDelete**](DefaultApi.md#configurationroleassignmentruledelete) | **DELETE** /configuration/role_assignment_rule | Delete Lifecycle Role Assignment Override Rules |
| [**ConfigurationRoleAssignmentRuleGet**](DefaultApi.md#configurationroleassignmentruleget) | **GET** /configuration/role_assignment_rule | Retrieve Lifecycle Role Assignment Rules (Default &amp; Override) |
| [**ConfigurationRoleAssignmentRulePost**](DefaultApi.md#configurationroleassignmentrulepost) | **POST** /configuration/role_assignment_rule | Create Lifecycle Role Assignment Override Rules |
| [**ConfigurationRoleAssignmentRulePut**](DefaultApi.md#configurationroleassignmentruleput) | **PUT** /configuration/role_assignment_rule | Update Lifecycle Role Assignment Rules (Default &amp; Override) |
| [**DelegationLoginPost**](DefaultApi.md#delegationloginpost) | **POST** /delegation/login | Initiate Delegated Session |
| [**DelegationVaultsGet**](DefaultApi.md#delegationvaultsget) | **GET** /delegation/vaults | Retrieve Delegations |
| [**KeepAlivePost**](DefaultApi.md#keepalivepost) | **POST** /keep-alive | Session Keep Alive |
| [**LimitsGet**](DefaultApi.md#limitsget) | **GET** /limits | Retrieve Limits on Objects |
| [**LogsApiUsageGet**](DefaultApi.md#logsapiusageget) | **GET** /logs/api_usage | Download Daily API Usage |
| [**LogsCodeDebugGet**](DefaultApi.md#logscodedebugget) | **GET** /logs/code/debug | Retrieve All Debug Logs |
| [**LogsCodeDebugIdActionsResetDelete**](DefaultApi.md#logscodedebugidactionsresetdelete) | **DELETE** /logs/code/debug/{id}/actions/reset | Delete Debug Log |
| [**LogsCodeDebugIdActionsResetPost**](DefaultApi.md#logscodedebugidactionsresetpost) | **POST** /logs/code/debug/{id}/actions/reset | Reset Debug Log |
| [**LogsCodeDebugIdFilesGet**](DefaultApi.md#logscodedebugidfilesget) | **GET** /logs/code/debug/{id}/files | Download Debug Log Files |
| [**LogsCodeDebugIdGet**](DefaultApi.md#logscodedebugidget) | **GET** /logs/code/debug/{id} | Retrieve Single Debug Log |
| [**LogsCodeDebugPost**](DefaultApi.md#logscodedebugpost) | **POST** /logs/code/debug | Create Debug Log |
| [**LogsCodeRuntimeGet**](DefaultApi.md#logscoderuntimeget) | **GET** /logs/code/runtime | Download SDK Runtime Log |
| [**MessagesMessageTypeActionsImportPost**](DefaultApi.md#messagesmessagetypeactionsimportpost) | **POST** /messages/{message_type}/actions/import | Import Bulk Translation File |
| [**MessagesMessageTypeLanguageLangActionsExportPost**](DefaultApi.md#messagesmessagetypelanguagelangactionsexportpost) | **POST** /messages/{message_type}/language/{lang}/actions/export | Export Bulk Translation File |
| [**MetadataAudittrailAuditTrailTypeGet**](DefaultApi.md#metadataaudittrailaudittrailtypeget) | **GET** /metadata/audittrail/{audit_trail_type} | Retrieve Audit Metadata |
| [**MetadataAudittrailGet**](DefaultApi.md#metadataaudittrailget) | **GET** /metadata/audittrail | Retrieve Audit Types |
| [**MetadataComponentsComponentTypeGet**](DefaultApi.md#metadatacomponentscomponenttypeget) | **GET** /metadata/components/{component_type} | Retrieve Component Type Metadata |
| [**MetadataComponentsGet**](DefaultApi.md#metadatacomponentsget) | **GET** /metadata/components | Retrieve All Component Metadata |
| [**MetadataObjectsBindersTemplatesBindernodesGet**](DefaultApi.md#metadataobjectsbinderstemplatesbindernodesget) | **GET** /metadata/objects/binders/templates/bindernodes | Retrieve Binder Template Node Metadata |
| [**MetadataObjectsBindersTemplatesGet**](DefaultApi.md#metadataobjectsbinderstemplatesget) | **GET** /metadata/objects/binders/templates | Retrieve Binder Template Metadata |
| [**MetadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet**](DefaultApi.md#metadataobjectsdocumentsannotationsplacemarkstypesplacemarktypeget) | **GET** /metadata/objects/documents/annotations/placemarks/types/{placemark_type} | Retrieve Annotation Placemark Type Metadata |
| [**MetadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet**](DefaultApi.md#metadataobjectsdocumentsannotationsreferencestypesreferencetypeget) | **GET** /metadata/objects/documents/annotations/references/types/{reference_type} | Retrieve Annotation Reference Type Metadata |
| [**MetadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet**](DefaultApi.md#metadataobjectsdocumentsannotationstypesannotationtypeget) | **GET** /metadata/objects/documents/annotations/types/{annotation_type} | Retrieve Annotation Type Metadata |
| [**MetadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet**](DefaultApi.md#metadataobjectsdocumentseventseventtypetypeseventsubtypeget) | **GET** /metadata/objects/documents/events/{event_type}/types/{event_subtype} | Retrieve Document Event SubType Metadata |
| [**MetadataObjectsDocumentsEventsGet**](DefaultApi.md#metadataobjectsdocumentseventsget) | **GET** /metadata/objects/documents/events | Retrieve Document Event Types and Subtypes |
| [**MetadataObjectsDocumentsLockGet**](DefaultApi.md#metadataobjectsdocumentslockget) | **GET** /metadata/objects/documents/lock | Retrieve Document Lock Metadata |
| [**MetadataObjectsDocumentsPropertiesFindCommonPost**](DefaultApi.md#metadataobjectsdocumentspropertiesfindcommonpost) | **POST** /metadata/objects/documents/properties/find_common | Retrieve Common Document Fields |
| [**MetadataObjectsDocumentsPropertiesGet**](DefaultApi.md#metadataobjectsdocumentspropertiesget) | **GET** /metadata/objects/documents/properties | Retrieve All Document Fields |
| [**MetadataObjectsDocumentsTemplatesGet**](DefaultApi.md#metadataobjectsdocumentstemplatesget) | **GET** /metadata/objects/documents/templates | Retrieve Document Template Metadata |
| [**MetadataObjectsDocumentsTypesGet**](DefaultApi.md#metadataobjectsdocumentstypesget) | **GET** /metadata/objects/documents/types | Retrieve All Document Types |
| [**MetadataObjectsDocumentsTypesTypeGet**](DefaultApi.md#metadataobjectsdocumentstypestypeget) | **GET** /metadata/objects/documents/types/{type} | Retrieve Document Type |
| [**MetadataObjectsDocumentsTypesTypeRelationshipsGet**](DefaultApi.md#metadataobjectsdocumentstypestyperelationshipsget) | **GET** /metadata/objects/documents/types/{type}/relationships | Retrieve Document Type Relationships |
| [**MetadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet**](DefaultApi.md#metadataobjectsdocumentstypestypesubtypessubtypeclassificationsclassificationget) | **GET** /metadata/objects/documents/types/{type}/subtypes/{subtype}/classifications/{classification} | Retrieve Document Classification |
| [**MetadataObjectsDocumentsTypesTypeSubtypesSubtypeGet**](DefaultApi.md#metadataobjectsdocumentstypestypesubtypessubtypeget) | **GET** /metadata/objects/documents/types/{type}/subtypes/{subtype} | Retrieve Document Subtype |
| [**MetadataObjectsGroupsGet**](DefaultApi.md#metadataobjectsgroupsget) | **GET** /metadata/objects/groups | Retrieve Group Metadata |
| [**MetadataObjectsSecuritypoliciesGet**](DefaultApi.md#metadataobjectssecuritypoliciesget) | **GET** /metadata/objects/securitypolicies | Retrieve Security Policy Metadata |
| [**MetadataObjectsUsersGet**](DefaultApi.md#metadataobjectsusersget) | **GET** /metadata/objects/users | Retrieve User Metadata |
| [**MetadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet**](DefaultApi.md#metadataqueryarchiveddocumentsrelationshipsdocumentsignaturesysrget) | **GET** /metadata/query/archived_documents/relationships/document_signature__sysr | Retrieve Archived Document Signature Metadata |
| [**MetadataQueryDocumentsRelationshipsDocumentSignatureSysrGet**](DefaultApi.md#metadataquerydocumentsrelationshipsdocumentsignaturesysrget) | **GET** /metadata/query/documents/relationships/document_signature__sysr | Retrieve Document Signature Metadata |
| [**MetadataVobjectsGet**](DefaultApi.md#metadatavobjectsget) | **GET** /metadata/vobjects | Retrieve Object Collection |
| [**MetadataVobjectsObjectNameActionsCanceldeploymentPost**](DefaultApi.md#metadatavobjectsobjectnameactionscanceldeploymentpost) | **POST** /metadata/vobjects/{object_name}/actions/canceldeployment | Cancel Raw Object Deployment |
| [**MetadataVobjectsObjectNameFieldsObjectFieldNameGet**](DefaultApi.md#metadatavobjectsobjectnamefieldsobjectfieldnameget) | **GET** /metadata/vobjects/{object_name}/fields/{object_field_name} | Retrieve Object Field Metadata |
| [**MetadataVobjectsObjectNameGet**](DefaultApi.md#metadatavobjectsobjectnameget) | **GET** /metadata/vobjects/{object_name} | Retrieve Object Metadata |
| [**MetadataVobjectsObjectNamePageLayoutsGet**](DefaultApi.md#metadatavobjectsobjectnamepagelayoutsget) | **GET** /metadata/vobjects/{object_name}/page_layouts | Retrieve Page Layouts |
| [**MetadataVobjectsObjectNamePageLayoutsLayoutNameGet**](DefaultApi.md#metadatavobjectsobjectnamepagelayoutslayoutnameget) | **GET** /metadata/vobjects/{object_name}/page_layouts/{layout_name} | Retrieve Page Layout Metadata |
| [**NotificationsHistoriesGet**](DefaultApi.md#notificationshistoriesget) | **GET** /notifications/histories | Retrieve Email Notification Histories |
| [**ObjectWorkflowActionsActionGet**](DefaultApi.md#objectworkflowactionsactionget) | **GET** /object/workflow/actions/{action} | Retrieve Bulk Workflow Action Details |
| [**ObjectWorkflowActionsActionPost**](DefaultApi.md#objectworkflowactionsactionpost) | **POST** /object/workflow/actions/{action} | Initiate Workflow Actions on Multiple Workflows |
| [**ObjectWorkflowActionsCanceltasksPost**](DefaultApi.md#objectworkflowactionscanceltaskspost) | **POST** /object/workflow/actions/canceltasks | Cancel Workflow Tasks |
| [**ObjectWorkflowActionsCancelworkflowsPost**](DefaultApi.md#objectworkflowactionscancelworkflowspost) | **POST** /object/workflow/actions/cancelworkflows | Cancel Workflows |
| [**ObjectWorkflowActionsGet**](DefaultApi.md#objectworkflowactionsget) | **GET** /object/workflow/actions | Retrieve Bulk Workflow Actions |
| [**ObjectWorkflowActionsReassigntasksPost**](DefaultApi.md#objectworkflowactionsreassigntaskspost) | **POST** /object/workflow/actions/reassigntasks | Reassign Workflow Tasks |
| [**ObjectWorkflowActionsReplaceworkflowownerPost**](DefaultApi.md#objectworkflowactionsreplaceworkflowownerpost) | **POST** /object/workflow/actions/replaceworkflowowner | Replace Workflow Owner |
| [**ObjectsBindersActionsExportJobIdResultsGet**](DefaultApi.md#objectsbindersactionsexportjobidresultsget) | **GET** /objects/binders/actions/export/{job_id}/results | Retrieve Binder Export Results |
| [**ObjectsBindersBinderIdActionsExportPost**](DefaultApi.md#objectsbindersbinderidactionsexportpost) | **POST** /objects/binders/{binder_id}/actions/export | Export Binder (Latest Version) |
| [**ObjectsBindersBinderIdActionsPost**](DefaultApi.md#objectsbindersbinderidactionspost) | **POST** /objects/binders/{binder_id}/actions | Refresh Binder Auto-Filing |
| [**ObjectsBindersBinderIdBindingRulePut**](DefaultApi.md#objectsbindersbinderidbindingruleput) | **PUT** /objects/binders/{binder_id}/binding_rule | Update Binding Rule |
| [**ObjectsBindersBinderIdDelete**](DefaultApi.md#objectsbindersbinderiddelete) | **DELETE** /objects/binders/{binder_id} | Delete Binder |
| [**ObjectsBindersBinderIdDocumentsNodeIdBindingRulePut**](DefaultApi.md#objectsbindersbinderiddocumentsnodeidbindingruleput) | **PUT** /objects/binders/{binder_id}/documents/{node_id}/binding_rule | Update Binder Document Binding Rule |
| [**ObjectsBindersBinderIdDocumentsPost**](DefaultApi.md#objectsbindersbinderiddocumentspost) | **POST** /objects/binders/{binder_id}/documents | Add Document to Binder |
| [**ObjectsBindersBinderIdDocumentsSectionIdDelete**](DefaultApi.md#objectsbindersbinderiddocumentssectioniddelete) | **DELETE** /objects/binders/{binder_id}/documents/{section_id} | Remove Document from Binder |
| [**ObjectsBindersBinderIdDocumentsSectionIdPut**](DefaultApi.md#objectsbindersbinderiddocumentssectionidput) | **PUT** /objects/binders/{binder_id}/documents/{section_id} | Move Document in Binder |
| [**ObjectsBindersBinderIdGet**](DefaultApi.md#objectsbindersbinderidget) | **GET** /objects/binders/{binder_id} | Retrieve Binder |
| [**ObjectsBindersBinderIdPost**](DefaultApi.md#objectsbindersbinderidpost) | **POST** /objects/binders/{binder_id} | Create Binder Version |
| [**ObjectsBindersBinderIdPut**](DefaultApi.md#objectsbindersbinderidput) | **PUT** /objects/binders/{binder_id} | Update Binder |
| [**ObjectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete**](DefaultApi.md#objectsbindersbinderidrolesrolenameanduserorgroupiddelete) | **DELETE** /objects/binders/{binder_id}/roles/{role_name_and_user_or_group}/{id} | Remove Users &amp; Groups from Roles on a Single Binder |
| [**ObjectsBindersBinderIdSectionsNodeIdBindingRulePut**](DefaultApi.md#objectsbindersbinderidsectionsnodeidbindingruleput) | **PUT** /objects/binders/{binder_id}/sections/{node_id}/binding_rule | Update Binder Section Binding Rule |
| [**ObjectsBindersBinderIdSectionsNodeIdPut**](DefaultApi.md#objectsbindersbinderidsectionsnodeidput) | **PUT** /objects/binders/{binder_id}/sections/{node_id} | Update Binder Section |
| [**ObjectsBindersBinderIdSectionsPost**](DefaultApi.md#objectsbindersbinderidsectionspost) | **POST** /objects/binders/{binder_id}/sections | Create Binder Section |
| [**ObjectsBindersBinderIdSectionsSectionIdDelete**](DefaultApi.md#objectsbindersbinderidsectionssectioniddelete) | **DELETE** /objects/binders/{binder_id}/sections/{section_id} | Delete Binder Section |
| [**ObjectsBindersBinderIdSectionsSectionIdGet**](DefaultApi.md#objectsbindersbinderidsectionssectionidget) | **GET** /objects/binders/{binder_id}/sections/{section_id} | Retrieve Binder Sections |
| [**ObjectsBindersBinderIdVersionsGet**](DefaultApi.md#objectsbindersbinderidversionsget) | **GET** /objects/binders/{binder_id}/versions | Retrieve All Binder Versions |
| [**ObjectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost**](DefaultApi.md#objectsbindersbinderidversionsmajorversionminorversionactionsexportpost) | **POST** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/actions/export | Export Binder (Specific Version) |
| [**ObjectsBindersBinderIdVersionsMajorVersionMinorVersionDelete**](DefaultApi.md#objectsbindersbinderidversionsmajorversionminorversiondelete) | **DELETE** /objects/binders/{binder_id}/versions/{major_version}/{minor_version} | Delete Binder Version |
| [**ObjectsBindersBinderIdVersionsMajorVersionMinorVersionGet**](DefaultApi.md#objectsbindersbinderidversionsmajorversionminorversionget) | **GET** /objects/binders/{binder_id}/versions/{major_version}/{minor_version} | Retrieve Binder Version |
| [**ObjectsBindersBinderIdVersionsMajorVersionMinorVersionPut**](DefaultApi.md#objectsbindersbinderidversionsmajorversionminorversionput) | **PUT** /objects/binders/{binder_id}/versions/{major_version}/{minor_version} | Update Binder Version |
| [**ObjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost**](DefaultApi.md#objectsbindersbinderidversionsmajorversionminorversionrelationshipspost) | **POST** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships | Create Binder Relationship |
| [**ObjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete**](DefaultApi.md#objectsbindersbinderidversionsmajorversionminorversionrelationshipsrelationshipiddelete) | **DELETE** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Delete Binder Relationship |
| [**ObjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet**](DefaultApi.md#objectsbindersbinderidversionsmajorversionminorversionrelationshipsrelationshipidget) | **GET** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Retrieve Binder Relationship |
| [**ObjectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet**](DefaultApi.md#objectsbindersbinderidversionsmajorversionminorversionsectionssectionidget) | **GET** /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/sections/{section_id} | Retrieve Binder Version Section |
| [**ObjectsBindersIdRolesGet**](DefaultApi.md#objectsbindersidrolesget) | **GET** /objects/binders/{id}/roles | Retrieve All Binder Roles |
| [**ObjectsBindersIdRolesPost**](DefaultApi.md#objectsbindersidrolespost) | **POST** /objects/binders/{id}/roles | Assign Users &amp; Groups to Roles on a Single Binder |
| [**ObjectsBindersIdRolesRoleNameGet**](DefaultApi.md#objectsbindersidrolesrolenameget) | **GET** /objects/binders/{id}/roles/{role_name} | Retrieve Document Role |
| [**ObjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet**](DefaultApi.md#objectsbindersidversionsmajorversionminorversionlifecycleactionsget) | **GET** /objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions | Retrieve Binder User Actions |
| [**ObjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet**](DefaultApi.md#objectsbindersidversionsmajorversionminorversionlifecycleactionsnameventryrequirementsget) | **GET** /objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}/entry_requirements | Retrieve Binder Entry Criteria |
| [**ObjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut**](DefaultApi.md#objectsbindersidversionsmajorversionminorversionlifecycleactionsnamevput) | **PUT** /objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v} | Initiate Binder User Action |
| [**ObjectsBindersLifecycleActionsPost**](DefaultApi.md#objectsbinderslifecycleactionspost) | **POST** /objects/binders/lifecycle_actions | Retrieve User Actions on Multiple Binders |
| [**ObjectsBindersLifecycleActionsUserActionNamePut**](DefaultApi.md#objectsbinderslifecycleactionsuseractionnameput) | **PUT** /objects/binders/lifecycle_actions/{user_action_name} | Initiate Bulk Binder User Actions |
| [**ObjectsBindersPost**](DefaultApi.md#objectsbinderspost) | **POST** /objects/binders | Create Binder |
| [**ObjectsBindersTemplatesGet**](DefaultApi.md#objectsbinderstemplatesget) | **GET** /objects/binders/templates | Retrieve Binder Template Collection |
| [**ObjectsBindersTemplatesPost**](DefaultApi.md#objectsbinderstemplatespost) | **POST** /objects/binders/templates | Create Binder Template |
| [**ObjectsBindersTemplatesPut**](DefaultApi.md#objectsbinderstemplatesput) | **PUT** /objects/binders/templates | Update Binder Template |
| [**ObjectsBindersTemplatesTemplateNameBindernodesGet**](DefaultApi.md#objectsbinderstemplatestemplatenamebindernodesget) | **GET** /objects/binders/templates/{template_name}/bindernodes | Retrieve Binder Template Node Attributes |
| [**ObjectsBindersTemplatesTemplateNameBindernodesPost**](DefaultApi.md#objectsbinderstemplatestemplatenamebindernodespost) | **POST** /objects/binders/templates/{template_name}/bindernodes | Create Binder Template Node |
| [**ObjectsBindersTemplatesTemplateNameBindernodesPut**](DefaultApi.md#objectsbinderstemplatestemplatenamebindernodesput) | **PUT** /objects/binders/templates/{template_name}/bindernodes | Replace Binder Template Nodes |
| [**ObjectsBindersTemplatesTemplateNameDelete**](DefaultApi.md#objectsbinderstemplatestemplatenamedelete) | **DELETE** /objects/binders/templates/{template_name} | Delete Binder Template |
| [**ObjectsBindersTemplatesTemplateNameGet**](DefaultApi.md#objectsbinderstemplatestemplatenameget) | **GET** /objects/binders/templates/{template_name} | Retrieve Binder Template Attributes |
| [**ObjectsDeletionsDocumentsGet**](DefaultApi.md#objectsdeletionsdocumentsget) | **GET** /objects/deletions/documents | Retrieve Deleted Document IDs |
| [**ObjectsDeletionsVobjectsObjectNameGet**](DefaultApi.md#objectsdeletionsvobjectsobjectnameget) | **GET** /objects/deletions/vobjects/{object_name} | Retrieve Deleted Object Record ID |
| [**ObjectsDocumentsActionsGet**](DefaultApi.md#objectsdocumentsactionsget) | **GET** /objects/documents/actions | Retrieve All Document Workflows |
| [**ObjectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet**](DefaultApi.md#objectsdocumentsactionslifecycleandstateandactionjobidresultsget) | **GET** /objects/documents/actions/{lifecycle_and_state_and_action}/{job_id}/results | Download Controlled Copy Job Results |
| [**ObjectsDocumentsActionsWorkflowNameGet**](DefaultApi.md#objectsdocumentsactionsworkflownameget) | **GET** /objects/documents/actions/{workflow_name} | Retrieve Document Workflow Details |
| [**ObjectsDocumentsActionsWorkflowNamePost**](DefaultApi.md#objectsdocumentsactionsworkflownamepost) | **POST** /objects/documents/actions/{workflow_name} | Initiate Document Workflow |
| [**ObjectsDocumentsAnnotationsBatchDelete**](DefaultApi.md#objectsdocumentsannotationsbatchdelete) | **DELETE** /objects/documents/annotations/batch | Delete Annotations |
| [**ObjectsDocumentsAnnotationsBatchPost**](DefaultApi.md#objectsdocumentsannotationsbatchpost) | **POST** /objects/documents/annotations/batch | Create Multiple Annotations |
| [**ObjectsDocumentsAnnotationsBatchPut**](DefaultApi.md#objectsdocumentsannotationsbatchput) | **PUT** /objects/documents/annotations/batch | Update Annotations |
| [**ObjectsDocumentsAnnotationsRepliesBatchPost**](DefaultApi.md#objectsdocumentsannotationsrepliesbatchpost) | **POST** /objects/documents/annotations/replies/batch | Add Annotation Replies |
| [**ObjectsDocumentsAttachmentsBatchDelete**](DefaultApi.md#objectsdocumentsattachmentsbatchdelete) | **DELETE** /objects/documents/attachments/batch | Delete Multiple Document Attachments |
| [**ObjectsDocumentsAttachmentsBatchPost**](DefaultApi.md#objectsdocumentsattachmentsbatchpost) | **POST** /objects/documents/attachments/batch | Create Multiple Document Attachments |
| [**ObjectsDocumentsAttachmentsBatchPut**](DefaultApi.md#objectsdocumentsattachmentsbatchput) | **PUT** /objects/documents/attachments/batch | Update Multiple Document Attachment Descriptions |
| [**ObjectsDocumentsBatchActionsFileextractJobIdResultsGet**](DefaultApi.md#objectsdocumentsbatchactionsfileextractjobidresultsget) | **GET** /objects/documents/batch/actions/fileextract/{job_id}/results | Retrieve Document Export Results |
| [**ObjectsDocumentsBatchActionsFileextractPost**](DefaultApi.md#objectsdocumentsbatchactionsfileextractpost) | **POST** /objects/documents/batch/actions/fileextract | Export Documents |
| [**ObjectsDocumentsBatchActionsReclassifyPut**](DefaultApi.md#objectsdocumentsbatchactionsreclassifyput) | **PUT** /objects/documents/batch/actions/reclassify | Reclassify Multiple Documents |
| [**ObjectsDocumentsBatchActionsRerenderPost**](DefaultApi.md#objectsdocumentsbatchactionsrerenderpost) | **POST** /objects/documents/batch/actions/rerender | Update Multiple Document Renditions |
| [**ObjectsDocumentsBatchDelete**](DefaultApi.md#objectsdocumentsbatchdelete) | **DELETE** /objects/documents/batch | Delete Multiple Documents |
| [**ObjectsDocumentsBatchLockDelete**](DefaultApi.md#objectsdocumentsbatchlockdelete) | **DELETE** /objects/documents/batch/lock | Undo Collaborative Authoring Checkout |
| [**ObjectsDocumentsBatchPost**](DefaultApi.md#objectsdocumentsbatchpost) | **POST** /objects/documents/batch | Create Multiple Documents |
| [**ObjectsDocumentsBatchPut**](DefaultApi.md#objectsdocumentsbatchput) | **PUT** /objects/documents/batch | Update Multiple Documents |
| [**ObjectsDocumentsDocIdAnchorsGet**](DefaultApi.md#objectsdocumentsdocidanchorsget) | **GET** /objects/documents/{doc_id}/anchors | Retrieve Anchor IDs |
| [**ObjectsDocumentsDocIdAnnotationsFileGet**](DefaultApi.md#objectsdocumentsdocidannotationsfileget) | **GET** /objects/documents/{doc_id}/annotations/file | Export Document Annotations to PDF |
| [**ObjectsDocumentsDocIdAnnotationsFilePost**](DefaultApi.md#objectsdocumentsdocidannotationsfilepost) | **POST** /objects/documents/{doc_id}/annotations/file | Import Document Annotations from PDF |
| [**ObjectsDocumentsDocIdAttachmentsAttachmentIdDelete**](DefaultApi.md#objectsdocumentsdocidattachmentsattachmentiddelete) | **DELETE** /objects/documents/{doc_id}/attachments/{attachment_id} | Delete Single Document Attachment |
| [**ObjectsDocumentsDocIdAttachmentsAttachmentIdFileGet**](DefaultApi.md#objectsdocumentsdocidattachmentsattachmentidfileget) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id}/file | Download Document Attachment |
| [**ObjectsDocumentsDocIdAttachmentsAttachmentIdGet**](DefaultApi.md#objectsdocumentsdocidattachmentsattachmentidget) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id} | Retrieve Document Attachment Metadata |
| [**ObjectsDocumentsDocIdAttachmentsAttachmentIdPut**](DefaultApi.md#objectsdocumentsdocidattachmentsattachmentidput) | **PUT** /objects/documents/{doc_id}/attachments/{attachment_id} | Update Document Attachment Description |
| [**ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete**](DefaultApi.md#objectsdocumentsdocidattachmentsattachmentidversionsattachmentversiondelete) | **DELETE** /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version} | Delete Single Document Attachment Version |
| [**ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet**](DefaultApi.md#objectsdocumentsdocidattachmentsattachmentidversionsattachmentversionfileget) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}/file | Download Document Attachment Version |
| [**ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet**](DefaultApi.md#objectsdocumentsdocidattachmentsattachmentidversionsattachmentversionget) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version} | Retrieve Document Attachment Version Metadata |
| [**ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost**](DefaultApi.md#objectsdocumentsdocidattachmentsattachmentidversionsattachmentversionpost) | **POST** /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version} | Restore Document Attachment Version |
| [**ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet**](DefaultApi.md#objectsdocumentsdocidattachmentsattachmentidversionsget) | **GET** /objects/documents/{doc_id}/attachments/{attachment_id}/versions | Retrieve Document Attachment Versions |
| [**ObjectsDocumentsDocIdAttachmentsFileGet**](DefaultApi.md#objectsdocumentsdocidattachmentsfileget) | **GET** /objects/documents/{doc_id}/attachments/file | Download All Document Attachments |
| [**ObjectsDocumentsDocIdAttachmentsGet**](DefaultApi.md#objectsdocumentsdocidattachmentsget) | **GET** /objects/documents/{doc_id}/attachments | Retrieve Document Attachments |
| [**ObjectsDocumentsDocIdAttachmentsPost**](DefaultApi.md#objectsdocumentsdocidattachmentspost) | **POST** /objects/documents/{doc_id}/attachments | Create Document Attachment |
| [**ObjectsDocumentsDocIdAudittrailGet**](DefaultApi.md#objectsdocumentsdocidaudittrailget) | **GET** /objects/documents/{doc_id}/audittrail | Retrieve Complete Audit History for a Single Document |
| [**ObjectsDocumentsDocIdDelete**](DefaultApi.md#objectsdocumentsdociddelete) | **DELETE** /objects/documents/{doc_id} | Delete Single Document |
| [**ObjectsDocumentsDocIdEventsGet**](DefaultApi.md#objectsdocumentsdocideventsget) | **GET** /objects/documents/{doc_id}/events | Retrieve Document Events |
| [**ObjectsDocumentsDocIdFileGet**](DefaultApi.md#objectsdocumentsdocidfileget) | **GET** /objects/documents/{doc_id}/file | Download Document File |
| [**ObjectsDocumentsDocIdGet**](DefaultApi.md#objectsdocumentsdocidget) | **GET** /objects/documents/{doc_id} | Retrieve Document |
| [**ObjectsDocumentsDocIdLockDelete**](DefaultApi.md#objectsdocumentsdocidlockdelete) | **DELETE** /objects/documents/{doc_id}/lock | Delete Document Lock |
| [**ObjectsDocumentsDocIdLockGet**](DefaultApi.md#objectsdocumentsdocidlockget) | **GET** /objects/documents/{doc_id}/lock | Retrieve Document Lock |
| [**ObjectsDocumentsDocIdLockPost**](DefaultApi.md#objectsdocumentsdocidlockpost) | **POST** /objects/documents/{doc_id}/lock | Create Document Lock |
| [**ObjectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet**](DefaultApi.md#objectsdocumentsdocidmajorversionminorversionattachmentsfileget) | **GET** /objects/documents/{doc_id}/{major_version}/{minor_version}/attachments/file | Download All Document Version Attachments |
| [**ObjectsDocumentsDocIdPost**](DefaultApi.md#objectsdocumentsdocidpost) | **POST** /objects/documents/{doc_id} | Create Single Document Version |
| [**ObjectsDocumentsDocIdPut**](DefaultApi.md#objectsdocumentsdocidput) | **PUT** /objects/documents/{doc_id} | Update Single Document |
| [**ObjectsDocumentsDocIdRenditionsGet**](DefaultApi.md#objectsdocumentsdocidrenditionsget) | **GET** /objects/documents/{doc_id}/renditions | Retrieve Document Renditions |
| [**ObjectsDocumentsDocIdRenditionsRenditionTypeDelete**](DefaultApi.md#objectsdocumentsdocidrenditionsrenditiontypedelete) | **DELETE** /objects/documents/{doc_id}/renditions/{rendition_type} | Delete Single Document Rendition |
| [**ObjectsDocumentsDocIdRenditionsRenditionTypeGet**](DefaultApi.md#objectsdocumentsdocidrenditionsrenditiontypeget) | **GET** /objects/documents/{doc_id}/renditions/{rendition_type} | Download Document Rendition File |
| [**ObjectsDocumentsDocIdRenditionsRenditionTypePost**](DefaultApi.md#objectsdocumentsdocidrenditionsrenditiontypepost) | **POST** /objects/documents/{doc_id}/renditions/{rendition_type} | Add Single Document Rendition |
| [**ObjectsDocumentsDocIdRenditionsRenditionTypePut**](DefaultApi.md#objectsdocumentsdocidrenditionsrenditiontypeput) | **PUT** /objects/documents/{doc_id}/renditions/{rendition_type} | Replace Document Rendition |
| [**ObjectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete**](DefaultApi.md#objectsdocumentsdocidrolesrolenameanduserorgroupiddelete) | **DELETE** /objects/documents/{doc_id}/roles/{role_name_and_user_or_group}/{id} | Remove Users &amp; Groups from Roles on a Single Document |
| [**ObjectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet**](DefaultApi.md#objectsdocumentsdocidversionmajorversionminorversionattachmentsget) | **GET** /objects/documents/{doc_id}/version/{major_version}/{minor_version}/attachments | Retrieve Document Version Attachments |
| [**ObjectsDocumentsDocIdVersionsGet**](DefaultApi.md#objectsdocumentsdocidversionsget) | **GET** /objects/documents/{doc_id}/versions | Retrieve Document Versions |
| [**ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet**](DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionannotationsannotationidget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/{annotation_id} | Read Annotations by ID |
| [**ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet**](DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionannotationsannotationidrepliesget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/{annotation_id}/replies | Read Replies of Parent Annotation |
| [**ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet**](DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionannotationsfileget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/file | Export Document Version Annotations to PDF |
| [**ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost**](DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionannotationsfilepost) | **POST** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/file | Import Document Version Annotations from PDF |
| [**ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet**](DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionannotationsget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations | Read Annotations by Document Version and Type |
| [**ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet**](DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionattachmentsattachmentidversionsattachmentversionfileget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/attachments/{attachment_id}/versions/{attachment_version}/file | Download Document Version Attachment Version |
| [**ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet**](DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionattachmentsattachmentidversionsattachmentversionget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/attachments/{attachment_id}/versions/{attachment_version} | Retrieve Document Version Attachment Versions |
| [**ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete**](DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversiondelete) | **DELETE** /objects/documents/{doc_id}/versions/{major_version}/{minor_version} | Delete Single Document Version |
| [**ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet**](DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversiondocexportannotationstocsvget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/doc-export-annotations-to-csv | Retrieve Document Version Notes as CSV |
| [**ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost**](DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversioneventspost) | **POST** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/events | Create Document Event |
| [**ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet**](DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionexportvideoannotationsget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/export-video-annotations | Retrieve Video Annotations |
| [**ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet**](DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionfileget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/file | Download Document Version File |
| [**ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionGet**](DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version} | Retrieve Document Version |
| [**ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionPut**](DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionput) | **PUT** /objects/documents/{doc_id}/versions/{major_version}/{minor_version} | Update Document Version |
| [**ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet**](DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionrelationshipsget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships | Retrieve Document Relationships |
| [**ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost**](DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionrelationshipspost) | **POST** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships | Create Single Document Relationship |
| [**ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete**](DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionrelationshipsrelationshipiddelete) | **DELETE** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Delete Single Document Relationship |
| [**ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet**](DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionrelationshipsrelationshipidget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Retrieve Document Relationship |
| [**ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet**](DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionrenditionsget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions | Retrieve Document Version Renditions |
| [**ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete**](DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionrenditionsrenditiontypedelete) | **DELETE** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Delete Document Version Rendition |
| [**ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet**](DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionrenditionsrenditiontypeget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Download Document Version Rendition File |
| [**ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost**](DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionrenditionsrenditiontypepost) | **POST** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Upload Document Version Rendition |
| [**ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut**](DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionrenditionsrenditiontypeput) | **PUT** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Replace Document Version Rendition |
| [**ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet**](DefaultApi.md#objectsdocumentsdocidversionsmajorversionminorversionthumbnailget) | **GET** /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/thumbnail | Download Document Version Thumbnail File |
| [**ObjectsDocumentsGet**](DefaultApi.md#objectsdocumentsget) | **GET** /objects/documents | Retrieve All Documents |
| [**ObjectsDocumentsIdRolesGet**](DefaultApi.md#objectsdocumentsidrolesget) | **GET** /objects/documents/{id}/roles | Retrieve All Document Roles |
| [**ObjectsDocumentsIdRolesPost**](DefaultApi.md#objectsdocumentsidrolespost) | **POST** /objects/documents/{id}/roles | Assign Users &amp; Groups to Roles on a Single Document |
| [**ObjectsDocumentsIdRolesRoleNameGet**](DefaultApi.md#objectsdocumentsidrolesrolenameget) | **GET** /objects/documents/{id}/roles/{role_name} | Retrieve Document Role |
| [**ObjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet**](DefaultApi.md#objectsdocumentsidversionsmajorversionminorversionlifecycleactionsget) | **GET** /objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions | Retrieve Document User Actions |
| [**ObjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet**](DefaultApi.md#objectsdocumentsidversionsmajorversionminorversionlifecycleactionsnameventryrequirementsget) | **GET** /objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}/entry_requirements | Retrieve Document Entry Criteria |
| [**ObjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut**](DefaultApi.md#objectsdocumentsidversionsmajorversionminorversionlifecycleactionsnamevput) | **PUT** /objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v} | Initiate Document User Action |
| [**ObjectsDocumentsLifecycleActionsPost**](DefaultApi.md#objectsdocumentslifecycleactionspost) | **POST** /objects/documents/lifecycle_actions | Retrieve User Actions on Multiple Documents |
| [**ObjectsDocumentsLifecycleActionsUserActionNamePut**](DefaultApi.md#objectsdocumentslifecycleactionsuseractionnameput) | **PUT** /objects/documents/lifecycle_actions/{user_action_name} | Initiate Bulk Document User Actions |
| [**ObjectsDocumentsPost**](DefaultApi.md#objectsdocumentspost) | **POST** /objects/documents | Create Single Document |
| [**ObjectsDocumentsRelationshipsBatchDelete**](DefaultApi.md#objectsdocumentsrelationshipsbatchdelete) | **DELETE** /objects/documents/relationships/batch | Delete Multiple Document Relationships |
| [**ObjectsDocumentsRelationshipsBatchPost**](DefaultApi.md#objectsdocumentsrelationshipsbatchpost) | **POST** /objects/documents/relationships/batch | Create Multiple Document Relationships |
| [**ObjectsDocumentsRenditionsBatchDelete**](DefaultApi.md#objectsdocumentsrenditionsbatchdelete) | **DELETE** /objects/documents/renditions/batch | Delete Multiple Document Renditions |
| [**ObjectsDocumentsRenditionsBatchPost**](DefaultApi.md#objectsdocumentsrenditionsbatchpost) | **POST** /objects/documents/renditions/batch | Add Multiple Document Renditions |
| [**ObjectsDocumentsRolesBatchDelete**](DefaultApi.md#objectsdocumentsrolesbatchdelete) | **DELETE** /objects/documents/roles/batch | Remove Users and Groups from Roles on Multiple Documents &amp; Binders |
| [**ObjectsDocumentsRolesBatchPost**](DefaultApi.md#objectsdocumentsrolesbatchpost) | **POST** /objects/documents/roles/batch | Assign Users &amp; Groups to Roles on Multiple Documents &amp; Binders |
| [**ObjectsDocumentsTemplatesGet**](DefaultApi.md#objectsdocumentstemplatesget) | **GET** /objects/documents/templates | Retrieve Document Template Collection |
| [**ObjectsDocumentsTemplatesPost**](DefaultApi.md#objectsdocumentstemplatespost) | **POST** /objects/documents/templates | Create Single Document Template |
| [**ObjectsDocumentsTemplatesPut**](DefaultApi.md#objectsdocumentstemplatesput) | **PUT** /objects/documents/templates | Update Multiple Document Templates |
| [**ObjectsDocumentsTemplatesTemplateNameDelete**](DefaultApi.md#objectsdocumentstemplatestemplatenamedelete) | **DELETE** /objects/documents/templates/{template_name} | Delete Basic Document Template |
| [**ObjectsDocumentsTemplatesTemplateNameFileGet**](DefaultApi.md#objectsdocumentstemplatestemplatenamefileget) | **GET** /objects/documents/templates/{template_name}/file | Download Document Template File |
| [**ObjectsDocumentsTemplatesTemplateNameGet**](DefaultApi.md#objectsdocumentstemplatestemplatenameget) | **GET** /objects/documents/templates/{template_name} | Retrieve Document Template Attributes |
| [**ObjectsDocumentsTemplatesTemplateNamePut**](DefaultApi.md#objectsdocumentstemplatestemplatenameput) | **PUT** /objects/documents/templates/{template_name} | Update Single Document Template |
| [**ObjectsDocumentsTokensPost**](DefaultApi.md#objectsdocumentstokenspost) | **POST** /objects/documents/tokens | Document Tokens |
| [**ObjectsDocumentsVersionsBatchActionsFileextractPost**](DefaultApi.md#objectsdocumentsversionsbatchactionsfileextractpost) | **POST** /objects/documents/versions/batch/actions/fileextract | Export Document Versions |
| [**ObjectsDocumentsVersionsBatchDelete**](DefaultApi.md#objectsdocumentsversionsbatchdelete) | **DELETE** /objects/documents/versions/batch | Delete Multiple Document Versions |
| [**ObjectsDocumentsVersionsBatchPost**](DefaultApi.md#objectsdocumentsversionsbatchpost) | **POST** /objects/documents/versions/batch | Create Multiple Document Versions |
| [**ObjectsDomainGet**](DefaultApi.md#objectsdomainget) | **GET** /objects/domain | Retrieve Domain Information |
| [**ObjectsDomainsGet**](DefaultApi.md#objectsdomainsget) | **GET** /objects/domains | Retrieve Domains |
| [**ObjectsEdlMatchedDocumentsBatchActionsAddPost**](DefaultApi.md#objectsedlmatcheddocumentsbatchactionsaddpost) | **POST** /objects/edl_matched_documents/batch/actions/add | Add EDL Matched Documents |
| [**ObjectsEdlMatchedDocumentsBatchActionsRemovePost**](DefaultApi.md#objectsedlmatcheddocumentsbatchactionsremovepost) | **POST** /objects/edl_matched_documents/batch/actions/remove | Remove EDL Matched Documents |
| [**ObjectsGroupsAutoGet**](DefaultApi.md#objectsgroupsautoget) | **GET** /objects/groups/auto | Retrieve Auto Managed Groups |
| [**ObjectsGroupsGet**](DefaultApi.md#objectsgroupsget) | **GET** /objects/groups | Retrieve All Groups |
| [**ObjectsGroupsGroupIdDelete**](DefaultApi.md#objectsgroupsgroupiddelete) | **DELETE** /objects/groups/{group_id} | Delete Group |
| [**ObjectsGroupsGroupIdGet**](DefaultApi.md#objectsgroupsgroupidget) | **GET** /objects/groups/{group_id} | Retrieve Group |
| [**ObjectsGroupsGroupIdPut**](DefaultApi.md#objectsgroupsgroupidput) | **PUT** /objects/groups/{group_id} | Update Group |
| [**ObjectsGroupsPost**](DefaultApi.md#objectsgroupspost) | **POST** /objects/groups | Create Group  |
| [**ObjectsLicensesGet**](DefaultApi.md#objectslicensesget) | **GET** /objects/licenses | Retrieve Application License Usage |
| [**ObjectsObjectworkflowsActionsGet**](DefaultApi.md#objectsobjectworkflowsactionsget) | **GET** /objects/objectworkflows/actions | Retrieve All Multi-Record Workflows |
| [**ObjectsObjectworkflowsActionsWorkflowNameGet**](DefaultApi.md#objectsobjectworkflowsactionsworkflownameget) | **GET** /objects/objectworkflows/actions/{workflow_name} | Retrieve Multi-Record Workflow Details |
| [**ObjectsObjectworkflowsActionsWorkflowNamePost**](DefaultApi.md#objectsobjectworkflowsactionsworkflownamepost) | **POST** /objects/objectworkflows/actions/{workflow_name} | Initiate Multi-Record Workflow |
| [**ObjectsObjectworkflowsGet**](DefaultApi.md#objectsobjectworkflowsget) | **GET** /objects/objectworkflows | Retrieve Workflows |
| [**ObjectsObjectworkflowsTasksGet**](DefaultApi.md#objectsobjectworkflowstasksget) | **GET** /objects/objectworkflows/tasks | Retrieve Workflow Tasks |
| [**ObjectsObjectworkflowsTasksTaskIdActionsAcceptPost**](DefaultApi.md#objectsobjectworkflowstaskstaskidactionsacceptpost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/accept | Accept Single Record Workflow Task |
| [**ObjectsObjectworkflowsTasksTaskIdActionsCancelPost**](DefaultApi.md#objectsobjectworkflowstaskstaskidactionscancelpost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/cancel | Cancel Workflow Task |
| [**ObjectsObjectworkflowsTasksTaskIdActionsCompletePost**](DefaultApi.md#objectsobjectworkflowstaskstaskidactionscompletepost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/complete | Complete Single Record Workflow Task |
| [**ObjectsObjectworkflowsTasksTaskIdActionsGet**](DefaultApi.md#objectsobjectworkflowstaskstaskidactionsget) | **GET** /objects/objectworkflows/tasks/{task_id}/actions | Retrieve Workflow Task Actions |
| [**ObjectsObjectworkflowsTasksTaskIdActionsMdwacceptPost**](DefaultApi.md#objectsobjectworkflowstaskstaskidactionsmdwacceptpost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/mdwaccept | Accept Multi-item Workflow Task |
| [**ObjectsObjectworkflowsTasksTaskIdActionsMdwcompletePost**](DefaultApi.md#objectsobjectworkflowstaskstaskidactionsmdwcompletepost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/mdwcomplete | Complete Multi-item Workflow Task |
| [**ObjectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost**](DefaultApi.md#objectsobjectworkflowstaskstaskidactionsmdwmanagecontentpost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/mdwmanagecontent | Manage Multi-Item Workflow Content |
| [**ObjectsObjectworkflowsTasksTaskIdActionsMdwreassignPost**](DefaultApi.md#objectsobjectworkflowstaskstaskidactionsmdwreassignpost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/mdwreassign | Reassign Multi-item Workflow Task |
| [**ObjectsObjectworkflowsTasksTaskIdActionsReassignPost**](DefaultApi.md#objectsobjectworkflowstaskstaskidactionsreassignpost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/reassign | Reassign Single Record Workflow Task |
| [**ObjectsObjectworkflowsTasksTaskIdActionsTaskActionGet**](DefaultApi.md#objectsobjectworkflowstaskstaskidactionstaskactionget) | **GET** /objects/objectworkflows/tasks/{task_id}/actions/{task_action} | Retrieve Workflow Task Action Details |
| [**ObjectsObjectworkflowsTasksTaskIdActionsUndoacceptPost**](DefaultApi.md#objectsobjectworkflowstaskstaskidactionsundoacceptpost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/undoaccept | Undo Workflow Task Acceptance |
| [**ObjectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost**](DefaultApi.md#objectsobjectworkflowstaskstaskidactionsupdateduedatepost) | **POST** /objects/objectworkflows/tasks/{task_id}/actions/updateduedate | Update Workflow Task Due Date |
| [**ObjectsObjectworkflowsTasksTaskIdGet**](DefaultApi.md#objectsobjectworkflowstaskstaskidget) | **GET** /objects/objectworkflows/tasks/{task_id} | Retrieve Workflow Task Details |
| [**ObjectsObjectworkflowsWorkflowIdActionsGet**](DefaultApi.md#objectsobjectworkflowsworkflowidactionsget) | **GET** /objects/objectworkflows/{workflow_id}/actions | Retrieve Workflow Actions |
| [**ObjectsObjectworkflowsWorkflowIdActionsWorkflowActionGet**](DefaultApi.md#objectsobjectworkflowsworkflowidactionsworkflowactionget) | **GET** /objects/objectworkflows/{workflow_id}/actions/{workflow_action} | Retrieve Workflow Action Details |
| [**ObjectsObjectworkflowsWorkflowIdActionsWorkflowActionPost**](DefaultApi.md#objectsobjectworkflowsworkflowidactionsworkflowactionpost) | **POST** /objects/objectworkflows/{workflow_id}/actions/{workflow_action} | Initiate Workflow Action |
| [**ObjectsObjectworkflowsWorkflowIdGet**](DefaultApi.md#objectsobjectworkflowsworkflowidget) | **GET** /objects/objectworkflows/{workflow_id} | Retrieve Workflow Details |
| [**ObjectsPicklistsGet**](DefaultApi.md#objectspicklistsget) | **GET** /objects/picklists | Retrieve All Picklists |
| [**ObjectsPicklistsPicklistNameGet**](DefaultApi.md#objectspicklistspicklistnameget) | **GET** /objects/picklists/{picklist_name} | Retrieve Picklist Values |
| [**ObjectsPicklistsPicklistNamePicklistValueNameDelete**](DefaultApi.md#objectspicklistspicklistnamepicklistvaluenamedelete) | **DELETE** /objects/picklists/{picklist_name}/{picklist_value_name} | Inactivate Picklist Value |
| [**ObjectsPicklistsPicklistNamePicklistValueNamePut**](DefaultApi.md#objectspicklistspicklistnamepicklistvaluenameput) | **PUT** /objects/picklists/{picklist_name}/{picklist_value_name} | Update Picklist Value |
| [**ObjectsPicklistsPicklistNamePost**](DefaultApi.md#objectspicklistspicklistnamepost) | **POST** /objects/picklists/{picklist_name} | Create Picklist Values |
| [**ObjectsPicklistsPicklistNamePut**](DefaultApi.md#objectspicklistspicklistnameput) | **PUT** /objects/picklists/{picklist_name} | Update Picklist Value Label |
| [**ObjectsSandboxActionsBuildproductionPost**](DefaultApi.md#objectssandboxactionsbuildproductionpost) | **POST** /objects/sandbox/actions/buildproduction | Build Production Vault |
| [**ObjectsSandboxActionsPromoteproductionPost**](DefaultApi.md#objectssandboxactionspromoteproductionpost) | **POST** /objects/sandbox/actions/promoteproduction | Promote to Production |
| [**ObjectsSandboxActionsRecheckusagePost**](DefaultApi.md#objectssandboxactionsrecheckusagepost) | **POST** /objects/sandbox/actions/recheckusage | Recheck Sandbox Usage Limit |
| [**ObjectsSandboxBatchChangesizePost**](DefaultApi.md#objectssandboxbatchchangesizepost) | **POST** /objects/sandbox/batch/changesize | Change Sandbox Size |
| [**ObjectsSandboxEntitlementsSetPost**](DefaultApi.md#objectssandboxentitlementssetpost) | **POST** /objects/sandbox/entitlements/set | Set Sandbox Entitlements |
| [**ObjectsSandboxGet**](DefaultApi.md#objectssandboxget) | **GET** /objects/sandbox | Retrieve Sandboxes |
| [**ObjectsSandboxNameDelete**](DefaultApi.md#objectssandboxnamedelete) | **DELETE** /objects/sandbox/{name} | Delete Sandbox |
| [**ObjectsSandboxPost**](DefaultApi.md#objectssandboxpost) | **POST** /objects/sandbox | Create or Refresh Sandbox |
| [**ObjectsSandboxSnapshotApiNameActionsUpdatePost**](DefaultApi.md#objectssandboxsnapshotapinameactionsupdatepost) | **POST** /objects/sandbox/snapshot/{api_name}/actions/update | Update Sandbox Snapshot |
| [**ObjectsSandboxSnapshotApiNameActionsUpgradePost**](DefaultApi.md#objectssandboxsnapshotapinameactionsupgradepost) | **POST** /objects/sandbox/snapshot/{api_name}/actions/upgrade | Upgrade Sandbox Snapshot |
| [**ObjectsSandboxSnapshotApiNameDelete**](DefaultApi.md#objectssandboxsnapshotapinamedelete) | **DELETE** /objects/sandbox/snapshot/{api_name} | Delete Sandbox Snapshot |
| [**ObjectsSandboxSnapshotGet**](DefaultApi.md#objectssandboxsnapshotget) | **GET** /objects/sandbox/snapshot | Retrieve Sandbox Snapshots |
| [**ObjectsSandboxSnapshotPost**](DefaultApi.md#objectssandboxsnapshotpost) | **POST** /objects/sandbox/snapshot | Create Sandbox Snapshot |
| [**ObjectsSandboxVaultIdActionsRefreshPost**](DefaultApi.md#objectssandboxvaultidactionsrefreshpost) | **POST** /objects/sandbox/{vault_id}/actions/refresh | Refresh Sandbox from Snapshot |
| [**ObjectsSandboxVaultIdGet**](DefaultApi.md#objectssandboxvaultidget) | **GET** /objects/sandbox/{vault_id} | Retrieve Sandbox Details by ID |
| [**ObjectsSecuritypoliciesGet**](DefaultApi.md#objectssecuritypoliciesget) | **GET** /objects/securitypolicies | Retrieve All Security Policies |
| [**ObjectsSecuritypoliciesSecurityPolicyNameGet**](DefaultApi.md#objectssecuritypoliciessecuritypolicynameget) | **GET** /objects/securitypolicies/{security_policy_name} | Retrieve Security Policy |
| [**ObjectsUsersGet**](DefaultApi.md#objectsusersget) | **GET** /objects/users/ | Retrieve All Users |
| [**ObjectsUsersIdGet**](DefaultApi.md#objectsusersidget) | **GET** /objects/users/{id} | Retrieve User |
| [**ObjectsUsersIdPermissionsGet**](DefaultApi.md#objectsusersidpermissionsget) | **GET** /objects/users/{id}/permissions | Retrieve User Permissions |
| [**ObjectsUsersIdPut**](DefaultApi.md#objectsusersidput) | **PUT** /objects/users/{id} | Update Single User |
| [**ObjectsUsersMeGet**](DefaultApi.md#objectsusersmeget) | **GET** /objects/users/me | Validate Session User |
| [**ObjectsUsersMePasswordPost**](DefaultApi.md#objectsusersmepasswordpost) | **POST** /objects/users/me/password | Change My Password |
| [**ObjectsUsersMePermissionsGet**](DefaultApi.md#objectsusersmepermissionsget) | **GET** /objects/users/me/permissions | Retrieve My User Permissions |
| [**ObjectsUsersMePut**](DefaultApi.md#objectsusersmeput) | **PUT** /objects/users/me | Update My User |
| [**ObjectsUsersPost**](DefaultApi.md#objectsuserspost) | **POST** /objects/users | Create Single User |
| [**ObjectsUsersPut**](DefaultApi.md#objectsusersput) | **PUT** /objects/users | Update Multiple Users |
| [**ObjectsUsersUserIdDelete**](DefaultApi.md#objectsusersuseriddelete) | **DELETE** /objects/users/{user_id} | Disable User |
| [**ObjectsUsersUserIdVaultMembershipVaultIdPut**](DefaultApi.md#objectsusersuseridvaultmembershipvaultidput) | **PUT** /objects/users/{user_id}/vault_membership/{vault_id} | Update Vault Membership |
| [**ObjectsVaultActionsComparePost**](DefaultApi.md#objectsvaultactionscomparepost) | **POST** /objects/vault/actions/compare | Vault Compare |
| [**ObjectsVaultActionsConfigreportPost**](DefaultApi.md#objectsvaultactionsconfigreportpost) | **POST** /objects/vault/actions/configreport | Vault Configuration Report |
| [**QueryComponentsPost**](DefaultApi.md#querycomponentspost) | **POST** /query/components | Component Definition Query |
| [**QueryNextPagePost**](DefaultApi.md#querynextpagepost) | **POST** /query/{next_page} | Next Page URL |
| [**QueryPost**](DefaultApi.md#querypost) | **POST** /query | Submitting a Query |
| [**QueryPreviousPagePost**](DefaultApi.md#querypreviouspagepost) | **POST** /query/{previous_page} | Previous Page URL |
| [**ScimV2MeGet**](DefaultApi.md#scimv2meget) | **GET** /scim/v2/Me | Retrieve Current User with SCIM |
| [**ScimV2MePut**](DefaultApi.md#scimv2meput) | **PUT** /scim/v2/Me | Update Current User with SCIM |
| [**ScimV2ResourceTypesGet**](DefaultApi.md#scimv2resourcetypesget) | **GET** /scim/v2/ResourceTypes | Retrieve All SCIM Resource Types |
| [**ScimV2ResourceTypesTypeGet**](DefaultApi.md#scimv2resourcetypestypeget) | **GET** /scim/v2/ResourceTypes/{type} | Retrieve Single SCIM Resource Type |
| [**ScimV2SchemasGet**](DefaultApi.md#scimv2schemasget) | **GET** /scim/v2/Schemas | Retrieve All SCIM Schema Information |
| [**ScimV2SchemasIdGet**](DefaultApi.md#scimv2schemasidget) | **GET** /scim/v2/Schemas/{id} | Retrieve Single SCIM Schema Information |
| [**ScimV2ServiceProviderConfigGet**](DefaultApi.md#scimv2serviceproviderconfigget) | **GET** /scim/v2/ServiceProviderConfig | Retrieve SCIM Provider |
| [**ScimV2TypeGet**](DefaultApi.md#scimv2typeget) | **GET** /scim/v2/{type} | Retrieve SCIM Resources |
| [**ScimV2TypeIdGet**](DefaultApi.md#scimv2typeidget) | **GET** /scim/v2/{type}/{id} | Retrieve Single SCIM Resource |
| [**ScimV2UsersGet**](DefaultApi.md#scimv2usersget) | **GET** /scim/v2/Users | Retrieve All Users with SCIM |
| [**ScimV2UsersIdGet**](DefaultApi.md#scimv2usersidget) | **GET** /scim/v2/Users/{id} | Retrieve Single User with SCIM |
| [**ScimV2UsersIdPut**](DefaultApi.md#scimv2usersidput) | **PUT** /scim/v2/Users/{id} | Update User with SCIM |
| [**ScimV2UsersPost**](DefaultApi.md#scimv2userspost) | **POST** /scim/v2/Users | Create User with SCIM |
| [**ServicesCertificateCertIdGet**](DefaultApi.md#servicescertificatecertidget) | **GET** /services/certificate/{cert_id} | Retrieve Signing Certificate |
| [**ServicesConfigurationModeActionsDisablePost**](DefaultApi.md#servicesconfigurationmodeactionsdisablepost) | **POST** /services/configuration_mode/actions/disable | Disable Configuration Mode |
| [**ServicesConfigurationModeActionsEnablePost**](DefaultApi.md#servicesconfigurationmodeactionsenablepost) | **POST** /services/configuration_mode/actions/enable | Enable Configuration Mode |
| [**ServicesDirectdataFilesGet**](DefaultApi.md#servicesdirectdatafilesget) | **GET** /services/directdata/files | Retrieve Available Direct Data Files |
| [**ServicesDirectdataFilesNameGet**](DefaultApi.md#servicesdirectdatafilesnameget) | **GET** /services/directdata/files/{name} | Download Direct Data File |
| [**ServicesFileStagingItemsContentItemGet**](DefaultApi.md#servicesfilestagingitemscontentitemget) | **GET** /services/file_staging/items/content/{item} | Download Item Content |
| [**ServicesFileStagingItemsItemDelete**](DefaultApi.md#servicesfilestagingitemsitemdelete) | **DELETE** /services/file_staging/items/{item} | Delete File or Folder |
| [**ServicesFileStagingItemsItemGet**](DefaultApi.md#servicesfilestagingitemsitemget) | **GET** /services/file_staging/items/{item} | List Items at a Path |
| [**ServicesFileStagingItemsItemPut**](DefaultApi.md#servicesfilestagingitemsitemput) | **PUT** /services/file_staging/items/{item} | Update Folder or File |
| [**ServicesFileStagingItemsPost**](DefaultApi.md#servicesfilestagingitemspost) | **POST** /services/file_staging/items | Create Folder or File |
| [**ServicesFileStagingUploadGet**](DefaultApi.md#servicesfilestaginguploadget) | **GET** /services/file_staging/upload/ | List Upload Sessions |
| [**ServicesFileStagingUploadPost**](DefaultApi.md#servicesfilestaginguploadpost) | **POST** /services/file_staging/upload | Create Resumable Upload Session |
| [**ServicesFileStagingUploadUploadSessionIdDelete**](DefaultApi.md#servicesfilestaginguploaduploadsessioniddelete) | **DELETE** /services/file_staging/upload/{upload_session_id} | Abort Upload Session |
| [**ServicesFileStagingUploadUploadSessionIdGet**](DefaultApi.md#servicesfilestaginguploaduploadsessionidget) | **GET** /services/file_staging/upload/{upload_session_id} | Get Upload Session Details |
| [**ServicesFileStagingUploadUploadSessionIdPartsGet**](DefaultApi.md#servicesfilestaginguploaduploadsessionidpartsget) | **GET** /services/file_staging/upload/{upload_session_id}/parts | List File Parts Uploaded to Session |
| [**ServicesFileStagingUploadUploadSessionIdPost**](DefaultApi.md#servicesfilestaginguploaduploadsessionidpost) | **POST** /services/file_staging/upload/{upload_session_id} | Commit Upload Session |
| [**ServicesFileStagingUploadUploadSessionIdPut**](DefaultApi.md#servicesfilestaginguploaduploadsessionidput) | **PUT** /services/file_staging/upload/{upload_session_id} | Upload to a Session |
| [**ServicesJobsHistoriesGet**](DefaultApi.md#servicesjobshistoriesget) | **GET** /services/jobs/histories | Retrieve Job Histories |
| [**ServicesJobsJobIdErrorsGet**](DefaultApi.md#servicesjobsjobiderrorsget) | **GET** /services/jobs/{job_id}/errors | Retrieve Import Bulk Translation File Job Errors |
| [**ServicesJobsJobIdGet**](DefaultApi.md#servicesjobsjobidget) | **GET** /services/jobs/{job_id} | Retrieve Job Status |
| [**ServicesJobsJobIdSummaryGet**](DefaultApi.md#servicesjobsjobidsummaryget) | **GET** /services/jobs/{job_id}/summary | Retrieve Import Bulk Translation File Job Summary |
| [**ServicesJobsJobIdTasksGet**](DefaultApi.md#servicesjobsjobidtasksget) | **GET** /services/jobs/{job_id}/tasks | Retrieve SDK Job Tasks |
| [**ServicesJobsMonitorsGet**](DefaultApi.md#servicesjobsmonitorsget) | **GET** /services/jobs/monitors | Retrieve Job Monitors |
| [**ServicesJobsStartNowJobIdPost**](DefaultApi.md#servicesjobsstartnowjobidpost) | **POST** /services/jobs/start_now/{job_id} | Start Job |
| [**ServicesLoaderExtractPost**](DefaultApi.md#servicesloaderextractpost) | **POST** /services/loader/extract | Extract Data Files |
| [**ServicesLoaderJobIdTasksTaskIdFailurelogGet**](DefaultApi.md#servicesloaderjobidtaskstaskidfailurelogget) | **GET** /services/loader/{job_id}/tasks/{task_id}/failurelog | Retrieve Load Failure Log Results |
| [**ServicesLoaderJobIdTasksTaskIdResultsGet**](DefaultApi.md#servicesloaderjobidtaskstaskidresultsget) | **GET** /services/loader/{job_id}/tasks/{task_id}/results | Retrieve Loader Extract Results |
| [**ServicesLoaderJobIdTasksTaskIdResultsRenditionsGet**](DefaultApi.md#servicesloaderjobidtaskstaskidresultsrenditionsget) | **GET** /services/loader/{job_id}/tasks/{task_id}/results/renditions | Retrieve Loader Extract Renditions Results |
| [**ServicesLoaderJobIdTasksTaskIdSuccesslogGet**](DefaultApi.md#servicesloaderjobidtaskstaskidsuccesslogget) | **GET** /services/loader/{job_id}/tasks/{task_id}/successlog | Retrieve Load Success Log Results |
| [**ServicesLoaderLoadPost**](DefaultApi.md#servicesloaderloadpost) | **POST** /services/loader/load | Load Data Objects |
| [**ServicesPackageActionsValidatePost**](DefaultApi.md#servicespackageactionsvalidatepost) | **POST** /services/package/actions/validate | Validate Package |
| [**ServicesPackagePost**](DefaultApi.md#servicespackagepost) | **POST** /services/package | Export Package |
| [**ServicesPackagePut**](DefaultApi.md#servicespackageput) | **PUT** /services/package | Import Package |
| [**ServicesQueuesGet**](DefaultApi.md#servicesqueuesget) | **GET** /services/queues | Retrieve All Queues |
| [**ServicesQueuesQueueNameActionsDisableDeliveryPut**](DefaultApi.md#servicesqueuesqueuenameactionsdisabledeliveryput) | **PUT** /services/queues/{queue_name}/actions/disable_delivery | Disable Delivery |
| [**ServicesQueuesQueueNameActionsEnableDeliveryPut**](DefaultApi.md#servicesqueuesqueuenameactionsenabledeliveryput) | **PUT** /services/queues/{queue_name}/actions/enable_delivery | Enable Delivery |
| [**ServicesQueuesQueueNameActionsResetPut**](DefaultApi.md#servicesqueuesqueuenameactionsresetput) | **PUT** /services/queues/{queue_name}/actions/reset | Reset Queue |
| [**ServicesQueuesQueueNameGet**](DefaultApi.md#servicesqueuesqueuenameget) | **GET** /services/queues/{queue_name} | Retrieve Queue Status |
| [**ServicesVobjectVaultPackageVPackageIdActionsValidatePost**](DefaultApi.md#servicesvobjectvaultpackagevpackageidactionsvalidatepost) | **POST** /services/vobject/vault_package__v/{package_id}/actions/validate | Validate Imported Package |
| [**SessionDelete**](DefaultApi.md#sessiondelete) | **DELETE** /session | End Session |
| [**UicodeDistributionsDistributionNameCodeGet**](DefaultApi.md#uicodedistributionsdistributionnamecodeget) | **GET** /uicode/distributions/{distribution_name}/code | Download Single Client Code Distribution |
| [**UicodeDistributionsDistributionNameDelete**](DefaultApi.md#uicodedistributionsdistributionnamedelete) | **DELETE** /uicode/distributions/{distribution_name} | Delete Single Client Code Distribution |
| [**UicodeDistributionsDistributionNameGet**](DefaultApi.md#uicodedistributionsdistributionnameget) | **GET** /uicode/distributions/{distribution_name} | Retrieve Single Client Code Distribution Metadata |
| [**UicodeDistributionsGet**](DefaultApi.md#uicodedistributionsget) | **GET** /uicode/distributions | Retrieve All Client Code Distribution Metadata |
| [**UicodeDistributionsPost**](DefaultApi.md#uicodedistributionspost) | **POST** /uicode/distributions | Add or Replace Single Client Code Distribution |
| [**VobjectVaultPackageVPackageIdActionsDeployPost**](DefaultApi.md#vobjectvaultpackagevpackageidactionsdeploypost) | **POST** /vobject/vault_package__v/{package_id}/actions/deploy | Deploy Package |
| [**VobjectVaultPackageVPackageIdActionsDeployResultsGet**](DefaultApi.md#vobjectvaultpackagevpackageidactionsdeployresultsget) | **GET** /vobject/vault_package__v/{package_id}/actions/deploy/results | Retrieve Package Deploy Results |
| [**VobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet**](DefaultApi.md#vobjectscascadedeleteresultsobjectnamejobstatusjobidget) | **GET** /vobjects/cascadedelete/results/{object_name}/{job_status}/{job_id} | Retrieve Results of Cascade Delete Job |
| [**VobjectsDeepcopyResultsObjectNameJobStatusJobIdGet**](DefaultApi.md#vobjectsdeepcopyresultsobjectnamejobstatusjobidget) | **GET** /vobjects/deepcopy/results/{object_name}/{job_status}/{job_id} | Retrieve Results of Deep Copy Job |
| [**VobjectsEdlItemVActionsCreateplaceholderPost**](DefaultApi.md#vobjectsedlitemvactionscreateplaceholderpost) | **POST** /vobjects/edl_item__v/actions/createplaceholder | Create a Placeholder from an EDL Item |
| [**VobjectsMergesJobIdLogGet**](DefaultApi.md#vobjectsmergesjobidlogget) | **GET** /vobjects/merges/{job_id}/log | Download Merge Records Job Log |
| [**VobjectsMergesJobIdResultsGet**](DefaultApi.md#vobjectsmergesjobidresultsget) | **GET** /vobjects/merges/{job_id}/results | Retrieve Record Merge Results |
| [**VobjectsMergesJobIdStatusGet**](DefaultApi.md#vobjectsmergesjobidstatusget) | **GET** /vobjects/merges/{job_id}/status | Retrieve Record Merge Status |
| [**VobjectsObjectNameActionsActionNamePost**](DefaultApi.md#vobjectsobjectnameactionsactionnamepost) | **POST** /vobjects/{object_name}/actions/{action_name} | Initiate Object Action on Multiple Records |
| [**VobjectsObjectNameActionsChangetypePost**](DefaultApi.md#vobjectsobjectnameactionschangetypepost) | **POST** /vobjects/{object_name}/actions/changetype | Change Object Type |
| [**VobjectsObjectNameActionsMergePost**](DefaultApi.md#vobjectsobjectnameactionsmergepost) | **POST** /vobjects/{object_name}/actions/merge | Initiate Record Merge |
| [**VobjectsObjectNameActionsRecalculaterollupsGet**](DefaultApi.md#vobjectsobjectnameactionsrecalculaterollupsget) | **GET** /vobjects/{object_name}/actions/recalculaterollups | Retrieve Roll-up Field Recalculation Status |
| [**VobjectsObjectNameActionsRecalculaterollupsPost**](DefaultApi.md#vobjectsobjectnameactionsrecalculaterollupspost) | **POST** /vobjects/{object_name}/actions/recalculaterollups | Recalculate Roll-up Fields |
| [**VobjectsObjectNameActionsUpdatecorporatecurrencyPut**](DefaultApi.md#vobjectsobjectnameactionsupdatecorporatecurrencyput) | **PUT** /vobjects/{object_name}/actions/updatecorporatecurrency | Update Corporate Currency Fields |
| [**VobjectsObjectNameAttachmentsBatchDelete**](DefaultApi.md#vobjectsobjectnameattachmentsbatchdelete) | **DELETE** /vobjects/{object_name}/attachments/batch | Delete Multiple Object Record Attachments |
| [**VobjectsObjectNameAttachmentsBatchPost**](DefaultApi.md#vobjectsobjectnameattachmentsbatchpost) | **POST** /vobjects/{object_name}/attachments/batch | Create Multiple Object Record Attachments |
| [**VobjectsObjectNameAttachmentsBatchPut**](DefaultApi.md#vobjectsobjectnameattachmentsbatchput) | **PUT** /vobjects/{object_name}/attachments/batch | Update Multiple Object Record Attachment Descriptions |
| [**VobjectsObjectNameDelete**](DefaultApi.md#vobjectsobjectnamedelete) | **DELETE** /vobjects/{object_name} | Delete Object Records |
| [**VobjectsObjectNameIdRolesRoleNameGet**](DefaultApi.md#vobjectsobjectnameidrolesrolenameget) | **GET** /vobjects/{object_name}/{id}/roles/{role_name} | Retrieve Object Record Roles |
| [**VobjectsObjectNameObjectRecordIdActionsActionNameGet**](DefaultApi.md#vobjectsobjectnameobjectrecordidactionsactionnameget) | **GET** /vobjects/{object_name}/{object_record_id}/actions/{action_name} | Retrieve Object User Actions Details |
| [**VobjectsObjectNameObjectRecordIdActionsActionNamePost**](DefaultApi.md#vobjectsobjectnameobjectrecordidactionsactionnamepost) | **POST** /vobjects/{object_name}/{object_record_id}/actions/{action_name} | Initiate Object Action on a Single Record |
| [**VobjectsObjectNameObjectRecordIdActionsCascadedeletePost**](DefaultApi.md#vobjectsobjectnameobjectrecordidactionscascadedeletepost) | **POST** /vobjects/{object_name}/{object_record_id}/actions/cascadedelete | Cascade Delete Object Record |
| [**VobjectsObjectNameObjectRecordIdActionsDeepcopyPost**](DefaultApi.md#vobjectsobjectnameobjectrecordidactionsdeepcopypost) | **POST** /vobjects/{object_name}/{object_record_id}/actions/deepcopy | Deep Copy Object Record |
| [**VobjectsObjectNameObjectRecordIdActionsGet**](DefaultApi.md#vobjectsobjectnameobjectrecordidactionsget) | **GET** /vobjects/{object_name}/{object_record_id}/actions | Retrieve Object Record User Actions |
| [**VobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet**](DefaultApi.md#vobjectsobjectnameobjectrecordidattachmentfieldsattachmentfieldnamefileget) | **GET** /vobjects/{object_name}/{object_record_id}/attachment_fields/{attachment_field_name}/file | Download Attachment Field File |
| [**VobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost**](DefaultApi.md#vobjectsobjectnameobjectrecordidattachmentfieldsattachmentfieldnamefilepost) | **POST** /vobjects/{object_name}/{object_record_id}/attachment_fields/{attachment_field_name}/file | Update Attachment Field File |
| [**VobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet**](DefaultApi.md#vobjectsobjectnameobjectrecordidattachmentfieldsfileget) | **GET** /vobjects/{object_name}/{object_record_id}/attachment_fields/file | Download All Attachment Field Files |
| [**VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete**](DefaultApi.md#vobjectsobjectnameobjectrecordidattachmentsattachmentiddelete) | **DELETE** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id} | Delete Object Record Attachment |
| [**VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet**](DefaultApi.md#vobjectsobjectnameobjectrecordidattachmentsattachmentidget) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id} | Retrieve Object Record Attachment Metadata |
| [**VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut**](DefaultApi.md#vobjectsobjectnameobjectrecordidattachmentsattachmentidput) | **PUT** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id} | Update Object Record Attachment Description |
| [**VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete**](DefaultApi.md#vobjectsobjectnameobjectrecordidattachmentsattachmentidversionsattachmentversiondelete) | **DELETE** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version} | Delete Object Record Attachment Version |
| [**VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet**](DefaultApi.md#vobjectsobjectnameobjectrecordidattachmentsattachmentidversionsattachmentversionfileget) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}/file | Download Object Record Attachment File |
| [**VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet**](DefaultApi.md#vobjectsobjectnameobjectrecordidattachmentsattachmentidversionsattachmentversionget) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version} | Retrieve Object Record Attachment Version Metadata |
| [**VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost**](DefaultApi.md#vobjectsobjectnameobjectrecordidattachmentsattachmentidversionsattachmentversionpost) | **POST** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version} | Restore Object Record Attachment Version |
| [**VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet**](DefaultApi.md#vobjectsobjectnameobjectrecordidattachmentsattachmentidversionsget) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions | Retrieve Object Record Attachment Versions |
| [**VobjectsObjectNameObjectRecordIdAttachmentsFileGet**](DefaultApi.md#vobjectsobjectnameobjectrecordidattachmentsfileget) | **GET** /vobjects/{object_name}/{object_record_id}/attachments/file | Download All Object Record Attachment Files |
| [**VobjectsObjectNameObjectRecordIdAttachmentsGet**](DefaultApi.md#vobjectsobjectnameobjectrecordidattachmentsget) | **GET** /vobjects/{object_name}/{object_record_id}/attachments | Retrieve Object Record Attachments |
| [**VobjectsObjectNameObjectRecordIdAttachmentsPost**](DefaultApi.md#vobjectsobjectnameobjectrecordidattachmentspost) | **POST** /vobjects/{object_name}/{object_record_id}/attachments | Create Object Record Attachment |
| [**VobjectsObjectNameObjectRecordIdAudittrailGet**](DefaultApi.md#vobjectsobjectnameobjectrecordidaudittrailget) | **GET** /vobjects/{object_name}/{object_record_id}/audittrail | Retrieve Complete Audit History for a Single Object Record |
| [**VobjectsObjectNameObjectRecordIdGet**](DefaultApi.md#vobjectsobjectnameobjectrecordidget) | **GET** /vobjects/{object_name}/{object_record_id} | Retrieve Object Record |
| [**VobjectsObjectNamePost**](DefaultApi.md#vobjectsobjectnamepost) | **POST** /vobjects/{object_name} | Create &amp; Upsert Object Records |
| [**VobjectsObjectNamePut**](DefaultApi.md#vobjectsobjectnameput) | **PUT** /vobjects/{object_name} | Update Object Records |
| [**VobjectsObjectNameRolesDelete**](DefaultApi.md#vobjectsobjectnamerolesdelete) | **DELETE** /vobjects/{object_name}/roles | Remove Users &amp; Groups from Roles on Object Records |
| [**VobjectsObjectNameRolesPost**](DefaultApi.md#vobjectsobjectnamerolespost) | **POST** /vobjects/{object_name}/roles | Assign Users &amp; Groups to Roles on Object Records |
| [**VobjectsOutboundPackageVPackageIdDependenciesGet**](DefaultApi.md#vobjectsoutboundpackagevpackageiddependenciesget) | **GET** /vobjects/outbound_package__v/{package_id}/dependencies | Retrieve Outbound Package Dependencies |

<a id="apiget"></a>
# **ApiGet**
> void ApiGet (string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve API Versions


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="apimdlcomponentscomponenttypeandrecordnamefilesget"></a>
# **ApiMdlComponentsComponentTypeAndRecordNameFilesGet**
> void ApiMdlComponentsComponentTypeAndRecordNameFilesGet (string componentTypeAndRecordName, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Content File


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **componentTypeAndRecordName** | **string** | The component type of the record followed by the name of the record from which to retrieve the content file. The format is &#x60;{Componenttype}.{record_name}&#x60;. For example, &#x60;Formattedoutput.my_formatted_output__c&#x60;. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="apimdlcomponentscomponenttypeandrecordnameget"></a>
# **ApiMdlComponentsComponentTypeAndRecordNameGet**
> void ApiMdlComponentsComponentTypeAndRecordNameGet (string componentTypeAndRecordName, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Component Record (MDL)


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **componentTypeAndRecordName** | **string** | The component type name (&#x60;Picklist&#x60;, &#x60;Docfield&#x60;, &#x60;Doctype&#x60;, etc.) followed by the name of the record from which to retrieve metadata. The format is &#x60;{Componenttype}.{record_name}&#x60;. For example, &#x60;Picklist.color__c&#x60;. Find this with the [Retrieve Component Record Collection](https://developer.veevavault.com/api/24.3#Retrieve_Component_Record_Collection) endpoint. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="apimdlexecuteasyncjobidresultsget"></a>
# **ApiMdlExecuteAsyncJobIdResultsGet**
> void ApiMdlExecuteAsyncJobIdResultsGet (string jobId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Asynchronous MDL Script Results


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **jobId** | **string** |  |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="apimdlexecuteasyncpost"></a>
# **ApiMdlExecuteAsyncPost**
> void ApiMdlExecuteAsyncPost (string authorization = null, string accept = null, string xVaultAPIClientID = null)

Execute MDL Script Asynchronously


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="apimdlexecutepost"></a>
# **ApiMdlExecutePost**
> void ApiMdlExecutePost (string authorization = null, string accept = null, string xVaultAPIClientID = null)

Execute MDL Script


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="apimdlfilespost"></a>
# **ApiMdlFilesPost**
> void ApiMdlFilesPost (string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Upload Content File


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="audittrailaudittrailtypeget"></a>
# **AudittrailAuditTrailTypeGet**
> void AudittrailAuditTrailTypeGet (string auditTrailType, string startDate = null, string endDate = null, string allDates = null, string formatResult = null, string limit = null, string offset = null, string objects = null, string events = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Audit Details


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **auditTrailType** | **string** | The name of the specified audit type (document_audit_trail, object_audit_trail, etc). Use the Retrieve Audit Types API to retrieve types available in your Vault. Requests for login_audit_trail only accept one request per user at a time. |  |
| **startDate** | **string** | Specify a start date to retrieve audit information. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z. If omitted, defaults to the last 30 days. | [optional]  |
| **endDate** | **string** | Specify an end date to retrieve audit information. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z. If omitted, defaults to the last 30 days. | [optional]  |
| **allDates** | **string** | Set to true to request audit information for all dates. You must leave start_date and end_date blank when requesting an export of a full audit trail. | [optional]  |
| **formatResult** | **string** | To request a downloadable CSV file of your audit details, use csv. The response contains a jobId to retrieve the job status, which contains a link to download the CSV file. If omitted, the API returns a JSON response and does not start a job. If all_dates is true, this parameter is required. | [optional]  |
| **limit** | **string** | Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200. | [optional]  |
| **offset** | **string** | Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0. | [optional]  |
| **objects** | **string** | This is an optional parameter when specifying object_audit_trail as the {audit_trail_type}. Provide a comma-separated list of one or more object names to retrieve their audit details. For example, objects&#x3D;product__v,country__v. If omitted, defaults to all objects. | [optional]  |
| **events** | **string** | This is an optional parameter when specifying object_audit_trail or document_audit_trail as the {audit_trail_type}. Provide a comma-separated list of one or more audit events to retrieve their audit details. For example, events&#x3D;Edit,Delete,TaskAssignment. If omitted, defaults to all audit events. See Vault Help for full lists of object audit events and document audit events. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="authdiscoverypost"></a>
# **AuthDiscoveryPost**
> void AuthDiscoveryPost (string accept = null, string xVaultAPIClientID = null)

Authentication Type Discovery


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="authoauthsessionoathoidcprofileidpost"></a>
# **AuthOauthSessionOathOidcProfileIdPost**
> void AuthOauthSessionOathOidcProfileIdPost (string oathOidcProfileId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

OAuth 2.0 / OpenID Connect


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **oathOidcProfileId** | **string** |  |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="authpost"></a>
# **AuthPost**
> void AuthPost (string contentType = null, string accept = null, string xVaultAPIClientID = null)

User Name and Password


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="codeclassnamedelete"></a>
# **CodeClassNameDelete**
> void CodeClassNameDelete (string className, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Delete Single Source Code File


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **className** | **string** | The fully qualified class name of your file. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="codeclassnamedisableput"></a>
# **CodeClassNameDisablePut**
> void CodeClassNameDisablePut (string className, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Disable Vault Extension


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **className** | **string** | The fully qualified class name of your file. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="codeclassnameenableput"></a>
# **CodeClassNameEnablePut**
> void CodeClassNameEnablePut (string className, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Enable Vault Extension


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **className** | **string** | The fully qualified class name of your file. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="codeclassnameget"></a>
# **CodeClassNameGet**
> void CodeClassNameGet (string className, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Single Source Code File


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **className** | **string** | The fully qualified class name of your file. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="codeprofilerget"></a>
# **CodeProfilerGet**
> void CodeProfilerGet (string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve All Profiling Sessions


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="codeprofilerpost"></a>
# **CodeProfilerPost**
> void CodeProfilerPost (string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Create Profiling Session


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="codeprofilersessionnameactionsendpost"></a>
# **CodeProfilerSessionNameActionsEndPost**
> void CodeProfilerSessionNameActionsEndPost (string sessionName, string authorization = null, string accept = null, string xVaultAPIClientID = null)

End Profiling Session


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionName** | **string** | The name of the session, for example,  baseline__c. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="codeprofilersessionnamedelete"></a>
# **CodeProfilerSessionNameDelete**
> void CodeProfilerSessionNameDelete (string sessionName, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Delete Profiling Session


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionName** | **string** | The name of the session, for example,  baseline__c. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="codeprofilersessionnameget"></a>
# **CodeProfilerSessionNameGet**
> void CodeProfilerSessionNameGet (string sessionName, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Profiling Session


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionName** | **string** | The name of the session, for example,  baseline__c. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="codeprofilersessionnameresultsget"></a>
# **CodeProfilerSessionNameResultsGet**
> void CodeProfilerSessionNameResultsGet (string sessionName, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Download Profiling Session Results


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **sessionName** | **string** | The name of the session, for example,  baseline__c. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="codeput"></a>
# **CodePut**
> void CodePut (string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Add or Replace Single Source Code File


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="compositestreesedlhierarchyortemplateactionslistnodespost"></a>
# **CompositesTreesEdlHierarchyOrTemplateActionsListnodesPost**
> void CompositesTreesEdlHierarchyOrTemplateActionsListnodesPost (string edlHierarchyOrTemplate, string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Specific Root Nodes


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **edlHierarchyOrTemplate** | **string** | Choose to retrieve either edl_hierarchy__v or edl_template__v |  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="compositestreesedlhierarchyortemplateget"></a>
# **CompositesTreesEdlHierarchyOrTemplateGet**
> void CompositesTreesEdlHierarchyOrTemplateGet (string edlHierarchyOrTemplate, string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Retrieve All Root Nodes


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **edlHierarchyOrTemplate** | **string** |  |  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="compositestreesedlhierarchyvparentnodeidchildrenget"></a>
# **CompositesTreesEdlHierarchyVParentNodeIdChildrenGet**
> void CompositesTreesEdlHierarchyVParentNodeIdChildrenGet (string parentNodeId, string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Retrieve a Node's Children


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **parentNodeId** | **string** | The ID of a parent node in the hierarchy. |  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="compositestreesedlhierarchyvparentnodeidchildrenput"></a>
# **CompositesTreesEdlHierarchyVParentNodeIdChildrenPut**
> void CompositesTreesEdlHierarchyVParentNodeIdChildrenPut (string parentNodeId, string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Update Node Order


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **parentNodeId** | **string** | The ID of a parent node in the hierarchy. |  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="configurationcomponenttypeandrecordnameget"></a>
# **ConfigurationComponentTypeAndRecordNameGet**
> void ConfigurationComponentTypeAndRecordNameGet (string componentTypeAndRecordName, string loc = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Component Record (XML/JSON)


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **componentTypeAndRecordName** | **string** | The component type name (&#x60;Picklist&#x60;, &#x60;Docfield&#x60;, &#x60;Doctype&#x60;, etc.) followed by the name of the record from which to retrieve metadata. The format is &#x60;{Componenttype}.{record_name}&#x60;. For example, &#x60;Picklist.color__c&#x60;. Find this with the [Retrieve Component Record Collection](https://developer.veevavault.com/api/24.3#Retrieve_Component_Record_Collection) endpoint. |  |
| **loc** | **string** | When localized (translated) strings are available, retrieve them by setting loc to true. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="configurationcomponenttypeget"></a>
# **ConfigurationComponentTypeGet**
> void ConfigurationComponentTypeGet (string componentType, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Component Record Collection


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **componentType** | **string** |  |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="configurationobjectnameandobjecttypeget"></a>
# **ConfigurationObjectNameAndObjectTypeGet**
> void ConfigurationObjectNameAndObjectTypeGet (string objectNameAndObjectType, string loc = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Details from a Specific Object


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectNameAndObjectType** | **string** | The object name followed by the object type in the format &#x60;Objecttype.{object_name}.{object_type}&#x60;. For example, &#x60;Objecttype.product__v.base__v&#x60;. |  |
| **loc** | **string** | When localized (translated) strings are available, retrieve them by setting loc to true. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="configurationobjecttypeget"></a>
# **ConfigurationObjecttypeGet**
> void ConfigurationObjecttypeGet (string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Details from All Object Types


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="configurationroleassignmentruledelete"></a>
# **ConfigurationRoleAssignmentRuleDelete**
> void ConfigurationRoleAssignmentRuleDelete (string authorization = null, string accept = null, string xVaultAPIClientID = null)

Delete Lifecycle Role Assignment Override Rules


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="configurationroleassignmentruleget"></a>
# **ConfigurationRoleAssignmentRuleGet**
> void ConfigurationRoleAssignmentRuleGet (string lifecycleV = null, string roleV = null, string productV = null, string countryV = null, string studyV = null, string studyCountryV = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Lifecycle Role Assignment Rules (Default & Override)


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **lifecycleV** | **string** | Include the name of the lifecycle from which to retrieve information. For example: lifecycle_v&#x3D;general_lifecycle__c | [optional]  |
| **roleV** | **string** | Include the name of the role from which to retrieve information. For example: role__v&#x3D;editor__c | [optional]  |
| **productV** | **string** | Include the ID/name of a specific product to see product-based override rules to default users/allowed users for the lifecycle role. For example: product__v&#x3D;0PR0011001 or product__v.name__v&#x3D;CholeCap | [optional]  |
| **countryV** | **string** | Include the ID/name of a specific country to see country-based override rules to default users/allowed users for the lifecycle role. For example: country__v&#x3D;0CR0022002 or country__v.name__v&#x3D;United States | [optional]  |
| **studyV** | **string** | In eTMF Vaults only. Include the ID/name of a specific study to see study-based override rules to default users/allowed users for the lifecycle role. For example: study__v&#x3D;0ST0021J01 or study__v.name__v&#x3D;CholeCap Study | [optional]  |
| **studyCountryV** | **string** | In eTMF Vaults only. Include the ID/name of a specific study country to see study country-based override rules to default users/allowed users for the lifecycle role. For example: study_country__v&#x3D;0SC0001001 or study_country__v.name__v&#x3D;Germany | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="configurationroleassignmentrulepost"></a>
# **ConfigurationRoleAssignmentRulePost**
> void ConfigurationRoleAssignmentRulePost (string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Create Lifecycle Role Assignment Override Rules


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="configurationroleassignmentruleput"></a>
# **ConfigurationRoleAssignmentRulePut**
> void ConfigurationRoleAssignmentRulePut (string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Update Lifecycle Role Assignment Rules (Default & Override)


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="delegationloginpost"></a>
# **DelegationLoginPost**
> void DelegationLoginPost (string authorization = null, string accept = null, string xVaultAPIClientID = null)

Initiate Delegated Session


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** | The sessionId of the currently authenticated user who will initiate the delegated session. Cannot be a delegated_sessionid. | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="delegationvaultsget"></a>
# **DelegationVaultsGet**
> void DelegationVaultsGet (string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Delegations


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="keepalivepost"></a>
# **KeepAlivePost**
> void KeepAlivePost (string authorization = null, string accept = null, string xVaultAPIClientID = null)

Session Keep Alive


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="limitsget"></a>
# **LimitsGet**
> void LimitsGet (string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Limits on Objects


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="logsapiusageget"></a>
# **LogsApiUsageGet**
> void LogsApiUsageGet (string date = null, string logFormat = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Download Daily API Usage


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **date** | **string** | The day to retrieve the API Usage log. Date is in UTC and follows the format YYYY-MM-DD. Date cannot be more than 30 days in the past. | [optional]  |
| **logFormat** | **string** | Optional: Specify the format to download. Possible values are csv or logfile. If omitted, defaults to csv. Note that this call always downloads a ZIP file. This parameter only changes the format of the file contained within the ZIP.  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="logscodedebugget"></a>
# **LogsCodeDebugGet**
> void LogsCodeDebugGet (string userId = null, bool includeInactive = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve All Debug Logs


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **userId** | **string** | Filter results to retrieve the debug log for this user ID only. If omitted, this request retrieves debug logs for all users in the Vault. | [optional]  |
| **includeInactive** | **bool** | Set to &#x60;true&#x60; to include debug log sessions with a status of &#x60;inactive__sys&#x60; in the response. If omitted, defaults to &#x60;false&#x60; and inactive sessions are not included in the response. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="logscodedebugidactionsresetdelete"></a>
# **LogsCodeDebugIdActionsResetDelete**
> void LogsCodeDebugIdActionsResetDelete (string id, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Delete Debug Log


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** | The ID of the debug log to delete. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="logscodedebugidactionsresetpost"></a>
# **LogsCodeDebugIdActionsResetPost**
> void LogsCodeDebugIdActionsResetPost (string id, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Reset Debug Log


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** | The ID of the debug log to delete. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="logscodedebugidfilesget"></a>
# **LogsCodeDebugIdFilesGet**
> void LogsCodeDebugIdFilesGet (string id, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Download Debug Log Files


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** | The ID of the debug log to download. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="logscodedebugidget"></a>
# **LogsCodeDebugIdGet**
> void LogsCodeDebugIdGet (string id, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Single Debug Log


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** | The ID of the debug log to retrieve. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="logscodedebugpost"></a>
# **LogsCodeDebugPost**
> void LogsCodeDebugPost (string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Create Debug Log


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="logscoderuntimeget"></a>
# **LogsCodeRuntimeGet**
> void LogsCodeRuntimeGet (string date = null, string logFormat = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Download SDK Runtime Log


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **date** | **string** |  | [optional]  |
| **logFormat** | **string** | Optional: Specify the format to download. Possible values are csv or logfile. If omitted, defaults to csv. Note that this call always downloads a ZIP file. This parameter only changes the format of the file contained within the ZIP.  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="messagesmessagetypeactionsimportpost"></a>
# **MessagesMessageTypeActionsImportPost**
> void MessagesMessageTypeActionsImportPost (string messageType, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Import Bulk Translation File


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **messageType** | **string** | The message type name: field_labels__sys, system_messages__sys, notification_template_messages__sys, or user_account_messages__sys. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="messagesmessagetypelanguagelangactionsexportpost"></a>
# **MessagesMessageTypeLanguageLangActionsExportPost**
> void MessagesMessageTypeLanguageLangActionsExportPost (string messageType, string lang, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Export Bulk Translation File


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **messageType** | **string** | The message type name: field_labels__sys, system_messages__sys, notification_template_messages__sys, or user_account_messages__sys. |  |
| **lang** | **string** | A valid language code value, for example, en. Retrieve available values from the Admin Key (admin_key__sys) field on the Language (language__sys) object. Active and Inactive languages are both valid.  |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="metadataaudittrailaudittrailtypeget"></a>
# **MetadataAudittrailAuditTrailTypeGet**
> void MetadataAudittrailAuditTrailTypeGet (string auditTrailType, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Audit Metadata


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **auditTrailType** | **string** | The name of the specified audit type (document_audit_trail, object_audit_trail, etc). |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="metadataaudittrailget"></a>
# **MetadataAudittrailGet**
> void MetadataAudittrailGet (string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Audit Types


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="metadatacomponentscomponenttypeget"></a>
# **MetadataComponentsComponentTypeGet**
> void MetadataComponentsComponentTypeGet (string componentType, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Component Type Metadata


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **componentType** | **string** | The component type name (Picklist, Docfield, Doctype, etc.). |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="metadatacomponentsget"></a>
# **MetadataComponentsGet**
> void MetadataComponentsGet (string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve All Component Metadata


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="metadataobjectsbinderstemplatesbindernodesget"></a>
# **MetadataObjectsBindersTemplatesBindernodesGet**
> void MetadataObjectsBindersTemplatesBindernodesGet (string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Binder Template Node Metadata


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="metadataobjectsbinderstemplatesget"></a>
# **MetadataObjectsBindersTemplatesGet**
> void MetadataObjectsBindersTemplatesGet (string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Binder Template Metadata


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="metadataobjectsdocumentsannotationsplacemarkstypesplacemarktypeget"></a>
# **MetadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet**
> void MetadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet (string placemarkType, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Annotation Placemark Type Metadata


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **placemarkType** | **string** | The name of the placemark type. For example, sticky__sys. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="metadataobjectsdocumentsannotationsreferencestypesreferencetypeget"></a>
# **MetadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet**
> void MetadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet (string referenceType, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Annotation Reference Type Metadata


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **referenceType** | **string** |  |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="metadataobjectsdocumentsannotationstypesannotationtypeget"></a>
# **MetadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet**
> void MetadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet (string annotationType, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Annotation Type Metadata


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **annotationType** | **string** | The name of the annotation type. Valid annotation types include: &#x60;note__sys&#x60; &#x60;line__sys&#x60; &#x60;document_link__sys&#x60; &#x60;permalink_link__sys&#x60; &#x60;anchor__sys&#x60; &#x60;reply__sys&#x60; &#x60;external_link__sys&#x60;  The following annotation types are only valid in Medical and PromoMats Vaults:  &#x60;suggested_link__sys&#x60; &#x60;approved_link__sys&#x60; &#x60;auto_link__sys&#x60; &#x60;keyword_link__sys&#x60; |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="metadataobjectsdocumentseventseventtypetypeseventsubtypeget"></a>
# **MetadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet**
> void MetadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet (string eventType, string eventSubtype, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Document Event SubType Metadata


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **eventType** | **string** | The event type. For example, distribution__v. |  |
| **eventSubtype** | **string** | The event subtype. For example, approved_email__v. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="metadataobjectsdocumentseventsget"></a>
# **MetadataObjectsDocumentsEventsGet**
> void MetadataObjectsDocumentsEventsGet (string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Document Event Types and Subtypes


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="metadataobjectsdocumentslockget"></a>
# **MetadataObjectsDocumentsLockGet**
> void MetadataObjectsDocumentsLockGet (string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Document Lock Metadata


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="metadataobjectsdocumentspropertiesfindcommonpost"></a>
# **MetadataObjectsDocumentsPropertiesFindCommonPost**
> void MetadataObjectsDocumentsPropertiesFindCommonPost (string contentType = null, string accept = null, string authorization = null, string xVaultAPIClientID = null)

Retrieve Common Document Fields


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="metadataobjectsdocumentspropertiesget"></a>
# **MetadataObjectsDocumentsPropertiesGet**
> void MetadataObjectsDocumentsPropertiesGet (string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve All Document Fields


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="metadataobjectsdocumentstemplatesget"></a>
# **MetadataObjectsDocumentsTemplatesGet**
> void MetadataObjectsDocumentsTemplatesGet (string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Document Template Metadata


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="metadataobjectsdocumentstypesget"></a>
# **MetadataObjectsDocumentsTypesGet**
> void MetadataObjectsDocumentsTypesGet (string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve All Document Types


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="metadataobjectsdocumentstypestypeget"></a>
# **MetadataObjectsDocumentsTypesTypeGet**
> void MetadataObjectsDocumentsTypesTypeGet (string type, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Document Type


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **type** | **string** | The document type. See Retrieve Document Types. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="metadataobjectsdocumentstypestyperelationshipsget"></a>
# **MetadataObjectsDocumentsTypesTypeRelationshipsGet**
> void MetadataObjectsDocumentsTypesTypeRelationshipsGet (string type, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Document Type Relationships


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **type** | **string** | The document type. See Retrieve Document Types. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="metadataobjectsdocumentstypestypesubtypessubtypeclassificationsclassificationget"></a>
# **MetadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet**
> void MetadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet (string type, string subtype, string classification, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Document Classification


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **type** | **string** | The document type. See Retrieve Document Types. |  |
| **subtype** | **string** | The document subtype. See Retrieve Document Types. |  |
| **classification** | **string** | The document classification. See Retrieve Document Types. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="metadataobjectsdocumentstypestypesubtypessubtypeget"></a>
# **MetadataObjectsDocumentsTypesTypeSubtypesSubtypeGet**
> void MetadataObjectsDocumentsTypesTypeSubtypesSubtypeGet (string type, string subtype, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Document Subtype


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **type** | **string** | The document type. See Retrieve Document Types. |  |
| **subtype** | **string** | The document subtype. See Retrieve Document Types. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="metadataobjectsgroupsget"></a>
# **MetadataObjectsGroupsGet**
> void MetadataObjectsGroupsGet (string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Group Metadata


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="metadataobjectssecuritypoliciesget"></a>
# **MetadataObjectsSecuritypoliciesGet**
> void MetadataObjectsSecuritypoliciesGet (string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Security Policy Metadata


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="metadataobjectsusersget"></a>
# **MetadataObjectsUsersGet**
> void MetadataObjectsUsersGet (string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve User Metadata


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="metadataqueryarchiveddocumentsrelationshipsdocumentsignaturesysrget"></a>
# **MetadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet**
> void MetadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet (string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Archived Document Signature Metadata


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="metadataquerydocumentsrelationshipsdocumentsignaturesysrget"></a>
# **MetadataQueryDocumentsRelationshipsDocumentSignatureSysrGet**
> void MetadataQueryDocumentsRelationshipsDocumentSignatureSysrGet (string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Document Signature Metadata


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="metadatavobjectsget"></a>
# **MetadataVobjectsGet**
> void MetadataVobjectsGet (bool loc = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Object Collection


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **loc** | **bool** | To retrieve localized (translated) strings, include the parameter loc&#x3D;true. See the next request below for details. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="metadatavobjectsobjectnameactionscanceldeploymentpost"></a>
# **MetadataVobjectsObjectNameActionsCanceldeploymentPost**
> void MetadataVobjectsObjectNameActionsCanceldeploymentPost (string objectName, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Cancel Raw Object Deployment


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** |  |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="metadatavobjectsobjectnamefieldsobjectfieldnameget"></a>
# **MetadataVobjectsObjectNameFieldsObjectFieldNameGet**
> void MetadataVobjectsObjectNameFieldsObjectFieldNameGet (string objectName, string objectFieldName, bool loc = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Object Field Metadata


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |  |
| **objectFieldName** | **string** | The object field name value (id, name__v, external_id__v, etc.). |  |
| **loc** | **bool** | To retrieve localized (translated) strings, include the parameter loc&#x3D;true. See the next request below for details. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="metadatavobjectsobjectnameget"></a>
# **MetadataVobjectsObjectNameGet**
> void MetadataVobjectsObjectNameGet (string objectName, bool loc = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Object Metadata


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |  |
| **loc** | **bool** | To retrieve localized (translated) strings, include the parameter loc&#x3D;true. See the next request below for details. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="metadatavobjectsobjectnamepagelayoutsget"></a>
# **MetadataVobjectsObjectNamePageLayoutsGet**
> void MetadataVobjectsObjectNamePageLayoutsGet (string objectName, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Page Layouts


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** |  |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="metadatavobjectsobjectnamepagelayoutslayoutnameget"></a>
# **MetadataVobjectsObjectNamePageLayoutsLayoutNameGet**
> void MetadataVobjectsObjectNamePageLayoutsLayoutNameGet (string objectName, string layoutName, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Page Layout Metadata


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The name of the object from which to retrieve page layout metadata. |  |
| **layoutName** | **string** | The name of the page layout from which to retrieve metadata. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="notificationshistoriesget"></a>
# **NotificationsHistoriesGet**
> void NotificationsHistoriesGet (string startDate = null, string endDate = null, bool allDates = null, string formatResult = null, string limit = null, string offset = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Email Notification Histories


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **startDate** | **string** | Specify a start date to retrieve notification history. This date cannot be more than 2 years ago. Dates must be in YYYY-MM-DD or YYYY-MM-DDTHH:mm:ssZ format. If time is omitted (THH:mm:ssZ), defaults to the start of the day. If start_date is omitted entirely, defaults to the start of the previous day. If you’ve specified a start_date, you must also specify an end_date. | [optional]  |
| **endDate** | **string** | Specify an end date to retrieve notification history. This date cannot be more than 30 days away from the specified start_date. Dates must be in YYYY-MM-DD or YYYY-MM-DDTHH:mm:ssZ format. If time is omitted (THH:mm:ssZ), defaults to the time of the API request. If you’ve specified an end_date, you must also specify a start_date. | [optional]  |
| **allDates** | **bool** | Set to true to request notification history for all dates. This is the same as requesting a full CSV export from the Vault UI. When requesting a full notification history, you must leave start_date and end_date blank and set format_result to csv. You can request an export of notification history for all_dates once every 24 hours. | [optional]  |
| **formatResult** | **string** | To request a downloadable CSV file of your notification history, set this parameter to csv. The response contains a jobId to retrieve the job status, which provides a link to download the CSV file. If omitted, the API returns a JSON response with notification history and does not start a job. If all_dates is true, this parameter must be csv. | [optional]  |
| **limit** | **string** | Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200. | [optional]  |
| **offset** | **string** | Paginate the results displayed per page by specifying the amount of offset from the entry returned. If omitted, defaults to 0. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectworkflowactionsactionget"></a>
# **ObjectWorkflowActionsActionGet**
> void ObjectWorkflowActionsActionGet (string action, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Bulk Workflow Action Details


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **action** | **string** |  |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectworkflowactionsactionpost"></a>
# **ObjectWorkflowActionsActionPost**
> void ObjectWorkflowActionsActionPost (string action, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Initiate Workflow Actions on Multiple Workflows


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **action** | **string** |  |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectworkflowactionscanceltaskspost"></a>
# **ObjectWorkflowActionsCanceltasksPost**
> void ObjectWorkflowActionsCanceltasksPost (string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Cancel Workflow Tasks


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectworkflowactionscancelworkflowspost"></a>
# **ObjectWorkflowActionsCancelworkflowsPost**
> void ObjectWorkflowActionsCancelworkflowsPost (string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Cancel Workflows


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectworkflowactionsget"></a>
# **ObjectWorkflowActionsGet**
> void ObjectWorkflowActionsGet (string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Bulk Workflow Actions


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectworkflowactionsreassigntaskspost"></a>
# **ObjectWorkflowActionsReassigntasksPost**
> void ObjectWorkflowActionsReassigntasksPost (string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Reassign Workflow Tasks


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectworkflowactionsreplaceworkflowownerpost"></a>
# **ObjectWorkflowActionsReplaceworkflowownerPost**
> void ObjectWorkflowActionsReplaceworkflowownerPost (string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Replace Workflow Owner


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbindersactionsexportjobidresultsget"></a>
# **ObjectsBindersActionsExportJobIdResultsGet**
> void ObjectsBindersActionsExportJobIdResultsGet (string jobId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Binder Export Results


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **jobId** | **string** | The id value of the requested export job. This is returned with the export binder requests above. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbindersbinderidactionsexportpost"></a>
# **ObjectsBindersBinderIdActionsExportPost**
> void ObjectsBindersBinderIdActionsExportPost (string binderId, bool source = null, string renditiontype = null, string docversion = null, string attachments = null, string export = null, bool docfield = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Export Binder (Latest Version)


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **binderId** | **string** | The binder id field value. |  |
| **source** | **bool** | to include source content or not | [optional]  |
| **renditiontype** | **string** | to include viewable renditions | [optional]  |
| **docversion** | **string** | to include all major versions | [optional]  |
| **attachments** | **string** | to include all versions of attachments | [optional]  |
| **export** | **string** | configurable filename metadata | [optional]  |
| **docfield** | **bool** | to exclude document metadata csv | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbindersbinderidactionspost"></a>
# **ObjectsBindersBinderIdActionsPost**
> void ObjectsBindersBinderIdActionsPost (string binderId, string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Refresh Binder Auto-Filing


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **binderId** | **string** | The binder id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbindersbinderidbindingruleput"></a>
# **ObjectsBindersBinderIdBindingRulePut**
> void ObjectsBindersBinderIdBindingRulePut (string binderId, string contentType = null, string accept = null, string authorization = null, string xVaultAPIClientID = null)

Update Binding Rule


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **binderId** | **string** | The binder id field value. |  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbindersbinderiddelete"></a>
# **ObjectsBindersBinderIdDelete**
> void ObjectsBindersBinderIdDelete (string binderId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Delete Binder


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **binderId** | **string** | The binder id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbindersbinderiddocumentsnodeidbindingruleput"></a>
# **ObjectsBindersBinderIdDocumentsNodeIdBindingRulePut**
> void ObjectsBindersBinderIdDocumentsNodeIdBindingRulePut (string binderId, string nodeId, string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Update Binder Document Binding Rule


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **binderId** | **string** | The binder id field value. |  |
| **nodeId** | **string** | The binder node id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbindersbinderiddocumentspost"></a>
# **ObjectsBindersBinderIdDocumentsPost**
> void ObjectsBindersBinderIdDocumentsPost (string binderId, string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Add Document to Binder


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **binderId** | **string** | The binder id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbindersbinderiddocumentssectioniddelete"></a>
# **ObjectsBindersBinderIdDocumentsSectionIdDelete**
> void ObjectsBindersBinderIdDocumentsSectionIdDelete (string binderId, string sectionId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Remove Document from Binder


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **binderId** | **string** | The binder id field value. |  |
| **sectionId** | **string** | The binder node id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbindersbinderiddocumentssectionidput"></a>
# **ObjectsBindersBinderIdDocumentsSectionIdPut**
> void ObjectsBindersBinderIdDocumentsSectionIdPut (string binderId, string sectionId, string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Move Document in Binder


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **binderId** | **string** | The binder id field value. |  |
| **sectionId** | **string** | The binder node id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbindersbinderidget"></a>
# **ObjectsBindersBinderIdGet**
> void ObjectsBindersBinderIdGet (string binderId, string depth = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Binder


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **binderId** | **string** | The binder id field value. |  |
| **depth** | **string** | To retrieve all information in all levels of the binder, set this to all. By default, only one level is returned. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbindersbinderidpost"></a>
# **ObjectsBindersBinderIdPost**
> void ObjectsBindersBinderIdPost (string binderId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Create Binder Version


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **binderId** | **string** | The binder id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbindersbinderidput"></a>
# **ObjectsBindersBinderIdPut**
> void ObjectsBindersBinderIdPut (string binderId, string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Update Binder


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **binderId** | **string** | The binder id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbindersbinderidrolesrolenameanduserorgroupiddelete"></a>
# **ObjectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete**
> void ObjectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete (string binderId, string roleNameAndUserOrGroup, string id, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Remove Users & Groups from Roles on a Single Binder


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **binderId** | **string** | The id value of the binder from which to remove roles. |  |
| **roleNameAndUserOrGroup** | **string** | The name of the role from which to remove the user or group followed by either &#x60;user&#x60; or &#x60;group&#x60;. The format is &#x60;{role_name}.{user_or_group}&#x60;. For example, &#x60;consumer__v.user&#x60;. |  |
| **id** | **string** | The id value of the user or group to remove from the role. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbindersbinderidsectionsnodeidbindingruleput"></a>
# **ObjectsBindersBinderIdSectionsNodeIdBindingRulePut**
> void ObjectsBindersBinderIdSectionsNodeIdBindingRulePut (string binderId, string nodeId, string contentType = null, string accept = null, string authorization = null, string xVaultAPIClientID = null)

Update Binder Section Binding Rule


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **binderId** | **string** | The binder id field value. |  |
| **nodeId** | **string** | The binder node id field value. |  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbindersbinderidsectionsnodeidput"></a>
# **ObjectsBindersBinderIdSectionsNodeIdPut**
> void ObjectsBindersBinderIdSectionsNodeIdPut (string binderId, string nodeId, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Update Binder Section


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **binderId** | **string** | The binder id field value. |  |
| **nodeId** | **string** | The binder node id of the section. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbindersbinderidsectionspost"></a>
# **ObjectsBindersBinderIdSectionsPost**
> void ObjectsBindersBinderIdSectionsPost (string binderId, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Create Binder Section


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **binderId** | **string** | The binder id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbindersbinderidsectionssectioniddelete"></a>
# **ObjectsBindersBinderIdSectionsSectionIdDelete**
> void ObjectsBindersBinderIdSectionsSectionIdDelete (string binderId, string sectionId, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Delete Binder Section


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **binderId** | **string** | The binder id field value. |  |
| **sectionId** | **string** | The binder node id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbindersbinderidsectionssectionidget"></a>
# **ObjectsBindersBinderIdSectionsSectionIdGet**
> void ObjectsBindersBinderIdSectionsSectionIdGet (string binderId, string sectionId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Binder Sections


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **binderId** | **string** | The binder id field value. |  |
| **sectionId** | **string** | The binder node id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbindersbinderidversionsget"></a>
# **ObjectsBindersBinderIdVersionsGet**
> void ObjectsBindersBinderIdVersionsGet (string binderId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve All Binder Versions


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **binderId** | **string** | The binder id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbindersbinderidversionsmajorversionminorversionactionsexportpost"></a>
# **ObjectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost**
> void ObjectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost (string binderId, string majorVersion, string minorVersion, bool source = null, string renditiontype = null, string docversion = null, string attachments = null, string export = null, bool docfield = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Export Binder (Specific Version)


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **binderId** | **string** | The binder id field value. |  |
| **majorVersion** | **string** | The binder major_version_number__v field value. |  |
| **minorVersion** | **string** | The binder minor_version_number__v field value. |  |
| **source** | **bool** | to include source content or not | [optional]  |
| **renditiontype** | **string** | to include viewable renditions | [optional]  |
| **docversion** | **string** | to include all major versions | [optional]  |
| **attachments** | **string** | to include all versions of attachments | [optional]  |
| **export** | **string** | configurable filename metadata | [optional]  |
| **docfield** | **bool** | to exclude document metadata csv | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbindersbinderidversionsmajorversionminorversiondelete"></a>
# **ObjectsBindersBinderIdVersionsMajorVersionMinorVersionDelete**
> void ObjectsBindersBinderIdVersionsMajorVersionMinorVersionDelete (string binderId, string majorVersion, string minorVersion, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Delete Binder Version


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **binderId** | **string** | The binder id field value. |  |
| **majorVersion** | **string** | The binder major_version_number__v field value. |  |
| **minorVersion** | **string** | The binder minor_version_number__v field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbindersbinderidversionsmajorversionminorversionget"></a>
# **ObjectsBindersBinderIdVersionsMajorVersionMinorVersionGet**
> void ObjectsBindersBinderIdVersionsMajorVersionMinorVersionGet (string binderId, string majorVersion, string minorVersion, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Binder Version


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **binderId** | **string** | The binder id field value. |  |
| **majorVersion** | **string** | The binder major_version_number__v field value. |  |
| **minorVersion** | **string** | The binder minor_version_number__v field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbindersbinderidversionsmajorversionminorversionput"></a>
# **ObjectsBindersBinderIdVersionsMajorVersionMinorVersionPut**
> void ObjectsBindersBinderIdVersionsMajorVersionMinorVersionPut (string binderId, string majorVersion, string minorVersion, string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Update Binder Version


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **binderId** | **string** | The binder id field value. |  |
| **majorVersion** | **string** | The binder major_version_number__v field value. |  |
| **minorVersion** | **string** | The binder minor_version_number__v field value. |  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbindersbinderidversionsmajorversionminorversionrelationshipspost"></a>
# **ObjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost**
> void ObjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost (string binderId, string majorVersion, string minorVersion, string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Create Binder Relationship


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **binderId** | **string** | The binder id field value. |  |
| **majorVersion** | **string** | The binder major_version_number__v field value. |  |
| **minorVersion** | **string** | The binder minor_version_number__v field value. |  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbindersbinderidversionsmajorversionminorversionrelationshipsrelationshipiddelete"></a>
# **ObjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete**
> void ObjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete (string binderId, string majorVersion, string minorVersion, string relationshipId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Delete Binder Relationship


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **binderId** | **string** | The binder id field value. |  |
| **majorVersion** | **string** | The binder major_version_number__v field value. |  |
| **minorVersion** | **string** | The binder minor_version_number__v field value. |  |
| **relationshipId** | **string** | The binder relationship id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbindersbinderidversionsmajorversionminorversionrelationshipsrelationshipidget"></a>
# **ObjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet**
> void ObjectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet (string binderId, string majorVersion, string minorVersion, string relationshipId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Binder Relationship


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **binderId** | **string** | The binder id field value. |  |
| **majorVersion** | **string** | The binder major_version_number__v field value. |  |
| **minorVersion** | **string** | The binder minor_version_number__v field value. |  |
| **relationshipId** | **string** | The binder relationship id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbindersbinderidversionsmajorversionminorversionsectionssectionidget"></a>
# **ObjectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet**
> void ObjectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet (string binderId, string majorVersion, string minorVersion, string sectionId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Binder Version Section


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **binderId** | **string** | The binder id field value. |  |
| **majorVersion** | **string** | The binder major_version_number__v field value. |  |
| **minorVersion** | **string** | The binder minor_version_number__v field value. |  |
| **sectionId** | **string** | Retrieve all sections (documents and subsections) in a binder’s sub-level node. If not included, all sections from the binder’s top-level root node will be returned. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbindersidrolesget"></a>
# **ObjectsBindersIdRolesGet**
> void ObjectsBindersIdRolesGet (string id, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve All Binder Roles


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** |  |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbindersidrolespost"></a>
# **ObjectsBindersIdRolesPost**
> void ObjectsBindersIdRolesPost (string id, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Assign Users & Groups to Roles on a Single Binder


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** |  |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbindersidrolesrolenameget"></a>
# **ObjectsBindersIdRolesRoleNameGet**
> void ObjectsBindersIdRolesRoleNameGet (string id, string roleName, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Document Role


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** | The binder &#x60;id&#x60;. |  |
| **roleName** | **string** | The name of the role to retrieve. For example, &#x60;owner__v&#x60;. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbindersidversionsmajorversionminorversionlifecycleactionsget"></a>
# **ObjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet**
> void ObjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet (string id, string majorVersion, string minorVersion, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Binder User Actions


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** | The binder id field value from which to retrieve available user actions. |  |
| **majorVersion** | **string** | The major version number of the binder. |  |
| **minorVersion** | **string** | The minor version number of the binder. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbindersidversionsmajorversionminorversionlifecycleactionsnameventryrequirementsget"></a>
# **ObjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet**
> void ObjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet (string id, string majorVersion, string minorVersion, string nameV, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Binder Entry Criteria


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** | The binder id field value from which to retrieve available user actions. |  |
| **majorVersion** | **string** | The major version number of the binder. |  |
| **minorVersion** | **string** | The minor version number of the binder. |  |
| **nameV** | **string** | The lifecycle name__v field value from which to retrieve entry criteria. This is retrieved from the Retrieve User Actions request above. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbindersidversionsmajorversionminorversionlifecycleactionsnamevput"></a>
# **ObjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut**
> void ObjectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut (string id, string majorVersion, string minorVersion, string nameV, string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Initiate Binder User Action


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** | The binder id field value from which to retrieve available user actions. |  |
| **majorVersion** | **string** | The major version number of the binder. |  |
| **minorVersion** | **string** | The minor version number of the binder. |  |
| **nameV** | **string** | The action name__v field value to initiate. This is retrieved from the Retrieve User Action request. |  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbinderslifecycleactionspost"></a>
# **ObjectsBindersLifecycleActionsPost**
> void ObjectsBindersLifecycleActionsPost (string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Retrieve User Actions on Multiple Binders


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbinderslifecycleactionsuseractionnameput"></a>
# **ObjectsBindersLifecycleActionsUserActionNamePut**
> void ObjectsBindersLifecycleActionsUserActionNamePut (string userActionName, string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Initiate Bulk Binder User Actions


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **userActionName** | **string** | The user action name__v field value. Find this value with the Retrieve User Actions on Multiple Binders endpoint. |  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbinderspost"></a>
# **ObjectsBindersPost**
> void ObjectsBindersPost (bool async = null, string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Create Binder


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **async** | **bool** | When creating a binder, the binder metadata is indexed synchronously by default. To process the indexing asynchronously, include a query parameter async set to true (objects/binders?async&#x3D;true). This helps speed up the response time from Vault when processing large amounts of data.  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbinderstemplatesget"></a>
# **ObjectsBindersTemplatesGet**
> void ObjectsBindersTemplatesGet (string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Binder Template Collection


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbinderstemplatespost"></a>
# **ObjectsBindersTemplatesPost**
> void ObjectsBindersTemplatesPost (string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Create Binder Template


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbinderstemplatesput"></a>
# **ObjectsBindersTemplatesPut**
> void ObjectsBindersTemplatesPut (string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Update Binder Template


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbinderstemplatestemplatenamebindernodesget"></a>
# **ObjectsBindersTemplatesTemplateNameBindernodesGet**
> void ObjectsBindersTemplatesTemplateNameBindernodesGet (string templateName, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Binder Template Node Attributes


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **templateName** | **string** | The binder template name__v field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbinderstemplatestemplatenamebindernodespost"></a>
# **ObjectsBindersTemplatesTemplateNameBindernodesPost**
> void ObjectsBindersTemplatesTemplateNameBindernodesPost (string templateName, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Create Binder Template Node


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **templateName** | **string** | The binder template name__v field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbinderstemplatestemplatenamebindernodesput"></a>
# **ObjectsBindersTemplatesTemplateNameBindernodesPut**
> void ObjectsBindersTemplatesTemplateNameBindernodesPut (string templateName, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Replace Binder Template Nodes


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **templateName** | **string** | The binder template name__v field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbinderstemplatestemplatenamedelete"></a>
# **ObjectsBindersTemplatesTemplateNameDelete**
> void ObjectsBindersTemplatesTemplateNameDelete (string templateName, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Delete Binder Template


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **templateName** | **string** | The binder template name__v field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsbinderstemplatestemplatenameget"></a>
# **ObjectsBindersTemplatesTemplateNameGet**
> void ObjectsBindersTemplatesTemplateNameGet (string templateName, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Binder Template Attributes


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **templateName** | **string** | The binder template name__v field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdeletionsdocumentsget"></a>
# **ObjectsDeletionsDocumentsGet**
> void ObjectsDeletionsDocumentsGet (string startDate = null, string endDate = null, string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Deleted Document IDs


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **startDate** | **string** | Specify a date (no more than 30 days past) after which Vault will look for deleted documents. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z | [optional]  |
| **endDate** | **string** | Specify a date (no more than 30 days past) before which Vault will look for deleted documents. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdeletionsvobjectsobjectnameget"></a>
# **ObjectsDeletionsVobjectsObjectNameGet**
> void ObjectsDeletionsVobjectsObjectNameGet (string objectName, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Deleted Object Record ID


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsactionsget"></a>
# **ObjectsDocumentsActionsGet**
> void ObjectsDocumentsActionsGet (bool loc = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve All Document Workflows


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **loc** | **bool** | When localized (translated) strings are available, retrieve them by setting loc to true. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsactionslifecycleandstateandactionjobidresultsget"></a>
# **ObjectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet**
> void ObjectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet (string lifecycleAndStateAndAction, string jobId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Download Controlled Copy Job Results


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **lifecycleAndStateAndAction** | **string** | The &#x60;name__v&#x60; values for the lifecycle, state, and action in the format &#x60;{lifecycle_name}.{state_name}.{action_name}&#x60;. To get this value, [Retrieve the Job Status](https://developer.veevavault.com/api/24.3#RetrieveJobStatus) and find the &#x60;href&#x60; under the &#x60;artifacts&#x60; link. |  |
| **jobId** | **string** |  |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsactionsworkflownameget"></a>
# **ObjectsDocumentsActionsWorkflowNameGet**
> void ObjectsDocumentsActionsWorkflowNameGet (string workflowName, bool loc = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Document Workflow Details


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **workflowName** | **string** | The document workflow name value. |  |
| **loc** | **bool** | When localized (translated) strings are available, retrieve them by setting loc to true. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsactionsworkflownamepost"></a>
# **ObjectsDocumentsActionsWorkflowNamePost**
> void ObjectsDocumentsActionsWorkflowNamePost (string workflowName, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Initiate Document Workflow


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **workflowName** | **string** | The document workflow name value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsannotationsbatchdelete"></a>
# **ObjectsDocumentsAnnotationsBatchDelete**
> void ObjectsDocumentsAnnotationsBatchDelete (string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Delete Annotations


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsannotationsbatchpost"></a>
# **ObjectsDocumentsAnnotationsBatchPost**
> void ObjectsDocumentsAnnotationsBatchPost (string authorization, string contentType, string accept, string xVaultAPIClientID)

Create Multiple Annotations


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  |  |
| **contentType** | **string** |  |  |
| **accept** | **string** |  |  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. |  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsannotationsbatchput"></a>
# **ObjectsDocumentsAnnotationsBatchPut**
> void ObjectsDocumentsAnnotationsBatchPut (string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Update Annotations


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsannotationsrepliesbatchpost"></a>
# **ObjectsDocumentsAnnotationsRepliesBatchPost**
> void ObjectsDocumentsAnnotationsRepliesBatchPost (string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Add Annotation Replies


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsattachmentsbatchdelete"></a>
# **ObjectsDocumentsAttachmentsBatchDelete**
> void ObjectsDocumentsAttachmentsBatchDelete (string accept = null, string authorization = null, string contentType = null, string xVaultAPIClientID = null)

Delete Multiple Document Attachments


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **accept** | **string** |  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsattachmentsbatchpost"></a>
# **ObjectsDocumentsAttachmentsBatchPost**
> void ObjectsDocumentsAttachmentsBatchPost (string accept = null, string authorization = null, string contentType = null, string xVaultAPIClientID = null)

Create Multiple Document Attachments


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **accept** | **string** |  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsattachmentsbatchput"></a>
# **ObjectsDocumentsAttachmentsBatchPut**
> void ObjectsDocumentsAttachmentsBatchPut (string accept = null, string authorization = null, string contentType = null, string xVaultAPIClientID = null)

Update Multiple Document Attachment Descriptions


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **accept** | **string** |  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsbatchactionsfileextractjobidresultsget"></a>
# **ObjectsDocumentsBatchActionsFileextractJobIdResultsGet**
> void ObjectsDocumentsBatchActionsFileextractJobIdResultsGet (string jobId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Document Export Results


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **jobId** | **string** | The id value of the requested export job. This is returned with the export document requests. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsbatchactionsfileextractpost"></a>
# **ObjectsDocumentsBatchActionsFileextractPost**
> void ObjectsDocumentsBatchActionsFileextractPost (bool source = null, bool renditions = null, bool allversions = null, string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Export Documents


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **source** | **bool** | Optional: To exclude source files, include a query parameter source&#x3D;false. If omitted, defaults to true. | [optional]  |
| **renditions** | **bool** | Optional: To include renditions, include a query parameter renditions&#x3D;true. If omitted, defaults to false. | [optional]  |
| **allversions** | **bool** | Optional: To include all versions or latest version, include a query parameter allversions&#x3D;true. If omitted, defaults to false. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsbatchactionsreclassifyput"></a>
# **ObjectsDocumentsBatchActionsReclassifyPut**
> void ObjectsDocumentsBatchActionsReclassifyPut (string authorization = null, string contentType = null, string accept = null, bool xVaultAPIMigrationMode = null, string xVaultAPIClientID = null)

Reclassify Multiple Documents


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIMigrationMode** | **bool** | When set to true, Vault allows you to manually set the document number and to update documents to any lifecycle state using the status__v field. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message.  You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsbatchactionsrerenderpost"></a>
# **ObjectsDocumentsBatchActionsRerenderPost**
> void ObjectsDocumentsBatchActionsRerenderPost (string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Update Multiple Document Renditions


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsbatchdelete"></a>
# **ObjectsDocumentsBatchDelete**
> void ObjectsDocumentsBatchDelete (string idParam = null, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Delete Multiple Documents


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **idParam** | **string** | If you’re identifying documents in your input by their external ID | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsbatchlockdelete"></a>
# **ObjectsDocumentsBatchLockDelete**
> void ObjectsDocumentsBatchLockDelete (string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Undo Collaborative Authoring Checkout


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsbatchpost"></a>
# **ObjectsDocumentsBatchPost**
> void ObjectsDocumentsBatchPost (string authorization = null, string accept = null, string contentType = null, bool xVaultAPIMigrationMode = null, string xVaultAPIClientID = null)

Create Multiple Documents


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIMigrationMode** | **bool** | When set to true, Vault allows you to create documents in any lifecycle state using the status__v field, and to manually set the name, document number, and version number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsbatchput"></a>
# **ObjectsDocumentsBatchPut**
> void ObjectsDocumentsBatchPut (string authorization = null, string accept = null, string contentType = null, bool xVaultAPIMigrationMode = null, string xVaultAPIClientID = null)

Update Multiple Documents


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIMigrationMode** | **bool** | When set to true, Vault allows you to change the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header.Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidanchorsget"></a>
# **ObjectsDocumentsDocIdAnchorsGet**
> void ObjectsDocumentsDocIdAnchorsGet (string docId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Anchor IDs


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidannotationsfileget"></a>
# **ObjectsDocumentsDocIdAnnotationsFileGet**
> void ObjectsDocumentsDocIdAnnotationsFileGet (string docId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Export Document Annotations to PDF


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidannotationsfilepost"></a>
# **ObjectsDocumentsDocIdAnnotationsFilePost**
> void ObjectsDocumentsDocIdAnnotationsFilePost (string docId, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Import Document Annotations from PDF


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidattachmentsattachmentiddelete"></a>
# **ObjectsDocumentsDocIdAttachmentsAttachmentIdDelete**
> void ObjectsDocumentsDocIdAttachmentsAttachmentIdDelete (string docId, string attachmentId, string accept = null, string authorization = null, string xVaultAPIClientID = null)

Delete Single Document Attachment


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **attachmentId** | **string** | The attachment id field value. |  |
| **accept** | **string** |  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidattachmentsattachmentidfileget"></a>
# **ObjectsDocumentsDocIdAttachmentsAttachmentIdFileGet**
> void ObjectsDocumentsDocIdAttachmentsAttachmentIdFileGet (string docId, string attachmentId, string accept = null, string authorization = null, string xVaultAPIClientID = null)

Download Document Attachment


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **attachmentId** | **string** | The attachment id field value. |  |
| **accept** | **string** |  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidattachmentsattachmentidget"></a>
# **ObjectsDocumentsDocIdAttachmentsAttachmentIdGet**
> void ObjectsDocumentsDocIdAttachmentsAttachmentIdGet (string docId, string attachmentId, string accept = null, string authorization = null, string xVaultAPIClientID = null)

Retrieve Document Attachment Metadata


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **attachmentId** | **string** | The attachment id field value. |  |
| **accept** | **string** |  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidattachmentsattachmentidput"></a>
# **ObjectsDocumentsDocIdAttachmentsAttachmentIdPut**
> void ObjectsDocumentsDocIdAttachmentsAttachmentIdPut (string docId, string attachmentId, string accept = null, string authorization = null, string contentType = null, string xVaultAPIClientID = null)

Update Document Attachment Description


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **attachmentId** | **string** | The attachment id field value. |  |
| **accept** | **string** |  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidattachmentsattachmentidversionsattachmentversiondelete"></a>
# **ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete**
> void ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete (string docId, string attachmentId, string attachmentVersion, string accept = null, string authorization = null, string xVaultAPIClientID = null)

Delete Single Document Attachment Version


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **attachmentId** | **string** | The attachment id field value. |  |
| **attachmentVersion** | **string** | The attachment version__v field value. |  |
| **accept** | **string** |  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidattachmentsattachmentidversionsattachmentversionfileget"></a>
# **ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet**
> void ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet (string docId, string attachmentId, string attachmentVersion, string accept = null, string authorization = null, string xVaultAPIClientID = null)

Download Document Attachment Version


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **attachmentId** | **string** | The attachment id field value. |  |
| **attachmentVersion** | **string** | The attachment version__v field value. |  |
| **accept** | **string** |  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidattachmentsattachmentidversionsattachmentversionget"></a>
# **ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet**
> void ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet (string docId, string attachmentId, string attachmentVersion, string accept = null, string authorization = null, string xVaultAPIClientID = null)

Retrieve Document Attachment Version Metadata


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **attachmentId** | **string** | The attachment id field value. |  |
| **attachmentVersion** | **string** | The attachment version__v field value. |  |
| **accept** | **string** |  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidattachmentsattachmentidversionsattachmentversionpost"></a>
# **ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost**
> void ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost (string docId, string attachmentId, string attachmentVersion, bool restore = null, string accept = null, string authorization = null, string xVaultAPIClientID = null)

Restore Document Attachment Version


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **attachmentId** | **string** | The attachment id field value. |  |
| **attachmentVersion** | **string** | The attachment version__v field value. |  |
| **restore** | **bool** | The parameter restore must be set to true.  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidattachmentsattachmentidversionsget"></a>
# **ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet**
> void ObjectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet (string docId, string attachmentId, string accept = null, string authorization = null, string xVaultAPIClientID = null)

Retrieve Document Attachment Versions


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **attachmentId** | **string** | The attachment id field value. |  |
| **accept** | **string** |  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidattachmentsfileget"></a>
# **ObjectsDocumentsDocIdAttachmentsFileGet**
> void ObjectsDocumentsDocIdAttachmentsFileGet (string docId, string accept = null, string authorization = null, string xVaultAPIClientID = null)

Download All Document Attachments


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **accept** | **string** |  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidattachmentsget"></a>
# **ObjectsDocumentsDocIdAttachmentsGet**
> void ObjectsDocumentsDocIdAttachmentsGet (string docId, string accept = null, string authorization = null, string xVaultAPIClientID = null)

Retrieve Document Attachments


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **accept** | **string** |  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidattachmentspost"></a>
# **ObjectsDocumentsDocIdAttachmentsPost**
> void ObjectsDocumentsDocIdAttachmentsPost (string docId, string accept = null, string authorization = null, string contentType = null, string xVaultAPIClientID = null)

Create Document Attachment


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **accept** | **string** |  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidaudittrailget"></a>
# **ObjectsDocumentsDocIdAudittrailGet**
> void ObjectsDocumentsDocIdAudittrailGet (string docId, string startDate = null, string endDate = null, string formatResult = null, string limit = null, string offset = null, string events = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Complete Audit History for a Single Document


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document ID for which to retrieve audit history. |  |
| **startDate** | **string** | Specify a start date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to the vault’s creation date.  | [optional]  |
| **endDate** | **string** | Specify an end date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to today’s date.  | [optional]  |
| **formatResult** | **string** | To request a CSV file of your audit history, use csv.  | [optional]  |
| **limit** | **string** | Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200. | [optional]  |
| **offset** | **string** | Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0. | [optional]  |
| **events** | **string** | Provide a comma-separated list of one or more audit events to retrieve their audit history. See Vault Help for a full list of document audit events. The values passed to this parameter are case sensitive. For example, events&#x3D;WorkflowCompletion,TaskAssignment. If omitted, defaults to all audit events. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdociddelete"></a>
# **ObjectsDocumentsDocIdDelete**
> void ObjectsDocumentsDocIdDelete (string docId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Delete Single Document


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocideventsget"></a>
# **ObjectsDocumentsDocIdEventsGet**
> void ObjectsDocumentsDocIdEventsGet (string docId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Document Events


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidfileget"></a>
# **ObjectsDocumentsDocIdFileGet**
> void ObjectsDocumentsDocIdFileGet (string docId, bool lockDocument = null, string accept = null, string authorization = null, string xVaultAPIClientID = null)

Download Document File


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **lockDocument** | **bool** | Set to true to Check Out this document before retrieval. If omitted, defaults to false. | [optional]  |
| **accept** | **string** |  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidget"></a>
# **ObjectsDocumentsDocIdGet**
> void ObjectsDocumentsDocIdGet (string docId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Document


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidlockdelete"></a>
# **ObjectsDocumentsDocIdLockDelete**
> void ObjectsDocumentsDocIdLockDelete (string docId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Delete Document Lock


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidlockget"></a>
# **ObjectsDocumentsDocIdLockGet**
> void ObjectsDocumentsDocIdLockGet (string docId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Document Lock


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidlockpost"></a>
# **ObjectsDocumentsDocIdLockPost**
> void ObjectsDocumentsDocIdLockPost (string docId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Create Document Lock


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidmajorversionminorversionattachmentsfileget"></a>
# **ObjectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet**
> void ObjectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet (string docId, string majorVersion, string minorVersion, string accept = null, string authorization = null, string xVaultAPIClientID = null)

Download All Document Version Attachments


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **majorVersion** | **string** | The document major_version_number__v field value. |  |
| **minorVersion** | **string** | The document minor_version_number__v field value. |  |
| **accept** | **string** |  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidpost"></a>
# **ObjectsDocumentsDocIdPost**
> void ObjectsDocumentsDocIdPost (string docId, string suppressRendition = null, string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Create Single Document Version


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **suppressRendition** | **string** | Set to true to suppress automatic generation of the viewable rendition. If omitted, defaults to false | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidput"></a>
# **ObjectsDocumentsDocIdPut**
> void ObjectsDocumentsDocIdPut (string docId, string authorization = null, string contentType = null, string accept = null, bool xVaultAPIMigrationMode = null, string xVaultAPIClientID = null)

Update Single Document


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIMigrationMode** | **bool** | When set to true, Vault allows you to change the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidrenditionsget"></a>
# **ObjectsDocumentsDocIdRenditionsGet**
> void ObjectsDocumentsDocIdRenditionsGet (string docId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Document Renditions


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidrenditionsrenditiontypedelete"></a>
# **ObjectsDocumentsDocIdRenditionsRenditionTypeDelete**
> void ObjectsDocumentsDocIdRenditionsRenditionTypeDelete (string docId, string renditionType, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Delete Single Document Rendition


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **renditionType** | **string** | The document rendition type. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidrenditionsrenditiontypeget"></a>
# **ObjectsDocumentsDocIdRenditionsRenditionTypeGet**
> void ObjectsDocumentsDocIdRenditionsRenditionTypeGet (string docId, string renditionType, string steadyState = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Download Document Rendition File


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **renditionType** | **string** | The document rendition type. |  |
| **steadyState** | **string** | Set to true to download a rendition (file) from the latest steady state version (1.0, 2.0, etc.) of a document.  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidrenditionsrenditiontypepost"></a>
# **ObjectsDocumentsDocIdRenditionsRenditionTypePost**
> void ObjectsDocumentsDocIdRenditionsRenditionTypePost (string docId, string renditionType, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Add Single Document Rendition


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **renditionType** | **string** | The document rendition type. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidrenditionsrenditiontypeput"></a>
# **ObjectsDocumentsDocIdRenditionsRenditionTypePut**
> void ObjectsDocumentsDocIdRenditionsRenditionTypePut (string docId, string renditionType, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Replace Document Rendition


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **renditionType** | **string** | The document rendition type. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidrolesrolenameanduserorgroupiddelete"></a>
# **ObjectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete**
> void ObjectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete (string docId, string roleNameAndUserOrGroup, string id, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Remove Users & Groups from Roles on a Single Document


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The id value of the document from which to remove roles. |  |
| **roleNameAndUserOrGroup** | **string** | The name of the role from which to remove the user or group followed by either &#x60;user&#x60; or &#x60;group&#x60;. The format is &#x60;{role_name}.{user_or_group}&#x60;. For example, &#x60;consumer__v.user&#x60;. |  |
| **id** | **string** | The id value of the user or group to remove from the role. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidversionmajorversionminorversionattachmentsget"></a>
# **ObjectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet**
> void ObjectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet (string docId, string majorVersion, string minorVersion, string accept = null, string authorization = null, string xVaultAPIClientID = null)

Retrieve Document Version Attachments


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **majorVersion** | **string** | The document major_version_number__v field value. |  |
| **minorVersion** | **string** | The document minor_version_number__v field value. |  |
| **accept** | **string** |  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidversionsget"></a>
# **ObjectsDocumentsDocIdVersionsGet**
> void ObjectsDocumentsDocIdVersionsGet (string docId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Document Versions


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidversionsmajorversionminorversionannotationsannotationidget"></a>
# **ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet**
> void ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet (string docId, string majorVersion, string minorVersion, string annotationId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Read Annotations by ID


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **majorVersion** | **string** | The document major_version_number__v field value. |  |
| **minorVersion** | **string** | The document minor_version_number__v field value. |  |
| **annotationId** | **string** | The annotation ID, which can be retrieved with Read Annotations by Document Version and Type. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidversionsmajorversionminorversionannotationsannotationidrepliesget"></a>
# **ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet**
> void ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet (string docId, string majorVersion, string minorVersion, string annotationId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Read Replies of Parent Annotation


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **majorVersion** | **string** | The document major_version_number__v field value. |  |
| **minorVersion** | **string** | The document minor_version_number__v field value. |  |
| **annotationId** | **string** | The parent annotation ID, which can be retrieved with Read Annotations by Document Version and Type. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidversionsmajorversionminorversionannotationsfileget"></a>
# **ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet**
> void ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet (string docId, string majorVersion, string minorVersion, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Export Document Version Annotations to PDF


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **majorVersion** | **string** | The document major_version_number__v field value. |  |
| **minorVersion** | **string** | The document minor_version_number__v field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidversionsmajorversionminorversionannotationsfilepost"></a>
# **ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost**
> void ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost (string docId, string majorVersion, string minorVersion, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Import Document Version Annotations from PDF


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **majorVersion** | **string** | The document major_version_number__v field value. |  |
| **minorVersion** | **string** | The document minor_version_number__v field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidversionsmajorversionminorversionannotationsget"></a>
# **ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet**
> void ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet (string docId, string majorVersion, string minorVersion, string limit = null, string offset = null, string annotationTypes = null, string paginationId = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Read Annotations by Document Version and Type


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **majorVersion** | **string** | The document major_version_number__v field value. |  |
| **minorVersion** | **string** | The document minor_version_number__v field value. |  |
| **limit** | **string** | Paginate the results by specifying the maximum number of records per page in the response. This can be any value between 1 and 500. If omitted, defaults to 500. Values greater than 500 are ignored. | [optional]  |
| **offset** | **string** | This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to offset&#x3D;201. | [optional]  |
| **annotationTypes** | **string** | The type(s) of annotations to retrieve. For example, note__sys,anchor__sys. If omitted, Vault returns all annotations. Valid annotation types include: &#x60;note__sys&#x60; &#x60;line__sys&#x60; &#x60;document_link__sys&#x60; &#x60;permalink_link__sys&#x60; &#x60;anchor__sys&#x60; &#x60;reply__sys&#x60; &#x60;external_link__sys&#x60;  The following annotation types are only valid in PromoMats Vaults:  &#x60;suggested_link__sys&#x60; &#x60;approved_link__sys&#x60; &#x60;auto_link__sys&#x60; &#x60;keyword_link__sys&#x60;  | [optional]  |
| **paginationId** | **string** | A unique identifier used to load requests with paginated results. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidversionsmajorversionminorversionattachmentsattachmentidversionsattachmentversionfileget"></a>
# **ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet**
> void ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet (string docId, string majorVersion, string minorVersion, string attachmentId, string attachmentVersion, string accept = null, string authorization = null, string xVaultAPIClientID = null)

Download Document Version Attachment Version


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **majorVersion** | **string** | The document major_version_number__v field value. |  |
| **minorVersion** | **string** | The document minor_version_number__v field value. |  |
| **attachmentId** | **string** | The id field value of the attachment. |  |
| **attachmentVersion** | **string** | The version of the attachment. |  |
| **accept** | **string** |  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidversionsmajorversionminorversionattachmentsattachmentidversionsattachmentversionget"></a>
# **ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet**
> void ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet (string docId, string majorVersion, string minorVersion, string attachmentId, string attachmentVersion, string accept = null, string authorization = null, string xVaultAPIClientID = null)

Retrieve Document Version Attachment Versions


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **majorVersion** | **string** | The document major_version_number__v field value. |  |
| **minorVersion** | **string** | The document minor_version_number__v field value. |  |
| **attachmentId** | **string** | The id of the document attachment to retrieve. |  |
| **attachmentVersion** | **string** | Optional: The version of the attachment to retrieve. If omitted, the endpoint retrieves all versions of the specified attachment. |  |
| **accept** | **string** |  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidversionsmajorversionminorversiondelete"></a>
# **ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete**
> void ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete (string docId, string majorVersion, string minorVersion, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Delete Single Document Version


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **majorVersion** | **string** | The document major_version_number__v field value. |  |
| **minorVersion** | **string** | The document minor_version_number__v field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidversionsmajorversionminorversiondocexportannotationstocsvget"></a>
# **ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet**
> void ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet (string docId, string majorVersion, string minorVersion, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Document Version Notes as CSV


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **majorVersion** | **string** | The document major_version_number__v field value. |  |
| **minorVersion** | **string** | The document minor_version_number__v field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidversionsmajorversionminorversioneventspost"></a>
# **ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost**
> void ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost (string docId, string majorVersion, string minorVersion, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Create Document Event


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **majorVersion** | **string** | The document major_version_number__v field value. |  |
| **minorVersion** | **string** | The document minor_version_number__v field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidversionsmajorversionminorversionexportvideoannotationsget"></a>
# **ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet**
> void ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet (string docId, string majorVersion, string minorVersion, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Video Annotations


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The video document id field value. |  |
| **majorVersion** | **string** | The video document major_version_number__v field value. |  |
| **minorVersion** | **string** | The video document minor_version_number__v field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** | This &#x60;Accept&#x60; header only changes the format of the response in the case of an error. On &#x60;SUCCESS&#x60;, the HTTP Response Header &#x60;Content-Type&#x60; is set to &#x60;text/plain;charset&#x3D;UnicodeLittle&#x60;. | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidversionsmajorversionminorversionfileget"></a>
# **ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet**
> void ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet (string docId, string majorVersion, string minorVersion, string accept = null, string authorization = null, string xVaultAPIClientID = null)

Download Document Version File


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **majorVersion** | **string** | The document major_version_number__v field value. |  |
| **minorVersion** | **string** | The document minor_version_number__v field value. |  |
| **accept** | **string** |  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidversionsmajorversionminorversionget"></a>
# **ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionGet**
> void ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionGet (string docId, string majorVersion, string minorVersion, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Document Version


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **majorVersion** | **string** | The document major_version_number__v field value. |  |
| **minorVersion** | **string** | The document minor_version_number__v field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidversionsmajorversionminorversionput"></a>
# **ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionPut**
> void ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionPut (string docId, string majorVersion, string minorVersion, string authorization = null, string contentType = null, string accept = null, bool xVaultAPIMigrationMode = null, string xVaultAPIClientID = null)

Update Document Version


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **majorVersion** | **string** | The document major_version_number__v field value. |  |
| **minorVersion** | **string** | The document minor_version_number__v field value. |  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIMigrationMode** | **bool** | When set to true, Vault allows you to manually set the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidversionsmajorversionminorversionrelationshipsget"></a>
# **ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet**
> void ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet (string docId, string majorVersion, string minorVersion, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Document Relationships


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **majorVersion** | **string** | The document major_version_number__v field value. |  |
| **minorVersion** | **string** | The document minor_version_number__v field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidversionsmajorversionminorversionrelationshipspost"></a>
# **ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost**
> void ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost (string docId, string majorVersion, string minorVersion, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Create Single Document Relationship


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **majorVersion** | **string** | The document major_version_number__v field value. |  |
| **minorVersion** | **string** | The document minor_version_number__v field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidversionsmajorversionminorversionrelationshipsrelationshipiddelete"></a>
# **ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete**
> void ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete (string docId, string majorVersion, string minorVersion, string relationshipId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Delete Single Document Relationship


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **majorVersion** | **string** | The document major_version_number__v field value. |  |
| **minorVersion** | **string** | The document minor_version_number__v field value. |  |
| **relationshipId** | **string** | The relationship id field value. See Retrieve Document Relationships. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidversionsmajorversionminorversionrelationshipsrelationshipidget"></a>
# **ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet**
> void ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet (string docId, string majorVersion, string minorVersion, string relationshipId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Document Relationship


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **majorVersion** | **string** | The document major_version_number__v field value. |  |
| **minorVersion** | **string** | The document minor_version_number__v field value. |  |
| **relationshipId** | **string** | The relationship id field value. See Retrieve Document Relationships. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidversionsmajorversionminorversionrenditionsget"></a>
# **ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet**
> void ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet (string docId, string majorVersion, string minorVersion, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Document Version Renditions


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **majorVersion** | **string** | The document major_version_number__v field value. |  |
| **minorVersion** | **string** | The document minor_version_number__v field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidversionsmajorversionminorversionrenditionsrenditiontypedelete"></a>
# **ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete**
> void ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete (string docId, string majorVersion, string minorVersion, string renditionType, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Delete Document Version Rendition


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **majorVersion** | **string** | The document major_version_number__v field value. |  |
| **minorVersion** | **string** | The document minor_version_number__v field value. |  |
| **renditionType** | **string** | The document rendition type. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidversionsmajorversionminorversionrenditionsrenditiontypeget"></a>
# **ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet**
> void ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet (string docId, string majorVersion, string minorVersion, string renditionType, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Download Document Version Rendition File


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **majorVersion** | **string** | The document major_version_number__v field value. |  |
| **minorVersion** | **string** | The document minor_version_number__v field value. |  |
| **renditionType** | **string** | The document rendition type. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidversionsmajorversionminorversionrenditionsrenditiontypepost"></a>
# **ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost**
> void ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost (string docId, string majorVersion, string minorVersion, string renditionType, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Upload Document Version Rendition


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **majorVersion** | **string** | The document major_version_number__v field value. |  |
| **minorVersion** | **string** | The document minor_version_number__v field value. |  |
| **renditionType** | **string** | The document rendition type. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidversionsmajorversionminorversionrenditionsrenditiontypeput"></a>
# **ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut**
> void ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut (string docId, string majorVersion, string minorVersion, string renditionType, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Replace Document Version Rendition


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **majorVersion** | **string** | The document major_version_number__v field value. |  |
| **minorVersion** | **string** | The document minor_version_number__v field value. |  |
| **renditionType** | **string** | The document rendition type. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsdocidversionsmajorversionminorversionthumbnailget"></a>
# **ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet**
> void ObjectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet (string docId, string majorVersion, string minorVersion, string accept = null, string authorization = null, string xVaultAPIClientID = null)

Download Document Version Thumbnail File


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **docId** | **string** | The document id field value. |  |
| **majorVersion** | **string** | The document major_version_number__v field value. |  |
| **minorVersion** | **string** | The document minor_version_number__v field value. |  |
| **accept** | **string** |  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsget"></a>
# **ObjectsDocumentsGet**
> void ObjectsDocumentsGet (string namedFilter = null, string scope = null, string versionscope = null, string search = null, string limit = null, string sort = null, string start = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve All Documents


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **namedFilter** | **string** | Retrieves only documents which you have created. | [optional]  |
| **scope** | **string** | Searches only within the document content. | [optional]  |
| **versionscope** | **string** | Retrieves all document versions, rather than only the latest version. | [optional]  |
| **search** | **string** | Search for documents based on a {keyword} in searchable document fields. | [optional]  |
| **limit** | **string** | See VQL documentation for more information. | [optional]  |
| **sort** | **string** | See VQL documentation for more information. | [optional]  |
| **start** | **string** | See VQL documentation for more information. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsidrolesget"></a>
# **ObjectsDocumentsIdRolesGet**
> void ObjectsDocumentsIdRolesGet (string id, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve All Document Roles


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** |  |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsidrolespost"></a>
# **ObjectsDocumentsIdRolesPost**
> void ObjectsDocumentsIdRolesPost (string id, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Assign Users & Groups to Roles on a Single Document


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** |  |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsidrolesrolenameget"></a>
# **ObjectsDocumentsIdRolesRoleNameGet**
> void ObjectsDocumentsIdRolesRoleNameGet (string id, string roleName, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Document Role


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** | The document &#x60;id&#x60;. |  |
| **roleName** | **string** | The name of the role to retrieve. For example, &#x60;owner__v&#x60;. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsidversionsmajorversionminorversionlifecycleactionsget"></a>
# **ObjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet**
> void ObjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet (string id, string majorVersion, string minorVersion, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Document User Actions


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** | The document id field value from which to retrieve available user actions. |  |
| **majorVersion** | **string** | The major version number of the document. |  |
| **minorVersion** | **string** | The minor version number of the document. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsidversionsmajorversionminorversionlifecycleactionsnameventryrequirementsget"></a>
# **ObjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet**
> void ObjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet (string id, string majorVersion, string minorVersion, string nameV, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Document Entry Criteria


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** | The document id field value from which to retrieve available user actions. |  |
| **majorVersion** | **string** | The major version number of the document. |  |
| **minorVersion** | **string** | The minor version number of the document. |  |
| **nameV** | **string** | The lifecycle name__v field value from which to retrieve entry criteria. This is retrieved from the Retrieve User Actions request above. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsidversionsmajorversionminorversionlifecycleactionsnamevput"></a>
# **ObjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut**
> void ObjectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut (string id, string majorVersion, string minorVersion, string nameV, string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Initiate Document User Action


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** | The document id field value from which to retrieve available user actions. |  |
| **majorVersion** | **string** | The major version number of the document. |  |
| **minorVersion** | **string** | The minor version number of the document. |  |
| **nameV** | **string** | The action name__v field value to initiate. This is retrieved from the Retrieve User Action request. |  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentslifecycleactionspost"></a>
# **ObjectsDocumentsLifecycleActionsPost**
> void ObjectsDocumentsLifecycleActionsPost (string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Retrieve User Actions on Multiple Documents


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentslifecycleactionsuseractionnameput"></a>
# **ObjectsDocumentsLifecycleActionsUserActionNamePut**
> void ObjectsDocumentsLifecycleActionsUserActionNamePut (string userActionName, string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Initiate Bulk Document User Actions


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **userActionName** | **string** | The user action name__v field value. Find this value with the Retrieve User Actions on Multiple Documents endpoint. |  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentspost"></a>
# **ObjectsDocumentsPost**
> void ObjectsDocumentsPost (string authorization = null, string accept = null, bool xVaultAPIMigrationMode = null, string xVaultAPIClientID = null)

Create Single Document


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIMigrationMode** | **bool** | When set to true,  you can use the status__v field to create documents in any lifecycle state. Additionally, you can manually set the name, document number, and version number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsrelationshipsbatchdelete"></a>
# **ObjectsDocumentsRelationshipsBatchDelete**
> void ObjectsDocumentsRelationshipsBatchDelete (string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Delete Multiple Document Relationships


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsrelationshipsbatchpost"></a>
# **ObjectsDocumentsRelationshipsBatchPost**
> void ObjectsDocumentsRelationshipsBatchPost (string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Create Multiple Document Relationships


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsrenditionsbatchdelete"></a>
# **ObjectsDocumentsRenditionsBatchDelete**
> void ObjectsDocumentsRenditionsBatchDelete (string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Delete Multiple Document Renditions


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsrenditionsbatchpost"></a>
# **ObjectsDocumentsRenditionsBatchPost**
> void ObjectsDocumentsRenditionsBatchPost (string idParam = null, string largeSizeAsset = null, string authorization = null, string accept = null, string contentType = null, bool xVaultAPIMigrationMode = null, string xVaultAPIClientID = null)

Add Multiple Document Renditions


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **idParam** | **string** | If you’re identifying documents in your input by their external ID | [optional]  |
| **largeSizeAsset** | **string** | If set to true, indicates that the renditions to add are of the Large Size Asset (large_size_asset__v) rendition type. Vault applies Document Migration Mode limitations to renditions created with the request, but Document Migration permission is not required and your vault need not be in Migration Mode to use the parameter. Note that the request results in an error if the CSV contains any rendition type other than large_size_asset__v. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIMigrationMode** | **bool** | Must be set to true when importing any rendition type other than large_size_asset__v. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsrolesbatchdelete"></a>
# **ObjectsDocumentsRolesBatchDelete**
> void ObjectsDocumentsRolesBatchDelete (string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Remove Users and Groups from Roles on Multiple Documents & Binders


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsrolesbatchpost"></a>
# **ObjectsDocumentsRolesBatchPost**
> void ObjectsDocumentsRolesBatchPost (string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Assign Users & Groups to Roles on Multiple Documents & Binders


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentstemplatesget"></a>
# **ObjectsDocumentsTemplatesGet**
> void ObjectsDocumentsTemplatesGet (string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Document Template Collection


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentstemplatespost"></a>
# **ObjectsDocumentsTemplatesPost**
> void ObjectsDocumentsTemplatesPost (string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Create Single Document Template


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentstemplatesput"></a>
# **ObjectsDocumentsTemplatesPut**
> void ObjectsDocumentsTemplatesPut (string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Update Multiple Document Templates


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentstemplatestemplatenamedelete"></a>
# **ObjectsDocumentsTemplatesTemplateNameDelete**
> void ObjectsDocumentsTemplatesTemplateNameDelete (string templateName, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Delete Basic Document Template


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **templateName** | **string** | The document template name__v field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentstemplatestemplatenamefileget"></a>
# **ObjectsDocumentsTemplatesTemplateNameFileGet**
> void ObjectsDocumentsTemplatesTemplateNameFileGet (string templateName, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Download Document Template File


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **templateName** | **string** | The document template name__v field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentstemplatestemplatenameget"></a>
# **ObjectsDocumentsTemplatesTemplateNameGet**
> void ObjectsDocumentsTemplatesTemplateNameGet (string templateName, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Document Template Attributes


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **templateName** | **string** | The document template name__v field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentstemplatestemplatenameput"></a>
# **ObjectsDocumentsTemplatesTemplateNamePut**
> void ObjectsDocumentsTemplatesTemplateNamePut (string templateName, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Update Single Document Template


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **templateName** | **string** | The document template name__v field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentstokenspost"></a>
# **ObjectsDocumentsTokensPost**
> void ObjectsDocumentsTokensPost (string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Document Tokens


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsversionsbatchactionsfileextractpost"></a>
# **ObjectsDocumentsVersionsBatchActionsFileextractPost**
> void ObjectsDocumentsVersionsBatchActionsFileextractPost (bool source = null, bool renditions = null, string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Export Document Versions


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **source** | **bool** | Optional: To exclude source files, include a query parameter source&#x3D;false. If omitted, defaults to true. | [optional]  |
| **renditions** | **bool** | Optional: To include renditions, include a query parameter renditions&#x3D;true. If omitted, defaults to false. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsversionsbatchdelete"></a>
# **ObjectsDocumentsVersionsBatchDelete**
> void ObjectsDocumentsVersionsBatchDelete (string idParam = null, string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Delete Multiple Document Versions


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **idParam** | **string** | If you’re identifying documents in your input by their external ID | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdocumentsversionsbatchpost"></a>
# **ObjectsDocumentsVersionsBatchPost**
> void ObjectsDocumentsVersionsBatchPost (string idParam = null, string authorization = null, string accept = null, string contentType = null, string xVaultAPIMigrationMode = null, string xVaultAPIClientID = null)

Create Multiple Document Versions


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **idParam** | **string** | If you’re identifying documents in your input by their external ID | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIMigrationMode** | **string** | Must be set to true. Vault allows you to manually set the name and version number and to create documents in any lifecycle state using the &#x60;status__v&#x60; field, but does not allow you to change the document number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt; | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdomainget"></a>
# **ObjectsDomainGet**
> void ObjectsDomainGet (bool includeApplication = null, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Retrieve Domain Information


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **includeApplication** | **bool** | To include Vault application type information in the response, set include_application to true. If omitted, defaults to false and application information is not included. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsdomainsget"></a>
# **ObjectsDomainsGet**
> void ObjectsDomainsGet (string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Retrieve Domains


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsedlmatcheddocumentsbatchactionsaddpost"></a>
# **ObjectsEdlMatchedDocumentsBatchActionsAddPost**
> void ObjectsEdlMatchedDocumentsBatchActionsAddPost (string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Add EDL Matched Documents


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsedlmatcheddocumentsbatchactionsremovepost"></a>
# **ObjectsEdlMatchedDocumentsBatchActionsRemovePost**
> void ObjectsEdlMatchedDocumentsBatchActionsRemovePost (string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Remove EDL Matched Documents


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsgroupsautoget"></a>
# **ObjectsGroupsAutoGet**
> void ObjectsGroupsAutoGet (string limit = null, string offset = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Auto Managed Groups


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **limit** | **string** | Paginate the results by specifying the maximum number of records per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 1000.  | [optional]  |
| **offset** | **string** | Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsgroupsget"></a>
# **ObjectsGroupsGet**
> void ObjectsGroupsGet (string includeImplied = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve All Groups


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **includeImplied** | **string** | When true, the response includes the implied_members__v field. These users are automatically added to the group when their security_profiles__v are added to the group. If omitted, the response includes only the members__v field. These users are individually added to a group by an Admin. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsgroupsgroupiddelete"></a>
# **ObjectsGroupsGroupIdDelete**
> void ObjectsGroupsGroupIdDelete (string groupId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Delete Group


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **groupId** | **string** | The group id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsgroupsgroupidget"></a>
# **ObjectsGroupsGroupIdGet**
> void ObjectsGroupsGroupIdGet (string groupId, bool includeImplied = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Group


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **groupId** | **string** | The group id field value. |  |
| **includeImplied** | **bool** | When true, the response includes the implied_members__v field. These users are automatically added to the group when their security_profiles__v are added to the group. When not used, the response includes only the members__v field. These users are individually added to a group by Admin. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsgroupsgroupidput"></a>
# **ObjectsGroupsGroupIdPut**
> void ObjectsGroupsGroupIdPut (string groupId, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Update Group


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **groupId** | **string** | The group id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsgroupspost"></a>
# **ObjectsGroupsPost**
> void ObjectsGroupsPost (string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Create Group 


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectslicensesget"></a>
# **ObjectsLicensesGet**
> void ObjectsLicensesGet (string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Application License Usage


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsobjectworkflowsactionsget"></a>
# **ObjectsObjectworkflowsActionsGet**
> void ObjectsObjectworkflowsActionsGet (string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve All Multi-Record Workflows


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsobjectworkflowsactionsworkflownameget"></a>
# **ObjectsObjectworkflowsActionsWorkflowNameGet**
> void ObjectsObjectworkflowsActionsWorkflowNameGet (string workflowName, string authorization = null, string xVaultAPIClientID = null)

Retrieve Multi-Record Workflow Details


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **workflowName** | **string** |  |  |
| **authorization** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsobjectworkflowsactionsworkflownamepost"></a>
# **ObjectsObjectworkflowsActionsWorkflowNamePost**
> void ObjectsObjectworkflowsActionsWorkflowNamePost (string workflowName, string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Initiate Multi-Record Workflow


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **workflowName** | **string** |  |  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsobjectworkflowsget"></a>
# **ObjectsObjectworkflowsGet**
> void ObjectsObjectworkflowsGet (string objectV = null, string recordIdV = null, string participant = null, string statusV = null, string offset = null, string pageSize = null, string loc = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Workflows


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectV** | **string** | To retrieve all workflows configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the participant parameter is not used.  | [optional]  |
| **recordIdV** | **string** | To retrieve all workflows configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the participant parameter is not used.  | [optional]  |
| **participant** | **string** | To retrieve all workflows available to a particular user, include the user id field value as ?participant&#x3D;{id}. To retrieve your own workflows, set this value to ?participant&#x3D;me. This parameter is required when the object__v and record_id__v parameters are not used.  | [optional]  |
| **statusV** | **string** | To retrieve all workflows with specific statuses, include one or more status name__v field values. For example: status__v&#x3D;active__v, status__v&#x3D;active__v,completed__v. Workflows with &#x60;status__v&#x3D;active__v&#x60; are in progress for the indicated object record. Valid statuses include: active__v completed__v cancelled__v | [optional]  |
| **offset** | **string** | This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to ?offset&#x3D;201.  | [optional]  |
| **pageSize** | **string** | This parameter is used to paginate the results. It specifies the size number of records to display per page. Vault returns 200 records per page by default. You can set this value lower or as high as 1000 records per page. For example: ?page_size&#x3D;1000.  | [optional]  |
| **loc** | **string** | When localized (translated) strings are available, retrieve them by including ?loc&#x3D;true.  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsobjectworkflowstasksget"></a>
# **ObjectsObjectworkflowsTasksGet**
> void ObjectsObjectworkflowsTasksGet (string objectV = null, string recordIdV = null, string assigneeV = null, string statusV = null, string offset = null, string pageSize = null, string loc = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Workflow Tasks


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectV** | **string** | To retrieve all workflow tasks configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the assignee__v parameter is not used. | [optional]  |
| **recordIdV** | **string** | To retrieve all workflow tasks configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the assignee__v parameter is not used. | [optional]  |
| **assigneeV** | **string** | To retrieve all workflow tasks available to a particular user, include the user id field value as ?assignee__v&#x3D;{id}. To retrieve your own workflow tasks, set this value to ?assignee__v&#x3D;me. This parameter is required when the object__v and record_id__v parameters are not used.  | [optional]  |
| **statusV** | **string** | To retrieve all workflow tasks with specific statuses, include one or more status name__v field values. For example: ?status__v&#x3D;available__v or ?status__v&#x3D;available__v,completed__v.  | [optional]  |
| **offset** | **string** | This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to ?offset&#x3D;201.  | [optional]  |
| **pageSize** | **string** | This parameter is used to paginate the results. It specifies the size number of records to display per page. Vault returns 200 records per page by default. You can set this value lower or as high as 1000 records per page. For example: ?page_size&#x3D;1000.  | [optional]  |
| **loc** | **string** | When localized (translated) strings are available, retrieve them by including ?loc&#x3D;true.  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsobjectworkflowstaskstaskidactionsacceptpost"></a>
# **ObjectsObjectworkflowsTasksTaskIdActionsAcceptPost**
> void ObjectsObjectworkflowsTasksTaskIdActionsAcceptPost (string taskId, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Accept Single Record Workflow Task


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **taskId** | **string** | The task id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsobjectworkflowstaskstaskidactionscancelpost"></a>
# **ObjectsObjectworkflowsTasksTaskIdActionsCancelPost**
> void ObjectsObjectworkflowsTasksTaskIdActionsCancelPost (string taskId, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Cancel Workflow Task


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **taskId** | **string** | The task id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsobjectworkflowstaskstaskidactionscompletepost"></a>
# **ObjectsObjectworkflowsTasksTaskIdActionsCompletePost**
> void ObjectsObjectworkflowsTasksTaskIdActionsCompletePost (string taskId, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Complete Single Record Workflow Task


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **taskId** | **string** | The task id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsobjectworkflowstaskstaskidactionsget"></a>
# **ObjectsObjectworkflowsTasksTaskIdActionsGet**
> void ObjectsObjectworkflowsTasksTaskIdActionsGet (string taskId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Workflow Task Actions


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **taskId** | **string** | The task id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsobjectworkflowstaskstaskidactionsmdwacceptpost"></a>
# **ObjectsObjectworkflowsTasksTaskIdActionsMdwacceptPost**
> void ObjectsObjectworkflowsTasksTaskIdActionsMdwacceptPost (string taskId, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Accept Multi-item Workflow Task


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **taskId** | **string** | The task id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsobjectworkflowstaskstaskidactionsmdwcompletepost"></a>
# **ObjectsObjectworkflowsTasksTaskIdActionsMdwcompletePost**
> void ObjectsObjectworkflowsTasksTaskIdActionsMdwcompletePost (string taskId, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Complete Multi-item Workflow Task


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **taskId** | **string** | The task id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsobjectworkflowstaskstaskidactionsmdwmanagecontentpost"></a>
# **ObjectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost**
> void ObjectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost (string taskId, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Manage Multi-Item Workflow Content


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **taskId** | **string** | The task id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsobjectworkflowstaskstaskidactionsmdwreassignpost"></a>
# **ObjectsObjectworkflowsTasksTaskIdActionsMdwreassignPost**
> void ObjectsObjectworkflowsTasksTaskIdActionsMdwreassignPost (string taskId, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Reassign Multi-item Workflow Task


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **taskId** | **string** | The id of the task to reassign. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsobjectworkflowstaskstaskidactionsreassignpost"></a>
# **ObjectsObjectworkflowsTasksTaskIdActionsReassignPost**
> void ObjectsObjectworkflowsTasksTaskIdActionsReassignPost (string taskId, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Reassign Single Record Workflow Task


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **taskId** | **string** | The id of the task to reassign. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsobjectworkflowstaskstaskidactionstaskactionget"></a>
# **ObjectsObjectworkflowsTasksTaskIdActionsTaskActionGet**
> void ObjectsObjectworkflowsTasksTaskIdActionsTaskActionGet (string taskId, string taskAction, string loc = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Workflow Task Action Details


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **taskId** | **string** | The task id field value. |  |
| **taskAction** | **string** | The name of the task action retrieved from Retrieve Workflow Task Actions. |  |
| **loc** | **string** | When localized (translated) strings are available, retrieve them by including loc&#x3D;true.  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsobjectworkflowstaskstaskidactionsundoacceptpost"></a>
# **ObjectsObjectworkflowsTasksTaskIdActionsUndoacceptPost**
> void ObjectsObjectworkflowsTasksTaskIdActionsUndoacceptPost (string taskId, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Undo Workflow Task Acceptance


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **taskId** | **string** | The task id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsobjectworkflowstaskstaskidactionsupdateduedatepost"></a>
# **ObjectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost**
> void ObjectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost (string taskId, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Update Workflow Task Due Date


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **taskId** | **string** | The id of the task. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsobjectworkflowstaskstaskidget"></a>
# **ObjectsObjectworkflowsTasksTaskIdGet**
> void ObjectsObjectworkflowsTasksTaskIdGet (string taskId, bool loc = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Workflow Task Details


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **taskId** | **string** | The task id field value. |  |
| **loc** | **bool** | When localized (translated) strings are available, retrieve them by including loc&#x3D;true. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsobjectworkflowsworkflowidactionsget"></a>
# **ObjectsObjectworkflowsWorkflowIdActionsGet**
> void ObjectsObjectworkflowsWorkflowIdActionsGet (string workflowId, string loc = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Workflow Actions


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **workflowId** | **string** | The workflow id field value. |  |
| **loc** | **string** | When localized (translated) strings are available, retrieve them by including loc&#x3D;true.  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsobjectworkflowsworkflowidactionsworkflowactionget"></a>
# **ObjectsObjectworkflowsWorkflowIdActionsWorkflowActionGet**
> void ObjectsObjectworkflowsWorkflowIdActionsWorkflowActionGet (string workflowId, string workflowAction, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Workflow Action Details


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **workflowId** | **string** | The workflow id field value. |  |
| **workflowAction** | **string** | The workflow action name retrieved from Retrieve Workflow Actions. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsobjectworkflowsworkflowidactionsworkflowactionpost"></a>
# **ObjectsObjectworkflowsWorkflowIdActionsWorkflowActionPost**
> void ObjectsObjectworkflowsWorkflowIdActionsWorkflowActionPost (string workflowId, string workflowAction, string documentsSys = null, string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Initiate Workflow Action


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **workflowId** | **string** | The workflow id field value. |  |
| **workflowAction** | **string** | The workflow action name retrieved from Retrieve Workflow Actions. |  |
| **documentsSys** | **string** | Include the id or ids as a comma-separated list of the document(s) to be removed from a document workflow when using the removecontent action. If your workflow_action is remove_content, include the id of the document to remove the workflow. To remove multiple documents, use a comma-separated list of ids. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsobjectworkflowsworkflowidget"></a>
# **ObjectsObjectworkflowsWorkflowIdGet**
> void ObjectsObjectworkflowsWorkflowIdGet (string workflowId, bool loc = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Workflow Details


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **workflowId** | **string** | The workflow id field value. |  |
| **loc** | **bool** | When localized (translated) strings are available, retrieve them by including loc&#x3D;true. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectspicklistsget"></a>
# **ObjectsPicklistsGet**
> void ObjectsPicklistsGet (string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve All Picklists


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectspicklistspicklistnameget"></a>
# **ObjectsPicklistsPicklistNameGet**
> void ObjectsPicklistsPicklistNameGet (string picklistName, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Picklist Values


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **picklistName** | **string** | The picklist name field value (license_type__v, product_family__c, region__c, etc.) |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectspicklistspicklistnamepicklistvaluenamedelete"></a>
# **ObjectsPicklistsPicklistNamePicklistValueNameDelete**
> void ObjectsPicklistsPicklistNamePicklistValueNameDelete (string picklistName, string picklistValueName, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Inactivate Picklist Value


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **picklistName** | **string** | The picklist name field value (license_type__v, product_family__c, region__c, etc.) |  |
| **picklistValueName** | **string** | The picklist value name field value (north_america__c, south_america__c, etc.) |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectspicklistspicklistnamepicklistvaluenameput"></a>
# **ObjectsPicklistsPicklistNamePicklistValueNamePut**
> void ObjectsPicklistsPicklistNamePicklistValueNamePut (string picklistName, string picklistValueName, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Update Picklist Value


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **picklistName** | **string** | The picklist name field value (license_type__v, product_family__c, region__c, etc.) |  |
| **picklistValueName** | **string** | The picklist value name field value (north_america__c, south_america__c, etc.) |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectspicklistspicklistnamepost"></a>
# **ObjectsPicklistsPicklistNamePost**
> void ObjectsPicklistsPicklistNamePost (string picklistName, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Create Picklist Values


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **picklistName** | **string** | The picklist name field value (license_type__v, product_family__c, region__c, etc.) |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectspicklistspicklistnameput"></a>
# **ObjectsPicklistsPicklistNamePut**
> void ObjectsPicklistsPicklistNamePut (string picklistName, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Update Picklist Value Label


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **picklistName** | **string** | The picklist name field value (license_type__v, product_family__c, region__c, etc.) |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectssandboxactionsbuildproductionpost"></a>
# **ObjectsSandboxActionsBuildproductionPost**
> void ObjectsSandboxActionsBuildproductionPost (string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Build Production Vault


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectssandboxactionspromoteproductionpost"></a>
# **ObjectsSandboxActionsPromoteproductionPost**
> void ObjectsSandboxActionsPromoteproductionPost (string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Promote to Production


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectssandboxactionsrecheckusagepost"></a>
# **ObjectsSandboxActionsRecheckusagePost**
> void ObjectsSandboxActionsRecheckusagePost (string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Recheck Sandbox Usage Limit


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectssandboxbatchchangesizepost"></a>
# **ObjectsSandboxBatchChangesizePost**
> void ObjectsSandboxBatchChangesizePost (string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Change Sandbox Size


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectssandboxentitlementssetpost"></a>
# **ObjectsSandboxEntitlementsSetPost**
> void ObjectsSandboxEntitlementsSetPost (string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Set Sandbox Entitlements


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectssandboxget"></a>
# **ObjectsSandboxGet**
> void ObjectsSandboxGet (string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Sandboxes


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectssandboxnamedelete"></a>
# **ObjectsSandboxNameDelete**
> void ObjectsSandboxNameDelete (string name, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Delete Sandbox


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **name** | **string** | The name of the sandbox vault to delete. This is the name which appears on the My Vaults page. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectssandboxpost"></a>
# **ObjectsSandboxPost**
> void ObjectsSandboxPost (string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Create or Refresh Sandbox


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectssandboxsnapshotapinameactionsupdatepost"></a>
# **ObjectsSandboxSnapshotApiNameActionsUpdatePost**
> void ObjectsSandboxSnapshotApiNameActionsUpdatePost (string apiName, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Update Sandbox Snapshot


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **apiName** | **string** | The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectssandboxsnapshotapinameactionsupgradepost"></a>
# **ObjectsSandboxSnapshotApiNameActionsUpgradePost**
> void ObjectsSandboxSnapshotApiNameActionsUpgradePost (string apiName, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Upgrade Sandbox Snapshot


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **apiName** | **string** | The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectssandboxsnapshotapinamedelete"></a>
# **ObjectsSandboxSnapshotApiNameDelete**
> void ObjectsSandboxSnapshotApiNameDelete (string apiName, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Delete Sandbox Snapshot


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **apiName** | **string** | The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectssandboxsnapshotget"></a>
# **ObjectsSandboxSnapshotGet**
> void ObjectsSandboxSnapshotGet (string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Sandbox Snapshots


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectssandboxsnapshotpost"></a>
# **ObjectsSandboxSnapshotPost**
> void ObjectsSandboxSnapshotPost (string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Create Sandbox Snapshot


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectssandboxvaultidactionsrefreshpost"></a>
# **ObjectsSandboxVaultIdActionsRefreshPost**
> void ObjectsSandboxVaultIdActionsRefreshPost (string vaultId, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Refresh Sandbox from Snapshot


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **vaultId** | **string** | The Vault ID of the sandbox to be refreshed. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectssandboxvaultidget"></a>
# **ObjectsSandboxVaultIdGet**
> void ObjectsSandboxVaultIdGet (string vaultId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Sandbox Details by ID


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **vaultId** | **string** |  |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectssecuritypoliciesget"></a>
# **ObjectsSecuritypoliciesGet**
> void ObjectsSecuritypoliciesGet (string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve All Security Policies


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectssecuritypoliciessecuritypolicynameget"></a>
# **ObjectsSecuritypoliciesSecurityPolicyNameGet**
> void ObjectsSecuritypoliciesSecurityPolicyNameGet (string securityPolicyName, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Security Policy


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **securityPolicyName** | **string** | Security policy name__v field value (retrieved from previous request). This is typically a numeric value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsusersget"></a>
# **ObjectsUsersGet**
> void ObjectsUsersGet (string vaults = null, string excludeVaultMembership = null, string excludeAppLicensing = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve All Users


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **vaults** | **string** | Retrieve all users assigned to all Vaults in your domain. | [optional]  |
| **excludeVaultMembership** | **string** | Optional: Set to false to include vault_membership fields. If true or omitted, vault_membership fields are not included in the response. | [optional]  |
| **excludeAppLicensing** | **string** | Optional: Set to false to include app_licensing fields. If true or omitted, app_licensing fields are not included in the response. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsusersidget"></a>
# **ObjectsUsersIdGet**
> void ObjectsUsersIdGet (string id, string excludeVaultMembership = null, string excludeAppLicensing = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve User


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** | The user id field value. Use the value me to get information for the currently authenticated user. |  |
| **excludeVaultMembership** | **string** | Optional: Set to true to omit vault_membership fields. If you don’t need these fields, this may increase performance. If omitted, vault_membership fields are included in the response. | [optional]  |
| **excludeAppLicensing** | **string** | Optional: Set to true to omit app_licensing fields. If you don’t need these fields, this may increase performance. If omitted, app_licensing fields are included in the response. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsusersidpermissionsget"></a>
# **ObjectsUsersIdPermissionsGet**
> void ObjectsUsersIdPermissionsGet (string id, string filter = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve User Permissions


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** | The ID of the user. Use the value me to retrieve information for the currently authenticated user. |  |
| **filter** | **string** | Filter the results to show only one specific name__v, which is in the format object.{object name}.{object or field}_actions. Wildcards are not supported. See example below. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsusersidput"></a>
# **ObjectsUsersIdPut**
> void ObjectsUsersIdPut (string id, string authorization = null, string contentType = null, string xVaultAPIClientID = null)

Update Single User


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** | The user id field value. Use the value me to get information for the currently authenticated user. |  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsusersmeget"></a>
# **ObjectsUsersMeGet**
> void ObjectsUsersMeGet (string excludeVaultMembership = null, string excludeAppLicensing = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Validate Session User


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **excludeVaultMembership** | **string** | Optional: Set to true to omit vault_membership fields. If you don’t need these fields, this may increase performance. If omitted, vault_membership fields are included in the response. | [optional]  |
| **excludeAppLicensing** | **string** | Optional: Set to true to omit app_licensing fields. If you don’t need these fields, this may increase performance. If omitted, app_licensing fields are included in the response. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsusersmepasswordpost"></a>
# **ObjectsUsersMePasswordPost**
> void ObjectsUsersMePasswordPost (string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Change My Password


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsusersmepermissionsget"></a>
# **ObjectsUsersMePermissionsGet**
> void ObjectsUsersMePermissionsGet (string filter = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve My User Permissions


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **filter** | **string** | Filter the results to show only one specific name__v, which is in the format object.{object name}.{object or field}_actions. Wildcards are not supported. See example below. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsusersmeput"></a>
# **ObjectsUsersMePut**
> void ObjectsUsersMePut (string authorization = null, string contentType = null, string xVaultAPIClientID = null)

Update My User


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsuserspost"></a>
# **ObjectsUsersPost**
> void ObjectsUsersPost (string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Create Single User


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsusersput"></a>
# **ObjectsUsersPut**
> void ObjectsUsersPut (string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Update Multiple Users


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsusersuseriddelete"></a>
# **ObjectsUsersUserIdDelete**
> void ObjectsUsersUserIdDelete (string userId, bool domain = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Disable User


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **userId** | **string** | The user id field value.  |  |
| **domain** | **bool** | When true, this disables the user account in all vaults in the domain. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsusersuseridvaultmembershipvaultidput"></a>
# **ObjectsUsersUserIdVaultMembershipVaultIdPut**
> void ObjectsUsersUserIdVaultMembershipVaultIdPut (string userId, string vaultId, string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Update Vault Membership


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **userId** | **string** | The user id field value. |  |
| **vaultId** | **string** | The system-managed id field value assigned to each vault in the domain. |  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsvaultactionscomparepost"></a>
# **ObjectsVaultActionsComparePost**
> void ObjectsVaultActionsComparePost (string authorization = null, string contentType = null, string xVaultAPIClientID = null)

Vault Compare


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="objectsvaultactionsconfigreportpost"></a>
# **ObjectsVaultActionsConfigreportPost**
> void ObjectsVaultActionsConfigreportPost (string authorization = null, string contentType = null, string xVaultAPIClientID = null)

Vault Configuration Report


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="querycomponentspost"></a>
# **QueryComponentsPost**
> void QueryComponentsPost (string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Component Definition Query


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="querynextpagepost"></a>
# **QueryNextPagePost**
> void QueryNextPagePost (string nextPage, string authorization = null, string accept = null, bool xVaultAPIDescribeQuery = null, string contentType = null, string xVaultAPIClientID = null)

Next Page URL


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **nextPage** | **string** |  |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIDescribeQuery** | **bool** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="querypost"></a>
# **QueryPost**
> void QueryPost (string authorization = null, string accept = null, bool xVaultAPIDescribeQuery = null, string contentType = null, string xVaultAPIClientID = null)

Submitting a Query


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIDescribeQuery** | **bool** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="querypreviouspagepost"></a>
# **QueryPreviousPagePost**
> void QueryPreviousPagePost (string previousPage, string authorization = null, string accept = null, bool xVaultAPIDescribeQuery = null, string contentType = null, string xVaultAPIClientID = null)

Previous Page URL


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **previousPage** | **string** |  |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIDescribeQuery** | **bool** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="scimv2meget"></a>
# **ScimV2MeGet**
> void ScimV2MeGet (string attributes = null, string excludedAttributes = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Current User with SCIM


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **attributes** | **string** | Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [optional]  |
| **excludedAttributes** | **string** | Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="scimv2meput"></a>
# **ScimV2MePut**
> void ScimV2MePut (string attributes = null, string excludedAttributes = null, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Update Current User with SCIM


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **attributes** | **string** | Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [optional]  |
| **excludedAttributes** | **string** | Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="scimv2resourcetypesget"></a>
# **ScimV2ResourceTypesGet**
> void ScimV2ResourceTypesGet (string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve All SCIM Resource Types


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="scimv2resourcetypestypeget"></a>
# **ScimV2ResourceTypesTypeGet**
> void ScimV2ResourceTypesTypeGet (string type, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Single SCIM Resource Type


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **type** | **string** | A specific resource type. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the id value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="scimv2schemasget"></a>
# **ScimV2SchemasGet**
> void ScimV2SchemasGet (string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve All SCIM Schema Information


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="scimv2schemasidget"></a>
# **ScimV2SchemasIdGet**
> void ScimV2SchemasIdGet (string id, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Single SCIM Schema Information


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** | The ID of a specific schema. For example, urn:ietf:params:scim:schemas:extension:veevavault:2.0:User. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="scimv2serviceproviderconfigget"></a>
# **ScimV2ServiceProviderConfigGet**
> void ScimV2ServiceProviderConfigGet (string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve SCIM Provider


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="scimv2typeget"></a>
# **ScimV2TypeGet**
> void ScimV2TypeGet (string type, string filter = null, string attributes = null, string excludedAttributes = null, string sortBy = null, string sortOrder = null, string startIndex = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve SCIM Resources


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **type** | **string** | The resource type to retrieve. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the endpoint value. |  |
| **filter** | **string** | Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \&quot;{value}\&quot;. For example, to filter for a particular user name, userName eq \&quot;john\&quot;. Complex expressions are not supported, and eq is the only supported operator. | [optional]  |
| **attributes** | **string** | Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [optional]  |
| **excludedAttributes** | **string** | Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional]  |
| **sortBy** | **string** | Optional: Specify an attribute or sub-attribute to order the response. For example, you can sort by the displayName attribute, or the name.familyName sub-attribute. If omitted, the response is sorted by id. Note that the following attributes are not supported: securityPolicy securityProfile locale preferredLanguage | [optional]  |
| **sortOrder** | **string** | Optional: Specify the number of query results per page, for example, 10. Negative values are treated as 0, and 0 returns no results except for totalResults. If omitted, defaults to 1000. | [optional]  |
| **startIndex** | **string** | Optional: Specify the index of the first result. For example, 10 would omit the first 9 results and begin on result 10. Omission, negative values, and 0 is treated as 1. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="scimv2typeidget"></a>
# **ScimV2TypeIdGet**
> void ScimV2TypeIdGet (string type, string id, string attributes = null, string excludedAttributes = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Single SCIM Resource


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **type** | **string** | The resource type to retrieve. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the endpoint value. |  |
| **id** | **string** | The ID of the resource to retrieve. You can retrieve all resource IDs from a particular resource type with the Retrieve SCIM Resources endpoint. For example, business_admin__v. |  |
| **attributes** | **string** | Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [optional]  |
| **excludedAttributes** | **string** | Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="scimv2usersget"></a>
# **ScimV2UsersGet**
> void ScimV2UsersGet (string filter = null, string attributes = null, string excludedAttributes = null, string sortBy = null, string sortOrder = null, string count = null, string startIndex = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve All Users with SCIM


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **filter** | **string** | Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \&quot;{value}\&quot;. For example, to filter for a particular user name, userName eq \&quot;john\&quot;. Complex expressions are not supported, and eq is the only supported operator. | [optional]  |
| **attributes** | **string** | Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [optional]  |
| **excludedAttributes** | **string** | Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional]  |
| **sortBy** | **string** | Optional: Specify an attribute or sub-attribute to order the response. For example, you can sort by the displayName attribute, or the name.familyName sub-attribute. If omitted, the response is sorted by id. Note that the following attributes are not supported: securityPolicy securityProfile locale preferredLanguage | [optional]  |
| **sortOrder** | **string** | Optional: Specify the order in which the sortBy parameter is applied. Allowed values are ascending or descending. If omitted, defaults to ascending. | [optional]  |
| **count** | **string** | Optional: Specify the number of query results per page, for example, 10. Negative values are treated as 0, and 0 returns no results except for totalResults. If omitted, defaults to 1000. | [optional]  |
| **startIndex** | **string** | Optional: Specify the index of the first result. For example, 10 would omit the first 9 results and begin on result 10. Omission, negative values, and 0 is treated as 1. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="scimv2usersidget"></a>
# **ScimV2UsersIdGet**
> void ScimV2UsersIdGet (string id, string filter = null, string attributes = null, string excludedAttributes = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Single User with SCIM


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** | The id of the user you wish to update. |  |
| **filter** | **string** | Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \&quot;{value}\&quot;. For example, to filter for a particular user name, userName eq \&quot;john\&quot;. Complex expressions are not supported, and eq is the only supported operator. | [optional]  |
| **attributes** | **string** | Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned. | [optional]  |
| **excludedAttributes** | **string** | Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="scimv2usersidput"></a>
# **ScimV2UsersIdPut**
> void ScimV2UsersIdPut (string id, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Update User with SCIM


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** | The id of the user you wish to update. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="scimv2userspost"></a>
# **ScimV2UsersPost**
> void ScimV2UsersPost (string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Create User with SCIM


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicescertificatecertidget"></a>
# **ServicesCertificateCertIdGet**
> void ServicesCertificateCertIdGet (string certId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Signing Certificate


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **certId** | **string** | The cert_id is provided in each Spark message in the X-VaultAPISignature-CertificateId header. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicesconfigurationmodeactionsdisablepost"></a>
# **ServicesConfigurationModeActionsDisablePost**
> void ServicesConfigurationModeActionsDisablePost (string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Disable Configuration Mode


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicesconfigurationmodeactionsenablepost"></a>
# **ServicesConfigurationModeActionsEnablePost**
> void ServicesConfigurationModeActionsEnablePost (string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Enable Configuration Mode


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicesdirectdatafilesget"></a>
# **ServicesDirectdataFilesGet**
> void ServicesDirectdataFilesGet (string extractType = null, int startTime = null, int stopTime = null, string accept = null, string authorization = null, string xVaultAPIClientID = null)

Retrieve Available Direct Data Files


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **extractType** | **string** | The Direct Data file type: incremental_directdata, full_directdata, or log_directdata. If omitted, returns all files. | [optional]  |
| **startTime** | **int** | Specify a time in YYYY-MM-DDTHH:MM:SSZ format. For example, 7AM on January 15, 2024 would use 2024-01-15T07:00:00Z. If omitted, defaults to the Vault’s creation date and time. | [optional]  |
| **stopTime** | **int** | Specify a time in YYYY-MM-DDTHH:MM:SSZ format. For example, 9AM on January 15, 2024 would use 2024-01-15T09:00:00Z. If omitted, defaults to today’s date and current time. | [optional]  |
| **accept** | **string** |  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicesdirectdatafilesnameget"></a>
# **ServicesDirectdataFilesNameGet**
> void ServicesDirectdataFilesNameGet (string name, string accept = null, string authorization = null, string xVaultAPIClientID = null)

Download Direct Data File


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **name** | **string** | The name of the Direct Data file part. Obtain this from the Retrieve Available Direct Data Files request. For example, 146478-20240213-0000-F.001. |  |
| **accept** | **string** |  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicesfilestagingitemscontentitemget"></a>
# **ServicesFileStagingItemsContentItemGet**
> void ServicesFileStagingItemsContentItemGet (string item, string authorization = null, string accept = null, string range = null, string xVaultAPIClientID = null)

Download Item Content


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **item** | **string** | The absolute path to a file or folder. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **range** | **string** | Optional: Specifies a partial range of bytes to include in the upload. Maximum 50 MB. Must be in the format &#x60;bytes&#x3D;{min}-{max}&#x60;. For example, &#x60;bytes&#x3D;0-1000&#x60;. | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicesfilestagingitemsitemdelete"></a>
# **ServicesFileStagingItemsItemDelete**
> void ServicesFileStagingItemsItemDelete (string item, string recursive = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Delete File or Folder


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **item** | **string** | The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. |  |
| **recursive** | **string** | Applicable to deleting folders only. If true, the request will delete the contents of a folder and all subfolders. The default is false. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicesfilestagingitemsitemget"></a>
# **ServicesFileStagingItemsItemGet**
> void ServicesFileStagingItemsItemGet (string item, string recursive = null, string limit = null, string formatResult = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

List Items at a Path


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **item** | **string** | The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. |  |
| **recursive** | **string** | If true, the response will contain the contents of all subfolders. If not specified, the default value is false. | [optional]  |
| **limit** | **string** | Optional: The maximum number of items per page in the response. This can be any value between 1 and 1000. If omitted, the default value is 1000. | [optional]  |
| **formatResult** | **string** | If set to csv, the response includes a job_id. Use the Job ID value to retrieve the status and results of the request. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicesfilestagingitemsitemput"></a>
# **ServicesFileStagingItemsItemPut**
> void ServicesFileStagingItemsItemPut (string item, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Update Folder or File


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **item** | **string** | The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicesfilestagingitemspost"></a>
# **ServicesFileStagingItemsPost**
> void ServicesFileStagingItemsPost (string authorization = null, string accept = null, string contentMD5 = null, string xVaultAPIClientID = null)

Create Folder or File


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentMD5** | **string** | Optional: The MD5 checksum of the file being uploaded. | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicesfilestaginguploadget"></a>
# **ServicesFileStagingUploadGet**
> void ServicesFileStagingUploadGet (string authorization = null, string accept = null, string xVaultAPIClientID = null)

List Upload Sessions


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicesfilestaginguploadpost"></a>
# **ServicesFileStagingUploadPost**
> void ServicesFileStagingUploadPost (string authorization = null, string accept = null, string xVaultAPIClientID = null)

Create Resumable Upload Session


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicesfilestaginguploaduploadsessioniddelete"></a>
# **ServicesFileStagingUploadUploadSessionIdDelete**
> void ServicesFileStagingUploadUploadSessionIdDelete (string uploadSessionId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Abort Upload Session


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **uploadSessionId** | **string** |  |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicesfilestaginguploaduploadsessionidget"></a>
# **ServicesFileStagingUploadUploadSessionIdGet**
> void ServicesFileStagingUploadUploadSessionIdGet (string uploadSessionId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Get Upload Session Details


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **uploadSessionId** | **string** |  |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicesfilestaginguploaduploadsessionidpartsget"></a>
# **ServicesFileStagingUploadUploadSessionIdPartsGet**
> void ServicesFileStagingUploadUploadSessionIdPartsGet (string uploadSessionId, string limit = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

List File Parts Uploaded to Session


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **uploadSessionId** | **string** |  |  |
| **limit** | **string** | Optional: The maximum number of items per page in the response. This can be any value between 1 and 1000. If omitted, the default value is 1000. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicesfilestaginguploaduploadsessionidpost"></a>
# **ServicesFileStagingUploadUploadSessionIdPost**
> void ServicesFileStagingUploadUploadSessionIdPost (string uploadSessionId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Commit Upload Session


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **uploadSessionId** | **string** |  |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicesfilestaginguploaduploadsessionidput"></a>
# **ServicesFileStagingUploadUploadSessionIdPut**
> void ServicesFileStagingUploadUploadSessionIdPut (string uploadSessionId, string authorization = null, string accept = null, string contentType = null, string xVaultAPIFilePartNumber = null, string contentMD5 = null, string xVaultAPIClientID = null)

Upload to a Session


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **uploadSessionId** | **string** |  |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIFilePartNumber** | **string** | The part number, which uniquely identifies a file part and defines its position within the file as a whole. If a part is uploaded using a part number that has already been used, Vault overwrites the previously uploaded file part. You must upload parts in numerical order. For example, you cannot upload part 3 without first uploading parts 1 and 2. | [optional]  |
| **contentMD5** | **string** | Optional: The MD5 checksum of the file part being uploaded. | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicesjobshistoriesget"></a>
# **ServicesJobsHistoriesGet**
> void ServicesJobsHistoriesGet (string startDate = null, string endDate = null, string status = null, string limit = null, string offset = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Job Histories


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **startDate** | **string** | Sets the date to start retrieving completed jobs, in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the first completed job. | [optional]  |
| **endDate** | **string** | Sets the date to end retrieving completed jobs, in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the current date and time. | [optional]  |
| **status** | **string** | Filter to only retrieve jobs in a certain status. Allowed values are success, errors_encountered, failed_to_run, missed_schedule, cancelled. If omitted, retrieves all statuses. | [optional]  |
| **limit** | **string** | Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 200. If omitted, defaults to 50. | [optional]  |
| **offset** | **string** | Paginate the results displayed per page by specifying the amount of offset from the first job history returned. If omitted, defaults to 0. If you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicesjobsjobiderrorsget"></a>
# **ServicesJobsJobIdErrorsGet**
> void ServicesJobsJobIdErrorsGet (string jobId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Import Bulk Translation File Job Errors


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **jobId** | **string** | The id value of the requested import job. This was returned from the Import Bulk Translation File request. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicesjobsjobidget"></a>
# **ServicesJobsJobIdGet**
> void ServicesJobsJobIdGet (string jobId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Job Status


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **jobId** | **string** | The ID of the job, returned from the original job request. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicesjobsjobidsummaryget"></a>
# **ServicesJobsJobIdSummaryGet**
> void ServicesJobsJobIdSummaryGet (string jobId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Import Bulk Translation File Job Summary


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **jobId** | **string** | The id value of the requested import job. This was returned from the Import Bulk Translation File request. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicesjobsjobidtasksget"></a>
# **ServicesJobsJobIdTasksGet**
> void ServicesJobsJobIdTasksGet (string jobId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve SDK Job Tasks


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **jobId** | **string** | The ID of the SDK job, returned from the original job request. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicesjobsmonitorsget"></a>
# **ServicesJobsMonitorsGet**
> void ServicesJobsMonitorsGet (string startDate = null, string endDate = null, string status = null, string limit = null, string offset = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Job Monitors


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **startDate** | **string** | Sets the date to start retrieving uncompleted jobs, based on the date and time the job instance was created. Value must be in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the first completed job. | [optional]  |
| **endDate** | **string** | Sets the date to end retrieving uncompleted jobs, based on the date and time the job instance was created. Value must be in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the current date and time. | [optional]  |
| **status** | **string** | Filter to only retrieve jobs in a certain status. Allowed values are scheduled, queued, running. If omitted, retrieves all statuses. | [optional]  |
| **limit** | **string** | Paginate the results by specifying the maximum number of jobs per page in the response. This can be any value between 1 and 200. If omitted, defaults to 50. | [optional]  |
| **offset** | **string** | Paginate the results displayed per page by specifying the amount of offset from the first job instance returned. If omitted, defaults to 0. If you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicesjobsstartnowjobidpost"></a>
# **ServicesJobsStartNowJobIdPost**
> void ServicesJobsStartNowJobIdPost (string jobId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Start Job


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **jobId** | **string** | The ID of the scheduled job instance to start. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicesloaderextractpost"></a>
# **ServicesLoaderExtractPost**
> void ServicesLoaderExtractPost (string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Extract Data Files


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicesloaderjobidtaskstaskidfailurelogget"></a>
# **ServicesLoaderJobIdTasksTaskIdFailurelogGet**
> void ServicesLoaderJobIdTasksTaskIdFailurelogGet (string jobId, string taskId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Load Failure Log Results


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **jobId** | **string** | The id value of the requested extract job. |  |
| **taskId** | **string** | The id value of the requested extract task. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicesloaderjobidtaskstaskidresultsget"></a>
# **ServicesLoaderJobIdTasksTaskIdResultsGet**
> void ServicesLoaderJobIdTasksTaskIdResultsGet (string jobId, string taskId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Loader Extract Results


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **jobId** | **string** | The id value of the requested extract job. |  |
| **taskId** | **string** | The id value of the requested extract task. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicesloaderjobidtaskstaskidresultsrenditionsget"></a>
# **ServicesLoaderJobIdTasksTaskIdResultsRenditionsGet**
> void ServicesLoaderJobIdTasksTaskIdResultsRenditionsGet (string jobId, string taskId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Loader Extract Renditions Results


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **jobId** | **string** | The id value of the requested extract job. |  |
| **taskId** | **string** | The id value of the requested extract task. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicesloaderjobidtaskstaskidsuccesslogget"></a>
# **ServicesLoaderJobIdTasksTaskIdSuccesslogGet**
> void ServicesLoaderJobIdTasksTaskIdSuccesslogGet (string jobId, string taskId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Load Success Log Results


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **jobId** | **string** | The id value of the requested extract job. |  |
| **taskId** | **string** | The id value of the requested extract task. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicesloaderloadpost"></a>
# **ServicesLoaderLoadPost**
> void ServicesLoaderLoadPost (string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Load Data Objects


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicespackageactionsvalidatepost"></a>
# **ServicesPackageActionsValidatePost**
> void ServicesPackageActionsValidatePost (string authorization = null, string contentType = null, string xVaultAPIClientID = null)

Validate Package


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicespackagepost"></a>
# **ServicesPackagePost**
> void ServicesPackagePost (string authorization = null, string contentType = null, string xVaultAPIClientID = null)

Export Package


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicespackageput"></a>
# **ServicesPackagePut**
> void ServicesPackagePut (string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Import Package


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicesqueuesget"></a>
# **ServicesQueuesGet**
> void ServicesQueuesGet (string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve All Queues


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicesqueuesqueuenameactionsdisabledeliveryput"></a>
# **ServicesQueuesQueueNameActionsDisableDeliveryPut**
> void ServicesQueuesQueueNameActionsDisableDeliveryPut (string queueName, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Disable Delivery


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **queueName** | **string** | The name of a specific Queue. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicesqueuesqueuenameactionsenabledeliveryput"></a>
# **ServicesQueuesQueueNameActionsEnableDeliveryPut**
> void ServicesQueuesQueueNameActionsEnableDeliveryPut (string queueName, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Enable Delivery


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **queueName** | **string** | The name of a specific Queue. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicesqueuesqueuenameactionsresetput"></a>
# **ServicesQueuesQueueNameActionsResetPut**
> void ServicesQueuesQueueNameActionsResetPut (string queueName, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Reset Queue


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **queueName** | **string** | The name of a specific Queue. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicesqueuesqueuenameget"></a>
# **ServicesQueuesQueueNameGet**
> void ServicesQueuesQueueNameGet (string queueName, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Queue Status


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **queueName** | **string** | The name of a specific queue. For example, queue__c. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="servicesvobjectvaultpackagevpackageidactionsvalidatepost"></a>
# **ServicesVobjectVaultPackageVPackageIdActionsValidatePost**
> void ServicesVobjectVaultPackageVPackageIdActionsValidatePost (string packageId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Validate Imported Package


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **packageId** | **string** | The ID of the package to validate. You can find this in the API response of a package import, or in the URL of package in the Vault UI. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="sessiondelete"></a>
# **SessionDelete**
> void SessionDelete (string accept = null, string authorization = null, string xVaultAPIClientID = null)

End Session


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **accept** | **string** |  | [optional]  |
| **authorization** | **string** | The Vault sessionId to end. | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="uicodedistributionsdistributionnamecodeget"></a>
# **UicodeDistributionsDistributionNameCodeGet**
> void UicodeDistributionsDistributionNameCodeGet (string distributionName, string accept = null, string authorization = null, string xVaultAPIClientID = null)

Download Single Client Code Distribution


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **distributionName** | **string** | The name attribute of the client code distribution to download. |  |
| **accept** | **string** |  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="uicodedistributionsdistributionnamedelete"></a>
# **UicodeDistributionsDistributionNameDelete**
> void UicodeDistributionsDistributionNameDelete (string distributionName, string accept = null, string authorization = null, string xVaultAPIClientID = null)

Delete Single Client Code Distribution


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **distributionName** | **string** | The name attribute of the client code distribution to delete. |  |
| **accept** | **string** |  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="uicodedistributionsdistributionnameget"></a>
# **UicodeDistributionsDistributionNameGet**
> void UicodeDistributionsDistributionNameGet (string distributionName, string accept = null, string authorization = null, string xVaultAPIClientID = null)

Retrieve Single Client Code Distribution Metadata


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **distributionName** | **string** | The name attribute of the client code distribution to delete. |  |
| **accept** | **string** |  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="uicodedistributionsget"></a>
# **UicodeDistributionsGet**
> void UicodeDistributionsGet (string accept = null, string authorization = null, string xVaultAPIClientID = null)

Retrieve All Client Code Distribution Metadata


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **accept** | **string** |  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="uicodedistributionspost"></a>
# **UicodeDistributionsPost**
> void UicodeDistributionsPost (string accept = null, string authorization = null, string contentType = null, string xVaultAPIClientID = null)

Add or Replace Single Client Code Distribution


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **accept** | **string** |  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectvaultpackagevpackageidactionsdeploypost"></a>
# **VobjectVaultPackageVPackageIdActionsDeployPost**
> void VobjectVaultPackageVPackageIdActionsDeployPost (string packageId, string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Deploy Package


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **packageId** | **string** | The id field value of the vault_package__v object record used for deployment. See Import Package. |  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectvaultpackagevpackageidactionsdeployresultsget"></a>
# **VobjectVaultPackageVPackageIdActionsDeployResultsGet**
> void VobjectVaultPackageVPackageIdActionsDeployResultsGet (string packageId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Package Deploy Results


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **packageId** | **string** | The id field value of the vault_package__v object record used for deployment. See Deploy Package. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectscascadedeleteresultsobjectnamejobstatusjobidget"></a>
# **VobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet**
> void VobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet (string objectName, string jobStatus, string jobId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Results of Cascade Delete Job


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |  |
| **jobStatus** | **string** |  |  |
| **jobId** | **string** |  |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsdeepcopyresultsobjectnamejobstatusjobidget"></a>
# **VobjectsDeepcopyResultsObjectNameJobStatusJobIdGet**
> void VobjectsDeepcopyResultsObjectNameJobStatusJobIdGet (string objectName, string jobStatus, string jobId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Results of Deep Copy Job


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |  |
| **jobStatus** | **string** | The ID of the job, retrieved from the response of the job request. |  |
| **jobId** | **string** | Possible values are success or failure. Find if your job succeeded or failed by retrieving the job status. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsedlitemvactionscreateplaceholderpost"></a>
# **VobjectsEdlItemVActionsCreateplaceholderPost**
> void VobjectsEdlItemVActionsCreateplaceholderPost (string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Create a Placeholder from an EDL Item


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsmergesjobidlogget"></a>
# **VobjectsMergesJobIdLogGet**
> void VobjectsMergesJobIdLogGet (string jobId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Download Merge Records Job Log


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **jobId** | **string** | The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsmergesjobidresultsget"></a>
# **VobjectsMergesJobIdResultsGet**
> void VobjectsMergesJobIdResultsGet (string jobId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Record Merge Results


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **jobId** | **string** | The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsmergesjobidstatusget"></a>
# **VobjectsMergesJobIdStatusGet**
> void VobjectsMergesJobIdStatusGet (string jobId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Record Merge Status


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **jobId** | **string** | The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsobjectnameactionsactionnamepost"></a>
# **VobjectsObjectNameActionsActionNamePost**
> void VobjectsObjectNameActionsActionNamePost (string objectName, string actionName, string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Initiate Object Action on Multiple Records


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The object name__v field value. |  |
| **actionName** | **string** | Either the name of the Objectaction or Objectlifecyclestateuseraction to initiate. This is obtained from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action. |  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsobjectnameactionschangetypepost"></a>
# **VobjectsObjectNameActionsChangetypePost**
> void VobjectsObjectNameActionsChangetypePost (string objectName, string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Change Object Type


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The name of the object. |  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsobjectnameactionsmergepost"></a>
# **VobjectsObjectNameActionsMergePost**
> void VobjectsObjectNameActionsMergePost (string objectName, string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null, List<VobjectsObjectNameActionsMergePostRequestInner> vobjectsObjectNameActionsMergePostRequestInner = null)

Initiate Record Merge


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The object name__v field value. For example, account__v. This object must have Enable Merges configured. |  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |
| **vobjectsObjectNameActionsMergePostRequestInner** | [**List&lt;VobjectsObjectNameActionsMergePostRequestInner&gt;**](VobjectsObjectNameActionsMergePostRequestInner.md) |  | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsobjectnameactionsrecalculaterollupsget"></a>
# **VobjectsObjectNameActionsRecalculaterollupsGet**
> void VobjectsObjectNameActionsRecalculaterollupsGet (string objectName, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Roll-up Field Recalculation Status


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The name of the object for which to check the status of a Roll-up field recalculation. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsobjectnameactionsrecalculaterollupspost"></a>
# **VobjectsObjectNameActionsRecalculaterollupsPost**
> void VobjectsObjectNameActionsRecalculaterollupsPost (string objectName, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Recalculate Roll-up Fields


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The name of the object for which to check the status of a Roll-up field recalculation. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsobjectnameactionsupdatecorporatecurrencyput"></a>
# **VobjectsObjectNameActionsUpdatecorporatecurrencyPut**
> void VobjectsObjectNameActionsUpdatecorporatecurrencyPut (string objectName, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Update Corporate Currency Fields


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsobjectnameattachmentsbatchdelete"></a>
# **VobjectsObjectNameAttachmentsBatchDelete**
> void VobjectsObjectNameAttachmentsBatchDelete (string objectName, string idParam = null, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Delete Multiple Object Record Attachments


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |  |
| **idParam** | **string** |  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsobjectnameattachmentsbatchpost"></a>
# **VobjectsObjectNameAttachmentsBatchPost**
> void VobjectsObjectNameAttachmentsBatchPost (string objectName, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Create Multiple Object Record Attachments


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsobjectnameattachmentsbatchput"></a>
# **VobjectsObjectNameAttachmentsBatchPut**
> void VobjectsObjectNameAttachmentsBatchPut (string objectName, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Update Multiple Object Record Attachment Descriptions


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsobjectnamedelete"></a>
# **VobjectsObjectNameDelete**
> void VobjectsObjectNameDelete (string objectName, string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Delete Object Records


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** | Can be text/csv or application/json | [optional]  |
| **accept** | **string** | Can be text/csv or application/json | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsobjectnameidrolesrolenameget"></a>
# **VobjectsObjectNameIdRolesRoleNameGet**
> void VobjectsObjectNameIdRolesRoleNameGet (string objectName, string id, string roleName, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Object Record Roles


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The object name. |  |
| **id** | **string** | The id of the document, binder, or object record. |  |
| **roleName** | **string** | Optional: Include a role name to filter for a specific role. For example, owner__v. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsobjectnameobjectrecordidactionsactionnameget"></a>
# **VobjectsObjectNameObjectRecordIdActionsActionNameGet**
> void VobjectsObjectNameObjectRecordIdActionsActionNameGet (string objectName, string objectRecordId, string actionName, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Object User Actions Details


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The object name__v field value. |  |
| **objectRecordId** | **string** | The object record id field value from which to retrieve user actions. |  |
| **actionName** | **string** | The name of the Objectaction or Objectlifecyclestateuseraction to initiate. You can retrieve this from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsobjectnameobjectrecordidactionsactionnamepost"></a>
# **VobjectsObjectNameObjectRecordIdActionsActionNamePost**
> void VobjectsObjectNameObjectRecordIdActionsActionNamePost (string objectName, string objectRecordId, string actionName, string authorization = null, string contentType = null, string accept = null, string xVaultAPIClientID = null)

Initiate Object Action on a Single Record


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The object name__v field value. |  |
| **objectRecordId** | **string** | The object record id field value from which to retrieve user actions. |  |
| **actionName** | **string** | The name of the Objectaction or Objectlifecyclestateuseraction to initiate. You can retrieve this from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action. |  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsobjectnameobjectrecordidactionscascadedeletepost"></a>
# **VobjectsObjectNameObjectRecordIdActionsCascadedeletePost**
> void VobjectsObjectNameObjectRecordIdActionsCascadedeletePost (string objectName, string objectRecordId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Cascade Delete Object Record


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |  |
| **objectRecordId** | **string** | The object record id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsobjectnameobjectrecordidactionsdeepcopypost"></a>
# **VobjectsObjectNameObjectRecordIdActionsDeepcopyPost**
> void VobjectsObjectNameObjectRecordIdActionsDeepcopyPost (string objectName, string objectRecordId, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Deep Copy Object Record


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |  |
| **objectRecordId** | **string** | The object record id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsobjectnameobjectrecordidactionsget"></a>
# **VobjectsObjectNameObjectRecordIdActionsGet**
> void VobjectsObjectNameObjectRecordIdActionsGet (string objectName, string objectRecordId, bool loc = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Object Record User Actions


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The object name__v field value. |  |
| **objectRecordId** | **string** | The object record id field value. |  |
| **loc** | **bool** | Optional: When true, retrieves localized (translated) strings for the label.  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsobjectnameobjectrecordidattachmentfieldsattachmentfieldnamefileget"></a>
# **VobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet**
> void VobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet (string objectName, string objectRecordId, string attachmentFieldName, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Download Attachment Field File


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The object name__v field value. For example, product__v. |  |
| **objectRecordId** | **string** | The object record id field value. |  |
| **attachmentFieldName** | **string** | The name of the Attachment field to update. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsobjectnameobjectrecordidattachmentfieldsattachmentfieldnamefilepost"></a>
# **VobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost**
> void VobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost (string objectName, string objectRecordId, string attachmentFieldName, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Update Attachment Field File


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The object name__v field value. For example, product__v. |  |
| **objectRecordId** | **string** | The object record id field value. |  |
| **attachmentFieldName** | **string** | The name of the Attachment field to update. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsobjectnameobjectrecordidattachmentfieldsfileget"></a>
# **VobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet**
> void VobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet (string objectName, string objectRecordId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Download All Attachment Field Files


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The object name__v field value. For example, product__v. |  |
| **objectRecordId** | **string** | The object record id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsobjectnameobjectrecordidattachmentsattachmentiddelete"></a>
# **VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete**
> void VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete (string objectName, string objectRecordId, string attachmentId, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Delete Object Record Attachment


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |  |
| **objectRecordId** | **string** | The object record id field value. |  |
| **attachmentId** | **string** | The attachment id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsobjectnameobjectrecordidattachmentsattachmentidget"></a>
# **VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet**
> void VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet (string objectName, string objectRecordId, string attachmentId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Object Record Attachment Metadata


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |  |
| **objectRecordId** | **string** | The object record id field value. |  |
| **attachmentId** | **string** | The attachment id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsobjectnameobjectrecordidattachmentsattachmentidput"></a>
# **VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut**
> void VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut (string objectName, string objectRecordId, string attachmentId, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Update Object Record Attachment Description


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |  |
| **objectRecordId** | **string** | The object record id field value. |  |
| **attachmentId** | **string** | The attachment id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsobjectnameobjectrecordidattachmentsattachmentidversionsattachmentversiondelete"></a>
# **VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete**
> void VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete (string objectName, string objectRecordId, string attachmentId, string attachmentVersion, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Delete Object Record Attachment Version


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |  |
| **objectRecordId** | **string** | The object record id field value. |  |
| **attachmentId** | **string** | The attachment id field value. |  |
| **attachmentVersion** | **string** | The attachment version__v field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsobjectnameobjectrecordidattachmentsattachmentidversionsattachmentversionfileget"></a>
# **VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet**
> void VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet (string objectName, string objectRecordId, string attachmentId, string attachmentVersion, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Download Object Record Attachment File


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |  |
| **objectRecordId** | **string** | The object record id field value. |  |
| **attachmentId** | **string** | The attachment id field value. |  |
| **attachmentVersion** | **string** |  |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsobjectnameobjectrecordidattachmentsattachmentidversionsattachmentversionget"></a>
# **VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet**
> void VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet (string objectName, string objectRecordId, string attachmentId, string attachmentVersion, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Object Record Attachment Version Metadata


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |  |
| **objectRecordId** | **string** | The object record id field value. |  |
| **attachmentId** | **string** | The attachment id field value. |  |
| **attachmentVersion** | **string** | The attachment version__v field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsobjectnameobjectrecordidattachmentsattachmentidversionsattachmentversionpost"></a>
# **VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost**
> void VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost (string objectName, string objectRecordId, string attachmentId, string attachmentVersion, bool restore = null, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Restore Object Record Attachment Version


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |  |
| **objectRecordId** | **string** | The object record id field value. |  |
| **attachmentId** | **string** | The attachment id field value. |  |
| **attachmentVersion** | **string** | The attachment version__v field value. |  |
| **restore** | **bool** |  | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsobjectnameobjectrecordidattachmentsattachmentidversionsget"></a>
# **VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet**
> void VobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet (string objectName, string objectRecordId, string attachmentId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Object Record Attachment Versions


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |  |
| **objectRecordId** | **string** | The object record id field value. |  |
| **attachmentId** | **string** | The attachment id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsobjectnameobjectrecordidattachmentsfileget"></a>
# **VobjectsObjectNameObjectRecordIdAttachmentsFileGet**
> void VobjectsObjectNameObjectRecordIdAttachmentsFileGet (string objectName, string objectRecordId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Download All Object Record Attachment Files


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |  |
| **objectRecordId** | **string** | The object record id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsobjectnameobjectrecordidattachmentsget"></a>
# **VobjectsObjectNameObjectRecordIdAttachmentsGet**
> void VobjectsObjectNameObjectRecordIdAttachmentsGet (string objectName, string objectRecordId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Object Record Attachments


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |  |
| **objectRecordId** | **string** | The object record id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsobjectnameobjectrecordidattachmentspost"></a>
# **VobjectsObjectNameObjectRecordIdAttachmentsPost**
> void VobjectsObjectNameObjectRecordIdAttachmentsPost (string objectName, string objectRecordId, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Create Object Record Attachment


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |  |
| **objectRecordId** | **string** | The object record id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsobjectnameobjectrecordidaudittrailget"></a>
# **VobjectsObjectNameObjectRecordIdAudittrailGet**
> void VobjectsObjectNameObjectRecordIdAudittrailGet (string objectName, string objectRecordId, string startDate = null, string endDate = null, string formatResult = null, string limit = null, string offset = null, string events = null, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Complete Audit History for a Single Object Record


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The object name__v field value. |  |
| **objectRecordId** | **string** | The object record id field value from which to retrieve user actions. |  |
| **startDate** | **string** | Specify a start date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to the vVault’s creation date.  | [optional]  |
| **endDate** | **string** | Specify an end date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to today’s date.  | [optional]  |
| **formatResult** | **string** | To request a CSV file of your audit history, use csv.  | [optional]  |
| **limit** | **string** | Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200. | [optional]  |
| **offset** | **string** | Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0. | [optional]  |
| **events** | **string** | Provide a comma-separated list of one or more audit events to retrieve their audit history. See Vault Help for a full list of object audit events. The values passed to this parameter are case sensitive. For example, events&#x3D;Copy,Edit,Delete. If omitted, defaults to all audit events. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsobjectnameobjectrecordidget"></a>
# **VobjectsObjectNameObjectRecordIdGet**
> void VobjectsObjectNameObjectRecordIdGet (string objectName, string objectRecordId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Object Record


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |  |
| **objectRecordId** | **string** | The object record id field value. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsobjectnamepost"></a>
# **VobjectsObjectNamePost**
> void VobjectsObjectNamePost (string objectName, string idParam = null, string authorization = null, string contentType = null, string accept = null, bool xVaultAPIMigrationMode = null, bool xVaultAPINoTriggers = null, string xVaultAPIClientID = null)

Create & Upsert Object Records


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |  |
| **idParam** | **string** | To upsert object records, add &#x60;idParam&#x3D;{field_name}&#x60; to the request endpoint. You can use any object field which has &#x60;unique&#x60; set to &#x60;true&#x60; in the object metadata. For example, &#x60;idParam&#x3D;external_id__v&#x60;. | [optional]  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** | Can be text/csv or application/json | [optional]  |
| **accept** | **string** | Can be text/csv or application/json | [optional]  |
| **xVaultAPIMigrationMode** | **bool** | If set to &#x60;true&#x60;, Vault allows you to create or update object records in a noninitial state and with minimal validation, create inactive records, and set standard and system-managed fields such as &#x60;created_by__v&#x60;. Does not bypass record triggers. Use the &#x60;X-VaultAPI-NoTriggers&#x60; header to bypass all standard and custom SDK triggers. You must have the Record Migration permission to use this header. | [optional]  |
| **xVaultAPINoTriggers** | **bool** | If set to &#x60;true&#x60; and Record Migration Mode is enabled, it bypasses all standard and custom SDK triggers. | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsobjectnameput"></a>
# **VobjectsObjectNamePut**
> void VobjectsObjectNamePut (string objectName, string authorization = null, string contentType = null, string accept = null, bool xVaultAPIMigrationMode = null, bool xVaultAPINoTriggers = null, string xVaultAPIClientID = null)

Update Object Records


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The object name__v field value (product__v, country__v, custom_object__c, etc.). |  |
| **authorization** | **string** |  | [optional]  |
| **contentType** | **string** | Can be text/csv or application/json | [optional]  |
| **accept** | **string** | Can be text/csv or application/json | [optional]  |
| **xVaultAPIMigrationMode** | **bool** | If set to &#x60;true&#x60;, Vault allows you to update object records in a noninitial state and with minimal validation, create inactive records, and set standard and system-managed fields such as &#x60;created_by__v&#x60;. Does not bypass record triggers. Use the &#x60;X-VaultAPI-NoTriggers&#x60; header to bypass all standard and custom SDK triggers. You must have the Record Migration permission to use this header. | [optional]  |
| **xVaultAPINoTriggers** | **bool** | If set to &#x60;true&#x60; and Record Migration Mode is enabled, it bypasses all standard and custom SDK triggers. | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsobjectnamerolesdelete"></a>
# **VobjectsObjectNameRolesDelete**
> void VobjectsObjectNameRolesDelete (string objectName, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Remove Users & Groups from Roles on Object Records


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The name of the object where you want to remove roles. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsobjectnamerolespost"></a>
# **VobjectsObjectNameRolesPost**
> void VobjectsObjectNameRolesPost (string objectName, string authorization = null, string accept = null, string contentType = null, string xVaultAPIClientID = null)

Assign Users & Groups to Roles on Object Records


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **objectName** | **string** | The name of the object where you want to remove roles. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **contentType** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="vobjectsoutboundpackagevpackageiddependenciesget"></a>
# **VobjectsOutboundPackageVPackageIdDependenciesGet**
> void VobjectsOutboundPackageVPackageIdDependenciesGet (string packageId, string authorization = null, string accept = null, string xVaultAPIClientID = null)

Retrieve Outbound Package Dependencies


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **packageId** | **string** | The ID of the outbound_package__v record from which to retrieve dependencies. |  |
| **authorization** | **string** |  | [optional]  |
| **accept** | **string** |  | [optional]  |
| **xVaultAPIClientID** | **string** | Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log. | [optional]  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

