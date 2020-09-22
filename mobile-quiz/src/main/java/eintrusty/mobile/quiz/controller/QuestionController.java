package eintrusty.mobile.quiz.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import eintrusty.mobile.quiz.service.IQuestionService;
import eintrusty.mobile.quiz.model.QuestionModel;

import eintrusty.mobile.quiz.lib.message.MessageVar;
import eintrusty.mobile.quiz.lib.model.BaseModel;
import eintrusty.mobile.quiz.lib.model.QuestionRequest;
@RequestMapping
@RestController
public class QuestionController {

	
	@Autowired
	private IQuestionService questionService;
	
	
	
	@CrossOrigin
	@PostMapping("getquestion")
	public ResponseEntity<BaseModel<List<QuestionModel>>> getQuestion(@RequestBody QuestionRequest questionRequest){
		 List<QuestionModel> result = questionService.getQuestionBySubjectCode(questionRequest.getSchoolCode(), questionRequest.getSubjectCode());
		 
		 
		 BaseModel<List<QuestionModel>> datas = new BaseModel<List<QuestionModel>>();
		 if(result.size() ==  0){
				datas.setStatus(MessageVar.ERROR);		
				return new ResponseEntity<BaseModel<List<QuestionModel>>>(datas,HttpStatus.OK); 
			}
			datas.setStatus(MessageVar.SUCCESS);
			datas.setMessage(MessageVar.SUCCESSMESSAGE);
			datas.setData(result);
			return new ResponseEntity<BaseModel<List<QuestionModel>>>(datas,HttpStatus.OK);
		 
	}
}
