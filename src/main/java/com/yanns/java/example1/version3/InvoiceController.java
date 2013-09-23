package com.yanns.java.example1.version3;

import java.util.Date;

public class InvoiceController {

    InvoiceCreator invoiceCreator = new InvoiceCreator();

    public void payInvoice() {
        NewInvoiceNameCommand newInvoiceNameCommand = new NewInvoiceNameCommand(new Date(), "45AE-45F", "872346", "abc-234", true, false, false);

        String newInvoiceId = invoiceCreator.createInvoiceName(newInvoiceNameCommand);

        // ...
    }
}
