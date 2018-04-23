/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import entity.BranchAddresses;
import javax.ejb.Remote;

/**
 *
 * @author Leo
 */
@Remote
public interface OrdersHandlerDAORemote {

    public void persist(Object object);

    public BranchAddresses findCompanyAddress(String city);
    
}
