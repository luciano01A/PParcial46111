package com.example.TPApiRestsp.sevices;

import com.example.TPApiRestsp.entities.Libro;
import com.example.TPApiRestsp.repositories.BaseRepository;
import com.example.TPApiRestsp.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl extends  BaseServiceImpl<Libro,Long> implements LibroService{

    @Autowired
    private LibroRepository libroRepository;

    public LibroServiceImpl(BaseRepository<Libro,Long> baseRepository, LibroRepository libroRepository) {
        super(baseRepository);
        this.libroRepository = libroRepository;
    }
}
