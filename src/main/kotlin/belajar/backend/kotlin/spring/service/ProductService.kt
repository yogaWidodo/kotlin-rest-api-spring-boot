package belajar.backend.kotlin.spring.service

import belajar.backend.kotlin.spring.model.CreateProductRequest
import belajar.backend.kotlin.spring.model.ListProductRequest
import belajar.backend.kotlin.spring.model.ProductResponse
import belajar.backend.kotlin.spring.model.UpdateProductRequest

interface ProductService {

    fun create(createProductRequest: CreateProductRequest):ProductResponse

    fun get(id: String):ProductResponse

    fun update(id: String, updateProductRequest: UpdateProductRequest):ProductResponse

    fun delete(id: String)

    fun list(listProductRequest: ListProductRequest):List<ProductResponse>
}