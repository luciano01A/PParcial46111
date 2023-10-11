package com.example.TPApiRestsp.entities;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "Persona")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Persona extends Base{
    @Column(name = "Apellido")
    private String apellido;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "DNI")
    private int dni;

    @OneToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "fk_domicilio")
    private Domicilio domicilio;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name = "persona_libro",
            joinColumns = @JoinColumn(name = "persona_id"),
            inverseJoinColumns = @JoinColumn(name = "libro_id")
    )
    private List<Libro> libros = new ArrayList<Libro>();
}
