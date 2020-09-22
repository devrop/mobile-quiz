package eintrusty.mobile.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eintrusty.mobile.quiz.entity.TQuestionDtl;
import eintrusty.mobile.quiz.entity.TQuestionDtlPK;
@Repository
public interface TQuestionDtlRepository extends JpaRepository<TQuestionDtl,TQuestionDtlPK> {

}
