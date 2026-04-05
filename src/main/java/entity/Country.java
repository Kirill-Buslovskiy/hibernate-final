package entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "country", schema = "world")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String code;
    @Column(name = "code_2")
    private String code2;
    private String name;
    @Enumerated
    private Continent continent;
    private String region;
    @Column(name = "surface_area")
    private BigDecimal surfaceArea;
    @Column(name = "indep_year")
    private Short indepYear;
    private Integer population;
    @Column(name = "life_expectancy")
    private BigDecimal lifeExpectancy;
    private BigDecimal gnp;
    @Column(name = "gnp_id")
    private BigDecimal gnpoId;
    @Column(name = "local_name")
    private String localName;
    @Column(name = "government_form")
    private String governmentForm;
    @Column(name = "head_of_state")
    private String headOfState;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "capital")
    private City city;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "country_id")
    private Set<CountryLanguage> languages;

}
