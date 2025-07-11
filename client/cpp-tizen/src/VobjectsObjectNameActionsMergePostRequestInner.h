/*
 * _vobjects__object_name__actions_merge_post_request_inner.h
 *
 * 
 */

#ifndef __vobjects__object_name__actions_merge_post_request_inner_H_
#define __vobjects__object_name__actions_merge_post_request_inner_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class _vobjects__object_name__actions_merge_post_request_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	_vobjects__object_name__actions_merge_post_request_inner();
	_vobjects__object_name__actions_merge_post_request_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~_vobjects__object_name__actions_merge_post_request_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getDuplicateRecordId();

	/*! \brief Set 
	 */
	void setDuplicateRecordId(std::string  duplicate_record_id);
	/*! \brief Get 
	 */
	std::string getMainRecordId();

	/*! \brief Set 
	 */
	void setMainRecordId(std::string  main_record_id);

private:
	std::string duplicate_record_id;
	std::string main_record_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* __vobjects__object_name__actions_merge_post_request_inner_H_ */
