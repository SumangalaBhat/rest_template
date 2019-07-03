package com.hcl.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.customer.entity.Student;
@Repository
public interface CustomerRepository extends JpaRepository<Student,Long>{

}
