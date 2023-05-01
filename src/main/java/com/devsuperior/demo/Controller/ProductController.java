package com.devsuperior.demo.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import com.devsuperior.demo.entities.Department;
import com.devsuperior.demo.entities.Product;


@RestController
@RequestMapping(value = "/products")

public class ProductController {
    
    @GetMapping
    public List<Product> getObject(){

       
        var d1 = new Department(1L, "tech");
        var d2 = new Department(2L, "Pet");

        var p1 = new Product(1L, "MacbookPro", 4000.0, d1);
        var p2 = new Product(2L, "MacbookPro", 5000.0, d1);
        var p3 = new Product(3L, "MacbookPro", 300.0, d2);

        List<Product> List = Arrays.asList(p1,p2,p3);

        return List;
    }

}
