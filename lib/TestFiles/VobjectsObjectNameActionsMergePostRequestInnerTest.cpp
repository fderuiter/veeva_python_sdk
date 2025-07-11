
#include "_vobjects__object_name__actions_merge_post_request_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test__vobjects__object_name__actions_merge_post_request_inner_duplicate_record_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "duplicate_record_id", "hello"
    };

    _vobjects__object_name__actions_merge_post_request_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDuplicateRecordId().c_str());






}


void test__vobjects__object_name__actions_merge_post_request_inner_main_record_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "main_record_id", "hello"
    };

    _vobjects__object_name__actions_merge_post_request_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMainRecordId().c_str());






}



void test__vobjects__object_name__actions_merge_post_request_inner_duplicate_record_id_is_converted_to_json()
{

    bourne::json input =
    {
        "duplicate_record_id", "hello"
    };

    _vobjects__object_name__actions_merge_post_request_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["duplicate_record_id"] == output["duplicate_record_id"]);



}


void test__vobjects__object_name__actions_merge_post_request_inner_main_record_id_is_converted_to_json()
{

    bourne::json input =
    {
        "main_record_id", "hello"
    };

    _vobjects__object_name__actions_merge_post_request_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["main_record_id"] == output["main_record_id"]);



}


