/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import entity.BranchAddresses;
import interfaces.BranchAddressesDAO;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Leo
 */
@Stateless
public class OrdersHandlerDAO implements OrdersHandlerDAORemote, BranchAddressesDAO {

    @PersistenceContext(unitName = "ParcelMSJ-ejbPU")
    private EntityManager em;

    @Override
    public void persist(Object object) {
        em.persist(object);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Override
       public BranchAddresses findCompanyAddress(String city){
          BranchAddresses BranchAddress=new BranchAddresses();
        BranchAddress = em.find(BranchAddresses.class, city);
        return BranchAddress;
       };

}
