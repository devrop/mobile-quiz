package eintrusty.general.model;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class MstTransactionTypeDto implements Serializable {

	    private static final long serialVersionUID = 1L;
	    
	    private String companyCode;
	   
	    private String trxCode;
	 
	    private String trxName;
	  
	    private String moduleName;
	    
	    private String trxType;
	    
	    private String prefix;
	  
	    private Integer scale;
	   
	    private String runCode;
	   
	    private Integer flagActive;
	   
	    private Date createdDate;
	   
	    private String createdBy;
	    private Date updateDate;
	    private String updateBy;
}
