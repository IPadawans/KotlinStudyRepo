package br.com.girolneto.repositories

import br.com.girolneto.models.Todo
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface TodoRepository : JpaRepository<Todo, Long> {

}
