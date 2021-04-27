package br.com.zup.categories

import io.micronaut.core.annotation.Introspected
import javax.validation.constraints.NotBlank

@Introspected
data class NewCategoryRequest(
    @field: NotBlank
    val name: String
){
    fun toCategory():Category{
        return Category(name)
    }
}
