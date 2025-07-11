
package org.openapitools.client.model


case class VobjectsObjectNameActionsMergePostRequestInner (
    _duplicateRecordId: Option[String],
    _mainRecordId: Option[String]
)
object VobjectsObjectNameActionsMergePostRequestInner {
    def toStringBody(var_duplicateRecordId: Object, var_mainRecordId: Object) =
        s"""
        | {
        | "duplicateRecordId":$var_duplicateRecordId,"mainRecordId":$var_mainRecordId
        | }
        """.stripMargin
}
