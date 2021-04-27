package br.com.zup.authors

import io.micronaut.http.HttpMethod
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.http.uri.UriBuilder
import javax.inject.Inject
import javax.validation.Valid

@Controller("/authors")
class AuthorController(@Inject val authorRepository: AuthorRepository) {

    @Post
    fun create(@Body @Valid request: NewAuthorRequest): HttpResponse<Any>{

       if(authorRepository.existsByEmail(request.email)){
            return HttpResponse.badRequest("E-mail already registered")
        }

        val author = authorRepository.save(request.toModel())

        val uri = UriBuilder.of("/authors").expand(mutableMapOf(Pair("id", author.id)))

        return HttpResponse.created(uri)
    }
}