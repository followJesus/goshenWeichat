package goshen.education.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import goshen.education.domain.Professional;
import goshen.education.repository.ProfessionalRepository;
@Transactional
@Service
public class ProfessionalServiceImpl implements ProfessionalService{

	@Autowired
	private ProfessionalRepository professionalRepository;

	@Override
	public boolean professionalSave(Professional professional) {
		professional = professionalRepository.save(professional);
		boolean saved = false;
		if (professional != null) {
			saved = true;
		}
		return saved;
	}

	@Override
	public void deleteProfessional(long id) {
		professionalRepository.delete(id);
	}

	@Override
	public boolean updateProfessional(goshen.education.domain.web.Professional professional) {
		Professional professionalDomain = new Professional();
		if (professional != null) {
			professionalDomain.setId(professional.getId());
			professionalDomain.setCompany(professional.getCompany());
			professionalDomain.setProName(professional.getProName());
		}
		
		return professionalSave(professionalDomain);
	}
	

}
