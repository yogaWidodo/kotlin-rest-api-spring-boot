package belajar.backend.kotlin.spring.controller

import belajar.backend.kotlin.spring.error.NotFoundException
import belajar.backend.kotlin.spring.error.UnauthorizedException
import belajar.backend.kotlin.spring.model.WebResponse
import jakarta.validation.ConstraintViolationException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ErrorController {

    @ExceptionHandler(value = [ConstraintViolationException::class])
    fun validationHandler(constraintViolationException: ConstraintViolationException): WebResponse<String> {
        return WebResponse(
            code = 400,
            status = "BAD REQUEST",
            data = constraintViolationException.message!!
        )

    }

    @ExceptionHandler(value = [NotFoundException::class])
    fun notFoundHandler(exception: NotFoundException): WebResponse<String> {
        return WebResponse(
            code = 404,
            status = "NOT FOUND",
            data = "Not Found"
        )
    }

    @ExceptionHandler(value = [UnauthorizedException::class])
    fun unauthorizedException(exception: UnauthorizedException): WebResponse<String> {
        return WebResponse(
            code = 401,
            status = "Unauthorized",
            data = "Please put your X-Api-Key"
        )
    }
}