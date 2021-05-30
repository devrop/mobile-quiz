package eintrusty.general.service;

import eintrusty.general.model.MstTransactionTypeDto;

public interface ITransactionService {

	public int inputMstTransaction(MstTransactionTypeDto dto);
	
	public String generateTrxCode(String trxCode);
	
	
}
