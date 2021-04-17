/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hungkd.model;

import hungkd.dao.itemDAO;
import hungkd.dto.itemDTO;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author PC
 */
public class itemModel extends AbstractTableModel {

    itemDAO list = null;

    public itemModel() {
    }

    public itemModel(itemDAO list) {
        this.list = list;
    }

    public itemDAO getList() {
        return list;
    }

    public void setList(itemDAO list) {
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public String getColumnName(int col) {
        String name = "";
        switch (col) {
            case 0:
                name = "Code";
                break;
            case 1:
                name = "Name";
                break;
            case 2:
                name = "Supplier";
                break;
            case 3:
                name = "Unit";
                break;
            case 4:
                name = "Price";
                break;
            case 5:
                name = "Supply";
                break;
        }
        return name;
    }

    @Override
    public Object getValueAt(int row, int col) {
        itemDTO dto = list.get(row);
        Object obj = null;
        switch (col) {
            case 0:
                obj = dto.getItemCode();
                break;
            case 1:
                obj = dto.getItemName();
                break;
            case 2:
                obj = dto.getSupCode();//need to fix
                break;
            case 3:
                obj = dto.getUnit();
                break;
            case 4:
                obj = dto.getPrice();
                break;
            case 5:
                obj = dto.isSupplying();
                break;
        }
        return obj;
    }

}
