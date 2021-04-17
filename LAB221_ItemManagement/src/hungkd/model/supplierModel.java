/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hungkd.model;

import hungkd.dao.supplierDAO;
import hungkd.dto.supplierDTO;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class supplierModel extends AbstractTableModel {

    supplierDAO list = null;

    public supplierDAO getList() {
        return list;
    }

    public void setList(supplierDAO list) {
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
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
                name = "Address";
                break;
        }
        return name;
    }

    @Override
    public Object getValueAt(int row, int col) {
        supplierDTO dto = list.get(row);
        Object obj = null;
        switch (col) {
            case 0:
                obj = dto.getSupCode();
                break;
            case 1:
                obj = dto.getSupName();
                break;
            case 2:
                obj = dto.getAddress();
                break;
        }
        return obj;
    }

}
