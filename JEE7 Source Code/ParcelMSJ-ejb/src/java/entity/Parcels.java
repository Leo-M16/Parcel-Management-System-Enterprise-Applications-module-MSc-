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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Leo
 */
@Entity
@Table(name = "parcels")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parcels.findAll", query = "SELECT p FROM Parcels p")
    , @NamedQuery(name = "Parcels.findByParcelId", query = "SELECT p FROM Parcels p WHERE p.parcelId = :parcelId")})
public class Parcels implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "parcel_id")
    private Integer parcelId;
    @JoinColumn(name = "order_id", referencedColumnName = "order_id")
    @ManyToOne
    private Orders orderId;

    public Parcels() {
    }

    public Parcels(Integer parcelId) {
        this.parcelId = parcelId;
    }

    public Integer getParcelId() {
        return parcelId;
    }

    public void setParcelId(Integer parcelId) {
        this.parcelId = parcelId;
    }

    public Orders getOrderId() {
        return orderId;
    }

    public void setOrderId(Orders orderId) {
        this.orderId = orderId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (parcelId != null ? parcelId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parcels)) {
            return false;
        }
        Parcels other = (Parcels) object;
        if ((this.parcelId == null && other.parcelId != null) || (this.parcelId != null && !this.parcelId.equals(other.parcelId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Parcels[ parcelId=" + parcelId + " ]";
    }
    
}
