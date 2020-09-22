/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eintrusty.mobile.quiz.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user
 */
@Entity
@Table(name = "t_answer_student")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TAnswerStudent.findAll", query = "SELECT t FROM TAnswerStudent t")
    , @NamedQuery(name = "TAnswerStudent.findBySchoolCode", query = "SELECT t FROM TAnswerStudent t WHERE t.tAnswerStudentPK.schoolCode = :schoolCode")
    , @NamedQuery(name = "TAnswerStudent.findByStudentCode", query = "SELECT t FROM TAnswerStudent t WHERE t.tAnswerStudentPK.studentCode = :studentCode")
    , @NamedQuery(name = "TAnswerStudent.findByQuestionCode", query = "SELECT t FROM TAnswerStudent t WHERE t.tAnswerStudentPK.questionCode = :questionCode")
    , @NamedQuery(name = "TAnswerStudent.findBySeqNo", query = "SELECT t FROM TAnswerStudent t WHERE t.tAnswerStudentPK.seqNo = :seqNo")
    , @NamedQuery(name = "TAnswerStudent.findByAnswer", query = "SELECT t FROM TAnswerStudent t WHERE t.answer = :answer")
    , @NamedQuery(name = "TAnswerStudent.findByCreatedDate", query = "SELECT t FROM TAnswerStudent t WHERE t.createdDate = :createdDate")
    , @NamedQuery(name = "TAnswerStudent.findByCreatedBy", query = "SELECT t FROM TAnswerStudent t WHERE t.createdBy = :createdBy")})
public class TAnswerStudent implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TAnswerStudentPK tAnswerStudentPK;
    @Column(name = "answer")
    private String answer;
    @Column(name = "created_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Column(name = "created_by")
    private String createdBy;

    public TAnswerStudent() {
    }

    public TAnswerStudent(TAnswerStudentPK tAnswerStudentPK) {
        this.tAnswerStudentPK = tAnswerStudentPK;
    }

    public TAnswerStudent(String schoolCode, String studentCode, String questionCode, int seqNo) {
        this.tAnswerStudentPK = new TAnswerStudentPK(schoolCode, studentCode, questionCode, seqNo);
    }

    public TAnswerStudentPK getTAnswerStudentPK() {
        return tAnswerStudentPK;
    }

    public void setTAnswerStudentPK(TAnswerStudentPK tAnswerStudentPK) {
        this.tAnswerStudentPK = tAnswerStudentPK;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tAnswerStudentPK != null ? tAnswerStudentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TAnswerStudent)) {
            return false;
        }
        TAnswerStudent other = (TAnswerStudent) object;
        if ((this.tAnswerStudentPK == null && other.tAnswerStudentPK != null) || (this.tAnswerStudentPK != null && !this.tAnswerStudentPK.equals(other.tAnswerStudentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "eintrusty.mobile.quiz.TAnswerStudent[ tAnswerStudentPK=" + tAnswerStudentPK + " ]";
    }
    
}
