#' Create a new VobjectsObjectNameActionsMergePostRequestInner
#'
#' @description
#' VobjectsObjectNameActionsMergePostRequestInner Class
#'
#' @docType class
#' @title VobjectsObjectNameActionsMergePostRequestInner
#' @description VobjectsObjectNameActionsMergePostRequestInner Class
#' @format An \code{R6Class} generator object
#' @field duplicate_record_id  character [optional]
#' @field main_record_id  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
VobjectsObjectNameActionsMergePostRequestInner <- R6::R6Class(
  "VobjectsObjectNameActionsMergePostRequestInner",
  public = list(
    `duplicate_record_id` = NULL,
    `main_record_id` = NULL,

    #' @description
    #' Initialize a new VobjectsObjectNameActionsMergePostRequestInner class.
    #'
    #' @param duplicate_record_id duplicate_record_id
    #' @param main_record_id main_record_id
    #' @param ... Other optional arguments.
    initialize = function(`duplicate_record_id` = NULL, `main_record_id` = NULL, ...) {
      if (!is.null(`duplicate_record_id`)) {
        if (!(is.character(`duplicate_record_id`) && length(`duplicate_record_id`) == 1)) {
          stop(paste("Error! Invalid data for `duplicate_record_id`. Must be a string:", `duplicate_record_id`))
        }
        self$`duplicate_record_id` <- `duplicate_record_id`
      }
      if (!is.null(`main_record_id`)) {
        if (!(is.character(`main_record_id`) && length(`main_record_id`) == 1)) {
          stop(paste("Error! Invalid data for `main_record_id`. Must be a string:", `main_record_id`))
        }
        self$`main_record_id` <- `main_record_id`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return VobjectsObjectNameActionsMergePostRequestInner as a base R list.
    #' @examples
    #' # convert array of VobjectsObjectNameActionsMergePostRequestInner (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert VobjectsObjectNameActionsMergePostRequestInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      VobjectsObjectNameActionsMergePostRequestInnerObject <- list()
      if (!is.null(self$`duplicate_record_id`)) {
        VobjectsObjectNameActionsMergePostRequestInnerObject[["duplicate_record_id"]] <-
          self$`duplicate_record_id`
      }
      if (!is.null(self$`main_record_id`)) {
        VobjectsObjectNameActionsMergePostRequestInnerObject[["main_record_id"]] <-
          self$`main_record_id`
      }
      return(VobjectsObjectNameActionsMergePostRequestInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of VobjectsObjectNameActionsMergePostRequestInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of VobjectsObjectNameActionsMergePostRequestInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`duplicate_record_id`)) {
        self$`duplicate_record_id` <- this_object$`duplicate_record_id`
      }
      if (!is.null(this_object$`main_record_id`)) {
        self$`main_record_id` <- this_object$`main_record_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return VobjectsObjectNameActionsMergePostRequestInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of VobjectsObjectNameActionsMergePostRequestInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of VobjectsObjectNameActionsMergePostRequestInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`duplicate_record_id` <- this_object$`duplicate_record_id`
      self$`main_record_id` <- this_object$`main_record_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to VobjectsObjectNameActionsMergePostRequestInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of VobjectsObjectNameActionsMergePostRequestInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# VobjectsObjectNameActionsMergePostRequestInner$unlock()
#
## Below is an example to define the print function
# VobjectsObjectNameActionsMergePostRequestInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# VobjectsObjectNameActionsMergePostRequestInner$lock()

