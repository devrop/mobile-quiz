package eintrusty.auth.service;

public interface ITokenService {

	
	public String generateToken(String username);
	
	public boolean verifyToken(String token);
	
	public String getToken(String username, String password);
	
	public String getTokenMicroService(String id, String secretKey);
}
