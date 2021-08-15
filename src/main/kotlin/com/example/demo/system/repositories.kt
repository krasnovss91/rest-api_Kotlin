package com.example.demo.system

import org.springframework.data.repository.*
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository : CrudRepository<Product, Long> // Дает нашему слою работы с данными весь набор CRUD операций