package com.invoice.view;

import com.invoice.model.InvoiceLine;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class RightTable extends DefaultTableModel {
    private String[] cols= {"No.","Item Name","Item Price","Count","Item Total"};
    private ArrayList<InvoiceLine> data;

    public RightTable(ArrayList<InvoiceLine> data)
    {
        this.data = data;
    }

    public int getRowCount() {

        if (this.data == null) {
            data = new ArrayList<>();
        }return data.size();
    }

    public int getColumnCount(){
        return cols.length;
    }

    public String getColumnName(int column){
        return cols[column];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceLine row = data.get(rowIndex);
        switch (columnIndex){
            case 0: return row.getInvoiceHeader().getInvoiceNum();
            case 1 : return row.getItemName();
            case 2 : return row.getItemPrice();
            case 3 : return row.getCount();
            case 4 : return row.getItemTotal();
        }
        return "";
    }

    public ArrayList<InvoiceLine> getData() {
        return data;
    }

}
