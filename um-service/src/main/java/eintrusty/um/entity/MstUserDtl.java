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

import eintrusty.um.entity.pk.MstUserDtlPK;

/**
 *
 * @author user
 */
@Entity
@Table(name = "MST_USER_DTL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MstUserDtl.findAll", query = "SELECT m FROM MstUserDtl m")
    , @NamedQuery(name = "MstUserDtl.findByCompanyCode", query = "SELECT m FROM MstUserDtl m WHERE m.mstUserDtlPK.companyCode = :companyCode")
    , @NamedQuery(name = "MstUserDtl.findByEmployeeCode", query = "SELECT m FROM MstUserDtl m WHERE m.mstUserDtlPK.employeeCode = :employeeCode")
    , @NamedQuery(name = "MstUserDtl.findByRoleCode", query = "SELECT m FROM MstUserDtl m WHERE m.mstUserDtlPK.roleCode = :roleCode")
    , @NamedQuery(name = "MstUserDtl.findByBranchCode", query = "SELECT m FROM MstUserDtl m WHERE m.branchCode = :branchCode")
    , @NamedQuery(name = "MstUserDtl.findByStartDate", query = "SELECT m FROM MstUserDtl m WHERE m.startDate = :startDate")
    , @NamedQuery(name = "MstUserDtl.findByEndDate", query = "SELECT m FROM MstUserDtl m WHERE m.endDate = :endDate")
    , @NamedQuery(name = "MstUserDtl.findByApplProgCode", query = "SELECT m FROM MstUserDtl m WHERE m.applProgCode = :applProgCode")
    , @NamedQuery(name = "MstUserDtl.findByLevelType", query = "SELECT m FROM MstUserDtl m WHERE m.levelType = :levelType")
    , @NamedQuery(name = "MstUserDtl.findByCreatedDate", query = "SELECT m FROM MstUserDtl m WHERE m.createdDate = :createdDate")
    , @NamedQuery(name = "MstUserDtl.findByCreatedBy", query = "SELECT m FROM MstUserDtl m WHERE m.createdBy = :createdBy")
    , @NamedQuery(name = "MstUserDtl.findByUpdatedDate", query = "SELECT m FROM MstUserDtl m WHERE m.updatedDate = :updatedDate")
    , @NamedQuery(name = "MstUserDtl.findByUpdatedBy", query = "SELECT m FROM MstUserDtl m WHERE m.updatedBy = :updatedBy")})
public class MstUserDtl implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MstUserDtlPK mstUserDtlPK;
    @Column(name = "BRANCH_CODE")
    private String branchCode;
    @Column(name = "START_DATE")
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Column(name = "END_DATE")
    @Temporal(TemporalType.DATE)
    private Date endDate;
    @Column(name = "APPL_PROG_CODE")
    private String applProgCode;
    @Column(name = "LEVEL_TYPE")
    private String levelType;
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

    public MstUserDtl() {
    }

    public MstUserDtl(MstUserDtlPK mstUserDtlPK) {
        this.mstUserDtlPK = mstUserDtlPK;
    }

    public MstUserDtl(MstUserDtlPK mstUserDtlPK, Date createdDate, String createdBy) {
        this.mstUserDtlPK = mstUserDtlPK;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
    }

    public MstUserDtl(String companyCode, String employeeCode, String roleCode) {
        this.mstUserDtlPK = new MstUserDtlPK(companyCode, employeeCode, roleCode);
    }

    public MstUserDtlPK getMstUserDtlPK() {
        return mstUserDtlPK;
    }

    public void setMstUserDtlPK(MstUserDtlPK mstUserDtlPK) {
        this.mstUserDtlPK = mstUserDtlPK;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getApplProgCode() {
        return applProgCode;
    }

    public void setApplProgCode(String applProgCode) {
        this.applProgCode = applProgCode;
    }

    public String getLevelType() {
        return levelType;
    }

    public void setLevelType(String levelType) {
        this.levelType = levelType;
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
        hash += (mstUserDtlPK != null ? mstUserDtlPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MstUserDtl)) {
            return false;
        }
        MstUserDtl other = (MstUserDtl) object;
        if ((this.mstUserDtlPK == null && other.mstUserDtlPK != null) || (this.mstUserDtlPK != null && !this.mstUserDtlPK.equals(other.mstUserDtlPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "eintrusty.um.entity.MstUserDtl[ mstUserDtlPK=" + mstUserDtlPK + " ]";
    }
    
}
