package br.com.girolneto.controllers

import br.com.girolneto.models.Todo
import br.com.girolneto.repositories.TodoRepository
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post

@Controller("/todos")
class TodoController(private val todoRepository: TodoRepository) {

    @Get
    fun getTodos(): List<Todo>{
        return todoRepository.findAll()
    }

    @Post
    fun addTodo(todo: Todo): HttpResponse<Todo>{
         return HttpResponse.created(todoRepository.save(todo))
    }
}