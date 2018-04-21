/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Leo
 */
@Entity
@Table(name = "order_changes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrderChanges.findAll", query = "SELECT o FROM OrderChanges o")
    , @NamedQuery(name = "OrderChanges.findByOrderChangeId", query = "SELECT o FROM OrderChanges o WHERE o.orderChangeId = :orderChangeId")
    , @NamedQuery(name = "OrderChanges.findByCollectionDate", query = "SELECT o FROM OrderChanges o WHERE o.collectionDate = :collectionDate")
    , @NamedQuery(name = "OrderChanges.findByNewCollectionDate", query = "SELECT o FROM OrderChanges o WHERE o.newCollectionDate = :newCollectionDate")
    , @NamedQuery(name = "OrderChanges.findByDriverId", query = "SELECT o FROM OrderChanges o WHERE o.driverId = :driverId")})
public class OrderChanges implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "order_change_id")
    private Integer orderChangeId;
    @Column(name = "collection_date")
    @Temporal(TemporalType.DATE)
    private Date collectionDate;
    @Column(name = "new_collection_date")
    @Temporal(TemporalType.DATE)
    private Date newCollectionDate;
    @Column(name = "driver_id")
    private Integer driverId;
    @JoinColumn(name = "order_id", referencedColumnName = "order_id")
    @ManyToOne
    private Orders orderId;

    public OrderChanges() {
    }

    public OrderChanges(Integer orderChangeId) {
        this.orderChangeId = orderChangeId;
    }

    public Integer getOrderChangeId() {
        return orderChangeId;
    }

    public void setOrderChangeId(Integer orderChangeId) {
        this.orderChangeId = orderChangeId;
    }

    public Date getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(Date collectionDate) {
        this.collectionDate = collectionDate;
    }

    public Date getNewCollectionDate() {
        return newCollectionDate;
    }

    public void setNewCollectionDate(Date newCollectionDate) {
        this.newCollectionDate = newCollectionDate;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
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
        hash += (orderChangeId != null ? orderChangeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderChanges)) {
            return false;
        }
        OrderChanges other = (OrderChanges) object;
        if ((this.orderChangeId == null && other.orderChangeId != null) || (this.orderChangeId != null && !this.orderChangeId.equals(other.orderChangeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.OrderChanges[ orderChangeId=" + orderChangeId + " ]";
    }
    
}
