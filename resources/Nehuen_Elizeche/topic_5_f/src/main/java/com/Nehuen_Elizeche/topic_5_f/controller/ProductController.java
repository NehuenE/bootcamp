package com.Nehuen_Elizeche.topic_5_f.controller;

import com.Nehuen_Elizeche.topic_5_f.model.Product;
import com.Nehuen_Elizeche.topic_5_f.repository.ProductRepository;
import com.Nehuen_Elizeche.topic_5_f.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/Product")
public class ProductController {

    private ProductService productService;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    public ProductController (ProductService productService){
        this.productService = productService;
    }

    @GetMapping(path="/all")
    public @ResponseBody
    Iterable<Product> getAllProducts (){
        return productRepository.findAll();
    }
    @PostMapping(path="/add")
    public void addNewProduct (@RequestParam String name,@RequestParam LocalDate duedate  ){
        productService.addNewProduct(name, duedate);

    }
    @PutMapping("/update/{productid}")
    public void updateProduct(
            @PathVariable ("productid")Integer id,
            @RequestParam String name,
            @RequestParam LocalDate duedate) {
        productService.updateProduct(id, name, duedate);
    }


    @DeleteMapping(path="/del/{id}")
    public void deleteProduct(@PathVariable ("id") Integer productid){

        productService.deleteProduct(productid);
    }
}
