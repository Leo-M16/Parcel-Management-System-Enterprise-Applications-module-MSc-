/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import dto.BranchAddressesDTO;
import javax.ejb.Stateless;
import java.io.Serializable;
import javax.ejb.EJB;

/**
 *
 * @author Leo
 */
@Stateless(mappedName="customer_ui")
public class Customer_UI implements Customer_UIRemote,Serializable {
    @EJB 
    private OrdersHandlerDAO oh;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Override
    public BranchAddressesDTO findCompanyAddress(String city){
        return oh.findCompanyAddress(city);
        
    }
    
}
