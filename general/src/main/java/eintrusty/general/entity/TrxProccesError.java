/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eintrusty.general.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user
 */
@Entity
@Table(name = "TRX_PROCCES_ERROR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TrxProccesError.findAll", query = "SELECT t FROM TrxProccesError t")
    , @NamedQuery(name = "TrxProccesError.findById", query = "SELECT t FROM TrxProccesError t WHERE t.id = :id")
    , @NamedQuery(name = "TrxProccesError.findByProccesName", query = "SELECT t FROM TrxProccesError t WHERE t.proccesName = :proccesName")
    , @NamedQuery(name = "TrxProccesError.findByProccesDate", query = "SELECT t FROM TrxProccesError t WHERE t.proccesDate = :proccesDate")
    , @NamedQuery(name = "TrxProccesError.findByErrorMessage", query = "SELECT t FROM TrxProccesError t WHERE t.errorMessage = :errorMessage")})
public class TrxProccesError implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "PROCCES_NAME")
    private String proccesName;
    @Basic(optional = false)
    @Column(name = "PROCCES_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date proccesDate;
    @Basic(optional = false)
    @Column(name = "ERROR_MESSAGE")
    private String errorMessage;

    public TrxProccesError() {
    }

    public TrxProccesError(Integer id) {
        this.id = id;
    }

    public TrxProccesError(Integer id, String proccesName, Date proccesDate, String errorMessage) {
        this.id = id;
        this.proccesName = proccesName;
        this.proccesDate = proccesDate;
        this.errorMessage = errorMessage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProccesName() {
        return proccesName;
    }

    public void setProccesName(String proccesName) {
        this.proccesName = proccesName;
    }

    public Date getProccesDate() {
        return proccesDate;
    }

    public void setProccesDate(Date proccesDate) {
        this.proccesDate = proccesDate;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrxProccesError)) {
            return false;
        }
        TrxProccesError other = (TrxProccesError) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication77.TrxProccesError[ id=" + id + " ]";
    }
    
}
