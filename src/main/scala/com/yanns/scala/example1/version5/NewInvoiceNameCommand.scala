package com.yanns.scala.example1.version5

import java.util.Date

case class NewInvoiceNameCommand(
  invoiceDate: Date,
  invoiceId: String,
  userId: String,
  firmId: String,
  directInvoice: Boolean = true,
  firmInvoice: Boolean = false,
  electronic: Boolean)