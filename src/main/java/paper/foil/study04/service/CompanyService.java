package paper.foil.study04.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import paper.foil.study04.entity.Sanha;
import paper.foil.study04.repository.CompanyRepository;

import java.util.Optional;

@Service
public class CompanyService {

    private CompanyRepository companyRepository;

    @Autowired
    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Sanha create(Sanha sanha) {
        return companyRepository.save(sanha);
    }

    public Optional<Sanha> read(Long id) {
        return companyRepository.findById(id);
    }

    public Sanha update(Long id,String companyName) {
        Sanha sanha = read(id).get();
        sanha.setCompanyName(companyName);
        return companyRepository.save(sanha);
    }

    public void delete(Long id) {
        companyRepository.deleteById(id);
    }
}
