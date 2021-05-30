/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eintrusty.auth.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import eintrusty.auth.entity.pk.MstRoleHdrPK;

/**
 *
 * @author user
 */
@Entity
@Table(name = "mst_role_hdr")
@XmlRootElement
public class MstRoleHdr implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MstRoleHdrPK mstRoleHdrPK;
    @Basic(optional = false)
    @Column(name = "ROLE_NAME")
    private String roleName;
    @Column(name = "POSITION_CODE")
    private String positionCode;
    @Column(name = "APPL_PROG_CODE")
    private String applProgCode;
    @Basic(optional = false)
    @Column(name = "ROLE_DESCRIP")
    private String roleDescrip;
    @Column(name = "LEVEL_TYPE")
    private String levelType;
    @Basic(optional = false)
    @Column(name = "FLAG_DEFAULT")
    private String flagDefault;
    @Basic(optional = false)
    @Column(name = "FLAG_ACTIVE")
    private String flagActive;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Basic(optional = false)
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Column(name = "UPDATED_BY")
    private String updatedBy;
    @Column(name = "UPDATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedDate;
    @Column(name = "ROLE_PARENT")
    private String roleParent;

    public MstRoleHdr() {
    }

    public MstRoleHdr(MstRoleHdrPK mstRoleHdrPK) {
        this.mstRoleHdrPK = mstRoleHdrPK;
    }

    public MstRoleHdr(MstRoleHdrPK mstRoleHdrPK, String roleName, String roleDescrip, String flagDefault, String flagActive, Date createdDate) {
        this.mstRoleHdrPK = mstRoleHdrPK;
        this.roleName = roleName;
        this.roleDescrip = roleDescrip;
        this.flagDefault = flagDefault;
        this.flagActive = flagActive;
        this.createdDate = createdDate;
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

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
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
        return "eintrusty.quiz.entity.MstRoleHdr[ mstRoleHdrPK=" + mstRoleHdrPK + " ]";
    }

	public String getRoleParent() {
		return roleParent;
	}

	public void setRoleParent(String roleParent) {
		this.roleParent = roleParent;
	}
    
}
