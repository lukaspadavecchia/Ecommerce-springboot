package com.ecommerce.spring_ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.spring_ecommerce.model.Producto;
@Repository
public interface IProductoRepository extends JpaRepository<Producto,Integer>{

}
