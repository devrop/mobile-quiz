package tim.hore.quizservice.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Builder
public class LoginRequest implements Serializable {
	/**
	 * Author Ropandi, A. 
	 */
	private static final long serialVersionUID = -4136801168645889773L;
	private String username;
	private String password;
	
	
	

}
