package belajar.backend.kotlin.spring.config

import belajar.backend.kotlin.spring.entity.ApiKey
import belajar.backend.kotlin.spring.repository.ApiKeyRepository
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class ApiKeySeeder(val apiKeyRepository:ApiKeyRepository):ApplicationRunner {

    val apikey = "Secret"

    override fun run(args: ApplicationArguments?) {
        if (!apiKeyRepository.existsById(apikey)){
            val entity = ApiKey(id = apikey)
            apiKeyRepository.save(entity)
        }
    }

}