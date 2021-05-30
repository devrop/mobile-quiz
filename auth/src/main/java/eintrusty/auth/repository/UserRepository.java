package eintrusty.auth.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import eintrusty.auth.entity.MstUserHdr;
import eintrusty.auth.entity.pk.MstUserHdrPK;
@Repository
public interface UserRepository extends JpaRepository<MstUserHdr,MstUserHdrPK> {

	@Query(value = "select u from MstUserHdr u where u.userName =:username and u.password =:password ")
	Optional<MstUserHdr> findActiveUserByUserNameAndPassword(
			@Param("username") String username,
			@Param("password") String password
			);
}
