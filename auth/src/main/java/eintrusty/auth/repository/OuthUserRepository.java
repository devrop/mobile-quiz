package eintrusty.auth.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import eintrusty.auth.entity.MOuthUser;
@Repository
public interface OuthUserRepository extends JpaRepository<MOuthUser,String> {

	@Query("select o from MOuthUser o where o.id =:id and o.secretKey =:secretKey")
	Optional<MOuthUser> getUserByIdAndSecretKey(@Param("id") String id,@Param("secretKey") String secretKey);
	
}
