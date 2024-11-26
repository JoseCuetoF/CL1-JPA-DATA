package pe.edu.i202221113.cl1_jpa_data_Cueto_Jose;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pe.edu.i202221113.cl1_jpa_data_Cueto_Jose.entity.Country;

import pe.edu.i202221113.cl1_jpa_data_Cueto_Jose.repository.CountryRepository;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@SpringBootApplication
public class Cl1JpaDataCuetoJoseApplication implements CommandLineRunner {

	@Autowired
	CountryRepository countryRepository;

	public static void main(String[] args) {
		SpringApplication.run(Cl1JpaDataCuetoJoseApplication.class, args);
	}


	@Override
	@Transactional
	public void run(String... args) throws Exception {


		/*
		ifPresentOrElse()
		 */

		Optional<Country> optional = countryRepository.findById("PER");
		optional.ifPresentOrElse(
				(Country country)->{
					country.getLanguages().forEach(System.out::println);
				},
				()->{
					System.out.println("Country not found");
				});

		/*
		deleteAllById()
		 */
/*
		// Lista de países a eliminar
		List<String> lista = List.of("COL", "ARG");

		List<String> existentes = lista.stream()
				.filter(countryRepository::existsById)
				.collect(Collectors.toList());

		countryRepository.deleteAllById(existentes);

*/



	}
}

