package paper.foil.study04.entity;

import javax.persistence.*;

@Entity
@Table(name = "SANHA")
@IdClass(SanhaID.class)

public class Sanha {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "child_seq_member")
    @Column(name = "SANHA_ID")
    private Long id;

    @Id
    @GeneratedValue
    @Column(name = "SANHA_COMPANYID")
    private Long companyId;

    @Column(name = "SANHA_NAME", length = 100)
    private String companyName;

    public Yanolja getYanolja() {
        return yanolja;
    }

    public void setYanolja(Yanolja yanolja) {
        this.yanolja = yanolja;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "YANOLJA_ID")
    private Yanolja yanolja;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

}
