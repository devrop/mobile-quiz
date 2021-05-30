package eintrusty.general.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import common.constant.ConsVar;
import common.util.StringUtil;
import eintrusty.general.model.MstTransactionTypeDto;
import eintrusty.general.repository.MstTransactionTypeRepo;
import eintrusty.general.service.ITransactionService;
@Service
@Transactional
public class TransactionTypeService implements ITransactionService {

	@Autowired
	private MstTransactionTypeRepo transactionRepo;
	
	@Override
	public int inputMstTransaction(MstTransactionTypeDto dto) {
		// TODO Auto-generated method stub
		try {
		final int result = transactionRepo.inputMstTransaction(dto.getCompanyCode(), dto.getTrxCode(), dto.getTrxName(), dto.getModuleName(), dto.getTrxType(), dto.getPrefix(), dto.getScale(), dto.getFlagActive(), dto.getCreatedBy());
		if(result ==1) {
			return ConsVar.REST_STATUS_OK;
		}else {
			return ConsVar.REST_STATUS_ERROR;
		}
		
		
		}catch(Exception e) {
			System.out.println("e " +e.getMessage());
		  return ConsVar.REST_STATUS_ERROR;
		}
		
	}

	@Override
	public String generateTrxCode(String trxCode) {
		// TODO Auto-generated method stub
		final String result = transactionRepo.generateTrxCode(trxCode);
		return StringUtil.notNull(result);
	}

}
