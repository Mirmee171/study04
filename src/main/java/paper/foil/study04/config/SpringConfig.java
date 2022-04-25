package paper.foil.study04.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import paper.foil.study04.repository.CompanyRepository;
import paper.foil.study04.service.CompanyService;

public class SpringConfig {

    private final CompanyRepository companyRepository;

    @Autowired
    public SpringConfig(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Bean
    public CompanyService companyService() {
        return new CompanyService(companyRepository);
    }
}
