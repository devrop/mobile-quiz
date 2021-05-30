package eintrusty.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import common.constant.ConsVar;
import common.model.AccessTokenModel;
import common.model.BaseResponse;
import common.util.StringUtil;
import eintrusty.auth.model.UserLogin;
import eintrusty.auth.model.UserLoginRequest;
import eintrusty.auth.service.ILoginService;
import eintrusty.auth.service.ITokenService;

@RestController
@RequestMapping("auth")
public class AuthController {

	@Autowired
	private ILoginService loginService;
	
	@Autowired
	private ITokenService tokenService;
	// start login for Zk project
	@PostMapping("login")
	public ResponseEntity<BaseResponse<UserLogin>> login(@RequestBody UserLoginRequest request){
		BaseResponse<UserLogin> response = new BaseResponse<>();
		UserLogin login = loginService.login(request);
		if(login !=null) {
			response.setStatus(ConsVar.REST_STATUS_OK);
			response.setMessage(ConsVar.MESSAGE_STATUS_OK);
			response.setTotalRecords(1);
			response.setContents(login);
		}else {
			
			response.setStatus(ConsVar.REST_STATUS_ERROR);
			response.setMessage(ConsVar.MESSAGE_STATUS_ERROR);
			response.setTotalRecords(0);
		}
		return new ResponseEntity<BaseResponse<UserLogin>>(response,HttpStatus.OK);
		
	}
	//end login for Zk project
	
	@PostMapping("validateToken")
	public ResponseEntity<BaseResponse<String>> validateToken(@RequestBody UserLogin request){
		final String token = request.getToken() ==null? "" : request.getToken();
		boolean isValid = tokenService.verifyToken(token);
		BaseResponse<String> response = new BaseResponse<>();
		if(isValid) {
			final String data = ConsVar.MESSAGE_STATUS_OK;
			response.setStatus(ConsVar.REST_STATUS_OK);
			response.setMessage(ConsVar.MESSAGE_STATUS_VALID);
			response.setTotalRecords(1);
			response.setContents(data);
			
		}else {
			response.setStatus(ConsVar.REST_STATUS_ERROR);
			response.setMessage(ConsVar.MESSAGE_STATUS_NOT_VALID);
			response.setTotalRecords(1);
		}
		return  new ResponseEntity<BaseResponse<String>>(response,HttpStatus.OK);
	} 
	@PostMapping("getToken")
	public ResponseEntity<BaseResponse<String>> getToken(@RequestBody UserLoginRequest request){
		BaseResponse<String> response = new BaseResponse<>();
		final String username = StringUtil.notNull(request.getUsername());
		final String password = StringUtil.notNull(request.getPassword());
		final String token = tokenService.getToken(username, password);
		if(!token.equals("")) {
			response.setStatus(ConsVar.REST_STATUS_OK);
			response.setMessage(ConsVar.MESSAGE_STATUS_OK);
			response.setTotalRecords(1);
			response.setContents(token);
		}else {
			
			response.setStatus(ConsVar.REST_STATUS_ERROR);
			response.setMessage(ConsVar.MESSAGE_STATUS_ERROR);
			response.setTotalRecords(0);
		}
		return new ResponseEntity<BaseResponse<String>>(response,HttpStatus.OK);
		
	}
	@PostMapping("getTokenService")
	public ResponseEntity<AccessTokenModel> getTokenService(@RequestBody AccessTokenModel request){
		AccessTokenModel tokenResponse = new AccessTokenModel();
		final String id = StringUtil.notNull(request.getId());
		final String secretKey = StringUtil.notNull(request.getSecretKey());
		final String token = tokenService.getTokenMicroService(id, secretKey);
		if(!token.equals("")) {
			tokenResponse.setId(id);
			tokenResponse.setToken(token);
			return new ResponseEntity<AccessTokenModel>(tokenResponse, HttpStatus.OK);
		}else {
			return new ResponseEntity<AccessTokenModel>(tokenResponse,HttpStatus.UNAUTHORIZED);
		}
		
		
	}
	//login for angular project
	//@PostMapping("signin")
	//public ResponseEntity<BaseResponse<R>> sigin(@RequestBody ){
		
	//}
}
