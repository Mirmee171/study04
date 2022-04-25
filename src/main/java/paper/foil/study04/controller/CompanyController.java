package paper.foil.study04.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import paper.foil.study04.entity.Sanha;
import paper.foil.study04.service.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyController {

    private final CompanyService companyService;

    @Autowired // Constructor 를 통한 Di
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @PostMapping("/{id}")
    public ResponseEntity<Sanha> create(@RequestBody Sanha sanha) {
        return ResponseEntity.ok()
                .body(companyService.create(sanha));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sanha> read(@PathVariable Long id) {
        return ResponseEntity.ok()
                .body(companyService.read(id).get());
    }
    @PutMapping("/{id}")
    public ResponseEntity<Sanha> read(@RequestParam Long id, @RequestParam String companyName) {
        return ResponseEntity.ok()
                .body(companyService.update(id,companyName));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        companyService.delete(id);
    }
}
