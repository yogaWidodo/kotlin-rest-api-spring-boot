package belajar.backend.kotlin.spring.entity

import jakarta.persistence.*
import java.util.Date

@Entity
@Table(name = "products")
data class Product(
    @Id
    val id: String,

    @Column(name = "name")
    var name: String,

    @Column(name = "price")
    var price: Long,

    @Column(name = "quantity")
    var quantity: Int,

    @Column(name = "created_at")
    val createdAt: Date,

    @Column(name = "updated_at")
    var updatedAt: Date
)