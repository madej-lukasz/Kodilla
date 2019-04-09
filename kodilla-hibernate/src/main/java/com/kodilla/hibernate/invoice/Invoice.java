package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "INVOICE")
public class Invoice {
    private int id;
    private String number;
    private List<Item> items = new ArrayList<>();

    public Invoice(int id){

    }

    public Invoice(String number) {
        this.number = number;
    }
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "INVOICE_ID", unique = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "INVOICE_NUMBER")
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "invoice",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY


    )


    @NotNull
    @Column(name = "ITEMS")
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
