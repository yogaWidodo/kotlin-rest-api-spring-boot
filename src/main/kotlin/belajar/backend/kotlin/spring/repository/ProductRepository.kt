package belajar.backend.kotlin.spring.repository

import belajar.backend.kotlin.spring.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository:JpaRepository<Product,String> {
}