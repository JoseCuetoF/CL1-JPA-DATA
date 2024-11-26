package pe.edu.i202221113.cl1_jpa_data_Cueto_Jose.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table (name="city")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "CountryCode")
    private Country country;
    private String district;
    private int population;






}
