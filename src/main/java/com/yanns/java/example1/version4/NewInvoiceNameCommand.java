package com.yanns.java.example1.version4;

import java.util.Date;

public class NewInvoiceNameCommand {

    private final Date invoiceDate;

    private final String invoiceId;

    private final String userId;

    private final String firmId;

    private final boolean directInvoice;

    private final boolean firmInvoice;

    private final boolean electronic;

    public static class NewInvoiceNameCommandBuilder {
        private Date invoiceDate;

        private String invoiceId;

        private String userId;

        private String firmId;

        private boolean directInvoice;

        private boolean firmInvoice;

        private boolean electronic;

        public NewInvoiceNameCommandBuilder() {
        }

        public NewInvoiceNameCommand build() {
            return new NewInvoiceNameCommand(invoiceDate, invoiceId, userId, firmId, directInvoice, firmInvoice, electronic);
        }

        public NewInvoiceNameCommandBuilder withInvoiceDate(Date invoiceDate) {
            this.invoiceDate = invoiceDate;
            return this;
        }

        public NewInvoiceNameCommandBuilder withInvoiceId(String invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }

        public NewInvoiceNameCommandBuilder withUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public NewInvoiceNameCommandBuilder withFirmId(String firmId) {
            this.firmId = firmId;
            return this;
        }

        public NewInvoiceNameCommandBuilder withDirectInvoice(boolean directInvoice) {
            this.directInvoice = directInvoice;
            return this;
        }

        public NewInvoiceNameCommandBuilder withFirmInvoice(boolean firmInvoice) {
            this.firmInvoice = firmInvoice;
            return this;
        }

        public NewInvoiceNameCommandBuilder withElectronic(boolean electronic) {
            this.electronic = electronic;
            return this;
        }

    }


    private NewInvoiceNameCommand(
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
