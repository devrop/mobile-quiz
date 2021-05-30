package tim.hore.quizservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tim.hore.quizservice.entity.MUserloginHdr;
import tim.hore.quizservice.entity.MUserloginHdrPK;
@Repository
public interface UserLoginRepository extends JpaRepository<MUserloginHdr, MUserloginHdrPK> {

	@Query("select p from MUserLoginHdr p where p.username =:username and p.password =:password "
			+ " and status =:status ")
	public MUserloginHdr findOneByUsernameAndPassword(@Param("username") String username, 
			@Param("password") String password, @Param("status") String status);

	
	
}
