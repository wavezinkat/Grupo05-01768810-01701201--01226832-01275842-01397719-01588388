package com.finance.financas

import com.finance.financas.MovimentacaoService
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MovimentacaoRepository {

    private val retrofit = Retrofit.Builder()
        .baseUrl("http://10.0.2.2:8080/") // Para Android Emulator
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val service = retrofit.create(MovimentacaoService::class.java)

    fun listar(): Call<List<Movimentacao>> = service.listarMovimentacoes()

    fun salvar(mov: Movimentacao): Call<Movimentacao> =
        if (mov.id == null) service.criarMovimentacao(mov)
        else service.atualizarMovimentacao(mov.id, mov)

    fun deletar(id: Long): Call<Void> = service.deletarMovimentacao(id)
}
