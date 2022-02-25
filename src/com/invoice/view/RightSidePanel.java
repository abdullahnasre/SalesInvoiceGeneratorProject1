package com.invoice.view;

import javax.swing.*;
import java.awt.*;

public class RightSidePanel extends JDialog {

    private JLabel itemNameLbl;
    private JTextField itemName;
    private JLabel itemCountLbl;
    private JTextField itemCount;
    private JLabel itemPriceLbl;
    private JTextField itemPrice;
    private JButton okBtn;
    private JButton cancelBtn;

    public RightSidePanel(Frame frame) {

        itemNameLbl = new JLabel("Item Name : ");
        itemName = new JTextField(20);
        itemCountLbl = new JLabel("Item Count : ");
        itemCount = new JTextField(20);
        itemPriceLbl = new JLabel("Item Price : ");
        itemPrice = new JTextField(20);

        okBtn = new JButton("Ok"); okBtn.setActionCommand("createItemOk"); ; okBtn.addActionListener(frame);
        cancelBtn = new JButton("Cancel"); cancelBtn.setActionCommand("CancelItem"); cancelBtn.addActionListener(frame);

        setLayout(new GridLayout(4,2));

        add(itemNameLbl);
        add(itemName);
        add(itemCountLbl);
        add(itemCount);
        add(itemPriceLbl);
        add(itemPrice);
        add(okBtn);
        add(cancelBtn);

        pack();
    }


    public JTextField getItemName() {
        return itemName;
    }

    public JTextField getItemCount() {
        return itemCount;
    }

    public JTextField getItemPrice() {
        return itemPrice;
    }

}
