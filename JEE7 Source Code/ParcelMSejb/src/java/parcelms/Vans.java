/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcelms;

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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Leo
 */
@Entity
@Table(name = "vans")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vans.findAll", query = "SELECT v FROM Vans v")
    , @NamedQuery(name = "Vans.findByVanId", query = "SELECT v FROM Vans v WHERE v.vanId = :vanId")
    , @NamedQuery(name = "Vans.findByVanModel", query = "SELECT v FROM Vans v WHERE v.vanModel = :vanModel")
    , @NamedQuery(name = "Vans.findByVanColor", query = "SELECT v FROM Vans v WHERE v.vanColor = :vanColor")})
public class Vans implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "van_id")
    private Integer vanId;
    @Size(max = 20)
    @Column(name = "van_model")
    private String vanModel;
    @Size(max = 12)
    @Column(name = "van_color")
    private String vanColor;
    @JoinColumn(name = "driver_id", referencedColumnName = "driver_id")
    @ManyToOne
    private Drivers driverId;

    public Vans() {
    }

    public Vans(Integer vanId) {
        this.vanId = vanId;
    }

    public Integer getVanId() {
        return vanId;
    }

    public void setVanId(Integer vanId) {
        this.vanId = vanId;
    }

    public String getVanModel() {
        return vanModel;
    }

    public void setVanModel(String vanModel) {
        this.vanModel = vanModel;
    }

    public String getVanColor() {
        return vanColor;
    }

    public void setVanColor(String vanColor) {
        this.vanColor = vanColor;
    }

    public Drivers getDriverId() {
        return driverId;
    }

    public void setDriverId(Drivers driverId) {
        this.driverId = driverId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vanId != null ? vanId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vans)) {
            return false;
        }
        Vans other = (Vans) object;
        if ((this.vanId == null && other.vanId != null) || (this.vanId != null && !this.vanId.equals(other.vanId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "parcelms.Vans[ vanId=" + vanId + " ]";
    }
    
}
