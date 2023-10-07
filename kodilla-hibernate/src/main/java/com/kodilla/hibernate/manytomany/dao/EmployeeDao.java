package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Transactional
@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {
    @Query
    List<Employee> retrieveEmployeeByLastname(@Param("LASTNAME") String lastname);

    @Query("SELECT c FROM Employee c WHERE c.lastname LIKE %:FRAGMENT%")
    List<Employee> retrieveEmployeeByTextFragment(@Param("FRAGMENT") String fragment);
}