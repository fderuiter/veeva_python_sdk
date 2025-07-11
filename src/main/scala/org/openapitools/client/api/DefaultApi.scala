package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import java.io.File
import java.net.URLEncoder
import java.util.UUID

import org.http4s._
import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.http4s.client._
import org.http4s.client.blaze.PooledHttp1Client
import org.http4s.headers._

import org.joda.time.DateTime

import scalaz.concurrent.Task

import HelperCodecs._

import org.openapitools.client.api.VobjectsObjectNameActionsMergePostRequestInner

object DefaultApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def apiGet(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/api/"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def apiMdlComponentsComponentTypeAndRecordNameFilesGet(host: String, componentTypeAndRecordName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/api/mdl/components/{component_type_and_record_name}/files".replaceAll("\\{" + "component_type_and_record_name" + "\\}",escape(componentTypeAndRecordName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def apiMdlComponentsComponentTypeAndRecordNameGet(host: String, componentTypeAndRecordName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/api/mdl/components/{component_type_and_record_name}".replaceAll("\\{" + "component_type_and_record_name" + "\\}",escape(componentTypeAndRecordName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def apiMdlExecuteAsyncJobIdResultsGet(host: String, jobId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/api/mdl/execute_async/{job_id}/results".replaceAll("\\{" + "job_id" + "\\}",escape(jobId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def apiMdlExecuteAsyncPost(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/api/mdl/execute_async"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def apiMdlExecutePost(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/api/mdl/execute"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def apiMdlFilesPost(host: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/api/mdl/files"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def audittrailAuditTrailTypeGet(host: String, auditTrailType: String, startDate: String, endDate: String, allDates: String, formatResult: String, limit: String, offset: String, objects: String, events: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit startDateQuery: QueryParam[String], endDateQuery: QueryParam[String], allDatesQuery: QueryParam[String], formatResultQuery: QueryParam[String], limitQuery: QueryParam[String], offsetQuery: QueryParam[String], objectsQuery: QueryParam[String], eventsQuery: QueryParam[String]): Task[Unit] = {
    val path = "/audittrail/{audit_trail_type}".replaceAll("\\{" + "audit_trail_type" + "\\}",escape(auditTrailType.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("allDates", Some(all_datesQuery.toParamString(all_dates))), ("formatResult", Some(format_resultQuery.toParamString(format_result))), ("limit", Some(limitQuery.toParamString(limit))), ("offset", Some(offsetQuery.toParamString(offset))), ("objects", Some(objectsQuery.toParamString(objects))), ("events", Some(eventsQuery.toParamString(events))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def authDiscoveryPost(host: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/auth/discovery"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def authOauthSessionOathOidcProfileIdPost(host: String, oathOidcProfileId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/auth/oauth/session/{oath_oidc_profile_id}".replaceAll("\\{" + "oath_oidc_profile_id" + "\\}",escape(oathOidcProfileId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def authPost(host: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/auth"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def codeClassNameDelete(host: String, className: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/code/{class_name}".replaceAll("\\{" + "class_name" + "\\}",escape(className.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def codeClassNameDisablePut(host: String, className: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/code/{class_name}/disable".replaceAll("\\{" + "class_name" + "\\}",escape(className.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def codeClassNameEnablePut(host: String, className: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/code/{class_name}/enable".replaceAll("\\{" + "class_name" + "\\}",escape(className.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def codeClassNameGet(host: String, className: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/code/{class_name}".replaceAll("\\{" + "class_name" + "\\}",escape(className.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def codeProfilerGet(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/code/profiler"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def codeProfilerPost(host: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/code/profiler"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def codeProfilerSessionNameActionsEndPost(host: String, sessionName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/code/profiler/{session_name}/actions/end".replaceAll("\\{" + "session_name" + "\\}",escape(sessionName.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def codeProfilerSessionNameDelete(host: String, sessionName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/code/profiler/{session_name}".replaceAll("\\{" + "session_name" + "\\}",escape(sessionName.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def codeProfilerSessionNameGet(host: String, sessionName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/code/profiler/{session_name}".replaceAll("\\{" + "session_name" + "\\}",escape(sessionName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def codeProfilerSessionNameResultsGet(host: String, sessionName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/code/profiler/{session_name}/results".replaceAll("\\{" + "session_name" + "\\}",escape(sessionName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def codePut(host: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/code"

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def compositesTreesEdlHierarchyOrTemplateActionsListnodesPost(host: String, edlHierarchyOrTemplate: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/composites/trees/{edl_hierarchy_or_template}/actions/listnodes".replaceAll("\\{" + "edl_hierarchy_or_template" + "\\}",escape(edlHierarchyOrTemplate.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def compositesTreesEdlHierarchyOrTemplateGet(host: String, edlHierarchyOrTemplate: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/composites/trees/{edl_hierarchy_or_template}".replaceAll("\\{" + "edl_hierarchy_or_template" + "\\}",escape(edlHierarchyOrTemplate.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def compositesTreesEdlHierarchyVParentNodeIdChildrenGet(host: String, parentNodeId: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/composites/trees/edl_hierarchy__v/{parent_node_id}/children".replaceAll("\\{" + "parent_node_id" + "\\}",escape(parentNodeId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def compositesTreesEdlHierarchyVParentNodeIdChildrenPut(host: String, parentNodeId: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/composites/trees/edl_hierarchy__v/{parent_node_id}/children".replaceAll("\\{" + "parent_node_id" + "\\}",escape(parentNodeId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def configurationComponentTypeAndRecordNameGet(host: String, componentTypeAndRecordName: String, loc: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit locQuery: QueryParam[String]): Task[Unit] = {
    val path = "/configuration/{component_type_and_record_name}".replaceAll("\\{" + "component_type_and_record_name" + "\\}",escape(componentTypeAndRecordName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("loc", Some(locQuery.toParamString(loc))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def configurationComponentTypeGet(host: String, componentType: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/configuration/{component_type}".replaceAll("\\{" + "component_type" + "\\}",escape(componentType.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def configurationObjectNameAndObjectTypeGet(host: String, objectNameAndObjectType: String, loc: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit locQuery: QueryParam[String]): Task[Unit] = {
    val path = "/configuration/{object_name_and_object_type}".replaceAll("\\{" + "object_name_and_object_type" + "\\}",escape(objectNameAndObjectType.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("loc", Some(locQuery.toParamString(loc))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def configurationObjecttypeGet(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/configuration/Objecttype"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def configurationRoleAssignmentRuleDelete(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/configuration/role_assignment_rule"

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def configurationRoleAssignmentRuleGet(host: String, lifecycleV: String, roleV: String, productV: String, countryV: String, studyV: String, studyCountryV: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit lifecycleVQuery: QueryParam[String], roleVQuery: QueryParam[String], productVQuery: QueryParam[String], countryVQuery: QueryParam[String], studyVQuery: QueryParam[String], studyCountryVQuery: QueryParam[String]): Task[Unit] = {
    val path = "/configuration/role_assignment_rule"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("lifecycleV", Some(lifecycle__vQuery.toParamString(lifecycle__v))), ("roleV", Some(role__vQuery.toParamString(role__v))), ("productV", Some(product__vQuery.toParamString(product__v))), ("countryV", Some(country__vQuery.toParamString(country__v))), ("studyV", Some(study__vQuery.toParamString(study__v))), ("studyCountryV", Some(study_country__vQuery.toParamString(study_country__v))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def configurationRoleAssignmentRulePost(host: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/configuration/role_assignment_rule"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def configurationRoleAssignmentRulePut(host: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/configuration/role_assignment_rule"

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def delegationLoginPost(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/delegation/login"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def delegationVaultsGet(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/delegation/vaults"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def keepAlivePost(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/keep-alive"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def limitsGet(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/limits"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def logsApiUsageGet(host: String, date: String, logFormat: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit dateQuery: QueryParam[String], logFormatQuery: QueryParam[String]): Task[Unit] = {
    val path = "/logs/api_usage"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("date", Some(dateQuery.toParamString(date))), ("logFormat", Some(log_formatQuery.toParamString(log_format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def logsCodeDebugGet(host: String, userId: String, includeInactive: Boolean, authorization: String, accept: String, xVaultAPIClientID: String)(implicit userIdQuery: QueryParam[String], includeInactiveQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/logs/code/debug"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("userId", Some(user_idQuery.toParamString(user_id))), ("includeInactive", Some(include_inactiveQuery.toParamString(include_inactive))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def logsCodeDebugIdActionsResetDelete(host: String, id: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/logs/code/debug/{id}/actions/reset".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def logsCodeDebugIdActionsResetPost(host: String, id: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/logs/code/debug/{id}/actions/reset".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def logsCodeDebugIdFilesGet(host: String, id: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/logs/code/debug/{id}/files".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def logsCodeDebugIdGet(host: String, id: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/logs/code/debug/{id}".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def logsCodeDebugPost(host: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/logs/code/debug"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def logsCodeRuntimeGet(host: String, date: String, logFormat: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit dateQuery: QueryParam[String], logFormatQuery: QueryParam[String]): Task[Unit] = {
    val path = "/logs/code/runtime"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("date", Some(dateQuery.toParamString(date))), ("logFormat", Some(log_formatQuery.toParamString(log_format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def messagesMessageTypeActionsImportPost(host: String, messageType: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/messages/{message_type}/actions/import".replaceAll("\\{" + "message_type" + "\\}",escape(messageType.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def messagesMessageTypeLanguageLangActionsExportPost(host: String, messageType: String, lang: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/messages/{message_type}/language/{lang}/actions/export".replaceAll("\\{" + "message_type" + "\\}",escape(messageType.toString)).replaceAll("\\{" + "lang" + "\\}",escape(lang.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataAudittrailAuditTrailTypeGet(host: String, auditTrailType: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/audittrail/{audit_trail_type}".replaceAll("\\{" + "audit_trail_type" + "\\}",escape(auditTrailType.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataAudittrailGet(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/audittrail"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataComponentsComponentTypeGet(host: String, componentType: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/components/{component_type}".replaceAll("\\{" + "component_type" + "\\}",escape(componentType.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataComponentsGet(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/components"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataObjectsBindersTemplatesBindernodesGet(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/objects/binders/templates/bindernodes"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataObjectsBindersTemplatesGet(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/objects/binders/templates"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet(host: String, placemarkType: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/objects/documents/annotations/placemarks/types/{placemark_type}".replaceAll("\\{" + "placemark_type" + "\\}",escape(placemarkType.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet(host: String, referenceType: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/objects/documents/annotations/references/types/{reference_type}".replaceAll("\\{" + "reference_type" + "\\}",escape(referenceType.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet(host: String, annotationType: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/objects/documents/annotations/types/{annotation_type}".replaceAll("\\{" + "annotation_type" + "\\}",escape(annotationType.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet(host: String, eventType: String, eventSubtype: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/objects/documents/events/{event_type}/types/{event_subtype}".replaceAll("\\{" + "event_type" + "\\}",escape(eventType.toString)).replaceAll("\\{" + "event_subtype" + "\\}",escape(eventSubtype.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataObjectsDocumentsEventsGet(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/objects/documents/events"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataObjectsDocumentsLockGet(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/objects/documents/lock"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataObjectsDocumentsPropertiesFindCommonPost(host: String, `contentType`: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/objects/documents/properties/find_common"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Content-Type", `contentType`), Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataObjectsDocumentsPropertiesGet(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/objects/documents/properties"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataObjectsDocumentsTemplatesGet(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/objects/documents/templates"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataObjectsDocumentsTypesGet(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/objects/documents/types"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataObjectsDocumentsTypesTypeGet(host: String, `type`: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/objects/documents/types/{type}".replaceAll("\\{" + "type" + "\\}",escape(`type`.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataObjectsDocumentsTypesTypeRelationshipsGet(host: String, `type`: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/objects/documents/types/{type}/relationships".replaceAll("\\{" + "type" + "\\}",escape(`type`.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet(host: String, `type`: String, subtype: String, classification: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/objects/documents/types/{type}/subtypes/{subtype}/classifications/{classification}".replaceAll("\\{" + "type" + "\\}",escape(`type`.toString)).replaceAll("\\{" + "subtype" + "\\}",escape(subtype.toString)).replaceAll("\\{" + "classification" + "\\}",escape(classification.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet(host: String, `type`: String, subtype: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/objects/documents/types/{type}/subtypes/{subtype}".replaceAll("\\{" + "type" + "\\}",escape(`type`.toString)).replaceAll("\\{" + "subtype" + "\\}",escape(subtype.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataObjectsGroupsGet(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/objects/groups"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataObjectsSecuritypoliciesGet(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/objects/securitypolicies"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataObjectsUsersGet(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/objects/users"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/query/archived_documents/relationships/document_signature__sysr"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/query/documents/relationships/document_signature__sysr"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataVobjectsGet(host: String, loc: Boolean, authorization: String, accept: String, xVaultAPIClientID: String)(implicit locQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/metadata/vobjects"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("loc", Some(locQuery.toParamString(loc))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataVobjectsObjectNameActionsCanceldeploymentPost(host: String, objectName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/vobjects/{object_name}/actions/canceldeployment".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataVobjectsObjectNameFieldsObjectFieldNameGet(host: String, objectName: String, objectFieldName: String, loc: Boolean, authorization: String, accept: String, xVaultAPIClientID: String)(implicit locQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/metadata/vobjects/{object_name}/fields/{object_field_name}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_field_name" + "\\}",escape(objectFieldName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("loc", Some(locQuery.toParamString(loc))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataVobjectsObjectNameGet(host: String, objectName: String, loc: Boolean, authorization: String, accept: String, xVaultAPIClientID: String)(implicit locQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/metadata/vobjects/{object_name}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("loc", Some(locQuery.toParamString(loc))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataVobjectsObjectNamePageLayoutsGet(host: String, objectName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/vobjects/{object_name}/page_layouts".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataVobjectsObjectNamePageLayoutsLayoutNameGet(host: String, objectName: String, layoutName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/vobjects/{object_name}/page_layouts/{layout_name}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "layout_name" + "\\}",escape(layoutName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def notificationsHistoriesGet(host: String, startDate: String, endDate: String, allDates: Boolean, formatResult: String, limit: String, offset: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit startDateQuery: QueryParam[String], endDateQuery: QueryParam[String], allDatesQuery: QueryParam[Boolean], formatResultQuery: QueryParam[String], limitQuery: QueryParam[String], offsetQuery: QueryParam[String]): Task[Unit] = {
    val path = "/notifications/histories"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("allDates", Some(all_datesQuery.toParamString(all_dates))), ("formatResult", Some(format_resultQuery.toParamString(format_result))), ("limit", Some(limitQuery.toParamString(limit))), ("offset", Some(offsetQuery.toParamString(offset))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectWorkflowActionsActionGet(host: String, action: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/object/workflow/actions/{action}".replaceAll("\\{" + "action" + "\\}",escape(action.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectWorkflowActionsActionPost(host: String, action: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/object/workflow/actions/{action}".replaceAll("\\{" + "action" + "\\}",escape(action.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectWorkflowActionsCanceltasksPost(host: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/object/workflow/actions/canceltasks"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectWorkflowActionsCancelworkflowsPost(host: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/object/workflow/actions/cancelworkflows"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectWorkflowActionsGet(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/object/workflow/actions"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectWorkflowActionsReassigntasksPost(host: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/object/workflow/actions/reassigntasks"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectWorkflowActionsReplaceworkflowownerPost(host: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/object/workflow/actions/replaceworkflowowner"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersActionsExportJobIdResultsGet(host: String, jobId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/actions/export/{job_id}/results".replaceAll("\\{" + "job_id" + "\\}",escape(jobId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdActionsExportPost(host: String, binderId: String, source: Boolean, renditiontype: String, docversion: String, attachments: String, export: String, docfield: Boolean, authorization: String, accept: String, xVaultAPIClientID: String)(implicit sourceQuery: QueryParam[Boolean], renditiontypeQuery: QueryParam[String], docversionQuery: QueryParam[String], attachmentsQuery: QueryParam[String], exportQuery: QueryParam[String], docfieldQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/actions/export".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("source", Some(sourceQuery.toParamString(source))), ("renditiontype", Some(renditiontypeQuery.toParamString(renditiontype))), ("docversion", Some(docversionQuery.toParamString(docversion))), ("attachments", Some(attachmentsQuery.toParamString(attachments))), ("export", Some(exportQuery.toParamString(export))), ("docfield", Some(docfieldQuery.toParamString(docfield))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdActionsPost(host: String, binderId: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/actions".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdBindingRulePut(host: String, binderId: String, `contentType`: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/binding_rule".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Content-Type", `contentType`), Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdDelete(host: String, binderId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdDocumentsNodeIdBindingRulePut(host: String, binderId: String, nodeId: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/documents/{node_id}/binding_rule".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString)).replaceAll("\\{" + "node_id" + "\\}",escape(nodeId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdDocumentsPost(host: String, binderId: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/documents".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdDocumentsSectionIdDelete(host: String, binderId: String, sectionId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/documents/{section_id}".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString)).replaceAll("\\{" + "section_id" + "\\}",escape(sectionId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdDocumentsSectionIdPut(host: String, binderId: String, sectionId: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/documents/{section_id}".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString)).replaceAll("\\{" + "section_id" + "\\}",escape(sectionId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdGet(host: String, binderId: String, depth: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit depthQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/binders/{binder_id}".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("depth", Some(depthQuery.toParamString(depth))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdPost(host: String, binderId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdPut(host: String, binderId: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete(host: String, binderId: String, roleNameAndUserOrGroup: String, id: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/roles/{role_name_and_user_or_group}/{id}".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString)).replaceAll("\\{" + "role_name_and_user_or_group" + "\\}",escape(roleNameAndUserOrGroup.toString)).replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdSectionsNodeIdBindingRulePut(host: String, binderId: String, nodeId: String, `contentType`: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/sections/{node_id}/binding_rule".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString)).replaceAll("\\{" + "node_id" + "\\}",escape(nodeId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Content-Type", `contentType`), Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdSectionsNodeIdPut(host: String, binderId: String, nodeId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/sections/{node_id}".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString)).replaceAll("\\{" + "node_id" + "\\}",escape(nodeId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdSectionsPost(host: String, binderId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/sections".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdSectionsSectionIdDelete(host: String, binderId: String, sectionId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/sections/{section_id}".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString)).replaceAll("\\{" + "section_id" + "\\}",escape(sectionId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdSectionsSectionIdGet(host: String, binderId: String, sectionId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/sections/{section_id}".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString)).replaceAll("\\{" + "section_id" + "\\}",escape(sectionId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdVersionsGet(host: String, binderId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/versions".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost(host: String, binderId: String, majorVersion: String, minorVersion: String, source: Boolean, renditiontype: String, docversion: String, attachments: String, export: String, docfield: Boolean, authorization: String, accept: String, xVaultAPIClientID: String)(implicit sourceQuery: QueryParam[Boolean], renditiontypeQuery: QueryParam[String], docversionQuery: QueryParam[String], attachmentsQuery: QueryParam[String], exportQuery: QueryParam[String], docfieldQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/versions/{major_version}/{minor_version}/actions/export".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("source", Some(sourceQuery.toParamString(source))), ("renditiontype", Some(renditiontypeQuery.toParamString(renditiontype))), ("docversion", Some(docversionQuery.toParamString(docversion))), ("attachments", Some(attachmentsQuery.toParamString(attachments))), ("export", Some(exportQuery.toParamString(export))), ("docfield", Some(docfieldQuery.toParamString(docfield))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete(host: String, binderId: String, majorVersion: String, minorVersion: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/versions/{major_version}/{minor_version}".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdVersionsMajorVersionMinorVersionGet(host: String, binderId: String, majorVersion: String, minorVersion: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/versions/{major_version}/{minor_version}".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdVersionsMajorVersionMinorVersionPut(host: String, binderId: String, majorVersion: String, minorVersion: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/versions/{major_version}/{minor_version}".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost(host: String, binderId: String, majorVersion: String, minorVersion: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete(host: String, binderId: String, majorVersion: String, minorVersion: String, relationshipId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id}".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString)).replaceAll("\\{" + "relationship_id" + "\\}",escape(relationshipId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet(host: String, binderId: String, majorVersion: String, minorVersion: String, relationshipId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id}".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString)).replaceAll("\\{" + "relationship_id" + "\\}",escape(relationshipId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet(host: String, binderId: String, majorVersion: String, minorVersion: String, sectionId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/versions/{major_version}/{minor_version}/sections/{section_id}".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString)).replaceAll("\\{" + "section_id" + "\\}",escape(sectionId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersIdRolesGet(host: String, id: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{id}/roles".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersIdRolesPost(host: String, id: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{id}/roles".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersIdRolesRoleNameGet(host: String, id: String, roleName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{id}/roles/{role_name}".replaceAll("\\{" + "id" + "\\}",escape(id.toString)).replaceAll("\\{" + "role_name" + "\\}",escape(roleName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet(host: String, id: String, majorVersion: String, minorVersion: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions".replaceAll("\\{" + "id" + "\\}",escape(id.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet(host: String, id: String, majorVersion: String, minorVersion: String, nameV: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}/entry_requirements".replaceAll("\\{" + "id" + "\\}",escape(id.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString)).replaceAll("\\{" + "name__v" + "\\}",escape(nameV.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut(host: String, id: String, majorVersion: String, minorVersion: String, nameV: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}".replaceAll("\\{" + "id" + "\\}",escape(id.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString)).replaceAll("\\{" + "name__v" + "\\}",escape(nameV.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersLifecycleActionsPost(host: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/lifecycle_actions"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersLifecycleActionsUserActionNamePut(host: String, userActionName: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/lifecycle_actions/{user_action_name}".replaceAll("\\{" + "user_action_name" + "\\}",escape(userActionName.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersPost(host: String, async: Boolean, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String)(implicit asyncQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/objects/binders"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("async", Some(asyncQuery.toParamString(async))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersTemplatesGet(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/templates"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersTemplatesPost(host: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/templates"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersTemplatesPut(host: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/templates"

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersTemplatesTemplateNameBindernodesGet(host: String, templateName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/templates/{template_name}/bindernodes".replaceAll("\\{" + "template_name" + "\\}",escape(templateName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersTemplatesTemplateNameBindernodesPost(host: String, templateName: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/templates/{template_name}/bindernodes".replaceAll("\\{" + "template_name" + "\\}",escape(templateName.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersTemplatesTemplateNameBindernodesPut(host: String, templateName: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/templates/{template_name}/bindernodes".replaceAll("\\{" + "template_name" + "\\}",escape(templateName.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersTemplatesTemplateNameDelete(host: String, templateName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/templates/{template_name}".replaceAll("\\{" + "template_name" + "\\}",escape(templateName.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersTemplatesTemplateNameGet(host: String, templateName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/templates/{template_name}".replaceAll("\\{" + "template_name" + "\\}",escape(templateName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDeletionsDocumentsGet(host: String, startDate: String, endDate: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String)(implicit startDateQuery: QueryParam[String], endDateQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/deletions/documents"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDeletionsVobjectsObjectNameGet(host: String, objectName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/deletions/vobjects/{object_name}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsActionsGet(host: String, loc: Boolean, authorization: String, accept: String, xVaultAPIClientID: String)(implicit locQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/objects/documents/actions"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("loc", Some(locQuery.toParamString(loc))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet(host: String, lifecycleAndStateAndAction: String, jobId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/actions/{lifecycle_and_state_and_action}/{job_id}/results".replaceAll("\\{" + "lifecycle_and_state_and_action" + "\\}",escape(lifecycleAndStateAndAction.toString)).replaceAll("\\{" + "job_id" + "\\}",escape(jobId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsActionsWorkflowNameGet(host: String, workflowName: String, loc: Boolean, authorization: String, accept: String, xVaultAPIClientID: String)(implicit locQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/objects/documents/actions/{workflow_name}".replaceAll("\\{" + "workflow_name" + "\\}",escape(workflowName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("loc", Some(locQuery.toParamString(loc))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsActionsWorkflowNamePost(host: String, workflowName: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/actions/{workflow_name}".replaceAll("\\{" + "workflow_name" + "\\}",escape(workflowName.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsAnnotationsBatchDelete(host: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/annotations/batch"

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsAnnotationsBatchPost(host: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/annotations/batch"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsAnnotationsBatchPut(host: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/annotations/batch"

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsAnnotationsRepliesBatchPost(host: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/annotations/replies/batch"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsAttachmentsBatchDelete(host: String, accept: String, authorization: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/attachments/batch"

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsAttachmentsBatchPost(host: String, accept: String, authorization: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/attachments/batch"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsAttachmentsBatchPut(host: String, accept: String, authorization: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/attachments/batch"

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsBatchActionsFileextractJobIdResultsGet(host: String, jobId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/batch/actions/fileextract/{job_id}/results".replaceAll("\\{" + "job_id" + "\\}",escape(jobId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsBatchActionsFileextractPost(host: String, source: Boolean, renditions: Boolean, allversions: Boolean, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String)(implicit sourceQuery: QueryParam[Boolean], renditionsQuery: QueryParam[Boolean], allversionsQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/objects/documents/batch/actions/fileextract"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("source", Some(sourceQuery.toParamString(source))), ("renditions", Some(renditionsQuery.toParamString(renditions))), ("allversions", Some(allversionsQuery.toParamString(allversions))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsBatchActionsReclassifyPut(host: String, authorization: String, `contentType`: String, accept: String, xVaultAPIMigrationMode: Boolean, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/batch/actions/reclassify"

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-MigrationMode", xVaultAPIMigrationMode), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsBatchActionsRerenderPost(host: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/batch/actions/rerender"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsBatchDelete(host: String, idParam: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String)(implicit idParamQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/documents/batch"

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("idParam", Some(idParamQuery.toParamString(idParam))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsBatchLockDelete(host: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/batch/lock"

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsBatchPost(host: String, authorization: String, accept: String, `contentType`: String, xVaultAPIMigrationMode: Boolean, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/batch"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-MigrationMode", xVaultAPIMigrationMode), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsBatchPut(host: String, authorization: String, accept: String, `contentType`: String, xVaultAPIMigrationMode: Boolean, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/batch"

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-MigrationMode", xVaultAPIMigrationMode), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdAnchorsGet(host: String, docId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/anchors".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdAnnotationsFileGet(host: String, docId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/annotations/file".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdAnnotationsFilePost(host: String, docId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/annotations/file".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdAttachmentsAttachmentIdDelete(host: String, docId: String, attachmentId: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/attachments/{attachment_id}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "attachment_id" + "\\}",escape(attachmentId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdAttachmentsAttachmentIdFileGet(host: String, docId: String, attachmentId: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/attachments/{attachment_id}/file".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "attachment_id" + "\\}",escape(attachmentId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdAttachmentsAttachmentIdGet(host: String, docId: String, attachmentId: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/attachments/{attachment_id}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "attachment_id" + "\\}",escape(attachmentId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdAttachmentsAttachmentIdPut(host: String, docId: String, attachmentId: String, accept: String, authorization: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/attachments/{attachment_id}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "attachment_id" + "\\}",escape(attachmentId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete(host: String, docId: String, attachmentId: String, attachmentVersion: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "attachment_id" + "\\}",escape(attachmentId.toString)).replaceAll("\\{" + "attachment_version" + "\\}",escape(attachmentVersion.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(host: String, docId: String, attachmentId: String, attachmentVersion: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}/file".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "attachment_id" + "\\}",escape(attachmentId.toString)).replaceAll("\\{" + "attachment_version" + "\\}",escape(attachmentVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet(host: String, docId: String, attachmentId: String, attachmentVersion: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "attachment_id" + "\\}",escape(attachmentId.toString)).replaceAll("\\{" + "attachment_version" + "\\}",escape(attachmentVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost(host: String, docId: String, attachmentId: String, attachmentVersion: String, restore: Boolean, accept: String, authorization: String, xVaultAPIClientID: String)(implicit restoreQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "attachment_id" + "\\}",escape(attachmentId.toString)).replaceAll("\\{" + "attachment_version" + "\\}",escape(attachmentVersion.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("restore", Some(restoreQuery.toParamString(restore))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet(host: String, docId: String, attachmentId: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/attachments/{attachment_id}/versions".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "attachment_id" + "\\}",escape(attachmentId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdAttachmentsFileGet(host: String, docId: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/attachments/file".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdAttachmentsGet(host: String, docId: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/attachments".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdAttachmentsPost(host: String, docId: String, accept: String, authorization: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/attachments".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdAudittrailGet(host: String, docId: String, startDate: String, endDate: String, formatResult: String, limit: String, offset: String, events: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit startDateQuery: QueryParam[String], endDateQuery: QueryParam[String], formatResultQuery: QueryParam[String], limitQuery: QueryParam[String], offsetQuery: QueryParam[String], eventsQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/audittrail".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("formatResult", Some(format_resultQuery.toParamString(format_result))), ("limit", Some(limitQuery.toParamString(limit))), ("offset", Some(offsetQuery.toParamString(offset))), ("events", Some(eventsQuery.toParamString(events))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdDelete(host: String, docId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdEventsGet(host: String, docId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/events".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdFileGet(host: String, docId: String, lockDocument: Boolean, accept: String, authorization: String, xVaultAPIClientID: String)(implicit lockDocumentQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/file".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("lockDocument", Some(lockDocumentQuery.toParamString(lockDocument))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdGet(host: String, docId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdLockDelete(host: String, docId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/lock".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdLockGet(host: String, docId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/lock".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdLockPost(host: String, docId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/lock".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet(host: String, docId: String, majorVersion: String, minorVersion: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/{major_version}/{minor_version}/attachments/file".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdPost(host: String, docId: String, suppressRendition: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String)(implicit suppressRenditionQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/documents/{doc_id}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("suppressRendition", Some(suppressRenditionQuery.toParamString(suppressRendition))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdPut(host: String, docId: String, authorization: String, `contentType`: String, accept: String, xVaultAPIMigrationMode: Boolean, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-MigrationMode", xVaultAPIMigrationMode), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdRenditionsGet(host: String, docId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/renditions".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdRenditionsRenditionTypeDelete(host: String, docId: String, renditionType: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/renditions/{rendition_type}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "rendition_type" + "\\}",escape(renditionType.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdRenditionsRenditionTypeGet(host: String, docId: String, renditionType: String, steadyState: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit steadyStateQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/renditions/{rendition_type}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "rendition_type" + "\\}",escape(renditionType.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("steadyState", Some(steadyStateQuery.toParamString(steadyState))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdRenditionsRenditionTypePost(host: String, docId: String, renditionType: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/renditions/{rendition_type}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "rendition_type" + "\\}",escape(renditionType.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdRenditionsRenditionTypePut(host: String, docId: String, renditionType: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/renditions/{rendition_type}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "rendition_type" + "\\}",escape(renditionType.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete(host: String, docId: String, roleNameAndUserOrGroup: String, id: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/roles/{role_name_and_user_or_group}/{id}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "role_name_and_user_or_group" + "\\}",escape(roleNameAndUserOrGroup.toString)).replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet(host: String, docId: String, majorVersion: String, minorVersion: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/version/{major_version}/{minor_version}/attachments".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsGet(host: String, docId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet(host: String, docId: String, majorVersion: String, minorVersion: String, annotationId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/{annotation_id}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString)).replaceAll("\\{" + "annotation_id" + "\\}",escape(annotationId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet(host: String, docId: String, majorVersion: String, minorVersion: String, annotationId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/{annotation_id}/replies".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString)).replaceAll("\\{" + "annotation_id" + "\\}",escape(annotationId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet(host: String, docId: String, majorVersion: String, minorVersion: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/file".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost(host: String, docId: String, majorVersion: String, minorVersion: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/file".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet(host: String, docId: String, majorVersion: String, minorVersion: String, limit: String, offset: String, annotationTypes: String, paginationId: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit limitQuery: QueryParam[String], offsetQuery: QueryParam[String], annotationTypesQuery: QueryParam[String], paginationIdQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("offset", Some(offsetQuery.toParamString(offset))), ("annotationTypes", Some(annotation_typesQuery.toParamString(annotation_types))), ("paginationId", Some(pagination_idQuery.toParamString(pagination_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(host: String, docId: String, majorVersion: String, minorVersion: String, attachmentId: String, attachmentVersion: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/attachments/{attachment_id}/versions/{attachment_version}/file".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString)).replaceAll("\\{" + "attachment_id" + "\\}",escape(attachmentId.toString)).replaceAll("\\{" + "attachment_version" + "\\}",escape(attachmentVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet(host: String, docId: String, majorVersion: String, minorVersion: String, attachmentId: String, attachmentVersion: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/attachments/{attachment_id}/versions/{attachment_version}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString)).replaceAll("\\{" + "attachment_id" + "\\}",escape(attachmentId.toString)).replaceAll("\\{" + "attachment_version" + "\\}",escape(attachmentVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete(host: String, docId: String, majorVersion: String, minorVersion: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet(host: String, docId: String, majorVersion: String, minorVersion: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/doc-export-annotations-to-csv".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost(host: String, docId: String, majorVersion: String, minorVersion: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/events".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet(host: String, docId: String, majorVersion: String, minorVersion: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/export-video-annotations".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet(host: String, docId: String, majorVersion: String, minorVersion: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/file".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet(host: String, docId: String, majorVersion: String, minorVersion: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut(host: String, docId: String, majorVersion: String, minorVersion: String, authorization: String, `contentType`: String, accept: String, xVaultAPIMigrationMode: Boolean, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-MigrationMode", xVaultAPIMigrationMode), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet(host: String, docId: String, majorVersion: String, minorVersion: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost(host: String, docId: String, majorVersion: String, minorVersion: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete(host: String, docId: String, majorVersion: String, minorVersion: String, relationshipId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString)).replaceAll("\\{" + "relationship_id" + "\\}",escape(relationshipId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet(host: String, docId: String, majorVersion: String, minorVersion: String, relationshipId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString)).replaceAll("\\{" + "relationship_id" + "\\}",escape(relationshipId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet(host: String, docId: String, majorVersion: String, minorVersion: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete(host: String, docId: String, majorVersion: String, minorVersion: String, renditionType: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString)).replaceAll("\\{" + "rendition_type" + "\\}",escape(renditionType.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet(host: String, docId: String, majorVersion: String, minorVersion: String, renditionType: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString)).replaceAll("\\{" + "rendition_type" + "\\}",escape(renditionType.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost(host: String, docId: String, majorVersion: String, minorVersion: String, renditionType: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString)).replaceAll("\\{" + "rendition_type" + "\\}",escape(renditionType.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut(host: String, docId: String, majorVersion: String, minorVersion: String, renditionType: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString)).replaceAll("\\{" + "rendition_type" + "\\}",escape(renditionType.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet(host: String, docId: String, majorVersion: String, minorVersion: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/thumbnail".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsGet(host: String, namedFilter: String, scope: String, versionscope: String, search: String, limit: String, sort: String, start: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit namedFilterQuery: QueryParam[String], scopeQuery: QueryParam[String], versionscopeQuery: QueryParam[String], searchQuery: QueryParam[String], limitQuery: QueryParam[String], sortQuery: QueryParam[String], startQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/documents"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("namedFilter", Some(named_filterQuery.toParamString(named_filter))), ("scope", Some(scopeQuery.toParamString(scope))), ("versionscope", Some(versionscopeQuery.toParamString(versionscope))), ("search", Some(searchQuery.toParamString(search))), ("limit", Some(limitQuery.toParamString(limit))), ("sort", Some(sortQuery.toParamString(sort))), ("start", Some(startQuery.toParamString(start))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsIdRolesGet(host: String, id: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{id}/roles".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsIdRolesPost(host: String, id: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{id}/roles".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsIdRolesRoleNameGet(host: String, id: String, roleName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{id}/roles/{role_name}".replaceAll("\\{" + "id" + "\\}",escape(id.toString)).replaceAll("\\{" + "role_name" + "\\}",escape(roleName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet(host: String, id: String, majorVersion: String, minorVersion: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions".replaceAll("\\{" + "id" + "\\}",escape(id.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet(host: String, id: String, majorVersion: String, minorVersion: String, nameV: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}/entry_requirements".replaceAll("\\{" + "id" + "\\}",escape(id.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString)).replaceAll("\\{" + "name__v" + "\\}",escape(nameV.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut(host: String, id: String, majorVersion: String, minorVersion: String, nameV: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}".replaceAll("\\{" + "id" + "\\}",escape(id.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString)).replaceAll("\\{" + "name__v" + "\\}",escape(nameV.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsLifecycleActionsPost(host: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/lifecycle_actions"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsLifecycleActionsUserActionNamePut(host: String, userActionName: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/lifecycle_actions/{user_action_name}".replaceAll("\\{" + "user_action_name" + "\\}",escape(userActionName.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsPost(host: String, authorization: String, accept: String, xVaultAPIMigrationMode: Boolean, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-MigrationMode", xVaultAPIMigrationMode), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsRelationshipsBatchDelete(host: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/relationships/batch"

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsRelationshipsBatchPost(host: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/relationships/batch"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsRenditionsBatchDelete(host: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/renditions/batch"

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsRenditionsBatchPost(host: String, idParam: String, largeSizeAsset: String, authorization: String, accept: String, `contentType`: String, xVaultAPIMigrationMode: Boolean, xVaultAPIClientID: String)(implicit idParamQuery: QueryParam[String], largeSizeAssetQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/documents/renditions/batch"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-MigrationMode", xVaultAPIMigrationMode), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("idParam", Some(idParamQuery.toParamString(idParam))), ("largeSizeAsset", Some(largeSizeAssetQuery.toParamString(largeSizeAsset))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsRolesBatchDelete(host: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/roles/batch"

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsRolesBatchPost(host: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/roles/batch"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsTemplatesGet(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/templates"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsTemplatesPost(host: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/templates"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsTemplatesPut(host: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/templates"

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsTemplatesTemplateNameDelete(host: String, templateName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/templates/{template_name}".replaceAll("\\{" + "template_name" + "\\}",escape(templateName.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsTemplatesTemplateNameFileGet(host: String, templateName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/templates/{template_name}/file".replaceAll("\\{" + "template_name" + "\\}",escape(templateName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsTemplatesTemplateNameGet(host: String, templateName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/templates/{template_name}".replaceAll("\\{" + "template_name" + "\\}",escape(templateName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsTemplatesTemplateNamePut(host: String, templateName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/templates/{template_name}".replaceAll("\\{" + "template_name" + "\\}",escape(templateName.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsTokensPost(host: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/tokens"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsVersionsBatchActionsFileextractPost(host: String, source: Boolean, renditions: Boolean, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String)(implicit sourceQuery: QueryParam[Boolean], renditionsQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/objects/documents/versions/batch/actions/fileextract"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("source", Some(sourceQuery.toParamString(source))), ("renditions", Some(renditionsQuery.toParamString(renditions))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsVersionsBatchDelete(host: String, idParam: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String)(implicit idParamQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/documents/versions/batch"

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("idParam", Some(idParamQuery.toParamString(idParam))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsVersionsBatchPost(host: String, idParam: String, authorization: String, accept: String, `contentType`: String, xVaultAPIMigrationMode: String, xVaultAPIClientID: String)(implicit idParamQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/documents/versions/batch"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-MigrationMode", xVaultAPIMigrationMode), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("idParam", Some(idParamQuery.toParamString(idParam))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDomainGet(host: String, includeApplication: Boolean, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String)(implicit includeApplicationQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/objects/domain"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("includeApplication", Some(include_applicationQuery.toParamString(include_application))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDomainsGet(host: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/domains"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsEdlMatchedDocumentsBatchActionsAddPost(host: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/edl_matched_documents/batch/actions/add"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsEdlMatchedDocumentsBatchActionsRemovePost(host: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/edl_matched_documents/batch/actions/remove"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsGroupsAutoGet(host: String, limit: String, offset: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit limitQuery: QueryParam[String], offsetQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/groups/auto"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("offset", Some(offsetQuery.toParamString(offset))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsGroupsGet(host: String, includeImplied: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit includeImpliedQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/groups"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("includeImplied", Some(includeImpliedQuery.toParamString(includeImplied))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsGroupsGroupIdDelete(host: String, groupId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/groups/{group_id}".replaceAll("\\{" + "group_id" + "\\}",escape(groupId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsGroupsGroupIdGet(host: String, groupId: String, includeImplied: Boolean, authorization: String, accept: String, xVaultAPIClientID: String)(implicit includeImpliedQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/objects/groups/{group_id}".replaceAll("\\{" + "group_id" + "\\}",escape(groupId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("includeImplied", Some(includeImpliedQuery.toParamString(includeImplied))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsGroupsGroupIdPut(host: String, groupId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/groups/{group_id}".replaceAll("\\{" + "group_id" + "\\}",escape(groupId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsGroupsPost(host: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/groups"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsLicensesGet(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/licenses"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsActionsGet(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/objectworkflows/actions"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsActionsWorkflowNameGet(host: String, workflowName: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/objectworkflows/actions/{workflow_name}".replaceAll("\\{" + "workflow_name" + "\\}",escape(workflowName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsActionsWorkflowNamePost(host: String, workflowName: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/objectworkflows/actions/{workflow_name}".replaceAll("\\{" + "workflow_name" + "\\}",escape(workflowName.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsGet(host: String, objectV: String, recordIdV: String, participant: String, statusV: String, offset: String, pageSize: String, loc: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit objectVQuery: QueryParam[String], recordIdVQuery: QueryParam[String], participantQuery: QueryParam[String], statusVQuery: QueryParam[String], offsetQuery: QueryParam[String], pageSizeQuery: QueryParam[String], locQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/objectworkflows"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("objectV", Some(object__vQuery.toParamString(object__v))), ("recordIdV", Some(record_id__vQuery.toParamString(record_id__v))), ("participant", Some(participantQuery.toParamString(participant))), ("statusV", Some(status__vQuery.toParamString(status__v))), ("offset", Some(offsetQuery.toParamString(offset))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("loc", Some(locQuery.toParamString(loc))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsTasksGet(host: String, objectV: String, recordIdV: String, assigneeV: String, statusV: String, offset: String, pageSize: String, loc: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit objectVQuery: QueryParam[String], recordIdVQuery: QueryParam[String], assigneeVQuery: QueryParam[String], statusVQuery: QueryParam[String], offsetQuery: QueryParam[String], pageSizeQuery: QueryParam[String], locQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/objectworkflows/tasks"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("objectV", Some(object__vQuery.toParamString(object__v))), ("recordIdV", Some(record_id__vQuery.toParamString(record_id__v))), ("assigneeV", Some(assignee__vQuery.toParamString(assignee__v))), ("statusV", Some(status__vQuery.toParamString(status__v))), ("offset", Some(offsetQuery.toParamString(offset))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("loc", Some(locQuery.toParamString(loc))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsTasksTaskIdActionsAcceptPost(host: String, taskId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/objectworkflows/tasks/{task_id}/actions/accept".replaceAll("\\{" + "task_id" + "\\}",escape(taskId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsTasksTaskIdActionsCancelPost(host: String, taskId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/objectworkflows/tasks/{task_id}/actions/cancel".replaceAll("\\{" + "task_id" + "\\}",escape(taskId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsTasksTaskIdActionsCompletePost(host: String, taskId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/objectworkflows/tasks/{task_id}/actions/complete".replaceAll("\\{" + "task_id" + "\\}",escape(taskId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsTasksTaskIdActionsGet(host: String, taskId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/objectworkflows/tasks/{task_id}/actions".replaceAll("\\{" + "task_id" + "\\}",escape(taskId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost(host: String, taskId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/objectworkflows/tasks/{task_id}/actions/mdwaccept".replaceAll("\\{" + "task_id" + "\\}",escape(taskId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost(host: String, taskId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/objectworkflows/tasks/{task_id}/actions/mdwcomplete".replaceAll("\\{" + "task_id" + "\\}",escape(taskId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost(host: String, taskId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/objectworkflows/tasks/{task_id}/actions/mdwmanagecontent".replaceAll("\\{" + "task_id" + "\\}",escape(taskId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost(host: String, taskId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/objectworkflows/tasks/{task_id}/actions/mdwreassign".replaceAll("\\{" + "task_id" + "\\}",escape(taskId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsTasksTaskIdActionsReassignPost(host: String, taskId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/objectworkflows/tasks/{task_id}/actions/reassign".replaceAll("\\{" + "task_id" + "\\}",escape(taskId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsTasksTaskIdActionsTaskActionGet(host: String, taskId: String, taskAction: String, loc: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit locQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/objectworkflows/tasks/{task_id}/actions/{task_action}".replaceAll("\\{" + "task_id" + "\\}",escape(taskId.toString)).replaceAll("\\{" + "task_action" + "\\}",escape(taskAction.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("loc", Some(locQuery.toParamString(loc))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost(host: String, taskId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/objectworkflows/tasks/{task_id}/actions/undoaccept".replaceAll("\\{" + "task_id" + "\\}",escape(taskId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost(host: String, taskId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/objectworkflows/tasks/{task_id}/actions/updateduedate".replaceAll("\\{" + "task_id" + "\\}",escape(taskId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsTasksTaskIdGet(host: String, taskId: String, loc: Boolean, authorization: String, accept: String, xVaultAPIClientID: String)(implicit locQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/objects/objectworkflows/tasks/{task_id}".replaceAll("\\{" + "task_id" + "\\}",escape(taskId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("loc", Some(locQuery.toParamString(loc))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsWorkflowIdActionsGet(host: String, workflowId: String, loc: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit locQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/objectworkflows/{workflow_id}/actions".replaceAll("\\{" + "workflow_id" + "\\}",escape(workflowId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("loc", Some(locQuery.toParamString(loc))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet(host: String, workflowId: String, workflowAction: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/objectworkflows/{workflow_id}/actions/{workflow_action}".replaceAll("\\{" + "workflow_id" + "\\}",escape(workflowId.toString)).replaceAll("\\{" + "workflow_action" + "\\}",escape(workflowAction.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost(host: String, workflowId: String, workflowAction: String, documentsSys: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String)(implicit documentsSysQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/objectworkflows/{workflow_id}/actions/{workflow_action}".replaceAll("\\{" + "workflow_id" + "\\}",escape(workflowId.toString)).replaceAll("\\{" + "workflow_action" + "\\}",escape(workflowAction.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("documentsSys", Some(documents__sysQuery.toParamString(documents__sys))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsWorkflowIdGet(host: String, workflowId: String, loc: Boolean, authorization: String, accept: String, xVaultAPIClientID: String)(implicit locQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/objects/objectworkflows/{workflow_id}".replaceAll("\\{" + "workflow_id" + "\\}",escape(workflowId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("loc", Some(locQuery.toParamString(loc))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsPicklistsGet(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/picklists"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsPicklistsPicklistNameGet(host: String, picklistName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/picklists/{picklist_name}".replaceAll("\\{" + "picklist_name" + "\\}",escape(picklistName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsPicklistsPicklistNamePicklistValueNameDelete(host: String, picklistName: String, picklistValueName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/picklists/{picklist_name}/{picklist_value_name}".replaceAll("\\{" + "picklist_name" + "\\}",escape(picklistName.toString)).replaceAll("\\{" + "picklist_value_name" + "\\}",escape(picklistValueName.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsPicklistsPicklistNamePicklistValueNamePut(host: String, picklistName: String, picklistValueName: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/picklists/{picklist_name}/{picklist_value_name}".replaceAll("\\{" + "picklist_name" + "\\}",escape(picklistName.toString)).replaceAll("\\{" + "picklist_value_name" + "\\}",escape(picklistValueName.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsPicklistsPicklistNamePost(host: String, picklistName: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/picklists/{picklist_name}".replaceAll("\\{" + "picklist_name" + "\\}",escape(picklistName.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsPicklistsPicklistNamePut(host: String, picklistName: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/picklists/{picklist_name}".replaceAll("\\{" + "picklist_name" + "\\}",escape(picklistName.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsSandboxActionsBuildproductionPost(host: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/sandbox/actions/buildproduction"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsSandboxActionsPromoteproductionPost(host: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/sandbox/actions/promoteproduction"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsSandboxActionsRecheckusagePost(host: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/sandbox/actions/recheckusage"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsSandboxBatchChangesizePost(host: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/sandbox/batch/changesize"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsSandboxEntitlementsSetPost(host: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/sandbox/entitlements/set"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsSandboxGet(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/sandbox"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsSandboxNameDelete(host: String, name: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/sandbox/{name}".replaceAll("\\{" + "name" + "\\}",escape(name.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsSandboxPost(host: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/sandbox"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsSandboxSnapshotApiNameActionsUpdatePost(host: String, apiName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/sandbox/snapshot/{api_name}/actions/update".replaceAll("\\{" + "api_name" + "\\}",escape(apiName.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsSandboxSnapshotApiNameActionsUpgradePost(host: String, apiName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/sandbox/snapshot/{api_name}/actions/upgrade".replaceAll("\\{" + "api_name" + "\\}",escape(apiName.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsSandboxSnapshotApiNameDelete(host: String, apiName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/sandbox/snapshot/{api_name}".replaceAll("\\{" + "api_name" + "\\}",escape(apiName.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsSandboxSnapshotGet(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/sandbox/snapshot"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsSandboxSnapshotPost(host: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/sandbox/snapshot"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsSandboxVaultIdActionsRefreshPost(host: String, vaultId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/sandbox/{vault_id}/actions/refresh".replaceAll("\\{" + "vault_id" + "\\}",escape(vaultId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsSandboxVaultIdGet(host: String, vaultId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/sandbox/{vault_id}".replaceAll("\\{" + "vault_id" + "\\}",escape(vaultId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsSecuritypoliciesGet(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/securitypolicies"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsSecuritypoliciesSecurityPolicyNameGet(host: String, securityPolicyName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/securitypolicies/{security_policy_name}".replaceAll("\\{" + "security_policy_name" + "\\}",escape(securityPolicyName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsUsersGet(host: String, vaults: String, excludeVaultMembership: String, excludeAppLicensing: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit vaultsQuery: QueryParam[String], excludeVaultMembershipQuery: QueryParam[String], excludeAppLicensingQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/users/"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("vaults", Some(vaultsQuery.toParamString(vaults))), ("excludeVaultMembership", Some(exclude_vault_membershipQuery.toParamString(exclude_vault_membership))), ("excludeAppLicensing", Some(exclude_app_licensingQuery.toParamString(exclude_app_licensing))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsUsersIdGet(host: String, id: String, excludeVaultMembership: String, excludeAppLicensing: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit excludeVaultMembershipQuery: QueryParam[String], excludeAppLicensingQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/users/{id}".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("excludeVaultMembership", Some(exclude_vault_membershipQuery.toParamString(exclude_vault_membership))), ("excludeAppLicensing", Some(exclude_app_licensingQuery.toParamString(exclude_app_licensing))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsUsersIdPermissionsGet(host: String, id: String, filter: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit filterQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/users/{id}/permissions".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("filter", Some(filterQuery.toParamString(filter))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsUsersIdPut(host: String, id: String, authorization: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/users/{id}".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsUsersMeGet(host: String, excludeVaultMembership: String, excludeAppLicensing: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit excludeVaultMembershipQuery: QueryParam[String], excludeAppLicensingQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/users/me"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("excludeVaultMembership", Some(exclude_vault_membershipQuery.toParamString(exclude_vault_membership))), ("excludeAppLicensing", Some(exclude_app_licensingQuery.toParamString(exclude_app_licensing))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsUsersMePasswordPost(host: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/users/me/password"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsUsersMePermissionsGet(host: String, filter: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit filterQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/users/me/permissions"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("filter", Some(filterQuery.toParamString(filter))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsUsersMePut(host: String, authorization: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/users/me"

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsUsersPost(host: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/users"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsUsersPut(host: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/users"

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsUsersUserIdDelete(host: String, userId: String, domain: Boolean, authorization: String, accept: String, xVaultAPIClientID: String)(implicit domainQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/objects/users/{user_id}".replaceAll("\\{" + "user_id" + "\\}",escape(userId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("domain", Some(domainQuery.toParamString(domain))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsUsersUserIdVaultMembershipVaultIdPut(host: String, userId: String, vaultId: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/users/{user_id}/vault_membership/{vault_id}".replaceAll("\\{" + "user_id" + "\\}",escape(userId.toString)).replaceAll("\\{" + "vault_id" + "\\}",escape(vaultId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsVaultActionsComparePost(host: String, authorization: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/vault/actions/compare"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsVaultActionsConfigreportPost(host: String, authorization: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/vault/actions/configreport"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def queryComponentsPost(host: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/query/components"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def queryNextPagePost(host: String, nextPage: String, authorization: String, accept: String, xVaultAPIDescribeQuery: Boolean, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/query/{next_page}".replaceAll("\\{" + "next_page" + "\\}",escape(nextPage.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-DescribeQuery", xVaultAPIDescribeQuery), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def queryPost(host: String, authorization: String, accept: String, xVaultAPIDescribeQuery: Boolean, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/query"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-DescribeQuery", xVaultAPIDescribeQuery), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def queryPreviousPagePost(host: String, previousPage: String, authorization: String, accept: String, xVaultAPIDescribeQuery: Boolean, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/query/{previous_page}".replaceAll("\\{" + "previous_page" + "\\}",escape(previousPage.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-DescribeQuery", xVaultAPIDescribeQuery), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def scimV2MeGet(host: String, attributes: String, excludedAttributes: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit attributesQuery: QueryParam[String], excludedAttributesQuery: QueryParam[String]): Task[Unit] = {
    val path = "/scim/v2/Me"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("attributes", Some(attributesQuery.toParamString(attributes))), ("excludedAttributes", Some(excludedAttributesQuery.toParamString(excludedAttributes))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def scimV2MePut(host: String, attributes: String, excludedAttributes: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String)(implicit attributesQuery: QueryParam[String], excludedAttributesQuery: QueryParam[String]): Task[Unit] = {
    val path = "/scim/v2/Me"

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("attributes", Some(attributesQuery.toParamString(attributes))), ("excludedAttributes", Some(excludedAttributesQuery.toParamString(excludedAttributes))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def scimV2ResourceTypesGet(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/scim/v2/ResourceTypes"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def scimV2ResourceTypesTypeGet(host: String, `type`: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/scim/v2/ResourceTypes/{type}".replaceAll("\\{" + "type" + "\\}",escape(`type`.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def scimV2SchemasGet(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/scim/v2/Schemas"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def scimV2SchemasIdGet(host: String, id: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/scim/v2/Schemas/{id}".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def scimV2ServiceProviderConfigGet(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/scim/v2/ServiceProviderConfig"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def scimV2TypeGet(host: String, `type`: String, filter: String, attributes: String, excludedAttributes: String, sortBy: String, sortOrder: String, startIndex: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit filterQuery: QueryParam[String], attributesQuery: QueryParam[String], excludedAttributesQuery: QueryParam[String], sortByQuery: QueryParam[String], sortOrderQuery: QueryParam[String], startIndexQuery: QueryParam[String]): Task[Unit] = {
    val path = "/scim/v2/{type}".replaceAll("\\{" + "type" + "\\}",escape(`type`.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("filter", Some(filterQuery.toParamString(filter))), ("attributes", Some(attributesQuery.toParamString(attributes))), ("excludedAttributes", Some(excludedAttributesQuery.toParamString(excludedAttributes))), ("sortBy", Some(sortByQuery.toParamString(sortBy))), ("sortOrder", Some(sortOrderQuery.toParamString(sortOrder))), ("startIndex", Some(startIndexQuery.toParamString(startIndex))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def scimV2TypeIdGet(host: String, `type`: String, id: String, attributes: String, excludedAttributes: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit attributesQuery: QueryParam[String], excludedAttributesQuery: QueryParam[String]): Task[Unit] = {
    val path = "/scim/v2/{type}/{id}".replaceAll("\\{" + "type" + "\\}",escape(`type`.toString)).replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("attributes", Some(attributesQuery.toParamString(attributes))), ("excludedAttributes", Some(excludedAttributesQuery.toParamString(excludedAttributes))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def scimV2UsersGet(host: String, filter: String, attributes: String, excludedAttributes: String, sortBy: String, sortOrder: String, count: String, startIndex: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit filterQuery: QueryParam[String], attributesQuery: QueryParam[String], excludedAttributesQuery: QueryParam[String], sortByQuery: QueryParam[String], sortOrderQuery: QueryParam[String], countQuery: QueryParam[String], startIndexQuery: QueryParam[String]): Task[Unit] = {
    val path = "/scim/v2/Users"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("filter", Some(filterQuery.toParamString(filter))), ("attributes", Some(attributesQuery.toParamString(attributes))), ("excludedAttributes", Some(excludedAttributesQuery.toParamString(excludedAttributes))), ("sortBy", Some(sortByQuery.toParamString(sortBy))), ("sortOrder", Some(sortOrderQuery.toParamString(sortOrder))), ("count", Some(countQuery.toParamString(count))), ("startIndex", Some(startIndexQuery.toParamString(startIndex))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def scimV2UsersIdGet(host: String, id: String, filter: String, attributes: String, excludedAttributes: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit filterQuery: QueryParam[String], attributesQuery: QueryParam[String], excludedAttributesQuery: QueryParam[String]): Task[Unit] = {
    val path = "/scim/v2/Users/{id}".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("filter", Some(filterQuery.toParamString(filter))), ("attributes", Some(attributesQuery.toParamString(attributes))), ("excludedAttributes", Some(excludedAttributesQuery.toParamString(excludedAttributes))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def scimV2UsersIdPut(host: String, id: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/scim/v2/Users/{id}".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def scimV2UsersPost(host: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/scim/v2/Users"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesCertificateCertIdGet(host: String, certId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/certificate/{cert_id}".replaceAll("\\{" + "cert_id" + "\\}",escape(certId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesConfigurationModeActionsDisablePost(host: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/configuration_mode/actions/disable"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesConfigurationModeActionsEnablePost(host: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/configuration_mode/actions/enable"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesDirectdataFilesGet(host: String, extractType: String, startTime: Integer, stopTime: Integer, accept: String, authorization: String, xVaultAPIClientID: String)(implicit extractTypeQuery: QueryParam[String], startTimeQuery: QueryParam[Integer], stopTimeQuery: QueryParam[Integer]): Task[Unit] = {
    val path = "/services/directdata/files"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("extractType", Some(extract_typeQuery.toParamString(extract_type))), ("startTime", Some(start_timeQuery.toParamString(start_time))), ("stopTime", Some(stop_timeQuery.toParamString(stop_time))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesDirectdataFilesNameGet(host: String, name: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/directdata/files/{name}".replaceAll("\\{" + "name" + "\\}",escape(name.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesFileStagingItemsContentItemGet(host: String, item: String, authorization: String, accept: String, range: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/file_staging/items/content/{item}".replaceAll("\\{" + "item" + "\\}",escape(item.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Range", range), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesFileStagingItemsItemDelete(host: String, item: String, recursive: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit recursiveQuery: QueryParam[String]): Task[Unit] = {
    val path = "/services/file_staging/items/{item}".replaceAll("\\{" + "item" + "\\}",escape(item.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("recursive", Some(recursiveQuery.toParamString(recursive))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesFileStagingItemsItemGet(host: String, item: String, recursive: String, limit: String, formatResult: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit recursiveQuery: QueryParam[String], limitQuery: QueryParam[String], formatResultQuery: QueryParam[String]): Task[Unit] = {
    val path = "/services/file_staging/items/{item}".replaceAll("\\{" + "item" + "\\}",escape(item.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("recursive", Some(recursiveQuery.toParamString(recursive))), ("limit", Some(limitQuery.toParamString(limit))), ("formatResult", Some(format_resultQuery.toParamString(format_result))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesFileStagingItemsItemPut(host: String, item: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/file_staging/items/{item}".replaceAll("\\{" + "item" + "\\}",escape(item.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesFileStagingItemsPost(host: String, authorization: String, accept: String, contentMD5: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/file_staging/items"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-MD5", contentMD5), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesFileStagingUploadGet(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/file_staging/upload/"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesFileStagingUploadPost(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/file_staging/upload"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesFileStagingUploadUploadSessionIdDelete(host: String, uploadSessionId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/file_staging/upload/{upload_session_id}".replaceAll("\\{" + "upload_session_id" + "\\}",escape(uploadSessionId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesFileStagingUploadUploadSessionIdGet(host: String, uploadSessionId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/file_staging/upload/{upload_session_id}".replaceAll("\\{" + "upload_session_id" + "\\}",escape(uploadSessionId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesFileStagingUploadUploadSessionIdPartsGet(host: String, uploadSessionId: String, limit: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit limitQuery: QueryParam[String]): Task[Unit] = {
    val path = "/services/file_staging/upload/{upload_session_id}/parts".replaceAll("\\{" + "upload_session_id" + "\\}",escape(uploadSessionId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesFileStagingUploadUploadSessionIdPost(host: String, uploadSessionId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/file_staging/upload/{upload_session_id}".replaceAll("\\{" + "upload_session_id" + "\\}",escape(uploadSessionId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesFileStagingUploadUploadSessionIdPut(host: String, uploadSessionId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIFilePartNumber: String, contentMD5: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/file_staging/upload/{upload_session_id}".replaceAll("\\{" + "upload_session_id" + "\\}",escape(uploadSessionId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-FilePartNumber", xVaultAPIFilePartNumber), Header("Content-MD5", contentMD5), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesJobsHistoriesGet(host: String, startDate: String, endDate: String, status: String, limit: String, offset: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit startDateQuery: QueryParam[String], endDateQuery: QueryParam[String], statusQuery: QueryParam[String], limitQuery: QueryParam[String], offsetQuery: QueryParam[String]): Task[Unit] = {
    val path = "/services/jobs/histories"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("status", Some(statusQuery.toParamString(status))), ("limit", Some(limitQuery.toParamString(limit))), ("offset", Some(offsetQuery.toParamString(offset))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesJobsJobIdErrorsGet(host: String, jobId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/jobs/{job_id}/errors".replaceAll("\\{" + "job_id" + "\\}",escape(jobId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesJobsJobIdGet(host: String, jobId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/jobs/{job_id}".replaceAll("\\{" + "job_id" + "\\}",escape(jobId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesJobsJobIdSummaryGet(host: String, jobId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/jobs/{job_id}/summary".replaceAll("\\{" + "job_id" + "\\}",escape(jobId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesJobsJobIdTasksGet(host: String, jobId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/jobs/{job_id}/tasks".replaceAll("\\{" + "job_id" + "\\}",escape(jobId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesJobsMonitorsGet(host: String, startDate: String, endDate: String, status: String, limit: String, offset: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit startDateQuery: QueryParam[String], endDateQuery: QueryParam[String], statusQuery: QueryParam[String], limitQuery: QueryParam[String], offsetQuery: QueryParam[String]): Task[Unit] = {
    val path = "/services/jobs/monitors"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("status", Some(statusQuery.toParamString(status))), ("limit", Some(limitQuery.toParamString(limit))), ("offset", Some(offsetQuery.toParamString(offset))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesJobsStartNowJobIdPost(host: String, jobId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/jobs/start_now/{job_id}".replaceAll("\\{" + "job_id" + "\\}",escape(jobId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesLoaderExtractPost(host: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/loader/extract"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesLoaderJobIdTasksTaskIdFailurelogGet(host: String, jobId: String, taskId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/loader/{job_id}/tasks/{task_id}/failurelog".replaceAll("\\{" + "job_id" + "\\}",escape(jobId.toString)).replaceAll("\\{" + "task_id" + "\\}",escape(taskId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesLoaderJobIdTasksTaskIdResultsGet(host: String, jobId: String, taskId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/loader/{job_id}/tasks/{task_id}/results".replaceAll("\\{" + "job_id" + "\\}",escape(jobId.toString)).replaceAll("\\{" + "task_id" + "\\}",escape(taskId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesLoaderJobIdTasksTaskIdResultsRenditionsGet(host: String, jobId: String, taskId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/loader/{job_id}/tasks/{task_id}/results/renditions".replaceAll("\\{" + "job_id" + "\\}",escape(jobId.toString)).replaceAll("\\{" + "task_id" + "\\}",escape(taskId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesLoaderJobIdTasksTaskIdSuccesslogGet(host: String, jobId: String, taskId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/loader/{job_id}/tasks/{task_id}/successlog".replaceAll("\\{" + "job_id" + "\\}",escape(jobId.toString)).replaceAll("\\{" + "task_id" + "\\}",escape(taskId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesLoaderLoadPost(host: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/loader/load"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesPackageActionsValidatePost(host: String, authorization: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/package/actions/validate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesPackagePost(host: String, authorization: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/package"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesPackagePut(host: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/package"

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesQueuesGet(host: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/queues"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesQueuesQueueNameActionsDisableDeliveryPut(host: String, queueName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/queues/{queue_name}/actions/disable_delivery".replaceAll("\\{" + "queue_name" + "\\}",escape(queueName.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesQueuesQueueNameActionsEnableDeliveryPut(host: String, queueName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/queues/{queue_name}/actions/enable_delivery".replaceAll("\\{" + "queue_name" + "\\}",escape(queueName.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesQueuesQueueNameActionsResetPut(host: String, queueName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/queues/{queue_name}/actions/reset".replaceAll("\\{" + "queue_name" + "\\}",escape(queueName.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesQueuesQueueNameGet(host: String, queueName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/queues/{queue_name}".replaceAll("\\{" + "queue_name" + "\\}",escape(queueName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesVobjectVaultPackageVPackageIdActionsValidatePost(host: String, packageId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/vobject/vault_package__v/{package_id}/actions/validate".replaceAll("\\{" + "package_id" + "\\}",escape(packageId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def sessionDelete(host: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/session"

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def uicodeDistributionsDistributionNameCodeGet(host: String, distributionName: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/uicode/distributions/{distribution_name}/code".replaceAll("\\{" + "distribution_name" + "\\}",escape(distributionName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def uicodeDistributionsDistributionNameDelete(host: String, distributionName: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/uicode/distributions/{distribution_name}".replaceAll("\\{" + "distribution_name" + "\\}",escape(distributionName.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def uicodeDistributionsDistributionNameGet(host: String, distributionName: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/uicode/distributions/{distribution_name}".replaceAll("\\{" + "distribution_name" + "\\}",escape(distributionName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def uicodeDistributionsGet(host: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/uicode/distributions"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def uicodeDistributionsPost(host: String, accept: String, authorization: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/uicode/distributions"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectVaultPackageVPackageIdActionsDeployPost(host: String, packageId: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobject/vault_package__v/{package_id}/actions/deploy".replaceAll("\\{" + "package_id" + "\\}",escape(packageId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectVaultPackageVPackageIdActionsDeployResultsGet(host: String, packageId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobject/vault_package__v/{package_id}/actions/deploy/results".replaceAll("\\{" + "package_id" + "\\}",escape(packageId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet(host: String, objectName: String, jobStatus: String, jobId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/cascadedelete/results/{object_name}/{job_status}/{job_id}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "job_status" + "\\}",escape(jobStatus.toString)).replaceAll("\\{" + "job_id" + "\\}",escape(jobId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet(host: String, objectName: String, jobStatus: String, jobId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/deepcopy/results/{object_name}/{job_status}/{job_id}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "job_status" + "\\}",escape(jobStatus.toString)).replaceAll("\\{" + "job_id" + "\\}",escape(jobId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsEdlItemVActionsCreateplaceholderPost(host: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/edl_item__v/actions/createplaceholder"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsMergesJobIdLogGet(host: String, jobId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/merges/{job_id}/log".replaceAll("\\{" + "job_id" + "\\}",escape(jobId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsMergesJobIdResultsGet(host: String, jobId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/merges/{job_id}/results".replaceAll("\\{" + "job_id" + "\\}",escape(jobId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsMergesJobIdStatusGet(host: String, jobId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/merges/{job_id}/status".replaceAll("\\{" + "job_id" + "\\}",escape(jobId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameActionsActionNamePost(host: String, objectName: String, actionName: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/actions/{action_name}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "action_name" + "\\}",escape(actionName.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameActionsChangetypePost(host: String, objectName: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/actions/changetype".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameActionsMergePost(host: String, objectName: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String, vobjectsObjectNameActionsMergePostRequestInner: List[VobjectsObjectNameActionsMergePostRequestInner]): Task[Unit] = {
    val path = "/vobjects/{object_name}/actions/merge".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(vobjectsObjectNameActionsMergePostRequestInner)
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameActionsRecalculaterollupsGet(host: String, objectName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/actions/recalculaterollups".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameActionsRecalculaterollupsPost(host: String, objectName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/actions/recalculaterollups".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameActionsUpdatecorporatecurrencyPut(host: String, objectName: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/actions/updatecorporatecurrency".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameAttachmentsBatchDelete(host: String, objectName: String, idParam: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String)(implicit idParamQuery: QueryParam[String]): Task[Unit] = {
    val path = "/vobjects/{object_name}/attachments/batch".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("idParam", Some(idParamQuery.toParamString(idParam))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameAttachmentsBatchPost(host: String, objectName: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/attachments/batch".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameAttachmentsBatchPut(host: String, objectName: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/attachments/batch".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameDelete(host: String, objectName: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameIdRolesRoleNameGet(host: String, objectName: String, id: String, roleName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/{id}/roles/{role_name}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "id" + "\\}",escape(id.toString)).replaceAll("\\{" + "role_name" + "\\}",escape(roleName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdActionsActionNameGet(host: String, objectName: String, objectRecordId: String, actionName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/actions/{action_name}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString)).replaceAll("\\{" + "action_name" + "\\}",escape(actionName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdActionsActionNamePost(host: String, objectName: String, objectRecordId: String, actionName: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/actions/{action_name}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString)).replaceAll("\\{" + "action_name" + "\\}",escape(actionName.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdActionsCascadedeletePost(host: String, objectName: String, objectRecordId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/actions/cascadedelete".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdActionsDeepcopyPost(host: String, objectName: String, objectRecordId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/actions/deepcopy".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdActionsGet(host: String, objectName: String, objectRecordId: String, loc: Boolean, authorization: String, accept: String, xVaultAPIClientID: String)(implicit locQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/actions".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("loc", Some(locQuery.toParamString(loc))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet(host: String, objectName: String, objectRecordId: String, attachmentFieldName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/attachment_fields/{attachment_field_name}/file".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString)).replaceAll("\\{" + "attachment_field_name" + "\\}",escape(attachmentFieldName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost(host: String, objectName: String, objectRecordId: String, attachmentFieldName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/attachment_fields/{attachment_field_name}/file".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString)).replaceAll("\\{" + "attachment_field_name" + "\\}",escape(attachmentFieldName.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet(host: String, objectName: String, objectRecordId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/attachment_fields/file".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete(host: String, objectName: String, objectRecordId: String, attachmentId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString)).replaceAll("\\{" + "attachment_id" + "\\}",escape(attachmentId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet(host: String, objectName: String, objectRecordId: String, attachmentId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString)).replaceAll("\\{" + "attachment_id" + "\\}",escape(attachmentId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut(host: String, objectName: String, objectRecordId: String, attachmentId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString)).replaceAll("\\{" + "attachment_id" + "\\}",escape(attachmentId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete(host: String, objectName: String, objectRecordId: String, attachmentId: String, attachmentVersion: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString)).replaceAll("\\{" + "attachment_id" + "\\}",escape(attachmentId.toString)).replaceAll("\\{" + "attachment_version" + "\\}",escape(attachmentVersion.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(host: String, objectName: String, objectRecordId: String, attachmentId: String, attachmentVersion: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}/file".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString)).replaceAll("\\{" + "attachment_id" + "\\}",escape(attachmentId.toString)).replaceAll("\\{" + "attachment_version" + "\\}",escape(attachmentVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet(host: String, objectName: String, objectRecordId: String, attachmentId: String, attachmentVersion: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString)).replaceAll("\\{" + "attachment_id" + "\\}",escape(attachmentId.toString)).replaceAll("\\{" + "attachment_version" + "\\}",escape(attachmentVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost(host: String, objectName: String, objectRecordId: String, attachmentId: String, attachmentVersion: String, restore: Boolean, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String)(implicit restoreQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString)).replaceAll("\\{" + "attachment_id" + "\\}",escape(attachmentId.toString)).replaceAll("\\{" + "attachment_version" + "\\}",escape(attachmentVersion.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("restore", Some(restoreQuery.toParamString(restore))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet(host: String, objectName: String, objectRecordId: String, attachmentId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString)).replaceAll("\\{" + "attachment_id" + "\\}",escape(attachmentId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdAttachmentsFileGet(host: String, objectName: String, objectRecordId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/attachments/file".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdAttachmentsGet(host: String, objectName: String, objectRecordId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/attachments".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdAttachmentsPost(host: String, objectName: String, objectRecordId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/attachments".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdAudittrailGet(host: String, objectName: String, objectRecordId: String, startDate: String, endDate: String, formatResult: String, limit: String, offset: String, events: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit startDateQuery: QueryParam[String], endDateQuery: QueryParam[String], formatResultQuery: QueryParam[String], limitQuery: QueryParam[String], offsetQuery: QueryParam[String], eventsQuery: QueryParam[String]): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/audittrail".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("formatResult", Some(format_resultQuery.toParamString(format_result))), ("limit", Some(limitQuery.toParamString(limit))), ("offset", Some(offsetQuery.toParamString(offset))), ("events", Some(eventsQuery.toParamString(events))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdGet(host: String, objectName: String, objectRecordId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNamePost(host: String, objectName: String, idParam: String, authorization: String, `contentType`: String, accept: String, xVaultAPIMigrationMode: Boolean, xVaultAPINoTriggers: Boolean, xVaultAPIClientID: String)(implicit idParamQuery: QueryParam[String]): Task[Unit] = {
    val path = "/vobjects/{object_name}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-MigrationMode", xVaultAPIMigrationMode), Header("X-VaultAPI-NoTriggers", xVaultAPINoTriggers), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("idParam", Some(idParamQuery.toParamString(idParam))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNamePut(host: String, objectName: String, authorization: String, `contentType`: String, accept: String, xVaultAPIMigrationMode: Boolean, xVaultAPINoTriggers: Boolean, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-MigrationMode", xVaultAPIMigrationMode), Header("X-VaultAPI-NoTriggers", xVaultAPINoTriggers), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameRolesDelete(host: String, objectName: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/roles".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameRolesPost(host: String, objectName: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/roles".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsOutboundPackageVPackageIdDependenciesGet(host: String, packageId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/outbound_package__v/{package_id}/dependencies".replaceAll("\\{" + "package_id" + "\\}",escape(packageId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

}

class HttpServiceDefaultApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def apiGet(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/api/"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def apiMdlComponentsComponentTypeAndRecordNameFilesGet(componentTypeAndRecordName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/api/mdl/components/{component_type_and_record_name}/files".replaceAll("\\{" + "component_type_and_record_name" + "\\}",escape(componentTypeAndRecordName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def apiMdlComponentsComponentTypeAndRecordNameGet(componentTypeAndRecordName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/api/mdl/components/{component_type_and_record_name}".replaceAll("\\{" + "component_type_and_record_name" + "\\}",escape(componentTypeAndRecordName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def apiMdlExecuteAsyncJobIdResultsGet(jobId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/api/mdl/execute_async/{job_id}/results".replaceAll("\\{" + "job_id" + "\\}",escape(jobId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def apiMdlExecuteAsyncPost(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/api/mdl/execute_async"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def apiMdlExecutePost(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/api/mdl/execute"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def apiMdlFilesPost(authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/api/mdl/files"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def audittrailAuditTrailTypeGet(auditTrailType: String, startDate: String, endDate: String, allDates: String, formatResult: String, limit: String, offset: String, objects: String, events: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit startDateQuery: QueryParam[String], endDateQuery: QueryParam[String], allDatesQuery: QueryParam[String], formatResultQuery: QueryParam[String], limitQuery: QueryParam[String], offsetQuery: QueryParam[String], objectsQuery: QueryParam[String], eventsQuery: QueryParam[String]): Task[Unit] = {
    val path = "/audittrail/{audit_trail_type}".replaceAll("\\{" + "audit_trail_type" + "\\}",escape(auditTrailType.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("allDates", Some(all_datesQuery.toParamString(all_dates))), ("formatResult", Some(format_resultQuery.toParamString(format_result))), ("limit", Some(limitQuery.toParamString(limit))), ("offset", Some(offsetQuery.toParamString(offset))), ("objects", Some(objectsQuery.toParamString(objects))), ("events", Some(eventsQuery.toParamString(events))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def authDiscoveryPost(accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/auth/discovery"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def authOauthSessionOathOidcProfileIdPost(oathOidcProfileId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/auth/oauth/session/{oath_oidc_profile_id}".replaceAll("\\{" + "oath_oidc_profile_id" + "\\}",escape(oathOidcProfileId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def authPost(`contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/auth"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def codeClassNameDelete(className: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/code/{class_name}".replaceAll("\\{" + "class_name" + "\\}",escape(className.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def codeClassNameDisablePut(className: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/code/{class_name}/disable".replaceAll("\\{" + "class_name" + "\\}",escape(className.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def codeClassNameEnablePut(className: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/code/{class_name}/enable".replaceAll("\\{" + "class_name" + "\\}",escape(className.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def codeClassNameGet(className: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/code/{class_name}".replaceAll("\\{" + "class_name" + "\\}",escape(className.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def codeProfilerGet(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/code/profiler"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def codeProfilerPost(authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/code/profiler"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def codeProfilerSessionNameActionsEndPost(sessionName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/code/profiler/{session_name}/actions/end".replaceAll("\\{" + "session_name" + "\\}",escape(sessionName.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def codeProfilerSessionNameDelete(sessionName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/code/profiler/{session_name}".replaceAll("\\{" + "session_name" + "\\}",escape(sessionName.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def codeProfilerSessionNameGet(sessionName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/code/profiler/{session_name}".replaceAll("\\{" + "session_name" + "\\}",escape(sessionName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def codeProfilerSessionNameResultsGet(sessionName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/code/profiler/{session_name}/results".replaceAll("\\{" + "session_name" + "\\}",escape(sessionName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def codePut(authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/code"

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def compositesTreesEdlHierarchyOrTemplateActionsListnodesPost(edlHierarchyOrTemplate: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/composites/trees/{edl_hierarchy_or_template}/actions/listnodes".replaceAll("\\{" + "edl_hierarchy_or_template" + "\\}",escape(edlHierarchyOrTemplate.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def compositesTreesEdlHierarchyOrTemplateGet(edlHierarchyOrTemplate: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/composites/trees/{edl_hierarchy_or_template}".replaceAll("\\{" + "edl_hierarchy_or_template" + "\\}",escape(edlHierarchyOrTemplate.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def compositesTreesEdlHierarchyVParentNodeIdChildrenGet(parentNodeId: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/composites/trees/edl_hierarchy__v/{parent_node_id}/children".replaceAll("\\{" + "parent_node_id" + "\\}",escape(parentNodeId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def compositesTreesEdlHierarchyVParentNodeIdChildrenPut(parentNodeId: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/composites/trees/edl_hierarchy__v/{parent_node_id}/children".replaceAll("\\{" + "parent_node_id" + "\\}",escape(parentNodeId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def configurationComponentTypeAndRecordNameGet(componentTypeAndRecordName: String, loc: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit locQuery: QueryParam[String]): Task[Unit] = {
    val path = "/configuration/{component_type_and_record_name}".replaceAll("\\{" + "component_type_and_record_name" + "\\}",escape(componentTypeAndRecordName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("loc", Some(locQuery.toParamString(loc))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def configurationComponentTypeGet(componentType: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/configuration/{component_type}".replaceAll("\\{" + "component_type" + "\\}",escape(componentType.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def configurationObjectNameAndObjectTypeGet(objectNameAndObjectType: String, loc: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit locQuery: QueryParam[String]): Task[Unit] = {
    val path = "/configuration/{object_name_and_object_type}".replaceAll("\\{" + "object_name_and_object_type" + "\\}",escape(objectNameAndObjectType.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("loc", Some(locQuery.toParamString(loc))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def configurationObjecttypeGet(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/configuration/Objecttype"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def configurationRoleAssignmentRuleDelete(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/configuration/role_assignment_rule"

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def configurationRoleAssignmentRuleGet(lifecycleV: String, roleV: String, productV: String, countryV: String, studyV: String, studyCountryV: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit lifecycleVQuery: QueryParam[String], roleVQuery: QueryParam[String], productVQuery: QueryParam[String], countryVQuery: QueryParam[String], studyVQuery: QueryParam[String], studyCountryVQuery: QueryParam[String]): Task[Unit] = {
    val path = "/configuration/role_assignment_rule"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("lifecycleV", Some(lifecycle__vQuery.toParamString(lifecycle__v))), ("roleV", Some(role__vQuery.toParamString(role__v))), ("productV", Some(product__vQuery.toParamString(product__v))), ("countryV", Some(country__vQuery.toParamString(country__v))), ("studyV", Some(study__vQuery.toParamString(study__v))), ("studyCountryV", Some(study_country__vQuery.toParamString(study_country__v))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def configurationRoleAssignmentRulePost(authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/configuration/role_assignment_rule"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def configurationRoleAssignmentRulePut(authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/configuration/role_assignment_rule"

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def delegationLoginPost(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/delegation/login"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def delegationVaultsGet(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/delegation/vaults"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def keepAlivePost(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/keep-alive"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def limitsGet(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/limits"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def logsApiUsageGet(date: String, logFormat: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit dateQuery: QueryParam[String], logFormatQuery: QueryParam[String]): Task[Unit] = {
    val path = "/logs/api_usage"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("date", Some(dateQuery.toParamString(date))), ("logFormat", Some(log_formatQuery.toParamString(log_format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def logsCodeDebugGet(userId: String, includeInactive: Boolean, authorization: String, accept: String, xVaultAPIClientID: String)(implicit userIdQuery: QueryParam[String], includeInactiveQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/logs/code/debug"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("userId", Some(user_idQuery.toParamString(user_id))), ("includeInactive", Some(include_inactiveQuery.toParamString(include_inactive))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def logsCodeDebugIdActionsResetDelete(id: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/logs/code/debug/{id}/actions/reset".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def logsCodeDebugIdActionsResetPost(id: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/logs/code/debug/{id}/actions/reset".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def logsCodeDebugIdFilesGet(id: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/logs/code/debug/{id}/files".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def logsCodeDebugIdGet(id: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/logs/code/debug/{id}".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def logsCodeDebugPost(authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/logs/code/debug"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def logsCodeRuntimeGet(date: String, logFormat: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit dateQuery: QueryParam[String], logFormatQuery: QueryParam[String]): Task[Unit] = {
    val path = "/logs/code/runtime"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("date", Some(dateQuery.toParamString(date))), ("logFormat", Some(log_formatQuery.toParamString(log_format))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def messagesMessageTypeActionsImportPost(messageType: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/messages/{message_type}/actions/import".replaceAll("\\{" + "message_type" + "\\}",escape(messageType.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def messagesMessageTypeLanguageLangActionsExportPost(messageType: String, lang: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/messages/{message_type}/language/{lang}/actions/export".replaceAll("\\{" + "message_type" + "\\}",escape(messageType.toString)).replaceAll("\\{" + "lang" + "\\}",escape(lang.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataAudittrailAuditTrailTypeGet(auditTrailType: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/audittrail/{audit_trail_type}".replaceAll("\\{" + "audit_trail_type" + "\\}",escape(auditTrailType.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataAudittrailGet(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/audittrail"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataComponentsComponentTypeGet(componentType: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/components/{component_type}".replaceAll("\\{" + "component_type" + "\\}",escape(componentType.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataComponentsGet(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/components"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataObjectsBindersTemplatesBindernodesGet(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/objects/binders/templates/bindernodes"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataObjectsBindersTemplatesGet(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/objects/binders/templates"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataObjectsDocumentsAnnotationsPlacemarksTypesPlacemarkTypeGet(placemarkType: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/objects/documents/annotations/placemarks/types/{placemark_type}".replaceAll("\\{" + "placemark_type" + "\\}",escape(placemarkType.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataObjectsDocumentsAnnotationsReferencesTypesReferenceTypeGet(referenceType: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/objects/documents/annotations/references/types/{reference_type}".replaceAll("\\{" + "reference_type" + "\\}",escape(referenceType.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataObjectsDocumentsAnnotationsTypesAnnotationTypeGet(annotationType: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/objects/documents/annotations/types/{annotation_type}".replaceAll("\\{" + "annotation_type" + "\\}",escape(annotationType.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataObjectsDocumentsEventsEventTypeTypesEventSubtypeGet(eventType: String, eventSubtype: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/objects/documents/events/{event_type}/types/{event_subtype}".replaceAll("\\{" + "event_type" + "\\}",escape(eventType.toString)).replaceAll("\\{" + "event_subtype" + "\\}",escape(eventSubtype.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataObjectsDocumentsEventsGet(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/objects/documents/events"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataObjectsDocumentsLockGet(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/objects/documents/lock"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataObjectsDocumentsPropertiesFindCommonPost(`contentType`: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/objects/documents/properties/find_common"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Content-Type", `contentType`), Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataObjectsDocumentsPropertiesGet(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/objects/documents/properties"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataObjectsDocumentsTemplatesGet(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/objects/documents/templates"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataObjectsDocumentsTypesGet(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/objects/documents/types"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataObjectsDocumentsTypesTypeGet(`type`: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/objects/documents/types/{type}".replaceAll("\\{" + "type" + "\\}",escape(`type`.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataObjectsDocumentsTypesTypeRelationshipsGet(`type`: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/objects/documents/types/{type}/relationships".replaceAll("\\{" + "type" + "\\}",escape(`type`.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataObjectsDocumentsTypesTypeSubtypesSubtypeClassificationsClassificationGet(`type`: String, subtype: String, classification: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/objects/documents/types/{type}/subtypes/{subtype}/classifications/{classification}".replaceAll("\\{" + "type" + "\\}",escape(`type`.toString)).replaceAll("\\{" + "subtype" + "\\}",escape(subtype.toString)).replaceAll("\\{" + "classification" + "\\}",escape(classification.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataObjectsDocumentsTypesTypeSubtypesSubtypeGet(`type`: String, subtype: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/objects/documents/types/{type}/subtypes/{subtype}".replaceAll("\\{" + "type" + "\\}",escape(`type`.toString)).replaceAll("\\{" + "subtype" + "\\}",escape(subtype.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataObjectsGroupsGet(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/objects/groups"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataObjectsSecuritypoliciesGet(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/objects/securitypolicies"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataObjectsUsersGet(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/objects/users"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataQueryArchivedDocumentsRelationshipsDocumentSignatureSysrGet(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/query/archived_documents/relationships/document_signature__sysr"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataQueryDocumentsRelationshipsDocumentSignatureSysrGet(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/query/documents/relationships/document_signature__sysr"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataVobjectsGet(loc: Boolean, authorization: String, accept: String, xVaultAPIClientID: String)(implicit locQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/metadata/vobjects"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("loc", Some(locQuery.toParamString(loc))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataVobjectsObjectNameActionsCanceldeploymentPost(objectName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/vobjects/{object_name}/actions/canceldeployment".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataVobjectsObjectNameFieldsObjectFieldNameGet(objectName: String, objectFieldName: String, loc: Boolean, authorization: String, accept: String, xVaultAPIClientID: String)(implicit locQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/metadata/vobjects/{object_name}/fields/{object_field_name}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_field_name" + "\\}",escape(objectFieldName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("loc", Some(locQuery.toParamString(loc))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataVobjectsObjectNameGet(objectName: String, loc: Boolean, authorization: String, accept: String, xVaultAPIClientID: String)(implicit locQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/metadata/vobjects/{object_name}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("loc", Some(locQuery.toParamString(loc))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataVobjectsObjectNamePageLayoutsGet(objectName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/vobjects/{object_name}/page_layouts".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def metadataVobjectsObjectNamePageLayoutsLayoutNameGet(objectName: String, layoutName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/metadata/vobjects/{object_name}/page_layouts/{layout_name}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "layout_name" + "\\}",escape(layoutName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def notificationsHistoriesGet(startDate: String, endDate: String, allDates: Boolean, formatResult: String, limit: String, offset: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit startDateQuery: QueryParam[String], endDateQuery: QueryParam[String], allDatesQuery: QueryParam[Boolean], formatResultQuery: QueryParam[String], limitQuery: QueryParam[String], offsetQuery: QueryParam[String]): Task[Unit] = {
    val path = "/notifications/histories"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("allDates", Some(all_datesQuery.toParamString(all_dates))), ("formatResult", Some(format_resultQuery.toParamString(format_result))), ("limit", Some(limitQuery.toParamString(limit))), ("offset", Some(offsetQuery.toParamString(offset))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectWorkflowActionsActionGet(action: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/object/workflow/actions/{action}".replaceAll("\\{" + "action" + "\\}",escape(action.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectWorkflowActionsActionPost(action: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/object/workflow/actions/{action}".replaceAll("\\{" + "action" + "\\}",escape(action.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectWorkflowActionsCanceltasksPost(authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/object/workflow/actions/canceltasks"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectWorkflowActionsCancelworkflowsPost(authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/object/workflow/actions/cancelworkflows"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectWorkflowActionsGet(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/object/workflow/actions"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectWorkflowActionsReassigntasksPost(authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/object/workflow/actions/reassigntasks"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectWorkflowActionsReplaceworkflowownerPost(authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/object/workflow/actions/replaceworkflowowner"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersActionsExportJobIdResultsGet(jobId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/actions/export/{job_id}/results".replaceAll("\\{" + "job_id" + "\\}",escape(jobId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdActionsExportPost(binderId: String, source: Boolean, renditiontype: String, docversion: String, attachments: String, export: String, docfield: Boolean, authorization: String, accept: String, xVaultAPIClientID: String)(implicit sourceQuery: QueryParam[Boolean], renditiontypeQuery: QueryParam[String], docversionQuery: QueryParam[String], attachmentsQuery: QueryParam[String], exportQuery: QueryParam[String], docfieldQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/actions/export".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("source", Some(sourceQuery.toParamString(source))), ("renditiontype", Some(renditiontypeQuery.toParamString(renditiontype))), ("docversion", Some(docversionQuery.toParamString(docversion))), ("attachments", Some(attachmentsQuery.toParamString(attachments))), ("export", Some(exportQuery.toParamString(export))), ("docfield", Some(docfieldQuery.toParamString(docfield))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdActionsPost(binderId: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/actions".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdBindingRulePut(binderId: String, `contentType`: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/binding_rule".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Content-Type", `contentType`), Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdDelete(binderId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdDocumentsNodeIdBindingRulePut(binderId: String, nodeId: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/documents/{node_id}/binding_rule".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString)).replaceAll("\\{" + "node_id" + "\\}",escape(nodeId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdDocumentsPost(binderId: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/documents".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdDocumentsSectionIdDelete(binderId: String, sectionId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/documents/{section_id}".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString)).replaceAll("\\{" + "section_id" + "\\}",escape(sectionId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdDocumentsSectionIdPut(binderId: String, sectionId: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/documents/{section_id}".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString)).replaceAll("\\{" + "section_id" + "\\}",escape(sectionId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdGet(binderId: String, depth: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit depthQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/binders/{binder_id}".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("depth", Some(depthQuery.toParamString(depth))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdPost(binderId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdPut(binderId: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdRolesRoleNameAndUserOrGroupIdDelete(binderId: String, roleNameAndUserOrGroup: String, id: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/roles/{role_name_and_user_or_group}/{id}".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString)).replaceAll("\\{" + "role_name_and_user_or_group" + "\\}",escape(roleNameAndUserOrGroup.toString)).replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdSectionsNodeIdBindingRulePut(binderId: String, nodeId: String, `contentType`: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/sections/{node_id}/binding_rule".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString)).replaceAll("\\{" + "node_id" + "\\}",escape(nodeId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Content-Type", `contentType`), Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdSectionsNodeIdPut(binderId: String, nodeId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/sections/{node_id}".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString)).replaceAll("\\{" + "node_id" + "\\}",escape(nodeId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdSectionsPost(binderId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/sections".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdSectionsSectionIdDelete(binderId: String, sectionId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/sections/{section_id}".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString)).replaceAll("\\{" + "section_id" + "\\}",escape(sectionId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdSectionsSectionIdGet(binderId: String, sectionId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/sections/{section_id}".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString)).replaceAll("\\{" + "section_id" + "\\}",escape(sectionId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdVersionsGet(binderId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/versions".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdVersionsMajorVersionMinorVersionActionsExportPost(binderId: String, majorVersion: String, minorVersion: String, source: Boolean, renditiontype: String, docversion: String, attachments: String, export: String, docfield: Boolean, authorization: String, accept: String, xVaultAPIClientID: String)(implicit sourceQuery: QueryParam[Boolean], renditiontypeQuery: QueryParam[String], docversionQuery: QueryParam[String], attachmentsQuery: QueryParam[String], exportQuery: QueryParam[String], docfieldQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/versions/{major_version}/{minor_version}/actions/export".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("source", Some(sourceQuery.toParamString(source))), ("renditiontype", Some(renditiontypeQuery.toParamString(renditiontype))), ("docversion", Some(docversionQuery.toParamString(docversion))), ("attachments", Some(attachmentsQuery.toParamString(attachments))), ("export", Some(exportQuery.toParamString(export))), ("docfield", Some(docfieldQuery.toParamString(docfield))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdVersionsMajorVersionMinorVersionDelete(binderId: String, majorVersion: String, minorVersion: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/versions/{major_version}/{minor_version}".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdVersionsMajorVersionMinorVersionGet(binderId: String, majorVersion: String, minorVersion: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/versions/{major_version}/{minor_version}".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdVersionsMajorVersionMinorVersionPut(binderId: String, majorVersion: String, minorVersion: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/versions/{major_version}/{minor_version}".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsPost(binderId: String, majorVersion: String, minorVersion: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete(binderId: String, majorVersion: String, minorVersion: String, relationshipId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id}".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString)).replaceAll("\\{" + "relationship_id" + "\\}",escape(relationshipId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet(binderId: String, majorVersion: String, minorVersion: String, relationshipId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id}".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString)).replaceAll("\\{" + "relationship_id" + "\\}",escape(relationshipId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersBinderIdVersionsMajorVersionMinorVersionSectionsSectionIdGet(binderId: String, majorVersion: String, minorVersion: String, sectionId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{binder_id}/versions/{major_version}/{minor_version}/sections/{section_id}".replaceAll("\\{" + "binder_id" + "\\}",escape(binderId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString)).replaceAll("\\{" + "section_id" + "\\}",escape(sectionId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersIdRolesGet(id: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{id}/roles".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersIdRolesPost(id: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{id}/roles".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersIdRolesRoleNameGet(id: String, roleName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{id}/roles/{role_name}".replaceAll("\\{" + "id" + "\\}",escape(id.toString)).replaceAll("\\{" + "role_name" + "\\}",escape(roleName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsGet(id: String, majorVersion: String, minorVersion: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions".replaceAll("\\{" + "id" + "\\}",escape(id.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet(id: String, majorVersion: String, minorVersion: String, nameV: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}/entry_requirements".replaceAll("\\{" + "id" + "\\}",escape(id.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString)).replaceAll("\\{" + "name__v" + "\\}",escape(nameV.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut(id: String, majorVersion: String, minorVersion: String, nameV: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}".replaceAll("\\{" + "id" + "\\}",escape(id.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString)).replaceAll("\\{" + "name__v" + "\\}",escape(nameV.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersLifecycleActionsPost(authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/lifecycle_actions"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersLifecycleActionsUserActionNamePut(userActionName: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/lifecycle_actions/{user_action_name}".replaceAll("\\{" + "user_action_name" + "\\}",escape(userActionName.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersPost(async: Boolean, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String)(implicit asyncQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/objects/binders"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("async", Some(asyncQuery.toParamString(async))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersTemplatesGet(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/templates"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersTemplatesPost(authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/templates"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersTemplatesPut(authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/templates"

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersTemplatesTemplateNameBindernodesGet(templateName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/templates/{template_name}/bindernodes".replaceAll("\\{" + "template_name" + "\\}",escape(templateName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersTemplatesTemplateNameBindernodesPost(templateName: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/templates/{template_name}/bindernodes".replaceAll("\\{" + "template_name" + "\\}",escape(templateName.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersTemplatesTemplateNameBindernodesPut(templateName: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/templates/{template_name}/bindernodes".replaceAll("\\{" + "template_name" + "\\}",escape(templateName.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersTemplatesTemplateNameDelete(templateName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/templates/{template_name}".replaceAll("\\{" + "template_name" + "\\}",escape(templateName.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsBindersTemplatesTemplateNameGet(templateName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/binders/templates/{template_name}".replaceAll("\\{" + "template_name" + "\\}",escape(templateName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDeletionsDocumentsGet(startDate: String, endDate: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String)(implicit startDateQuery: QueryParam[String], endDateQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/deletions/documents"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDeletionsVobjectsObjectNameGet(objectName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/deletions/vobjects/{object_name}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsActionsGet(loc: Boolean, authorization: String, accept: String, xVaultAPIClientID: String)(implicit locQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/objects/documents/actions"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("loc", Some(locQuery.toParamString(loc))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsActionsLifecycleAndStateAndActionJobIdResultsGet(lifecycleAndStateAndAction: String, jobId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/actions/{lifecycle_and_state_and_action}/{job_id}/results".replaceAll("\\{" + "lifecycle_and_state_and_action" + "\\}",escape(lifecycleAndStateAndAction.toString)).replaceAll("\\{" + "job_id" + "\\}",escape(jobId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsActionsWorkflowNameGet(workflowName: String, loc: Boolean, authorization: String, accept: String, xVaultAPIClientID: String)(implicit locQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/objects/documents/actions/{workflow_name}".replaceAll("\\{" + "workflow_name" + "\\}",escape(workflowName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("loc", Some(locQuery.toParamString(loc))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsActionsWorkflowNamePost(workflowName: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/actions/{workflow_name}".replaceAll("\\{" + "workflow_name" + "\\}",escape(workflowName.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsAnnotationsBatchDelete(authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/annotations/batch"

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsAnnotationsBatchPost(authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/annotations/batch"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsAnnotationsBatchPut(authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/annotations/batch"

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsAnnotationsRepliesBatchPost(authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/annotations/replies/batch"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsAttachmentsBatchDelete(accept: String, authorization: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/attachments/batch"

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsAttachmentsBatchPost(accept: String, authorization: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/attachments/batch"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsAttachmentsBatchPut(accept: String, authorization: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/attachments/batch"

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsBatchActionsFileextractJobIdResultsGet(jobId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/batch/actions/fileextract/{job_id}/results".replaceAll("\\{" + "job_id" + "\\}",escape(jobId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsBatchActionsFileextractPost(source: Boolean, renditions: Boolean, allversions: Boolean, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String)(implicit sourceQuery: QueryParam[Boolean], renditionsQuery: QueryParam[Boolean], allversionsQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/objects/documents/batch/actions/fileextract"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("source", Some(sourceQuery.toParamString(source))), ("renditions", Some(renditionsQuery.toParamString(renditions))), ("allversions", Some(allversionsQuery.toParamString(allversions))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsBatchActionsReclassifyPut(authorization: String, `contentType`: String, accept: String, xVaultAPIMigrationMode: Boolean, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/batch/actions/reclassify"

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-MigrationMode", xVaultAPIMigrationMode), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsBatchActionsRerenderPost(authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/batch/actions/rerender"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsBatchDelete(idParam: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String)(implicit idParamQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/documents/batch"

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("idParam", Some(idParamQuery.toParamString(idParam))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsBatchLockDelete(authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/batch/lock"

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsBatchPost(authorization: String, accept: String, `contentType`: String, xVaultAPIMigrationMode: Boolean, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/batch"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-MigrationMode", xVaultAPIMigrationMode), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsBatchPut(authorization: String, accept: String, `contentType`: String, xVaultAPIMigrationMode: Boolean, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/batch"

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-MigrationMode", xVaultAPIMigrationMode), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdAnchorsGet(docId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/anchors".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdAnnotationsFileGet(docId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/annotations/file".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdAnnotationsFilePost(docId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/annotations/file".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdAttachmentsAttachmentIdDelete(docId: String, attachmentId: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/attachments/{attachment_id}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "attachment_id" + "\\}",escape(attachmentId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdAttachmentsAttachmentIdFileGet(docId: String, attachmentId: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/attachments/{attachment_id}/file".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "attachment_id" + "\\}",escape(attachmentId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdAttachmentsAttachmentIdGet(docId: String, attachmentId: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/attachments/{attachment_id}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "attachment_id" + "\\}",escape(attachmentId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdAttachmentsAttachmentIdPut(docId: String, attachmentId: String, accept: String, authorization: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/attachments/{attachment_id}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "attachment_id" + "\\}",escape(attachmentId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete(docId: String, attachmentId: String, attachmentVersion: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "attachment_id" + "\\}",escape(attachmentId.toString)).replaceAll("\\{" + "attachment_version" + "\\}",escape(attachmentVersion.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(docId: String, attachmentId: String, attachmentVersion: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}/file".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "attachment_id" + "\\}",escape(attachmentId.toString)).replaceAll("\\{" + "attachment_version" + "\\}",escape(attachmentVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionGet(docId: String, attachmentId: String, attachmentVersion: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "attachment_id" + "\\}",escape(attachmentId.toString)).replaceAll("\\{" + "attachment_version" + "\\}",escape(attachmentVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdAttachmentsAttachmentIdVersionsAttachmentVersionPost(docId: String, attachmentId: String, attachmentVersion: String, restore: Boolean, accept: String, authorization: String, xVaultAPIClientID: String)(implicit restoreQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/attachments/{attachment_id}/versions/{attachment_version}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "attachment_id" + "\\}",escape(attachmentId.toString)).replaceAll("\\{" + "attachment_version" + "\\}",escape(attachmentVersion.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("restore", Some(restoreQuery.toParamString(restore))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdAttachmentsAttachmentIdVersionsGet(docId: String, attachmentId: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/attachments/{attachment_id}/versions".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "attachment_id" + "\\}",escape(attachmentId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdAttachmentsFileGet(docId: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/attachments/file".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdAttachmentsGet(docId: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/attachments".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdAttachmentsPost(docId: String, accept: String, authorization: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/attachments".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdAudittrailGet(docId: String, startDate: String, endDate: String, formatResult: String, limit: String, offset: String, events: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit startDateQuery: QueryParam[String], endDateQuery: QueryParam[String], formatResultQuery: QueryParam[String], limitQuery: QueryParam[String], offsetQuery: QueryParam[String], eventsQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/audittrail".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("formatResult", Some(format_resultQuery.toParamString(format_result))), ("limit", Some(limitQuery.toParamString(limit))), ("offset", Some(offsetQuery.toParamString(offset))), ("events", Some(eventsQuery.toParamString(events))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdDelete(docId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdEventsGet(docId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/events".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdFileGet(docId: String, lockDocument: Boolean, accept: String, authorization: String, xVaultAPIClientID: String)(implicit lockDocumentQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/file".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("lockDocument", Some(lockDocumentQuery.toParamString(lockDocument))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdGet(docId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdLockDelete(docId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/lock".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdLockGet(docId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/lock".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdLockPost(docId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/lock".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdMajorVersionMinorVersionAttachmentsFileGet(docId: String, majorVersion: String, minorVersion: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/{major_version}/{minor_version}/attachments/file".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdPost(docId: String, suppressRendition: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String)(implicit suppressRenditionQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/documents/{doc_id}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("suppressRendition", Some(suppressRenditionQuery.toParamString(suppressRendition))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdPut(docId: String, authorization: String, `contentType`: String, accept: String, xVaultAPIMigrationMode: Boolean, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-MigrationMode", xVaultAPIMigrationMode), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdRenditionsGet(docId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/renditions".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdRenditionsRenditionTypeDelete(docId: String, renditionType: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/renditions/{rendition_type}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "rendition_type" + "\\}",escape(renditionType.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdRenditionsRenditionTypeGet(docId: String, renditionType: String, steadyState: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit steadyStateQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/renditions/{rendition_type}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "rendition_type" + "\\}",escape(renditionType.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("steadyState", Some(steadyStateQuery.toParamString(steadyState))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdRenditionsRenditionTypePost(docId: String, renditionType: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/renditions/{rendition_type}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "rendition_type" + "\\}",escape(renditionType.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdRenditionsRenditionTypePut(docId: String, renditionType: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/renditions/{rendition_type}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "rendition_type" + "\\}",escape(renditionType.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDelete(docId: String, roleNameAndUserOrGroup: String, id: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/roles/{role_name_and_user_or_group}/{id}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "role_name_and_user_or_group" + "\\}",escape(roleNameAndUserOrGroup.toString)).replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionMajorVersionMinorVersionAttachmentsGet(docId: String, majorVersion: String, minorVersion: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/version/{major_version}/{minor_version}/attachments".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsGet(docId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdGet(docId: String, majorVersion: String, minorVersion: String, annotationId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/{annotation_id}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString)).replaceAll("\\{" + "annotation_id" + "\\}",escape(annotationId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsAnnotationIdRepliesGet(docId: String, majorVersion: String, minorVersion: String, annotationId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/{annotation_id}/replies".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString)).replaceAll("\\{" + "annotation_id" + "\\}",escape(annotationId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFileGet(docId: String, majorVersion: String, minorVersion: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/file".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsFilePost(docId: String, majorVersion: String, minorVersion: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations/file".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionAnnotationsGet(docId: String, majorVersion: String, minorVersion: String, limit: String, offset: String, annotationTypes: String, paginationId: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit limitQuery: QueryParam[String], offsetQuery: QueryParam[String], annotationTypesQuery: QueryParam[String], paginationIdQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/annotations".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("offset", Some(offsetQuery.toParamString(offset))), ("annotationTypes", Some(annotation_typesQuery.toParamString(annotation_types))), ("paginationId", Some(pagination_idQuery.toParamString(pagination_id))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(docId: String, majorVersion: String, minorVersion: String, attachmentId: String, attachmentVersion: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/attachments/{attachment_id}/versions/{attachment_version}/file".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString)).replaceAll("\\{" + "attachment_id" + "\\}",escape(attachmentId.toString)).replaceAll("\\{" + "attachment_version" + "\\}",escape(attachmentVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionAttachmentsAttachmentIdVersionsAttachmentVersionGet(docId: String, majorVersion: String, minorVersion: String, attachmentId: String, attachmentVersion: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/attachments/{attachment_id}/versions/{attachment_version}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString)).replaceAll("\\{" + "attachment_id" + "\\}",escape(attachmentId.toString)).replaceAll("\\{" + "attachment_version" + "\\}",escape(attachmentVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionDelete(docId: String, majorVersion: String, minorVersion: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionDocExportAnnotationsToCsvGet(docId: String, majorVersion: String, minorVersion: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/doc-export-annotations-to-csv".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionEventsPost(docId: String, majorVersion: String, minorVersion: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/events".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionExportVideoAnnotationsGet(docId: String, majorVersion: String, minorVersion: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/export-video-annotations".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionFileGet(docId: String, majorVersion: String, minorVersion: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/file".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionGet(docId: String, majorVersion: String, minorVersion: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionPut(docId: String, majorVersion: String, minorVersion: String, authorization: String, `contentType`: String, accept: String, xVaultAPIMigrationMode: Boolean, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-MigrationMode", xVaultAPIMigrationMode), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsGet(docId: String, majorVersion: String, minorVersion: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsPost(docId: String, majorVersion: String, minorVersion: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdDelete(docId: String, majorVersion: String, minorVersion: String, relationshipId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString)).replaceAll("\\{" + "relationship_id" + "\\}",escape(relationshipId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionRelationshipsRelationshipIdGet(docId: String, majorVersion: String, minorVersion: String, relationshipId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/relationships/{relationship_id}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString)).replaceAll("\\{" + "relationship_id" + "\\}",escape(relationshipId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsGet(docId: String, majorVersion: String, minorVersion: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeDelete(docId: String, majorVersion: String, minorVersion: String, renditionType: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString)).replaceAll("\\{" + "rendition_type" + "\\}",escape(renditionType.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypeGet(docId: String, majorVersion: String, minorVersion: String, renditionType: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString)).replaceAll("\\{" + "rendition_type" + "\\}",escape(renditionType.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePost(docId: String, majorVersion: String, minorVersion: String, renditionType: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString)).replaceAll("\\{" + "rendition_type" + "\\}",escape(renditionType.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionRenditionsRenditionTypePut(docId: String, majorVersion: String, minorVersion: String, renditionType: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/renditions/{rendition_type}".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString)).replaceAll("\\{" + "rendition_type" + "\\}",escape(renditionType.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsDocIdVersionsMajorVersionMinorVersionThumbnailGet(docId: String, majorVersion: String, minorVersion: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{doc_id}/versions/{major_version}/{minor_version}/thumbnail".replaceAll("\\{" + "doc_id" + "\\}",escape(docId.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsGet(namedFilter: String, scope: String, versionscope: String, search: String, limit: String, sort: String, start: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit namedFilterQuery: QueryParam[String], scopeQuery: QueryParam[String], versionscopeQuery: QueryParam[String], searchQuery: QueryParam[String], limitQuery: QueryParam[String], sortQuery: QueryParam[String], startQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/documents"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("namedFilter", Some(named_filterQuery.toParamString(named_filter))), ("scope", Some(scopeQuery.toParamString(scope))), ("versionscope", Some(versionscopeQuery.toParamString(versionscope))), ("search", Some(searchQuery.toParamString(search))), ("limit", Some(limitQuery.toParamString(limit))), ("sort", Some(sortQuery.toParamString(sort))), ("start", Some(startQuery.toParamString(start))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsIdRolesGet(id: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{id}/roles".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsIdRolesPost(id: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{id}/roles".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsIdRolesRoleNameGet(id: String, roleName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{id}/roles/{role_name}".replaceAll("\\{" + "id" + "\\}",escape(id.toString)).replaceAll("\\{" + "role_name" + "\\}",escape(roleName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsGet(id: String, majorVersion: String, minorVersion: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions".replaceAll("\\{" + "id" + "\\}",escape(id.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVEntryRequirementsGet(id: String, majorVersion: String, minorVersion: String, nameV: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}/entry_requirements".replaceAll("\\{" + "id" + "\\}",escape(id.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString)).replaceAll("\\{" + "name__v" + "\\}",escape(nameV.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsIdVersionsMajorVersionMinorVersionLifecycleActionsNameVPut(id: String, majorVersion: String, minorVersion: String, nameV: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/{id}/versions/{major_version}/{minor_version}/lifecycle_actions/{name__v}".replaceAll("\\{" + "id" + "\\}",escape(id.toString)).replaceAll("\\{" + "major_version" + "\\}",escape(majorVersion.toString)).replaceAll("\\{" + "minor_version" + "\\}",escape(minorVersion.toString)).replaceAll("\\{" + "name__v" + "\\}",escape(nameV.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsLifecycleActionsPost(authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/lifecycle_actions"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsLifecycleActionsUserActionNamePut(userActionName: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/lifecycle_actions/{user_action_name}".replaceAll("\\{" + "user_action_name" + "\\}",escape(userActionName.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsPost(authorization: String, accept: String, xVaultAPIMigrationMode: Boolean, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-MigrationMode", xVaultAPIMigrationMode), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsRelationshipsBatchDelete(authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/relationships/batch"

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsRelationshipsBatchPost(authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/relationships/batch"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsRenditionsBatchDelete(authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/renditions/batch"

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsRenditionsBatchPost(idParam: String, largeSizeAsset: String, authorization: String, accept: String, `contentType`: String, xVaultAPIMigrationMode: Boolean, xVaultAPIClientID: String)(implicit idParamQuery: QueryParam[String], largeSizeAssetQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/documents/renditions/batch"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-MigrationMode", xVaultAPIMigrationMode), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("idParam", Some(idParamQuery.toParamString(idParam))), ("largeSizeAsset", Some(largeSizeAssetQuery.toParamString(largeSizeAsset))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsRolesBatchDelete(authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/roles/batch"

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsRolesBatchPost(authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/roles/batch"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsTemplatesGet(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/templates"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsTemplatesPost(authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/templates"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsTemplatesPut(authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/templates"

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsTemplatesTemplateNameDelete(templateName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/templates/{template_name}".replaceAll("\\{" + "template_name" + "\\}",escape(templateName.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsTemplatesTemplateNameFileGet(templateName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/templates/{template_name}/file".replaceAll("\\{" + "template_name" + "\\}",escape(templateName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsTemplatesTemplateNameGet(templateName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/templates/{template_name}".replaceAll("\\{" + "template_name" + "\\}",escape(templateName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsTemplatesTemplateNamePut(templateName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/templates/{template_name}".replaceAll("\\{" + "template_name" + "\\}",escape(templateName.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsTokensPost(authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/documents/tokens"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsVersionsBatchActionsFileextractPost(source: Boolean, renditions: Boolean, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String)(implicit sourceQuery: QueryParam[Boolean], renditionsQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/objects/documents/versions/batch/actions/fileextract"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("source", Some(sourceQuery.toParamString(source))), ("renditions", Some(renditionsQuery.toParamString(renditions))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsVersionsBatchDelete(idParam: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String)(implicit idParamQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/documents/versions/batch"

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("idParam", Some(idParamQuery.toParamString(idParam))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDocumentsVersionsBatchPost(idParam: String, authorization: String, accept: String, `contentType`: String, xVaultAPIMigrationMode: String, xVaultAPIClientID: String)(implicit idParamQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/documents/versions/batch"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-MigrationMode", xVaultAPIMigrationMode), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("idParam", Some(idParamQuery.toParamString(idParam))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDomainGet(includeApplication: Boolean, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String)(implicit includeApplicationQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/objects/domain"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("includeApplication", Some(include_applicationQuery.toParamString(include_application))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsDomainsGet(authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/domains"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsEdlMatchedDocumentsBatchActionsAddPost(authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/edl_matched_documents/batch/actions/add"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsEdlMatchedDocumentsBatchActionsRemovePost(authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/edl_matched_documents/batch/actions/remove"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsGroupsAutoGet(limit: String, offset: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit limitQuery: QueryParam[String], offsetQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/groups/auto"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))), ("offset", Some(offsetQuery.toParamString(offset))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsGroupsGet(includeImplied: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit includeImpliedQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/groups"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("includeImplied", Some(includeImpliedQuery.toParamString(includeImplied))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsGroupsGroupIdDelete(groupId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/groups/{group_id}".replaceAll("\\{" + "group_id" + "\\}",escape(groupId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsGroupsGroupIdGet(groupId: String, includeImplied: Boolean, authorization: String, accept: String, xVaultAPIClientID: String)(implicit includeImpliedQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/objects/groups/{group_id}".replaceAll("\\{" + "group_id" + "\\}",escape(groupId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("includeImplied", Some(includeImpliedQuery.toParamString(includeImplied))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsGroupsGroupIdPut(groupId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/groups/{group_id}".replaceAll("\\{" + "group_id" + "\\}",escape(groupId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsGroupsPost(authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/groups"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsLicensesGet(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/licenses"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsActionsGet(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/objectworkflows/actions"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsActionsWorkflowNameGet(workflowName: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/objectworkflows/actions/{workflow_name}".replaceAll("\\{" + "workflow_name" + "\\}",escape(workflowName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsActionsWorkflowNamePost(workflowName: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/objectworkflows/actions/{workflow_name}".replaceAll("\\{" + "workflow_name" + "\\}",escape(workflowName.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsGet(objectV: String, recordIdV: String, participant: String, statusV: String, offset: String, pageSize: String, loc: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit objectVQuery: QueryParam[String], recordIdVQuery: QueryParam[String], participantQuery: QueryParam[String], statusVQuery: QueryParam[String], offsetQuery: QueryParam[String], pageSizeQuery: QueryParam[String], locQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/objectworkflows"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("objectV", Some(object__vQuery.toParamString(object__v))), ("recordIdV", Some(record_id__vQuery.toParamString(record_id__v))), ("participant", Some(participantQuery.toParamString(participant))), ("statusV", Some(status__vQuery.toParamString(status__v))), ("offset", Some(offsetQuery.toParamString(offset))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("loc", Some(locQuery.toParamString(loc))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsTasksGet(objectV: String, recordIdV: String, assigneeV: String, statusV: String, offset: String, pageSize: String, loc: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit objectVQuery: QueryParam[String], recordIdVQuery: QueryParam[String], assigneeVQuery: QueryParam[String], statusVQuery: QueryParam[String], offsetQuery: QueryParam[String], pageSizeQuery: QueryParam[String], locQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/objectworkflows/tasks"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("objectV", Some(object__vQuery.toParamString(object__v))), ("recordIdV", Some(record_id__vQuery.toParamString(record_id__v))), ("assigneeV", Some(assignee__vQuery.toParamString(assignee__v))), ("statusV", Some(status__vQuery.toParamString(status__v))), ("offset", Some(offsetQuery.toParamString(offset))), ("pageSize", Some(page_sizeQuery.toParamString(page_size))), ("loc", Some(locQuery.toParamString(loc))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsTasksTaskIdActionsAcceptPost(taskId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/objectworkflows/tasks/{task_id}/actions/accept".replaceAll("\\{" + "task_id" + "\\}",escape(taskId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsTasksTaskIdActionsCancelPost(taskId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/objectworkflows/tasks/{task_id}/actions/cancel".replaceAll("\\{" + "task_id" + "\\}",escape(taskId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsTasksTaskIdActionsCompletePost(taskId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/objectworkflows/tasks/{task_id}/actions/complete".replaceAll("\\{" + "task_id" + "\\}",escape(taskId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsTasksTaskIdActionsGet(taskId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/objectworkflows/tasks/{task_id}/actions".replaceAll("\\{" + "task_id" + "\\}",escape(taskId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsTasksTaskIdActionsMdwacceptPost(taskId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/objectworkflows/tasks/{task_id}/actions/mdwaccept".replaceAll("\\{" + "task_id" + "\\}",escape(taskId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsTasksTaskIdActionsMdwcompletePost(taskId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/objectworkflows/tasks/{task_id}/actions/mdwcomplete".replaceAll("\\{" + "task_id" + "\\}",escape(taskId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsTasksTaskIdActionsMdwmanagecontentPost(taskId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/objectworkflows/tasks/{task_id}/actions/mdwmanagecontent".replaceAll("\\{" + "task_id" + "\\}",escape(taskId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsTasksTaskIdActionsMdwreassignPost(taskId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/objectworkflows/tasks/{task_id}/actions/mdwreassign".replaceAll("\\{" + "task_id" + "\\}",escape(taskId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsTasksTaskIdActionsReassignPost(taskId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/objectworkflows/tasks/{task_id}/actions/reassign".replaceAll("\\{" + "task_id" + "\\}",escape(taskId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsTasksTaskIdActionsTaskActionGet(taskId: String, taskAction: String, loc: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit locQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/objectworkflows/tasks/{task_id}/actions/{task_action}".replaceAll("\\{" + "task_id" + "\\}",escape(taskId.toString)).replaceAll("\\{" + "task_action" + "\\}",escape(taskAction.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("loc", Some(locQuery.toParamString(loc))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsTasksTaskIdActionsUndoacceptPost(taskId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/objectworkflows/tasks/{task_id}/actions/undoaccept".replaceAll("\\{" + "task_id" + "\\}",escape(taskId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsTasksTaskIdActionsUpdateduedatePost(taskId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/objectworkflows/tasks/{task_id}/actions/updateduedate".replaceAll("\\{" + "task_id" + "\\}",escape(taskId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsTasksTaskIdGet(taskId: String, loc: Boolean, authorization: String, accept: String, xVaultAPIClientID: String)(implicit locQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/objects/objectworkflows/tasks/{task_id}".replaceAll("\\{" + "task_id" + "\\}",escape(taskId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("loc", Some(locQuery.toParamString(loc))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsWorkflowIdActionsGet(workflowId: String, loc: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit locQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/objectworkflows/{workflow_id}/actions".replaceAll("\\{" + "workflow_id" + "\\}",escape(workflowId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("loc", Some(locQuery.toParamString(loc))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsWorkflowIdActionsWorkflowActionGet(workflowId: String, workflowAction: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/objectworkflows/{workflow_id}/actions/{workflow_action}".replaceAll("\\{" + "workflow_id" + "\\}",escape(workflowId.toString)).replaceAll("\\{" + "workflow_action" + "\\}",escape(workflowAction.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsWorkflowIdActionsWorkflowActionPost(workflowId: String, workflowAction: String, documentsSys: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String)(implicit documentsSysQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/objectworkflows/{workflow_id}/actions/{workflow_action}".replaceAll("\\{" + "workflow_id" + "\\}",escape(workflowId.toString)).replaceAll("\\{" + "workflow_action" + "\\}",escape(workflowAction.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("documentsSys", Some(documents__sysQuery.toParamString(documents__sys))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsObjectworkflowsWorkflowIdGet(workflowId: String, loc: Boolean, authorization: String, accept: String, xVaultAPIClientID: String)(implicit locQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/objects/objectworkflows/{workflow_id}".replaceAll("\\{" + "workflow_id" + "\\}",escape(workflowId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("loc", Some(locQuery.toParamString(loc))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsPicklistsGet(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/picklists"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsPicklistsPicklistNameGet(picklistName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/picklists/{picklist_name}".replaceAll("\\{" + "picklist_name" + "\\}",escape(picklistName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsPicklistsPicklistNamePicklistValueNameDelete(picklistName: String, picklistValueName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/picklists/{picklist_name}/{picklist_value_name}".replaceAll("\\{" + "picklist_name" + "\\}",escape(picklistName.toString)).replaceAll("\\{" + "picklist_value_name" + "\\}",escape(picklistValueName.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsPicklistsPicklistNamePicklistValueNamePut(picklistName: String, picklistValueName: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/picklists/{picklist_name}/{picklist_value_name}".replaceAll("\\{" + "picklist_name" + "\\}",escape(picklistName.toString)).replaceAll("\\{" + "picklist_value_name" + "\\}",escape(picklistValueName.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsPicklistsPicklistNamePost(picklistName: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/picklists/{picklist_name}".replaceAll("\\{" + "picklist_name" + "\\}",escape(picklistName.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsPicklistsPicklistNamePut(picklistName: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/picklists/{picklist_name}".replaceAll("\\{" + "picklist_name" + "\\}",escape(picklistName.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsSandboxActionsBuildproductionPost(authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/sandbox/actions/buildproduction"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsSandboxActionsPromoteproductionPost(authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/sandbox/actions/promoteproduction"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsSandboxActionsRecheckusagePost(authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/sandbox/actions/recheckusage"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsSandboxBatchChangesizePost(authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/sandbox/batch/changesize"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsSandboxEntitlementsSetPost(authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/sandbox/entitlements/set"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsSandboxGet(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/sandbox"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsSandboxNameDelete(name: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/sandbox/{name}".replaceAll("\\{" + "name" + "\\}",escape(name.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsSandboxPost(authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/sandbox"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsSandboxSnapshotApiNameActionsUpdatePost(apiName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/sandbox/snapshot/{api_name}/actions/update".replaceAll("\\{" + "api_name" + "\\}",escape(apiName.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsSandboxSnapshotApiNameActionsUpgradePost(apiName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/sandbox/snapshot/{api_name}/actions/upgrade".replaceAll("\\{" + "api_name" + "\\}",escape(apiName.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsSandboxSnapshotApiNameDelete(apiName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/sandbox/snapshot/{api_name}".replaceAll("\\{" + "api_name" + "\\}",escape(apiName.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsSandboxSnapshotGet(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/sandbox/snapshot"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsSandboxSnapshotPost(authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/sandbox/snapshot"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsSandboxVaultIdActionsRefreshPost(vaultId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/sandbox/{vault_id}/actions/refresh".replaceAll("\\{" + "vault_id" + "\\}",escape(vaultId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsSandboxVaultIdGet(vaultId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/sandbox/{vault_id}".replaceAll("\\{" + "vault_id" + "\\}",escape(vaultId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsSecuritypoliciesGet(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/securitypolicies"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsSecuritypoliciesSecurityPolicyNameGet(securityPolicyName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/securitypolicies/{security_policy_name}".replaceAll("\\{" + "security_policy_name" + "\\}",escape(securityPolicyName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsUsersGet(vaults: String, excludeVaultMembership: String, excludeAppLicensing: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit vaultsQuery: QueryParam[String], excludeVaultMembershipQuery: QueryParam[String], excludeAppLicensingQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/users/"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("vaults", Some(vaultsQuery.toParamString(vaults))), ("excludeVaultMembership", Some(exclude_vault_membershipQuery.toParamString(exclude_vault_membership))), ("excludeAppLicensing", Some(exclude_app_licensingQuery.toParamString(exclude_app_licensing))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsUsersIdGet(id: String, excludeVaultMembership: String, excludeAppLicensing: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit excludeVaultMembershipQuery: QueryParam[String], excludeAppLicensingQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/users/{id}".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("excludeVaultMembership", Some(exclude_vault_membershipQuery.toParamString(exclude_vault_membership))), ("excludeAppLicensing", Some(exclude_app_licensingQuery.toParamString(exclude_app_licensing))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsUsersIdPermissionsGet(id: String, filter: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit filterQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/users/{id}/permissions".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("filter", Some(filterQuery.toParamString(filter))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsUsersIdPut(id: String, authorization: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/users/{id}".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsUsersMeGet(excludeVaultMembership: String, excludeAppLicensing: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit excludeVaultMembershipQuery: QueryParam[String], excludeAppLicensingQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/users/me"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("excludeVaultMembership", Some(exclude_vault_membershipQuery.toParamString(exclude_vault_membership))), ("excludeAppLicensing", Some(exclude_app_licensingQuery.toParamString(exclude_app_licensing))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsUsersMePasswordPost(authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/users/me/password"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsUsersMePermissionsGet(filter: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit filterQuery: QueryParam[String]): Task[Unit] = {
    val path = "/objects/users/me/permissions"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("filter", Some(filterQuery.toParamString(filter))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsUsersMePut(authorization: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/users/me"

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsUsersPost(authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/users"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsUsersPut(authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/users"

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsUsersUserIdDelete(userId: String, domain: Boolean, authorization: String, accept: String, xVaultAPIClientID: String)(implicit domainQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/objects/users/{user_id}".replaceAll("\\{" + "user_id" + "\\}",escape(userId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("domain", Some(domainQuery.toParamString(domain))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsUsersUserIdVaultMembershipVaultIdPut(userId: String, vaultId: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/users/{user_id}/vault_membership/{vault_id}".replaceAll("\\{" + "user_id" + "\\}",escape(userId.toString)).replaceAll("\\{" + "vault_id" + "\\}",escape(vaultId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsVaultActionsComparePost(authorization: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/vault/actions/compare"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def objectsVaultActionsConfigreportPost(authorization: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/objects/vault/actions/configreport"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def queryComponentsPost(authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/query/components"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def queryNextPagePost(nextPage: String, authorization: String, accept: String, xVaultAPIDescribeQuery: Boolean, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/query/{next_page}".replaceAll("\\{" + "next_page" + "\\}",escape(nextPage.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-DescribeQuery", xVaultAPIDescribeQuery), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def queryPost(authorization: String, accept: String, xVaultAPIDescribeQuery: Boolean, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/query"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-DescribeQuery", xVaultAPIDescribeQuery), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def queryPreviousPagePost(previousPage: String, authorization: String, accept: String, xVaultAPIDescribeQuery: Boolean, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/query/{previous_page}".replaceAll("\\{" + "previous_page" + "\\}",escape(previousPage.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-DescribeQuery", xVaultAPIDescribeQuery), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def scimV2MeGet(attributes: String, excludedAttributes: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit attributesQuery: QueryParam[String], excludedAttributesQuery: QueryParam[String]): Task[Unit] = {
    val path = "/scim/v2/Me"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("attributes", Some(attributesQuery.toParamString(attributes))), ("excludedAttributes", Some(excludedAttributesQuery.toParamString(excludedAttributes))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def scimV2MePut(attributes: String, excludedAttributes: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String)(implicit attributesQuery: QueryParam[String], excludedAttributesQuery: QueryParam[String]): Task[Unit] = {
    val path = "/scim/v2/Me"

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("attributes", Some(attributesQuery.toParamString(attributes))), ("excludedAttributes", Some(excludedAttributesQuery.toParamString(excludedAttributes))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def scimV2ResourceTypesGet(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/scim/v2/ResourceTypes"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def scimV2ResourceTypesTypeGet(`type`: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/scim/v2/ResourceTypes/{type}".replaceAll("\\{" + "type" + "\\}",escape(`type`.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def scimV2SchemasGet(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/scim/v2/Schemas"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def scimV2SchemasIdGet(id: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/scim/v2/Schemas/{id}".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def scimV2ServiceProviderConfigGet(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/scim/v2/ServiceProviderConfig"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def scimV2TypeGet(`type`: String, filter: String, attributes: String, excludedAttributes: String, sortBy: String, sortOrder: String, startIndex: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit filterQuery: QueryParam[String], attributesQuery: QueryParam[String], excludedAttributesQuery: QueryParam[String], sortByQuery: QueryParam[String], sortOrderQuery: QueryParam[String], startIndexQuery: QueryParam[String]): Task[Unit] = {
    val path = "/scim/v2/{type}".replaceAll("\\{" + "type" + "\\}",escape(`type`.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("filter", Some(filterQuery.toParamString(filter))), ("attributes", Some(attributesQuery.toParamString(attributes))), ("excludedAttributes", Some(excludedAttributesQuery.toParamString(excludedAttributes))), ("sortBy", Some(sortByQuery.toParamString(sortBy))), ("sortOrder", Some(sortOrderQuery.toParamString(sortOrder))), ("startIndex", Some(startIndexQuery.toParamString(startIndex))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def scimV2TypeIdGet(`type`: String, id: String, attributes: String, excludedAttributes: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit attributesQuery: QueryParam[String], excludedAttributesQuery: QueryParam[String]): Task[Unit] = {
    val path = "/scim/v2/{type}/{id}".replaceAll("\\{" + "type" + "\\}",escape(`type`.toString)).replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("attributes", Some(attributesQuery.toParamString(attributes))), ("excludedAttributes", Some(excludedAttributesQuery.toParamString(excludedAttributes))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def scimV2UsersGet(filter: String, attributes: String, excludedAttributes: String, sortBy: String, sortOrder: String, count: String, startIndex: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit filterQuery: QueryParam[String], attributesQuery: QueryParam[String], excludedAttributesQuery: QueryParam[String], sortByQuery: QueryParam[String], sortOrderQuery: QueryParam[String], countQuery: QueryParam[String], startIndexQuery: QueryParam[String]): Task[Unit] = {
    val path = "/scim/v2/Users"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("filter", Some(filterQuery.toParamString(filter))), ("attributes", Some(attributesQuery.toParamString(attributes))), ("excludedAttributes", Some(excludedAttributesQuery.toParamString(excludedAttributes))), ("sortBy", Some(sortByQuery.toParamString(sortBy))), ("sortOrder", Some(sortOrderQuery.toParamString(sortOrder))), ("count", Some(countQuery.toParamString(count))), ("startIndex", Some(startIndexQuery.toParamString(startIndex))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def scimV2UsersIdGet(id: String, filter: String, attributes: String, excludedAttributes: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit filterQuery: QueryParam[String], attributesQuery: QueryParam[String], excludedAttributesQuery: QueryParam[String]): Task[Unit] = {
    val path = "/scim/v2/Users/{id}".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("filter", Some(filterQuery.toParamString(filter))), ("attributes", Some(attributesQuery.toParamString(attributes))), ("excludedAttributes", Some(excludedAttributesQuery.toParamString(excludedAttributes))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def scimV2UsersIdPut(id: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/scim/v2/Users/{id}".replaceAll("\\{" + "id" + "\\}",escape(id.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def scimV2UsersPost(authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/scim/v2/Users"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesCertificateCertIdGet(certId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/certificate/{cert_id}".replaceAll("\\{" + "cert_id" + "\\}",escape(certId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesConfigurationModeActionsDisablePost(authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/configuration_mode/actions/disable"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesConfigurationModeActionsEnablePost(authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/configuration_mode/actions/enable"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesDirectdataFilesGet(extractType: String, startTime: Integer, stopTime: Integer, accept: String, authorization: String, xVaultAPIClientID: String)(implicit extractTypeQuery: QueryParam[String], startTimeQuery: QueryParam[Integer], stopTimeQuery: QueryParam[Integer]): Task[Unit] = {
    val path = "/services/directdata/files"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("extractType", Some(extract_typeQuery.toParamString(extract_type))), ("startTime", Some(start_timeQuery.toParamString(start_time))), ("stopTime", Some(stop_timeQuery.toParamString(stop_time))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesDirectdataFilesNameGet(name: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/directdata/files/{name}".replaceAll("\\{" + "name" + "\\}",escape(name.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesFileStagingItemsContentItemGet(item: String, authorization: String, accept: String, range: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/file_staging/items/content/{item}".replaceAll("\\{" + "item" + "\\}",escape(item.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Range", range), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesFileStagingItemsItemDelete(item: String, recursive: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit recursiveQuery: QueryParam[String]): Task[Unit] = {
    val path = "/services/file_staging/items/{item}".replaceAll("\\{" + "item" + "\\}",escape(item.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("recursive", Some(recursiveQuery.toParamString(recursive))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesFileStagingItemsItemGet(item: String, recursive: String, limit: String, formatResult: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit recursiveQuery: QueryParam[String], limitQuery: QueryParam[String], formatResultQuery: QueryParam[String]): Task[Unit] = {
    val path = "/services/file_staging/items/{item}".replaceAll("\\{" + "item" + "\\}",escape(item.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("recursive", Some(recursiveQuery.toParamString(recursive))), ("limit", Some(limitQuery.toParamString(limit))), ("formatResult", Some(format_resultQuery.toParamString(format_result))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesFileStagingItemsItemPut(item: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/file_staging/items/{item}".replaceAll("\\{" + "item" + "\\}",escape(item.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesFileStagingItemsPost(authorization: String, accept: String, contentMD5: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/file_staging/items"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-MD5", contentMD5), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesFileStagingUploadGet(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/file_staging/upload/"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesFileStagingUploadPost(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/file_staging/upload"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesFileStagingUploadUploadSessionIdDelete(uploadSessionId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/file_staging/upload/{upload_session_id}".replaceAll("\\{" + "upload_session_id" + "\\}",escape(uploadSessionId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesFileStagingUploadUploadSessionIdGet(uploadSessionId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/file_staging/upload/{upload_session_id}".replaceAll("\\{" + "upload_session_id" + "\\}",escape(uploadSessionId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesFileStagingUploadUploadSessionIdPartsGet(uploadSessionId: String, limit: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit limitQuery: QueryParam[String]): Task[Unit] = {
    val path = "/services/file_staging/upload/{upload_session_id}/parts".replaceAll("\\{" + "upload_session_id" + "\\}",escape(uploadSessionId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesFileStagingUploadUploadSessionIdPost(uploadSessionId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/file_staging/upload/{upload_session_id}".replaceAll("\\{" + "upload_session_id" + "\\}",escape(uploadSessionId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesFileStagingUploadUploadSessionIdPut(uploadSessionId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIFilePartNumber: String, contentMD5: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/file_staging/upload/{upload_session_id}".replaceAll("\\{" + "upload_session_id" + "\\}",escape(uploadSessionId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-FilePartNumber", xVaultAPIFilePartNumber), Header("Content-MD5", contentMD5), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesJobsHistoriesGet(startDate: String, endDate: String, status: String, limit: String, offset: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit startDateQuery: QueryParam[String], endDateQuery: QueryParam[String], statusQuery: QueryParam[String], limitQuery: QueryParam[String], offsetQuery: QueryParam[String]): Task[Unit] = {
    val path = "/services/jobs/histories"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("status", Some(statusQuery.toParamString(status))), ("limit", Some(limitQuery.toParamString(limit))), ("offset", Some(offsetQuery.toParamString(offset))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesJobsJobIdErrorsGet(jobId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/jobs/{job_id}/errors".replaceAll("\\{" + "job_id" + "\\}",escape(jobId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesJobsJobIdGet(jobId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/jobs/{job_id}".replaceAll("\\{" + "job_id" + "\\}",escape(jobId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesJobsJobIdSummaryGet(jobId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/jobs/{job_id}/summary".replaceAll("\\{" + "job_id" + "\\}",escape(jobId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesJobsJobIdTasksGet(jobId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/jobs/{job_id}/tasks".replaceAll("\\{" + "job_id" + "\\}",escape(jobId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesJobsMonitorsGet(startDate: String, endDate: String, status: String, limit: String, offset: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit startDateQuery: QueryParam[String], endDateQuery: QueryParam[String], statusQuery: QueryParam[String], limitQuery: QueryParam[String], offsetQuery: QueryParam[String]): Task[Unit] = {
    val path = "/services/jobs/monitors"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("status", Some(statusQuery.toParamString(status))), ("limit", Some(limitQuery.toParamString(limit))), ("offset", Some(offsetQuery.toParamString(offset))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesJobsStartNowJobIdPost(jobId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/jobs/start_now/{job_id}".replaceAll("\\{" + "job_id" + "\\}",escape(jobId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesLoaderExtractPost(authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/loader/extract"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesLoaderJobIdTasksTaskIdFailurelogGet(jobId: String, taskId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/loader/{job_id}/tasks/{task_id}/failurelog".replaceAll("\\{" + "job_id" + "\\}",escape(jobId.toString)).replaceAll("\\{" + "task_id" + "\\}",escape(taskId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesLoaderJobIdTasksTaskIdResultsGet(jobId: String, taskId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/loader/{job_id}/tasks/{task_id}/results".replaceAll("\\{" + "job_id" + "\\}",escape(jobId.toString)).replaceAll("\\{" + "task_id" + "\\}",escape(taskId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesLoaderJobIdTasksTaskIdResultsRenditionsGet(jobId: String, taskId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/loader/{job_id}/tasks/{task_id}/results/renditions".replaceAll("\\{" + "job_id" + "\\}",escape(jobId.toString)).replaceAll("\\{" + "task_id" + "\\}",escape(taskId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesLoaderJobIdTasksTaskIdSuccesslogGet(jobId: String, taskId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/loader/{job_id}/tasks/{task_id}/successlog".replaceAll("\\{" + "job_id" + "\\}",escape(jobId.toString)).replaceAll("\\{" + "task_id" + "\\}",escape(taskId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesLoaderLoadPost(authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/loader/load"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesPackageActionsValidatePost(authorization: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/package/actions/validate"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesPackagePost(authorization: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/package"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesPackagePut(authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/package"

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesQueuesGet(authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/queues"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesQueuesQueueNameActionsDisableDeliveryPut(queueName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/queues/{queue_name}/actions/disable_delivery".replaceAll("\\{" + "queue_name" + "\\}",escape(queueName.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesQueuesQueueNameActionsEnableDeliveryPut(queueName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/queues/{queue_name}/actions/enable_delivery".replaceAll("\\{" + "queue_name" + "\\}",escape(queueName.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesQueuesQueueNameActionsResetPut(queueName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/queues/{queue_name}/actions/reset".replaceAll("\\{" + "queue_name" + "\\}",escape(queueName.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesQueuesQueueNameGet(queueName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/queues/{queue_name}".replaceAll("\\{" + "queue_name" + "\\}",escape(queueName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def servicesVobjectVaultPackageVPackageIdActionsValidatePost(packageId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/services/vobject/vault_package__v/{package_id}/actions/validate".replaceAll("\\{" + "package_id" + "\\}",escape(packageId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def sessionDelete(accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/session"

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def uicodeDistributionsDistributionNameCodeGet(distributionName: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/uicode/distributions/{distribution_name}/code".replaceAll("\\{" + "distribution_name" + "\\}",escape(distributionName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def uicodeDistributionsDistributionNameDelete(distributionName: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/uicode/distributions/{distribution_name}".replaceAll("\\{" + "distribution_name" + "\\}",escape(distributionName.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def uicodeDistributionsDistributionNameGet(distributionName: String, accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/uicode/distributions/{distribution_name}".replaceAll("\\{" + "distribution_name" + "\\}",escape(distributionName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def uicodeDistributionsGet(accept: String, authorization: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/uicode/distributions"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def uicodeDistributionsPost(accept: String, authorization: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/uicode/distributions"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectVaultPackageVPackageIdActionsDeployPost(packageId: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobject/vault_package__v/{package_id}/actions/deploy".replaceAll("\\{" + "package_id" + "\\}",escape(packageId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectVaultPackageVPackageIdActionsDeployResultsGet(packageId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobject/vault_package__v/{package_id}/actions/deploy/results".replaceAll("\\{" + "package_id" + "\\}",escape(packageId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsCascadedeleteResultsObjectNameJobStatusJobIdGet(objectName: String, jobStatus: String, jobId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/cascadedelete/results/{object_name}/{job_status}/{job_id}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "job_status" + "\\}",escape(jobStatus.toString)).replaceAll("\\{" + "job_id" + "\\}",escape(jobId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsDeepcopyResultsObjectNameJobStatusJobIdGet(objectName: String, jobStatus: String, jobId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/deepcopy/results/{object_name}/{job_status}/{job_id}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "job_status" + "\\}",escape(jobStatus.toString)).replaceAll("\\{" + "job_id" + "\\}",escape(jobId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsEdlItemVActionsCreateplaceholderPost(authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/edl_item__v/actions/createplaceholder"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsMergesJobIdLogGet(jobId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/merges/{job_id}/log".replaceAll("\\{" + "job_id" + "\\}",escape(jobId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsMergesJobIdResultsGet(jobId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/merges/{job_id}/results".replaceAll("\\{" + "job_id" + "\\}",escape(jobId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsMergesJobIdStatusGet(jobId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/merges/{job_id}/status".replaceAll("\\{" + "job_id" + "\\}",escape(jobId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameActionsActionNamePost(objectName: String, actionName: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/actions/{action_name}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "action_name" + "\\}",escape(actionName.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameActionsChangetypePost(objectName: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/actions/changetype".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameActionsMergePost(objectName: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String, vobjectsObjectNameActionsMergePostRequestInner: List[VobjectsObjectNameActionsMergePostRequestInner]): Task[Unit] = {
    val path = "/vobjects/{object_name}/actions/merge".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(vobjectsObjectNameActionsMergePostRequestInner)
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameActionsRecalculaterollupsGet(objectName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/actions/recalculaterollups".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameActionsRecalculaterollupsPost(objectName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/actions/recalculaterollups".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameActionsUpdatecorporatecurrencyPut(objectName: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/actions/updatecorporatecurrency".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameAttachmentsBatchDelete(objectName: String, idParam: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String)(implicit idParamQuery: QueryParam[String]): Task[Unit] = {
    val path = "/vobjects/{object_name}/attachments/batch".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("idParam", Some(idParamQuery.toParamString(idParam))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameAttachmentsBatchPost(objectName: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/attachments/batch".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameAttachmentsBatchPut(objectName: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/attachments/batch".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameDelete(objectName: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameIdRolesRoleNameGet(objectName: String, id: String, roleName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/{id}/roles/{role_name}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "id" + "\\}",escape(id.toString)).replaceAll("\\{" + "role_name" + "\\}",escape(roleName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdActionsActionNameGet(objectName: String, objectRecordId: String, actionName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/actions/{action_name}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString)).replaceAll("\\{" + "action_name" + "\\}",escape(actionName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdActionsActionNamePost(objectName: String, objectRecordId: String, actionName: String, authorization: String, `contentType`: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/actions/{action_name}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString)).replaceAll("\\{" + "action_name" + "\\}",escape(actionName.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdActionsCascadedeletePost(objectName: String, objectRecordId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/actions/cascadedelete".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdActionsDeepcopyPost(objectName: String, objectRecordId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/actions/deepcopy".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdActionsGet(objectName: String, objectRecordId: String, loc: Boolean, authorization: String, accept: String, xVaultAPIClientID: String)(implicit locQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/actions".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("loc", Some(locQuery.toParamString(loc))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFileGet(objectName: String, objectRecordId: String, attachmentFieldName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/attachment_fields/{attachment_field_name}/file".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString)).replaceAll("\\{" + "attachment_field_name" + "\\}",escape(attachmentFieldName.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdAttachmentFieldsAttachmentFieldNameFilePost(objectName: String, objectRecordId: String, attachmentFieldName: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/attachment_fields/{attachment_field_name}/file".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString)).replaceAll("\\{" + "attachment_field_name" + "\\}",escape(attachmentFieldName.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdAttachmentFieldsFileGet(objectName: String, objectRecordId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/attachment_fields/file".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdDelete(objectName: String, objectRecordId: String, attachmentId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString)).replaceAll("\\{" + "attachment_id" + "\\}",escape(attachmentId.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdGet(objectName: String, objectRecordId: String, attachmentId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString)).replaceAll("\\{" + "attachment_id" + "\\}",escape(attachmentId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdPut(objectName: String, objectRecordId: String, attachmentId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString)).replaceAll("\\{" + "attachment_id" + "\\}",escape(attachmentId.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionDelete(objectName: String, objectRecordId: String, attachmentId: String, attachmentVersion: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString)).replaceAll("\\{" + "attachment_id" + "\\}",escape(attachmentId.toString)).replaceAll("\\{" + "attachment_version" + "\\}",escape(attachmentVersion.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionFileGet(objectName: String, objectRecordId: String, attachmentId: String, attachmentVersion: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}/file".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString)).replaceAll("\\{" + "attachment_id" + "\\}",escape(attachmentId.toString)).replaceAll("\\{" + "attachment_version" + "\\}",escape(attachmentVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionGet(objectName: String, objectRecordId: String, attachmentId: String, attachmentVersion: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString)).replaceAll("\\{" + "attachment_id" + "\\}",escape(attachmentId.toString)).replaceAll("\\{" + "attachment_version" + "\\}",escape(attachmentVersion.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsAttachmentVersionPost(objectName: String, objectRecordId: String, attachmentId: String, attachmentVersion: String, restore: Boolean, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String)(implicit restoreQuery: QueryParam[Boolean]): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions/{attachment_version}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString)).replaceAll("\\{" + "attachment_id" + "\\}",escape(attachmentId.toString)).replaceAll("\\{" + "attachment_version" + "\\}",escape(attachmentVersion.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("restore", Some(restoreQuery.toParamString(restore))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdAttachmentsAttachmentIdVersionsGet(objectName: String, objectRecordId: String, attachmentId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/attachments/{attachment_id}/versions".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString)).replaceAll("\\{" + "attachment_id" + "\\}",escape(attachmentId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdAttachmentsFileGet(objectName: String, objectRecordId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/attachments/file".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdAttachmentsGet(objectName: String, objectRecordId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/attachments".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdAttachmentsPost(objectName: String, objectRecordId: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/attachments".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdAudittrailGet(objectName: String, objectRecordId: String, startDate: String, endDate: String, formatResult: String, limit: String, offset: String, events: String, authorization: String, accept: String, xVaultAPIClientID: String)(implicit startDateQuery: QueryParam[String], endDateQuery: QueryParam[String], formatResultQuery: QueryParam[String], limitQuery: QueryParam[String], offsetQuery: QueryParam[String], eventsQuery: QueryParam[String]): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}/audittrail".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("startDate", Some(start_dateQuery.toParamString(start_date))), ("endDate", Some(end_dateQuery.toParamString(end_date))), ("formatResult", Some(format_resultQuery.toParamString(format_result))), ("limit", Some(limitQuery.toParamString(limit))), ("offset", Some(offsetQuery.toParamString(offset))), ("events", Some(eventsQuery.toParamString(events))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameObjectRecordIdGet(objectName: String, objectRecordId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/{object_record_id}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString)).replaceAll("\\{" + "object_record_id" + "\\}",escape(objectRecordId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNamePost(objectName: String, idParam: String, authorization: String, `contentType`: String, accept: String, xVaultAPIMigrationMode: Boolean, xVaultAPINoTriggers: Boolean, xVaultAPIClientID: String)(implicit idParamQuery: QueryParam[String]): Task[Unit] = {
    val path = "/vobjects/{object_name}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-MigrationMode", xVaultAPIMigrationMode), Header("X-VaultAPI-NoTriggers", xVaultAPINoTriggers), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      ("idParam", Some(idParamQuery.toParamString(idParam))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNamePut(objectName: String, authorization: String, `contentType`: String, accept: String, xVaultAPIMigrationMode: Boolean, xVaultAPINoTriggers: Boolean, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString))

    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Content-Type", `contentType`), Header("Accept", accept), Header("X-VaultAPI-MigrationMode", xVaultAPIMigrationMode), Header("X-VaultAPI-NoTriggers", xVaultAPINoTriggers), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameRolesDelete(objectName: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/roles".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString))

    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsObjectNameRolesPost(objectName: String, authorization: String, accept: String, `contentType`: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/{object_name}/roles".replaceAll("\\{" + "object_name" + "\\}",escape(objectName.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("Content-Type", `contentType`), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def vobjectsOutboundPackageVPackageIdDependenciesGet(packageId: String, authorization: String, accept: String, xVaultAPIClientID: String): Task[Unit] = {
    val path = "/vobjects/outbound_package__v/{package_id}/dependencies".replaceAll("\\{" + "package_id" + "\\}",escape(packageId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Authorization", authorization), Header("Accept", accept), Header("X-VaultAPI-ClientID", xVaultAPIClientID))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

}
