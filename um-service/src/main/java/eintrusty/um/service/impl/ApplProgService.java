package eintrusty.um.service.impl;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import eintrusty.um.entity.MstApplProg;
import eintrusty.um.entity.pk.MstApplProgPK;
import eintrusty.um.model.MstApplProgDto;
import eintrusty.um.repository.ApplRepo;
import eintrusty.um.service.IApplProgService;
@Service
@Transactional
public class ApplProgService implements IApplProgService {

	@Autowired
	private ApplRepo applRepo;
	
	@Override
	public int save(MstApplProgDto dto) {
		// TODO Auto-generated method stub
		try {
			MstApplProgPK pk = new MstApplProgPK();
			pk.setCompanyCode(dto.getCompanyCode());
			pk.setApplProgCode(dto.getApplProgCode());
			
			Optional<MstApplProg> opAppl = applRepo.findById(pk); 
			
			MstApplProg prog = new MstApplProg();
			prog.setMstApplProgPK(pk);
			prog.setApplProgIcon(dto.getApplProgIcon().toLowerCase());
			prog.setApplProgName(dto.getApplProgName());
			prog.setApplProgUrl(dto.getApplProgUrl().toLowerCase());
			prog.setFlagActive(Integer.toString(dto.getFlagActive()));
			if(opAppl.isPresent()) {
				//edit
				prog.setCreatedBy(opAppl.get().getCreatedBy());
				prog.setCreatedDate(opAppl.get().getCreatedDate());
				prog.setUpdatedBy(dto.getUpdatedBy());
				prog.setUpdatedDate(new Date());
			}else {
				//save
				prog.setCreatedDate(new Date());
				prog.setCreatedBy(dto.getCreatedBy());
				
			}
			applRepo.save(prog);
			return 1;			
		}catch(Exception e) {
			return 0;
		}
		
	}

}
