package com.yanns.java.example1.version1;

import java.util.Date;

public class InvoiceController {

    InvoiceCreator invoiceCreator = new InvoiceCreator();

    public void payInvoice() {
        String newInvoiceId = invoiceCreator.createInvoiceName(new Date(), "45AE-45F", "872346", "abc-234", true, false, false);

        // ...
    }
}
