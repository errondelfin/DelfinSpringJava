package com.csb.samplefullstack.repository;

import com.csb.samplefullstack.entity.employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<employee, Long>{

}
