package com.yanns.scala.example1.version2

import java.util.Date
import com.yanns.scala.example1.version1.InvoiceCreator

class InvoiceController {

  val invoiceCreator = new InvoiceCreator()

  def payInvoice {

    val newInvoiceId = invoiceCreator.createInvoiceName(
      new Date,   // invoiceDate
      "45AE-45F", // invoiceId
      "872346",   // userId
      "abc-234",  // firmId
      true,       // directInvoice
      false,      // firmInvoice
      false       // electronic
    )

     assert(newInvoiceId != null)
     // ...
  }

 }
