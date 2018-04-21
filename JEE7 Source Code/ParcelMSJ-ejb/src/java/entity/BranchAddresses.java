/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Leo
 */
@Entity
@Table(name = "branch_addresses")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BranchAddresses.findAll", query = "SELECT b FROM BranchAddresses b")
    , @NamedQuery(name = "BranchAddresses.findByBranchId", query = "SELECT b FROM BranchAddresses b WHERE b.branchId = :branchId")
    , @NamedQuery(name = "BranchAddresses.findByCity", query = "SELECT b FROM BranchAddresses b WHERE b.city = :city")
    , @NamedQuery(name = "BranchAddresses.findByAddress", query = "SELECT b FROM BranchAddresses b WHERE b.address = :address")})
public class BranchAddresses implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "branch_id")
    private Integer branchId;
    @Size(max = 14)
    @Column(name = "city")
    private String city;
    @Size(max = 50)
    @Column(name = "address")
    private String address;

    public BranchAddresses() {
    }

    public BranchAddresses(Integer branchId) {
        this.branchId = branchId;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (branchId != null ? branchId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BranchAddresses)) {
            return false;
        }
        BranchAddresses other = (BranchAddresses) object;
        if ((this.branchId == null && other.branchId != null) || (this.branchId != null && !this.branchId.equals(other.branchId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.BranchAddresses[ branchId=" + branchId + " ]";
    }
    
}
