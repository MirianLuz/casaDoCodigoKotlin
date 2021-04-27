package br.com.zup.categories

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.http.uri.UriBuilder
import javax.inject.Inject
import javax.validation.Valid

@Controller("/categories")
class CategoryController (@Inject val categoryRepository: CategoryRepository){

    @Post
    fun create(@Body @Valid request: NewCategoryRequest): HttpResponse<Any>{
        if(categoryRepository.existsByName(request.name)){
            return HttpResponse.badRequest("Category already registered")
        }

        val category = categoryRepository.save(request.toCategory())

        val uri = UriBuilder.of("/categories").expand(mutableMapOf(Pair("id", category.id)))

        return HttpResponse.created(uri)
    }
}