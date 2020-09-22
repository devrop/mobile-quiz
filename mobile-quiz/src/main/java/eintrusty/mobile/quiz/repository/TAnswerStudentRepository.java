package eintrusty.mobile.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eintrusty.mobile.quiz.entity.TAnswerStudent;
import eintrusty.mobile.quiz.entity.TAnswerStudentPK;
@Repository
public interface TAnswerStudentRepository extends JpaRepository<TAnswerStudent,TAnswerStudentPK> {

}
