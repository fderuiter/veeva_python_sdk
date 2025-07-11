

#include "_vobjects__object_name__actions_merge_post_request_inner.h"

using namespace Tiny;

_vobjects__object_name__actions_merge_post_request_inner::_vobjects__object_name__actions_merge_post_request_inner()
{
	duplicate_record_id = std::string();
	main_record_id = std::string();
}

_vobjects__object_name__actions_merge_post_request_inner::_vobjects__object_name__actions_merge_post_request_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

_vobjects__object_name__actions_merge_post_request_inner::~_vobjects__object_name__actions_merge_post_request_inner()
{

}

void
_vobjects__object_name__actions_merge_post_request_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *duplicate_record_idKey = "duplicate_record_id";

    if(object.has_key(duplicate_record_idKey))
    {
        bourne::json value = object[duplicate_record_idKey];



        jsonToValue(&duplicate_record_id, value, "std::string");


    }

    const char *main_record_idKey = "main_record_id";

    if(object.has_key(main_record_idKey))
    {
        bourne::json value = object[main_record_idKey];



        jsonToValue(&main_record_id, value, "std::string");


    }


}

bourne::json
_vobjects__object_name__actions_merge_post_request_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["duplicate_record_id"] = getDuplicateRecordId();






    object["main_record_id"] = getMainRecordId();



    return object;

}

std::string
_vobjects__object_name__actions_merge_post_request_inner::getDuplicateRecordId()
{
	return duplicate_record_id;
}

void
_vobjects__object_name__actions_merge_post_request_inner::setDuplicateRecordId(std::string  duplicate_record_id)
{
	this->duplicate_record_id = duplicate_record_id;
}

std::string
_vobjects__object_name__actions_merge_post_request_inner::getMainRecordId()
{
	return main_record_id;
}

void
_vobjects__object_name__actions_merge_post_request_inner::setMainRecordId(std::string  main_record_id)
{
	this->main_record_id = main_record_id;
}



