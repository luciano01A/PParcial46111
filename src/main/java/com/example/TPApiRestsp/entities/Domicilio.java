package com.example.TPApiRestsp.entities;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Domicilio")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Domicilio extends Base {
    @Column(name = "Calle")
    private String calle;

    @Column(name = "Numero")
    private int numero;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;
}
