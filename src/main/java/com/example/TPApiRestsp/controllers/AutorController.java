package com.example.TPApiRestsp.controllers;

import com.example.TPApiRestsp.entities.Autor;
import com.example.TPApiRestsp.sevices.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/Autores")
public class AutorController  extends BaseControllerImpl<Autor, AutorServiceImpl>{
}
