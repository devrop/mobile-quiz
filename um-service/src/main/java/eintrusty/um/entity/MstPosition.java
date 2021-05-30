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
@Table(name = "MST_POSITION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MstPosition.findAll", query = "SELECT m FROM MstPosition m")
    , @NamedQuery(name = "MstPosition.findByPositionCode", query = "SELECT m FROM MstPosition m WHERE m.positionCode = :positionCode")
    , @NamedQuery(name = "MstPosition.findByPositionName", query = "SELECT m FROM MstPosition m WHERE m.positionName = :positionName")
    , @NamedQuery(name = "MstPosition.findByFlagAcvtive", query = "SELECT m FROM MstPosition m WHERE m.flagAcvtive = :flagAcvtive")
    , @NamedQuery(name = "MstPosition.findByCreatedDate", query = "SELECT m FROM MstPosition m WHERE m.createdDate = :createdDate")
    , @NamedQuery(name = "MstPosition.findByCreatedBy", query = "SELECT m FROM MstPosition m WHERE m.createdBy = :createdBy")
    , @NamedQuery(name = "MstPosition.findByUpdatedDate", query = "SELECT m FROM MstPosition m WHERE m.updatedDate = :updatedDate")
    , @NamedQuery(name = "MstPosition.findByUpdatedBy", query = "SELECT m FROM MstPosition m WHERE m.updatedBy = :updatedBy")})
public class MstPosition implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "POSITION_CODE")
    private String positionCode;
    @Basic(optional = false)
    @Column(name = "POSITION_NAME")
    private String positionName;
    @Basic(optional = false)
    @Column(name = "FLAG_ACVTIVE")
    private String flagAcvtive;
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

    public MstPosition() {
    }

    public MstPosition(String positionCode) {
        this.positionCode = positionCode;
    }

    public MstPosition(String positionCode, String positionName, String flagAcvtive, Date createdDate, String createdBy) {
        this.positionCode = positionCode;
        this.positionName = positionName;
        this.flagAcvtive = flagAcvtive;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
    }

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getFlagAcvtive() {
        return flagAcvtive;
    }

    public void setFlagAcvtive(String flagAcvtive) {
        this.flagAcvtive = flagAcvtive;
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
        hash += (positionCode != null ? positionCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MstPosition)) {
            return false;
        }
        MstPosition other = (MstPosition) object;
        if ((this.positionCode == null && other.positionCode != null) || (this.positionCode != null && !this.positionCode.equals(other.positionCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "eintrusty.um.entity.MstPosition[ positionCode=" + positionCode + " ]";
    }
    
}
