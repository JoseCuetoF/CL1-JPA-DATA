package pe.edu.i202221113.cl1_jpa_data_Cueto_Jose.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="countrylanguage")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class CountryLanguage {

    @EmbeddedId
    private CountryLanguagePk countryLanguagePk;
    private String isofficial;
    private double percentage;


   @ManyToOne
   @JoinColumn(name ="CountryCode")
   @MapsId("countrycode")
   private Country country;





}
