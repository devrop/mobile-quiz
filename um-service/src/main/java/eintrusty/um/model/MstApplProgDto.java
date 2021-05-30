package eintrusty.um.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class MstApplProgDto {

	private static final long serialVersionUID = 1L;
	private String companyCode;
	private String applProgCode;
	private String applProgName;
	private String applProgUrl;
	private String applProgIcon;
	
	private String createdBy;
	private Date createdDate;
	private Integer flagActive;
	private String updatedBy;
	private Date updatedDate;
	
}
