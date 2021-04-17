/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hungkd.dao;

import hungkd.dto.itemDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author PC
 */
public class itemDAO extends Vector<itemDTO> {

//    List<itemDTO> itemList = new ArrayList<>();
    public itemDAO() {
        super();
    }

    public void loadDB(Connection conn, supplierDAO dao) throws SQLException {//fix
        String code = "", name = "", unit = "", supCode = "";
        float price = 0;
        boolean supplying = false;
        String sql = "select * from tblItems";
        Statement sm = conn.createStatement();
        ResultSet rs = sm.executeQuery(sql);
        while (rs.next()) {
            code = rs.getString("itemCode");
            name = rs.getString("itemName");
            unit = rs.getString("unit");
            price = rs.getFloat("price");
            supplying = rs.getBoolean("supplying");
            supCode = rs.getString("supCode");
            itemDTO dto = new itemDTO(code, name, unit, price, supplying, supCode);
            this.add(dto);
        }
        sm.close();
    }
}
