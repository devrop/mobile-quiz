/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eintrusty.um.entity.pk;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author user
 */
@Embeddable
public class MstTransactionTypePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "COMPANY_CODE")
    private String companyCode;
    @Basic(optional = false)
    @Column(name = "TRX_CODE")
    private String trxCode;

    public MstTransactionTypePK() {
    }

    public MstTransactionTypePK(String companyCode, String trxCode) {
        this.companyCode = companyCode;
        this.trxCode = trxCode;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getTrxCode() {
        return trxCode;
    }

    public void setTrxCode(String trxCode) {
        this.trxCode = trxCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (companyCode != null ? companyCode.hashCode() : 0);
        hash += (trxCode != null ? trxCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MstTransactionTypePK)) {
            return false;
        }
        MstTransactionTypePK other = (MstTransactionTypePK) object;
        if ((this.companyCode == null && other.companyCode != null) || (this.companyCode != null && !this.companyCode.equals(other.companyCode))) {
            return false;
        }
        if ((this.trxCode == null && other.trxCode != null) || (this.trxCode != null && !this.trxCode.equals(other.trxCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication77.MstTransactionTypePK[ companyCode=" + companyCode + ", trxCode=" + trxCode + " ]";
    }
    
}
