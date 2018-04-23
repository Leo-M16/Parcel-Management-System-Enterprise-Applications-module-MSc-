/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import javax.ejb.Remote;
import dto.*;

/**
 *
 * @author Leo
 */
@Remote
public interface OrdersHandlerDAORemote {

    public void persist(Object object);

    public BranchAddressesDTO findCompanyAddress(String city);
    
}
