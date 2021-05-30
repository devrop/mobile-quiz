package tim.hore.quizservice.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tim.hore.quizservice.entity.MUserloginHdr;
import tim.hore.quizservice.model.LoginRequest;
import tim.hore.quizservice.model.LoginResponse;
import tim.hore.quizservice.repository.UserLoginRepository;
import tim.hore.quizservice.service.ILoginService;
@Service
@Transactional
public class LoginService implements ILoginService {

	@Autowired
	private UserLoginRepository userLoginRepo;
	
	@Override
	public LoginResponse login(LoginRequest loginRequest) {
		// TODO Auto-generated method stub
		final String username = loginRequest.getUsername() ==null? "" : loginRequest.getUsername();
		final String password = loginRequest.getPassword() ==null? "" : loginRequest.getPassword();
		if(!username.equalsIgnoreCase("") && !password.equalsIgnoreCase("")) {
		   MUserloginHdr hdr = userLoginRepo.findOneByUsernameAndPassword(username, password, "1");
		   if(hdr !=null) {
			   
			   
		   }else {
			   
		   }
			
		   
		   
		   
		}else {
			
		}
		return null;
	}

}
