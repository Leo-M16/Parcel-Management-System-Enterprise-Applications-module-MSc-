/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managed_beans;

import dto.BranchAddressesDTO;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import sessionbeans.Customer_UIRemote;

/**
 *
 * @author Leo
 */
@Named(value = "customer_UI")
@RequestScoped
public class Customer_UI implements Serializable {
@EJB 
private Customer_UIRemote  Customer_UIRemote_session_bean;

private String city;
private BranchAddressesDTO localaddress;

    public String getCity() {
        return city;
    }

    /**
     * Creates a new instance of Customer_UI
     */
    public void setCity(String city) {
        this.city = city;
    }






    public Customer_UI() {
    }
    
    public String getBranchAddresses(){
        
        this.localaddress= Customer_UIRemote_session_bean.findCompanyAddress(city);
        return "Success";
        
    }
    
    public BranchAddressesDTO getLocalAddress(){
        return this.localaddress;
        
    }
    
}
