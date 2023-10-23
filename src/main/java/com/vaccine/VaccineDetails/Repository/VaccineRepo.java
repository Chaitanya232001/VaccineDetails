package com.vaccine.VaccineDetails.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaccine.VaccineDetails.Model.Vaccine;

public interface VaccineRepo extends JpaRepository<Vaccine,Long>{
    
}
