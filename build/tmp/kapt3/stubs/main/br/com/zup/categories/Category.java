package br.com.zup.categories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lbr/com/zup/categories/Category;", "", "name", "", "(Ljava/lang/String;)V", "id", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "getName", "()Ljava/lang/String;", "casaDoCodigoKotlin"})
@javax.persistence.Entity
public final class Category {
    @org.jetbrains.annotations.Nullable
    @org.hibernate.annotations.Type(type = "org.hibernate.type.UUIDCharType")
    @javax.persistence.GeneratedValue
    @javax.persistence.Id
    private final java.util.UUID id = null;
    @org.jetbrains.annotations.NotNull
    @javax.validation.constraints.NotBlank
    @javax.persistence.Column(nullable = false, unique = true)
    private final java.lang.String name = null;
    
    @org.jetbrains.annotations.Nullable
    public final java.util.UUID getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    public Category(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
        super();
    }
}