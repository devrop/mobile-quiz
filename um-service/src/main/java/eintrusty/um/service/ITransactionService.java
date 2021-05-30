package eintrusty.um.service;

import eintrusty.um.model.MstTransactionTypeDto;

public interface ITransactionService {

	public int inputMstTransaction(MstTransactionTypeDto dto);
	
	public String generateTrxCode(String trxCode);
	
	
}
