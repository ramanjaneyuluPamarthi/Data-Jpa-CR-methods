package com.nit.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nit.entity.Product;

@Repository
public interface ProductRepo  extends CrudRepository<Product,Serializable>
{

}
