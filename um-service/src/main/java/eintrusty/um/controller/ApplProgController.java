package eintrusty.um.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import common.constant.ConsVar;
import common.model.BaseResponse;
import eintrusty.um.model.MstApplProgDto;
import eintrusty.um.service.IApplProgService;
import eintrusty.um.service.impl.ApplProgService;

@RestController
@RequestMapping("applProg")
public class ApplProgController {

	@Autowired
	private IApplProgService applProgService;
	
	@PostMapping("save")
	public ResponseEntity<BaseResponse<Integer>> save(@RequestBody MstApplProgDto request){
		BaseResponse<Integer> response = new BaseResponse<>();
		try {
			int result = applProgService.save(request);
			response.setStatus(ConsVar.REST_STATUS_OK);
			response.setTotalRecords(1);
			response.setMessage(ConsVar.MESSAGE_STATUS_OK);
			response.setContents(result);
			
			return new ResponseEntity<BaseResponse<Integer>>(response,HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<BaseResponse<Integer>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
	} 
	
}
