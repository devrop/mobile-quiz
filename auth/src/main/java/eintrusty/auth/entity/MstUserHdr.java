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
import javax.persistence.Lob;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import eintrusty.auth.entity.pk.MstUserHdrPK;

/**
 *
 * @author user
 */
@Entity
@Table(name = "mst_user_hdr")
@XmlRootElement
public class MstUserHdr implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MstUserHdrPK mstUserHdrPK;
    @Column(name = "USER_NAME")
    private String userName;
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
    @Column(name = "PASSWORD")
    private String password;
    @Lob
    @Column(name = "PHOTO")
    private String photo;
    @Column(name = "VERIFICATION_CODE")
    private String verificationCode;
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

    public MstUserHdr() {
    }

    public MstUserHdr(MstUserHdrPK mstUserHdrPK) {
        this.mstUserHdrPK = mstUserHdrPK;
    }

    public MstUserHdr(MstUserHdrPK mstUserHdrPK, Date createdDate) {
        this.mstUserHdrPK = mstUserHdrPK;
        this.createdDate = createdDate;
    }

    public MstUserHdr(String companyCode, String employeeCode) {
        this.mstUserHdrPK = new MstUserHdrPK(companyCode, employeeCode);
    }

    public MstUserHdrPK getMstUserHdrPK() {
        return mstUserHdrPK;
    }

    public void setMstUserHdrPK(MstUserHdrPK mstUserHdrPK) {
        this.mstUserHdrPK = mstUserHdrPK;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        return "eintrusty.quiz.entity.MstUserHdr[ mstUserHdrPK=" + mstUserHdrPK + " ]";
    }
    
}
