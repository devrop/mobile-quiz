package tim.hore.quizservice.model;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginResponse implements Serializable {
	/**
	 * Author Ropandi,
	 */
	private static final long serialVersionUID = 2058695971213392398L;
    private String username;
    private String token;
   
	
}
