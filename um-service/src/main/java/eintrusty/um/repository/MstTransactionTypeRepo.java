package eintrusty.um.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import eintrusty.um.entity.MstTransactionType;
import eintrusty.um.entity.pk.MstTransactionTypePK;

@Repository
public interface MstTransactionTypeRepo extends JpaRepository<MstTransactionType,MstTransactionTypePK> {

	@Procedure(name = "MstTransactionType.generateTrxCode")
	public String generateTrxCode(@Param("TRX_CODE_META") String trxCode);
	
	@Procedure(name = "MstTransactionType.inputMstTransaction")
	public Integer inputMstTransaction(
			@Param("COMPANY_CODE") String companyCode,
			@Param("TRX_CODE") String trxCode,
			@Param("TRX_NAME") String trxName,
			@Param("MODULE_NAME") String moduleName,
			@Param("TRX_TYPE") String trxType,
			@Param("PREFIX") String prefix,
			@Param("SCALE") Integer scale,
			@Param("FLAG_ACTIVE") Integer flagActive,
			@Param("CREATED_BY") String createdBy
			);
}
