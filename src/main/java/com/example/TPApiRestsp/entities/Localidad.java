package com.example.TPApiRestsp.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "Localidad")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Localidad extends Base {
    @Column(name = "Denominacion")
    private String denominacion;
}
