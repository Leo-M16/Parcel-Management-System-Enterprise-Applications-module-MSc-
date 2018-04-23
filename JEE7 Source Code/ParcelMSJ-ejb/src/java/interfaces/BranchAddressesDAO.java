/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
import entity.BranchAddresses;

/**
 *
 * @author Leo
 */
public interface BranchAddressesDAO {
    
   public BranchAddresses findCompanyAddress(String city);
    
}
