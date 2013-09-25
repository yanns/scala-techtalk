package com.yanns.java.example1.version1;

import java.util.Date;

public class InvoiceCreator {

    public String createInvoiceName(
            Date invoiceDate,
            String invoiceId,
            String userId,
            String firmId,
            boolean directInvoice,
            boolean firmInvoice,
            boolean electronic) {

        // ...
        assert invoiceDate != null;
        assert invoiceId != null;
        assert userId != null;
        assert firmId != null;
        if (directInvoice || firmInvoice || electronic) {
        }
        // ...

        return "id";
    }

}
