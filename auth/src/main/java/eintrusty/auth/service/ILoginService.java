package eintrusty.auth.service;

import eintrusty.auth.model.UserLogin;
import eintrusty.auth.model.UserLoginRequest;

public interface ILoginService {

	UserLogin login(UserLoginRequest request);
}
