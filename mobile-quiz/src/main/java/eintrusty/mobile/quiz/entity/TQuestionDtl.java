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
@Table(name = "t_question_dtl")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TQuestionDtl.findAll", query = "SELECT t FROM TQuestionDtl t")
    , @NamedQuery(name = "TQuestionDtl.findBySchoolCode", query = "SELECT t FROM TQuestionDtl t WHERE t.tQuestionDtlPK.schoolCode = :schoolCode")
    , @NamedQuery(name = "TQuestionDtl.findByQuestionCode", query = "SELECT t FROM TQuestionDtl t WHERE t.tQuestionDtlPK.questionCode = :questionCode")
    , @NamedQuery(name = "TQuestionDtl.findByOptionCode", query = "SELECT t FROM TQuestionDtl t WHERE t.tQuestionDtlPK.optionCode = :optionCode")
    , @NamedQuery(name = "TQuestionDtl.findByOption", query = "SELECT t FROM TQuestionDtl t WHERE t.option = :option")
    , @NamedQuery(name = "TQuestionDtl.findByStatus", query = "SELECT t FROM TQuestionDtl t WHERE t.status = :status")
    , @NamedQuery(name = "TQuestionDtl.findByCreatedDate", query = "SELECT t FROM TQuestionDtl t WHERE t.createdDate = :createdDate")
    , @NamedQuery(name = "TQuestionDtl.findByCreatedBy", query = "SELECT t FROM TQuestionDtl t WHERE t.createdBy = :createdBy")
    , @NamedQuery(name = "TQuestionDtl.findByUpdatedDate", query = "SELECT t FROM TQuestionDtl t WHERE t.updatedDate = :updatedDate")
    , @NamedQuery(name = "TQuestionDtl.findByUpdatedBy", query = "SELECT t FROM TQuestionDtl t WHERE t.updatedBy = :updatedBy")})
public class TQuestionDtl implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TQuestionDtlPK tQuestionDtlPK;
    @Column(name = "option")
    private String option;
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

    public TQuestionDtl() {
    }

    public TQuestionDtl(TQuestionDtlPK tQuestionDtlPK) {
        this.tQuestionDtlPK = tQuestionDtlPK;
    }

    public TQuestionDtl(String schoolCode, String questionCode, String optionCode) {
        this.tQuestionDtlPK = new TQuestionDtlPK(schoolCode, questionCode, optionCode);
    }

    public TQuestionDtlPK getTQuestionDtlPK() {
        return tQuestionDtlPK;
    }

    public void setTQuestionDtlPK(TQuestionDtlPK tQuestionDtlPK) {
        this.tQuestionDtlPK = tQuestionDtlPK;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
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
        hash += (tQuestionDtlPK != null ? tQuestionDtlPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TQuestionDtl)) {
            return false;
        }
        TQuestionDtl other = (TQuestionDtl) object;
        if ((this.tQuestionDtlPK == null && other.tQuestionDtlPK != null) || (this.tQuestionDtlPK != null && !this.tQuestionDtlPK.equals(other.tQuestionDtlPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "eintrusty.mobile.quiz.TQuestionDtl[ tQuestionDtlPK=" + tQuestionDtlPK + " ]";
    }
    
}
