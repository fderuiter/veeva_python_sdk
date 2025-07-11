/*
 * _vobjects__object_name__actions_merge_post_request_inner.h
 *
 * 
 */

#ifndef __vobjects__object_name__actions_merge_post_request_inner_H_
#define __vobjects__object_name__actions_merge_post_request_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct _vobjects__object_name__actions_merge_post_request_inner_t _vobjects__object_name__actions_merge_post_request_inner_t;




typedef struct _vobjects__object_name__actions_merge_post_request_inner_t {
    char *duplicate_record_id; // string
    char *main_record_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} _vobjects__object_name__actions_merge_post_request_inner_t;

__attribute__((deprecated)) _vobjects__object_name__actions_merge_post_request_inner_t *_vobjects__object_name__actions_merge_post_request_inner_create(
    char *duplicate_record_id,
    char *main_record_id
);

void _vobjects__object_name__actions_merge_post_request_inner_free(_vobjects__object_name__actions_merge_post_request_inner_t *_vobjects__object_name__actions_merge_post_request_inner);

_vobjects__object_name__actions_merge_post_request_inner_t *_vobjects__object_name__actions_merge_post_request_inner_parseFromJSON(cJSON *_vobjects__object_name__actions_merge_post_request_innerJSON);

cJSON *_vobjects__object_name__actions_merge_post_request_inner_convertToJSON(_vobjects__object_name__actions_merge_post_request_inner_t *_vobjects__object_name__actions_merge_post_request_inner);

#endif /* __vobjects__object_name__actions_merge_post_request_inner_H_ */

