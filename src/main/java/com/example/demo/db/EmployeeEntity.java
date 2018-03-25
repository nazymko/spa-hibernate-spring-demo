package com.example.demo.db;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "employee", schema = "hr", catalog = "")
public class EmployeeEntity {
    private int id;
    private String firstName;
    private String lastName;
    private Timestamp birthdate;
    private String gender;
    private String taxnumber;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "first_name", nullable = true, length = 1024)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name", nullable = true, length = 1024)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "birthdate", nullable = true)
    public Timestamp getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Timestamp birthdate) {
        this.birthdate = birthdate;
    }

    @Basic
    @Column(name = "gender", nullable = true, length = 16)
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "taxnumber", nullable = true, length = 1024)
    public String getTaxnumber() {
        return taxnumber;
    }

    public void setTaxnumber(String taxnumber) {
        this.taxnumber = taxnumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeEntity that = (EmployeeEntity) o;

        if (id != that.id) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (birthdate != null ? !birthdate.equals(that.birthdate) : that.birthdate != null) return false;
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
        if (taxnumber != null ? !taxnumber.equals(that.taxnumber) : that.taxnumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (birthdate != null ? birthdate.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (taxnumber != null ? taxnumber.hashCode() : 0);
        return result;
    }
}
