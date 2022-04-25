package paper.foil.study04.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "YANOLJA")
public class Yanolja {

    @Id
    @Column(name = "YANOLJA_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "YANOLJA_NAME")
    private String companyName;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, mappedBy = "yanolja")
    private List<Sanha> sanhas = new ArrayList<>();

    public void addSanha(Sanha sanha){
        sanha.setYanolja(this);
        sanhas.add(sanha);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<Sanha> getSanhas() {
        return sanhas;
    }

    public void setSanhas(List<Sanha> sanhas) {
        this.sanhas = sanhas;
    }



}
