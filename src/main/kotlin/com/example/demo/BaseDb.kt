package com.example.demo

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class BaseDb(private val productRepository: ProductRepository) : CommandLineRunner {
    override fun run(vararg args: String?) {
        this.productRepository.deleteAll()
        val fruit = Product(name = "fruit",price = 1.1,des = "this is fruit")
        val toy = Product(name = "toy",price = 2.2,des = "this is toy")
        val car = Product(name = "car",price = 3.3,des = "this is car")
        val plant = Product(name = "plant",price = 4.4,des = "this is plant")
        this.productRepository.save(fruit)
        this.productRepository.save(toy)
        this.productRepository.save(car)
        this.productRepository.save(plant)
    }
}