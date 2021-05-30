package eintrusty.auth.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.mysql.fabric.xmlrpc.base.Array;

import eintrusty.auth.entity.MOuthUser;
import eintrusty.auth.jwt.JwtProvider;
import eintrusty.auth.repository.OuthUserRepository;
import eintrusty.auth.repository.RoleRepository;
import eintrusty.auth.service.ITokenService;
import eintrusty.auth.utility.StringUtility;
@Service
public class TokenService implements ITokenService {
	@Value("${jwt.Secret}")
	private String jwtSecret;

    //@Value("${custom.encrypted}")
	//private String key;
	@Value("${custom.regex1}")
    private String regex1;
 
	@Value("${custom.regex2}")
    private String regex2;
	
	@Value("${custom.user}")
    private String username;
	@Value("${custom.password}")
	private String password;
	
	@Autowired
    private JwtProvider jwtProvider;
	
	@Autowired
	private OuthUserRepository outUserRepository;
	
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public String generateToken(String username) {
		// TODO Auto-generated method stub
	    try {
	        List<String> listRole = 
	        		roleRepository
	        		.getRoleByUserName(username)
	        		.stream().map(r -> r.getRoleParent())
	        		.collect(Collectors.toList());
	        final String bodyToken = 
	        		StringUtility.buildingBodyTokenUsernameAndRole(username, regex1, listRole, regex2);
	    	final String value = jwtProvider.generateJwtTokenCustom(bodyToken);   	
	    	
	    	return value;
	    }catch(Exception e) {
	    	return null;
	    }	
		
		
	}

	@Override
	public boolean verifyToken(String token) {
		// TODO Auto-generated method stub
		return jwtProvider.validateJwtToken(token);
	}

	@Override
	public String getToken(String username, String password) {
		// TODO Auto-generated method stub
		if(username.equals("admin") && password.equals("admin")) {
			List<String> listRole = Arrays.asList("ROLE_ADMIN");
			final String bodyToken = 
	        		StringUtility.buildingBodyTokenUsernameAndRole(username, regex1, listRole, regex2);
			return jwtProvider.generateJwtTokenCustom(bodyToken); 
		}
		
		return "";
	}

	@Override
	public String getTokenMicroService(String id, String secretKey) {
		// TODO Auto-generated method stub
		Optional<MOuthUser> opOuthUser = outUserRepository.getUserByIdAndSecretKey(id, secretKey);
		if(opOuthUser.isPresent()) {
			final String name = opOuthUser.get().getId().toUpperCase();
			final String roleName = "ROLE_"+name; 
			//List<String> listRole = Arrays.asList("ROLE_ADMIN");
			final List<String> listRole = Arrays.asList(roleName);
			final String bodyToken = 
	        		StringUtility.buildingBodyTokenUsernameAndRole(id, regex1, listRole, regex2);
			return jwtProvider.generateJwtTokenCustom(bodyToken); 
			
			
		}
		return "";
	}

}
