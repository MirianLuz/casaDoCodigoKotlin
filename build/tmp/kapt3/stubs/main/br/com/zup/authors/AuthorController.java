package br.com.zup.authors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lbr/com/zup/authors/AuthorController;", "", "authorRepository", "Lbr/com/zup/authors/AuthorRepository;", "(Lbr/com/zup/authors/AuthorRepository;)V", "getAuthorRepository", "()Lbr/com/zup/authors/AuthorRepository;", "create", "Lio/micronaut/http/HttpResponse;", "request", "Lbr/com/zup/authors/NewAuthorRequest;", "casaDoCodigoKotlin"})
@io.micronaut.http.annotation.Controller(value = "/authors")
public class AuthorController {
    @org.jetbrains.annotations.NotNull
    @javax.inject.Inject
    private final br.com.zup.authors.AuthorRepository authorRepository = null;
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Post
    public io.micronaut.http.HttpResponse<java.lang.Object> create(@org.jetbrains.annotations.NotNull
    @javax.validation.Valid
    @io.micronaut.http.annotation.Body
    br.com.zup.authors.NewAuthorRequest request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public br.com.zup.authors.AuthorRepository getAuthorRepository() {
        return null;
    }
    
    public AuthorController(@org.jetbrains.annotations.NotNull
    br.com.zup.authors.AuthorRepository authorRepository) {
        super();
    }
}