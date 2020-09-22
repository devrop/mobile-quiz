/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eintrusty.mobile.quiz.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author user
 */
@Embeddable
public class TQuestionHdrPK implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Basic(optional = false)
    @Column(name = "school_code")
    private String schoolCode;
    @Basic(optional = false)
    @Column(name = "question_code")
    private String questionCode;
    @Basic(optional = false)
    @Column(name = "subject_code")
    private String subjectCode;

    public TQuestionHdrPK() {
    }

    public TQuestionHdrPK(String schoolCode, String questionCode, String subjectCode) {
        this.schoolCode = schoolCode;
        this.questionCode = questionCode;
        this.subjectCode = subjectCode;
    }

    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    public String getQuestionCode() {
        return questionCode;
    }

    public void setQuestionCode(String questionCode) {
        this.questionCode = questionCode;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (schoolCode != null ? schoolCode.hashCode() : 0);
        hash += (questionCode != null ? questionCode.hashCode() : 0);
        hash += (subjectCode != null ? subjectCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TQuestionHdrPK)) {
            return false;
        }
        TQuestionHdrPK other = (TQuestionHdrPK) object;
        if ((this.schoolCode == null && other.schoolCode != null) || (this.schoolCode != null && !this.schoolCode.equals(other.schoolCode))) {
            return false;
        }
        if ((this.questionCode == null && other.questionCode != null) || (this.questionCode != null && !this.questionCode.equals(other.questionCode))) {
            return false;
        }
        if ((this.subjectCode == null && other.subjectCode != null) || (this.subjectCode != null && !this.subjectCode.equals(other.subjectCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "eintrusty.mobile.quiz.TQuestionHdrPK[ schoolCode=" + schoolCode + ", questionCode=" + questionCode + ", subjectCode=" + subjectCode + " ]";
    }
    
}
