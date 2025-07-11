#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "_vobjects__object_name__actions_merge_post_request_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

_vobjects__object_name__actions_merge_post_request_inner::_vobjects__object_name__actions_merge_post_request_inner()
{
	//__init();
}

_vobjects__object_name__actions_merge_post_request_inner::~_vobjects__object_name__actions_merge_post_request_inner()
{
	//__cleanup();
}

void
_vobjects__object_name__actions_merge_post_request_inner::__init()
{
	//duplicate_record_id = std::string();
	//main_record_id = std::string();
}

void
_vobjects__object_name__actions_merge_post_request_inner::__cleanup()
{
	//if(duplicate_record_id != NULL) {
	//
	//delete duplicate_record_id;
	//duplicate_record_id = NULL;
	//}
	//if(main_record_id != NULL) {
	//
	//delete main_record_id;
	//main_record_id = NULL;
	//}
	//
}

void
_vobjects__object_name__actions_merge_post_request_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *duplicate_record_idKey = "duplicate_record_id";
	node = json_object_get_member(pJsonObject, duplicate_record_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&duplicate_record_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *main_record_idKey = "main_record_id";
	node = json_object_get_member(pJsonObject, main_record_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&main_record_id, node, "std::string", "");
		} else {
			
		}
	}
}

_vobjects__object_name__actions_merge_post_request_inner::_vobjects__object_name__actions_merge_post_request_inner(char* json)
{
	this->fromJson(json);
}

char*
_vobjects__object_name__actions_merge_post_request_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getDuplicateRecordId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *duplicate_record_idKey = "duplicate_record_id";
	json_object_set_member(pJsonObject, duplicate_record_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMainRecordId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *main_record_idKey = "main_record_id";
	json_object_set_member(pJsonObject, main_record_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
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


