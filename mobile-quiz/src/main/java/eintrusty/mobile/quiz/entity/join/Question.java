package eintrusty.mobile.quiz.entity.join;

import org.springframework.beans.factory.annotation.Value;

public interface Question {

	@Value("#{target.schoolCode}")
	String schoolCode();
	
	@Value("#{target.subjectCode}")
	String subjectCode();
	
	@Value("#{target.questionCode}")
	String questionCode();
	
	@Value("#{target.question}")
	String question();
	
	@Value("#{target.level}")
	String level();
	
	@Value("#{target.packageCode}")
	String packageCode();
	
	@Value("#{target.status}")
	Integer status();
	@Value("#{target.imageQuestion}")
	byte[] imageQuestion();
	
	@Value("#{target.optionCode}")
	String optionCode();
	@Value("#{target.option}")
	String option();
	
	@Value("#{target.imageOption}")
	byte[] imageOption();
	
	//get
	
	String getSchoolCode();
	
	
	String getSubjectCode();
	
	String getQuestionCode();
	
	String getQuestion();
	
	String getLevel();
	
	String getPackageCode();
	
	Integer getStatus();
	
	byte[] getImageQuestion();
	
	
	String getOptionCode();
	String getOption();
	
	byte[] getImageOption();
	
	
}
