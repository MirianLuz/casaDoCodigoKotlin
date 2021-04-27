package br.com.zup.authors

import io.micronaut.core.annotation.Introspected
import java.time.LocalDateTime
import javax.persistence.Column
import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Introspected
data class NewAuthorRequest(

    @field: NotBlank
    val name: String,

    @field: NotBlank
    @field: Email
    @Column(unique = true)
    val email: String,

    @field: NotBlank
    @field: Size(max = 400)
    val description: String
){
    fun toModel(): Author{
        return Author(name, email, description)
    }
}
