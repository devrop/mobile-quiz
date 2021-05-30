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
public class MstRoleDtlPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "COMPANY_CODE")
    private String companyCode;
    @Basic(optional = false)
    @Column(name = "ROLE_CODE")
    private String roleCode;
    @Basic(optional = false)
    @Column(name = "MENU_CODE")
    private String menuCode;
    @Basic(optional = false)
    @Column(name = "ACTION_NAME")
    private String actionName;

    public MstRoleDtlPK() {
    }

    public MstRoleDtlPK(String companyCode, String roleCode, String menuCode, String actionName) {
        this.companyCode = companyCode;
        this.roleCode = roleCode;
        this.menuCode = menuCode;
        this.actionName = actionName;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (companyCode != null ? companyCode.hashCode() : 0);
        hash += (roleCode != null ? roleCode.hashCode() : 0);
        hash += (menuCode != null ? menuCode.hashCode() : 0);
        hash += (actionName != null ? actionName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MstRoleDtlPK)) {
            return false;
        }
        MstRoleDtlPK other = (MstRoleDtlPK) object;
        if ((this.companyCode == null && other.companyCode != null) || (this.companyCode != null && !this.companyCode.equals(other.companyCode))) {
            return false;
        }
        if ((this.roleCode == null && other.roleCode != null) || (this.roleCode != null && !this.roleCode.equals(other.roleCode))) {
            return false;
        }
        if ((this.menuCode == null && other.menuCode != null) || (this.menuCode != null && !this.menuCode.equals(other.menuCode))) {
            return false;
        }
        if ((this.actionName == null && other.actionName != null) || (this.actionName != null && !this.actionName.equals(other.actionName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "eintrusty.um.entity.MstRoleDtlPK[ companyCode=" + companyCode + ", roleCode=" + roleCode + ", menuCode=" + menuCode + ", actionName=" + actionName + " ]";
    }
    
}
