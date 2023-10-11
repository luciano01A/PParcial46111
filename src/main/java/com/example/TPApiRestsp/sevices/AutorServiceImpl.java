package com.example.TPApiRestsp.sevices;

import com.example.TPApiRestsp.entities.Autor;
import com.example.TPApiRestsp.repositories.AutorRepository;
import com.example.TPApiRestsp.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {
    @Autowired
    private AutorRepository autorRepository;
    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository, AutorRepository autorRepository) {
        super(baseRepository);
        this.autorRepository = autorRepository;
    }
}

