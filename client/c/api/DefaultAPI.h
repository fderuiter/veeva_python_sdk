#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/_vobjects__object_name__actions_merge_post_request_inner.h"


// Retrieve API Versions
//
void
DefaultAPI_apiGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Content File
//
void
DefaultAPI_apiMdlComponentsComponentTypeAndRecordNameFilesGet(apiClient_t *apiClient, char *component_type_and_record_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Component Record (MDL)
//
void
DefaultAPI_apiMdlComponentsComponentTypeAndRecordNameGet(apiClient_t *apiClient, char *component_type_and_record_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Asynchronous MDL Script Results
//
void
DefaultAPI_apiMdlExecuteAsyncJobIdResultsGet(apiClient_t *apiClient, char *job_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Execute MDL Script Asynchronously
//
void
DefaultAPI_apiMdlExecuteAsyncPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Execute MDL Script
//
void
DefaultAPI_apiMdlExecutePost(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Upload Content File
//
void
DefaultAPI_apiMdlFilesPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Retrieve Audit Details
//
void
DefaultAPI_audittrailAuditTrailTypeGet(apiClient_t *apiClient, char *audit_trail_type, char *start_date, char *end_date, char *all_dates, char *format_result, char *limit, char *offset, char *objects, char *events, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Authentication Type Discovery
//
void
DefaultAPI_authDiscoveryPost(apiClient_t *apiClient, char *Accept, char *X_VaultAPI_ClientID);


// OAuth 2.0 / OpenID Connect
//
void
DefaultAPI_authOauthSessionOathOidcProfileIdPost(apiClient_t *apiClient, char *oath_oidc_profile_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// User Name and Password
//
void
DefaultAPI_authPost(apiClient_t *apiClient, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Delete Single Source Code File
//
void
DefaultAPI_codeClassNameDelete(apiClient_t *apiClient, char *class_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Disable Vault Extension
//
void
DefaultAPI_codeClassNameDisablePut(apiClient_t *apiClient, char *class_name, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Enable Vault Extension
//
void
DefaultAPI_codeClassNameEnablePut(apiClient_t *apiClient, char *class_name, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Retrieve Single Source Code File
//
void
DefaultAPI_codeClassNameGet(apiClient_t *apiClient, char *class_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve All Profiling Sessions
//
void
DefaultAPI_codeProfilerGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Create Profiling Session
//
void
DefaultAPI_codeProfilerPost(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// End Profiling Session
//
void
DefaultAPI_codeProfilerSessionNameActionsEndPost(apiClient_t *apiClient, char *session_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Delete Profiling Session
//
void
DefaultAPI_codeProfilerSessionNameDelete(apiClient_t *apiClient, char *session_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Profiling Session
//
void
DefaultAPI_codeProfilerSessionNameGet(apiClient_t *apiClient, char *session_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Download Profiling Session Results
//
void
DefaultAPI_codeProfilerSessionNameResultsGet(apiClient_t *apiClient, char *session_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Add or Replace Single Source Code File
//
void
DefaultAPI_codePut(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Retrieve Specific Root Nodes
//
void
DefaultAPI_compositesTreesEdlHierarchyOrTemplateActionsListnodesPost(apiClient_t *apiClient, char *edl_hierarchy_or_template, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve All Root Nodes
//
void
DefaultAPI_compositesTreesEdlHierarchyOrTemplateGet(apiClient_t *apiClient, char *edl_hierarchy_or_template, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve a Node's Children
//
void
DefaultAPI_compositesTreesEdlHierarchyVParentNodeIdChildrenGet(apiClient_t *apiClient, char *parent_node_id, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Update Node Order
//
void
DefaultAPI_compositesTreesEdlHierarchyVParentNodeIdChildrenPut(apiClient_t *apiClient, char *parent_node_id, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Component Record (XML/JSON)
//
void
DefaultAPI_configurationComponentTypeAndRecordNameGet(apiClient_t *apiClient, char *component_type_and_record_name, char *loc, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Component Record Collection
//
void
DefaultAPI_configurationComponentTypeGet(apiClient_t *apiClient, char *component_type, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Details from a Specific Object
//
void
DefaultAPI_configurationObjectNameAndObjectTypeGet(apiClient_t *apiClient, char *object_name_and_object_type, char *loc, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Details from All Object Types
//
void
DefaultAPI_configurationObjecttypeGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Delete Lifecycle Role Assignment Override Rules
//
void
DefaultAPI_configurationRoleAssignmentRuleDelete(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Lifecycle Role Assignment Rules (Default & Override)
//
void
DefaultAPI_configurationRoleAssignmentRuleGet(apiClient_t *apiClient, char *lifecycle__v, char *role__v, char *product__v, char *country__v, char *study__v, char *study_country__v, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Create Lifecycle Role Assignment Override Rules
//
void
DefaultAPI_configurationRoleAssignmentRulePost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Update Lifecycle Role Assignment Rules (Default & Override)
//
void
DefaultAPI_configurationRoleAssignmentRulePut(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Initiate Delegated Session
//
void
DefaultAPI_delegationLoginPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Delegations
//
void
DefaultAPI_delegationVaultsGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Session Keep Alive
//
void
DefaultAPI_keepAlivePost(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Limits on Objects
//
void
DefaultAPI_limitsGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Download Daily API Usage
//
void
DefaultAPI_logsApiUsageGet(apiClient_t *apiClient, char *date, char *log_format, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve All Debug Logs
//
void
DefaultAPI_logsCodeDebugGet(apiClient_t *apiClient, char *user_id, int *include_inactive, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Delete Debug Log
//
void
DefaultAPI_logsCodeDebugIdActionsResetDelete(apiClient_t *apiClient, char *id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Reset Debug Log
//
void
DefaultAPI_logsCodeDebugIdActionsResetPost(apiClient_t *apiClient, char *id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Download Debug Log Files
//
void
DefaultAPI_logsCodeDebugIdFilesGet(apiClient_t *apiClient, char *id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Single Debug Log
//
void
DefaultAPI_logsCodeDebugIdGet(apiClient_t *apiClient, char *id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Create Debug Log
//
void
DefaultAPI_logsCodeDebugPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Download SDK Runtime Log
//
void
DefaultAPI_logsCodeRuntimeGet(apiClient_t *apiClient, char *date, char *log_format, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Import Bulk Translation File
//
void
DefaultAPI_messagesMessageTypeActionsImportPost(apiClient_t *apiClient, char *message_type, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Export Bulk Translation File
//
void
DefaultAPI_messagesMessageTypeLanguageLangActionsExportPost(apiClient_t *apiClient, char *message_type, char *lang, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Audit Metadata
//
void
DefaultAPI_metadataAudittrailAuditTrailTypeGet(apiClient_t *apiClient, char *audit_trail_type, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Audit Types
//
void
DefaultAPI_metadataAudittrailGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Component Type Metadata
//
void
DefaultAPI_metadataComponentsComponentTypeGet(apiClient_t *apiClient, char *component_type, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve All Component Metadata
//
void
DefaultAPI_metadataComponentsGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Binder Template Node Metadata
//
void
DefaultAPI_metadataObjectsBindersTemplatesBindernodesGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Binder Template Metadata
//
void
DefaultAPI_metadataObjectsBindersTemplatesGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Annotation Placemark Type Metadata
//
void
DefaultAPI_metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet(apiClient_t *apiClient, char *placemark_type, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Annotation Reference Type Metadata
//
void
DefaultAPI_metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet(apiClient_t *apiClient, char *reference_type, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Annotation Type Metadata
//
void
DefaultAPI_metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet(apiClient_t *apiClient, char *annotation_type, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Document Event SubType Metadata
//
void
DefaultAPI_metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet(apiClient_t *apiClient, char *event_type, char *event_subtype, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Document Event Types and Subtypes
//
void
DefaultAPI_metadataObjectsDocumentsEventsGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Document Lock Metadata
//
void
DefaultAPI_metadataObjectsDocumentsLockGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Common Document Fields
//
void
DefaultAPI_metadataObjectsDocumentsPropertiesFindCommonPost(apiClient_t *apiClient, char *Content_Type, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);


// Retrieve All Document Fields
//
void
DefaultAPI_metadataObjectsDocumentsPropertiesGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Document Template Metadata
//
void
DefaultAPI_metadataObjectsDocumentsTemplatesGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve All Document Types
//
void
DefaultAPI_metadataObjectsDocumentsTypesGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Document Type
//
void
DefaultAPI_metadataObjectsDocumentsTypesTypeGet(apiClient_t *apiClient, char *type, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Document Type Relationships
//
void
DefaultAPI_metadataObjectsDocumentsTypesTypeRelationshipsGet(apiClient_t *apiClient, char *type, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Document Classification
//
void
DefaultAPI_metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet(apiClient_t *apiClient, char *type, char *subtype, char *classification, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Document Subtype
//
void
DefaultAPI_metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet(apiClient_t *apiClient, char *type, char *subtype, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Group Metadata
//
void
DefaultAPI_metadataObjectsGroupsGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Security Policy Metadata
//
void
DefaultAPI_metadataObjectsSecuritypoliciesGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve User Metadata
//
void
DefaultAPI_metadataObjectsUsersGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Archived Document Signature Metadata
//
void
DefaultAPI_metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Document Signature Metadata
//
void
DefaultAPI_metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Object Collection
//
void
DefaultAPI_metadataVobjectsGet(apiClient_t *apiClient, int *loc, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Cancel Raw Object Deployment
//
void
DefaultAPI_metadataVobjectsObjectNameActionsCanceldeploymentPost(apiClient_t *apiClient, char *object_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Object Field Metadata
//
void
DefaultAPI_metadataVobjectsObjectNameFieldsObjectFieldNameGet(apiClient_t *apiClient, char *object_name, char *object_field_name, int *loc, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Object Metadata
//
void
DefaultAPI_metadataVobjectsObjectNameGet(apiClient_t *apiClient, char *object_name, int *loc, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Page Layouts
//
void
DefaultAPI_metadataVobjectsObjectNamePageLayoutsGet(apiClient_t *apiClient, char *object_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Page Layout Metadata
//
void
DefaultAPI_metadataVobjectsObjectNamePageLayoutsLayoutNameGet(apiClient_t *apiClient, char *object_name, char *layout_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Email Notification Histories
//
void
DefaultAPI_notificationsHistoriesGet(apiClient_t *apiClient, char *start_date, char *end_date, int *all_dates, char *format_result, char *limit, char *offset, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Bulk Workflow Action Details
//
void
DefaultAPI_objectWorkflowActionsActionGet(apiClient_t *apiClient, char *action, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Initiate Workflow Actions on Multiple Workflows
//
void
DefaultAPI_objectWorkflowActionsActionPost(apiClient_t *apiClient, char *action, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Cancel Workflow Tasks
//
void
DefaultAPI_objectWorkflowActionsCanceltasksPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Cancel Workflows
//
void
DefaultAPI_objectWorkflowActionsCancelworkflowsPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Retrieve Bulk Workflow Actions
//
void
DefaultAPI_objectWorkflowActionsGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Reassign Workflow Tasks
//
void
DefaultAPI_objectWorkflowActionsReassigntasksPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Replace Workflow Owner
//
void
DefaultAPI_objectWorkflowActionsReplaceworkflowownerPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Retrieve Binder Export Results
//
void
DefaultAPI_objectsBindersActionsExportJobIdResultsGet(apiClient_t *apiClient, char *job_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Export Binder (Latest Version)
//
void
DefaultAPI_objectsBindersBinderIdActionsExportPost(apiClient_t *apiClient, char *binder_id, int *source, char *renditiontype, char *docversion, char *attachments, char *_export, int *docfield, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Refresh Binder Auto-Filing
//
void
DefaultAPI_objectsBindersBinderIdActionsPost(apiClient_t *apiClient, char *binder_id, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Update Binding Rule
//
void
DefaultAPI_objectsBindersBinderIdBindingRulePut(apiClient_t *apiClient, char *binder_id, char *Content_Type, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);


// Delete Binder
//
void
DefaultAPI_objectsBindersBinderIdDelete(apiClient_t *apiClient, char *binder_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Update Binder Document Binding Rule
//
void
DefaultAPI_objectsBindersBinderIdDocumentsNodeIdBindingRulePut(apiClient_t *apiClient, char *binder_id, char *node_id, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Add Document to Binder
//
void
DefaultAPI_objectsBindersBinderIdDocumentsPost(apiClient_t *apiClient, char *binder_id, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Remove Document from Binder
//
void
DefaultAPI_objectsBindersBinderIdDocumentsSectionIdDelete(apiClient_t *apiClient, char *binder_id, char *section_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Move Document in Binder
//
void
DefaultAPI_objectsBindersBinderIdDocumentsSectionIdPut(apiClient_t *apiClient, char *binder_id, char *section_id, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Binder
//
void
DefaultAPI_objectsBindersBinderIdGet(apiClient_t *apiClient, char *binder_id, char *depth, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Create Binder Version
//
void
DefaultAPI_objectsBindersBinderIdPost(apiClient_t *apiClient, char *binder_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Update Binder
//
void
DefaultAPI_objectsBindersBinderIdPut(apiClient_t *apiClient, char *binder_id, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Remove Users & Groups from Roles on a Single Binder
//
void
DefaultAPI_objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete(apiClient_t *apiClient, char *binder_id, char *role_name_and_user_or_group, char *id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Update Binder Section Binding Rule
//
void
DefaultAPI_objectsBindersBinderIdSectionsNodeIdBindingRulePut(apiClient_t *apiClient, char *binder_id, char *node_id, char *Content_Type, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);


// Update Binder Section
//
void
DefaultAPI_objectsBindersBinderIdSectionsNodeIdPut(apiClient_t *apiClient, char *binder_id, char *node_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Create Binder Section
//
void
DefaultAPI_objectsBindersBinderIdSectionsPost(apiClient_t *apiClient, char *binder_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Delete Binder Section
//
void
DefaultAPI_objectsBindersBinderIdSectionsSectionIdDelete(apiClient_t *apiClient, char *binder_id, char *section_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Retrieve Binder Sections
//
void
DefaultAPI_objectsBindersBinderIdSectionsSectionIdGet(apiClient_t *apiClient, char *binder_id, char *section_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve All Binder Versions
//
void
DefaultAPI_objectsBindersBinderIdVersionsGet(apiClient_t *apiClient, char *binder_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Export Binder (Specific Version)
//
void
DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost(apiClient_t *apiClient, char *binder_id, char *major_version, char *minor_version, int *source, char *renditiontype, char *docversion, char *attachments, char *_export, int *docfield, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Delete Binder Version
//
void
DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete(apiClient_t *apiClient, char *binder_id, char *major_version, char *minor_version, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Binder Version
//
void
DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionGet(apiClient_t *apiClient, char *binder_id, char *major_version, char *minor_version, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Update Binder Version
//
void
DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionPut(apiClient_t *apiClient, char *binder_id, char *major_version, char *minor_version, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Create Binder Relationship
//
void
DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost(apiClient_t *apiClient, char *binder_id, char *major_version, char *minor_version, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Delete Binder Relationship
//
void
DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete(apiClient_t *apiClient, char *binder_id, char *major_version, char *minor_version, char *relationship_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Binder Relationship
//
void
DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet(apiClient_t *apiClient, char *binder_id, char *major_version, char *minor_version, char *relationship_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Binder Version Section
//
void
DefaultAPI_objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet(apiClient_t *apiClient, char *binder_id, char *major_version, char *minor_version, char *section_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve All Binder Roles
//
void
DefaultAPI_objectsBindersIdRolesGet(apiClient_t *apiClient, char *id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Assign Users & Groups to Roles on a Single Binder
//
void
DefaultAPI_objectsBindersIdRolesPost(apiClient_t *apiClient, char *id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Retrieve Document Role
//
void
DefaultAPI_objectsBindersIdRolesRoleNameGet(apiClient_t *apiClient, char *id, char *role_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Binder User Actions
//
void
DefaultAPI_objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet(apiClient_t *apiClient, char *id, char *major_version, char *minor_version, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Binder Entry Criteria
//
void
DefaultAPI_objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet(apiClient_t *apiClient, char *id, char *major_version, char *minor_version, char *name__v, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Initiate Binder User Action
//
void
DefaultAPI_objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut(apiClient_t *apiClient, char *id, char *major_version, char *minor_version, char *name__v, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve User Actions on Multiple Binders
//
void
DefaultAPI_objectsBindersLifecycleActionsPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Initiate Bulk Binder User Actions
//
void
DefaultAPI_objectsBindersLifecycleActionsUserActionNamePut(apiClient_t *apiClient, char *user_action_name, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Create Binder
//
void
DefaultAPI_objectsBindersPost(apiClient_t *apiClient, int *async, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Binder Template Collection
//
void
DefaultAPI_objectsBindersTemplatesGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Create Binder Template
//
void
DefaultAPI_objectsBindersTemplatesPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Update Binder Template
//
void
DefaultAPI_objectsBindersTemplatesPut(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Retrieve Binder Template Node Attributes
//
void
DefaultAPI_objectsBindersTemplatesTemplateNameBindernodesGet(apiClient_t *apiClient, char *template_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Create Binder Template Node
//
void
DefaultAPI_objectsBindersTemplatesTemplateNameBindernodesPost(apiClient_t *apiClient, char *template_name, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Replace Binder Template Nodes
//
void
DefaultAPI_objectsBindersTemplatesTemplateNameBindernodesPut(apiClient_t *apiClient, char *template_name, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Delete Binder Template
//
void
DefaultAPI_objectsBindersTemplatesTemplateNameDelete(apiClient_t *apiClient, char *template_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Binder Template Attributes
//
void
DefaultAPI_objectsBindersTemplatesTemplateNameGet(apiClient_t *apiClient, char *template_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Deleted Document IDs
//
void
DefaultAPI_objectsDeletionsDocumentsGet(apiClient_t *apiClient, char *start_date, char *end_date, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Deleted Object Record ID
//
void
DefaultAPI_objectsDeletionsVobjectsObjectNameGet(apiClient_t *apiClient, char *object_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve All Document Workflows
//
void
DefaultAPI_objectsDocumentsActionsGet(apiClient_t *apiClient, int *loc, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Download Controlled Copy Job Results
//
void
DefaultAPI_objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet(apiClient_t *apiClient, char *lifecycle_and_state_and_action, char *job_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Document Workflow Details
//
void
DefaultAPI_objectsDocumentsActionsWorkflowNameGet(apiClient_t *apiClient, char *workflow_name, int *loc, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Initiate Document Workflow
//
void
DefaultAPI_objectsDocumentsActionsWorkflowNamePost(apiClient_t *apiClient, char *workflow_name, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Delete Annotations
//
void
DefaultAPI_objectsDocumentsAnnotationsBatchDelete(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Create Multiple Annotations
//
void
DefaultAPI_objectsDocumentsAnnotationsBatchPost(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Update Annotations
//
void
DefaultAPI_objectsDocumentsAnnotationsBatchPut(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Add Annotation Replies
//
void
DefaultAPI_objectsDocumentsAnnotationsRepliesBatchPost(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Delete Multiple Document Attachments
//
void
DefaultAPI_objectsDocumentsAttachmentsBatchDelete(apiClient_t *apiClient, char *Accept, char *Authorization, char *Content_Type, char *X_VaultAPI_ClientID);


// Create Multiple Document Attachments
//
void
DefaultAPI_objectsDocumentsAttachmentsBatchPost(apiClient_t *apiClient, char *Accept, char *Authorization, char *Content_Type, char *X_VaultAPI_ClientID);


// Update Multiple Document Attachment Descriptions
//
void
DefaultAPI_objectsDocumentsAttachmentsBatchPut(apiClient_t *apiClient, char *Accept, char *Authorization, char *Content_Type, char *X_VaultAPI_ClientID);


// Retrieve Document Export Results
//
void
DefaultAPI_objectsDocumentsBatchActionsFileextractJobIdResultsGet(apiClient_t *apiClient, char *job_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Export Documents
//
void
DefaultAPI_objectsDocumentsBatchActionsFileextractPost(apiClient_t *apiClient, int *source, int *renditions, int *allversions, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Reclassify Multiple Documents
//
void
DefaultAPI_objectsDocumentsBatchActionsReclassifyPut(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *Accept, int *X_VaultAPI_MigrationMode, char *X_VaultAPI_ClientID);


// Update Multiple Document Renditions
//
void
DefaultAPI_objectsDocumentsBatchActionsRerenderPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Delete Multiple Documents
//
void
DefaultAPI_objectsDocumentsBatchDelete(apiClient_t *apiClient, char *idParam, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Undo Collaborative Authoring Checkout
//
void
DefaultAPI_objectsDocumentsBatchLockDelete(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Create Multiple Documents
//
void
DefaultAPI_objectsDocumentsBatchPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, int *X_VaultAPI_MigrationMode, char *X_VaultAPI_ClientID);


// Update Multiple Documents
//
void
DefaultAPI_objectsDocumentsBatchPut(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, int *X_VaultAPI_MigrationMode, char *X_VaultAPI_ClientID);


// Retrieve Anchor IDs
//
void
DefaultAPI_objectsDocumentsDocIdAnchorsGet(apiClient_t *apiClient, char *doc_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Export Document Annotations to PDF
//
void
DefaultAPI_objectsDocumentsDocIdAnnotationsFileGet(apiClient_t *apiClient, char *doc_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Import Document Annotations from PDF
//
void
DefaultAPI_objectsDocumentsDocIdAnnotationsFilePost(apiClient_t *apiClient, char *doc_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Delete Single Document Attachment
//
void
DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdDelete(apiClient_t *apiClient, char *doc_id, char *attachment_id, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);


// Download Document Attachment
//
void
DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdFileGet(apiClient_t *apiClient, char *doc_id, char *attachment_id, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);


// Retrieve Document Attachment Metadata
//
void
DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdGet(apiClient_t *apiClient, char *doc_id, char *attachment_id, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);


// Update Document Attachment Description
//
void
DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdPut(apiClient_t *apiClient, char *doc_id, char *attachment_id, char *Accept, char *Authorization, char *Content_Type, char *X_VaultAPI_ClientID);


// Delete Single Document Attachment Version
//
void
DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete(apiClient_t *apiClient, char *doc_id, char *attachment_id, char *attachment_version, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);


// Download Document Attachment Version
//
void
DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(apiClient_t *apiClient, char *doc_id, char *attachment_id, char *attachment_version, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);


// Retrieve Document Attachment Version Metadata
//
void
DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet(apiClient_t *apiClient, char *doc_id, char *attachment_id, char *attachment_version, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);


// Restore Document Attachment Version
//
void
DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost(apiClient_t *apiClient, char *doc_id, char *attachment_id, char *attachment_version, int *restore, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);


// Retrieve Document Attachment Versions
//
void
DefaultAPI_objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet(apiClient_t *apiClient, char *doc_id, char *attachment_id, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);


// Download All Document Attachments
//
void
DefaultAPI_objectsDocumentsDocIdAttachmentsFileGet(apiClient_t *apiClient, char *doc_id, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);


// Retrieve Document Attachments
//
void
DefaultAPI_objectsDocumentsDocIdAttachmentsGet(apiClient_t *apiClient, char *doc_id, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);


// Create Document Attachment
//
void
DefaultAPI_objectsDocumentsDocIdAttachmentsPost(apiClient_t *apiClient, char *doc_id, char *Accept, char *Authorization, char *Content_Type, char *X_VaultAPI_ClientID);


// Retrieve Complete Audit History for a Single Document
//
void
DefaultAPI_objectsDocumentsDocIdAudittrailGet(apiClient_t *apiClient, char *doc_id, char *start_date, char *end_date, char *format_result, char *limit, char *offset, char *events, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Delete Single Document
//
void
DefaultAPI_objectsDocumentsDocIdDelete(apiClient_t *apiClient, char *doc_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Document Events
//
void
DefaultAPI_objectsDocumentsDocIdEventsGet(apiClient_t *apiClient, char *doc_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Download Document File
//
void
DefaultAPI_objectsDocumentsDocIdFileGet(apiClient_t *apiClient, char *doc_id, int *lockDocument, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);


// Retrieve Document
//
void
DefaultAPI_objectsDocumentsDocIdGet(apiClient_t *apiClient, char *doc_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Delete Document Lock
//
void
DefaultAPI_objectsDocumentsDocIdLockDelete(apiClient_t *apiClient, char *doc_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Document Lock
//
void
DefaultAPI_objectsDocumentsDocIdLockGet(apiClient_t *apiClient, char *doc_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Create Document Lock
//
void
DefaultAPI_objectsDocumentsDocIdLockPost(apiClient_t *apiClient, char *doc_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Download All Document Version Attachments
//
void
DefaultAPI_objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);


// Create Single Document Version
//
void
DefaultAPI_objectsDocumentsDocIdPost(apiClient_t *apiClient, char *doc_id, char *suppressRendition, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Update Single Document
//
void
DefaultAPI_objectsDocumentsDocIdPut(apiClient_t *apiClient, char *doc_id, char *Authorization, char *Content_Type, char *Accept, int *X_VaultAPI_MigrationMode, char *X_VaultAPI_ClientID);


// Retrieve Document Renditions
//
void
DefaultAPI_objectsDocumentsDocIdRenditionsGet(apiClient_t *apiClient, char *doc_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Delete Single Document Rendition
//
void
DefaultAPI_objectsDocumentsDocIdRenditionsRenditionTypeDelete(apiClient_t *apiClient, char *doc_id, char *rendition_type, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Download Document Rendition File
//
void
DefaultAPI_objectsDocumentsDocIdRenditionsRenditionTypeGet(apiClient_t *apiClient, char *doc_id, char *rendition_type, char *steadyState, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Add Single Document Rendition
//
void
DefaultAPI_objectsDocumentsDocIdRenditionsRenditionTypePost(apiClient_t *apiClient, char *doc_id, char *rendition_type, char *Authorization, char *Accept, char *Content Type, char *X_VaultAPI_ClientID);


// Replace Document Rendition
//
void
DefaultAPI_objectsDocumentsDocIdRenditionsRenditionTypePut(apiClient_t *apiClient, char *doc_id, char *rendition_type, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Remove Users & Groups from Roles on a Single Document
//
void
DefaultAPI_objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete(apiClient_t *apiClient, char *doc_id, char *role_name_and_user_or_group, char *id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Document Version Attachments
//
void
DefaultAPI_objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);


// Retrieve Document Versions
//
void
DefaultAPI_objectsDocumentsDocIdVersionsGet(apiClient_t *apiClient, char *doc_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Read Annotations by ID
//
void
DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *annotation_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Read Replies of Parent Annotation
//
void
DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *annotation_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Export Document Version Annotations to PDF
//
void
DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Import Document Version Annotations from PDF
//
void
DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Read Annotations by Document Version and Type
//
void
DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *limit, char *offset, char *annotation_types, char *pagination_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Download Document Version Attachment Version
//
void
DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *attachment_id, char *attachment_version, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);


// Retrieve Document Version Attachment Versions
//
void
DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *attachment_id, char *attachment_version, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);


// Delete Single Document Version
//
void
DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Document Version Notes as CSV
//
void
DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Create Document Event
//
void
DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Retrieve Video Annotations
//
void
DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Download Document Version File
//
void
DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);


// Retrieve Document Version
//
void
DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Update Document Version
//
void
DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *Authorization, char *Content_Type, char *Accept, int *X_VaultAPI_MigrationMode, char *X_VaultAPI_ClientID);


// Retrieve Document Relationships
//
void
DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Create Single Document Relationship
//
void
DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Delete Single Document Relationship
//
void
DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *relationship_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Document Relationship
//
void
DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *relationship_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Document Version Renditions
//
void
DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Delete Document Version Rendition
//
void
DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *rendition_type, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Download Document Version Rendition File
//
void
DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *rendition_type, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Upload Document Version Rendition
//
void
DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *rendition_type, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Replace Document Version Rendition
//
void
DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *rendition_type, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Download Document Version Thumbnail File
//
void
DefaultAPI_objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet(apiClient_t *apiClient, char *doc_id, char *major_version, char *minor_version, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);


// Retrieve All Documents
//
void
DefaultAPI_objectsDocumentsGet(apiClient_t *apiClient, char *named_filter, char *scope, char *versionscope, char *search, char *limit, char *sort, char *start, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve All Document Roles
//
void
DefaultAPI_objectsDocumentsIdRolesGet(apiClient_t *apiClient, char *id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Assign Users & Groups to Roles on a Single Document
//
void
DefaultAPI_objectsDocumentsIdRolesPost(apiClient_t *apiClient, char *id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Retrieve Document Role
//
void
DefaultAPI_objectsDocumentsIdRolesRoleNameGet(apiClient_t *apiClient, char *id, char *role_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Document User Actions
//
void
DefaultAPI_objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet(apiClient_t *apiClient, char *id, char *major_version, char *minor_version, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Document Entry Criteria
//
void
DefaultAPI_objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet(apiClient_t *apiClient, char *id, char *major_version, char *minor_version, char *name__v, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Initiate Document User Action
//
void
DefaultAPI_objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut(apiClient_t *apiClient, char *id, char *major_version, char *minor_version, char *name__v, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve User Actions on Multiple Documents
//
void
DefaultAPI_objectsDocumentsLifecycleActionsPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Initiate Bulk Document User Actions
//
void
DefaultAPI_objectsDocumentsLifecycleActionsUserActionNamePut(apiClient_t *apiClient, char *user_action_name, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Create Single Document
//
void
DefaultAPI_objectsDocumentsPost(apiClient_t *apiClient, char *Authorization, char *Accept, int *X_VaultAPI_MigrationMode, char *X_VaultAPI_ClientID);


// Delete Multiple Document Relationships
//
void
DefaultAPI_objectsDocumentsRelationshipsBatchDelete(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Create Multiple Document Relationships
//
void
DefaultAPI_objectsDocumentsRelationshipsBatchPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Delete Multiple Document Renditions
//
void
DefaultAPI_objectsDocumentsRenditionsBatchDelete(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Add Multiple Document Renditions
//
void
DefaultAPI_objectsDocumentsRenditionsBatchPost(apiClient_t *apiClient, char *idParam, char *largeSizeAsset, char *Authorization, char *Accept, char *Content_Type, int *X_VaultAPI_MigrationMode, char *X_VaultAPI_ClientID);


// Remove Users and Groups from Roles on Multiple Documents & Binders
//
void
DefaultAPI_objectsDocumentsRolesBatchDelete(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Assign Users & Groups to Roles on Multiple Documents & Binders
//
void
DefaultAPI_objectsDocumentsRolesBatchPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Retrieve Document Template Collection
//
void
DefaultAPI_objectsDocumentsTemplatesGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Create Single Document Template
//
void
DefaultAPI_objectsDocumentsTemplatesPost(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Update Multiple Document Templates
//
void
DefaultAPI_objectsDocumentsTemplatesPut(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Delete Basic Document Template
//
void
DefaultAPI_objectsDocumentsTemplatesTemplateNameDelete(apiClient_t *apiClient, char *template_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Download Document Template File
//
void
DefaultAPI_objectsDocumentsTemplatesTemplateNameFileGet(apiClient_t *apiClient, char *template_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Document Template Attributes
//
void
DefaultAPI_objectsDocumentsTemplatesTemplateNameGet(apiClient_t *apiClient, char *template_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Update Single Document Template
//
void
DefaultAPI_objectsDocumentsTemplatesTemplateNamePut(apiClient_t *apiClient, char *template_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Document Tokens
//
void
DefaultAPI_objectsDocumentsTokensPost(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Export Document Versions
//
void
DefaultAPI_objectsDocumentsVersionsBatchActionsFileextractPost(apiClient_t *apiClient, int *source, int *renditions, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Delete Multiple Document Versions
//
void
DefaultAPI_objectsDocumentsVersionsBatchDelete(apiClient_t *apiClient, char *idParam, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Create Multiple Document Versions
//
void
DefaultAPI_objectsDocumentsVersionsBatchPost(apiClient_t *apiClient, char *idParam, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_MigrationMode, char *X_VaultAPI_ClientID);


// Retrieve Domain Information
//
void
DefaultAPI_objectsDomainGet(apiClient_t *apiClient, int *include_application, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Retrieve Domains
//
void
DefaultAPI_objectsDomainsGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Add EDL Matched Documents
//
void
DefaultAPI_objectsEdlMatchedDocumentsBatchActionsAddPost(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Remove EDL Matched Documents
//
void
DefaultAPI_objectsEdlMatchedDocumentsBatchActionsRemovePost(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Auto Managed Groups
//
void
DefaultAPI_objectsGroupsAutoGet(apiClient_t *apiClient, char *limit, char *offset, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve All Groups
//
void
DefaultAPI_objectsGroupsGet(apiClient_t *apiClient, char *includeImplied, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Delete Group
//
void
DefaultAPI_objectsGroupsGroupIdDelete(apiClient_t *apiClient, char *group_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Group
//
void
DefaultAPI_objectsGroupsGroupIdGet(apiClient_t *apiClient, char *group_id, int *includeImplied, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Update Group
//
void
DefaultAPI_objectsGroupsGroupIdPut(apiClient_t *apiClient, char *group_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Create Group 
//
void
DefaultAPI_objectsGroupsPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Retrieve Application License Usage
//
void
DefaultAPI_objectsLicensesGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve All Multi-Record Workflows
//
void
DefaultAPI_objectsObjectworkflowsActionsGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Multi-Record Workflow Details
//
void
DefaultAPI_objectsObjectworkflowsActionsWorkflowNameGet(apiClient_t *apiClient, char *workflow_name, char *Authorization, char *X_VaultAPI_ClientID);


// Initiate Multi-Record Workflow
//
void
DefaultAPI_objectsObjectworkflowsActionsWorkflowNamePost(apiClient_t *apiClient, char *workflow_name, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Workflows
//
void
DefaultAPI_objectsObjectworkflowsGet(apiClient_t *apiClient, char *object__v, char *record_id__v, char *participant, char *status__v, char *offset, char *page_size, char *loc, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Workflow Tasks
//
void
DefaultAPI_objectsObjectworkflowsTasksGet(apiClient_t *apiClient, char *object__v, char *record_id__v, char *assignee__v, char *status__v, char *offset, char *page_size, char *loc, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Accept Single Record Workflow Task
//
void
DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsAcceptPost(apiClient_t *apiClient, char *task_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Cancel Workflow Task
//
void
DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsCancelPost(apiClient_t *apiClient, char *task_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Complete Single Record Workflow Task
//
void
DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsCompletePost(apiClient_t *apiClient, char *task_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Retrieve Workflow Task Actions
//
void
DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsGet(apiClient_t *apiClient, char *task_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Accept Multi-item Workflow Task
//
void
DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost(apiClient_t *apiClient, char *task_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Complete Multi-item Workflow Task
//
void
DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost(apiClient_t *apiClient, char *task_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Manage Multi-Item Workflow Content
//
void
DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost(apiClient_t *apiClient, char *task_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Reassign Multi-item Workflow Task
//
void
DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost(apiClient_t *apiClient, char *task_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Reassign Single Record Workflow Task
//
void
DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsReassignPost(apiClient_t *apiClient, char *task_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Retrieve Workflow Task Action Details
//
void
DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsTaskActionGet(apiClient_t *apiClient, char *task_id, char *task_action, char *loc, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Undo Workflow Task Acceptance
//
void
DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost(apiClient_t *apiClient, char *task_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Update Workflow Task Due Date
//
void
DefaultAPI_objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost(apiClient_t *apiClient, char *task_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Retrieve Workflow Task Details
//
void
DefaultAPI_objectsObjectworkflowsTasksTaskIdGet(apiClient_t *apiClient, char *task_id, int *loc, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Workflow Actions
//
void
DefaultAPI_objectsObjectworkflowsWorkflowIdActionsGet(apiClient_t *apiClient, char *workflow_id, char *loc, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Workflow Action Details
//
void
DefaultAPI_objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet(apiClient_t *apiClient, char *workflow_id, char *workflow_action, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Initiate Workflow Action
//
void
DefaultAPI_objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost(apiClient_t *apiClient, char *workflow_id, char *workflow_action, char *documents__sys, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Workflow Details
//
void
DefaultAPI_objectsObjectworkflowsWorkflowIdGet(apiClient_t *apiClient, char *workflow_id, int *loc, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve All Picklists
//
void
DefaultAPI_objectsPicklistsGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Picklist Values
//
void
DefaultAPI_objectsPicklistsPicklistNameGet(apiClient_t *apiClient, char *picklist_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Inactivate Picklist Value
//
void
DefaultAPI_objectsPicklistsPicklistNamePicklistValueNameDelete(apiClient_t *apiClient, char *picklist_name, char *picklist_value_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Update Picklist Value
//
void
DefaultAPI_objectsPicklistsPicklistNamePicklistValueNamePut(apiClient_t *apiClient, char *picklist_name, char *picklist_value_name, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Create Picklist Values
//
void
DefaultAPI_objectsPicklistsPicklistNamePost(apiClient_t *apiClient, char *picklist_name, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Update Picklist Value Label
//
void
DefaultAPI_objectsPicklistsPicklistNamePut(apiClient_t *apiClient, char *picklist_name, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Build Production Vault
//
void
DefaultAPI_objectsSandboxActionsBuildproductionPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Promote to Production
//
void
DefaultAPI_objectsSandboxActionsPromoteproductionPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Recheck Sandbox Usage Limit
//
void
DefaultAPI_objectsSandboxActionsRecheckusagePost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Change Sandbox Size
//
void
DefaultAPI_objectsSandboxBatchChangesizePost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Set Sandbox Entitlements
//
void
DefaultAPI_objectsSandboxEntitlementsSetPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Retrieve Sandboxes
//
void
DefaultAPI_objectsSandboxGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Delete Sandbox
//
void
DefaultAPI_objectsSandboxNameDelete(apiClient_t *apiClient, char *name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Create or Refresh Sandbox
//
void
DefaultAPI_objectsSandboxPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Update Sandbox Snapshot
//
void
DefaultAPI_objectsSandboxSnapshotApiNameActionsUpdatePost(apiClient_t *apiClient, char *api_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Upgrade Sandbox Snapshot
//
void
DefaultAPI_objectsSandboxSnapshotApiNameActionsUpgradePost(apiClient_t *apiClient, char *api_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Delete Sandbox Snapshot
//
void
DefaultAPI_objectsSandboxSnapshotApiNameDelete(apiClient_t *apiClient, char *api_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Sandbox Snapshots
//
void
DefaultAPI_objectsSandboxSnapshotGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Create Sandbox Snapshot
//
void
DefaultAPI_objectsSandboxSnapshotPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Refresh Sandbox from Snapshot
//
void
DefaultAPI_objectsSandboxVaultIdActionsRefreshPost(apiClient_t *apiClient, char *vault_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Retrieve Sandbox Details by ID
//
void
DefaultAPI_objectsSandboxVaultIdGet(apiClient_t *apiClient, char *vault_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve All Security Policies
//
void
DefaultAPI_objectsSecuritypoliciesGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Security Policy
//
void
DefaultAPI_objectsSecuritypoliciesSecurityPolicyNameGet(apiClient_t *apiClient, char *security_policy_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve All Users
//
void
DefaultAPI_objectsUsersGet(apiClient_t *apiClient, char *vaults, char *exclude_vault_membership, char *exclude_app_licensing, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve User
//
void
DefaultAPI_objectsUsersIdGet(apiClient_t *apiClient, char *id, char *exclude_vault_membership, char *exclude_app_licensing, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve User Permissions
//
void
DefaultAPI_objectsUsersIdPermissionsGet(apiClient_t *apiClient, char *id, char *filter, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Update Single User
//
void
DefaultAPI_objectsUsersIdPut(apiClient_t *apiClient, char *id, char *Authorization, char *Content_Type, char *X_VaultAPI_ClientID);


// Validate Session User
//
void
DefaultAPI_objectsUsersMeGet(apiClient_t *apiClient, char *exclude_vault_membership, char *exclude_app_licensing, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Change My Password
//
void
DefaultAPI_objectsUsersMePasswordPost(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve My User Permissions
//
void
DefaultAPI_objectsUsersMePermissionsGet(apiClient_t *apiClient, char *filter, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Update My User
//
void
DefaultAPI_objectsUsersMePut(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *X_VaultAPI_ClientID);


// Create Single User
//
void
DefaultAPI_objectsUsersPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Update Multiple Users
//
void
DefaultAPI_objectsUsersPut(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Disable User
//
void
DefaultAPI_objectsUsersUserIdDelete(apiClient_t *apiClient, char *user_id, int *domain, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Update Vault Membership
//
void
DefaultAPI_objectsUsersUserIdVaultMembershipVaultIdPut(apiClient_t *apiClient, char *user_id, char *vault_id, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Vault Compare
//
void
DefaultAPI_objectsVaultActionsComparePost(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *X_VaultAPI_ClientID);


// Vault Configuration Report
//
void
DefaultAPI_objectsVaultActionsConfigreportPost(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *X_VaultAPI_ClientID);


// Component Definition Query
//
void
DefaultAPI_queryComponentsPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Next Page URL
//
void
DefaultAPI_queryNextPagePost(apiClient_t *apiClient, char *next_page, char *Authorization, char *Accept, int *X_VaultAPI_DescribeQuery, char *Content_Type, char *X_VaultAPI_ClientID);


// Submitting a Query
//
void
DefaultAPI_queryPost(apiClient_t *apiClient, char *Authorization, char *Accept, int *X_VaultAPI_DescribeQuery, char *Content_Type, char *X_VaultAPI_ClientID);


// Previous Page URL
//
void
DefaultAPI_queryPreviousPagePost(apiClient_t *apiClient, char *previous_page, char *Authorization, char *Accept, int *X_VaultAPI_DescribeQuery, char *Content_Type, char *X_VaultAPI_ClientID);


// Retrieve Current User with SCIM
//
void
DefaultAPI_scimV2MeGet(apiClient_t *apiClient, char *attributes, char *excludedAttributes, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Update Current User with SCIM
//
void
DefaultAPI_scimV2MePut(apiClient_t *apiClient, char *attributes, char *excludedAttributes, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Retrieve All SCIM Resource Types
//
void
DefaultAPI_scimV2ResourceTypesGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Single SCIM Resource Type
//
void
DefaultAPI_scimV2ResourceTypesTypeGet(apiClient_t *apiClient, char *type, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve All SCIM Schema Information
//
void
DefaultAPI_scimV2SchemasGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Single SCIM Schema Information
//
void
DefaultAPI_scimV2SchemasIdGet(apiClient_t *apiClient, char *id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve SCIM Provider
//
void
DefaultAPI_scimV2ServiceProviderConfigGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve SCIM Resources
//
void
DefaultAPI_scimV2TypeGet(apiClient_t *apiClient, char *type, char *filter, char *attributes, char *excludedAttributes, char *sortBy, char *sortOrder, char *startIndex, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Single SCIM Resource
//
void
DefaultAPI_scimV2TypeIdGet(apiClient_t *apiClient, char *type, char *id, char *attributes, char *excludedAttributes, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve All Users with SCIM
//
void
DefaultAPI_scimV2UsersGet(apiClient_t *apiClient, char *filter, char *attributes, char *excludedAttributes, char *sortBy, char *sortOrder, char *count, char *startIndex, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Single User with SCIM
//
void
DefaultAPI_scimV2UsersIdGet(apiClient_t *apiClient, char *id, char *filter, char *attributes, char *excludedAttributes, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Update User with SCIM
//
void
DefaultAPI_scimV2UsersIdPut(apiClient_t *apiClient, char *id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Create User with SCIM
//
void
DefaultAPI_scimV2UsersPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Retrieve Signing Certificate
//
void
DefaultAPI_servicesCertificateCertIdGet(apiClient_t *apiClient, char *cert_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Disable Configuration Mode
//
void
DefaultAPI_servicesConfigurationModeActionsDisablePost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Enable Configuration Mode
//
void
DefaultAPI_servicesConfigurationModeActionsEnablePost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Retrieve Available Direct Data Files
//
void
DefaultAPI_servicesDirectdataFilesGet(apiClient_t *apiClient, char *extract_type, int *start_time, int *stop_time, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);


// Download Direct Data File
//
void
DefaultAPI_servicesDirectdataFilesNameGet(apiClient_t *apiClient, char *name, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);


// Download Item Content
//
void
DefaultAPI_servicesFileStagingItemsContentItemGet(apiClient_t *apiClient, char *item, char *Authorization, char *Accept, char *Range, char *X_VaultAPI_ClientID);


// Delete File or Folder
//
void
DefaultAPI_servicesFileStagingItemsItemDelete(apiClient_t *apiClient, char *item, char *recursive, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// List Items at a Path
//
void
DefaultAPI_servicesFileStagingItemsItemGet(apiClient_t *apiClient, char *item, char *recursive, char *limit, char *format_result, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Update Folder or File
//
void
DefaultAPI_servicesFileStagingItemsItemPut(apiClient_t *apiClient, char *item, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Create Folder or File
//
void
DefaultAPI_servicesFileStagingItemsPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_MD5, char *X_VaultAPI_ClientID);


// List Upload Sessions
//
void
DefaultAPI_servicesFileStagingUploadGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Create Resumable Upload Session
//
void
DefaultAPI_servicesFileStagingUploadPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Abort Upload Session
//
void
DefaultAPI_servicesFileStagingUploadUploadSessionIdDelete(apiClient_t *apiClient, char *upload_session_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Get Upload Session Details
//
void
DefaultAPI_servicesFileStagingUploadUploadSessionIdGet(apiClient_t *apiClient, char *upload_session_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// List File Parts Uploaded to Session
//
void
DefaultAPI_servicesFileStagingUploadUploadSessionIdPartsGet(apiClient_t *apiClient, char *upload_session_id, char *limit, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Commit Upload Session
//
void
DefaultAPI_servicesFileStagingUploadUploadSessionIdPost(apiClient_t *apiClient, char *upload_session_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Upload to a Session
//
void
DefaultAPI_servicesFileStagingUploadUploadSessionIdPut(apiClient_t *apiClient, char *upload_session_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_FilePartNumber, char *Content_MD5, char *X_VaultAPI_ClientID);


// Retrieve Job Histories
//
void
DefaultAPI_servicesJobsHistoriesGet(apiClient_t *apiClient, char *start_date, char *end_date, char *status, char *limit, char *offset, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Import Bulk Translation File Job Errors
//
void
DefaultAPI_servicesJobsJobIdErrorsGet(apiClient_t *apiClient, char *job_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Job Status
//
void
DefaultAPI_servicesJobsJobIdGet(apiClient_t *apiClient, char *job_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Import Bulk Translation File Job Summary
//
void
DefaultAPI_servicesJobsJobIdSummaryGet(apiClient_t *apiClient, char *job_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve SDK Job Tasks
//
void
DefaultAPI_servicesJobsJobIdTasksGet(apiClient_t *apiClient, char *job_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Job Monitors
//
void
DefaultAPI_servicesJobsMonitorsGet(apiClient_t *apiClient, char *start_date, char *end_date, char *status, char *limit, char *offset, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Start Job
//
void
DefaultAPI_servicesJobsStartNowJobIdPost(apiClient_t *apiClient, char *job_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Extract Data Files
//
void
DefaultAPI_servicesLoaderExtractPost(apiClient_t *apiClient, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Retrieve Load Failure Log Results
//
void
DefaultAPI_servicesLoaderJobIdTasksTaskIdFailurelogGet(apiClient_t *apiClient, char *job_id, char *task_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Loader Extract Results
//
void
DefaultAPI_servicesLoaderJobIdTasksTaskIdResultsGet(apiClient_t *apiClient, char *job_id, char *task_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Loader Extract Renditions Results
//
void
DefaultAPI_servicesLoaderJobIdTasksTaskIdResultsRenditionsGet(apiClient_t *apiClient, char *job_id, char *task_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Load Success Log Results
//
void
DefaultAPI_servicesLoaderJobIdTasksTaskIdSuccesslogGet(apiClient_t *apiClient, char *job_id, char *task_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Load Data Objects
//
void
DefaultAPI_servicesLoaderLoadPost(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Validate Package
//
void
DefaultAPI_servicesPackageActionsValidatePost(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *X_VaultAPI_ClientID);


// Export Package
//
void
DefaultAPI_servicesPackagePost(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *X_VaultAPI_ClientID);


// Import Package
//
void
DefaultAPI_servicesPackagePut(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve All Queues
//
void
DefaultAPI_servicesQueuesGet(apiClient_t *apiClient, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Disable Delivery
//
void
DefaultAPI_servicesQueuesQueueNameActionsDisableDeliveryPut(apiClient_t *apiClient, char *queue_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Enable Delivery
//
void
DefaultAPI_servicesQueuesQueueNameActionsEnableDeliveryPut(apiClient_t *apiClient, char *queue_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Reset Queue
//
void
DefaultAPI_servicesQueuesQueueNameActionsResetPut(apiClient_t *apiClient, char *queue_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Queue Status
//
void
DefaultAPI_servicesQueuesQueueNameGet(apiClient_t *apiClient, char *queue_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Validate Imported Package
//
void
DefaultAPI_servicesVobjectVaultPackageVPackageIdActionsValidatePost(apiClient_t *apiClient, char *package_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// End Session
//
void
DefaultAPI_sessionDelete(apiClient_t *apiClient, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);


// Download Single Client Code Distribution
//
void
DefaultAPI_uicodeDistributionsDistributionNameCodeGet(apiClient_t *apiClient, char *distribution_name, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);


// Delete Single Client Code Distribution
//
void
DefaultAPI_uicodeDistributionsDistributionNameDelete(apiClient_t *apiClient, char *distribution_name, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);


// Retrieve Single Client Code Distribution Metadata
//
void
DefaultAPI_uicodeDistributionsDistributionNameGet(apiClient_t *apiClient, char *distribution_name, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);


// Retrieve All Client Code Distribution Metadata
//
void
DefaultAPI_uicodeDistributionsGet(apiClient_t *apiClient, char *Accept, char *Authorization, char *X_VaultAPI_ClientID);


// Add or Replace Single Client Code Distribution
//
void
DefaultAPI_uicodeDistributionsPost(apiClient_t *apiClient, char *Accept, char *Authorization, char *Content_Type, char *X_VaultAPI_ClientID);


// Deploy Package
//
void
DefaultAPI_vobjectVaultPackageVPackageIdActionsDeployPost(apiClient_t *apiClient, char *package_id, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Package Deploy Results
//
void
DefaultAPI_vobjectVaultPackageVPackageIdActionsDeployResultsGet(apiClient_t *apiClient, char *package_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Results of Cascade Delete Job
//
void
DefaultAPI_vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet(apiClient_t *apiClient, char *object_name, char *job_status, char *job_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Results of Deep Copy Job
//
void
DefaultAPI_vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet(apiClient_t *apiClient, char *object_name, char *job_status, char *job_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Create a Placeholder from an EDL Item
//
void
DefaultAPI_vobjectsEdlItemVActionsCreateplaceholderPost(apiClient_t *apiClient, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Download Merge Records Job Log
//
void
DefaultAPI_vobjectsMergesJobIdLogGet(apiClient_t *apiClient, char *job_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Record Merge Results
//
void
DefaultAPI_vobjectsMergesJobIdResultsGet(apiClient_t *apiClient, char *job_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Record Merge Status
//
void
DefaultAPI_vobjectsMergesJobIdStatusGet(apiClient_t *apiClient, char *job_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Initiate Object Action on Multiple Records
//
void
DefaultAPI_vobjectsObjectNameActionsActionNamePost(apiClient_t *apiClient, char *object_name, char *action_name, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Change Object Type
//
void
DefaultAPI_vobjectsObjectNameActionsChangetypePost(apiClient_t *apiClient, char *object_name, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Initiate Record Merge
//
void
DefaultAPI_vobjectsObjectNameActionsMergePost(apiClient_t *apiClient, char *object_name, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID, list_t *_vobjects__object_name__actions_merge_post_request_inner);


// Retrieve Roll-up Field Recalculation Status
//
void
DefaultAPI_vobjectsObjectNameActionsRecalculaterollupsGet(apiClient_t *apiClient, char *object_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Recalculate Roll-up Fields
//
void
DefaultAPI_vobjectsObjectNameActionsRecalculaterollupsPost(apiClient_t *apiClient, char *object_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Update Corporate Currency Fields
//
void
DefaultAPI_vobjectsObjectNameActionsUpdatecorporatecurrencyPut(apiClient_t *apiClient, char *object_name, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Delete Multiple Object Record Attachments
//
void
DefaultAPI_vobjectsObjectNameAttachmentsBatchDelete(apiClient_t *apiClient, char *object_name, char *idParam, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Create Multiple Object Record Attachments
//
void
DefaultAPI_vobjectsObjectNameAttachmentsBatchPost(apiClient_t *apiClient, char *object_name, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Update Multiple Object Record Attachment Descriptions
//
void
DefaultAPI_vobjectsObjectNameAttachmentsBatchPut(apiClient_t *apiClient, char *object_name, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Delete Object Records
//
void
DefaultAPI_vobjectsObjectNameDelete(apiClient_t *apiClient, char *object_name, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Object Record Roles
//
void
DefaultAPI_vobjectsObjectNameIdRolesRoleNameGet(apiClient_t *apiClient, char *object_name, char *id, char *role_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Object User Actions Details
//
void
DefaultAPI_vobjectsObjectNameObjectRecordIdActionsActionNameGet(apiClient_t *apiClient, char *object_name, char *object_record_id, char *action_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Initiate Object Action on a Single Record
//
void
DefaultAPI_vobjectsObjectNameObjectRecordIdActionsActionNamePost(apiClient_t *apiClient, char *object_name, char *object_record_id, char *action_name, char *Authorization, char *Content_Type, char *Accept, char *X_VaultAPI_ClientID);


// Cascade Delete Object Record
//
void
DefaultAPI_vobjectsObjectNameObjectRecordIdActionsCascadedeletePost(apiClient_t *apiClient, char *object_name, char *object_record_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Deep Copy Object Record
//
void
DefaultAPI_vobjectsObjectNameObjectRecordIdActionsDeepcopyPost(apiClient_t *apiClient, char *object_name, char *object_record_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Retrieve Object Record User Actions
//
void
DefaultAPI_vobjectsObjectNameObjectRecordIdActionsGet(apiClient_t *apiClient, char *object_name, char *object_record_id, int *loc, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Download Attachment Field File
//
void
DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet(apiClient_t *apiClient, char *object_name, char *object_record_id, char *attachment_field_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Update Attachment Field File
//
void
DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost(apiClient_t *apiClient, char *object_name, char *object_record_id, char *attachment_field_name, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Download All Attachment Field Files
//
void
DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet(apiClient_t *apiClient, char *object_name, char *object_record_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Delete Object Record Attachment
//
void
DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete(apiClient_t *apiClient, char *object_name, char *object_record_id, char *attachment_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Retrieve Object Record Attachment Metadata
//
void
DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet(apiClient_t *apiClient, char *object_name, char *object_record_id, char *attachment_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Update Object Record Attachment Description
//
void
DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut(apiClient_t *apiClient, char *object_name, char *object_record_id, char *attachment_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Delete Object Record Attachment Version
//
void
DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete(apiClient_t *apiClient, char *object_name, char *object_record_id, char *attachment_id, char *attachment_version, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Download Object Record Attachment File
//
void
DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(apiClient_t *apiClient, char *object_name, char *object_record_id, char *attachment_id, char *attachment_version, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Object Record Attachment Version Metadata
//
void
DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet(apiClient_t *apiClient, char *object_name, char *object_record_id, char *attachment_id, char *attachment_version, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Restore Object Record Attachment Version
//
void
DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost(apiClient_t *apiClient, char *object_name, char *object_record_id, char *attachment_id, char *attachment_version, int *restore, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Retrieve Object Record Attachment Versions
//
void
DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet(apiClient_t *apiClient, char *object_name, char *object_record_id, char *attachment_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Download All Object Record Attachment Files
//
void
DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsFileGet(apiClient_t *apiClient, char *object_name, char *object_record_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Object Record Attachments
//
void
DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsGet(apiClient_t *apiClient, char *object_name, char *object_record_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Create Object Record Attachment
//
void
DefaultAPI_vobjectsObjectNameObjectRecordIdAttachmentsPost(apiClient_t *apiClient, char *object_name, char *object_record_id, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Retrieve Complete Audit History for a Single Object Record
//
void
DefaultAPI_vobjectsObjectNameObjectRecordIdAudittrailGet(apiClient_t *apiClient, char *object_name, char *object_record_id, char *start_date, char *end_date, char *format_result, char *limit, char *offset, char *events, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Retrieve Object Record
//
void
DefaultAPI_vobjectsObjectNameObjectRecordIdGet(apiClient_t *apiClient, char *object_name, char *object_record_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


// Create & Upsert Object Records
//
void
DefaultAPI_vobjectsObjectNamePost(apiClient_t *apiClient, char *object_name, char *idParam, char *Authorization, char *Content_Type, char *Accept, int *X_VaultAPI_MigrationMode, int *X_VaultAPI_NoTriggers, char *X_VaultAPI_ClientID);


// Update Object Records
//
void
DefaultAPI_vobjectsObjectNamePut(apiClient_t *apiClient, char *object_name, char *Authorization, char *Content_Type, char *Accept, int *X_VaultAPI_MigrationMode, int *X_VaultAPI_NoTriggers, char *X_VaultAPI_ClientID);


// Remove Users & Groups from Roles on Object Records
//
void
DefaultAPI_vobjectsObjectNameRolesDelete(apiClient_t *apiClient, char *object_name, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Assign Users & Groups to Roles on Object Records
//
void
DefaultAPI_vobjectsObjectNameRolesPost(apiClient_t *apiClient, char *object_name, char *Authorization, char *Accept, char *Content_Type, char *X_VaultAPI_ClientID);


// Retrieve Outbound Package Dependencies
//
void
DefaultAPI_vobjectsOutboundPackageVPackageIdDependenciesGet(apiClient_t *apiClient, char *package_id, char *Authorization, char *Accept, char *X_VaultAPI_ClientID);


