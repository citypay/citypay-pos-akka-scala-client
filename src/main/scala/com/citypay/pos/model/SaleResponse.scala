/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package com.citypay.pos.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class SaleResponse (
  /* Defines whether the sale was successfully created */
  success: Boolean,
  /* The identifier presented to the sale request */
  identifier: String,
  /* Description should the sale request not be accepted */
  description: Option[String]
) extends ApiModel

