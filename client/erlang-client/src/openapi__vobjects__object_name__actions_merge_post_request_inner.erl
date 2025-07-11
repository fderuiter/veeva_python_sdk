-module(openapi__vobjects__object_name__actions_merge_post_request_inner).

-export([encode/1]).

-export_type([openapi__vobjects__object_name__actions_merge_post_request_inner/0]).

-type openapi__vobjects__object_name__actions_merge_post_request_inner() ::
    #{ 'duplicate_record_id' => binary(),
       'main_record_id' => binary()
     }.

encode(#{ 'duplicate_record_id' := DuplicateRecordId,
          'main_record_id' := MainRecordId
        }) ->
    #{ 'duplicate_record_id' => DuplicateRecordId,
       'main_record_id' => MainRecordId
     }.
