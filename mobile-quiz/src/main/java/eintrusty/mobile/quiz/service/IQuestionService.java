package eintrusty.mobile.quiz.service;

import java.util.List;

import eintrusty.mobile.quiz.model.QuestionModel;

public interface IQuestionService {

	List<QuestionModel> getQuestionBySubjectCode(String schoolCode, String subject);
	
}
