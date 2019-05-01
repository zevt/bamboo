package com.zeroexception.common.bamboo.controller;


import com.zeroexception.common.bamboo.model.Product;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpRestApi {


  @GetMapping("/products")
  public ResponseEntity<?> getProducts() {
    List<Product> list = new ArrayList<>();

    Product product = new Product(Instant.now().toEpochMilli() + "",
        "Product A", "Awesome product for A players");
    list.add(product);
    product = new Product(Instant.now().toEpochMilli() + "",
        "Product B", "Awesome product for B players");
    list.add(product);
    return new ResponseEntity<>(list, HttpStatus.OK);
  }

}
