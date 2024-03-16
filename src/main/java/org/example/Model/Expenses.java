package org.example.Model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Expenses")
public class Expenses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Amount")
    private double amount;

    @Column(name = "Category")
    private String category;

    @Column(name = "Description")
    private String description;

    @Column(name = "CreatedAt")
    private LocalDate createdAt;

    @Column(name = "InvoiceUrl")
    private String invoiceUrl;

    @Column(name = "UpdatedAt")
    private LocalDate UpdatedAt;


    //Getter and Setter methods:

    public String description(){
        return this.description;
    }

    public void setName(String description){
        this.description = description;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public String getInvoiceUrl() {
        return invoiceUrl;
    }

    public void setInvoiceUrl(String invoiceUrl) {
        this.invoiceUrl = invoiceUrl;
    }

    public LocalDate getUpdatedAt() {
        return UpdatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        UpdatedAt = updatedAt;
    }


}
