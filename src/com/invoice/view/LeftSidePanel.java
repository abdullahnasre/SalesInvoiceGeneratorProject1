package com.invoice.view;

import javax.swing.*;
import java.awt.*;

public class LeftSidePanel extends JDialog {
    private JLabel customerNameLbl;
    private JTextField customerName;
    private JLabel invoiceDateLbl;
    private JTextField invoiceDate;
    private JButton okBtn;
    private JButton cancelBtn;

    public LeftSidePanel(Frame frame) {

        customerNameLbl = new JLabel("Customer Name : ");
        customerName = new JTextField(20);
        invoiceDateLbl = new JLabel("Invoice Date : ");
        invoiceDate = new JTextField(25);
        okBtn = new JButton("Ok"); okBtn.setActionCommand("createOk"); ; okBtn.addActionListener(frame);
        cancelBtn = new JButton("Cancel"); cancelBtn.setActionCommand("createCancel"); cancelBtn.addActionListener(frame);

        setLayout(new GridLayout(3,2));

        add(invoiceDateLbl);
        add(invoiceDate);
        add(customerNameLbl);
        add(customerName);
        add(okBtn);
        add(cancelBtn);

        pack();
    }

    public JTextField getCustomerName() {
        return customerName;
    }

    public JTextField getInvoiceDate() {
        return getInvoiceDate();
    }
}
