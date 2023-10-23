package com.vaccine.VaccineDetails.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table
public class Vaccine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;
    private Long idDetails;
    private String idType;
    private String FirstName;
    private String LastName;
    private Long contactNumber;
    private String vaccineName;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Long getIdDetails() {
        return idDetails;
    }
    public void setIdDetails(Long idDetails) {
        this.idDetails = idDetails;
    }
    public String getIdType() {
        return idType;
    }
    public void setIdType(String idType) {
        this.idType = idType;
    }
    public String getFirstName() {
        return FirstName;
    }
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }
    public String getLastName() {
        return LastName;
    }
    public void setLastName(String lastName) {
        LastName = lastName;
    }
    public Long getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(Long contactNumber) {
        this.contactNumber = contactNumber;
    }
    public String getVaccineName() {
        return vaccineName;
    }
    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }
    public Vaccine() {
    }
    @Override
    public String toString() {
        return "Vaccine [id=" + id + ", idDetails=" + idDetails + ", idType=" + idType + ", FirstName=" + FirstName
                + ", LastName=" + LastName + ", contactNumber=" + contactNumber + ", vaccineName=" + vaccineName + "]";
    }

}
