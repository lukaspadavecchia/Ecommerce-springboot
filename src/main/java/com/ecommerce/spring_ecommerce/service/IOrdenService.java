package com.ecommerce.spring_ecommerce.service;

import java.util.List;

import com.ecommerce.spring_ecommerce.model.Orden;

public interface IOrdenService {
	List<Orden>findAll();
Orden save(Orden orden);
String generarNumeroOrden(); 
}
