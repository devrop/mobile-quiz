package eintrusty.auth.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserLogin implements Serializable {

	private static final long serialVersionUID = 5962120871566848104L;
	private String userId;
	private String userRealName; 
	private String companyCode;
	private String companyName;
	private String userLocale;
	private String token;
	private String applProgCode;
	private String defaultBranchCode;
	private String subBranchCode;
	private String levelBudgetType;
	private String levelBudgetCode;
	
	private String userImage;

}
