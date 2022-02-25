package com.invoice.model;

public class InvoiceLine {
    private String itemName;
    private double itemPrice;
    private int count;
    private double itemTotal; // itemPrice * count
    private InvoiceHeader invoiceHeader;

    public InvoiceLine(String itemName, double itemPrice, int count, InvoiceHeader invoiceHeader) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.count = count;
        this.setItemTotal(this.count * this.itemPrice);
        this.invoiceHeader = invoiceHeader;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getItemTotal() {
        return itemTotal;
    }

    public void setItemTotal(double itemTotal) {
        this.itemTotal = itemTotal;
    }

    public InvoiceHeader getInvoiceHeader() {
        return invoiceHeader;
    }

    public void setInvoiceHeader(InvoiceHeader invoiceHeader) {
        this.invoiceHeader = invoiceHeader;
    }
}

