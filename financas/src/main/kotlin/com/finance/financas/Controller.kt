package com.finance.financas

import com.finance.financas.MovimentacaoFinanceira
import com.finance.financas.service.MovimentacaoService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org. springframework.web.servlet.support.ServletUriComponentsBuilder
import java.net.URI

@RestController
@RequestMapping("/api/movimentacoes")
class MovimentacaoController(private val service: MovimentacaoService) {

    @GetMapping
    fun listar(): List<MovimentacaoFinanceira> = service.listarTodos()

    @GetMapping("/{id}")
    fun buscar(@PathVariable id: Long): ResponseEntity<MovimentacaoFinanceira> =
        ResponseEntity.ok(service.buscarPorId(id))

    @PostMapping
    fun criar(@RequestBody mov: MovimentacaoFinanceira): ResponseEntity<MovimentacaoFinanceira> {
        val salvo = service.salvar(mov)
        val uri: URI = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
            .buildAndExpand(salvo.id).toUri()
        return ResponseEntity.created(uri).body(salvo)
    }

    @PutMapping("/{id}")
    fun atualizar(@PathVariable id: Long, @RequestBody mov: MovimentacaoFinanceira): ResponseEntity<MovimentacaoFinanceira> =
        ResponseEntity.ok(service.atualizar(id, mov))

    @DeleteMapping("/{id}")
    fun deletar(@PathVariable id: Long): ResponseEntity<Void> {
        service.deletar(id)
        return ResponseEntity.noContent().build()
    }
}
