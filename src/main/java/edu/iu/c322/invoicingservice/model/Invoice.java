package edu.iu.c322.invoicingservice.model;

import java.util.Date;

public class Invoice {
    private Date orderPlaced;
    private float total;
    private InvoiceItem invoiceItem;
    private Payment payment;

    public Date getOrderPlaced() {
        return orderPlaced;
    }

    public void setOrderPlaced(Date orderPlaced) {
        this.orderPlaced = orderPlaced;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public InvoiceItem getInvoiceItem() {
        return invoiceItem;
    }

    public void setInvoiceItem(InvoiceItem invoiceItem) {
        this.invoiceItem = invoiceItem;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
