package com.bangelevenn.CRUD.Restful.Maven.ServerSide.repo;

import com.bangelevenn.CRUD.Restful.Maven.ServerSide.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByAge(int age);
}

