package com.mtProject.web;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/products")
public class ProductController {

  @GetMapping("")
  public ResponseEntity<String> getProducts() {
    return new ResponseEntity<String>("got", HttpStatusCode.valueOf(200));
  }
}
