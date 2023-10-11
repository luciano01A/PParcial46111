package com.example.TPApiRestsp.repositories;


import com.example.TPApiRestsp.entities.Persona;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest //setea una bd de h2 en memoria
public class PersonaRepositoryTest {

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private PersonaRepository personaRepository;

    @Test
    void testSearchString() {
        Persona persona = new Persona();
        persona.setNombre("Luciano");
        persona.setApellido("Aguilera");

        List<Persona> listaEnviada = new ArrayList();
        listaEnviada.add(persona);

        entityManager.persist(persona);
        entityManager.flush();

        assertEquals(listaEnviada, personaRepository.searchNativo("Luciano"));
        assertEquals(listaEnviada, personaRepository.searchNativo("Aguilera"));


    }
}