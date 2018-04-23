/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managed_beans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Leo
 */
@Named(value = "customer_UI")
@RequestScoped
public class Customer_UI {

    /**
     * Creates a new instance of Customer_UI
     */
    public Customer_UI() {
    }
    
}
