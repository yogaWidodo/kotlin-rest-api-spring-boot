package belajar.backend.kotlin.spring.error

import org.springframework.web.client.HttpClientErrorException.Unauthorized

class UnauthorizedException:Exception() {
}