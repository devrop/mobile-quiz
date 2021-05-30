/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eintrusty.um.entity;

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
@Table(name = "MST_COUNTER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MstCounter.findAll", query = "SELECT m FROM MstCounter m")
    , @NamedQuery(name = "MstCounter.findByCompanyCode", query = "SELECT m FROM MstCounter m WHERE m.companyCode = :companyCode")
    , @NamedQuery(name = "MstCounter.findByTrxCode", query = "SELECT m FROM MstCounter m WHERE m.trxCode = :trxCode")
    , @NamedQuery(name = "MstCounter.findByLastNo", query = "SELECT m FROM MstCounter m WHERE m.lastNo = :lastNo")
    , @NamedQuery(name = "MstCounter.findByCreatedDate", query = "SELECT m FROM MstCounter m WHERE m.createdDate = :createdDate")
    , @NamedQuery(name = "MstCounter.findByCreatedBy", query = "SELECT m FROM MstCounter m WHERE m.createdBy = :createdBy")
    , @NamedQuery(name = "MstCounter.findByUpdatedDate", query = "SELECT m FROM MstCounter m WHERE m.updatedDate = :updatedDate")
    , @NamedQuery(name = "MstCounter.findByUpdatedBy", query = "SELECT m FROM MstCounter m WHERE m.updatedBy = :updatedBy")})
public class MstCounter implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "COMPANY_CODE")
    private String companyCode;
    @Id
    @Basic(optional = false)
    @Column(name = "TRX_CODE")
    private String trxCode;
    @Column(name = "LAST_NO")
    private Integer lastNo;
    @Basic(optional = false)
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Basic(optional = false)
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "UPDATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedDate;
    @Column(name = "UPDATED_BY")
    private String updatedBy;

    public MstCounter() {
    }

    public MstCounter(String trxCode) {
        this.trxCode = trxCode;
    }

    public MstCounter(String trxCode, String companyCode, Date createdDate, String createdBy) {
        this.trxCode = trxCode;
        this.companyCode = companyCode;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getTrxCode() {
        return trxCode;
    }

    public void setTrxCode(String trxCode) {
        this.trxCode = trxCode;
    }

    public Integer getLastNo() {
        return lastNo;
    }

    public void setLastNo(Integer lastNo) {
        this.lastNo = lastNo;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trxCode != null ? trxCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MstCounter)) {
            return false;
        }
        MstCounter other = (MstCounter) object;
        if ((this.trxCode == null && other.trxCode != null) || (this.trxCode != null && !this.trxCode.equals(other.trxCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication77.MstCounter[ trxCode=" + trxCode + " ]";
    }
    
}
