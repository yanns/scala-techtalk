package com.yanns.scala.example1.version5

import java.util.Date

class InvoiceController {

  val invoiceCreator = new InvoiceCreator()

  def payInvoice {

    val newInvoiceNameCommand = NewInvoiceNameCommand (
      invoiceDate = new Date,
      invoiceId   = "45AE-45F",
      userId      = "872346",
      firmId      = "abc-234",
      electronic  = false
    )

    val newInvoiceId = invoiceCreator.createInvoiceName(newInvoiceNameCommand)

    assert(newInvoiceId != null)

     // ...
  }

}
