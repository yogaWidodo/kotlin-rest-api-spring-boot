package belajar.backend.kotlin.spring.repository

import belajar.backend.kotlin.spring.entity.ApiKey
import org.springframework.data.jpa.repository.JpaRepository

interface ApiKeyRepository :JpaRepository<ApiKey,String> {
}