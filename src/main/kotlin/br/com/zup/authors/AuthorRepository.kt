package br.com.zup.authors

import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository
import java.util.*

@Repository
interface AuthorRepository : JpaRepository <Author, UUID> {
    fun existsByEmail(email: String?): Boolean

}