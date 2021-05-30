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
public class MstUserDtlPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "COMPANY_CODE")
    private String companyCode;
    @Basic(optional = false)
    @Column(name = "EMPLOYEE_CODE")
    private String employeeCode;
    @Basic(optional = false)
    @Column(name = "ROLE_CODE")
    private String roleCode;

    public MstUserDtlPK() {
    }

    public MstUserDtlPK(String companyCode, String employeeCode, String roleCode) {
        this.companyCode = companyCode;
        this.employeeCode = employeeCode;
        this.roleCode = roleCode;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (companyCode != null ? companyCode.hashCode() : 0);
        hash += (employeeCode != null ? employeeCode.hashCode() : 0);
        hash += (roleCode != null ? roleCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MstUserDtlPK)) {
            return false;
        }
        MstUserDtlPK other = (MstUserDtlPK) object;
        if ((this.companyCode == null && other.companyCode != null) || (this.companyCode != null && !this.companyCode.equals(other.companyCode))) {
            return false;
        }
        if ((this.employeeCode == null && other.employeeCode != null) || (this.employeeCode != null && !this.employeeCode.equals(other.employeeCode))) {
            return false;
        }
        if ((this.roleCode == null && other.roleCode != null) || (this.roleCode != null && !this.roleCode.equals(other.roleCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "eintrusty.um.entity.MstUserDtlPK[ companyCode=" + companyCode + ", employeeCode=" + employeeCode + ", roleCode=" + roleCode + " ]";
    }
    
}
