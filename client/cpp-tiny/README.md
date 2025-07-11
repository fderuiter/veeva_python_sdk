# Documentation for OpenAPI Petstore
This is a client generator for microcontrollers on the Espressif32 platform and the Arduino framework
After the client have been generated, you have to change these following variables:
- root.cert | Provide your service root certificate.
- src/main.cpp | Change wifi name
- src/main.cpp | Change wifi password
- lib/service/AbstractService.h | Change to your url

# Documentation for Veeva Vault API v25.1 1.0.0 Tiny client cpp (Arduino) 

The project is structured like this:
```
samples/client/petstore/tiny/cpp/
├── lib
│   ├── Models
│   ├── service
│   └── TestFiles
├── platformio.ini
├── pre_compiling_bourne.py
├── README.md
├── root.cert
├── src
│   └── main.cpp
└── test
    └── RunTests.cpp
```

All URIs are relative to http://}http://}/api/v25.1

### DefaultApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*apiGet* | *GET* /api/ | Retrieve API Versions.|
|*apiMdlComponentsComponentTypeAndRecordNameFilesGet* | *GET* /api/mdl/components/{component_type_and_record_name}/files | Retrieve Content File.|
|*apiMdlComponentsComponentTypeAndRecordNameGet* | *GET* /api/mdl/components/{component_type_and_record_name} | Retrieve Component Record (MDL).|
|*apiMdlExecuteAsyncJobIdResultsGet* | *GET* /api/mdl/execute_async/{job_id}/results | Retrieve Asynchronous MDL Script Results.|
|*apiMdlExecuteAsyncPost* | *POST* /api/mdl/execute_async | Execute MDL Script Asynchronously.|
|*apiMdlExecutePost* | *POST* /api/mdl/execute | Execute MDL Script.|
|*apiMdlFilesPost* | *POST* /api/mdl/files | Upload Content File.|
|*audittrailAuditTrailTypeGet* | *GET* /audittrail/{audit_trail_type} | Retrieve Audit Details.|
|*authDiscoveryPost* | *POST* /auth/discovery | Authentication Type Discovery.|
|*authOauthSessionOathOidcProfileIdPost* | *POST* /auth/oauth/session/{oath_oidc_profile_id} | OAuth 2.0 / OpenID Connect.|
|*authPost* | *POST* /auth | User Name and Password.|
|*codeClassNameDelete* | *DELETE* /code/{class_name} | Delete Single Source Code File.|
|*codeClassNameDisablePut* | *PUT* /code/{class_name}/disable | Disable Vault Extension.|
|*codeClassNameEnablePut* | *PUT* /code/{class_name}/enable | Enable Vault Extension.|
|*codeClassNameGet* | *GET* /code/{class_name} | Retrieve Single Source Code File.|
|*codeProfilerGet* | *GET* /code/profiler | Retrieve All Profiling Sessions.|
|*codeProfilerPost* | *POST* /code/profiler | Create Profiling Session.|
|*codeProfilerSessionNameActionsEndPost* | *POST* /code/profiler/{session_name}/actions/end | End Profiling Session.|
|*codeProfilerSessionNameDelete* | *DELETE* /code/profiler/{session_name} | Delete Profiling Session.|
|*codeProfilerSessionNameGet* | *GET* /code/profiler/{session_name} | Retrieve Profiling Session.|
|*codeProfilerSessionNameResultsGet* | *GET* /code/profiler/{session_name}/results | Download Profiling Session Results.|
|*codePut* | *PUT* /code | Add or Replace Single Source Code File.|
|*compositesTreesEdlHierarchyOrTemplateActionsListnodesPost* | *POST* /composites/trees/{edl_hierarchy_or_template}/actions/listnodes | Retrieve Specific Root Nodes.|
|*compositesTreesEdlHierarchyOrTemplateGet* | *GET* /composites/trees/{edl_hierarchy_or_template} | Retrieve All Root Nodes.|
|*compositesTreesEdlHierarchyVParentNodeIdChildrenGet* | *GET* /composites/trees/edl_hierarchy__v/{parent_node_id}/children | Retrieve a Node's Children.|
|*compositesTreesEdlHierarchyVParentNodeIdChildrenPut* | *PUT* /composites/trees/edl_hierarchy__v/{parent_node_id}/children | Update Node Order.|
|*configurationComponentTypeAndRecordNameGet* | *GET* /configuration/{component_type_and_record_name} | Retrieve Component Record (XML/JSON).|
|*configurationComponentTypeGet* | *GET* /configuration/{component_type} | Retrieve Component Record Collection.|
|*configurationObjectNameAndObjectTypeGet* | *GET* /configuration/{object_name_and_object_type} | Retrieve Details from a Specific Object.|
|*configurationObjecttypeGet* | *GET* /configuration/Objecttype | Retrieve Details from All Object Types.|
|*configurationRoleAssignmentRuleDelete* | *DELETE* /configuration/role_assignment_rule | Delete Lifecycle Role Assignment Override Rules.|
|*configurationRoleAssignmentRuleGet* | *GET* /configuration/role_assignment_rule | Retrieve Lifecycle Role Assignment Rules (Default & Override).|
|*configurationRoleAssignmentRulePost* | *POST* /configuration/role_assignment_rule | Create Lifecycle Role Assignment Override Rules.|
|*configurationRoleAssignmentRulePut* | *PUT* /configuration/role_assignment_rule | Update Lifecycle Role Assignment Rules (Default & Override).|
|*delegationLoginPost* | *POST* /delegation/login | Initiate Delegated Session.|
|*delegationVaultsGet* | *GET* /delegation/vaults | Retrieve Delegations.|
|*keepAlivePost* | *POST* /keep-alive | Session Keep Alive.|
|*limitsGet* | *GET* /limits | Retrieve Limits on Objects.|
|*logsApiUsageGet* | *GET* /logs/api_usage | Download Daily API Usage.|
|*logsCodeDebugGet* | *GET* /logs/code/debug | Retrieve All Debug Logs.|
|*logsCodeDebugIdActionsResetDelete* | *DELETE* /logs/code/debug/{id}/actions/reset | Delete Debug Log.|
|*logsCodeDebugIdActionsResetPost* | *POST* /logs/code/debug/{id}/actions/reset | Reset Debug Log.|
|*logsCodeDebugIdFilesGet* | *GET* /logs/code/debug/{id}/files | Download Debug Log Files.|
|*logsCodeDebugIdGet* | *GET* /logs/code/debug/{id} | Retrieve Single Debug Log.|
|*logsCodeDebugPost* | *POST* /logs/code/debug | Create Debug Log.|
|*logsCodeRuntimeGet* | *GET* /logs/code/runtime | Download SDK Runtime Log.|
|*messagesMessageTypeActionsImportPost* | *POST* /messages/{message_type}/actions/import | Import Bulk Translation File.|
|*messagesMessageTypeLanguageLangActionsExportPost* | *POST* /messages/{message_type}/language/{lang}/actions/export | Export Bulk Translation File.|
|*metadataAudittrailAuditTrailTypeGet* | *GET* /metadata/audittrail/{audit_trail_type} | Retrieve Audit Metadata.|
|*metadataAudittrailGet* | *GET* /metadata/audittrail | Retrieve Audit Types.|
|*metadataComponentsComponentTypeGet* | *GET* /metadata/components/{component_type} | Retrieve Component Type Metadata.|
|*metadataComponentsGet* | *GET* /metadata/components | Retrieve All Component Metadata.|
|*metadataObjectsBindersTemplatesBindernodesGet* | *GET* /metadata/objects/binders/templates/bindernodes | Retrieve Binder Template Node Metadata.|
|*metadataObjectsBindersTemplatesGet* | *GET* /metadata/objects/binders/templates | Retrieve Binder Template Metadata.|
|*metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet* | *GET* /metadata/objects/documents/annotations/placemarks/types/{placemark_type} | Retrieve Annotation Placemark Type Metadata.|
|*metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet* | *GET* /metadata/objects/documents/annotations/references/types/{reference_type} | Retrieve Annotation Reference Type Metadata.|
|*metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet* | *GET* /metadata/objects/documents/annotations/types/{annotation_type} | Retrieve Annotation Type Metadata.|
|*metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet* | *GET* /metadata/objects/documents/events/{event_type}/types/{event_subtype} | Retrieve Document Event SubType Metadata.|
|*metadataObjectsDocumentsEventsGet* | *GET* /metadata/objects/documents/events | Retrieve Document Event Types and Subtypes.|
|*metadataObjectsDocumentsLockGet* | *GET* /metadata/objects/documents/lock | Retrieve Document Lock Metadata.|
|*metadataObjectsDocumentsPropertiesFindCommonPost* | *POST* /metadata/objects/documents/properties/find_common | Retrieve Common Document Fields.|
|*metadataObjectsDocumentsPropertiesGet* | *GET* /metadata/objects/documents/properties | Retrieve All Document Fields.|
|*metadataObjectsDocumentsTemplatesGet* | *GET* /metadata/objects/documents/templates | Retrieve Document Template Metadata.|
|*metadataObjectsDocumentsTypesGet* | *GET* /metadata/objects/documents/types | Retrieve All Document Types.|
|*metadataObjectsDocumentsTypesTypeGet* | *GET* /metadata/objects/documents/types/{type} | Retrieve Document Type.|
|*metadataObjectsDocumentsTypesTypeRelationshipsGet* | *GET* /metadata/objects/documents/types/{type}/relationships | Retrieve Document Type Relationships.|
|*metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet* | *GET* /metadata/objects/documents/types/{type}/subtypes/{subtype}/classifications/{classification} | Retrieve Document Classification.|
|*metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet* | *GET* /metadata/objects/documents/types/{type}/subtypes/{subtype} | Retrieve Document Subtype.|
|*metadataObjectsGroupsGet* | *GET* /metadata/objects/groups | Retrieve Group Metadata.|
|*metadataObjectsSecuritypoliciesGet* | *GET* /metadata/objects/securitypolicies | Retrieve Security Policy Metadata.|
|*metadataObjectsUsersGet* | *GET* /metadata/objects/users | Retrieve User Metadata.|
|*metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet* | *GET* /metadata/query/archived_documents/relationships/document_signature__sysr | Retrieve Archived Document Signature Metadata.|
|*metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet* | *GET* /metadata/query/documents/relationships/document_signature__sysr | Retrieve Document Signature Metadata.|
|*metadataVobjectsGet* | *GET* /metadata/vobjects | Retrieve Object Collection.|
|*metadataVobjectsObjectNameActionsCanceldeploymentPost* | *POST* /metadata/vobjects/{object_name}/actions/canceldeployment | Cancel Raw Object Deployment.|
|*metadataVobjectsObjectNameFieldsObjectFieldNameGet* | *GET* /metadata/vobjects/{object_name}/fields/{object_field_name} | Retrieve Object Field Metadata.|
|*metadataVobjectsObjectNameGet* | *GET* /metadata/vobjects/{object_name} | Retrieve Object Metadata.|
|*metadataVobjectsObjectNamePageLayoutsGet* | *GET* /metadata/vobjects/{object_name}/page_layouts | Retrieve Page Layouts.|
|*metadataVobjectsObjectNamePageLayoutsLayoutNameGet* | *GET* /metadata/vobjects/{object_name}/page_layouts/{layout_name} | Retrieve Page Layout Metadata.|
|*notificationsHistoriesGet* | *GET* /notifications/histories | Retrieve Email Notification Histories.|
|*objectWorkflowActionsActionGet* | *GET* /object/workflow/actions/{action} | Retrieve Bulk Workflow Action Details.|
|*objectWorkflowActionsActionPost* | *POST* /object/workflow/actions/{action} | Initiate Workflow Actions on Multiple Workflows.|
|*objectWorkflowActionsCanceltasksPost* | *POST* /object/workflow/actions/canceltasks | Cancel Workflow Tasks.|
|*objectWorkflowActionsCancelworkflowsPost* | *POST* /object/workflow/actions/cancelworkflows | Cancel Workflows.|
|*objectWorkflowActionsGet* | *GET* /object/workflow/actions | Retrieve Bulk Workflow Actions.|
|*objectWorkflowActionsReassigntasksPost* | *POST* /object/workflow/actions/reassigntasks | Reassign Workflow Tasks.|
|*objectWorkflowActionsReplaceworkflowownerPost* | *POST* /object/workflow/actions/replaceworkflowowner | Replace Workflow Owner.|
|*objectsBindersActionsExportJobIdResultsGet* | *GET* /objects/binders/actions/export/{job_id}/results | Retrieve Binder Export Results.|
|*objectsBindersBinderIdActionsExportPost* | *POST* /objects/binders/{binder_id}/actions/export | Export Binder (Latest Version).|
|*objectsBindersBinderIdActionsPost* | *POST* /objects/binders/{binder_id}/actions | Refresh Binder Auto-Filing.|
|*objectsBindersBinderIdBindingRulePut* | *PUT* /objects/binders/{binder_id}/binding_rule | Update Binding Rule.|
|*objectsBindersBinderIdDelete* | *DELETE* /objects/binders/{binder_id} | Delete Binder.|
|*objectsBindersBinderIdDocumentsNodeIdBindingRulePut* | *PUT* /objects/binders/{binder_id}/documents/{node_id}/binding_rule | Update Binder Document Binding Rule.|
|*objectsBindersBinderIdDocumentsPost* | *POST* /objects/binders/{binder_id}/documents | Add Document to Binder.|
|*objectsBindersBinderIdDocumentsSectionIdDelete* | *DELETE* /objects/binders/{binder_id}/documents/{section_id} | Remove Document from Binder.|
|*objectsBindersBinderIdDocumentsSectionIdPut* | *PUT* /objects/binders/{binder_id}/documents/{section_id} | Move Document in Binder.|
|*objectsBindersBinderIdGet* | *GET* /objects/binders/{binder_id} | Retrieve Binder.|
|*objectsBindersBinderIdPost* | *POST* /objects/binders/{binder_id} | Create Binder Version.|
|*objectsBindersBinderIdPut* | *PUT* /objects/binders/{binder_id} | Update Binder.|
|*objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete* | *DELETE* /objects/binders/{binder_id}/roles/{role_name_and_user_or_group}/{id} | Remove Users & Groups from Roles on a Single Binder.|
|*objectsBindersBinderIdSectionsNodeIdBindingRulePut* | *PUT* /objects/binders/{binder_id}/sections/{node_id}/binding_rule | Update Binder Section Binding Rule.|
|*objectsBindersBinderIdSectionsNodeIdPut* | *PUT* /objects/binders/{binder_id}/sections/{node_id} | Update Binder Section.|
|*objectsBindersBinderIdSectionsPost* | *POST* /objects/binders/{binder_id}/sections | Create Binder Section.|
|*objectsBindersBinderIdSectionsSectionIdDelete* | *DELETE* /objects/binders/{binder_id}/sections/{section_id} | Delete Binder Section.|
|*objectsBindersBinderIdSectionsSectionIdGet* | *GET* /objects/binders/{binder_id}/sections/{section_id} | Retrieve Binder Sections.|
|*objectsBindersBinderIdVersionsGet* | *GET* /objects/binders/{binder_id}/versions | Retrieve All Binder Versions.|
|*objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost* | *POST* /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/actions/export | Export Binder (Specific Version).|
|*objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete* | *DELETE* /objects/binders/{binder_id}/versions/{major_version}/{minor_version} | Delete Binder Version.|
|*objectsBindersBinderIdVersionsMajorVersionMinorVersionGet* | *GET* /objects/binders/{binder_id}/versions/{major_version}/{minor_version} | Retrieve Binder Version.|
|*objectsBindersBinderIdVersionsMajorVersionMinorVersionPut* | *PUT* /objects/binders/{binder_id}/versions/{major_version}/{minor_version} | Update Binder Version.|
|*objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost* | *POST* /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships | Create Binder Relationship.|
|*objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete* | *DELETE* /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Delete Binder Relationship.|
|*objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet* | *GET* /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Retrieve Binder Relationship.|
|*objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet* | *GET* /objects/binders/{binder_id}/versions/{major_version}/{minor_version}/sections/{section_id} | Retrieve Binder Version Section.|
|*objectsBindersIdRolesGet* | *GET* /objects/binders/{id}/roles | Retrieve All Binder Roles.|
|*objectsBindersIdRolesPost* | *POST* /objects/binders/{id}/roles | Assign Users & Groups to Roles on a Single Binder.|
|*objectsBindersIdRolesRoleNameGet* | *GET* /objects/binders/{id}/roles/{role_name} | Retrieve Document Role.|
|*objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet* | *GET* /objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions | Retrieve Binder User Actions.|
|*objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet* | *GET* /objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}/entry_requirements | Retrieve Binder Entry Criteria.|
|*objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut* | *PUT* /objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v} | Initiate Binder User Action.|
|*objectsBindersLifecycleActionsPost* | *POST* /objects/binders/lifecycle_actions | Retrieve User Actions on Multiple Binders.|
|*objectsBindersLifecycleActionsUserActionNamePut* | *PUT* /objects/binders/lifecycle_actions/{user_action_name} | Initiate Bulk Binder User Actions.|
|*objectsBindersPost* | *POST* /objects/binders | Create Binder.|
|*objectsBindersTemplatesGet* | *GET* /objects/binders/templates | Retrieve Binder Template Collection.|
|*objectsBindersTemplatesPost* | *POST* /objects/binders/templates | Create Binder Template.|
|*objectsBindersTemplatesPut* | *PUT* /objects/binders/templates | Update Binder Template.|
|*objectsBindersTemplatesTemplateNameBindernodesGet* | *GET* /objects/binders/templates/{template_name}/bindernodes | Retrieve Binder Template Node Attributes.|
|*objectsBindersTemplatesTemplateNameBindernodesPost* | *POST* /objects/binders/templates/{template_name}/bindernodes | Create Binder Template Node.|
|*objectsBindersTemplatesTemplateNameBindernodesPut* | *PUT* /objects/binders/templates/{template_name}/bindernodes | Replace Binder Template Nodes.|
|*objectsBindersTemplatesTemplateNameDelete* | *DELETE* /objects/binders/templates/{template_name} | Delete Binder Template.|
|*objectsBindersTemplatesTemplateNameGet* | *GET* /objects/binders/templates/{template_name} | Retrieve Binder Template Attributes.|
|*objectsDeletionsDocumentsGet* | *GET* /objects/deletions/documents | Retrieve Deleted Document IDs.|
|*objectsDeletionsVobjectsObjectNameGet* | *GET* /objects/deletions/vobjects/{object_name} | Retrieve Deleted Object Record ID.|
|*objectsDocumentsActionsGet* | *GET* /objects/documents/actions | Retrieve All Document Workflows.|
|*objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet* | *GET* /objects/documents/actions/{lifecycle_and_state_and_action}/{job_id}/results | Download Controlled Copy Job Results.|
|*objectsDocumentsActionsWorkflowNameGet* | *GET* /objects/documents/actions/{workflow_name} | Retrieve Document Workflow Details.|
|*objectsDocumentsActionsWorkflowNamePost* | *POST* /objects/documents/actions/{workflow_name} | Initiate Document Workflow.|
|*objectsDocumentsAnnotationsBatchDelete* | *DELETE* /objects/documents/annotations/batch | Delete Annotations.|
|*objectsDocumentsAnnotationsBatchPost* | *POST* /objects/documents/annotations/batch | Create Multiple Annotations.|
|*objectsDocumentsAnnotationsBatchPut* | *PUT* /objects/documents/annotations/batch | Update Annotations.|
|*objectsDocumentsAnnotationsRepliesBatchPost* | *POST* /objects/documents/annotations/replies/batch | Add Annotation Replies.|
|*objectsDocumentsAttachmentsBatchDelete* | *DELETE* /objects/documents/attachments/batch | Delete Multiple Document Attachments.|
|*objectsDocumentsAttachmentsBatchPost* | *POST* /objects/documents/attachments/batch | Create Multiple Document Attachments.|
|*objectsDocumentsAttachmentsBatchPut* | *PUT* /objects/documents/attachments/batch | Update Multiple Document Attachment Descriptions.|
|*objectsDocumentsBatchActionsFileextractJobIdResultsGet* | *GET* /objects/documents/batch/actions/fileextract/{job_id}/results | Retrieve Document Export Results.|
|*objectsDocumentsBatchActionsFileextractPost* | *POST* /objects/documents/batch/actions/fileextract | Export Documents.|
|*objectsDocumentsBatchActionsReclassifyPut* | *PUT* /objects/documents/batch/actions/reclassify | Reclassify Multiple Documents.|
|*objectsDocumentsBatchActionsRerenderPost* | *POST* /objects/documents/batch/actions/rerender | Update Multiple Document Renditions.|
|*objectsDocumentsBatchDelete* | *DELETE* /objects/documents/batch | Delete Multiple Documents.|
|*objectsDocumentsBatchLockDelete* | *DELETE* /objects/documents/batch/lock | Undo Collaborative Authoring Checkout.|
|*objectsDocumentsBatchPost* | *POST* /objects/documents/batch | Create Multiple Documents.|
|*objectsDocumentsBatchPut* | *PUT* /objects/documents/batch | Update Multiple Documents.|
|*objectsDocumentsDocIdAnchorsGet* | *GET* /objects/documents/{doc_id}/anchors | Retrieve Anchor IDs.|
|*objectsDocumentsDocIdAnnotationsFileGet* | *GET* /objects/documents/{doc_id}/annotations/file | Export Document Annotations to PDF.|
|*objectsDocumentsDocIdAnnotationsFilePost* | *POST* /objects/documents/{doc_id}/annotations/file | Import Document Annotations from PDF.|
|*objectsDocumentsDocIdAttachmentsAttachmentIdDelete* | *DELETE* /objects/documents/{doc_id}/attachments/{attachment_id} | Delete Single Document Attachment.|
|*objectsDocumentsDocIdAttachmentsAttachmentIdFileGet* | *GET* /objects/documents/{doc_id}/attachments/{attachment_id}/file | Download Document Attachment.|
|*objectsDocumentsDocIdAttachmentsAttachmentIdGet* | *GET* /objects/documents/{doc_id}/attachments/{attachment_id} | Retrieve Document Attachment Metadata.|
|*objectsDocumentsDocIdAttachmentsAttachmentIdPut* | *PUT* /objects/documents/{doc_id}/attachments/{attachment_id} | Update Document Attachment Description.|
|*objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete* | *DELETE* /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version} | Delete Single Document Attachment Version.|
|*objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet* | *GET* /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}/file | Download Document Attachment Version.|
|*objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet* | *GET* /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version} | Retrieve Document Attachment Version Metadata.|
|*objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost* | *POST* /objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version} | Restore Document Attachment Version.|
|*objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet* | *GET* /objects/documents/{doc_id}/attachments/{attachment_id}/versions | Retrieve Document Attachment Versions.|
|*objectsDocumentsDocIdAttachmentsFileGet* | *GET* /objects/documents/{doc_id}/attachments/file | Download All Document Attachments.|
|*objectsDocumentsDocIdAttachmentsGet* | *GET* /objects/documents/{doc_id}/attachments | Retrieve Document Attachments.|
|*objectsDocumentsDocIdAttachmentsPost* | *POST* /objects/documents/{doc_id}/attachments | Create Document Attachment.|
|*objectsDocumentsDocIdAudittrailGet* | *GET* /objects/documents/{doc_id}/audittrail | Retrieve Complete Audit History for a Single Document.|
|*objectsDocumentsDocIdDelete* | *DELETE* /objects/documents/{doc_id} | Delete Single Document.|
|*objectsDocumentsDocIdEventsGet* | *GET* /objects/documents/{doc_id}/events | Retrieve Document Events.|
|*objectsDocumentsDocIdFileGet* | *GET* /objects/documents/{doc_id}/file | Download Document File.|
|*objectsDocumentsDocIdGet* | *GET* /objects/documents/{doc_id} | Retrieve Document.|
|*objectsDocumentsDocIdLockDelete* | *DELETE* /objects/documents/{doc_id}/lock | Delete Document Lock.|
|*objectsDocumentsDocIdLockGet* | *GET* /objects/documents/{doc_id}/lock | Retrieve Document Lock.|
|*objectsDocumentsDocIdLockPost* | *POST* /objects/documents/{doc_id}/lock | Create Document Lock.|
|*objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet* | *GET* /objects/documents/{doc_id}/{major_version}/{minor_version}/attachments/file | Download All Document Version Attachments.|
|*objectsDocumentsDocIdPost* | *POST* /objects/documents/{doc_id} | Create Single Document Version.|
|*objectsDocumentsDocIdPut* | *PUT* /objects/documents/{doc_id} | Update Single Document.|
|*objectsDocumentsDocIdRenditionsGet* | *GET* /objects/documents/{doc_id}/renditions | Retrieve Document Renditions.|
|*objectsDocumentsDocIdRenditionsRenditionTypeDelete* | *DELETE* /objects/documents/{doc_id}/renditions/{rendition_type} | Delete Single Document Rendition.|
|*objectsDocumentsDocIdRenditionsRenditionTypeGet* | *GET* /objects/documents/{doc_id}/renditions/{rendition_type} | Download Document Rendition File.|
|*objectsDocumentsDocIdRenditionsRenditionTypePost* | *POST* /objects/documents/{doc_id}/renditions/{rendition_type} | Add Single Document Rendition.|
|*objectsDocumentsDocIdRenditionsRenditionTypePut* | *PUT* /objects/documents/{doc_id}/renditions/{rendition_type} | Replace Document Rendition.|
|*objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete* | *DELETE* /objects/documents/{doc_id}/roles/{role_name_and_user_or_group}/{id} | Remove Users & Groups from Roles on a Single Document.|
|*objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet* | *GET* /objects/documents/{doc_id}/version/{major_version}/{minor_version}/attachments | Retrieve Document Version Attachments.|
|*objectsDocumentsDocIdVersionsGet* | *GET* /objects/documents/{doc_id}/versions | Retrieve Document Versions.|
|*objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/{annotation_id} | Read Annotations by ID.|
|*objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/{annotation_id}/replies | Read Replies of Parent Annotation.|
|*objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/file | Export Document Version Annotations to PDF.|
|*objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost* | *POST* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/file | Import Document Version Annotations from PDF.|
|*objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations | Read Annotations by Document Version and Type.|
|*objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/attachments/{attachment_id}/versions/{attachment_version}/file | Download Document Version Attachment Version.|
|*objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/attachments/{attachment_id}/versions/{attachment_version} | Retrieve Document Version Attachment Versions.|
|*objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete* | *DELETE* /objects/documents/{doc_id}/versions/{major_version}/{minor_version} | Delete Single Document Version.|
|*objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/doc-export-annotations-to-csv | Retrieve Document Version Notes as CSV.|
|*objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost* | *POST* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/events | Create Document Event.|
|*objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/export-video-annotations | Retrieve Video Annotations.|
|*objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/file | Download Document Version File.|
|*objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version} | Retrieve Document Version.|
|*objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut* | *PUT* /objects/documents/{doc_id}/versions/{major_version}/{minor_version} | Update Document Version.|
|*objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships | Retrieve Document Relationships.|
|*objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost* | *POST* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships | Create Single Document Relationship.|
|*objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete* | *DELETE* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Delete Single Document Relationship.|
|*objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id} | Retrieve Document Relationship.|
|*objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions | Retrieve Document Version Renditions.|
|*objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete* | *DELETE* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Delete Document Version Rendition.|
|*objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Download Document Version Rendition File.|
|*objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost* | *POST* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Upload Document Version Rendition.|
|*objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut* | *PUT* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type} | Replace Document Version Rendition.|
|*objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet* | *GET* /objects/documents/{doc_id}/versions/{major_version}/{minor_version}/thumbnail | Download Document Version Thumbnail File.|
|*objectsDocumentsGet* | *GET* /objects/documents | Retrieve All Documents.|
|*objectsDocumentsIdRolesGet* | *GET* /objects/documents/{id}/roles | Retrieve All Document Roles.|
|*objectsDocumentsIdRolesPost* | *POST* /objects/documents/{id}/roles | Assign Users & Groups to Roles on a Single Document.|
|*objectsDocumentsIdRolesRoleNameGet* | *GET* /objects/documents/{id}/roles/{role_name} | Retrieve Document Role.|
|*objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet* | *GET* /objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions | Retrieve Document User Actions.|
|*objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet* | *GET* /objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}/entry_requirements | Retrieve Document Entry Criteria.|
|*objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut* | *PUT* /objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v} | Initiate Document User Action.|
|*objectsDocumentsLifecycleActionsPost* | *POST* /objects/documents/lifecycle_actions | Retrieve User Actions on Multiple Documents.|
|*objectsDocumentsLifecycleActionsUserActionNamePut* | *PUT* /objects/documents/lifecycle_actions/{user_action_name} | Initiate Bulk Document User Actions.|
|*objectsDocumentsPost* | *POST* /objects/documents | Create Single Document.|
|*objectsDocumentsRelationshipsBatchDelete* | *DELETE* /objects/documents/relationships/batch | Delete Multiple Document Relationships.|
|*objectsDocumentsRelationshipsBatchPost* | *POST* /objects/documents/relationships/batch | Create Multiple Document Relationships.|
|*objectsDocumentsRenditionsBatchDelete* | *DELETE* /objects/documents/renditions/batch | Delete Multiple Document Renditions.|
|*objectsDocumentsRenditionsBatchPost* | *POST* /objects/documents/renditions/batch | Add Multiple Document Renditions.|
|*objectsDocumentsRolesBatchDelete* | *DELETE* /objects/documents/roles/batch | Remove Users and Groups from Roles on Multiple Documents & Binders.|
|*objectsDocumentsRolesBatchPost* | *POST* /objects/documents/roles/batch | Assign Users & Groups to Roles on Multiple Documents & Binders.|
|*objectsDocumentsTemplatesGet* | *GET* /objects/documents/templates | Retrieve Document Template Collection.|
|*objectsDocumentsTemplatesPost* | *POST* /objects/documents/templates | Create Single Document Template.|
|*objectsDocumentsTemplatesPut* | *PUT* /objects/documents/templates | Update Multiple Document Templates.|
|*objectsDocumentsTemplatesTemplateNameDelete* | *DELETE* /objects/documents/templates/{template_name} | Delete Basic Document Template.|
|*objectsDocumentsTemplatesTemplateNameFileGet* | *GET* /objects/documents/templates/{template_name}/file | Download Document Template File.|
|*objectsDocumentsTemplatesTemplateNameGet* | *GET* /objects/documents/templates/{template_name} | Retrieve Document Template Attributes.|
|*objectsDocumentsTemplatesTemplateNamePut* | *PUT* /objects/documents/templates/{template_name} | Update Single Document Template.|
|*objectsDocumentsTokensPost* | *POST* /objects/documents/tokens | Document Tokens.|
|*objectsDocumentsVersionsBatchActionsFileextractPost* | *POST* /objects/documents/versions/batch/actions/fileextract | Export Document Versions.|
|*objectsDocumentsVersionsBatchDelete* | *DELETE* /objects/documents/versions/batch | Delete Multiple Document Versions.|
|*objectsDocumentsVersionsBatchPost* | *POST* /objects/documents/versions/batch | Create Multiple Document Versions.|
|*objectsDomainGet* | *GET* /objects/domain | Retrieve Domain Information.|
|*objectsDomainsGet* | *GET* /objects/domains | Retrieve Domains.|
|*objectsEdlMatchedDocumentsBatchActionsAddPost* | *POST* /objects/edl_matched_documents/batch/actions/add | Add EDL Matched Documents.|
|*objectsEdlMatchedDocumentsBatchActionsRemovePost* | *POST* /objects/edl_matched_documents/batch/actions/remove | Remove EDL Matched Documents.|
|*objectsGroupsAutoGet* | *GET* /objects/groups/auto | Retrieve Auto Managed Groups.|
|*objectsGroupsGet* | *GET* /objects/groups | Retrieve All Groups.|
|*objectsGroupsGroupIdDelete* | *DELETE* /objects/groups/{group_id} | Delete Group.|
|*objectsGroupsGroupIdGet* | *GET* /objects/groups/{group_id} | Retrieve Group.|
|*objectsGroupsGroupIdPut* | *PUT* /objects/groups/{group_id} | Update Group.|
|*objectsGroupsPost* | *POST* /objects/groups | Create Group .|
|*objectsLicensesGet* | *GET* /objects/licenses | Retrieve Application License Usage.|
|*objectsObjectworkflowsActionsGet* | *GET* /objects/objectworkflows/actions | Retrieve All Multi-Record Workflows.|
|*objectsObjectworkflowsActionsWorkflowNameGet* | *GET* /objects/objectworkflows/actions/{workflow_name} | Retrieve Multi-Record Workflow Details.|
|*objectsObjectworkflowsActionsWorkflowNamePost* | *POST* /objects/objectworkflows/actions/{workflow_name} | Initiate Multi-Record Workflow.|
|*objectsObjectworkflowsGet* | *GET* /objects/objectworkflows | Retrieve Workflows.|
|*objectsObjectworkflowsTasksGet* | *GET* /objects/objectworkflows/tasks | Retrieve Workflow Tasks.|
|*objectsObjectworkflowsTasksTaskIdActionsAcceptPost* | *POST* /objects/objectworkflows/tasks/{task_id}/actions/accept | Accept Single Record Workflow Task.|
|*objectsObjectworkflowsTasksTaskIdActionsCancelPost* | *POST* /objects/objectworkflows/tasks/{task_id}/actions/cancel | Cancel Workflow Task.|
|*objectsObjectworkflowsTasksTaskIdActionsCompletePost* | *POST* /objects/objectworkflows/tasks/{task_id}/actions/complete | Complete Single Record Workflow Task.|
|*objectsObjectworkflowsTasksTaskIdActionsGet* | *GET* /objects/objectworkflows/tasks/{task_id}/actions | Retrieve Workflow Task Actions.|
|*objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost* | *POST* /objects/objectworkflows/tasks/{task_id}/actions/mdwaccept | Accept Multi-item Workflow Task.|
|*objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost* | *POST* /objects/objectworkflows/tasks/{task_id}/actions/mdwcomplete | Complete Multi-item Workflow Task.|
|*objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost* | *POST* /objects/objectworkflows/tasks/{task_id}/actions/mdwmanagecontent | Manage Multi-Item Workflow Content.|
|*objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost* | *POST* /objects/objectworkflows/tasks/{task_id}/actions/mdwreassign | Reassign Multi-item Workflow Task.|
|*objectsObjectworkflowsTasksTaskIdActionsReassignPost* | *POST* /objects/objectworkflows/tasks/{task_id}/actions/reassign | Reassign Single Record Workflow Task.|
|*objectsObjectworkflowsTasksTaskIdActionsTaskActionGet* | *GET* /objects/objectworkflows/tasks/{task_id}/actions/{task_action} | Retrieve Workflow Task Action Details.|
|*objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost* | *POST* /objects/objectworkflows/tasks/{task_id}/actions/undoaccept | Undo Workflow Task Acceptance.|
|*objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost* | *POST* /objects/objectworkflows/tasks/{task_id}/actions/updateduedate | Update Workflow Task Due Date.|
|*objectsObjectworkflowsTasksTaskIdGet* | *GET* /objects/objectworkflows/tasks/{task_id} | Retrieve Workflow Task Details.|
|*objectsObjectworkflowsWorkflowIdActionsGet* | *GET* /objects/objectworkflows/{workflow_id}/actions | Retrieve Workflow Actions.|
|*objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet* | *GET* /objects/objectworkflows/{workflow_id}/actions/{workflow_action} | Retrieve Workflow Action Details.|
|*objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost* | *POST* /objects/objectworkflows/{workflow_id}/actions/{workflow_action} | Initiate Workflow Action.|
|*objectsObjectworkflowsWorkflowIdGet* | *GET* /objects/objectworkflows/{workflow_id} | Retrieve Workflow Details.|
|*objectsPicklistsGet* | *GET* /objects/picklists | Retrieve All Picklists.|
|*objectsPicklistsPicklistNameGet* | *GET* /objects/picklists/{picklist_name} | Retrieve Picklist Values.|
|*objectsPicklistsPicklistNamePicklistValueNameDelete* | *DELETE* /objects/picklists/{picklist_name}/{picklist_value_name} | Inactivate Picklist Value.|
|*objectsPicklistsPicklistNamePicklistValueNamePut* | *PUT* /objects/picklists/{picklist_name}/{picklist_value_name} | Update Picklist Value.|
|*objectsPicklistsPicklistNamePost* | *POST* /objects/picklists/{picklist_name} | Create Picklist Values.|
|*objectsPicklistsPicklistNamePut* | *PUT* /objects/picklists/{picklist_name} | Update Picklist Value Label.|
|*objectsSandboxActionsBuildproductionPost* | *POST* /objects/sandbox/actions/buildproduction | Build Production Vault.|
|*objectsSandboxActionsPromoteproductionPost* | *POST* /objects/sandbox/actions/promoteproduction | Promote to Production.|
|*objectsSandboxActionsRecheckusagePost* | *POST* /objects/sandbox/actions/recheckusage | Recheck Sandbox Usage Limit.|
|*objectsSandboxBatchChangesizePost* | *POST* /objects/sandbox/batch/changesize | Change Sandbox Size.|
|*objectsSandboxEntitlementsSetPost* | *POST* /objects/sandbox/entitlements/set | Set Sandbox Entitlements.|
|*objectsSandboxGet* | *GET* /objects/sandbox | Retrieve Sandboxes.|
|*objectsSandboxNameDelete* | *DELETE* /objects/sandbox/{name} | Delete Sandbox.|
|*objectsSandboxPost* | *POST* /objects/sandbox | Create or Refresh Sandbox.|
|*objectsSandboxSnapshotApiNameActionsUpdatePost* | *POST* /objects/sandbox/snapshot/{api_name}/actions/update | Update Sandbox Snapshot.|
|*objectsSandboxSnapshotApiNameActionsUpgradePost* | *POST* /objects/sandbox/snapshot/{api_name}/actions/upgrade | Upgrade Sandbox Snapshot.|
|*objectsSandboxSnapshotApiNameDelete* | *DELETE* /objects/sandbox/snapshot/{api_name} | Delete Sandbox Snapshot.|
|*objectsSandboxSnapshotGet* | *GET* /objects/sandbox/snapshot | Retrieve Sandbox Snapshots.|
|*objectsSandboxSnapshotPost* | *POST* /objects/sandbox/snapshot | Create Sandbox Snapshot.|
|*objectsSandboxVaultIdActionsRefreshPost* | *POST* /objects/sandbox/{vault_id}/actions/refresh | Refresh Sandbox from Snapshot.|
|*objectsSandboxVaultIdGet* | *GET* /objects/sandbox/{vault_id} | Retrieve Sandbox Details by ID.|
|*objectsSecuritypoliciesGet* | *GET* /objects/securitypolicies | Retrieve All Security Policies.|
|*objectsSecuritypoliciesSecurityPolicyNameGet* | *GET* /objects/securitypolicies/{security_policy_name} | Retrieve Security Policy.|
|*objectsUsersGet* | *GET* /objects/users/ | Retrieve All Users.|
|*objectsUsersIdGet* | *GET* /objects/users/{id} | Retrieve User.|
|*objectsUsersIdPermissionsGet* | *GET* /objects/users/{id}/permissions | Retrieve User Permissions.|
|*objectsUsersIdPut* | *PUT* /objects/users/{id} | Update Single User.|
|*objectsUsersMeGet* | *GET* /objects/users/me | Validate Session User.|
|*objectsUsersMePasswordPost* | *POST* /objects/users/me/password | Change My Password.|
|*objectsUsersMePermissionsGet* | *GET* /objects/users/me/permissions | Retrieve My User Permissions.|
|*objectsUsersMePut* | *PUT* /objects/users/me | Update My User.|
|*objectsUsersPost* | *POST* /objects/users | Create Single User.|
|*objectsUsersPut* | *PUT* /objects/users | Update Multiple Users.|
|*objectsUsersUserIdDelete* | *DELETE* /objects/users/{user_id} | Disable User.|
|*objectsUsersUserIdVaultMembershipVaultIdPut* | *PUT* /objects/users/{user_id}/vault_membership/{vault_id} | Update Vault Membership.|
|*objectsVaultActionsComparePost* | *POST* /objects/vault/actions/compare | Vault Compare.|
|*objectsVaultActionsConfigreportPost* | *POST* /objects/vault/actions/configreport | Vault Configuration Report.|
|*queryComponentsPost* | *POST* /query/components | Component Definition Query.|
|*queryNextPagePost* | *POST* /query/{next_page} | Next Page URL.|
|*queryPost* | *POST* /query | Submitting a Query.|
|*queryPreviousPagePost* | *POST* /query/{previous_page} | Previous Page URL.|
|*scimV2MeGet* | *GET* /scim/v2/Me | Retrieve Current User with SCIM.|
|*scimV2MePut* | *PUT* /scim/v2/Me | Update Current User with SCIM.|
|*scimV2ResourceTypesGet* | *GET* /scim/v2/ResourceTypes | Retrieve All SCIM Resource Types.|
|*scimV2ResourceTypesTypeGet* | *GET* /scim/v2/ResourceTypes/{type} | Retrieve Single SCIM Resource Type.|
|*scimV2SchemasGet* | *GET* /scim/v2/Schemas | Retrieve All SCIM Schema Information.|
|*scimV2SchemasIdGet* | *GET* /scim/v2/Schemas/{id} | Retrieve Single SCIM Schema Information.|
|*scimV2ServiceProviderConfigGet* | *GET* /scim/v2/ServiceProviderConfig | Retrieve SCIM Provider.|
|*scimV2TypeGet* | *GET* /scim/v2/{type} | Retrieve SCIM Resources.|
|*scimV2TypeIdGet* | *GET* /scim/v2/{type}/{id} | Retrieve Single SCIM Resource.|
|*scimV2UsersGet* | *GET* /scim/v2/Users | Retrieve All Users with SCIM.|
|*scimV2UsersIdGet* | *GET* /scim/v2/Users/{id} | Retrieve Single User with SCIM.|
|*scimV2UsersIdPut* | *PUT* /scim/v2/Users/{id} | Update User with SCIM.|
|*scimV2UsersPost* | *POST* /scim/v2/Users | Create User with SCIM.|
|*servicesCertificateCertIdGet* | *GET* /services/certificate/{cert_id} | Retrieve Signing Certificate.|
|*servicesConfigurationModeActionsDisablePost* | *POST* /services/configuration_mode/actions/disable | Disable Configuration Mode.|
|*servicesConfigurationModeActionsEnablePost* | *POST* /services/configuration_mode/actions/enable | Enable Configuration Mode.|
|*servicesDirectdataFilesGet* | *GET* /services/directdata/files | Retrieve Available Direct Data Files.|
|*servicesDirectdataFilesNameGet* | *GET* /services/directdata/files/{name} | Download Direct Data File.|
|*servicesFileStagingItemsContentItemGet* | *GET* /services/file_staging/items/content/{item} | Download Item Content.|
|*servicesFileStagingItemsItemDelete* | *DELETE* /services/file_staging/items/{item} | Delete File or Folder.|
|*servicesFileStagingItemsItemGet* | *GET* /services/file_staging/items/{item} | List Items at a Path.|
|*servicesFileStagingItemsItemPut* | *PUT* /services/file_staging/items/{item} | Update Folder or File.|
|*servicesFileStagingItemsPost* | *POST* /services/file_staging/items | Create Folder or File.|
|*servicesFileStagingUploadGet* | *GET* /services/file_staging/upload/ | List Upload Sessions.|
|*servicesFileStagingUploadPost* | *POST* /services/file_staging/upload | Create Resumable Upload Session.|
|*servicesFileStagingUploadUploadSessionIdDelete* | *DELETE* /services/file_staging/upload/{upload_session_id} | Abort Upload Session.|
|*servicesFileStagingUploadUploadSessionIdGet* | *GET* /services/file_staging/upload/{upload_session_id} | Get Upload Session Details.|
|*servicesFileStagingUploadUploadSessionIdPartsGet* | *GET* /services/file_staging/upload/{upload_session_id}/parts | List File Parts Uploaded to Session.|
|*servicesFileStagingUploadUploadSessionIdPost* | *POST* /services/file_staging/upload/{upload_session_id} | Commit Upload Session.|
|*servicesFileStagingUploadUploadSessionIdPut* | *PUT* /services/file_staging/upload/{upload_session_id} | Upload to a Session.|
|*servicesJobsHistoriesGet* | *GET* /services/jobs/histories | Retrieve Job Histories.|
|*servicesJobsJobIdErrorsGet* | *GET* /services/jobs/{job_id}/errors | Retrieve Import Bulk Translation File Job Errors.|
|*servicesJobsJobIdGet* | *GET* /services/jobs/{job_id} | Retrieve Job Status.|
|*servicesJobsJobIdSummaryGet* | *GET* /services/jobs/{job_id}/summary | Retrieve Import Bulk Translation File Job Summary.|
|*servicesJobsJobIdTasksGet* | *GET* /services/jobs/{job_id}/tasks | Retrieve SDK Job Tasks.|
|*servicesJobsMonitorsGet* | *GET* /services/jobs/monitors | Retrieve Job Monitors.|
|*servicesJobsStartNowJobIdPost* | *POST* /services/jobs/start_now/{job_id} | Start Job.|
|*servicesLoaderExtractPost* | *POST* /services/loader/extract | Extract Data Files.|
|*servicesLoaderJobIdTasksTaskIdFailurelogGet* | *GET* /services/loader/{job_id}/tasks/{task_id}/failurelog | Retrieve Load Failure Log Results.|
|*servicesLoaderJobIdTasksTaskIdResultsGet* | *GET* /services/loader/{job_id}/tasks/{task_id}/results | Retrieve Loader Extract Results.|
|*servicesLoaderJobIdTasksTaskIdResultsRenditionsGet* | *GET* /services/loader/{job_id}/tasks/{task_id}/results/renditions | Retrieve Loader Extract Renditions Results.|
|*servicesLoaderJobIdTasksTaskIdSuccesslogGet* | *GET* /services/loader/{job_id}/tasks/{task_id}/successlog | Retrieve Load Success Log Results.|
|*servicesLoaderLoadPost* | *POST* /services/loader/load | Load Data Objects.|
|*servicesPackageActionsValidatePost* | *POST* /services/package/actions/validate | Validate Package.|
|*servicesPackagePost* | *POST* /services/package | Export Package.|
|*servicesPackagePut* | *PUT* /services/package | Import Package.|
|*servicesQueuesGet* | *GET* /services/queues | Retrieve All Queues.|
|*servicesQueuesQueueNameActionsDisableDeliveryPut* | *PUT* /services/queues/{queue_name}/actions/disable_delivery | Disable Delivery.|
|*servicesQueuesQueueNameActionsEnableDeliveryPut* | *PUT* /services/queues/{queue_name}/actions/enable_delivery | Enable Delivery.|
|*servicesQueuesQueueNameActionsResetPut* | *PUT* /services/queues/{queue_name}/actions/reset | Reset Queue.|
|*servicesQueuesQueueNameGet* | *GET* /services/queues/{queue_name} | Retrieve Queue Status.|
|*servicesVobjectVaultPackageVPackageIdActionsValidatePost* | *POST* /services/vobject/vault_package__v/{package_id}/actions/validate | Validate Imported Package.|
|*sessionDelete* | *DELETE* /session | End Session.|
|*uicodeDistributionsDistributionNameCodeGet* | *GET* /uicode/distributions/{distribution_name}/code | Download Single Client Code Distribution.|
|*uicodeDistributionsDistributionNameDelete* | *DELETE* /uicode/distributions/{distribution_name} | Delete Single Client Code Distribution.|
|*uicodeDistributionsDistributionNameGet* | *GET* /uicode/distributions/{distribution_name} | Retrieve Single Client Code Distribution Metadata.|
|*uicodeDistributionsGet* | *GET* /uicode/distributions | Retrieve All Client Code Distribution Metadata.|
|*uicodeDistributionsPost* | *POST* /uicode/distributions | Add or Replace Single Client Code Distribution.|
|*vobjectVaultPackageVPackageIdActionsDeployPost* | *POST* /vobject/vault_package__v/{package_id}/actions/deploy | Deploy Package.|
|*vobjectVaultPackageVPackageIdActionsDeployResultsGet* | *GET* /vobject/vault_package__v/{package_id}/actions/deploy/results | Retrieve Package Deploy Results.|
|*vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet* | *GET* /vobjects/cascadedelete/results/{object_name}/{job_status}/{job_id} | Retrieve Results of Cascade Delete Job.|
|*vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet* | *GET* /vobjects/deepcopy/results/{object_name}/{job_status}/{job_id} | Retrieve Results of Deep Copy Job.|
|*vobjectsEdlItemVActionsCreateplaceholderPost* | *POST* /vobjects/edl_item__v/actions/createplaceholder | Create a Placeholder from an EDL Item.|
|*vobjectsMergesJobIdLogGet* | *GET* /vobjects/merges/{job_id}/log | Download Merge Records Job Log.|
|*vobjectsMergesJobIdResultsGet* | *GET* /vobjects/merges/{job_id}/results | Retrieve Record Merge Results.|
|*vobjectsMergesJobIdStatusGet* | *GET* /vobjects/merges/{job_id}/status | Retrieve Record Merge Status.|
|*vobjectsObjectNameActionsActionNamePost* | *POST* /vobjects/{object_name}/actions/{action_name} | Initiate Object Action on Multiple Records.|
|*vobjectsObjectNameActionsChangetypePost* | *POST* /vobjects/{object_name}/actions/changetype | Change Object Type.|
|*vobjectsObjectNameActionsMergePost* | *POST* /vobjects/{object_name}/actions/merge | Initiate Record Merge.|
|*vobjectsObjectNameActionsRecalculaterollupsGet* | *GET* /vobjects/{object_name}/actions/recalculaterollups | Retrieve Roll-up Field Recalculation Status.|
|*vobjectsObjectNameActionsRecalculaterollupsPost* | *POST* /vobjects/{object_name}/actions/recalculaterollups | Recalculate Roll-up Fields.|
|*vobjectsObjectNameActionsUpdatecorporatecurrencyPut* | *PUT* /vobjects/{object_name}/actions/updatecorporatecurrency | Update Corporate Currency Fields.|
|*vobjectsObjectNameAttachmentsBatchDelete* | *DELETE* /vobjects/{object_name}/attachments/batch | Delete Multiple Object Record Attachments.|
|*vobjectsObjectNameAttachmentsBatchPost* | *POST* /vobjects/{object_name}/attachments/batch | Create Multiple Object Record Attachments.|
|*vobjectsObjectNameAttachmentsBatchPut* | *PUT* /vobjects/{object_name}/attachments/batch | Update Multiple Object Record Attachment Descriptions.|
|*vobjectsObjectNameDelete* | *DELETE* /vobjects/{object_name} | Delete Object Records.|
|*vobjectsObjectNameIdRolesRoleNameGet* | *GET* /vobjects/{object_name}/{id}/roles/{role_name} | Retrieve Object Record Roles.|
|*vobjectsObjectNameObjectRecordIdActionsActionNameGet* | *GET* /vobjects/{object_name}/{object_record_id}/actions/{action_name} | Retrieve Object User Actions Details.|
|*vobjectsObjectNameObjectRecordIdActionsActionNamePost* | *POST* /vobjects/{object_name}/{object_record_id}/actions/{action_name} | Initiate Object Action on a Single Record.|
|*vobjectsObjectNameObjectRecordIdActionsCascadedeletePost* | *POST* /vobjects/{object_name}/{object_record_id}/actions/cascadedelete | Cascade Delete Object Record.|
|*vobjectsObjectNameObjectRecordIdActionsDeepcopyPost* | *POST* /vobjects/{object_name}/{object_record_id}/actions/deepcopy | Deep Copy Object Record.|
|*vobjectsObjectNameObjectRecordIdActionsGet* | *GET* /vobjects/{object_name}/{object_record_id}/actions | Retrieve Object Record User Actions.|
|*vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet* | *GET* /vobjects/{object_name}/{object_record_id}/attachment_fields/{attachment_field_name}/file | Download Attachment Field File.|
|*vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost* | *POST* /vobjects/{object_name}/{object_record_id}/attachment_fields/{attachment_field_name}/file | Update Attachment Field File.|
|*vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet* | *GET* /vobjects/{object_name}/{object_record_id}/attachment_fields/file | Download All Attachment Field Files.|
|*vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete* | *DELETE* /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id} | Delete Object Record Attachment.|
|*vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet* | *GET* /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id} | Retrieve Object Record Attachment Metadata.|
|*vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut* | *PUT* /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id} | Update Object Record Attachment Description.|
|*vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete* | *DELETE* /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version} | Delete Object Record Attachment Version.|
|*vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet* | *GET* /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}/file | Download Object Record Attachment File.|
|*vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet* | *GET* /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version} | Retrieve Object Record Attachment Version Metadata.|
|*vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost* | *POST* /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version} | Restore Object Record Attachment Version.|
|*vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet* | *GET* /vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions | Retrieve Object Record Attachment Versions.|
|*vobjectsObjectNameObjectRecordIdAttachmentsFileGet* | *GET* /vobjects/{object_name}/{object_record_id}/attachments/file | Download All Object Record Attachment Files.|
|*vobjectsObjectNameObjectRecordIdAttachmentsGet* | *GET* /vobjects/{object_name}/{object_record_id}/attachments | Retrieve Object Record Attachments.|
|*vobjectsObjectNameObjectRecordIdAttachmentsPost* | *POST* /vobjects/{object_name}/{object_record_id}/attachments | Create Object Record Attachment.|
|*vobjectsObjectNameObjectRecordIdAudittrailGet* | *GET* /vobjects/{object_name}/{object_record_id}/audittrail | Retrieve Complete Audit History for a Single Object Record.|
|*vobjectsObjectNameObjectRecordIdGet* | *GET* /vobjects/{object_name}/{object_record_id} | Retrieve Object Record.|
|*vobjectsObjectNamePost* | *POST* /vobjects/{object_name} | Create & Upsert Object Records.|
|*vobjectsObjectNamePut* | *PUT* /vobjects/{object_name} | Update Object Records.|
|*vobjectsObjectNameRolesDelete* | *DELETE* /vobjects/{object_name}/roles | Remove Users & Groups from Roles on Object Records.|
|*vobjectsObjectNameRolesPost* | *POST* /vobjects/{object_name}/roles | Assign Users & Groups to Roles on Object Records.|
|*vobjectsOutboundPackageVPackageIdDependenciesGet* | *GET* /vobjects/outbound_package__v/{package_id}/dependencies | Retrieve Outbound Package Dependencies.|


## What are the Model files for the data structures/objects?
|Class | Description|
|------------- | -------------|
|*_vobjects__object_name__actions_merge_post_request_inner* | |

