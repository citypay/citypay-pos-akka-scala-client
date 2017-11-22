/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package com.citypay.pos.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class PrintRequest (
  /* Must include an identifier for a transaction that has been carried out on the device */
  identifier: String,
  /* The instruction prints the cardholder copy of the receipt by default. If you want to reprint the merchant copy, append “type”:”merchant” to the body of the request. */
  `type`: Option[String]
) extends ApiModel

