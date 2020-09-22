package eintrusty.mobile.quiz.repository;

import java.util.Collection;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import eintrusty.mobile.quiz.entity.TQuestionHdr;
import eintrusty.mobile.quiz.entity.TQuestionHdrPK;
import eintrusty.mobile.quiz.entity.join.Question;

@Repository
public interface TQuestionHdrRepository extends JpaRepository<TQuestionHdr,TQuestionHdrPK> {

	
	
	@Query("select "
			+ "tqh.tQuestionHdrPK.schoolCode as schoolCode,"
			+ "tqh.tQuestionHdrPK.subjectCode as subjectCode,"
			+ "tqh.tQuestionHdrPK.questionCode as questionCode,"
			+ "tqh.question as question,"
			+ "tqh.level as level,"
			+ "tqh.packageCode as packageCode,"
			+ "tqh.status as status,"
			+ "tqh.image as imageQuestion,"
			+ "tqd.tQuestionDtlPK.optionCode as optionCode, "
			+ "tqd.option as option,"
			+ "tqd.image as imageOption  "
			+ "from TQuestionHdr tqh join TQuestionDtl tqd "
			+ " on tqh.tQuestionHdrPK.schoolCode = tqd.tQuestionDtlPK.schoolCode "
			+ " and tqh.tQuestionHdrPK.questionCode = tqd.tQuestionDtlPK.questionCode"
			+ " where tqh.tQuestionHdrPK.schoolCode = :schoolCode and tqh.tQuestionHdrPK.subjectCode = :subjectCode ")
	Collection<Question> fecthBySubjectCode(
			@Param("schoolCode") String schoolCode,
			@Param("subjectCode") String subjectCode
			);
}
