package pe.edu.i202221113.cl1_jpa_data_Cueto_Jose.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor


public class CountryLanguagePk {

    private String countrycode;
    private String language;
}
