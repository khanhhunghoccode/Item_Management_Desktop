/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hungkd.dto;

/**
 *
 * @author PC
 */
public class supplierDTO {

    private String supCode = "", supName = "", address = "";
    private boolean collaborating = true;

    public supplierDTO() {
    }

    public supplierDTO(String supCode, String supName, String address, boolean collaborating) {
        this.supCode = supCode;
        this.supName = supName;
        this.address = address;
        this.collaborating = collaborating;
    }

    public String getSupCode() {
        return supCode;
    }

    public void setSupCode(String supCode) {
        this.supCode = supCode;
    }

    public String getSupName() {
        return supName;
    }

    public void setSupName(String supName) {
        this.supName = supName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCollaborating(boolean collaborating) {
        this.collaborating = collaborating;
    }

    public boolean isCollaborating() {
        return collaborating;
    }

    @Override
    public String toString() {//cho supplier trong item pane
        return supCode + "-" + supName;
    }

}
