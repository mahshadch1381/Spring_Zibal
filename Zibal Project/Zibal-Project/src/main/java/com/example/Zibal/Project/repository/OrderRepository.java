package com.example.Zibal.Project.repository;

import com.example.Zibal.Project.entity.Orders;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Orders, Integer> {

}
