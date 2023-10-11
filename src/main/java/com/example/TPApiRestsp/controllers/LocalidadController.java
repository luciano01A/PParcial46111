package com.example.TPApiRestsp.controllers;

import com.example.TPApiRestsp.entities.Localidad;
import com.example.TPApiRestsp.sevices.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/Localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl>{
}
