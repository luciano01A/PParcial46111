package com.example.TPApiRestsp.sevices;
import com.example.TPApiRestsp.repositories.BaseRepository;
import com.example.TPApiRestsp.entities.Domicilio;
import com.example.TPApiRestsp.repositories.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio,Long> implements DomicilioService{

    @Autowired
    private DomicilioRepository domicilioRepository;

    public DomicilioServiceImpl(BaseRepository<Domicilio,Long> baseRepository, DomicilioRepository domicilioRepository) {
        super(baseRepository);
        this.domicilioRepository = domicilioRepository;
    }
}
