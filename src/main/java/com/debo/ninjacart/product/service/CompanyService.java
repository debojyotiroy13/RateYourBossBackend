package com.debo.ninjacart.product.service;

import com.debo.ninjacart.product.entity.Company;
import com.debo.ninjacart.product.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.Optional;


@Service("CompanyService")
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public void addCompany(Company company) {
        companyRepository.save(company);
    }

    public Optional<Company> getCompanyById(long companyid) {
        return companyRepository.findById(companyid);
    }
}
