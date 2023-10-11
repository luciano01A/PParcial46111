package com.example.TPApiRestsp.controllers;

import com.example.TPApiRestsp.entities.Domicilio;
import com.example.TPApiRestsp.sevices.DomicilioServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/Domicilio")

public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioServiceImpl>{
}
