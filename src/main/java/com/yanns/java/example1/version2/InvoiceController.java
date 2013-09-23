package com.yanns.java.example1.version2;

import com.yanns.java.example1.version1.InvoiceCreator;

import java.util.Date;

public class InvoiceController {

    InvoiceCreator invoiceCreator = new InvoiceCreator();

    public void payInvoice() {
        String newInvoiceId = invoiceCreator.createInvoiceName(
                new Date(), // invoiceDate
                "45AE-45F", // invoiceId
                "872346", // userId
                "abc-234", // firmId
                true, // directInvoice
                false, // firmInvoice
                false //electronic
            );

        // ...
    }
}
