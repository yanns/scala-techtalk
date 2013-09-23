package com.yanns.scala.example1.version4

import java.util.Date

class InvoiceController {

   val invoiceCreator = new InvoiceCreator()

   def payInvoice {

     val newInvoiceId = invoiceCreator.createInvoiceName(
       invoiceDate = new Date,
       invoiceId = "45AE-45F",
       userId = "872346",
       firmId = "abc-234",
       electronic = false
     )

     // ...
   }

 }
