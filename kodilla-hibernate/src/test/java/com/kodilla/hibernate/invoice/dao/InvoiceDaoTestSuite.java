package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void InvoiceDaoTestSuite(){

        //Given
        Product product1 = new Product("Water");
        Product product2 = new Product("Bread");
        Product product3 = new Product("Butter");

        Item item1 = new Item(product1, new BigDecimal(1.50), 6, new BigDecimal(9));
        Item item2 = new Item(product2, new BigDecimal(2.0),2, new BigDecimal(4.0));
        Item item3 = new Item(product3, new BigDecimal(3.5), 1, new BigDecimal(3.5));

        Invoice invoice = new Invoice("1");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        //invoiceDao.delete(id)

    }
}
