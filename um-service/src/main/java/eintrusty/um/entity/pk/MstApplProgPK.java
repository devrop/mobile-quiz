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
public class MstApplProgPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "COMPANY_CODE")
    private String companyCode;
    @Basic(optional = false)
    @Column(name = "APPL_PROG_CODE")
    private String applProgCode;

    public MstApplProgPK() {
    }

    public MstApplProgPK(String companyCode, String applProgCode) {
        this.companyCode = companyCode;
        this.applProgCode = applProgCode;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getApplProgCode() {
        return applProgCode;
    }

    public void setApplProgCode(String applProgCode) {
        this.applProgCode = applProgCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (companyCode != null ? companyCode.hashCode() : 0);
        hash += (applProgCode != null ? applProgCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MstApplProgPK)) {
            return false;
        }
        MstApplProgPK other = (MstApplProgPK) object;
        if ((this.companyCode == null && other.companyCode != null) || (this.companyCode != null && !this.companyCode.equals(other.companyCode))) {
            return false;
        }
        if ((this.applProgCode == null && other.applProgCode != null) || (this.applProgCode != null && !this.applProgCode.equals(other.applProgCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "eintrusty.um.entity.MstApplProgPK[ companyCode=" + companyCode + ", applProgCode=" + applProgCode + " ]";
    }
    
}
