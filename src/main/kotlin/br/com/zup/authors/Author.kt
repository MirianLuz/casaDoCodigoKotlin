package br.com.zup.authors

import org.hibernate.annotations.Type
import java.time.LocalDateTime
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

@Entity
class Author (
    @field: NotBlank
    val name: String,

    @field: NotBlank
    @Column(unique = true)
    val email: String,

    @field: NotBlank
    val description: String,

    val createdAt: LocalDateTime = LocalDateTime.now()
        ){

    @Id
    @GeneratedValue
    @Type(type = "org.hibernate.type.UUIDCharType")
    val id: UUID? = null
}