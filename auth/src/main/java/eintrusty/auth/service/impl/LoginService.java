package eintrusty.auth.service.impl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eintrusty.auth.entity.MstUserHdr;
import eintrusty.auth.model.UserLogin;
import eintrusty.auth.model.UserLoginRequest;
import eintrusty.auth.repository.UserRepository;
import eintrusty.auth.service.ILoginService;
import eintrusty.auth.service.ITokenService;
@Service
public class LoginService implements ILoginService {

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private ITokenService tokenService;
	
	@Override
	public UserLogin login(UserLoginRequest request) {
		// TODO Auto-generated method stub
		try {
		Optional<MstUserHdr> metaData = userRepo.findActiveUserByUserNameAndPassword(request.getUsername(), 
				request.getPassword());
		boolean isPresent = metaData.isPresent();
		if(isPresent) {
			MstUserHdr userHdr = metaData.get();
			//generate token
			final String token = tokenService.generateToken(userHdr.getUserName());
			//
			return 
					UserLogin.builder()
					.userId(userHdr.getMstUserHdrPK().getEmployeeCode())
					.userRealName(userHdr.getUserName())
					.companyCode(userHdr.getMstUserHdrPK().getCompanyCode())
					.userLocale(userHdr.getPreferedLocale())
					.defaultBranchCode(userHdr.getDefaultBranchCode())
					.subBranchCode(userHdr.getSubBranchCode())
					.userImage(userHdr.getPhoto())
					.token(token)
					.build();
			
		}else {
			return 
					UserLogin.builder()
					.token("")
					.build();
		}
		}catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
			return null;
		}
		
		
	}

}
