package eintrusty.mobile.quiz.model;

import java.io.Serializable;
import java.util.List;

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
public class QuestionModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String schoolCode;
	private String subjectCode;
	private String questionCode;
	private String question;
	private String level;
	private String packageCode;
	private Integer status;
	private byte[] imageQuestion;
	private List<OptionModel> options;
	
	
	
}
