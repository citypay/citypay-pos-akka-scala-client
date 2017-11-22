/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package com.citypay.pos.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class DeviceInfo (
  /* The name of the device */
  name: Option[String],
  /* The serial number of the device */
  serialno: Option[String],
  /* Whether the device is portable */
  portable: Option[Boolean],
  /* Whether the device is busy or available for a transaction */
  busy: Option[Boolean],
  /* Whether the device is currently charging */
  batteryCharging: Option[Boolean],
  /* A percentage value of the battery */
  batteryPercentage: Option[Int],
  /* Whether the device has a printer */
  printer: Option[Boolean]
) extends ApiModel


