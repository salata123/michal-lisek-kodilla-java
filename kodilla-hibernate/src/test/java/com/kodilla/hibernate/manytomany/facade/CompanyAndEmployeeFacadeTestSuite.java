package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.facade.CompanyAndEmployeeFacade;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class CompanyAndEmployeeFacadeTestSuite {
    @Autowired
    private CompanyAndEmployeeFacade facade;

    @Test
    void  TestFindingEmployeeByTextFragment() {
        //Given
        String fragment1 = "sm";
        String fragment2 = "ft";
        String fragment3 = "koval";
        String fragment4 = "Ma";

        //When
        List<Employee> employeeList1 = facade.employeeFinderByFragment(fragment1);
        List<Employee> employeeList2 = facade.employeeFinderByFragment(fragment2);
        List<Employee> employeeList3 = facade.employeeFinderByFragment(fragment3);
        List<Employee> employeeList4 = facade.employeeFinderByFragment(fragment4);

        List<Company> companyList1 = facade.companyFinderByFragment(fragment1);
        List<Company> companyList2 = facade.companyFinderByFragment(fragment2);
        List<Company> companyList3 = facade.companyFinderByFragment(fragment3);
        List<Company> companyList4 = facade.companyFinderByFragment(fragment4);

        //Then
        assertEquals(12, employeeList1.size());
        assertEquals(0, employeeList2.size());
        assertEquals(12, employeeList3.size());
        assertEquals(0, employeeList4.size());

        assertEquals(0, companyList1.size());
        assertEquals(12, companyList2.size());
        assertEquals(0, companyList3.size());
        assertEquals(36, companyList4.size());
    }
}
