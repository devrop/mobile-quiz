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

import eintrusty.um.entity.pk.MstRoleDtlPK;

/**
 *
 * @author user
 */
@Entity
@Table(name = "MST_ROLE_DTL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MstRoleDtl.findAll", query = "SELECT m FROM MstRoleDtl m")
    , @NamedQuery(name = "MstRoleDtl.findByCompanyCode", query = "SELECT m FROM MstRoleDtl m WHERE m.mstRoleDtlPK.companyCode = :companyCode")
    , @NamedQuery(name = "MstRoleDtl.findByRoleCode", query = "SELECT m FROM MstRoleDtl m WHERE m.mstRoleDtlPK.roleCode = :roleCode")
    , @NamedQuery(name = "MstRoleDtl.findByMenuCode", query = "SELECT m FROM MstRoleDtl m WHERE m.mstRoleDtlPK.menuCode = :menuCode")
    , @NamedQuery(name = "MstRoleDtl.findByActionName", query = "SELECT m FROM MstRoleDtl m WHERE m.mstRoleDtlPK.actionName = :actionName")
    , @NamedQuery(name = "MstRoleDtl.findByCreatedDate", query = "SELECT m FROM MstRoleDtl m WHERE m.createdDate = :createdDate")
    , @NamedQuery(name = "MstRoleDtl.findByCreatedBy", query = "SELECT m FROM MstRoleDtl m WHERE m.createdBy = :createdBy")
    , @NamedQuery(name = "MstRoleDtl.findByUpdatedDate", query = "SELECT m FROM MstRoleDtl m WHERE m.updatedDate = :updatedDate")
    , @NamedQuery(name = "MstRoleDtl.findByUpdatedBy", query = "SELECT m FROM MstRoleDtl m WHERE m.updatedBy = :updatedBy")})
public class MstRoleDtl implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MstRoleDtlPK mstRoleDtlPK;
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

    public MstRoleDtl() {
    }

    public MstRoleDtl(MstRoleDtlPK mstRoleDtlPK) {
        this.mstRoleDtlPK = mstRoleDtlPK;
    }

    public MstRoleDtl(MstRoleDtlPK mstRoleDtlPK, Date createdDate, String createdBy) {
        this.mstRoleDtlPK = mstRoleDtlPK;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
    }

    public MstRoleDtl(String companyCode, String roleCode, String menuCode, String actionName) {
        this.mstRoleDtlPK = new MstRoleDtlPK(companyCode, roleCode, menuCode, actionName);
    }

    public MstRoleDtlPK getMstRoleDtlPK() {
        return mstRoleDtlPK;
    }

    public void setMstRoleDtlPK(MstRoleDtlPK mstRoleDtlPK) {
        this.mstRoleDtlPK = mstRoleDtlPK;
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
        hash += (mstRoleDtlPK != null ? mstRoleDtlPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MstRoleDtl)) {
            return false;
        }
        MstRoleDtl other = (MstRoleDtl) object;
        if ((this.mstRoleDtlPK == null && other.mstRoleDtlPK != null) || (this.mstRoleDtlPK != null && !this.mstRoleDtlPK.equals(other.mstRoleDtlPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "eintrusty.um.entity.MstRoleDtl[ mstRoleDtlPK=" + mstRoleDtlPK + " ]";
    }
    
}
