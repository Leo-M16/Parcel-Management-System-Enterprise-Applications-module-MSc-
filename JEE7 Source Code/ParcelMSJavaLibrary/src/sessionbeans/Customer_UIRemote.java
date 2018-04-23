/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import dto.BranchAddressesDTO;
import javax.ejb.Remote;

/**
 *
 * @author Leo
 */
@Remote
public interface Customer_UIRemote {

    public BranchAddressesDTO findCompanyAddress(String city);
    
}
