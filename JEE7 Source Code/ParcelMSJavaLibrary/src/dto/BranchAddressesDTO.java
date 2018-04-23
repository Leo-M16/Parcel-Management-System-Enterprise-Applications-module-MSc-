/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;
import java.io.Serializable;

/**
 *
 * @author Leo
 */
public class BranchAddressesDTO implements Serializable {
 private int branchId;
 private String city;
 private String address;

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public BranchAddressesDTO (int branchId,String city,String address){
        this.branchId=branchId;
        this.city=city;
        this.address=address;
    }

}
