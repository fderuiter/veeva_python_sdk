#ifndef _vobjects__object_name__actions_merge_post_request_inner_TEST
#define _vobjects__object_name__actions_merge_post_request_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define _vobjects__object_name__actions_merge_post_request_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/_vobjects__object_name__actions_merge_post_request_inner.h"
_vobjects__object_name__actions_merge_post_request_inner_t* instantiate__vobjects__object_name__actions_merge_post_request_inner(int include_optional);



_vobjects__object_name__actions_merge_post_request_inner_t* instantiate__vobjects__object_name__actions_merge_post_request_inner(int include_optional) {
  _vobjects__object_name__actions_merge_post_request_inner_t* _vobjects__object_name__actions_merge_post_request_inner = NULL;
  if (include_optional) {
    _vobjects__object_name__actions_merge_post_request_inner = _vobjects__object_name__actions_merge_post_request_inner_create(
      "0",
      "0"
    );
  } else {
    _vobjects__object_name__actions_merge_post_request_inner = _vobjects__object_name__actions_merge_post_request_inner_create(
      "0",
      "0"
    );
  }

  return _vobjects__object_name__actions_merge_post_request_inner;
}


#ifdef _vobjects__object_name__actions_merge_post_request_inner_MAIN

void test__vobjects__object_name__actions_merge_post_request_inner(int include_optional) {
    _vobjects__object_name__actions_merge_post_request_inner_t* _vobjects__object_name__actions_merge_post_request_inner_1 = instantiate__vobjects__object_name__actions_merge_post_request_inner(include_optional);

	cJSON* json_vobjects__object_name__actions_merge_post_request_inner_1 = _vobjects__object_name__actions_merge_post_request_inner_convertToJSON(_vobjects__object_name__actions_merge_post_request_inner_1);
	printf("_vobjects__object_name__actions_merge_post_request_inner :\n%s\n", cJSON_Print(json_vobjects__object_name__actions_merge_post_request_inner_1));
	_vobjects__object_name__actions_merge_post_request_inner_t* _vobjects__object_name__actions_merge_post_request_inner_2 = _vobjects__object_name__actions_merge_post_request_inner_parseFromJSON(json_vobjects__object_name__actions_merge_post_request_inner_1);
	cJSON* json_vobjects__object_name__actions_merge_post_request_inner_2 = _vobjects__object_name__actions_merge_post_request_inner_convertToJSON(_vobjects__object_name__actions_merge_post_request_inner_2);
	printf("repeating _vobjects__object_name__actions_merge_post_request_inner:\n%s\n", cJSON_Print(json_vobjects__object_name__actions_merge_post_request_inner_2));
}

int main() {
  test__vobjects__object_name__actions_merge_post_request_inner(1);
  test__vobjects__object_name__actions_merge_post_request_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // _vobjects__object_name__actions_merge_post_request_inner_MAIN
#endif // _vobjects__object_name__actions_merge_post_request_inner_TEST
