/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eintrusty.general.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import eintrusty.general.entity.pk.MstTransactionTypePK;

/**
 *
 * @author user
 */
@Entity
@Table(name = "MST_TRANSACTION_TYPE")
@XmlRootElement
@NamedStoredProcedureQueries(
		{@NamedStoredProcedureQuery(name = "MstTransactionType.generateTrxCode", 
				  procedureName = "GET_TRX_CODE", parameters = {
						    @StoredProcedureParameter(mode = ParameterMode.IN, name = "TRX_CODE_META", type = String.class),
						    @StoredProcedureParameter(mode = ParameterMode.OUT, name = "V_OUTPUT", type = String.class)}),
		
		 @NamedStoredProcedureQuery(name="MstTransactionType.inputMstTransaction",
				 procedureName = "INPUT_MST_TRANSACTION", parameters = {
						 @StoredProcedureParameter(mode = ParameterMode.IN, name = "COMPANY_CODE", type = String.class),
						 @StoredProcedureParameter(mode = ParameterMode.IN, name = "TRX_CODE", type = String.class),
						 @StoredProcedureParameter(mode = ParameterMode.IN, name = "TRX_NAME", type = String.class),
						 @StoredProcedureParameter(mode = ParameterMode.IN, name = "MODULE_NAME", type = String.class),
						 @StoredProcedureParameter(mode = ParameterMode.IN, name = "TRX_TYPE", type = String.class),
						 @StoredProcedureParameter(mode = ParameterMode.IN, name = "PREFIX", type = String.class),
						 @StoredProcedureParameter(mode = ParameterMode.IN, name = "SCALE", type = Integer.class),
						 @StoredProcedureParameter(mode = ParameterMode.IN, name = "FLAG_ACTIVE", type = Integer.class),
						 @StoredProcedureParameter(mode = ParameterMode.IN, name = "CREATED_BY", type = String.class),
						 @StoredProcedureParameter(mode = ParameterMode.OUT, name = "V_OUTPUT", type = String.class) 
				 }
				 )	
			
		}
		)


@NamedQueries({
    @NamedQuery(name = "MstTransactionType.findAll", query = "SELECT m FROM MstTransactionType m")
    , @NamedQuery(name = "MstTransactionType.findByCompanyCode", query = "SELECT m FROM MstTransactionType m WHERE m.mstTransactionTypePK.companyCode = :companyCode")
    , @NamedQuery(name = "MstTransactionType.findByTrxCode", query = "SELECT m FROM MstTransactionType m WHERE m.mstTransactionTypePK.trxCode = :trxCode")
    , @NamedQuery(name = "MstTransactionType.findByTrxName", query = "SELECT m FROM MstTransactionType m WHERE m.trxName = :trxName")
    , @NamedQuery(name = "MstTransactionType.findByModuleName", query = "SELECT m FROM MstTransactionType m WHERE m.moduleName = :moduleName")
    , @NamedQuery(name = "MstTransactionType.findByTrxType", query = "SELECT m FROM MstTransactionType m WHERE m.trxType = :trxType")
    , @NamedQuery(name = "MstTransactionType.findByPrefix", query = "SELECT m FROM MstTransactionType m WHERE m.prefix = :prefix")
    , @NamedQuery(name = "MstTransactionType.findByScale", query = "SELECT m FROM MstTransactionType m WHERE m.scale = :scale")
    , @NamedQuery(name = "MstTransactionType.findByRunCode", query = "SELECT m FROM MstTransactionType m WHERE m.runCode = :runCode")
    , @NamedQuery(name = "MstTransactionType.findByFlagActive", query = "SELECT m FROM MstTransactionType m WHERE m.flagActive = :flagActive")
    , @NamedQuery(name = "MstTransactionType.findByCreatedDate", query = "SELECT m FROM MstTransactionType m WHERE m.createdDate = :createdDate")
    , @NamedQuery(name = "MstTransactionType.findByCreatedBy", query = "SELECT m FROM MstTransactionType m WHERE m.createdBy = :createdBy")
    , @NamedQuery(name = "MstTransactionType.findByUpdateDate", query = "SELECT m FROM MstTransactionType m WHERE m.updateDate = :updateDate")
    , @NamedQuery(name = "MstTransactionType.findByUpdateBy", query = "SELECT m FROM MstTransactionType m WHERE m.updateBy = :updateBy")})
public class MstTransactionType implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MstTransactionTypePK mstTransactionTypePK;
    @Basic(optional = false)
    @Column(name = "TRX_NAME")
    private String trxName;
    @Basic(optional = false)
    @Column(name = "MODULE_NAME")
    private String moduleName;
    @Column(name = "TRX_TYPE")
    private String trxType;
    @Column(name = "PREFIX")
    private String prefix;
    @Basic(optional = false)
    @Column(name = "SCALE")
    private int scale;
    @Column(name = "RUN_CODE")
    private String runCode;
    @Basic(optional = false)
    @Column(name = "FLAG_ACTIVE")
    private int flagActive;
    @Basic(optional = false)
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Basic(optional = false)
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "UPDATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;
    @Column(name = "UPDATE_BY")
    private String updateBy;

    public MstTransactionType() {
    }

    public MstTransactionType(MstTransactionTypePK mstTransactionTypePK) {
        this.mstTransactionTypePK = mstTransactionTypePK;
    }

    public MstTransactionType(MstTransactionTypePK mstTransactionTypePK, String trxName, String moduleName, int scale, int flagActive, Date createdDate, String createdBy) {
        this.mstTransactionTypePK = mstTransactionTypePK;
        this.trxName = trxName;
        this.moduleName = moduleName;
        this.scale = scale;
        this.flagActive = flagActive;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
    }

    public MstTransactionType(String companyCode, String trxCode) {
        this.mstTransactionTypePK = new MstTransactionTypePK(companyCode, trxCode);
    }

    public MstTransactionTypePK getMstTransactionTypePK() {
        return mstTransactionTypePK;
    }

    public void setMstTransactionTypePK(MstTransactionTypePK mstTransactionTypePK) {
        this.mstTransactionTypePK = mstTransactionTypePK;
    }

    public String getTrxName() {
        return trxName;
    }

    public void setTrxName(String trxName) {
        this.trxName = trxName;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getTrxType() {
        return trxType;
    }

    public void setTrxType(String trxType) {
        this.trxType = trxType;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public int getScale() {
        return scale;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    public String getRunCode() {
        return runCode;
    }

    public void setRunCode(String runCode) {
        this.runCode = runCode;
    }

    public int getFlagActive() {
        return flagActive;
    }

    public void setFlagActive(int flagActive) {
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

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mstTransactionTypePK != null ? mstTransactionTypePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MstTransactionType)) {
            return false;
        }
        MstTransactionType other = (MstTransactionType) object;
        if ((this.mstTransactionTypePK == null && other.mstTransactionTypePK != null) || (this.mstTransactionTypePK != null && !this.mstTransactionTypePK.equals(other.mstTransactionTypePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication77.MstTransactionType[ mstTransactionTypePK=" + mstTransactionTypePK + " ]";
    }
    
}
