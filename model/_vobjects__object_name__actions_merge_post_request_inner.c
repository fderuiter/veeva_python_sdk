#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "_vobjects__object_name__actions_merge_post_request_inner.h"



static _vobjects__object_name__actions_merge_post_request_inner_t *_vobjects__object_name__actions_merge_post_request_inner_create_internal(
    char *duplicate_record_id,
    char *main_record_id
    ) {
    _vobjects__object_name__actions_merge_post_request_inner_t *_vobjects__object_name__actions_merge_post_request_inner_local_var = malloc(sizeof(_vobjects__object_name__actions_merge_post_request_inner_t));
    if (!_vobjects__object_name__actions_merge_post_request_inner_local_var) {
        return NULL;
    }
    _vobjects__object_name__actions_merge_post_request_inner_local_var->duplicate_record_id = duplicate_record_id;
    _vobjects__object_name__actions_merge_post_request_inner_local_var->main_record_id = main_record_id;

    _vobjects__object_name__actions_merge_post_request_inner_local_var->_library_owned = 1;
    return _vobjects__object_name__actions_merge_post_request_inner_local_var;
}

__attribute__((deprecated)) _vobjects__object_name__actions_merge_post_request_inner_t *_vobjects__object_name__actions_merge_post_request_inner_create(
    char *duplicate_record_id,
    char *main_record_id
    ) {
    return _vobjects__object_name__actions_merge_post_request_inner_create_internal (
        duplicate_record_id,
        main_record_id
        );
}

void _vobjects__object_name__actions_merge_post_request_inner_free(_vobjects__object_name__actions_merge_post_request_inner_t *_vobjects__object_name__actions_merge_post_request_inner) {
    if(NULL == _vobjects__object_name__actions_merge_post_request_inner){
        return ;
    }
    if(_vobjects__object_name__actions_merge_post_request_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "_vobjects__object_name__actions_merge_post_request_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (_vobjects__object_name__actions_merge_post_request_inner->duplicate_record_id) {
        free(_vobjects__object_name__actions_merge_post_request_inner->duplicate_record_id);
        _vobjects__object_name__actions_merge_post_request_inner->duplicate_record_id = NULL;
    }
    if (_vobjects__object_name__actions_merge_post_request_inner->main_record_id) {
        free(_vobjects__object_name__actions_merge_post_request_inner->main_record_id);
        _vobjects__object_name__actions_merge_post_request_inner->main_record_id = NULL;
    }
    free(_vobjects__object_name__actions_merge_post_request_inner);
}

cJSON *_vobjects__object_name__actions_merge_post_request_inner_convertToJSON(_vobjects__object_name__actions_merge_post_request_inner_t *_vobjects__object_name__actions_merge_post_request_inner) {
    cJSON *item = cJSON_CreateObject();

    // _vobjects__object_name__actions_merge_post_request_inner->duplicate_record_id
    if(_vobjects__object_name__actions_merge_post_request_inner->duplicate_record_id) {
    if(cJSON_AddStringToObject(item, "duplicate_record_id", _vobjects__object_name__actions_merge_post_request_inner->duplicate_record_id) == NULL) {
    goto fail; //String
    }
    }


    // _vobjects__object_name__actions_merge_post_request_inner->main_record_id
    if(_vobjects__object_name__actions_merge_post_request_inner->main_record_id) {
    if(cJSON_AddStringToObject(item, "main_record_id", _vobjects__object_name__actions_merge_post_request_inner->main_record_id) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

_vobjects__object_name__actions_merge_post_request_inner_t *_vobjects__object_name__actions_merge_post_request_inner_parseFromJSON(cJSON *_vobjects__object_name__actions_merge_post_request_innerJSON){

    _vobjects__object_name__actions_merge_post_request_inner_t *_vobjects__object_name__actions_merge_post_request_inner_local_var = NULL;

    // _vobjects__object_name__actions_merge_post_request_inner->duplicate_record_id
    cJSON *duplicate_record_id = cJSON_GetObjectItemCaseSensitive(_vobjects__object_name__actions_merge_post_request_innerJSON, "duplicate_record_id");
    if (cJSON_IsNull(duplicate_record_id)) {
        duplicate_record_id = NULL;
    }
    if (duplicate_record_id) { 
    if(!cJSON_IsString(duplicate_record_id) && !cJSON_IsNull(duplicate_record_id))
    {
    goto end; //String
    }
    }

    // _vobjects__object_name__actions_merge_post_request_inner->main_record_id
    cJSON *main_record_id = cJSON_GetObjectItemCaseSensitive(_vobjects__object_name__actions_merge_post_request_innerJSON, "main_record_id");
    if (cJSON_IsNull(main_record_id)) {
        main_record_id = NULL;
    }
    if (main_record_id) { 
    if(!cJSON_IsString(main_record_id) && !cJSON_IsNull(main_record_id))
    {
    goto end; //String
    }
    }


    _vobjects__object_name__actions_merge_post_request_inner_local_var = _vobjects__object_name__actions_merge_post_request_inner_create_internal (
        duplicate_record_id && !cJSON_IsNull(duplicate_record_id) ? strdup(duplicate_record_id->valuestring) : NULL,
        main_record_id && !cJSON_IsNull(main_record_id) ? strdup(main_record_id->valuestring) : NULL
        );

    return _vobjects__object_name__actions_merge_post_request_inner_local_var;
end:
    return NULL;

}
