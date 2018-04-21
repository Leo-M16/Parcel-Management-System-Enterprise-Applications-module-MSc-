/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Leo
 */
@Entity
@Table(name = "drivers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Drivers.findAll", query = "SELECT d FROM Drivers d")
    , @NamedQuery(name = "Drivers.findByDriverId", query = "SELECT d FROM Drivers d WHERE d.driverId = :driverId")
    , @NamedQuery(name = "Drivers.findByFirstname", query = "SELECT d FROM Drivers d WHERE d.firstname = :firstname")
    , @NamedQuery(name = "Drivers.findBySurname", query = "SELECT d FROM Drivers d WHERE d.surname = :surname")
    , @NamedQuery(name = "Drivers.findByStatus", query = "SELECT d FROM Drivers d WHERE d.status = :status")})
public class Drivers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "driver_id")
    private Integer driverId;
    @Size(max = 20)
    @Column(name = "firstname")
    private String firstname;
    @Size(max = 20)
    @Column(name = "surname")
    private String surname;
    @Size(max = 20)
    @Column(name = "status")
    private String status;
    @OneToMany(mappedBy = "driverId")
    private Collection<Vans> vansCollection;
    @OneToMany(mappedBy = "driverId")
    private Collection<Orders> ordersCollection;

    public Drivers() {
    }

    public Drivers(Integer driverId) {
        this.driverId = driverId;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @XmlTransient
    public Collection<Vans> getVansCollection() {
        return vansCollection;
    }

    public void setVansCollection(Collection<Vans> vansCollection) {
        this.vansCollection = vansCollection;
    }

    @XmlTransient
    public Collection<Orders> getOrdersCollection() {
        return ordersCollection;
    }

    public void setOrdersCollection(Collection<Orders> ordersCollection) {
        this.ordersCollection = ordersCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (driverId != null ? driverId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Drivers)) {
            return false;
        }
        Drivers other = (Drivers) object;
        if ((this.driverId == null && other.driverId != null) || (this.driverId != null && !this.driverId.equals(other.driverId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Drivers[ driverId=" + driverId + " ]";
    }
    
}
