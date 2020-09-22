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
public class TAnswerStudentPK implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Basic(optional = false)
    @Column(name = "school_code")
    private String schoolCode;
    @Basic(optional = false)
    @Column(name = "student_code")
    private String studentCode;
    @Basic(optional = false)
    @Column(name = "question_code")
    private String questionCode;
    @Basic(optional = false)
    @Column(name = "seq_no")
    private int seqNo;

    public TAnswerStudentPK() {
    }

    public TAnswerStudentPK(String schoolCode, String studentCode, String questionCode, int seqNo) {
        this.schoolCode = schoolCode;
        this.studentCode = studentCode;
        this.questionCode = questionCode;
        this.seqNo = seqNo;
    }

    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getQuestionCode() {
        return questionCode;
    }

    public void setQuestionCode(String questionCode) {
        this.questionCode = questionCode;
    }

    public int getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(int seqNo) {
        this.seqNo = seqNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (schoolCode != null ? schoolCode.hashCode() : 0);
        hash += (studentCode != null ? studentCode.hashCode() : 0);
        hash += (questionCode != null ? questionCode.hashCode() : 0);
        hash += (int) seqNo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TAnswerStudentPK)) {
            return false;
        }
        TAnswerStudentPK other = (TAnswerStudentPK) object;
        if ((this.schoolCode == null && other.schoolCode != null) || (this.schoolCode != null && !this.schoolCode.equals(other.schoolCode))) {
            return false;
        }
        if ((this.studentCode == null && other.studentCode != null) || (this.studentCode != null && !this.studentCode.equals(other.studentCode))) {
            return false;
        }
        if ((this.questionCode == null && other.questionCode != null) || (this.questionCode != null && !this.questionCode.equals(other.questionCode))) {
            return false;
        }
        if (this.seqNo != other.seqNo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "eintrusty.mobile.quiz.TAnswerStudentPK[ schoolCode=" + schoolCode + ", studentCode=" + studentCode + ", questionCode=" + questionCode + ", seqNo=" + seqNo + " ]";
    }
    
}
