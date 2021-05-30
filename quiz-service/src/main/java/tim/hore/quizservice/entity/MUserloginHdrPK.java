/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tim.hore.quizservice.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Builder;

/**
 *
 * @author user
 */
@Embeddable
@Builder
public class MUserloginHdrPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "school_code")
    private String schoolCode;
    @Basic(optional = false)
    @Column(name = "login_code")
    private String loginCode;

    public MUserloginHdrPK() {
    }

    public MUserloginHdrPK(String schoolCode, String loginCode) {
        this.schoolCode = schoolCode;
        this.loginCode = loginCode;
    }

    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    public String getLoginCode() {
        return loginCode;
    }

    public void setLoginCode(String loginCode) {
        this.loginCode = loginCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (schoolCode != null ? schoolCode.hashCode() : 0);
        hash += (loginCode != null ? loginCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MUserloginHdrPK)) {
            return false;
        }
        MUserloginHdrPK other = (MUserloginHdrPK) object;
        if ((this.schoolCode == null && other.schoolCode != null) || (this.schoolCode != null && !this.schoolCode.equals(other.schoolCode))) {
            return false;
        }
        if ((this.loginCode == null && other.loginCode != null) || (this.loginCode != null && !this.loginCode.equals(other.loginCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "eintrusty.mobile.quiz.MUserloginHdrPK[ schoolCode=" + schoolCode + ", loginCode=" + loginCode + " ]";
    }
    
}
