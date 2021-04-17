/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hungkd.dao;

import hungkd.dto.supplierDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author PC
 */
public class supplierDAO extends Vector<supplierDTO> {

//    List<supplierDTO> supList = new ArrayList<>();
    public supplierDAO() {
        super();
    }

    public int find(String supCode) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getSupCode().equalsIgnoreCase(supCode)) {
                return i;
            }
        }
        return -1;
    }

    public supplierDTO findSupplier(String supCode) {
        int sup = find(supCode);
        return sup < 0 ? null : this.get(sup);
    }

    public void loadDBModel(Connection c) throws SQLException {
        String code = "", name = "", address = "";
        boolean collaborating = true;
        String sql = "select * from tblSuppliers";
        Statement sm = c.createStatement();
        ResultSet rs = sm.executeQuery(sql);
        while (rs.next()) {
            code = rs.getString("supCode");
            name = rs.getString("supName");
            address = rs.getString("address");
            collaborating = rs.getBoolean("collaborating");
            supplierDTO dto = new supplierDTO(code, name, address, collaborating);
            this.add(dto);
        }
        rs.close();
        sm.close();
//        return supList;
    }
}
