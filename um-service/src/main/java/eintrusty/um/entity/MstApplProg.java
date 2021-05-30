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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import eintrusty.um.entity.pk.MstApplProgPK;

/**
 *
 * @author user
 */
@Entity
@Table(name = "MST_APPL_PROG")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MstApplProg.findAll", query = "SELECT m FROM MstApplProg m")
    , @NamedQuery(name = "MstApplProg.findByCompanyCode", query = "SELECT m FROM MstApplProg m WHERE m.mstApplProgPK.companyCode = :companyCode")
    , @NamedQuery(name = "MstApplProg.findByApplProgCode", query = "SELECT m FROM MstApplProg m WHERE m.mstApplProgPK.applProgCode = :applProgCode")
    , @NamedQuery(name = "MstApplProg.findByApplProgName", query = "SELECT m FROM MstApplProg m WHERE m.applProgName = :applProgName")
    , @NamedQuery(name = "MstApplProg.findByApplProgUrl", query = "SELECT m FROM MstApplProg m WHERE m.applProgUrl = :applProgUrl")
    , @NamedQuery(name = "MstApplProg.findByApplProgIcon", query = "SELECT m FROM MstApplProg m WHERE m.applProgIcon = :applProgIcon")
    , @NamedQuery(name = "MstApplProg.findByFlagActive", query = "SELECT m FROM MstApplProg m WHERE m.flagActive = :flagActive")
    , @NamedQuery(name = "MstApplProg.findByCreatedDate", query = "SELECT m FROM MstApplProg m WHERE m.createdDate = :createdDate")
    , @NamedQuery(name = "MstApplProg.findByCreatedBy", query = "SELECT m FROM MstApplProg m WHERE m.createdBy = :createdBy")
    , @NamedQuery(name = "MstApplProg.findByUpdatedDate", query = "SELECT m FROM MstApplProg m WHERE m.updatedDate = :updatedDate")
    , @NamedQuery(name = "MstApplProg.findByUpdatedBy", query = "SELECT m FROM MstApplProg m WHERE m.updatedBy = :updatedBy")})
public class MstApplProg implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MstApplProgPK mstApplProgPK;
    @Basic(optional = false)
    @Column(name = "APPL_PROG_NAME")
    private String applProgName;
    @Basic(optional = false)
    @Column(name = "APPL_PROG_URL")
    private String applProgUrl;
    @Column(name = "APPL_PROG_ICON")
    private String applProgIcon;
    @Basic(optional = false)
    @Column(name = "FLAG_ACTIVE")
    private String flagActive;
    @Basic(optional = false)
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.DATE)
    private Date createdDate;
    @Basic(optional = false)
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "UPDATED_DATE")
    @Temporal(TemporalType.DATE)
    private Date updatedDate;
    @Column(name = "UPDATED_BY")
    private String updatedBy;

    public MstApplProg() {
    }

    public MstApplProg(MstApplProgPK mstApplProgPK) {
        this.mstApplProgPK = mstApplProgPK;
    }

    public MstApplProg(MstApplProgPK mstApplProgPK, String applProgName, String applProgUrl, String flagActive, Date createdDate, String createdBy) {
        this.mstApplProgPK = mstApplProgPK;
        this.applProgName = applProgName;
        this.applProgUrl = applProgUrl;
        this.flagActive = flagActive;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
    }

    public MstApplProg(String companyCode, String applProgCode) {
        this.mstApplProgPK = new MstApplProgPK(companyCode, applProgCode);
    }

    public MstApplProgPK getMstApplProgPK() {
        return mstApplProgPK;
    }

    public void setMstApplProgPK(MstApplProgPK mstApplProgPK) {
        this.mstApplProgPK = mstApplProgPK;
    }

    public String getApplProgName() {
        return applProgName;
    }

    public void setApplProgName(String applProgName) {
        this.applProgName = applProgName;
    }

    public String getApplProgUrl() {
        return applProgUrl;
    }

    public void setApplProgUrl(String applProgUrl) {
        this.applProgUrl = applProgUrl;
    }

    public String getApplProgIcon() {
        return applProgIcon;
    }

    public void setApplProgIcon(String applProgIcon) {
        this.applProgIcon = applProgIcon;
    }

    public String getFlagActive() {
        return flagActive;
    }

    public void setFlagActive(String flagActive) {
        this.flagActive = flagActive;
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
        hash += (mstApplProgPK != null ? mstApplProgPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MstApplProg)) {
            return false;
        }
        MstApplProg other = (MstApplProg) object;
        if ((this.mstApplProgPK == null && other.mstApplProgPK != null) || (this.mstApplProgPK != null && !this.mstApplProgPK.equals(other.mstApplProgPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "eintrusty.um.entity.MstApplProg[ mstApplProgPK=" + mstApplProgPK + " ]";
    }
    
}
