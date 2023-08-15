package com.kodilla.hibernate.invoice.dao;


import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;


    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product product1 = new Product("Product#1");
        Product product2 = new Product("Product#2");
        Product product3 = new Product("Product#3");
        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);


        Item item1 = new Item(product1, new BigDecimal(111), 1, new BigDecimal(1111));
        Item item2 = new Item(product2, new BigDecimal(222), 1, new BigDecimal(2222));
        Item item3 = new Item(product3, new BigDecimal(333), 1, new BigDecimal(3333));

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);

        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);

        Invoice invoice = new Invoice("2023_08", items);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        assertNotEquals(0, invoiceId);

        //CleanUp
        invoiceDao.deleteById(invoiceId);
    }
}
