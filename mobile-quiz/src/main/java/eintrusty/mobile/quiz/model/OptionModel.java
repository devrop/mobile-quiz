package eintrusty.mobile.quiz.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OptionModel implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String questionCode;
	private String optionCode;
	private String option;
	private byte[] imageOption;
}
