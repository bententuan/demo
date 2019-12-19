package com.example.demo

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "Product")
data class Product (
        @Id
        var id : String? = "",
        val name : String,
        val price : Double,
        val des : String
)