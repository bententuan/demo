package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class ProductController(private val productRepository: ProductRepository) {
    @GetMapping("/getAll")
    fun getAllProduct() : List<Product> = this.productRepository.findAll()
}