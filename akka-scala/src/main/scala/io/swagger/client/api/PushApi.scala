/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.model.ApiResponse
import io.swagger.client.model.Notification
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object PushApi {

  /**
   * 
   * 
   * Expected answers:
   *   code 200 : ApiResponse (Successful Operation)
   *   code 400 :  (Missing required data)
   *   code 404 :  (Site not found)
   *   code 402 :  (Forbidden Operation)
   * 
   * Available security schemes:
   *   ApiKeyAuth (apiKey)
   * 
   * @param siteId Site ID
   * @param body Notification object
   */
  def pushSend(siteId: String, body: Notification)(implicit apiKey: ApiKeyValue): ApiRequest[ApiResponse] =
    ApiRequest[ApiResponse](ApiMethods.POST, "https://api.pushnews.eu/v2", "/push/{siteId}", "application/json")
      .withApiKey(apiKey, "X-Auth-Token", HEADER)
      .withBody(body)
      .withPathParam("siteId", siteId)
      .withSuccessResponse[ApiResponse](200)
      .withErrorResponse[Unit](400)
      .withErrorResponse[Unit](404)
      .withErrorResponse[Unit](402)
      

}
