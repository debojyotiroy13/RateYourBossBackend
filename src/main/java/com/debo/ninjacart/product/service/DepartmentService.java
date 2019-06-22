package com.debo.ninjacart.product.service;

import com.debo.ninjacart.product.entity.Job;
import com.debo.ninjacart.product.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("DepartmentService")
public class DepartmentService {

    @Autowired
    private JobRepository departmentRepository;

    public List<Job> getAllDepartments(){
        return departmentRepository.findAll();
    }
}
