/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import dto.BranchAddressesDTO;

/**
 *
 * @author Leo
 */
public interface BranchAddressesDAO {
    
   public BranchAddressesDTO findCompanyAddress(String city);
    
}
