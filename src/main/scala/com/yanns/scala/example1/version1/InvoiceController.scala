package com.yanns.scala.example1.version1

import java.util.Date

class InvoiceController {

  val invoiceCreator = new InvoiceCreator()

  def payInvoice {
    val newInvoiceId = invoiceCreator.createInvoiceName(new Date, "45AE-45F", "872346", "abc-234", true, false, false)

    // ...
  }

}
