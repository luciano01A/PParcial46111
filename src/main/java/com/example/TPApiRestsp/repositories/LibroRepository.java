package com.example.TPApiRestsp.repositories;

import com.example.TPApiRestsp.entities.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro,Long> {
}
