package com.debo.ninjacart.product.controller;

import com.debo.ninjacart.product.entity.Job;
import com.debo.ninjacart.product.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobController {

    @Autowired
    private DepartmentService departmentService;


    @GetMapping(path = { "/job"})
    public ResponseEntity<List<Job>> createCompany() {
        List<Job> dept = departmentService.getAllDepartments();
        return new ResponseEntity<List<Job>>(dept, HttpStatus.OK);
    }
}
