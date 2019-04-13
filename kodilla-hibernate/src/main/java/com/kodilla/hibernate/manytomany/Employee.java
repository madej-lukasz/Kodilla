package com.kodilla.hibernate.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
@NamedQueries({
        @NamedQuery(
                name = "Employee.retrieveEmployeesWithLastName",
                query = "FROM Employee WHERE lastname = :LASTNAME"
        )
})

@Entity
@Table(name="EMPLOYESS")
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private List<Company> companies = new ArrayList<>();

    public Employee(){

    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "EMPLOYEE_ID", unique = true)
    public int getId(){
        return id;
    }
    @NotNull
    @Column(name = "FIRSTNAME")
    public String getFirstName(){
        return firstName;
    }
    @NotNull
    @Column(name = "LASTNAME")
    public String getLastName(){
        return lastName;
    }
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name="JOIN_COMPANY_EMPLOYEE",
            joinColumns = {@JoinColumn(name="EMPLOYEE_ID",referencedColumnName = "EMPLOYEE_ID")},
            inverseJoinColumns = {@JoinColumn (name="COMPANY_ID", referencedColumnName = "COMPANY_ID")}
    )
    public List<Company> getCompanies(){
        return companies;
    }
    private void setId(int id){
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private void setCompanies(List<Company> companies){
        this.companies = companies;
    }
}
