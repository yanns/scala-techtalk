package com.yanns.scala.example1.version3

import java.util.Date
import com.yanns.scala.example1.version1.InvoiceCreator

class InvoiceController {

   val invoiceCreator = new InvoiceCreator()

   def payInvoice {

     val newInvoiceId = invoiceCreator.createInvoiceName(
       invoiceDate = new Date,
       invoiceId = "45AE-45F",
       userId = "872346",
       firmId = "abc-234",
       directInvoice = true,
       firmInvoice = false,
       electronic = false
     )

     // ...
   }

 }
