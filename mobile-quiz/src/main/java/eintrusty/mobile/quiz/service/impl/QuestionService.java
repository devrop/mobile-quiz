package eintrusty.mobile.quiz.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eintrusty.mobile.quiz.entity.join.Question;
import eintrusty.mobile.quiz.model.OptionModel;
import eintrusty.mobile.quiz.model.QuestionModel;
import eintrusty.mobile.quiz.repository.TQuestionHdrRepository;
import eintrusty.mobile.quiz.service.IQuestionService;

@Service
@Transactional
public class QuestionService implements IQuestionService {

	@Autowired
	private TQuestionHdrRepository tQuestionHdrRepository;

	@Override
	public List<QuestionModel> getQuestionBySubjectCode(String schoolCode, String subject) {
		// TODO Auto-generated method stub
		List<QuestionModel> listMetaQuestion = new ArrayList<>();
		List<QuestionModel> listFinalQuestion = new ArrayList<>();
		Collection<Question> listMetaQuestionDB = tQuestionHdrRepository.fecthBySubjectCode(schoolCode, subject);

		
		List<OptionModel> listMetaOption = new ArrayList<OptionModel>();
		for (Question question : listMetaQuestionDB) {
			OptionModel optionModel = OptionModel.builder().questionCode(question.getQuestionCode())
					.optionCode(question.optionCode()).option(question.getOption()).imageOption(question.imageOption())
					.build();
			listMetaOption.add(optionModel);
		}

		// Map<Option>
		Map<String, String> mapQuestion = new HashMap<String, String>();
		for (Question question : listMetaQuestionDB) {
			// question.getSchoolCode();

			List<OptionModel> metaOptionRandomly = getOptionRadomly(question.getQuestionCode(), listMetaOption);
			QuestionModel ques = QuestionModel.builder().schoolCode(question.getSchoolCode())
					.subjectCode(question.getSubjectCode()).questionCode(question.getQuestionCode())
					.question(question.getQuestion())
					.level(question.getLevel()).packageCode(question.getPackageCode()).status(question.getStatus())
					.imageQuestion(question.getImageQuestion()).options(metaOptionRandomly).build();

			if(mapQuestion.get(ques.getQuestionCode()) == null) {
				listMetaQuestion.add(ques);
				mapQuestion.put(ques.getQuestionCode(), "");
			}
			
			
		}

		// random Question
		Map<Integer, Integer> MapPenandaQuestion = new HashMap<Integer, Integer>();
		if (listMetaQuestion.size() > 0) {
			

			while (true) {
				Integer index = getRandom(0, listMetaQuestion.size() - 1);
				if (MapPenandaQuestion.get(index) == null) {
					QuestionModel qTemp = listMetaQuestion.get(index);
					listFinalQuestion.add(qTemp);
					MapPenandaQuestion.put(index, index);
				}

				if (listFinalQuestion.size() == listMetaQuestion.size()) {
					break;
				}

			}

		}

		return listFinalQuestion;
	}

	private static Integer getRandom(int start, int max) {
		int randomInt = (int) (Math.random() * (max - start + 1) + start);
		//System.out.println(randomInt);
		return randomInt;
	}

	private List<OptionModel> getOptionRadomly(String questionCode, List<OptionModel> listMetaOption) {
		List<OptionModel> listMeta = new ArrayList<OptionModel>();
		for (OptionModel optionModel : listMetaOption) {
			if (optionModel.getQuestionCode().equalsIgnoreCase(questionCode)) {
				listMeta.add(optionModel);
			}

		}

		Map<Integer, String> mapPenanda = new HashMap<Integer, String>();
		List<OptionModel> listFinal = new ArrayList<OptionModel>();
		if (listMeta.size() > 0) {
			

			while (true) {
				Integer index = getRandom(0, listMeta.size() - 1);
				if (mapPenanda.get(index) == null) {
					OptionModel temp = listMeta.get(index);
					listFinal.add(temp);
					mapPenanda.put(index, "");
				}

				if (listFinal.size() == listMeta.size()) {
					break;
				}

			}

		}

		return listFinal;

	}

}
