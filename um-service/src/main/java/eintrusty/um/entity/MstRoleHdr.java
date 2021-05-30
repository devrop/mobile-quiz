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

import eintrusty.um.entity.pk.MstRoleHdrPK;

/**
 *
 * @author user
 */
@Entity
@Table(name = "MST_ROLE_HDR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MstRoleHdr.findAll", query = "SELECT m FROM MstRoleHdr m")
    , @NamedQuery(name = "MstRoleHdr.findByCompanyCode", query = "SELECT m FROM MstRoleHdr m WHERE m.mstRoleHdrPK.companyCode = :companyCode")
    , @NamedQuery(name = "MstRoleHdr.findByRoleCode", query = "SELECT m FROM MstRoleHdr m WHERE m.mstRoleHdrPK.roleCode = :roleCode")
    , @NamedQuery(name = "MstRoleHdr.findByRoleName", query = "SELECT m FROM MstRoleHdr m WHERE m.roleName = :roleName")
    , @NamedQuery(name = "MstRoleHdr.findByRoleParent", query = "SELECT m FROM MstRoleHdr m WHERE m.roleParent = :roleParent")
    , @NamedQuery(name = "MstRoleHdr.findByPositionCode", query = "SELECT m FROM MstRoleHdr m WHERE m.positionCode = :positionCode")
    , @NamedQuery(name = "MstRoleHdr.findByApplProgCode", query = "SELECT m FROM MstRoleHdr m WHERE m.applProgCode = :applProgCode")
    , @NamedQuery(name = "MstRoleHdr.findByRoleDescrip", query = "SELECT m FROM MstRoleHdr m WHERE m.roleDescrip = :roleDescrip")
    , @NamedQuery(name = "MstRoleHdr.findByLevelType", query = "SELECT m FROM MstRoleHdr m WHERE m.levelType = :levelType")
    , @NamedQuery(name = "MstRoleHdr.findByFlagDefault", query = "SELECT m FROM MstRoleHdr m WHERE m.flagDefault = :flagDefault")
    , @NamedQuery(name = "MstRoleHdr.findByFlagActive", query = "SELECT m FROM MstRoleHdr m WHERE m.flagActive = :flagActive")
    , @NamedQuery(name = "MstRoleHdr.findByCreatedDate", query = "SELECT m FROM MstRoleHdr m WHERE m.createdDate = :createdDate")
    , @NamedQuery(name = "MstRoleHdr.findByCreatedBy", query = "SELECT m FROM MstRoleHdr m WHERE m.createdBy = :createdBy")
    , @NamedQuery(name = "MstRoleHdr.findByUpdatedDate", query = "SELECT m FROM MstRoleHdr m WHERE m.updatedDate = :updatedDate")
    , @NamedQuery(name = "MstRoleHdr.findByUpdatedBy", query = "SELECT m FROM MstRoleHdr m WHERE m.updatedBy = :updatedBy")})
public class MstRoleHdr implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MstRoleHdrPK mstRoleHdrPK;
    @Basic(optional = false)
    @Column(name = "ROLE_NAME")
    private String roleName;
    @Column(name = "ROLE_PARENT")
    private String roleParent;
    @Basic(optional = false)
    @Column(name = "POSITION_CODE")
    private String positionCode;
    @Column(name = "APPL_PROG_CODE")
    private String applProgCode;
    @Column(name = "ROLE_DESCRIP")
    private String roleDescrip;
    @Column(name = "LEVEL_TYPE")
    private String levelType;
    @Column(name = "FLAG_DEFAULT")
    private String flagDefault;
    @Basic(optional = false)
    @Column(name = "FLAG_ACTIVE")
    private String flagActive;
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

    public MstRoleHdr() {
    }

    public MstRoleHdr(MstRoleHdrPK mstRoleHdrPK) {
        this.mstRoleHdrPK = mstRoleHdrPK;
    }

    public MstRoleHdr(MstRoleHdrPK mstRoleHdrPK, String roleName, String positionCode, String flagActive, Date createdDate, String createdBy) {
        this.mstRoleHdrPK = mstRoleHdrPK;
        this.roleName = roleName;
        this.positionCode = positionCode;
        this.flagActive = flagActive;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
    }

    public MstRoleHdr(String companyCode, String roleCode) {
        this.mstRoleHdrPK = new MstRoleHdrPK(companyCode, roleCode);
    }

    public MstRoleHdrPK getMstRoleHdrPK() {
        return mstRoleHdrPK;
    }

    public void setMstRoleHdrPK(MstRoleHdrPK mstRoleHdrPK) {
        this.mstRoleHdrPK = mstRoleHdrPK;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleParent() {
        return roleParent;
    }

    public void setRoleParent(String roleParent) {
        this.roleParent = roleParent;
    }

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode;
    }

    public String getApplProgCode() {
        return applProgCode;
    }

    public void setApplProgCode(String applProgCode) {
        this.applProgCode = applProgCode;
    }

    public String getRoleDescrip() {
        return roleDescrip;
    }

    public void setRoleDescrip(String roleDescrip) {
        this.roleDescrip = roleDescrip;
    }

    public String getLevelType() {
        return levelType;
    }

    public void setLevelType(String levelType) {
        this.levelType = levelType;
    }

    public String getFlagDefault() {
        return flagDefault;
    }

    public void setFlagDefault(String flagDefault) {
        this.flagDefault = flagDefault;
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
        hash += (mstRoleHdrPK != null ? mstRoleHdrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MstRoleHdr)) {
            return false;
        }
        MstRoleHdr other = (MstRoleHdr) object;
        if ((this.mstRoleHdrPK == null && other.mstRoleHdrPK != null) || (this.mstRoleHdrPK != null && !this.mstRoleHdrPK.equals(other.mstRoleHdrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "eintrusty.um.entity.MstRoleHdr[ mstRoleHdrPK=" + mstRoleHdrPK + " ]";
    }
    
}
