package com.example.TPApiRestsp;

import com.example.TPApiRestsp.entities.*;


import com.example.TPApiRestsp.repositories.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TpApiRestspApplication {
	@Autowired
	AutorRepository autorRepository;
	@Autowired
	DomicilioRepository domicilioRepository;
	@Autowired
	LibroRepository libroRepository;
	@Autowired
	LocalidadRepository localidadRepository;
	@Autowired
	PersonaRepository personaRepository;

	public static void main(String[] args) {
		SpringApplication.run(TpApiRestspApplication.class, args);
		System.out.println("------------>Corriendo Primer Parcial Aguilera 46111<------------");
	}

	@Bean
	CommandLineRunner init(PersonaRepository personaRepository, AutorRepository autorRepository, DomicilioRepository domicilioRepository, LibroRepository libroRepository, LocalidadRepository localidadRepository) {
		return args -> {
			for(int i = 0; i<=20; i++){
				Localidad localidad  = Localidad.builder()
						.denominacion("San martin")
						.build();
				localidadRepository.save(localidad);
				Domicilio domicilio = Domicilio.builder()
						.calle("san luis")
						.numero(786767)
						.localidad(localidad)
						.build();
				domicilioRepository.save(domicilio);
				Persona persona = Persona.builder()
						.nombre("Luciano")
						.apellido("Aguilera")
						.domicilio(domicilio)
						.dni(533353535)
						.build();
				personaRepository.save(persona);
				Libro libro = Libro.builder()
						.fecha(23)
						.genero("Genero: "+ 1)
						.titulo("el ojo")
						.paginas(2)
						.build();
				libroRepository.save(libro);
				Autor autor = Autor.builder()
						.nombre("nr")
						.apellido("junior")
						.biografia("bio de nr junior")
						.build();
				autorRepository.save(autor);
			}
		};
	}

}