package com.Nehuen_Elizeche.topic_5_f.service;

import com.Nehuen_Elizeche.topic_5_f.model.Product;
import com.Nehuen_Elizeche.topic_5_f.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.Objects;

@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public void deleteProduct(@PathVariable("id")Integer userid ) {
        boolean exists= productRepository.existsById(userid);
        if(!exists){
            throw  new IllegalStateException(
                    "user with id" + userid + "does not exists");
        }

        productRepository.deleteById(userid);
    }

    public void addNewProduct(String name, LocalDate duedate) {
        if(name != null &&
                name.length() > 0 ){
            if (duedate != null )
             {

                Product n = new Product();
                n.setProductname(name);
                n.setDuedate(duedate);
                productRepository.save(n);
            }
        }

    }
    @Transactional
    public void updateProduct(Integer productid, String name, LocalDate duedate) {
        Product product = productRepository.findById(productid).orElseThrow(() ->  new IllegalStateException(
                "user with id" +productid+ "does not exist"
        ));
        if (name != null && name.length() >0 &&
                !Objects.equals(product.getProductname(), name)){
            product.setProductname(name);
        }
        if (duedate != null  &&
                !Objects.equals(product.getDuedate(), duedate)){
            product.setDuedate(duedate);
        }

    }
}
