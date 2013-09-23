package com.yanns.java.example1.version3;

import java.util.Date;

public class NewInvoiceNameCommand {

    private final Date invoiceDate;

    private final String invoiceId;

    private final String userId;

    private final String firmId;

    private final boolean directInvoice;

    private final boolean firmInvoice;

    private final boolean electronic;


    public NewInvoiceNameCommand(
            Date invoiceDate,
            String invoiceId,
            String userId,
            String firmId,
            boolean directInvoice,
            boolean firmInvoice,
            boolean electronic) {

        this.invoiceDate = invoiceDate;
        this.invoiceId = invoiceId;
        this.userId = userId;
        this.firmId = firmId;
        this.directInvoice = directInvoice;
        this.firmInvoice = firmInvoice;
        this.electronic = electronic;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public String getUserId() {
        return userId;
    }

    public String getFirmId() {
        return firmId;
    }

    public boolean isDirectInvoice() {
        return directInvoice;
    }

    public boolean isFirmInvoice() {
        return firmInvoice;
    }

    public boolean isElectronic() {
        return electronic;
    }
}
