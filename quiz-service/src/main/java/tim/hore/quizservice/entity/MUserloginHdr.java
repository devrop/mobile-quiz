/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tim.hore.quizservice.entity;

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

import lombok.AllArgsConstructor;
import lombok.Builder;

/**
 *
 * @author Ropandi, A.
 */
@Entity
@Table(name = "m_userlogin_hdr")
@XmlRootElement
@Builder
@AllArgsConstructor
public class MUserloginHdr implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MUserloginHdrPK mUserloginHdrPK;
    @Basic(optional = false)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Column(name = "verification_code")
    private String verificationCode;
    @Column(name = "image")
    private String image;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @Column(name = "created_date")
    @Temporal(TemporalType.DATE)
    private Date createdDate;
    @Basic(optional = false)
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "updated_date")
    @Temporal(TemporalType.DATE)
    private Date updatedDate;
    @Column(name = "updated_by")
    private String updatedBy;

    public MUserloginHdr() {
    }

    public MUserloginHdr(MUserloginHdrPK mUserloginHdrPK) {
        this.mUserloginHdrPK = mUserloginHdrPK;
    }

    public MUserloginHdr(MUserloginHdrPK mUserloginHdrPK, String username, String password, String status, Date createdDate, String createdBy) {
        this.mUserloginHdrPK = mUserloginHdrPK;
        this.username = username;
        this.password = password;
        this.status = status;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
    }

    public MUserloginHdr(String schoolCode, String loginCode) {
        this.mUserloginHdrPK = new MUserloginHdrPK(schoolCode, loginCode);
    }

    public MUserloginHdrPK getMUserloginHdrPK() {
        return mUserloginHdrPK;
    }

    public void setMUserloginHdrPK(MUserloginHdrPK mUserloginHdrPK) {
        this.mUserloginHdrPK = mUserloginHdrPK;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        hash += (mUserloginHdrPK != null ? mUserloginHdrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MUserloginHdr)) {
            return false;
        }
        MUserloginHdr other = (MUserloginHdr) object;
        if ((this.mUserloginHdrPK == null && other.mUserloginHdrPK != null) || (this.mUserloginHdrPK != null && !this.mUserloginHdrPK.equals(other.mUserloginHdrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "eintrusty.mobile.quiz.MUserloginHdr[ mUserloginHdrPK=" + mUserloginHdrPK + " ]";
    }
    
}
