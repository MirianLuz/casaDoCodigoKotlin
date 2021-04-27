package br.com.zup.categories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&\u00a8\u0006\b"}, d2 = {"Lbr/com/zup/categories/CategoryRepository;", "Lio/micronaut/data/jpa/repository/JpaRepository;", "Lbr/com/zup/categories/Category;", "Ljava/util/UUID;", "existsByName", "", "name", "", "casaDoCodigoKotlin"})
@io.micronaut.data.annotation.Repository
public abstract interface CategoryRepository extends io.micronaut.data.jpa.repository.JpaRepository<br.com.zup.categories.Category, java.util.UUID> {
    
    public abstract boolean existsByName(@org.jetbrains.annotations.Nullable
    java.lang.String name);
}