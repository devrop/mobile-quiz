package eintrusty.um.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import common.constant.ConsVar;
import common.model.BaseResponse;
import eintrusty.um.model.MstTransactionTypeDto;
import eintrusty.um.service.ITransactionService;

@RestController
@RequestMapping("transaction")
public class TransactionController {

	@Autowired
	private ITransactionService tranService;
	
	@GetMapping("test")
	public String getTest() {
		return "OK";
	}
	
	@PostMapping("inputTransactionType")
	public ResponseEntity<BaseResponse<String>> inputTransactionType(@RequestBody MstTransactionTypeDto request){
		int result = tranService.inputMstTransaction(request);
		BaseResponse<String> response = new BaseResponse<>();
		if(result == ConsVar.REST_STATUS_OK) {
			final String data = ConsVar.MESSAGE_STATUS_OK;
			response.setStatus(ConsVar.REST_STATUS_OK);
			response.setMessage(data);
			response.setTotalRecords(1);
			//response.setContents(data);
			
		}else {
			response.setStatus(ConsVar.REST_STATUS_ERROR);
			response.setMessage(ConsVar.MESSAGE_STATUS_ERROR);
			response.setTotalRecords(0);
		}
		return  new ResponseEntity<BaseResponse<String>>(response,HttpStatus.OK);
	} 
	
	@PostMapping("generateTrxCode")
	public ResponseEntity<BaseResponse<MstTransactionTypeDto>> generateTrxCode(@RequestBody MstTransactionTypeDto request){
		final String result = tranService.generateTrxCode(request.getTrxCode());
		BaseResponse<MstTransactionTypeDto> response = new BaseResponse<>();
		if(!result.equalsIgnoreCase("")) {
			final String data = ConsVar.MESSAGE_STATUS_OK;
			response.setStatus(ConsVar.REST_STATUS_OK);
			response.setMessage(data);
			response.setTotalRecords(1);
			response.setContents(MstTransactionTypeDto.builder().trxCode(result).build());
			
		}else {
			response.setStatus(ConsVar.REST_STATUS_ERROR);
			response.setMessage(ConsVar.MESSAGE_STATUS_ERROR);
			response.setTotalRecords(0);
		}
		return  new ResponseEntity<BaseResponse<MstTransactionTypeDto>>(response,HttpStatus.OK);
	}
	
	
	
}
