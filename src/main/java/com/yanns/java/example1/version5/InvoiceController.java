package com.yanns.java.example1.version5;

import java.util.Date;

public class InvoiceController {

    InvoiceCreator invoiceCreator = new InvoiceCreator();

    public void payInvoice() {
        NewInvoiceNameCommand newInvoiceNameCommand = new NewInvoiceNameCommand.NewInvoiceNameCommandBuilder()
                .withInvoiceDate(new Date())
                .withInvoiceId("45AE-45F")
                .withUserId("872346")
                .withFirmId("abc-234")
                .withElectronic(false)
                .build();

        String newInvoiceId = invoiceCreator.createInvoiceName(newInvoiceNameCommand);

        assert newInvoiceId != null;

        // ...
    }
}
