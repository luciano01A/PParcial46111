package com.example.TPApiRestsp.controllers;

import com.example.TPApiRestsp.entities.Libro;
import com.example.TPApiRestsp.sevices.LibroServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/Libro")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl>{
}
