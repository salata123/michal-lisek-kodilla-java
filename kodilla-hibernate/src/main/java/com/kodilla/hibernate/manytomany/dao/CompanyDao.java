package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {
    @Query
    List<Company> retrieveThreeFirstLetters(@Param("FIRSTTHREELETTERS") String name);

    @Query("SELECT c FROM Company c WHERE c.name LIKE %:FRAGMENT%")
    List<Company> findCompaniesByTextFragment(@Param("FRAGMENT") String fragment);
}