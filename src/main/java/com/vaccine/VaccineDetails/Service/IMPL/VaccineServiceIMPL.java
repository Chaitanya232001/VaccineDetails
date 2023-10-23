package com.vaccine.VaccineDetails.Service.IMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaccine.VaccineDetails.Model.Vaccine;
import com.vaccine.VaccineDetails.Repository.VaccineRepo;
import com.vaccine.VaccineDetails.Service.VaccineService;

@Service
public class VaccineServiceIMPL implements VaccineService{
    
    @Autowired
    VaccineRepo obj;

    @Override
    public Vaccine addVaccine(Vaccine vaccine) {
   Vaccine v=obj.save(vaccine);
   return v;
    }

}
