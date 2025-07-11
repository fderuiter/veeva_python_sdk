-module(openapi__vobjects__object_name__actions_merge_post_request_inner).

-include("openapi.hrl").

-export([openapi__vobjects__object_name__actions_merge_post_request_inner/0]).

-export([openapi__vobjects__object_name__actions_merge_post_request_inner/1]).

-export_type([openapi__vobjects__object_name__actions_merge_post_request_inner/0]).

-type openapi__vobjects__object_name__actions_merge_post_request_inner() ::
  [ {'duplicate_record_id', binary() }
  | {'main_record_id', binary() }
  ].


openapi__vobjects__object_name__actions_merge_post_request_inner() ->
    openapi__vobjects__object_name__actions_merge_post_request_inner([]).

openapi__vobjects__object_name__actions_merge_post_request_inner(Fields) ->
  Default = [ {'duplicate_record_id', binary() }
            , {'main_record_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

