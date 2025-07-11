#compdef 

# !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
# !
# ! Note:
# !
# ! THIS SCRIPT HAS BEEN AUTOMATICALLY GENERATED USING
# ! openapi-generator (https://openapi-generator.tech)
# ! FROM OPENAPI SPECIFICATION IN JSON.
# !
# ! Based on: https://github.com/Valodim/zsh-curl-completion/blob/master/_curl
# !
# ! Generator version: 7.14.0
# !
# !
# ! Installation:
# !
# ! Copy the _ file to any directory under FPATH
# ! environment variable (echo $FPATH)
# !
# !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


local curcontext="$curcontext" state line ret=1
typeset -A opt_args

typeset -A mime_type_abbreviations
# text/*
mime_type_abbreviations[text]="text/plain"
mime_type_abbreviations[html]="text/html"
mime_type_abbreviations[md]="text/x-markdown"
mime_type_abbreviations[csv]="text/csv"
mime_type_abbreviations[css]="text/css"
mime_type_abbreviations[rtf]="text/rtf"
# application/*
mime_type_abbreviations[json]="application/json"
mime_type_abbreviations[xml]="application/xml"
mime_type_abbreviations[yaml]="application/yaml"
mime_type_abbreviations[js]="application/javascript"
mime_type_abbreviations[bin]="application/octet-stream"
mime_type_abbreviations[rdf]="application/rdf+xml"
# image/*
mime_type_abbreviations[jpg]="image/jpeg"
mime_type_abbreviations[png]="image/png"
mime_type_abbreviations[gif]="image/gif"
mime_type_abbreviations[bmp]="image/bmp"
mime_type_abbreviations[tiff]="image/tiff"

#
# Generate zsh completion string list for abbreviated mime types
#
get_mime_type_completions() {
    typeset -a result
    result=()
    for k in "${(@k)mime_type_abbreviations}"; do
        value=$mime_type_abbreviations[${k}]
        #echo $value
        result+=( "${k}[${value}]" )
        #echo $result
    done
    echo "$result"
}

#
# cURL crypto engines completion function
#
_curl_crypto_engine() {
    local vals
    vals=( ${${(f)"$(curl --engine list)":gs/ /}[2,$]} )
    _describe -t outputs 'engines' vals && return 0
}

#
# cURL post data completion functions=
#
_curl_post_data() {

    # don't do anything further if this is raw content
    compset -P '=' && _message 'raw content' && return 0

    # complete filename or stdin for @ syntax
    compset -P '*@' && {
        local expl
        _description files expl stdin
        compadd "$expl[@]" - "-"
        _files
        return 0
    }

    # got a name already? expecting data.
    compset -P '*=' && _message 'data value' && return 0

    # otherwise, name (or @ or =) should be specified
    _message 'data name' && return 0

}


local arg_http arg_ftp arg_other arg_proxy arg_crypto arg_connection arg_auth arg_input arg_output

# HTTP Arguments
arg_http=(''\
  {-0,--http1.0}'[force use of use http 1.0 instead of 1.1]' \
  {-b,--cookie}'[pass data to http server as cookie]:data or file' \
  {-c,--cookie-jar}'[specify cookie file]:file name:_files' \
  {-d,--data}'[send specified data as HTTP POST data]:data:{_curl_post_data}' \
  '--data-binary[post HTTP POST data without any processing]:data:{_curl_post_data}' \
  '--data-urlencode[post HTTP POST data, with url encoding]:data:{_curl_post_data}' \
  {-f,--fail}'[enable failfast behavior for server errors]' \
  '*'{-F,--form}'[add POST form data]:name=content' \
  {-G,--get}'[use HTTP GET even with data (-d, --data, --data-binary)]' \
  '*'{-H,--header}'[specify an extra header]:header' \
  '--ignore-content-length[ignore Content-Length header]' \
  {-i,--include}'[include HTTP header in the output]' \
  {-j,--junk-session-cookies}'[discard all session cookies]' \
  {-e,--referer}'[send url as referer]:referer url:_urls' \
  {-L,--location}'[follow Location headers on http 3XX response]' \
  '--location-trusted[like --location, but allows sending of auth data to redirected hosts]' \
  '--max-redirs[set maximum number of redirection followings allowed]:number' \
  {-J,--remote-header-name}'[use Content-Disposition for output file name]' \
  {-O,--remote-name}'[write to filename parsed from url instead of stdout]' \
  '--post301[do not convert POST to GET after following 301 Location response (follow RFC 2616/10.3.2)]' \
  '--post302[do not convert POST to GET after following 302 Location response (follow RFC 2616/10.3.2)]' \
  )

# FTP arguments
arg_ftp=(\
  {-a,--append}'[append to target file instead of overwriting (FTP/SFTP)]' \
  '--crlf[convert LF to CRLF in upload]' \
  '--disable-eprt[disable use of EPRT and LPRT for active FTP transfers]' \
  '--disable-epsv[disable use of EPSV for passive FTP transfers]' \
  '--ftp-account[account data (FTP)]:data' \
  '--ftp-alternative-to-user[command to send when USER and PASS commands fail (FTP)]:command' \
  '--ftp-create-dirs[create paths remotely if it does not exist]' \
  '--ftp-method[ftp method to use to reach a file (FTP)]:method:(multicwd ocwd singlecwd)' \
  '--ftp-pasv[use passive mode for the data connection (FTP)]' \
  '--ftp-skip-pasv-ip[do not use the ip the server suggests for PASV]' \
  '--form-string[like --form, but do not parse content]:name=string' \
  '--ftp-pret[send PRET before PASV]' \
  '--ftp-ssl-ccc[use clear command channel (CCC) after authentication (FTP)]' \
  '--ftp-ssl-ccc-mode[sets the CCC mode (FTP)]:mode:(active passive)' \
  '--ftp-ssl-control[require SSL/TLS for FTP login, clear for transfer]' \
  {-l,--list-only}'[list names only when listing directories (FTP)]' \
  {-P,--ftp-port}'[use active mode, tell server to connect to specified address or interface (FTP]:address' \
  '*'{-Q,--quote}'[send arbitrary command to the remote server before transfer (FTP/SFTP)]:command' \
  )

# Other Protocol arguments
arg_other=(\
  '--mail-from[specify From: address]:address' \
  '--mail-rcpt[specify email recipient for SMTP, may be given multiple times]:address' \
  {-t,--telnet-option}'[pass options to telnet protocol]:opt=val' \
  '--tftp-blksize[set tftp BLKSIZE option]:value' \
  )

# Proxy arguments
arg_proxy=(\
  '--noproxy[list of hosts to connect directly to instead of through proxy]:no-proxy-list' \
  {-p,--proxytunnel}'[tunnel non-http protocols through http proxy]' \
  {-U,--proxy-user}'[specify the user name and password to use for proxy authentication]:user:password' \
  '--proxy-anyauth[use any authentication method for proxy, default to most secure]' \
  '--proxy-basic[use HTTP Basic authentication for proxy]' \
  '--proxy-digest[use http digest authentication for proxy]' \
  '--proxy-negotiate[enable GSS-Negotiate authentication for proxy]' \
  '--proxy-ntlm[enable ntlm authentication for proxy]' \
  '--proxy1.0[use http 1.0 proxy]:proxy url' \
  {-x,--proxy}'[use specified proxy]:proxy url' \
  '--socks5-gssapi-service[change service name for socks server]:servicename' \
  '--socks5-gssapi-nec[allow unprotected exchange of protection mode negotiation]' \
  )

# Crypto arguments
arg_crypto=(\
  {-1,--tlsv1}'[Forces curl to use TLS version 1 when negotiating with a remote TLS server.]' \
  {-2,--sslv2}'[Forces curl to use SSL version 2 when negotiating with a remote SSL server.]' \
  {-3,--sslv3}'[Forces curl to use SSL version 3 when negotiating with a remote SSL server.]' \
  '--ciphers[specifies which cipher to use for the ssl connection]:list of ciphers' \
  '--crlfile[specify file with revoked certificates]:file' \
  '--delegation[set delegation policy to use with GSS/kerberos]:delegation policy:(none policy always)' \
  {-E,--cert}'[use specified client certificate]:certificate file:_files' \
  '--engine[use selected OpenSSL crypto engine]:ssl crypto engine:{_curl_crypto_engine}' \
  '--egd-file[set ssl entropy gathering daemon socket]:entropy socket:_files' \
  '--cert-type[specify certificate type (PEM, DER, ENG)]:certificate type:(PEM DER ENG)' \
  '--cacert[specify certificate file to verify the peer with]:CA certificate:_files' \
  '--capath[specify a search path for certificate files]:CA certificate directory:_directories' \
  '--hostpubmd5[check remote hosts public key]:md5 hash' \
  {-k,--insecure}'[allow ssl to perform insecure ssl connections (ie, ignore certificate)]' \
  '--key[ssl/ssh private key file name]:key file:_files' \
  '--key-type[ssl/ssh private key file type]:file type:(PEM DER ENG)' \
  '--pubkey[ssh public key file]:pubkey file:_files' \
  '--random-file[set source of random data for ssl]:random source:_files' \
  '--no-sessionid[disable caching of ssl session ids]' \
  '--pass:phrase[passphrase for ssl/ssh private key]' \
  '--ssl[try to use ssl/tls for connection, if available]' \
  '--ssl-reqd[try to use ssl/tls for connection, fail if unavailable]' \
  '--tlsauthtype[set TLS authentication type (only SRP supported!)]:authtype' \
  '--tlsuser[set username for TLS authentication]:user' \
  '--tlspassword[set password for TLS authentication]:password' \
  )

# Connection arguments
arg_connection=(\
  {-4,--ipv4}'[prefer ipv4]' \
  {-6,--ipv6}'[prefer ipv6, if available]' \
  {-B,--use-ascii}'[use ascii mode]' \
  '--compressed[request a compressed transfer]' \
  '--connect-timeout[timeout for connection phase]:seconds' \
  {-I,--head}'[fetch http HEAD only (HTTP/FTP/FILE]' \
  '--interface[work on a specific interface]:name' \
  '--keepalive-time[set time to wait before sending keepalive probes]:seconds' \
  '--limit-rate[specify maximum transfer rate]:speed' \
  '--local-port[set preferred number or range of local ports to use]:num' \
  {-N,--no-buffer}'[disable buffering of the output stream]' \
  '--no-keepalive[disable use of keepalive messages in TCP connections]' \
  '--raw[disable all http decoding and pass raw data]' \
  '--resolve[provide a custom address for a specific host and port pair]:host\:port\:address' \
  '--retry[specify maximum number of retries for transient errors]:num' \
  '--retry-delay[specify delay between retries]:seconds' \
  '--retry-max-time[maximum time to spend on retries]:seconds' \
  '--tcp-nodelay[turn on TCP_NODELAY option]' \
  {-y,--speed-time}'[specify time to abort after if download is slower than speed-limit]:time' \
  {-Y,--speed-limit}'[specify minimum speed for --speed-time]:speed' \
  )

# Authentication arguments
arg_auth=(\
  '--anyauth[use any authentication method, default to most secure]' \
  '--basic[use HTTP Basic authentication]' \
  '--ntlm[enable ntlm authentication]' \
  '--digest[use http digest authentication]' \
  '--krb[use kerberos authentication]:auth:(clear safe confidential private)' \
  '--negotiate[enable GSS-Negotiate authentication]' \
  {-n,--netrc}'[scan ~/.netrc for login data]' \
  '--netrc-optional[like --netrc, but does not make .netrc usage mandatory]' \
  '--netrc-file[like --netrc, but specify file to use]:netrc file:_files' \
  '--tr-encoding[request compressed transfer-encoding]' \
  {-u,--user}'[specify user name and password for server authentication]:user\:password' \
  )

# Input arguments
arg_input=(\
  {-C,--continue-at}'[resume at offset ]:offset' \
  {-g,--globoff}'[do not glob {}\[\] letters]' \
  '--max-filesize[maximum filesize to download, fail for bigger files]:bytes' \
  '--proto[specify allowed protocols for transfer]:protocols' \
  '--proto-redir[specify allowed protocols for transfer after a redirect]:protocols' \
  {-r,--range}'[set range of bytes to request (HTTP/FTP/SFTP/FILE)]:range' \
  {-R,--remote-time}'[use timestamp of remote file for local file]' \
  {-T,--upload-file}'[transfer file to remote url (using PUT for HTTP)]:file to upload:_files' \
  '--url[specify a URL to fetch (multi)]:url:_urls' \
  {-z,--time-cond}'[request downloaded file to be newer than date or given reference file]:date expression' \
  )

# Output arguments
arg_output=(\
  '--create-dirs[create local directory hierarchy as needed]' \
  {-D,--dump-header}'[write protocol headers to file]:dump file:_files' \
  {-o,--output}'[write to specified file instead of stdout]:output file:_files' \
  {--progress-bar,-\#}'[display progress as a simple progress bar]' \
  {-\#,--progress-bar}'[Make curl display progress as a simple progress bar instead of the standard, more informational, meter.]' \
  {-R,--remote-time}'[use timestamp of remote file for local file]' \
  '--raw[disable all http decoding and pass raw data]' \
  {-s,--silent}'[silent mode, do not show progress meter or error messages]' \
  {-S,--show-error}'[show errors in silent mode]' \
  '--stderr[redirect stderr to specified file]:output file:_files' \
  '--trace[enable full trace dump of all incoming and outgoing data]:trace file:_files' \
  '--trace-ascii[enable full trace dump of all incoming and outgoing data, without hex data]:trace file:_files' \
  '--trace-time[prepends a time stamp to each trace or verbose line that curl displays]' \
  {-v,--verbose}'[output debug info]' \
  {-w,--write-out}'[specify message to output on successful operation]:format string' \
  '--xattr[store some file metadata in extended file attributes]' \
  {-X,--request}'[specifies request method for HTTP server]:method:(GET POST PUT DELETE HEAD OPTIONS TRACE CONNECT PATCH LINK UNLINK)' \
  )

_arguments -C -s $arg_http $arg_ftp $arg_other $arg_crypto $arg_connection $arg_auth $arg_input $arg_output \
  {-M,--manual}'[Print manual]' \
  '*'{-K,--config}'[Use other config file to read arguments from]:config file:_files' \
  '--libcurl[output libcurl code for the operation to file]:output file:_files' \
  {-m,--max-time}'[Limit total time of operation]:seconds' \
  {-s,--silent}'[Silent mode, do not show progress meter or error messages]' \
  {-S,--show-error}'[Show errors in silent mode]' \
  '--stderr[Redirect stderr to specified file]:output file:_files' \
  '-q[Do not read settings from .curlrc (must be first option)]' \
  {-h,--help}'[Print help and list of operations]' \
  {-V,--version}'[Print service API version]' \
  '--about[Print the information about service]' \
  '--host[Specify the host URL]':URL:_urls \
  '--dry-run[Print out the cURL command without executing it]' \
  {-ac,--accept}'[Set the Accept header in the request]: :{_values "Accept mime type" $(get_mime_type_completions)}' \
  {-ct,--content-type}'[Set the Content-type header in request]: :{_values "Content mime type" $(get_mime_type_completions)}' \
  '1: :->ops' \
  '*:: :->args' \
  && ret=0


case $state in
  ops)
    # Operations
    _values "Operations" \
            "apiGet[Retrieve API Versions]" \
            "apiMdlComponentsComponentTypeAndRecordNameFilesGet[Retrieve Content File]" \
            "apiMdlComponentsComponentTypeAndRecordNameGet[Retrieve Component Record (MDL)]" \
            "apiMdlExecuteAsyncJobIdResultsGet[Retrieve Asynchronous MDL Script Results]" \
            "apiMdlExecuteAsyncPost[Execute MDL Script Asynchronously]" \
            "apiMdlExecutePost[Execute MDL Script]" \
            "apiMdlFilesPost[Upload Content File]" \
            "audittrailAuditTrailTypeGet[Retrieve Audit Details]" \
            "authDiscoveryPost[Authentication Type Discovery]" \
            "authOauthSessionOathOidcProfileIdPost[OAuth 2.0 / OpenID Connect]" \
            "authPost[User Name and Password]" \
            "codeClassNameDelete[Delete Single Source Code File]" \
            "codeClassNameDisablePut[Disable Vault Extension]" \
            "codeClassNameEnablePut[Enable Vault Extension]" \
            "codeClassNameGet[Retrieve Single Source Code File]" \
            "codeProfilerGet[Retrieve All Profiling Sessions]" \
            "codeProfilerPost[Create Profiling Session]" \
            "codeProfilerSessionNameActionsEndPost[End Profiling Session]" \
            "codeProfilerSessionNameDelete[Delete Profiling Session]" \
            "codeProfilerSessionNameGet[Retrieve Profiling Session]" \
            "codeProfilerSessionNameResultsGet[Download Profiling Session Results]" \
            "codePut[Add or Replace Single Source Code File]" \
            "compositesTreesEdlHierarchyOrTemplateActionsListnodesPost[Retrieve Specific Root Nodes]" \
            "compositesTreesEdlHierarchyOrTemplateGet[Retrieve All Root Nodes]" \
            "compositesTreesEdlHierarchyVParentNodeIdChildrenGet[Retrieve a Node's Children]" \
            "compositesTreesEdlHierarchyVParentNodeIdChildrenPut[Update Node Order]" \
            "configurationComponentTypeAndRecordNameGet[Retrieve Component Record (XML/JSON)]" \
            "configurationComponentTypeGet[Retrieve Component Record Collection]" \
            "configurationObjectNameAndObjectTypeGet[Retrieve Details from a Specific Object]" \
            "configurationObjecttypeGet[Retrieve Details from All Object Types]" \
            "configurationRoleAssignmentRuleDelete[Delete Lifecycle Role Assignment Override Rules]" \
            "configurationRoleAssignmentRuleGet[Retrieve Lifecycle Role Assignment Rules (Default & Override)]" \
            "configurationRoleAssignmentRulePost[Create Lifecycle Role Assignment Override Rules]" \
            "configurationRoleAssignmentRulePut[Update Lifecycle Role Assignment Rules (Default & Override)]" \
            "delegationLoginPost[Initiate Delegated Session]" \
            "delegationVaultsGet[Retrieve Delegations]" \
            "keepAlivePost[Session Keep Alive]" \
            "limitsGet[Retrieve Limits on Objects]" \
            "logsApiUsageGet[Download Daily API Usage]" \
            "logsCodeDebugGet[Retrieve All Debug Logs]" \
            "logsCodeDebugIdActionsResetDelete[Delete Debug Log]" \
            "logsCodeDebugIdActionsResetPost[Reset Debug Log]" \
            "logsCodeDebugIdFilesGet[Download Debug Log Files]" \
            "logsCodeDebugIdGet[Retrieve Single Debug Log]" \
            "logsCodeDebugPost[Create Debug Log]" \
            "logsCodeRuntimeGet[Download SDK Runtime Log]" \
            "messagesMessageTypeActionsImportPost[Import Bulk Translation File]" \
            "messagesMessageTypeLanguageLangActionsExportPost[Export Bulk Translation File]" \
            "metadataAudittrailAuditTrailTypeGet[Retrieve Audit Metadata]" \
            "metadataAudittrailGet[Retrieve Audit Types]" \
            "metadataComponentsComponentTypeGet[Retrieve Component Type Metadata]" \
            "metadataComponentsGet[Retrieve All Component Metadata]" \
            "metadataObjectsBindersTemplatesBindernodesGet[Retrieve Binder Template Node Metadata]" \
            "metadataObjectsBindersTemplatesGet[Retrieve Binder Template Metadata]" \
            "metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet[Retrieve Annotation Placemark Type Metadata]" \
            "metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet[Retrieve Annotation Reference Type Metadata]" \
            "metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet[Retrieve Annotation Type Metadata]" \
            "metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet[Retrieve Document Event SubType Metadata]" \
            "metadataObjectsDocumentsEventsGet[Retrieve Document Event Types and Subtypes]" \
            "metadataObjectsDocumentsLockGet[Retrieve Document Lock Metadata]" \
            "metadataObjectsDocumentsPropertiesFindCommonPost[Retrieve Common Document Fields]" \
            "metadataObjectsDocumentsPropertiesGet[Retrieve All Document Fields]" \
            "metadataObjectsDocumentsTemplatesGet[Retrieve Document Template Metadata]" \
            "metadataObjectsDocumentsTypesGet[Retrieve All Document Types]" \
            "metadataObjectsDocumentsTypesTypeGet[Retrieve Document Type]" \
            "metadataObjectsDocumentsTypesTypeRelationshipsGet[Retrieve Document Type Relationships]" \
            "metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet[Retrieve Document Classification]" \
            "metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet[Retrieve Document Subtype]" \
            "metadataObjectsGroupsGet[Retrieve Group Metadata]" \
            "metadataObjectsSecuritypoliciesGet[Retrieve Security Policy Metadata]" \
            "metadataObjectsUsersGet[Retrieve User Metadata]" \
            "metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet[Retrieve Archived Document Signature Metadata]" \
            "metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet[Retrieve Document Signature Metadata]" \
            "metadataVobjectsGet[Retrieve Object Collection]" \
            "metadataVobjectsObjectNameActionsCanceldeploymentPost[Cancel Raw Object Deployment]" \
            "metadataVobjectsObjectNameFieldsObjectFieldNameGet[Retrieve Object Field Metadata]" \
            "metadataVobjectsObjectNameGet[Retrieve Object Metadata]" \
            "metadataVobjectsObjectNamePageLayoutsGet[Retrieve Page Layouts]" \
            "metadataVobjectsObjectNamePageLayoutsLayoutNameGet[Retrieve Page Layout Metadata]" \
            "notificationsHistoriesGet[Retrieve Email Notification Histories]" \
            "objectWorkflowActionsActionGet[Retrieve Bulk Workflow Action Details]" \
            "objectWorkflowActionsActionPost[Initiate Workflow Actions on Multiple Workflows]" \
            "objectWorkflowActionsCanceltasksPost[Cancel Workflow Tasks]" \
            "objectWorkflowActionsCancelworkflowsPost[Cancel Workflows]" \
            "objectWorkflowActionsGet[Retrieve Bulk Workflow Actions]" \
            "objectWorkflowActionsReassigntasksPost[Reassign Workflow Tasks]" \
            "objectWorkflowActionsReplaceworkflowownerPost[Replace Workflow Owner]" \
            "objectsBindersActionsExportJobIdResultsGet[Retrieve Binder Export Results]" \
            "objectsBindersBinderIdActionsExportPost[Export Binder (Latest Version)]" \
            "objectsBindersBinderIdActionsPost[Refresh Binder Auto-Filing]" \
            "objectsBindersBinderIdBindingRulePut[Update Binding Rule]" \
            "objectsBindersBinderIdDelete[Delete Binder]" \
            "objectsBindersBinderIdDocumentsNodeIdBindingRulePut[Update Binder Document Binding Rule]" \
            "objectsBindersBinderIdDocumentsPost[Add Document to Binder]" \
            "objectsBindersBinderIdDocumentsSectionIdDelete[Remove Document from Binder]" \
            "objectsBindersBinderIdDocumentsSectionIdPut[Move Document in Binder]" \
            "objectsBindersBinderIdGet[Retrieve Binder]" \
            "objectsBindersBinderIdPost[Create Binder Version]" \
            "objectsBindersBinderIdPut[Update Binder]" \
            "objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete[Remove Users & Groups from Roles on a Single Binder]" \
            "objectsBindersBinderIdSectionsNodeIdBindingRulePut[Update Binder Section Binding Rule]" \
            "objectsBindersBinderIdSectionsNodeIdPut[Update Binder Section]" \
            "objectsBindersBinderIdSectionsPost[Create Binder Section]" \
            "objectsBindersBinderIdSectionsSectionIdDelete[Delete Binder Section]" \
            "objectsBindersBinderIdSectionsSectionIdGet[Retrieve Binder Sections]" \
            "objectsBindersBinderIdVersionsGet[Retrieve All Binder Versions]" \
            "objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost[Export Binder (Specific Version)]" \
            "objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete[Delete Binder Version]" \
            "objectsBindersBinderIdVersionsMajorVersionMinorVersionGet[Retrieve Binder Version]" \
            "objectsBindersBinderIdVersionsMajorVersionMinorVersionPut[Update Binder Version]" \
            "objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost[Create Binder Relationship]" \
            "objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete[Delete Binder Relationship]" \
            "objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet[Retrieve Binder Relationship]" \
            "objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet[Retrieve Binder Version Section]" \
            "objectsBindersIdRolesGet[Retrieve All Binder Roles]" \
            "objectsBindersIdRolesPost[Assign Users & Groups to Roles on a Single Binder]" \
            "objectsBindersIdRolesRoleNameGet[Retrieve Document Role]" \
            "objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet[Retrieve Binder User Actions]" \
            "objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet[Retrieve Binder Entry Criteria]" \
            "objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut[Initiate Binder User Action]" \
            "objectsBindersLifecycleActionsPost[Retrieve User Actions on Multiple Binders]" \
            "objectsBindersLifecycleActionsUserActionNamePut[Initiate Bulk Binder User Actions]" \
            "objectsBindersPost[Create Binder]" \
            "objectsBindersTemplatesGet[Retrieve Binder Template Collection]" \
            "objectsBindersTemplatesPost[Create Binder Template]" \
            "objectsBindersTemplatesPut[Update Binder Template]" \
            "objectsBindersTemplatesTemplateNameBindernodesGet[Retrieve Binder Template Node Attributes]" \
            "objectsBindersTemplatesTemplateNameBindernodesPost[Create Binder Template Node]" \
            "objectsBindersTemplatesTemplateNameBindernodesPut[Replace Binder Template Nodes]" \
            "objectsBindersTemplatesTemplateNameDelete[Delete Binder Template]" \
            "objectsBindersTemplatesTemplateNameGet[Retrieve Binder Template Attributes]" \
            "objectsDeletionsDocumentsGet[Retrieve Deleted Document IDs]" \
            "objectsDeletionsVobjectsObjectNameGet[Retrieve Deleted Object Record ID]" \
            "objectsDocumentsActionsGet[Retrieve All Document Workflows]" \
            "objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet[Download Controlled Copy Job Results]" \
            "objectsDocumentsActionsWorkflowNameGet[Retrieve Document Workflow Details]" \
            "objectsDocumentsActionsWorkflowNamePost[Initiate Document Workflow]" \
            "objectsDocumentsAnnotationsBatchDelete[Delete Annotations]" \
            "objectsDocumentsAnnotationsBatchPost[Create Multiple Annotations]" \
            "objectsDocumentsAnnotationsBatchPut[Update Annotations]" \
            "objectsDocumentsAnnotationsRepliesBatchPost[Add Annotation Replies]" \
            "objectsDocumentsAttachmentsBatchDelete[Delete Multiple Document Attachments]" \
            "objectsDocumentsAttachmentsBatchPost[Create Multiple Document Attachments]" \
            "objectsDocumentsAttachmentsBatchPut[Update Multiple Document Attachment Descriptions]" \
            "objectsDocumentsBatchActionsFileextractJobIdResultsGet[Retrieve Document Export Results]" \
            "objectsDocumentsBatchActionsFileextractPost[Export Documents]" \
            "objectsDocumentsBatchActionsReclassifyPut[Reclassify Multiple Documents]" \
            "objectsDocumentsBatchActionsRerenderPost[Update Multiple Document Renditions]" \
            "objectsDocumentsBatchDelete[Delete Multiple Documents]" \
            "objectsDocumentsBatchLockDelete[Undo Collaborative Authoring Checkout]" \
            "objectsDocumentsBatchPost[Create Multiple Documents]" \
            "objectsDocumentsBatchPut[Update Multiple Documents]" \
            "objectsDocumentsDocIdAnchorsGet[Retrieve Anchor IDs]" \
            "objectsDocumentsDocIdAnnotationsFileGet[Export Document Annotations to PDF]" \
            "objectsDocumentsDocIdAnnotationsFilePost[Import Document Annotations from PDF]" \
            "objectsDocumentsDocIdAttachmentsAttachmentIdDelete[Delete Single Document Attachment]" \
            "objectsDocumentsDocIdAttachmentsAttachmentIdFileGet[Download Document Attachment]" \
            "objectsDocumentsDocIdAttachmentsAttachmentIdGet[Retrieve Document Attachment Metadata]" \
            "objectsDocumentsDocIdAttachmentsAttachmentIdPut[Update Document Attachment Description]" \
            "objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete[Delete Single Document Attachment Version]" \
            "objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet[Download Document Attachment Version]" \
            "objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet[Retrieve Document Attachment Version Metadata]" \
            "objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost[Restore Document Attachment Version]" \
            "objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet[Retrieve Document Attachment Versions]" \
            "objectsDocumentsDocIdAttachmentsFileGet[Download All Document Attachments]" \
            "objectsDocumentsDocIdAttachmentsGet[Retrieve Document Attachments]" \
            "objectsDocumentsDocIdAttachmentsPost[Create Document Attachment]" \
            "objectsDocumentsDocIdAudittrailGet[Retrieve Complete Audit History for a Single Document]" \
            "objectsDocumentsDocIdDelete[Delete Single Document]" \
            "objectsDocumentsDocIdEventsGet[Retrieve Document Events]" \
            "objectsDocumentsDocIdFileGet[Download Document File]" \
            "objectsDocumentsDocIdGet[Retrieve Document]" \
            "objectsDocumentsDocIdLockDelete[Delete Document Lock]" \
            "objectsDocumentsDocIdLockGet[Retrieve Document Lock]" \
            "objectsDocumentsDocIdLockPost[Create Document Lock]" \
            "objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet[Download All Document Version Attachments]" \
            "objectsDocumentsDocIdPost[Create Single Document Version]" \
            "objectsDocumentsDocIdPut[Update Single Document]" \
            "objectsDocumentsDocIdRenditionsGet[Retrieve Document Renditions]" \
            "objectsDocumentsDocIdRenditionsRenditionTypeDelete[Delete Single Document Rendition]" \
            "objectsDocumentsDocIdRenditionsRenditionTypeGet[Download Document Rendition File]" \
            "objectsDocumentsDocIdRenditionsRenditionTypePost[Add Single Document Rendition]" \
            "objectsDocumentsDocIdRenditionsRenditionTypePut[Replace Document Rendition]" \
            "objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete[Remove Users & Groups from Roles on a Single Document]" \
            "objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet[Retrieve Document Version Attachments]" \
            "objectsDocumentsDocIdVersionsGet[Retrieve Document Versions]" \
            "objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet[Read Annotations by ID]" \
            "objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet[Read Replies of Parent Annotation]" \
            "objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet[Export Document Version Annotations to PDF]" \
            "objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost[Import Document Version Annotations from PDF]" \
            "objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet[Read Annotations by Document Version and Type]" \
            "objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet[Download Document Version Attachment Version]" \
            "objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet[Retrieve Document Version Attachment Versions]" \
            "objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete[Delete Single Document Version]" \
            "objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet[Retrieve Document Version Notes as CSV]" \
            "objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost[Create Document Event]" \
            "objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet[Retrieve Video Annotations]" \
            "objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet[Download Document Version File]" \
            "objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet[Retrieve Document Version]" \
            "objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut[Update Document Version]" \
            "objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet[Retrieve Document Relationships]" \
            "objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost[Create Single Document Relationship]" \
            "objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete[Delete Single Document Relationship]" \
            "objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet[Retrieve Document Relationship]" \
            "objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet[Retrieve Document Version Renditions]" \
            "objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete[Delete Document Version Rendition]" \
            "objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet[Download Document Version Rendition File]" \
            "objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost[Upload Document Version Rendition]" \
            "objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut[Replace Document Version Rendition]" \
            "objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet[Download Document Version Thumbnail File]" \
            "objectsDocumentsGet[Retrieve All Documents]" \
            "objectsDocumentsIdRolesGet[Retrieve All Document Roles]" \
            "objectsDocumentsIdRolesPost[Assign Users & Groups to Roles on a Single Document]" \
            "objectsDocumentsIdRolesRoleNameGet[Retrieve Document Role]" \
            "objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet[Retrieve Document User Actions]" \
            "objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet[Retrieve Document Entry Criteria]" \
            "objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut[Initiate Document User Action]" \
            "objectsDocumentsLifecycleActionsPost[Retrieve User Actions on Multiple Documents]" \
            "objectsDocumentsLifecycleActionsUserActionNamePut[Initiate Bulk Document User Actions]" \
            "objectsDocumentsPost[Create Single Document]" \
            "objectsDocumentsRelationshipsBatchDelete[Delete Multiple Document Relationships]" \
            "objectsDocumentsRelationshipsBatchPost[Create Multiple Document Relationships]" \
            "objectsDocumentsRenditionsBatchDelete[Delete Multiple Document Renditions]" \
            "objectsDocumentsRenditionsBatchPost[Add Multiple Document Renditions]" \
            "objectsDocumentsRolesBatchDelete[Remove Users and Groups from Roles on Multiple Documents & Binders]" \
            "objectsDocumentsRolesBatchPost[Assign Users & Groups to Roles on Multiple Documents & Binders]" \
            "objectsDocumentsTemplatesGet[Retrieve Document Template Collection]" \
            "objectsDocumentsTemplatesPost[Create Single Document Template]" \
            "objectsDocumentsTemplatesPut[Update Multiple Document Templates]" \
            "objectsDocumentsTemplatesTemplateNameDelete[Delete Basic Document Template]" \
            "objectsDocumentsTemplatesTemplateNameFileGet[Download Document Template File]" \
            "objectsDocumentsTemplatesTemplateNameGet[Retrieve Document Template Attributes]" \
            "objectsDocumentsTemplatesTemplateNamePut[Update Single Document Template]" \
            "objectsDocumentsTokensPost[Document Tokens]" \
            "objectsDocumentsVersionsBatchActionsFileextractPost[Export Document Versions]" \
            "objectsDocumentsVersionsBatchDelete[Delete Multiple Document Versions]" \
            "objectsDocumentsVersionsBatchPost[Create Multiple Document Versions]" \
            "objectsDomainGet[Retrieve Domain Information]" \
            "objectsDomainsGet[Retrieve Domains]" \
            "objectsEdlMatchedDocumentsBatchActionsAddPost[Add EDL Matched Documents]" \
            "objectsEdlMatchedDocumentsBatchActionsRemovePost[Remove EDL Matched Documents]" \
            "objectsGroupsAutoGet[Retrieve Auto Managed Groups]" \
            "objectsGroupsGet[Retrieve All Groups]" \
            "objectsGroupsGroupIdDelete[Delete Group]" \
            "objectsGroupsGroupIdGet[Retrieve Group]" \
            "objectsGroupsGroupIdPut[Update Group]" \
            "objectsGroupsPost[Create Group]" \
            "objectsLicensesGet[Retrieve Application License Usage]" \
            "objectsObjectworkflowsActionsGet[Retrieve All Multi-Record Workflows]" \
            "objectsObjectworkflowsActionsWorkflowNameGet[Retrieve Multi-Record Workflow Details]" \
            "objectsObjectworkflowsActionsWorkflowNamePost[Initiate Multi-Record Workflow]" \
            "objectsObjectworkflowsGet[Retrieve Workflows]" \
            "objectsObjectworkflowsTasksGet[Retrieve Workflow Tasks]" \
            "objectsObjectworkflowsTasksTaskIdActionsAcceptPost[Accept Single Record Workflow Task]" \
            "objectsObjectworkflowsTasksTaskIdActionsCancelPost[Cancel Workflow Task]" \
            "objectsObjectworkflowsTasksTaskIdActionsCompletePost[Complete Single Record Workflow Task]" \
            "objectsObjectworkflowsTasksTaskIdActionsGet[Retrieve Workflow Task Actions]" \
            "objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost[Accept Multi-item Workflow Task]" \
            "objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost[Complete Multi-item Workflow Task]" \
            "objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost[Manage Multi-Item Workflow Content]" \
            "objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost[Reassign Multi-item Workflow Task]" \
            "objectsObjectworkflowsTasksTaskIdActionsReassignPost[Reassign Single Record Workflow Task]" \
            "objectsObjectworkflowsTasksTaskIdActionsTaskActionGet[Retrieve Workflow Task Action Details]" \
            "objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost[Undo Workflow Task Acceptance]" \
            "objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost[Update Workflow Task Due Date]" \
            "objectsObjectworkflowsTasksTaskIdGet[Retrieve Workflow Task Details]" \
            "objectsObjectworkflowsWorkflowIdActionsGet[Retrieve Workflow Actions]" \
            "objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet[Retrieve Workflow Action Details]" \
            "objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost[Initiate Workflow Action]" \
            "objectsObjectworkflowsWorkflowIdGet[Retrieve Workflow Details]" \
            "objectsPicklistsGet[Retrieve All Picklists]" \
            "objectsPicklistsPicklistNameGet[Retrieve Picklist Values]" \
            "objectsPicklistsPicklistNamePicklistValueNameDelete[Inactivate Picklist Value]" \
            "objectsPicklistsPicklistNamePicklistValueNamePut[Update Picklist Value]" \
            "objectsPicklistsPicklistNamePost[Create Picklist Values]" \
            "objectsPicklistsPicklistNamePut[Update Picklist Value Label]" \
            "objectsSandboxActionsBuildproductionPost[Build Production Vault]" \
            "objectsSandboxActionsPromoteproductionPost[Promote to Production]" \
            "objectsSandboxActionsRecheckusagePost[Recheck Sandbox Usage Limit]" \
            "objectsSandboxBatchChangesizePost[Change Sandbox Size]" \
            "objectsSandboxEntitlementsSetPost[Set Sandbox Entitlements]" \
            "objectsSandboxGet[Retrieve Sandboxes]" \
            "objectsSandboxNameDelete[Delete Sandbox]" \
            "objectsSandboxPost[Create or Refresh Sandbox]" \
            "objectsSandboxSnapshotApiNameActionsUpdatePost[Update Sandbox Snapshot]" \
            "objectsSandboxSnapshotApiNameActionsUpgradePost[Upgrade Sandbox Snapshot]" \
            "objectsSandboxSnapshotApiNameDelete[Delete Sandbox Snapshot]" \
            "objectsSandboxSnapshotGet[Retrieve Sandbox Snapshots]" \
            "objectsSandboxSnapshotPost[Create Sandbox Snapshot]" \
            "objectsSandboxVaultIdActionsRefreshPost[Refresh Sandbox from Snapshot]" \
            "objectsSandboxVaultIdGet[Retrieve Sandbox Details by ID]" \
            "objectsSecuritypoliciesGet[Retrieve All Security Policies]" \
            "objectsSecuritypoliciesSecurityPolicyNameGet[Retrieve Security Policy]" \
            "objectsUsersGet[Retrieve All Users]" \
            "objectsUsersIdGet[Retrieve User]" \
            "objectsUsersIdPermissionsGet[Retrieve User Permissions]" \
            "objectsUsersIdPut[Update Single User]" \
            "objectsUsersMeGet[Validate Session User]" \
            "objectsUsersMePasswordPost[Change My Password]" \
            "objectsUsersMePermissionsGet[Retrieve My User Permissions]" \
            "objectsUsersMePut[Update My User]" \
            "objectsUsersPost[Create Single User]" \
            "objectsUsersPut[Update Multiple Users]" \
            "objectsUsersUserIdDelete[Disable User]" \
            "objectsUsersUserIdVaultMembershipVaultIdPut[Update Vault Membership]" \
            "objectsVaultActionsComparePost[Vault Compare]" \
            "objectsVaultActionsConfigreportPost[Vault Configuration Report]" \
            "queryComponentsPost[Component Definition Query]" \
            "queryNextPagePost[Next Page URL]" \
            "queryPost[Submitting a Query]" \
            "queryPreviousPagePost[Previous Page URL]" \
            "scimV2MeGet[Retrieve Current User with SCIM]" \
            "scimV2MePut[Update Current User with SCIM]" \
            "scimV2ResourceTypesGet[Retrieve All SCIM Resource Types]" \
            "scimV2ResourceTypesTypeGet[Retrieve Single SCIM Resource Type]" \
            "scimV2SchemasGet[Retrieve All SCIM Schema Information]" \
            "scimV2SchemasIdGet[Retrieve Single SCIM Schema Information]" \
            "scimV2ServiceProviderConfigGet[Retrieve SCIM Provider]" \
            "scimV2TypeGet[Retrieve SCIM Resources]" \
            "scimV2TypeIdGet[Retrieve Single SCIM Resource]" \
            "scimV2UsersGet[Retrieve All Users with SCIM]" \
            "scimV2UsersIdGet[Retrieve Single User with SCIM]" \
            "scimV2UsersIdPut[Update User with SCIM]" \
            "scimV2UsersPost[Create User with SCIM]" \
            "servicesCertificateCertIdGet[Retrieve Signing Certificate]" \
            "servicesConfigurationModeActionsDisablePost[Disable Configuration Mode]" \
            "servicesConfigurationModeActionsEnablePost[Enable Configuration Mode]" \
            "servicesDirectdataFilesGet[Retrieve Available Direct Data Files]" \
            "servicesDirectdataFilesNameGet[Download Direct Data File]" \
            "servicesFileStagingItemsContentItemGet[Download Item Content]" \
            "servicesFileStagingItemsItemDelete[Delete File or Folder]" \
            "servicesFileStagingItemsItemGet[List Items at a Path]" \
            "servicesFileStagingItemsItemPut[Update Folder or File]" \
            "servicesFileStagingItemsPost[Create Folder or File]" \
            "servicesFileStagingUploadGet[List Upload Sessions]" \
            "servicesFileStagingUploadPost[Create Resumable Upload Session]" \
            "servicesFileStagingUploadUploadSessionIdDelete[Abort Upload Session]" \
            "servicesFileStagingUploadUploadSessionIdGet[Get Upload Session Details]" \
            "servicesFileStagingUploadUploadSessionIdPartsGet[List File Parts Uploaded to Session]" \
            "servicesFileStagingUploadUploadSessionIdPost[Commit Upload Session]" \
            "servicesFileStagingUploadUploadSessionIdPut[Upload to a Session]" \
            "servicesJobsHistoriesGet[Retrieve Job Histories]" \
            "servicesJobsJobIdErrorsGet[Retrieve Import Bulk Translation File Job Errors]" \
            "servicesJobsJobIdGet[Retrieve Job Status]" \
            "servicesJobsJobIdSummaryGet[Retrieve Import Bulk Translation File Job Summary]" \
            "servicesJobsJobIdTasksGet[Retrieve SDK Job Tasks]" \
            "servicesJobsMonitorsGet[Retrieve Job Monitors]" \
            "servicesJobsStartNowJobIdPost[Start Job]" \
            "servicesLoaderExtractPost[Extract Data Files]" \
            "servicesLoaderJobIdTasksTaskIdFailurelogGet[Retrieve Load Failure Log Results]" \
            "servicesLoaderJobIdTasksTaskIdResultsGet[Retrieve Loader Extract Results]" \
            "servicesLoaderJobIdTasksTaskIdResultsRenditionsGet[Retrieve Loader Extract Renditions Results]" \
            "servicesLoaderJobIdTasksTaskIdSuccesslogGet[Retrieve Load Success Log Results]" \
            "servicesLoaderLoadPost[Load Data Objects]" \
            "servicesPackageActionsValidatePost[Validate Package]" \
            "servicesPackagePost[Export Package]" \
            "servicesPackagePut[Import Package]" \
            "servicesQueuesGet[Retrieve All Queues]" \
            "servicesQueuesQueueNameActionsDisableDeliveryPut[Disable Delivery]" \
            "servicesQueuesQueueNameActionsEnableDeliveryPut[Enable Delivery]" \
            "servicesQueuesQueueNameActionsResetPut[Reset Queue]" \
            "servicesQueuesQueueNameGet[Retrieve Queue Status]" \
            "servicesVobjectVaultPackageVPackageIdActionsValidatePost[Validate Imported Package]" \
            "sessionDelete[End Session]" \
            "uicodeDistributionsDistributionNameCodeGet[Download Single Client Code Distribution]" \
            "uicodeDistributionsDistributionNameDelete[Delete Single Client Code Distribution]" \
            "uicodeDistributionsDistributionNameGet[Retrieve Single Client Code Distribution Metadata]" \
            "uicodeDistributionsGet[Retrieve All Client Code Distribution Metadata]" \
            "uicodeDistributionsPost[Add or Replace Single Client Code Distribution]" \
            "vobjectVaultPackageVPackageIdActionsDeployPost[Deploy Package]" \
            "vobjectVaultPackageVPackageIdActionsDeployResultsGet[Retrieve Package Deploy Results]" \
            "vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet[Retrieve Results of Cascade Delete Job]" \
            "vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet[Retrieve Results of Deep Copy Job]" \
            "vobjectsEdlItemVActionsCreateplaceholderPost[Create a Placeholder from an EDL Item]" \
            "vobjectsMergesJobIdLogGet[Download Merge Records Job Log]" \
            "vobjectsMergesJobIdResultsGet[Retrieve Record Merge Results]" \
            "vobjectsMergesJobIdStatusGet[Retrieve Record Merge Status]" \
            "vobjectsObjectNameActionsActionNamePost[Initiate Object Action on Multiple Records]" \
            "vobjectsObjectNameActionsChangetypePost[Change Object Type]" \
            "vobjectsObjectNameActionsMergePost[Initiate Record Merge]" \
            "vobjectsObjectNameActionsRecalculaterollupsGet[Retrieve Roll-up Field Recalculation Status]" \
            "vobjectsObjectNameActionsRecalculaterollupsPost[Recalculate Roll-up Fields]" \
            "vobjectsObjectNameActionsUpdatecorporatecurrencyPut[Update Corporate Currency Fields]" \
            "vobjectsObjectNameAttachmentsBatchDelete[Delete Multiple Object Record Attachments]" \
            "vobjectsObjectNameAttachmentsBatchPost[Create Multiple Object Record Attachments]" \
            "vobjectsObjectNameAttachmentsBatchPut[Update Multiple Object Record Attachment Descriptions]" \
            "vobjectsObjectNameDelete[Delete Object Records]" \
            "vobjectsObjectNameIdRolesRoleNameGet[Retrieve Object Record Roles]" \
            "vobjectsObjectNameObjectRecordIdActionsActionNameGet[Retrieve Object User Actions Details]" \
            "vobjectsObjectNameObjectRecordIdActionsActionNamePost[Initiate Object Action on a Single Record]" \
            "vobjectsObjectNameObjectRecordIdActionsCascadedeletePost[Cascade Delete Object Record]" \
            "vobjectsObjectNameObjectRecordIdActionsDeepcopyPost[Deep Copy Object Record]" \
            "vobjectsObjectNameObjectRecordIdActionsGet[Retrieve Object Record User Actions]" \
            "vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet[Download Attachment Field File]" \
            "vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost[Update Attachment Field File]" \
            "vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet[Download All Attachment Field Files]" \
            "vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete[Delete Object Record Attachment]" \
            "vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet[Retrieve Object Record Attachment Metadata]" \
            "vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut[Update Object Record Attachment Description]" \
            "vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete[Delete Object Record Attachment Version]" \
            "vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet[Download Object Record Attachment File]" \
            "vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet[Retrieve Object Record Attachment Version Metadata]" \
            "vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost[Restore Object Record Attachment Version]" \
            "vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet[Retrieve Object Record Attachment Versions]" \
            "vobjectsObjectNameObjectRecordIdAttachmentsFileGet[Download All Object Record Attachment Files]" \
            "vobjectsObjectNameObjectRecordIdAttachmentsGet[Retrieve Object Record Attachments]" \
            "vobjectsObjectNameObjectRecordIdAttachmentsPost[Create Object Record Attachment]" \
            "vobjectsObjectNameObjectRecordIdAudittrailGet[Retrieve Complete Audit History for a Single Object Record]" \
            "vobjectsObjectNameObjectRecordIdGet[Retrieve Object Record]" \
            "vobjectsObjectNamePost[Create & Upsert Object Records]" \
            "vobjectsObjectNamePut[Update Object Records]" \
            "vobjectsObjectNameRolesDelete[Remove Users & Groups from Roles on Object Records]" \
            "vobjectsObjectNameRolesPost[Assign Users & Groups to Roles on Object Records]" \
            "vobjectsOutboundPackageVPackageIdDependenciesGet[Retrieve Outbound Package Dependencies]" \

    _arguments "(--help)--help[Print information about operation]"

    ret=0
    ;;
  args)
    case $line[1] in
      apiGet)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      apiMdlComponentsComponentTypeAndRecordNameFilesGet)
        local -a _op_arguments
        _op_arguments=(
          "component_type_and_record_name=:[PATH] The component type of the record followed by the name of the record from which to retrieve the content file. The format is &#39;{Componenttype}.{record_name}&#39;. For example, &#39;Formattedoutput.my_formatted_output__c&#39;."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      apiMdlComponentsComponentTypeAndRecordNameGet)
        local -a _op_arguments
        _op_arguments=(
          "component_type_and_record_name=:[PATH] The component type name (&#39;Picklist&#39;, &#39;Docfield&#39;, &#39;Doctype&#39;, etc.) followed by the name of the record from which to retrieve metadata. The format is &#39;{Componenttype}.{record_name}&#39;. For example, &#39;Picklist.color__c&#39;. Find this with the [Retrieve Component Record Collection](https://developer.veevavault.com/api/24.3#Retrieve_Component_Record_Collection) endpoint."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      apiMdlExecuteAsyncJobIdResultsGet)
        local -a _op_arguments
        _op_arguments=(
          "job_id=:[PATH] "
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      apiMdlExecuteAsyncPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      apiMdlExecutePost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      apiMdlFilesPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      audittrailAuditTrailTypeGet)
        local -a _op_arguments
        _op_arguments=(
          "audit_trail_type=:[PATH] The name of the specified audit type (document_audit_trail, object_audit_trail, etc). Use the Retrieve Audit Types API to retrieve types available in your Vault. Requests for login_audit_trail only accept one request per user at a time."
          "start_date=:[QUERY] Specify a start date to retrieve audit information. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z. If omitted, defaults to the last 30 days."
"end_date=:[QUERY] Specify an end date to retrieve audit information. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z. If omitted, defaults to the last 30 days."
"all_dates=:[QUERY] Set to true to request audit information for all dates. You must leave start_date and end_date blank when requesting an export of a full audit trail."
"format_result=:[QUERY] To request a downloadable CSV file of your audit details, use csv. The response contains a jobId to retrieve the job status, which contains a link to download the CSV file. If omitted, the API returns a JSON response and does not start a job. If all_dates is true, this parameter is required."
"limit=:[QUERY] Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200."
"offset=:[QUERY] Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0."
"objects=:[QUERY] This is an optional parameter when specifying object_audit_trail as the {audit_trail_type}. Provide a comma-separated list of one or more object names to retrieve their audit details. For example, objects&#x3D;product__v,country__v. If omitted, defaults to all objects."
"events=:[QUERY] This is an optional parameter when specifying object_audit_trail or document_audit_trail as the {audit_trail_type}. Provide a comma-separated list of one or more audit events to retrieve their audit details. For example, events&#x3D;Edit,Delete,TaskAssignment. If omitted, defaults to all audit events. See Vault Help for full lists of object audit events and document audit events."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      authDiscoveryPost)
        local -a _op_arguments
        _op_arguments=(
                              "Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      authOauthSessionOathOidcProfileIdPost)
        local -a _op_arguments
        _op_arguments=(
          "oath_oidc_profile_id=:[PATH] "
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      authPost)
        local -a _op_arguments
        _op_arguments=(
                              "Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      codeClassNameDelete)
        local -a _op_arguments
        _op_arguments=(
          "class_name=:[PATH] The fully qualified class name of your file."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      codeClassNameDisablePut)
        local -a _op_arguments
        _op_arguments=(
          "class_name=:[PATH] The fully qualified class name of your file."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      codeClassNameEnablePut)
        local -a _op_arguments
        _op_arguments=(
          "class_name=:[PATH] The fully qualified class name of your file."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      codeClassNameGet)
        local -a _op_arguments
        _op_arguments=(
          "class_name=:[PATH] The fully qualified class name of your file."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      codeProfilerGet)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      codeProfilerPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      codeProfilerSessionNameActionsEndPost)
        local -a _op_arguments
        _op_arguments=(
          "session_name=:[PATH] The name of the session, for example,  baseline__c."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      codeProfilerSessionNameDelete)
        local -a _op_arguments
        _op_arguments=(
          "session_name=:[PATH] The name of the session, for example,  baseline__c."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      codeProfilerSessionNameGet)
        local -a _op_arguments
        _op_arguments=(
          "session_name=:[PATH] The name of the session, for example,  baseline__c."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      codeProfilerSessionNameResultsGet)
        local -a _op_arguments
        _op_arguments=(
          "session_name=:[PATH] The name of the session, for example,  baseline__c."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      codePut)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      compositesTreesEdlHierarchyOrTemplateActionsListnodesPost)
        local -a _op_arguments
        _op_arguments=(
          "edl_hierarchy_or_template=:[PATH] Choose to retrieve either edl_hierarchy__v or edl_template__v"
                    "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      compositesTreesEdlHierarchyOrTemplateGet)
        local -a _op_arguments
        _op_arguments=(
          "edl_hierarchy_or_template=:[PATH] "
                    "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      compositesTreesEdlHierarchyVParentNodeIdChildrenGet)
        local -a _op_arguments
        _op_arguments=(
          "parent_node_id=:[PATH] The ID of a parent node in the hierarchy."
                    "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      compositesTreesEdlHierarchyVParentNodeIdChildrenPut)
        local -a _op_arguments
        _op_arguments=(
          "parent_node_id=:[PATH] The ID of a parent node in the hierarchy."
                    "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      configurationComponentTypeAndRecordNameGet)
        local -a _op_arguments
        _op_arguments=(
          "component_type_and_record_name=:[PATH] The component type name (&#39;Picklist&#39;, &#39;Docfield&#39;, &#39;Doctype&#39;, etc.) followed by the name of the record from which to retrieve metadata. The format is &#39;{Componenttype}.{record_name}&#39;. For example, &#39;Picklist.color__c&#39;. Find this with the [Retrieve Component Record Collection](https://developer.veevavault.com/api/24.3#Retrieve_Component_Record_Collection) endpoint."
          "loc=:[QUERY] When localized (translated) strings are available, retrieve them by setting loc to true."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      configurationComponentTypeGet)
        local -a _op_arguments
        _op_arguments=(
          "component_type=:[PATH] "
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      configurationObjectNameAndObjectTypeGet)
        local -a _op_arguments
        _op_arguments=(
          "object_name_and_object_type=:[PATH] The object name followed by the object type in the format &#39;Objecttype.{object_name}.{object_type}&#39;. For example, &#39;Objecttype.product__v.base__v&#39;."
          "loc=:[QUERY] When localized (translated) strings are available, retrieve them by setting loc to true."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      configurationObjecttypeGet)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      configurationRoleAssignmentRuleDelete)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      configurationRoleAssignmentRuleGet)
        local -a _op_arguments
        _op_arguments=(
                    "lifecycle__v=:[QUERY] Include the name of the lifecycle from which to retrieve information. For example: lifecycle_v&#x3D;general_lifecycle__c"
"role__v=:[QUERY] Include the name of the role from which to retrieve information. For example: role__v&#x3D;editor__c"
"product__v=:[QUERY] Include the ID/name of a specific product to see product-based override rules to default users/allowed users for the lifecycle role. For example: product__v&#x3D;0PR0011001 or product__v.name__v&#x3D;CholeCap"
"country__v=:[QUERY] Include the ID/name of a specific country to see country-based override rules to default users/allowed users for the lifecycle role. For example: country__v&#x3D;0CR0022002 or country__v.name__v&#x3D;United States"
"study__v=:[QUERY] In eTMF Vaults only. Include the ID/name of a specific study to see study-based override rules to default users/allowed users for the lifecycle role. For example: study__v&#x3D;0ST0021J01 or study__v.name__v&#x3D;CholeCap Study"
"study_country__v=:[QUERY] In eTMF Vaults only. Include the ID/name of a specific study country to see study country-based override rules to default users/allowed users for the lifecycle role. For example: study_country__v&#x3D;0SC0001001 or study_country__v.name__v&#x3D;Germany"
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      configurationRoleAssignmentRulePost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      configurationRoleAssignmentRulePut)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      delegationLoginPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] The sessionId of the currently authenticated user who will initiate the delegated session. Cannot be a delegated_sessionid."
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      delegationVaultsGet)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      keepAlivePost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      limitsGet)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      logsApiUsageGet)
        local -a _op_arguments
        _op_arguments=(
                    "date=:[QUERY] The day to retrieve the API Usage log. Date is in UTC and follows the format YYYY-MM-DD. Date cannot be more than 30 days in the past."
"log_format=:[QUERY] Optional: Specify the format to download. Possible values are csv or logfile. If omitted, defaults to csv. Note that this call always downloads a ZIP file. This parameter only changes the format of the file contained within the ZIP."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      logsCodeDebugGet)
        local -a _op_arguments
        _op_arguments=(
                    "user_id=:[QUERY] Filter results to retrieve the debug log for this user ID only. If omitted, this request retrieves debug logs for all users in the Vault."
"include_inactive=true:[QUERY] Set to &#39;true&#39; to include debug log sessions with a status of &#39;inactive__sys&#39; in the response. If omitted, defaults to &#39;false&#39; and inactive sessions are not included in the response."
          "include_inactive=false:[QUERY] Set to &#39;true&#39; to include debug log sessions with a status of &#39;inactive__sys&#39; in the response. If omitted, defaults to &#39;false&#39; and inactive sessions are not included in the response."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      logsCodeDebugIdActionsResetDelete)
        local -a _op_arguments
        _op_arguments=(
          "id=:[PATH] The ID of the debug log to delete."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      logsCodeDebugIdActionsResetPost)
        local -a _op_arguments
        _op_arguments=(
          "id=:[PATH] The ID of the debug log to delete."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      logsCodeDebugIdFilesGet)
        local -a _op_arguments
        _op_arguments=(
          "id=:[PATH] The ID of the debug log to download."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      logsCodeDebugIdGet)
        local -a _op_arguments
        _op_arguments=(
          "id=:[PATH] The ID of the debug log to retrieve."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      logsCodeDebugPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      logsCodeRuntimeGet)
        local -a _op_arguments
        _op_arguments=(
                    "date=:[QUERY] "
"log_format=:[QUERY] Optional: Specify the format to download. Possible values are csv or logfile. If omitted, defaults to csv. Note that this call always downloads a ZIP file. This parameter only changes the format of the file contained within the ZIP."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      messagesMessageTypeActionsImportPost)
        local -a _op_arguments
        _op_arguments=(
          "message_type=:[PATH] The message type name: field_labels__sys, system_messages__sys, notification_template_messages__sys, or user_account_messages__sys."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      messagesMessageTypeLanguageLangActionsExportPost)
        local -a _op_arguments
        _op_arguments=(
          "message_type=:[PATH] The message type name: field_labels__sys, system_messages__sys, notification_template_messages__sys, or user_account_messages__sys."
"lang=:[PATH] A valid language code value, for example, en. Retrieve available values from the Admin Key (admin_key__sys) field on the Language (language__sys) object. Active and Inactive languages are both valid."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      metadataAudittrailAuditTrailTypeGet)
        local -a _op_arguments
        _op_arguments=(
          "audit_trail_type=:[PATH] The name of the specified audit type (document_audit_trail, object_audit_trail, etc)."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      metadataAudittrailGet)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      metadataComponentsComponentTypeGet)
        local -a _op_arguments
        _op_arguments=(
          "component_type=:[PATH] The component type name (Picklist, Docfield, Doctype, etc.)."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      metadataComponentsGet)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      metadataObjectsBindersTemplatesBindernodesGet)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      metadataObjectsBindersTemplatesGet)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet)
        local -a _op_arguments
        _op_arguments=(
          "placemark_type=:[PATH] The name of the placemark type. For example, sticky__sys."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet)
        local -a _op_arguments
        _op_arguments=(
          "reference_type=:[PATH] "
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet)
        local -a _op_arguments
        _op_arguments=(
          "annotation_type=:[PATH] The name of the annotation type. Valid annotation types include:
&#39;note__sys&#39;
&#39;line__sys&#39;
&#39;document_link__sys&#39;
&#39;permalink_link__sys&#39;
&#39;anchor__sys&#39;
&#39;reply__sys&#39;
&#39;external_link__sys&#39;

The following annotation types are only valid in Medical and PromoMats Vaults:

&#39;suggested_link__sys&#39;
&#39;approved_link__sys&#39;
&#39;auto_link__sys&#39;
&#39;keyword_link__sys&#39;"
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet)
        local -a _op_arguments
        _op_arguments=(
          "event_type=:[PATH] The event type. For example, distribution__v."
"event_subtype=:[PATH] The event subtype. For example, approved_email__v."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      metadataObjectsDocumentsEventsGet)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      metadataObjectsDocumentsLockGet)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      metadataObjectsDocumentsPropertiesFindCommonPost)
        local -a _op_arguments
        _op_arguments=(
                              "Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"Authorization\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      metadataObjectsDocumentsPropertiesGet)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      metadataObjectsDocumentsTemplatesGet)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      metadataObjectsDocumentsTypesGet)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      metadataObjectsDocumentsTypesTypeGet)
        local -a _op_arguments
        _op_arguments=(
          "type=:[PATH] The document type. See Retrieve Document Types."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      metadataObjectsDocumentsTypesTypeRelationshipsGet)
        local -a _op_arguments
        _op_arguments=(
          "type=:[PATH] The document type. See Retrieve Document Types."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet)
        local -a _op_arguments
        _op_arguments=(
          "type=:[PATH] The document type. See Retrieve Document Types."
"subtype=:[PATH] The document subtype. See Retrieve Document Types."
"classification=:[PATH] The document classification. See Retrieve Document Types."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet)
        local -a _op_arguments
        _op_arguments=(
          "type=:[PATH] The document type. See Retrieve Document Types."
"subtype=:[PATH] The document subtype. See Retrieve Document Types."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      metadataObjectsGroupsGet)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      metadataObjectsSecuritypoliciesGet)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      metadataObjectsUsersGet)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      metadataVobjectsGet)
        local -a _op_arguments
        _op_arguments=(
                    "loc=true:[QUERY] To retrieve localized (translated) strings, include the parameter loc&#x3D;true. See the next request below for details."
          "loc=false:[QUERY] To retrieve localized (translated) strings, include the parameter loc&#x3D;true. See the next request below for details."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      metadataVobjectsObjectNameActionsCanceldeploymentPost)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] "
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      metadataVobjectsObjectNameFieldsObjectFieldNameGet)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The object name__v field value (product__v, country__v, custom_object__c, etc.)."
"object_field_name=:[PATH] The object field name value (id, name__v, external_id__v, etc.)."
          "loc=true:[QUERY] To retrieve localized (translated) strings, include the parameter loc&#x3D;true. See the next request below for details."
          "loc=false:[QUERY] To retrieve localized (translated) strings, include the parameter loc&#x3D;true. See the next request below for details."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      metadataVobjectsObjectNameGet)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The object name__v field value (product__v, country__v, custom_object__c, etc.)."
          "loc=true:[QUERY] To retrieve localized (translated) strings, include the parameter loc&#x3D;true. See the next request below for details."
          "loc=false:[QUERY] To retrieve localized (translated) strings, include the parameter loc&#x3D;true. See the next request below for details."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      metadataVobjectsObjectNamePageLayoutsGet)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] "
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      metadataVobjectsObjectNamePageLayoutsLayoutNameGet)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The name of the object from which to retrieve page layout metadata."
"layout_name=:[PATH] The name of the page layout from which to retrieve metadata."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      notificationsHistoriesGet)
        local -a _op_arguments
        _op_arguments=(
                    "start_date=:[QUERY] Specify a start date to retrieve notification history. This date cannot be more than 2 years ago. Dates must be in YYYY-MM-DD or YYYY-MM-DDTHH:mm:ssZ format. If time is omitted (THH:mm:ssZ), defaults to the start of the day. If start_date is omitted entirely, defaults to the start of the previous day.
If you’ve specified a start_date, you must also specify an end_date."
"end_date=:[QUERY] Specify an end date to retrieve notification history. This date cannot be more than 30 days away from the specified start_date. Dates must be in YYYY-MM-DD or YYYY-MM-DDTHH:mm:ssZ format. If time is omitted (THH:mm:ssZ), defaults to the time of the API request.
If you’ve specified an end_date, you must also specify a start_date."
"all_dates=true:[QUERY] Set to true to request notification history for all dates. This is the same as requesting a full CSV export from the Vault UI. When requesting a full notification history, you must leave start_date and end_date blank and set format_result to csv. You can request an export of notification history for all_dates once every 24 hours."
          "all_dates=false:[QUERY] Set to true to request notification history for all dates. This is the same as requesting a full CSV export from the Vault UI. When requesting a full notification history, you must leave start_date and end_date blank and set format_result to csv. You can request an export of notification history for all_dates once every 24 hours."
"format_result=:[QUERY] To request a downloadable CSV file of your notification history, set this parameter to csv. The response contains a jobId to retrieve the job status, which provides a link to download the CSV file. If omitted, the API returns a JSON response with notification history and does not start a job. If all_dates is true, this parameter must be csv."
"limit=:[QUERY] Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200."
"offset=:[QUERY] Paginate the results displayed per page by specifying the amount of offset from the entry returned. If omitted, defaults to 0."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectWorkflowActionsActionGet)
        local -a _op_arguments
        _op_arguments=(
          "action=:[PATH] "
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectWorkflowActionsActionPost)
        local -a _op_arguments
        _op_arguments=(
          "action=:[PATH] "
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectWorkflowActionsCanceltasksPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectWorkflowActionsCancelworkflowsPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectWorkflowActionsGet)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectWorkflowActionsReassigntasksPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectWorkflowActionsReplaceworkflowownerPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersActionsExportJobIdResultsGet)
        local -a _op_arguments
        _op_arguments=(
          "job_id=:[PATH] The id value of the requested export job. This is returned with the export binder requests above."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersBinderIdActionsExportPost)
        local -a _op_arguments
        _op_arguments=(
          "binder_id=:[PATH] The binder id field value."
          "source=true:[QUERY] to include source content or not"
          "source=false:[QUERY] to include source content or not"
"renditiontype=:[QUERY] to include viewable renditions"
"docversion=:[QUERY] to include all major versions"
"attachments=:[QUERY] to include all versions of attachments"
"export=:[QUERY] configurable filename metadata"
"docfield=true:[QUERY] to exclude document metadata csv"
          "docfield=false:[QUERY] to exclude document metadata csv"
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersBinderIdActionsPost)
        local -a _op_arguments
        _op_arguments=(
          "binder_id=:[PATH] The binder id field value."
                    "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersBinderIdBindingRulePut)
        local -a _op_arguments
        _op_arguments=(
          "binder_id=:[PATH] The binder id field value."
                    "Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"Authorization\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersBinderIdDelete)
        local -a _op_arguments
        _op_arguments=(
          "binder_id=:[PATH] The binder id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersBinderIdDocumentsNodeIdBindingRulePut)
        local -a _op_arguments
        _op_arguments=(
          "binder_id=:[PATH] The binder id field value."
"node_id=:[PATH] The binder node id field value."
                    "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersBinderIdDocumentsPost)
        local -a _op_arguments
        _op_arguments=(
          "binder_id=:[PATH] The binder id field value."
                    "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersBinderIdDocumentsSectionIdDelete)
        local -a _op_arguments
        _op_arguments=(
          "binder_id=:[PATH] The binder id field value."
"section_id=:[PATH] The binder node id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersBinderIdDocumentsSectionIdPut)
        local -a _op_arguments
        _op_arguments=(
          "binder_id=:[PATH] The binder id field value."
"section_id=:[PATH] The binder node id field value."
                    "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersBinderIdGet)
        local -a _op_arguments
        _op_arguments=(
          "binder_id=:[PATH] The binder id field value."
          "depth=:[QUERY] To retrieve all information in all levels of the binder, set this to all. By default, only one level is returned."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersBinderIdPost)
        local -a _op_arguments
        _op_arguments=(
          "binder_id=:[PATH] The binder id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersBinderIdPut)
        local -a _op_arguments
        _op_arguments=(
          "binder_id=:[PATH] The binder id field value."
                    "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete)
        local -a _op_arguments
        _op_arguments=(
          "binder_id=:[PATH] The id value of the binder from which to remove roles."
"role_name_and_user_or_group=:[PATH] The name of the role from which to remove the user or group followed by either &#39;user&#39; or &#39;group&#39;. The format is &#39;{role_name}.{user_or_group}&#39;. For example, &#39;consumer__v.user&#39;."
"id=:[PATH] The id value of the user or group to remove from the role."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersBinderIdSectionsNodeIdBindingRulePut)
        local -a _op_arguments
        _op_arguments=(
          "binder_id=:[PATH] The binder id field value."
"node_id=:[PATH] The binder node id field value."
                    "Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"Authorization\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersBinderIdSectionsNodeIdPut)
        local -a _op_arguments
        _op_arguments=(
          "binder_id=:[PATH] The binder id field value."
"node_id=:[PATH] The binder node id of the section."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersBinderIdSectionsPost)
        local -a _op_arguments
        _op_arguments=(
          "binder_id=:[PATH] The binder id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersBinderIdSectionsSectionIdDelete)
        local -a _op_arguments
        _op_arguments=(
          "binder_id=:[PATH] The binder id field value."
"section_id=:[PATH] The binder node id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersBinderIdSectionsSectionIdGet)
        local -a _op_arguments
        _op_arguments=(
          "binder_id=:[PATH] The binder id field value."
"section_id=:[PATH] The binder node id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersBinderIdVersionsGet)
        local -a _op_arguments
        _op_arguments=(
          "binder_id=:[PATH] The binder id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost)
        local -a _op_arguments
        _op_arguments=(
          "binder_id=:[PATH] The binder id field value."
"major_version=:[PATH] The binder major_version_number__v field value."
"minor_version=:[PATH] The binder minor_version_number__v field value."
          "source=true:[QUERY] to include source content or not"
          "source=false:[QUERY] to include source content or not"
"renditiontype=:[QUERY] to include viewable renditions"
"docversion=:[QUERY] to include all major versions"
"attachments=:[QUERY] to include all versions of attachments"
"export=:[QUERY] configurable filename metadata"
"docfield=true:[QUERY] to exclude document metadata csv"
          "docfield=false:[QUERY] to exclude document metadata csv"
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete)
        local -a _op_arguments
        _op_arguments=(
          "binder_id=:[PATH] The binder id field value."
"major_version=:[PATH] The binder major_version_number__v field value."
"minor_version=:[PATH] The binder minor_version_number__v field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersBinderIdVersionsMajorVersionMinorVersionGet)
        local -a _op_arguments
        _op_arguments=(
          "binder_id=:[PATH] The binder id field value."
"major_version=:[PATH] The binder major_version_number__v field value."
"minor_version=:[PATH] The binder minor_version_number__v field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersBinderIdVersionsMajorVersionMinorVersionPut)
        local -a _op_arguments
        _op_arguments=(
          "binder_id=:[PATH] The binder id field value."
"major_version=:[PATH] The binder major_version_number__v field value."
"minor_version=:[PATH] The binder minor_version_number__v field value."
                    "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost)
        local -a _op_arguments
        _op_arguments=(
          "binder_id=:[PATH] The binder id field value."
"major_version=:[PATH] The binder major_version_number__v field value."
"minor_version=:[PATH] The binder minor_version_number__v field value."
                    "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete)
        local -a _op_arguments
        _op_arguments=(
          "binder_id=:[PATH] The binder id field value."
"major_version=:[PATH] The binder major_version_number__v field value."
"minor_version=:[PATH] The binder minor_version_number__v field value."
"relationship_id=:[PATH] The binder relationship id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet)
        local -a _op_arguments
        _op_arguments=(
          "binder_id=:[PATH] The binder id field value."
"major_version=:[PATH] The binder major_version_number__v field value."
"minor_version=:[PATH] The binder minor_version_number__v field value."
"relationship_id=:[PATH] The binder relationship id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet)
        local -a _op_arguments
        _op_arguments=(
          "binder_id=:[PATH] The binder id field value."
"major_version=:[PATH] The binder major_version_number__v field value."
"minor_version=:[PATH] The binder minor_version_number__v field value."
"section_id=:[PATH] Retrieve all sections (documents and subsections) in a binder’s sub-level node. If not included, all sections from the binder’s top-level root node will be returned."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersIdRolesGet)
        local -a _op_arguments
        _op_arguments=(
          "id=:[PATH] "
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersIdRolesPost)
        local -a _op_arguments
        _op_arguments=(
          "id=:[PATH] "
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersIdRolesRoleNameGet)
        local -a _op_arguments
        _op_arguments=(
          "id=:[PATH] The binder &#39;id&#39;."
"role_name=:[PATH] The name of the role to retrieve. For example, &#39;owner__v&#39;."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet)
        local -a _op_arguments
        _op_arguments=(
          "id=:[PATH] The binder id field value from which to retrieve available user actions."
"major_version=:[PATH] The major version number of the binder."
"minor_version=:[PATH] The minor version number of the binder."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet)
        local -a _op_arguments
        _op_arguments=(
          "id=:[PATH] The binder id field value from which to retrieve available user actions."
"major_version=:[PATH] The major version number of the binder."
"minor_version=:[PATH] The minor version number of the binder."
"name__v=:[PATH] The lifecycle name__v field value from which to retrieve entry criteria. This is retrieved from the Retrieve User Actions request above."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut)
        local -a _op_arguments
        _op_arguments=(
          "id=:[PATH] The binder id field value from which to retrieve available user actions."
"major_version=:[PATH] The major version number of the binder."
"minor_version=:[PATH] The minor version number of the binder."
"name__v=:[PATH] The action name__v field value to initiate. This is retrieved from the Retrieve User Action request."
                    "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersLifecycleActionsPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersLifecycleActionsUserActionNamePut)
        local -a _op_arguments
        _op_arguments=(
          "user_action_name=:[PATH] The user action name__v field value. Find this value with the Retrieve User Actions on Multiple Binders endpoint."
                    "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersPost)
        local -a _op_arguments
        _op_arguments=(
                    "async=true:[QUERY] When creating a binder, the binder metadata is indexed synchronously by default. To process the indexing asynchronously, include a query parameter async set to true (objects/binders?async&#x3D;true). This helps speed up the response time from Vault when processing large amounts of data."
          "async=false:[QUERY] When creating a binder, the binder metadata is indexed synchronously by default. To process the indexing asynchronously, include a query parameter async set to true (objects/binders?async&#x3D;true). This helps speed up the response time from Vault when processing large amounts of data."
          "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersTemplatesGet)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersTemplatesPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersTemplatesPut)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersTemplatesTemplateNameBindernodesGet)
        local -a _op_arguments
        _op_arguments=(
          "template_name=:[PATH] The binder template name__v field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersTemplatesTemplateNameBindernodesPost)
        local -a _op_arguments
        _op_arguments=(
          "template_name=:[PATH] The binder template name__v field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersTemplatesTemplateNameBindernodesPut)
        local -a _op_arguments
        _op_arguments=(
          "template_name=:[PATH] The binder template name__v field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersTemplatesTemplateNameDelete)
        local -a _op_arguments
        _op_arguments=(
          "template_name=:[PATH] The binder template name__v field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsBindersTemplatesTemplateNameGet)
        local -a _op_arguments
        _op_arguments=(
          "template_name=:[PATH] The binder template name__v field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDeletionsDocumentsGet)
        local -a _op_arguments
        _op_arguments=(
                    "start_date=:[QUERY] Specify a date (no more than 30 days past) after which Vault will look for deleted documents. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z"
"end_date=:[QUERY] Specify a date (no more than 30 days past) before which Vault will look for deleted documents. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2016 would use 2016-01-15T07:00:00Z"
          "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDeletionsVobjectsObjectNameGet)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The object name__v field value (product__v, country__v, custom_object__c, etc.)."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsActionsGet)
        local -a _op_arguments
        _op_arguments=(
                    "loc=true:[QUERY] When localized (translated) strings are available, retrieve them by setting loc to true."
          "loc=false:[QUERY] When localized (translated) strings are available, retrieve them by setting loc to true."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet)
        local -a _op_arguments
        _op_arguments=(
          "lifecycle_and_state_and_action=:[PATH] The &#39;name__v&#39; values for the lifecycle, state, and action in the format &#39;{lifecycle_name}.{state_name}.{action_name}&#39;. To get this value, [Retrieve the Job Status](https://developer.veevavault.com/api/24.3#RetrieveJobStatus) and find the &#39;href&#39; under the &#39;artifacts&#39; link."
"job_id=:[PATH] "
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsActionsWorkflowNameGet)
        local -a _op_arguments
        _op_arguments=(
          "workflow_name=:[PATH] The document workflow name value."
          "loc=true:[QUERY] When localized (translated) strings are available, retrieve them by setting loc to true."
          "loc=false:[QUERY] When localized (translated) strings are available, retrieve them by setting loc to true."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsActionsWorkflowNamePost)
        local -a _op_arguments
        _op_arguments=(
          "workflow_name=:[PATH] The document workflow name value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsAnnotationsBatchDelete)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsAnnotationsBatchPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsAnnotationsBatchPut)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsAnnotationsRepliesBatchPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsAttachmentsBatchDelete)
        local -a _op_arguments
        _op_arguments=(
                              "Accept\::[HEADER] "
"Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsAttachmentsBatchPost)
        local -a _op_arguments
        _op_arguments=(
                              "Accept\::[HEADER] "
"Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsAttachmentsBatchPut)
        local -a _op_arguments
        _op_arguments=(
                              "Accept\::[HEADER] "
"Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsBatchActionsFileextractJobIdResultsGet)
        local -a _op_arguments
        _op_arguments=(
          "job_id=:[PATH] The id value of the requested export job. This is returned with the export document requests."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsBatchActionsFileextractPost)
        local -a _op_arguments
        _op_arguments=(
                    "source=true:[QUERY] Optional: To exclude source files, include a query parameter source&#x3D;false. If omitted, defaults to true."
          "source=false:[QUERY] Optional: To exclude source files, include a query parameter source&#x3D;false. If omitted, defaults to true."
"renditions=true:[QUERY] Optional: To include renditions, include a query parameter renditions&#x3D;true. If omitted, defaults to false."
          "renditions=false:[QUERY] Optional: To include renditions, include a query parameter renditions&#x3D;true. If omitted, defaults to false."
"allversions=true:[QUERY] Optional: To include all versions or latest version, include a query parameter allversions&#x3D;true. If omitted, defaults to false."
          "allversions=false:[QUERY] Optional: To include all versions or latest version, include a query parameter allversions&#x3D;true. If omitted, defaults to false."
          "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsBatchActionsReclassifyPut)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-MigrationMode\::[HEADER] When set to true, Vault allows you to manually set the document number and to update documents to any lifecycle state using the status__v field. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message.  You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt;"
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsBatchActionsRerenderPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsBatchDelete)
        local -a _op_arguments
        _op_arguments=(
                    "idParam=:[QUERY] If you’re identifying documents in your input by their external ID"
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsBatchLockDelete)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsBatchPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-MigrationMode\::[HEADER] When set to true, Vault allows you to create documents in any lifecycle state using the status__v field, and to manually set the name, document number, and version number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt;"
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsBatchPut)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-MigrationMode\::[HEADER] When set to true, Vault allows you to change the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header.Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt;"
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdAnchorsGet)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdAnnotationsFileGet)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdAnnotationsFilePost)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdAttachmentsAttachmentIdDelete)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
"attachment_id=:[PATH] The attachment id field value."
                    "Accept\::[HEADER] "
"Authorization\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdAttachmentsAttachmentIdFileGet)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
"attachment_id=:[PATH] The attachment id field value."
                    "Accept\::[HEADER] "
"Authorization\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdAttachmentsAttachmentIdGet)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
"attachment_id=:[PATH] The attachment id field value."
                    "Accept\::[HEADER] "
"Authorization\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdAttachmentsAttachmentIdPut)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
"attachment_id=:[PATH] The attachment id field value."
                    "Accept\::[HEADER] "
"Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
"attachment_id=:[PATH] The attachment id field value."
"attachment_version=:[PATH] The attachment version__v field value."
                    "Accept\::[HEADER] "
"Authorization\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
"attachment_id=:[PATH] The attachment id field value."
"attachment_version=:[PATH] The attachment version__v field value."
                    "Accept\::[HEADER] "
"Authorization\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
"attachment_id=:[PATH] The attachment id field value."
"attachment_version=:[PATH] The attachment version__v field value."
                    "Accept\::[HEADER] "
"Authorization\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
"attachment_id=:[PATH] The attachment id field value."
"attachment_version=:[PATH] The attachment version__v field value."
          "restore=true:[QUERY] The parameter restore must be set to true."
          "restore=false:[QUERY] The parameter restore must be set to true."
          "Accept\::[HEADER] "
"Authorization\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
"attachment_id=:[PATH] The attachment id field value."
                    "Accept\::[HEADER] "
"Authorization\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdAttachmentsFileGet)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
                    "Accept\::[HEADER] "
"Authorization\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdAttachmentsGet)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
                    "Accept\::[HEADER] "
"Authorization\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdAttachmentsPost)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
                    "Accept\::[HEADER] "
"Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdAudittrailGet)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document ID for which to retrieve audit history."
          "start_date=:[QUERY] Specify a start date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to the vault’s creation date."
"end_date=:[QUERY] Specify an end date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to today’s date."
"format_result=:[QUERY] To request a CSV file of your audit history, use csv."
"limit=:[QUERY] Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200."
"offset=:[QUERY] Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0."
"events=:[QUERY] Provide a comma-separated list of one or more audit events to retrieve their audit history. See Vault Help for a full list of document audit events. The values passed to this parameter are case sensitive. For example, events&#x3D;WorkflowCompletion,TaskAssignment. If omitted, defaults to all audit events."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdDelete)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdEventsGet)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdFileGet)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
          "lockDocument=true:[QUERY] Set to true to Check Out this document before retrieval. If omitted, defaults to false."
          "lockDocument=false:[QUERY] Set to true to Check Out this document before retrieval. If omitted, defaults to false."
          "Accept\::[HEADER] "
"Authorization\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdGet)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdLockDelete)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdLockGet)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdLockPost)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
"major_version=:[PATH] The document major_version_number__v field value."
"minor_version=:[PATH] The document minor_version_number__v field value."
                    "Accept\::[HEADER] "
"Authorization\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdPost)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
          "suppressRendition=:[QUERY] Set to true to suppress automatic generation of the viewable rendition. If omitted, defaults to false"
          "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdPut)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
                    "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-MigrationMode\::[HEADER] When set to true, Vault allows you to change the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt;"
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdRenditionsGet)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdRenditionsRenditionTypeDelete)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
"rendition_type=:[PATH] The document rendition type."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdRenditionsRenditionTypeGet)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
"rendition_type=:[PATH] The document rendition type."
          "steadyState=:[QUERY] Set to true to download a rendition (file) from the latest steady state version (1.0, 2.0, etc.) of a document."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdRenditionsRenditionTypePost)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
"rendition_type=:[PATH] The document rendition type."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdRenditionsRenditionTypePut)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
"rendition_type=:[PATH] The document rendition type."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The id value of the document from which to remove roles."
"role_name_and_user_or_group=:[PATH] The name of the role from which to remove the user or group followed by either &#39;user&#39; or &#39;group&#39;. The format is &#39;{role_name}.{user_or_group}&#39;. For example, &#39;consumer__v.user&#39;."
"id=:[PATH] The id value of the user or group to remove from the role."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
"major_version=:[PATH] The document major_version_number__v field value."
"minor_version=:[PATH] The document minor_version_number__v field value."
                    "Accept\::[HEADER] "
"Authorization\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdVersionsGet)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
"major_version=:[PATH] The document major_version_number__v field value."
"minor_version=:[PATH] The document minor_version_number__v field value."
"annotation_id=:[PATH] The annotation ID, which can be retrieved with Read Annotations by Document Version and Type."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
"major_version=:[PATH] The document major_version_number__v field value."
"minor_version=:[PATH] The document minor_version_number__v field value."
"annotation_id=:[PATH] The parent annotation ID, which can be retrieved with Read Annotations by Document Version and Type."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
"major_version=:[PATH] The document major_version_number__v field value."
"minor_version=:[PATH] The document minor_version_number__v field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
"major_version=:[PATH] The document major_version_number__v field value."
"minor_version=:[PATH] The document minor_version_number__v field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
"major_version=:[PATH] The document major_version_number__v field value."
"minor_version=:[PATH] The document minor_version_number__v field value."
          "limit=:[QUERY] Paginate the results by specifying the maximum number of records per page in the response. This can be any value between 1 and 500. If omitted, defaults to 500. Values greater than 500 are ignored."
"offset=:[QUERY] This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to offset&#x3D;201."
"annotation_types=:[QUERY] The type(s) of annotations to retrieve. For example, note__sys,anchor__sys. If omitted, Vault returns all annotations. Valid annotation types include:
&#39;note__sys&#39;
&#39;line__sys&#39;
&#39;document_link__sys&#39;
&#39;permalink_link__sys&#39;
&#39;anchor__sys&#39;
&#39;reply__sys&#39;
&#39;external_link__sys&#39;

The following annotation types are only valid in PromoMats Vaults:

&#39;suggested_link__sys&#39;
&#39;approved_link__sys&#39;
&#39;auto_link__sys&#39;
&#39;keyword_link__sys&#39;"
"pagination_id=:[QUERY] A unique identifier used to load requests with paginated results."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
"major_version=:[PATH] The document major_version_number__v field value."
"minor_version=:[PATH] The document minor_version_number__v field value."
"attachment_id=:[PATH] The id field value of the attachment."
"attachment_version=:[PATH] The version of the attachment."
                    "Accept\::[HEADER] "
"Authorization\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
"major_version=:[PATH] The document major_version_number__v field value."
"minor_version=:[PATH] The document minor_version_number__v field value."
"attachment_id=:[PATH] The id of the document attachment to retrieve."
"attachment_version=:[PATH] Optional: The version of the attachment to retrieve. If omitted, the endpoint retrieves all versions of the specified attachment."
                    "Accept\::[HEADER] "
"Authorization\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
"major_version=:[PATH] The document major_version_number__v field value."
"minor_version=:[PATH] The document minor_version_number__v field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
"major_version=:[PATH] The document major_version_number__v field value."
"minor_version=:[PATH] The document minor_version_number__v field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
"major_version=:[PATH] The document major_version_number__v field value."
"minor_version=:[PATH] The document minor_version_number__v field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The video document id field value."
"major_version=:[PATH] The video document major_version_number__v field value."
"minor_version=:[PATH] The video document minor_version_number__v field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] This &#39;Accept&#39; header only changes the format of the response in the case of an error. On &#39;SUCCESS&#39;, the HTTP Response Header &#39;Content-Type&#39; is set to &#39;text/plain;charset&#x3D;UnicodeLittle&#39;."
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
"major_version=:[PATH] The document major_version_number__v field value."
"minor_version=:[PATH] The document minor_version_number__v field value."
                    "Accept\::[HEADER] "
"Authorization\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
"major_version=:[PATH] The document major_version_number__v field value."
"minor_version=:[PATH] The document minor_version_number__v field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
"major_version=:[PATH] The document major_version_number__v field value."
"minor_version=:[PATH] The document minor_version_number__v field value."
                    "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-MigrationMode\::[HEADER] When set to true, Vault allows you to manually set the document number. All other Document Migration Mode overrides available at document creation are ignored, but do not generate an error message. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt;"
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
"major_version=:[PATH] The document major_version_number__v field value."
"minor_version=:[PATH] The document minor_version_number__v field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
"major_version=:[PATH] The document major_version_number__v field value."
"minor_version=:[PATH] The document minor_version_number__v field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
"major_version=:[PATH] The document major_version_number__v field value."
"minor_version=:[PATH] The document minor_version_number__v field value."
"relationship_id=:[PATH] The relationship id field value. See Retrieve Document Relationships."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
"major_version=:[PATH] The document major_version_number__v field value."
"minor_version=:[PATH] The document minor_version_number__v field value."
"relationship_id=:[PATH] The relationship id field value. See Retrieve Document Relationships."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
"major_version=:[PATH] The document major_version_number__v field value."
"minor_version=:[PATH] The document minor_version_number__v field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
"major_version=:[PATH] The document major_version_number__v field value."
"minor_version=:[PATH] The document minor_version_number__v field value."
"rendition_type=:[PATH] The document rendition type."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
"major_version=:[PATH] The document major_version_number__v field value."
"minor_version=:[PATH] The document minor_version_number__v field value."
"rendition_type=:[PATH] The document rendition type."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
"major_version=:[PATH] The document major_version_number__v field value."
"minor_version=:[PATH] The document minor_version_number__v field value."
"rendition_type=:[PATH] The document rendition type."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
"major_version=:[PATH] The document major_version_number__v field value."
"minor_version=:[PATH] The document minor_version_number__v field value."
"rendition_type=:[PATH] The document rendition type."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet)
        local -a _op_arguments
        _op_arguments=(
          "doc_id=:[PATH] The document id field value."
"major_version=:[PATH] The document major_version_number__v field value."
"minor_version=:[PATH] The document minor_version_number__v field value."
                    "Accept\::[HEADER] "
"Authorization\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsGet)
        local -a _op_arguments
        _op_arguments=(
                    "named_filter=:[QUERY] Retrieves only documents which you have created."
"scope=:[QUERY] Searches only within the document content."
"versionscope=:[QUERY] Retrieves all document versions, rather than only the latest version."
"search=:[QUERY] Search for documents based on a {keyword} in searchable document fields."
"limit=:[QUERY] See VQL documentation for more information."
"sort=:[QUERY] See VQL documentation for more information."
"start=:[QUERY] See VQL documentation for more information."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsIdRolesGet)
        local -a _op_arguments
        _op_arguments=(
          "id=:[PATH] "
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsIdRolesPost)
        local -a _op_arguments
        _op_arguments=(
          "id=:[PATH] "
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsIdRolesRoleNameGet)
        local -a _op_arguments
        _op_arguments=(
          "id=:[PATH] The document &#39;id&#39;."
"role_name=:[PATH] The name of the role to retrieve. For example, &#39;owner__v&#39;."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet)
        local -a _op_arguments
        _op_arguments=(
          "id=:[PATH] The document id field value from which to retrieve available user actions."
"major_version=:[PATH] The major version number of the document."
"minor_version=:[PATH] The minor version number of the document."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet)
        local -a _op_arguments
        _op_arguments=(
          "id=:[PATH] The document id field value from which to retrieve available user actions."
"major_version=:[PATH] The major version number of the document."
"minor_version=:[PATH] The minor version number of the document."
"name__v=:[PATH] The lifecycle name__v field value from which to retrieve entry criteria. This is retrieved from the Retrieve User Actions request above."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut)
        local -a _op_arguments
        _op_arguments=(
          "id=:[PATH] The document id field value from which to retrieve available user actions."
"major_version=:[PATH] The major version number of the document."
"minor_version=:[PATH] The minor version number of the document."
"name__v=:[PATH] The action name__v field value to initiate. This is retrieved from the Retrieve User Action request."
                    "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsLifecycleActionsPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsLifecycleActionsUserActionNamePut)
        local -a _op_arguments
        _op_arguments=(
          "user_action_name=:[PATH] The user action name__v field value. Find this value with the Retrieve User Actions on Multiple Documents endpoint."
                    "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-MigrationMode\::[HEADER] When set to true,  you can use the status__v field to create documents in any lifecycle state. Additionally, you can manually set the name, document number, and version number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt;"
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsRelationshipsBatchDelete)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsRelationshipsBatchPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsRenditionsBatchDelete)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsRenditionsBatchPost)
        local -a _op_arguments
        _op_arguments=(
                    "idParam=:[QUERY] If you’re identifying documents in your input by their external ID"
"largeSizeAsset=:[QUERY] If set to true, indicates that the renditions to add are of the Large Size Asset (large_size_asset__v) rendition type. Vault applies Document Migration Mode limitations to renditions created with the request, but Document Migration permission is not required and your vault need not be in Migration Mode to use the parameter. Note that the request results in an error if the CSV contains any rendition type other than large_size_asset__v."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-MigrationMode\::[HEADER] Must be set to true when importing any rendition type other than large_size_asset__v. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt;"
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsRolesBatchDelete)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsRolesBatchPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsTemplatesGet)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsTemplatesPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsTemplatesPut)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsTemplatesTemplateNameDelete)
        local -a _op_arguments
        _op_arguments=(
          "template_name=:[PATH] The document template name__v field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsTemplatesTemplateNameFileGet)
        local -a _op_arguments
        _op_arguments=(
          "template_name=:[PATH] The document template name__v field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsTemplatesTemplateNameGet)
        local -a _op_arguments
        _op_arguments=(
          "template_name=:[PATH] The document template name__v field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsTemplatesTemplateNamePut)
        local -a _op_arguments
        _op_arguments=(
          "template_name=:[PATH] The document template name__v field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsTokensPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsVersionsBatchActionsFileextractPost)
        local -a _op_arguments
        _op_arguments=(
                    "source=true:[QUERY] Optional: To exclude source files, include a query parameter source&#x3D;false. If omitted, defaults to true."
          "source=false:[QUERY] Optional: To exclude source files, include a query parameter source&#x3D;false. If omitted, defaults to true."
"renditions=true:[QUERY] Optional: To include renditions, include a query parameter renditions&#x3D;true. If omitted, defaults to false."
          "renditions=false:[QUERY] Optional: To include renditions, include a query parameter renditions&#x3D;true. If omitted, defaults to false."
          "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsVersionsBatchDelete)
        local -a _op_arguments
        _op_arguments=(
                    "idParam=:[QUERY] If you’re identifying documents in your input by their external ID"
          "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDocumentsVersionsBatchPost)
        local -a _op_arguments
        _op_arguments=(
                    "idParam=:[QUERY] If you’re identifying documents in your input by their external ID"
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-MigrationMode\::[HEADER] Must be set to true. Vault allows you to manually set the name and version number and to create documents in any lifecycle state using the &#39;status__v&#39; field, but does not allow you to change the document number. Vault also bypasses entry criteria, entry actions, and event actions. You must have the Document Migration permission to use this header. Learn more about &lt;a href&#x3D;\&quot;https://platform.veevavault.help/en/gr/54028\&quot;&gt;Document Migration Mode in Vault Help.&lt;/a&gt;"
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDomainGet)
        local -a _op_arguments
        _op_arguments=(
                    "include_application=true:[QUERY] To include Vault application type information in the response, set include_application to true. If omitted, defaults to false and application information is not included."
          "include_application=false:[QUERY] To include Vault application type information in the response, set include_application to true. If omitted, defaults to false and application information is not included."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsDomainsGet)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsEdlMatchedDocumentsBatchActionsAddPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsEdlMatchedDocumentsBatchActionsRemovePost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsGroupsAutoGet)
        local -a _op_arguments
        _op_arguments=(
                    "limit=:[QUERY] Paginate the results by specifying the maximum number of records per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 1000."
"offset=:[QUERY] Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsGroupsGet)
        local -a _op_arguments
        _op_arguments=(
                    "includeImplied=:[QUERY] When true, the response includes the implied_members__v field. These users are automatically added to the group when their security_profiles__v are added to the group. If omitted, the response includes only the members__v field. These users are individually added to a group by an Admin."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsGroupsGroupIdDelete)
        local -a _op_arguments
        _op_arguments=(
          "group_id=:[PATH] The group id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsGroupsGroupIdGet)
        local -a _op_arguments
        _op_arguments=(
          "group_id=:[PATH] The group id field value."
          "includeImplied=true:[QUERY] When true, the response includes the implied_members__v field. These users are automatically added to the group when their security_profiles__v are added to the group. When not used, the response includes only the members__v field. These users are individually added to a group by Admin."
          "includeImplied=false:[QUERY] When true, the response includes the implied_members__v field. These users are automatically added to the group when their security_profiles__v are added to the group. When not used, the response includes only the members__v field. These users are individually added to a group by Admin."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsGroupsGroupIdPut)
        local -a _op_arguments
        _op_arguments=(
          "group_id=:[PATH] The group id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsGroupsPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsLicensesGet)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsObjectworkflowsActionsGet)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsObjectworkflowsActionsWorkflowNameGet)
        local -a _op_arguments
        _op_arguments=(
          "workflow_name=:[PATH] "
                    "Authorization\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsObjectworkflowsActionsWorkflowNamePost)
        local -a _op_arguments
        _op_arguments=(
          "workflow_name=:[PATH] "
                    "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsObjectworkflowsGet)
        local -a _op_arguments
        _op_arguments=(
                    "object__v=:[QUERY] To retrieve all workflows configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the participant parameter is not used."
"record_id__v=:[QUERY] To retrieve all workflows configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the participant parameter is not used."
"participant=:[QUERY] To retrieve all workflows available to a particular user, include the user id field value as ?participant&#x3D;{id}. To retrieve your own workflows, set this value to ?participant&#x3D;me. This parameter is required when the object__v and record_id__v parameters are not used."
"status__v=:[QUERY] To retrieve all workflows with specific statuses, include one or more status name__v field values. For example: status__v&#x3D;active__v, status__v&#x3D;active__v,completed__v. Workflows with &#39;status__v&#x3D;active__v&#39; are in progress for the indicated object record. Valid statuses include:
active__v
completed__v
cancelled__v"
"offset=:[QUERY] This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to ?offset&#x3D;201."
"page_size=:[QUERY] This parameter is used to paginate the results. It specifies the size number of records to display per page. Vault returns 200 records per page by default. You can set this value lower or as high as 1000 records per page. For example: ?page_size&#x3D;1000."
"loc=:[QUERY] When localized (translated) strings are available, retrieve them by including ?loc&#x3D;true."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsObjectworkflowsTasksGet)
        local -a _op_arguments
        _op_arguments=(
                    "object__v=:[QUERY] To retrieve all workflow tasks configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the assignee__v parameter is not used."
"record_id__v=:[QUERY] To retrieve all workflow tasks configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the assignee__v parameter is not used."
"assignee__v=:[QUERY] To retrieve all workflow tasks available to a particular user, include the user id field value as ?assignee__v&#x3D;{id}. To retrieve your own workflow tasks, set this value to ?assignee__v&#x3D;me. This parameter is required when the object__v and record_id__v parameters are not used."
"status__v=:[QUERY] To retrieve all workflow tasks with specific statuses, include one or more status name__v field values. For example: ?status__v&#x3D;available__v or ?status__v&#x3D;available__v,completed__v."
"offset=:[QUERY] This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to ?offset&#x3D;201."
"page_size=:[QUERY] This parameter is used to paginate the results. It specifies the size number of records to display per page. Vault returns 200 records per page by default. You can set this value lower or as high as 1000 records per page. For example: ?page_size&#x3D;1000."
"loc=:[QUERY] When localized (translated) strings are available, retrieve them by including ?loc&#x3D;true."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsObjectworkflowsTasksTaskIdActionsAcceptPost)
        local -a _op_arguments
        _op_arguments=(
          "task_id=:[PATH] The task id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsObjectworkflowsTasksTaskIdActionsCancelPost)
        local -a _op_arguments
        _op_arguments=(
          "task_id=:[PATH] The task id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsObjectworkflowsTasksTaskIdActionsCompletePost)
        local -a _op_arguments
        _op_arguments=(
          "task_id=:[PATH] The task id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsObjectworkflowsTasksTaskIdActionsGet)
        local -a _op_arguments
        _op_arguments=(
          "task_id=:[PATH] The task id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost)
        local -a _op_arguments
        _op_arguments=(
          "task_id=:[PATH] The task id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost)
        local -a _op_arguments
        _op_arguments=(
          "task_id=:[PATH] The task id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost)
        local -a _op_arguments
        _op_arguments=(
          "task_id=:[PATH] The task id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost)
        local -a _op_arguments
        _op_arguments=(
          "task_id=:[PATH] The id of the task to reassign."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsObjectworkflowsTasksTaskIdActionsReassignPost)
        local -a _op_arguments
        _op_arguments=(
          "task_id=:[PATH] The id of the task to reassign."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsObjectworkflowsTasksTaskIdActionsTaskActionGet)
        local -a _op_arguments
        _op_arguments=(
          "task_id=:[PATH] The task id field value."
"task_action=:[PATH] The name of the task action retrieved from Retrieve Workflow Task Actions."
          "loc=:[QUERY] When localized (translated) strings are available, retrieve them by including loc&#x3D;true."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost)
        local -a _op_arguments
        _op_arguments=(
          "task_id=:[PATH] The task id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost)
        local -a _op_arguments
        _op_arguments=(
          "task_id=:[PATH] The id of the task."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsObjectworkflowsTasksTaskIdGet)
        local -a _op_arguments
        _op_arguments=(
          "task_id=:[PATH] The task id field value."
          "loc=true:[QUERY] When localized (translated) strings are available, retrieve them by including loc&#x3D;true."
          "loc=false:[QUERY] When localized (translated) strings are available, retrieve them by including loc&#x3D;true."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsObjectworkflowsWorkflowIdActionsGet)
        local -a _op_arguments
        _op_arguments=(
          "workflow_id=:[PATH] The workflow id field value."
          "loc=:[QUERY] When localized (translated) strings are available, retrieve them by including loc&#x3D;true."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet)
        local -a _op_arguments
        _op_arguments=(
          "workflow_id=:[PATH] The workflow id field value."
"workflow_action=:[PATH] The workflow action name retrieved from Retrieve Workflow Actions."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost)
        local -a _op_arguments
        _op_arguments=(
          "workflow_id=:[PATH] The workflow id field value."
"workflow_action=:[PATH] The workflow action name retrieved from Retrieve Workflow Actions."
          "documents__sys=:[QUERY] Include the id or ids as a comma-separated list of the document(s) to be removed from a document workflow when using the removecontent action.
If your workflow_action is remove_content, include the id of the document to remove the workflow. To remove multiple documents, use a comma-separated list of ids."
          "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsObjectworkflowsWorkflowIdGet)
        local -a _op_arguments
        _op_arguments=(
          "workflow_id=:[PATH] The workflow id field value."
          "loc=true:[QUERY] When localized (translated) strings are available, retrieve them by including loc&#x3D;true."
          "loc=false:[QUERY] When localized (translated) strings are available, retrieve them by including loc&#x3D;true."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsPicklistsGet)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsPicklistsPicklistNameGet)
        local -a _op_arguments
        _op_arguments=(
          "picklist_name=:[PATH] The picklist name field value (license_type__v, product_family__c, region__c, etc.)"
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsPicklistsPicklistNamePicklistValueNameDelete)
        local -a _op_arguments
        _op_arguments=(
          "picklist_name=:[PATH] The picklist name field value (license_type__v, product_family__c, region__c, etc.)"
"picklist_value_name=:[PATH] The picklist value name field value (north_america__c, south_america__c, etc.)"
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsPicklistsPicklistNamePicklistValueNamePut)
        local -a _op_arguments
        _op_arguments=(
          "picklist_name=:[PATH] The picklist name field value (license_type__v, product_family__c, region__c, etc.)"
"picklist_value_name=:[PATH] The picklist value name field value (north_america__c, south_america__c, etc.)"
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsPicklistsPicklistNamePost)
        local -a _op_arguments
        _op_arguments=(
          "picklist_name=:[PATH] The picklist name field value (license_type__v, product_family__c, region__c, etc.)"
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsPicklistsPicklistNamePut)
        local -a _op_arguments
        _op_arguments=(
          "picklist_name=:[PATH] The picklist name field value (license_type__v, product_family__c, region__c, etc.)"
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsSandboxActionsBuildproductionPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsSandboxActionsPromoteproductionPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsSandboxActionsRecheckusagePost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsSandboxBatchChangesizePost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsSandboxEntitlementsSetPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsSandboxGet)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsSandboxNameDelete)
        local -a _op_arguments
        _op_arguments=(
          "name=:[PATH] The name of the sandbox vault to delete. This is the name which appears on the My Vaults page."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsSandboxPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsSandboxSnapshotApiNameActionsUpdatePost)
        local -a _op_arguments
        _op_arguments=(
          "api_name=:[PATH] The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsSandboxSnapshotApiNameActionsUpgradePost)
        local -a _op_arguments
        _op_arguments=(
          "api_name=:[PATH] The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsSandboxSnapshotApiNameDelete)
        local -a _op_arguments
        _op_arguments=(
          "api_name=:[PATH] The Vault ID of the sandbox. Obtain this from the Retrieve Sandbox Snapshots request."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsSandboxSnapshotGet)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsSandboxSnapshotPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsSandboxVaultIdActionsRefreshPost)
        local -a _op_arguments
        _op_arguments=(
          "vault_id=:[PATH] The Vault ID of the sandbox to be refreshed."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsSandboxVaultIdGet)
        local -a _op_arguments
        _op_arguments=(
          "vault_id=:[PATH] "
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsSecuritypoliciesGet)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsSecuritypoliciesSecurityPolicyNameGet)
        local -a _op_arguments
        _op_arguments=(
          "security_policy_name=:[PATH] Security policy name__v field value (retrieved from previous request). This is typically a numeric value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsUsersGet)
        local -a _op_arguments
        _op_arguments=(
                    "vaults=:[QUERY] Retrieve all users assigned to all Vaults in your domain."
"exclude_vault_membership=:[QUERY] Optional: Set to false to include vault_membership fields. If true or omitted, vault_membership fields are not included in the response."
"exclude_app_licensing=:[QUERY] Optional: Set to false to include app_licensing fields. If true or omitted, app_licensing fields are not included in the response."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsUsersIdGet)
        local -a _op_arguments
        _op_arguments=(
          "id=:[PATH] The user id field value. Use the value me to get information for the currently authenticated user."
          "exclude_vault_membership=:[QUERY] Optional: Set to true to omit vault_membership fields. If you don’t need these fields, this may increase performance. If omitted, vault_membership fields are included in the response."
"exclude_app_licensing=:[QUERY] Optional: Set to true to omit app_licensing fields. If you don’t need these fields, this may increase performance. If omitted, app_licensing fields are included in the response."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsUsersIdPermissionsGet)
        local -a _op_arguments
        _op_arguments=(
          "id=:[PATH] The ID of the user. Use the value me to retrieve information for the currently authenticated user."
          "filter=:[QUERY] Filter the results to show only one specific name__v, which is in the format object.{object name}.{object or field}_actions. Wildcards are not supported. See example below."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsUsersIdPut)
        local -a _op_arguments
        _op_arguments=(
          "id=:[PATH] The user id field value. Use the value me to get information for the currently authenticated user."
                    "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsUsersMeGet)
        local -a _op_arguments
        _op_arguments=(
                    "exclude_vault_membership=:[QUERY] Optional: Set to true to omit vault_membership fields. If you don’t need these fields, this may increase performance. If omitted, vault_membership fields are included in the response."
"exclude_app_licensing=:[QUERY] Optional: Set to true to omit app_licensing fields. If you don’t need these fields, this may increase performance. If omitted, app_licensing fields are included in the response."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsUsersMePasswordPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsUsersMePermissionsGet)
        local -a _op_arguments
        _op_arguments=(
                    "filter=:[QUERY] Filter the results to show only one specific name__v, which is in the format object.{object name}.{object or field}_actions. Wildcards are not supported. See example below."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsUsersMePut)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsUsersPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsUsersPut)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsUsersUserIdDelete)
        local -a _op_arguments
        _op_arguments=(
          "user_id=:[PATH] The user id field value."
          "domain=true:[QUERY] When true, this disables the user account in all vaults in the domain."
          "domain=false:[QUERY] When true, this disables the user account in all vaults in the domain."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsUsersUserIdVaultMembershipVaultIdPut)
        local -a _op_arguments
        _op_arguments=(
          "user_id=:[PATH] The user id field value."
"vault_id=:[PATH] The system-managed id field value assigned to each vault in the domain."
                    "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsVaultActionsComparePost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      objectsVaultActionsConfigreportPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      queryComponentsPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      queryNextPagePost)
        local -a _op_arguments
        _op_arguments=(
          "next_page=:[PATH] "
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-DescribeQuery\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      queryPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-DescribeQuery\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      queryPreviousPagePost)
        local -a _op_arguments
        _op_arguments=(
          "previous_page=:[PATH] "
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-DescribeQuery\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      scimV2MeGet)
        local -a _op_arguments
        _op_arguments=(
                    "attributes=:[QUERY] Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned."
"excludedAttributes=:[QUERY] Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      scimV2MePut)
        local -a _op_arguments
        _op_arguments=(
                    "attributes=:[QUERY] Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned."
"excludedAttributes=:[QUERY] Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      scimV2ResourceTypesGet)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      scimV2ResourceTypesTypeGet)
        local -a _op_arguments
        _op_arguments=(
          "type=:[PATH] A specific resource type. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the id value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      scimV2SchemasGet)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      scimV2SchemasIdGet)
        local -a _op_arguments
        _op_arguments=(
          "id=:[PATH] The ID of a specific schema. For example, urn:ietf:params:scim:schemas:extension:veevavault:2.0:User."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      scimV2ServiceProviderConfigGet)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      scimV2TypeGet)
        local -a _op_arguments
        _op_arguments=(
          "type=:[PATH] The resource type to retrieve. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the endpoint value."
          "filter=:[QUERY] Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \&quot;{value}\&quot;. For example, to filter for a particular user name, userName eq \&quot;john\&quot;. Complex expressions are not supported, and eq is the only supported operator."
"attributes=:[QUERY] Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned."
"excludedAttributes=:[QUERY] Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded."
"sortBy=:[QUERY] Optional: Specify an attribute or sub-attribute to order the response. For example, you can sort by the displayName attribute, or the name.familyName sub-attribute. If omitted, the response is sorted by id. Note that the following attributes are not supported:
securityPolicy
securityProfile
locale
preferredLanguage"
"sortOrder=:[QUERY] Optional: Specify the number of query results per page, for example, 10. Negative values are treated as 0, and 0 returns no results except for totalResults. If omitted, defaults to 1000."
"startIndex=:[QUERY] Optional: Specify the index of the first result. For example, 10 would omit the first 9 results and begin on result 10. Omission, negative values, and 0 is treated as 1."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      scimV2TypeIdGet)
        local -a _op_arguments
        _op_arguments=(
          "type=:[PATH] The resource type to retrieve. You can retrieve all available types from the Retrieve All SCIM Resource Types endpoint, where the value for this parameter is the endpoint value."
"id=:[PATH] The ID of the resource to retrieve. You can retrieve all resource IDs from a particular resource type with the Retrieve SCIM Resources endpoint. For example, business_admin__v."
          "attributes=:[QUERY] Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned."
"excludedAttributes=:[QUERY] Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      scimV2UsersGet)
        local -a _op_arguments
        _op_arguments=(
                    "filter=:[QUERY] Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \&quot;{value}\&quot;. For example, to filter for a particular user name, userName eq \&quot;john\&quot;. Complex expressions are not supported, and eq is the only supported operator."
"attributes=:[QUERY] Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned."
"excludedAttributes=:[QUERY] Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded."
"sortBy=:[QUERY] Optional: Specify an attribute or sub-attribute to order the response. For example, you can sort by the displayName attribute, or the name.familyName sub-attribute. If omitted, the response is sorted by id. Note that the following attributes are not supported:
securityPolicy
securityProfile
locale
preferredLanguage"
"sortOrder=:[QUERY] Optional: Specify the order in which the sortBy parameter is applied. Allowed values are ascending or descending. If omitted, defaults to ascending."
"count=:[QUERY] Optional: Specify the number of query results per page, for example, 10. Negative values are treated as 0, and 0 returns no results except for totalResults. If omitted, defaults to 1000."
"startIndex=:[QUERY] Optional: Specify the index of the first result. For example, 10 would omit the first 9 results and begin on result 10. Omission, negative values, and 0 is treated as 1."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      scimV2UsersIdGet)
        local -a _op_arguments
        _op_arguments=(
          "id=:[PATH] The id of the user you wish to update."
          "filter=:[QUERY] Optional: Filter for a specific attribute value. Must be in the format {attribute} eq \&quot;{value}\&quot;. For example, to filter for a particular user name, userName eq \&quot;john\&quot;. Complex expressions are not supported, and eq is the only supported operator."
"attributes=:[QUERY] Optional: Include specified attributes only. Enter multiple values in a comma separated list. For example, to include only user name and email in the response, attributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned."
"excludedAttributes=:[QUERY] Optional: Exclude specific attributes from the response. Enter multiple values in a comma separated list. For example, to exclude user name and email from the response, excludedAttributes&#x3D;userName,emails. Note that the schemas and id attributes are always returned and cannot be excluded."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      scimV2UsersIdPut)
        local -a _op_arguments
        _op_arguments=(
          "id=:[PATH] The id of the user you wish to update."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      scimV2UsersPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesCertificateCertIdGet)
        local -a _op_arguments
        _op_arguments=(
          "cert_id=:[PATH] The cert_id is provided in each Spark message in the X-VaultAPISignature-CertificateId header."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesConfigurationModeActionsDisablePost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesConfigurationModeActionsEnablePost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesDirectdataFilesGet)
        local -a _op_arguments
        _op_arguments=(
                    "extract_type=:[QUERY] The Direct Data file type: incremental_directdata, full_directdata, or log_directdata. If omitted, returns all files."
"start_time=:[QUERY] Specify a time in YYYY-MM-DDTHH:MM:SSZ format. For example, 7AM on January 15, 2024 would use 2024-01-15T07:00:00Z. If omitted, defaults to the Vault’s creation date and time."
"stop_time=:[QUERY] Specify a time in YYYY-MM-DDTHH:MM:SSZ format. For example, 9AM on January 15, 2024 would use 2024-01-15T09:00:00Z. If omitted, defaults to today’s date and current time."
          "Accept\::[HEADER] "
"Authorization\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesDirectdataFilesNameGet)
        local -a _op_arguments
        _op_arguments=(
          "name=:[PATH] The name of the Direct Data file part. Obtain this from the Retrieve Available Direct Data Files request. For example, 146478-20240213-0000-F.001."
                    "Accept\::[HEADER] "
"Authorization\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesFileStagingItemsContentItemGet)
        local -a _op_arguments
        _op_arguments=(
          "item=:[PATH] The absolute path to a file or folder. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Range\::[HEADER] Optional: Specifies a partial range of bytes to include in the upload. Maximum 50 MB. Must be in the format &#39;bytes&#x3D;{min}-{max}&#39;. For example, &#39;bytes&#x3D;0-1000&#39;."
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesFileStagingItemsItemDelete)
        local -a _op_arguments
        _op_arguments=(
          "item=:[PATH] The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory."
          "recursive=:[QUERY] Applicable to deleting folders only. If true, the request will delete the contents of a folder and all subfolders. The default is false."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesFileStagingItemsItemGet)
        local -a _op_arguments
        _op_arguments=(
          "item=:[PATH] The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory."
          "recursive=:[QUERY] If true, the response will contain the contents of all subfolders. If not specified, the default value is false."
"limit=:[QUERY] Optional: The maximum number of items per page in the response. This can be any value between 1 and 1000. If omitted, the default value is 1000."
"format_result=:[QUERY] If set to csv, the response includes a job_id. Use the Job ID value to retrieve the status and results of the request."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesFileStagingItemsItemPut)
        local -a _op_arguments
        _op_arguments=(
          "item=:[PATH] The absolute path to the file or folder to delete. This path is specific to the authenticated user. Admin users can access the root directory. All other users can only access their own user directory."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesFileStagingItemsPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-MD5\::[HEADER] Optional: The MD5 checksum of the file being uploaded."
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesFileStagingUploadGet)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesFileStagingUploadPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesFileStagingUploadUploadSessionIdDelete)
        local -a _op_arguments
        _op_arguments=(
          "upload_session_id=:[PATH] "
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesFileStagingUploadUploadSessionIdGet)
        local -a _op_arguments
        _op_arguments=(
          "upload_session_id=:[PATH] "
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesFileStagingUploadUploadSessionIdPartsGet)
        local -a _op_arguments
        _op_arguments=(
          "upload_session_id=:[PATH] "
          "limit=:[QUERY] Optional: The maximum number of items per page in the response. This can be any value between 1 and 1000. If omitted, the default value is 1000."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesFileStagingUploadUploadSessionIdPost)
        local -a _op_arguments
        _op_arguments=(
          "upload_session_id=:[PATH] "
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesFileStagingUploadUploadSessionIdPut)
        local -a _op_arguments
        _op_arguments=(
          "upload_session_id=:[PATH] "
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-FilePartNumber\::[HEADER] The part number, which uniquely identifies a file part and defines its position within the file as a whole. If a part is uploaded using a part number that has already been used, Vault overwrites the previously uploaded file part. You must upload parts in numerical order. For example, you cannot upload part 3 without first uploading parts 1 and 2."
"Content-MD5\::[HEADER] Optional: The MD5 checksum of the file part being uploaded."
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesJobsHistoriesGet)
        local -a _op_arguments
        _op_arguments=(
                    "start_date=:[QUERY] Sets the date to start retrieving completed jobs, in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the first completed job."
"end_date=:[QUERY] Sets the date to end retrieving completed jobs, in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the current date and time."
"status=:[QUERY] Filter to only retrieve jobs in a certain status. Allowed values are success, errors_encountered, failed_to_run, missed_schedule, cancelled. If omitted, retrieves all statuses."
"limit=:[QUERY] Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 200. If omitted, defaults to 50."
"offset=:[QUERY] Paginate the results displayed per page by specifying the amount of offset from the first job history returned. If omitted, defaults to 0. If you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesJobsJobIdErrorsGet)
        local -a _op_arguments
        _op_arguments=(
          "job_id=:[PATH] The id value of the requested import job. This was returned from the Import Bulk Translation File request."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesJobsJobIdGet)
        local -a _op_arguments
        _op_arguments=(
          "job_id=:[PATH] The ID of the job, returned from the original job request."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesJobsJobIdSummaryGet)
        local -a _op_arguments
        _op_arguments=(
          "job_id=:[PATH] The id value of the requested import job. This was returned from the Import Bulk Translation File request."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesJobsJobIdTasksGet)
        local -a _op_arguments
        _op_arguments=(
          "job_id=:[PATH] The ID of the SDK job, returned from the original job request."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesJobsMonitorsGet)
        local -a _op_arguments
        _op_arguments=(
                    "start_date=:[QUERY] Sets the date to start retrieving uncompleted jobs, based on the date and time the job instance was created. Value must be in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the first completed job."
"end_date=:[QUERY] Sets the date to end retrieving uncompleted jobs, based on the date and time the job instance was created. Value must be in the format YYYY-MM-DDTHH:MM:SSZ. For example, for 7AM on January 15, 2016, use 2016-01-15T07:00:00Z. If omitted, defaults to the current date and time."
"status=:[QUERY] Filter to only retrieve jobs in a certain status. Allowed values are scheduled, queued, running. If omitted, retrieves all statuses."
"limit=:[QUERY] Paginate the results by specifying the maximum number of jobs per page in the response. This can be any value between 1 and 200. If omitted, defaults to 50."
"offset=:[QUERY] Paginate the results displayed per page by specifying the amount of offset from the first job instance returned. If omitted, defaults to 0. If you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesJobsStartNowJobIdPost)
        local -a _op_arguments
        _op_arguments=(
          "job_id=:[PATH] The ID of the scheduled job instance to start."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesLoaderExtractPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesLoaderJobIdTasksTaskIdFailurelogGet)
        local -a _op_arguments
        _op_arguments=(
          "job_id=:[PATH] The id value of the requested extract job."
"task_id=:[PATH] The id value of the requested extract task."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesLoaderJobIdTasksTaskIdResultsGet)
        local -a _op_arguments
        _op_arguments=(
          "job_id=:[PATH] The id value of the requested extract job."
"task_id=:[PATH] The id value of the requested extract task."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesLoaderJobIdTasksTaskIdResultsRenditionsGet)
        local -a _op_arguments
        _op_arguments=(
          "job_id=:[PATH] The id value of the requested extract job."
"task_id=:[PATH] The id value of the requested extract task."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesLoaderJobIdTasksTaskIdSuccesslogGet)
        local -a _op_arguments
        _op_arguments=(
          "job_id=:[PATH] The id value of the requested extract job."
"task_id=:[PATH] The id value of the requested extract task."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesLoaderLoadPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesPackageActionsValidatePost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesPackagePost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesPackagePut)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesQueuesGet)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesQueuesQueueNameActionsDisableDeliveryPut)
        local -a _op_arguments
        _op_arguments=(
          "queue_name=:[PATH] The name of a specific Queue."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesQueuesQueueNameActionsEnableDeliveryPut)
        local -a _op_arguments
        _op_arguments=(
          "queue_name=:[PATH] The name of a specific Queue."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesQueuesQueueNameActionsResetPut)
        local -a _op_arguments
        _op_arguments=(
          "queue_name=:[PATH] The name of a specific Queue."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesQueuesQueueNameGet)
        local -a _op_arguments
        _op_arguments=(
          "queue_name=:[PATH] The name of a specific queue. For example, queue__c."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      servicesVobjectVaultPackageVPackageIdActionsValidatePost)
        local -a _op_arguments
        _op_arguments=(
          "package_id=:[PATH] The ID of the package to validate. You can find this in the API response of a package import, or in the URL of package in the Vault UI."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      sessionDelete)
        local -a _op_arguments
        _op_arguments=(
                              "Accept\::[HEADER] "
"Authorization\::[HEADER] The Vault sessionId to end."
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      uicodeDistributionsDistributionNameCodeGet)
        local -a _op_arguments
        _op_arguments=(
          "distribution_name=:[PATH] The name attribute of the client code distribution to download."
                    "Accept\::[HEADER] "
"Authorization\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      uicodeDistributionsDistributionNameDelete)
        local -a _op_arguments
        _op_arguments=(
          "distribution_name=:[PATH] The name attribute of the client code distribution to delete."
                    "Accept\::[HEADER] "
"Authorization\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      uicodeDistributionsDistributionNameGet)
        local -a _op_arguments
        _op_arguments=(
          "distribution_name=:[PATH] The name attribute of the client code distribution to delete."
                    "Accept\::[HEADER] "
"Authorization\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      uicodeDistributionsGet)
        local -a _op_arguments
        _op_arguments=(
                              "Accept\::[HEADER] "
"Authorization\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      uicodeDistributionsPost)
        local -a _op_arguments
        _op_arguments=(
                              "Accept\::[HEADER] "
"Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectVaultPackageVPackageIdActionsDeployPost)
        local -a _op_arguments
        _op_arguments=(
          "package_id=:[PATH] The id field value of the vault_package__v object record used for deployment. See Import Package."
                    "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectVaultPackageVPackageIdActionsDeployResultsGet)
        local -a _op_arguments
        _op_arguments=(
          "package_id=:[PATH] The id field value of the vault_package__v object record used for deployment. See Deploy Package."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The object name__v field value (product__v, country__v, custom_object__c, etc.)."
"job_status=:[PATH] "
"job_id=:[PATH] "
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The object name__v field value (product__v, country__v, custom_object__c, etc.)."
"job_status=:[PATH] The ID of the job, retrieved from the response of the job request."
"job_id=:[PATH] Possible values are success or failure. Find if your job succeeded or failed by retrieving the job status."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsEdlItemVActionsCreateplaceholderPost)
        local -a _op_arguments
        _op_arguments=(
                              "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsMergesJobIdLogGet)
        local -a _op_arguments
        _op_arguments=(
          "job_id=:[PATH] The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsMergesJobIdResultsGet)
        local -a _op_arguments
        _op_arguments=(
          "job_id=:[PATH] The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsMergesJobIdStatusGet)
        local -a _op_arguments
        _op_arguments=(
          "job_id=:[PATH] The job_id field value returned from the merge operation. You can start merge operations with the Initiate Record Merge API request or with the Vault Java SDK."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsObjectNameActionsActionNamePost)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The object name__v field value."
"action_name=:[PATH] Either the name of the Objectaction or Objectlifecyclestateuseraction to initiate. This is obtained from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action."
                    "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsObjectNameActionsChangetypePost)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The name of the object."
                    "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsObjectNameActionsMergePost)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The object name__v field value. For example, account__v. This object must have Enable Merges configured."
                    "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsObjectNameActionsRecalculaterollupsGet)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The name of the object for which to check the status of a Roll-up field recalculation."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsObjectNameActionsRecalculaterollupsPost)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The name of the object for which to check the status of a Roll-up field recalculation."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsObjectNameActionsUpdatecorporatecurrencyPut)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The object name__v field value (product__v, country__v, custom_object__c, etc.)."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsObjectNameAttachmentsBatchDelete)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The object name__v field value (product__v, country__v, custom_object__c, etc.)."
          "idParam=:[QUERY] "
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsObjectNameAttachmentsBatchPost)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The object name__v field value (product__v, country__v, custom_object__c, etc.)."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsObjectNameAttachmentsBatchPut)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The object name__v field value (product__v, country__v, custom_object__c, etc.)."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsObjectNameDelete)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The object name__v field value (product__v, country__v, custom_object__c, etc.)."
                    "Authorization\::[HEADER] "
"Content-Type\::[HEADER] Can be text/csv or application/json"
"Accept\::[HEADER] Can be text/csv or application/json"
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsObjectNameIdRolesRoleNameGet)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The object name."
"id=:[PATH] The id of the document, binder, or object record."
"role_name=:[PATH] Optional: Include a role name to filter for a specific role. For example, owner__v."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsObjectNameObjectRecordIdActionsActionNameGet)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The object name__v field value."
"object_record_id=:[PATH] The object record id field value from which to retrieve user actions."
"action_name=:[PATH] The name of the Objectaction or Objectlifecyclestateuseraction to initiate. You can retrieve this from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsObjectNameObjectRecordIdActionsActionNamePost)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The object name__v field value."
"object_record_id=:[PATH] The object record id field value from which to retrieve user actions."
"action_name=:[PATH] The name of the Objectaction or Objectlifecyclestateuseraction to initiate. You can retrieve this from the Retrieve User Actions request. The format for action_name is Objectaction.vobject.action or Objectlifecyclestateuseraction.vobject.state.action."
                    "Authorization\::[HEADER] "
"Content-Type\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsObjectNameObjectRecordIdActionsCascadedeletePost)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The object name__v field value (product__v, country__v, custom_object__c, etc.)."
"object_record_id=:[PATH] The object record id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsObjectNameObjectRecordIdActionsDeepcopyPost)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The object name__v field value (product__v, country__v, custom_object__c, etc.)."
"object_record_id=:[PATH] The object record id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsObjectNameObjectRecordIdActionsGet)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The object name__v field value."
"object_record_id=:[PATH] The object record id field value."
          "loc=true:[QUERY] Optional: When true, retrieves localized (translated) strings for the label."
          "loc=false:[QUERY] Optional: When true, retrieves localized (translated) strings for the label."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The object name__v field value. For example, product__v."
"object_record_id=:[PATH] The object record id field value."
"attachment_field_name=:[PATH] The name of the Attachment field to update."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The object name__v field value. For example, product__v."
"object_record_id=:[PATH] The object record id field value."
"attachment_field_name=:[PATH] The name of the Attachment field to update."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The object name__v field value. For example, product__v."
"object_record_id=:[PATH] The object record id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The object name__v field value (product__v, country__v, custom_object__c, etc.)."
"object_record_id=:[PATH] The object record id field value."
"attachment_id=:[PATH] The attachment id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The object name__v field value (product__v, country__v, custom_object__c, etc.)."
"object_record_id=:[PATH] The object record id field value."
"attachment_id=:[PATH] The attachment id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The object name__v field value (product__v, country__v, custom_object__c, etc.)."
"object_record_id=:[PATH] The object record id field value."
"attachment_id=:[PATH] The attachment id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The object name__v field value (product__v, country__v, custom_object__c, etc.)."
"object_record_id=:[PATH] The object record id field value."
"attachment_id=:[PATH] The attachment id field value."
"attachment_version=:[PATH] The attachment version__v field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The object name__v field value (product__v, country__v, custom_object__c, etc.)."
"object_record_id=:[PATH] The object record id field value."
"attachment_id=:[PATH] The attachment id field value."
"attachment_version=:[PATH] "
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The object name__v field value (product__v, country__v, custom_object__c, etc.)."
"object_record_id=:[PATH] The object record id field value."
"attachment_id=:[PATH] The attachment id field value."
"attachment_version=:[PATH] The attachment version__v field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The object name__v field value (product__v, country__v, custom_object__c, etc.)."
"object_record_id=:[PATH] The object record id field value."
"attachment_id=:[PATH] The attachment id field value."
"attachment_version=:[PATH] The attachment version__v field value."
          "restore=true:[QUERY] "
          "restore=false:[QUERY] "
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The object name__v field value (product__v, country__v, custom_object__c, etc.)."
"object_record_id=:[PATH] The object record id field value."
"attachment_id=:[PATH] The attachment id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsObjectNameObjectRecordIdAttachmentsFileGet)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The object name__v field value (product__v, country__v, custom_object__c, etc.)."
"object_record_id=:[PATH] The object record id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsObjectNameObjectRecordIdAttachmentsGet)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The object name__v field value (product__v, country__v, custom_object__c, etc.)."
"object_record_id=:[PATH] The object record id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsObjectNameObjectRecordIdAttachmentsPost)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The object name__v field value (product__v, country__v, custom_object__c, etc.)."
"object_record_id=:[PATH] The object record id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsObjectNameObjectRecordIdAudittrailGet)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The object name__v field value."
"object_record_id=:[PATH] The object record id field value from which to retrieve user actions."
          "start_date=:[QUERY] Specify a start date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to the vVault’s creation date."
"end_date=:[QUERY] Specify an end date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to today’s date."
"format_result=:[QUERY] To request a CSV file of your audit history, use csv."
"limit=:[QUERY] Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200."
"offset=:[QUERY] Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0."
"events=:[QUERY] Provide a comma-separated list of one or more audit events to retrieve their audit history. See Vault Help for a full list of object audit events. The values passed to this parameter are case sensitive. For example, events&#x3D;Copy,Edit,Delete. If omitted, defaults to all audit events."
          "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsObjectNameObjectRecordIdGet)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The object name__v field value (product__v, country__v, custom_object__c, etc.)."
"object_record_id=:[PATH] The object record id field value."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsObjectNamePost)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The object name__v field value (product__v, country__v, custom_object__c, etc.)."
          "idParam=:[QUERY] To upsert object records, add &#39;idParam&#x3D;{field_name}&#39; to the request endpoint. You can use any object field which has &#39;unique&#39; set to &#39;true&#39; in the object metadata. For example, &#39;idParam&#x3D;external_id__v&#39;."
          "Authorization\::[HEADER] "
"Content-Type\::[HEADER] Can be text/csv or application/json"
"Accept\::[HEADER] Can be text/csv or application/json"
"X-VaultAPI-MigrationMode\::[HEADER] If set to &#39;true&#39;, Vault allows you to create or update object records in a noninitial state and with minimal validation, create inactive records, and set standard and system-managed fields such as &#39;created_by__v&#39;. Does not bypass record triggers. Use the &#39;X-VaultAPI-NoTriggers&#39; header to bypass all standard and custom SDK triggers. You must have the Record Migration permission to use this header."
"X-VaultAPI-NoTriggers\::[HEADER] If set to &#39;true&#39; and Record Migration Mode is enabled, it bypasses all standard and custom SDK triggers."
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsObjectNamePut)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The object name__v field value (product__v, country__v, custom_object__c, etc.)."
                    "Authorization\::[HEADER] "
"Content-Type\::[HEADER] Can be text/csv or application/json"
"Accept\::[HEADER] Can be text/csv or application/json"
"X-VaultAPI-MigrationMode\::[HEADER] If set to &#39;true&#39;, Vault allows you to update object records in a noninitial state and with minimal validation, create inactive records, and set standard and system-managed fields such as &#39;created_by__v&#39;. Does not bypass record triggers. Use the &#39;X-VaultAPI-NoTriggers&#39; header to bypass all standard and custom SDK triggers. You must have the Record Migration permission to use this header."
"X-VaultAPI-NoTriggers\::[HEADER] If set to &#39;true&#39; and Record Migration Mode is enabled, it bypasses all standard and custom SDK triggers."
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsObjectNameRolesDelete)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The name of the object where you want to remove roles."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsObjectNameRolesPost)
        local -a _op_arguments
        _op_arguments=(
          "object_name=:[PATH] The name of the object where you want to remove roles."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"Content-Type\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      vobjectsOutboundPackageVPackageIdDependenciesGet)
        local -a _op_arguments
        _op_arguments=(
          "package_id=:[PATH] The ID of the outbound_package__v record from which to retrieve dependencies."
                    "Authorization\::[HEADER] "
"Accept\::[HEADER] "
"X-VaultAPI-ClientID\::[HEADER] Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#39;unknown&#39; in the API Usage Log."
)
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
    esac
    ;;

esac

return ret
