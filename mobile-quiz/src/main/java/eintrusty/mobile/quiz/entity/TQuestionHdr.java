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
import javax.persistence.Lob;
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
@Table(name = "t_question_hdr")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TQuestionHdr.findAll", query = "SELECT t FROM TQuestionHdr t")
    , @NamedQuery(name = "TQuestionHdr.findBySchoolCode", query = "SELECT t FROM TQuestionHdr t WHERE t.tQuestionHdrPK.schoolCode = :schoolCode")
    , @NamedQuery(name = "TQuestionHdr.findByQuestionCode", query = "SELECT t FROM TQuestionHdr t WHERE t.tQuestionHdrPK.questionCode = :questionCode")
    , @NamedQuery(name = "TQuestionHdr.findBySubjectCode", query = "SELECT t FROM TQuestionHdr t WHERE t.tQuestionHdrPK.subjectCode = :subjectCode")
    , @NamedQuery(name = "TQuestionHdr.findByQuestion", query = "SELECT t FROM TQuestionHdr t WHERE t.question = :question")
    , @NamedQuery(name = "TQuestionHdr.findByCorrectAnswer", query = "SELECT t FROM TQuestionHdr t WHERE t.correctAnswer = :correctAnswer")
    , @NamedQuery(name = "TQuestionHdr.findByLevel", query = "SELECT t FROM TQuestionHdr t WHERE t.level = :level")
    , @NamedQuery(name = "TQuestionHdr.findByPackageCode", query = "SELECT t FROM TQuestionHdr t WHERE t.packageCode = :packageCode")
    , @NamedQuery(name = "TQuestionHdr.findByStatus", query = "SELECT t FROM TQuestionHdr t WHERE t.status = :status")
    , @NamedQuery(name = "TQuestionHdr.findByCreatedDate", query = "SELECT t FROM TQuestionHdr t WHERE t.createdDate = :createdDate")
    , @NamedQuery(name = "TQuestionHdr.findByCreatedBy", query = "SELECT t FROM TQuestionHdr t WHERE t.createdBy = :createdBy")
    , @NamedQuery(name = "TQuestionHdr.findByUpdatedDate", query = "SELECT t FROM TQuestionHdr t WHERE t.updatedDate = :updatedDate")
    , @NamedQuery(name = "TQuestionHdr.findByUpdatedBy", query = "SELECT t FROM TQuestionHdr t WHERE t.updatedBy = :updatedBy")})
public class TQuestionHdr implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TQuestionHdrPK tQuestionHdrPK;
    @Column(name = "question")
    private String question;
    @Column(name = "correct_answer")
    private String correctAnswer;
    @Column(name = "level")
    private String level;
    @Column(name = "package_code")
    private String packageCode;
    @Column(name = "status")
    private Integer status;
    @Column(name = "created_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "updated_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedDate;
    @Column(name = "updated_by")
    private String updatedBy;
    @Lob
    @Column(name = "image")
    private byte[] image;

    public TQuestionHdr() {
    }

    public TQuestionHdr(TQuestionHdrPK tQuestionHdrPK) {
        this.tQuestionHdrPK = tQuestionHdrPK;
    }

    public TQuestionHdr(String schoolCode, String questionCode, String subjectCode) {
        this.tQuestionHdrPK = new TQuestionHdrPK(schoolCode, questionCode, subjectCode);
    }

    public TQuestionHdrPK getTQuestionHdrPK() {
        return tQuestionHdrPK;
    }

    public void setTQuestionHdrPK(TQuestionHdrPK tQuestionHdrPK) {
        this.tQuestionHdrPK = tQuestionHdrPK;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPackageCode() {
        return packageCode;
    }

    public void setPackageCode(String packageCode) {
        this.packageCode = packageCode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
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

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tQuestionHdrPK != null ? tQuestionHdrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TQuestionHdr)) {
            return false;
        }
        TQuestionHdr other = (TQuestionHdr) object;
        if ((this.tQuestionHdrPK == null && other.tQuestionHdrPK != null) || (this.tQuestionHdrPK != null && !this.tQuestionHdrPK.equals(other.tQuestionHdrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "eintrusty.mobile.quiz.TQuestionHdr[ tQuestionHdrPK=" + tQuestionHdrPK + " ]";
    }
    
}
