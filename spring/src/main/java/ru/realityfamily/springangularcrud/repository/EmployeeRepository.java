package ru.realityfamily.springangularcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.realityfamily.springangularcrud.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
