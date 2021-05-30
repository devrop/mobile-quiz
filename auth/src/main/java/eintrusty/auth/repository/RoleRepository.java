package eintrusty.auth.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import eintrusty.auth.entity.MstRoleHdr;
import eintrusty.auth.entity.pk.MstRoleHdrPK;
@Repository
public interface RoleRepository extends JpaRepository<MstRoleHdr,MstRoleHdrPK>{

	
	@Query("Select a from MstRoleHdr a, MstUserDtl b, MstUserHdr c "+ 
	      " where a.mstRoleHdrPK.companyCode = b.mstUserDtlPK.companyCode And a.mstRoleHdrPK.roleCode = b.mstUserDtlPK.roleCode "
	      + "And b.mstUserDtlPK.companyCode = c.mstUserHdrPK.companyCode "
	      + "And b.mstUserDtlPK.employeeCode = c.mstUserHdrPK.employeeCode "
	      + "And a.flagActive = '1' And c.userName =:username")
	public List<MstRoleHdr> getRoleByUserName(@Param("username") String username); 
	
}
