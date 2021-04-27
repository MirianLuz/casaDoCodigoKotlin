package br.com.zup.authors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f\u00a8\u0006\u0013"}, d2 = {"Lbr/com/zup/authors/Author;", "", "name", "", "email", "description", "createdAt", "Ljava/time/LocalDateTime;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDateTime;)V", "getCreatedAt", "()Ljava/time/LocalDateTime;", "getDescription", "()Ljava/lang/String;", "getEmail", "id", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "getName", "casaDoCodigoKotlin"})
@javax.persistence.Entity
public final class Author {
    @org.jetbrains.annotations.Nullable
    @org.hibernate.annotations.Type(type = "org.hibernate.type.UUIDCharType")
    @javax.persistence.GeneratedValue
    @javax.persistence.Id
    private final java.util.UUID id = null;
    @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotBlank
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotBlank
    @javax.persistence.Column(unique = true)
    private final java.lang.String email = null;
    @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotBlank
    private final java.lang.String description = null;
    @org.jetbrains.annotations.NotNull
    private final java.time.LocalDateTime createdAt = null;
    
    @org.jetbrains.annotations.Nullable
    public final java.util.UUID getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.LocalDateTime getCreatedAt() {
        return null;
    }
    
    public Author(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String description, @org.jetbrains.annotations.NotNull
    java.time.LocalDateTime createdAt) {
        super();
    }
}