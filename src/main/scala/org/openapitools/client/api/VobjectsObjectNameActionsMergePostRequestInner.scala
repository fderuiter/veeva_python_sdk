package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import VobjectsObjectNameActionsMergePostRequestInner._

case class VobjectsObjectNameActionsMergePostRequestInner (
  duplicateRecordId: Option[String],
mainRecordId: Option[String])

object VobjectsObjectNameActionsMergePostRequestInner {
  import DateTimeCodecs._

  implicit val VobjectsObjectNameActionsMergePostRequestInnerCodecJson: CodecJson[VobjectsObjectNameActionsMergePostRequestInner] = CodecJson.derive[VobjectsObjectNameActionsMergePostRequestInner]
  implicit val VobjectsObjectNameActionsMergePostRequestInnerDecoder: EntityDecoder[VobjectsObjectNameActionsMergePostRequestInner] = jsonOf[VobjectsObjectNameActionsMergePostRequestInner]
  implicit val VobjectsObjectNameActionsMergePostRequestInnerEncoder: EntityEncoder[VobjectsObjectNameActionsMergePostRequestInner] = jsonEncoderOf[VobjectsObjectNameActionsMergePostRequestInner]
}
