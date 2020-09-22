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
public class TQuestionDtlPK implements Serializable {

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
    @Column(name = "option_code")
    private String optionCode;

    public TQuestionDtlPK() {
    }

    public TQuestionDtlPK(String schoolCode, String questionCode, String optionCode) {
        this.schoolCode = schoolCode;
        this.questionCode = questionCode;
        this.optionCode = optionCode;
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

    public String getOptionCode() {
        return optionCode;
    }

    public void setOptionCode(String optionCode) {
        this.optionCode = optionCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (schoolCode != null ? schoolCode.hashCode() : 0);
        hash += (questionCode != null ? questionCode.hashCode() : 0);
        hash += (optionCode != null ? optionCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TQuestionDtlPK)) {
            return false;
        }
        TQuestionDtlPK other = (TQuestionDtlPK) object;
        if ((this.schoolCode == null && other.schoolCode != null) || (this.schoolCode != null && !this.schoolCode.equals(other.schoolCode))) {
            return false;
        }
        if ((this.questionCode == null && other.questionCode != null) || (this.questionCode != null && !this.questionCode.equals(other.questionCode))) {
            return false;
        }
        if ((this.optionCode == null && other.optionCode != null) || (this.optionCode != null && !this.optionCode.equals(other.optionCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "eintrusty.mobile.quiz.TQuestionDtlPK[ schoolCode=" + schoolCode + ", questionCode=" + questionCode + ", optionCode=" + optionCode + " ]";
    }
    
}
