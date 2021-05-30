package tim.hore.quizservice.service;

import tim.hore.quizservice.model.LoginRequest;
import tim.hore.quizservice.model.LoginResponse;

public interface ILoginService {

	
	public LoginResponse login(LoginRequest loginRequest);
	
}
