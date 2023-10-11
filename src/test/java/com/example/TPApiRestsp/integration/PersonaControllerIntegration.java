package com.example.TPApiRestsp.integration;

import com.example.TPApiRestsp.TpApiRestspApplication;
import com.example.TPApiRestsp.entities.Persona;
import com.example.TPApiRestsp.repositories.PersonaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = TpApiRestspApplication.class)
@AutoConfigureMockMvc
@TestPropertySource(
        locations = "classpath:application.properties"
)
public class PersonaControllerIntegration {
    //evaluan los test en conjunto
    //con los componentes interactuando entre si

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private PersonaRepository personaRepository;

    @Test
    void testSearchString() throws Exception {
        Persona persona = new Persona();
        persona.setNombre("Luciano");
        persona.setApellido("Aguilera");

        personaRepository.save(persona);

        mockMvc.perform(get("/api/v1/Personas/search")
                        .param("filtro","Luciano")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].nombre",is("Luciano")))
                .andExpect(jsonPath("$[0].apellido",is("Aguilera")));

    }
}
