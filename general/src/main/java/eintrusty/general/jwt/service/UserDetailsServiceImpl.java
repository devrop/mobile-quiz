package eintrusty.general.jwt.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import common.util.StringUtil;
import eintrusty.general.jwt.model.UserPrinciple;





@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Value("${custom.regex1}")
    private String regex1;
 
	@Value("${custom.regex2}")
    private String regex2;

	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Map<String,Object> data = StringUtil.extractUserNameAndRoleFromBodyToken(username, this.regex1,this.regex2);
		final String user = (String) data.get("username");
		final List<String> roles = (List<String>) data.get("roles");	
		return UserPrinciple.newPrinciple(user, "", roles);

	}

}
