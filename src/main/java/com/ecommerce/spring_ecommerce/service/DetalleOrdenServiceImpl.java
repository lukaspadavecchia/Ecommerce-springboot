package com.ecommerce.spring_ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.spring_ecommerce.model.DetalleOrden;
import com.ecommerce.spring_ecommerce.repository.IDetalleOrdenRepository;
@Service
public class DetalleOrdenServiceImpl implements IDetalleOrdenService {
@Autowired
	private IDetalleOrdenRepository detalleOrdenRepository;
	@Override
	public DetalleOrden save(DetalleOrden detalleOrden) {
		return detalleOrdenRepository.save(detalleOrden);
	}

}
