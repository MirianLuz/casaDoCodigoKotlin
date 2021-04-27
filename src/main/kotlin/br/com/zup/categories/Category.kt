package br.com.zup.categories

import org.hibernate.annotations.Type
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.validation.constraints.NotBlank

@Entity
class Category (

    @field:NotBlank
    @Column(nullable = false, unique = true)
    val name: String
        ){

    @Id
    @GeneratedValue
    @Type(type = "org.hibernate.type.UUIDCharType")
    val id: UUID? = null
}