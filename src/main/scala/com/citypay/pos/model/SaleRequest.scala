/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package com.citypay.pos.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class SaleRequest (
  /* The name of the target device used by the API. The device will be setup prior to the sale but allows targeting of multiple devices. */
  device: String,
  /* The amount to process in the lowest denomination and in the base currency of the device. 4798 for instance would process the transaction for £47.98 */
  amount: Int,
  /* An identifier or reference for the sale as taken by the point of sale system. This should be used to cross reference transactions after it has processed. The value should be unique and will be used to check on the processing of the transaction. */
  identifier: String
) extends ApiModel


