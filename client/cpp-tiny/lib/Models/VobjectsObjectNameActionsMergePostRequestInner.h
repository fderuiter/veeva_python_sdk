
/*
 * _vobjects__object_name__actions_merge_post_request_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT__vobjects__object_name__actions_merge_post_request_inner_H_
#define TINY_CPP_CLIENT__vobjects__object_name__actions_merge_post_request_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class _vobjects__object_name__actions_merge_post_request_inner{
public:

    /*! \brief Constructor.
	 */
    _vobjects__object_name__actions_merge_post_request_inner();
    _vobjects__object_name__actions_merge_post_request_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~_vobjects__object_name__actions_merge_post_request_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string duplicate_record_id{};
    std::string main_record_id{};
};
}

#endif /* TINY_CPP_CLIENT__vobjects__object_name__actions_merge_post_request_inner_H_ */
