package paper.foil.study04.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import paper.foil.study04.entity.Sanha;
import paper.foil.study04.entity.Yanolja;

import java.util.Optional;

public interface CompanyRepository extends JpaRepository<Sanha, Long> {

    @Override
    Sanha save(Sanha sanha);

    @Override // Read
    Optional<Sanha> findById(Long id);

    @Override // Delete
    void deleteById(Long id);
}
