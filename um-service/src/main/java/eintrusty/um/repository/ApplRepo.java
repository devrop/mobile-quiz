package eintrusty.um.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import eintrusty.um.entity.MstApplProg;
import eintrusty.um.entity.pk.MstApplProgPK;

@Repository
public interface ApplRepo extends JpaRepository<MstApplProg,MstApplProgPK> {

	
}
