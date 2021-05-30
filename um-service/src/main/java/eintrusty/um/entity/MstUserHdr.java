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

import eintrusty.um.entity.pk.MstUserHdrPK;

/**
 *
 * @author user
 */
@Entity
@Table(name = "MST_USER_HDR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MstUserHdr.findAll", query = "SELECT m FROM MstUserHdr m")
    , @NamedQuery(name = "MstUserHdr.findByCompanyCode", query = "SELECT m FROM MstUserHdr m WHERE m.mstUserHdrPK.companyCode = :companyCode")
    , @NamedQuery(name = "MstUserHdr.findByEmployeeCode", query = "SELECT m FROM MstUserHdr m WHERE m.mstUserHdrPK.employeeCode = :employeeCode")
    , @NamedQuery(name = "MstUserHdr.findByUserName", query = "SELECT m FROM MstUserHdr m WHERE m.mstUserHdrPK.userName = :userName")
    , @NamedQuery(name = "MstUserHdr.findByPassword", query = "SELECT m FROM MstUserHdr m WHERE m.password = :password")
    , @NamedQuery(name = "MstUserHdr.findByDefaultBranchCode", query = "SELECT m FROM MstUserHdr m WHERE m.defaultBranchCode = :defaultBranchCode")
    , @NamedQuery(name = "MstUserHdr.findBySubBranchCode", query = "SELECT m FROM MstUserHdr m WHERE m.subBranchCode = :subBranchCode")
    , @NamedQuery(name = "MstUserHdr.findByPreferedLocale", query = "SELECT m FROM MstUserHdr m WHERE m.preferedLocale = :preferedLocale")
    , @NamedQuery(name = "MstUserHdr.findByLevelBgtType", query = "SELECT m FROM MstUserHdr m WHERE m.levelBgtType = :levelBgtType")
    , @NamedQuery(name = "MstUserHdr.findByLevelBgtCode", query = "SELECT m FROM MstUserHdr m WHERE m.levelBgtCode = :levelBgtCode")
    , @NamedQuery(name = "MstUserHdr.findByPhoto", query = "SELECT m FROM MstUserHdr m WHERE m.photo = :photo")
    , @NamedQuery(name = "MstUserHdr.findByVerificationCode", query = "SELECT m FROM MstUserHdr m WHERE m.verificationCode = :verificationCode")
    , @NamedQuery(name = "MstUserHdr.findByFlagActive", query = "SELECT m FROM MstUserHdr m WHERE m.flagActive = :flagActive")
    , @NamedQuery(name = "MstUserHdr.findByCreatedDate", query = "SELECT m FROM MstUserHdr m WHERE m.createdDate = :createdDate")
    , @NamedQuery(name = "MstUserHdr.findByCreatedBy", query = "SELECT m FROM MstUserHdr m WHERE m.createdBy = :createdBy")
    , @NamedQuery(name = "MstUserHdr.findByUpdatedDate", query = "SELECT m FROM MstUserHdr m WHERE m.updatedDate = :updatedDate")
    , @NamedQuery(name = "MstUserHdr.findByUpdatedBy", query = "SELECT m FROM MstUserHdr m WHERE m.updatedBy = :updatedBy")})
public class MstUserHdr implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MstUserHdrPK mstUserHdrPK;
    @Basic(optional = false)
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "DEFAULT_BRANCH_CODE")
    private String defaultBranchCode;
    @Column(name = "SUB_BRANCH_CODE")
    private String subBranchCode;
    @Column(name = "PREFERED_LOCALE")
    private String preferedLocale;
    @Column(name = "LEVEL_BGT_TYPE")
    private String levelBgtType;
    @Column(name = "LEVEL_BGT_CODE")
    private String levelBgtCode;
    @Column(name = "PHOTO")
    private String photo;
    @Column(name = "VERIFICATION_CODE")
    private String verificationCode;
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

    public MstUserHdr() {
    }

    public MstUserHdr(MstUserHdrPK mstUserHdrPK) {
        this.mstUserHdrPK = mstUserHdrPK;
    }

    public MstUserHdr(MstUserHdrPK mstUserHdrPK, String password, String flagActive, Date createdDate, String createdBy) {
        this.mstUserHdrPK = mstUserHdrPK;
        this.password = password;
        this.flagActive = flagActive;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
    }

    public MstUserHdr(String companyCode, String employeeCode, String userName) {
        this.mstUserHdrPK = new MstUserHdrPK(companyCode, employeeCode, userName);
    }

    public MstUserHdrPK getMstUserHdrPK() {
        return mstUserHdrPK;
    }

    public void setMstUserHdrPK(MstUserHdrPK mstUserHdrPK) {
        this.mstUserHdrPK = mstUserHdrPK;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDefaultBranchCode() {
        return defaultBranchCode;
    }

    public void setDefaultBranchCode(String defaultBranchCode) {
        this.defaultBranchCode = defaultBranchCode;
    }

    public String getSubBranchCode() {
        return subBranchCode;
    }

    public void setSubBranchCode(String subBranchCode) {
        this.subBranchCode = subBranchCode;
    }

    public String getPreferedLocale() {
        return preferedLocale;
    }

    public void setPreferedLocale(String preferedLocale) {
        this.preferedLocale = preferedLocale;
    }

    public String getLevelBgtType() {
        return levelBgtType;
    }

    public void setLevelBgtType(String levelBgtType) {
        this.levelBgtType = levelBgtType;
    }

    public String getLevelBgtCode() {
        return levelBgtCode;
    }

    public void setLevelBgtCode(String levelBgtCode) {
        this.levelBgtCode = levelBgtCode;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
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
        hash += (mstUserHdrPK != null ? mstUserHdrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MstUserHdr)) {
            return false;
        }
        MstUserHdr other = (MstUserHdr) object;
        if ((this.mstUserHdrPK == null && other.mstUserHdrPK != null) || (this.mstUserHdrPK != null && !this.mstUserHdrPK.equals(other.mstUserHdrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "eintrusty.um.entity.MstUserHdr[ mstUserHdrPK=" + mstUserHdrPK + " ]";
    }
    
}
