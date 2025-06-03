package com.finance.financas

import com.finance.financas.MovimentacaoService
import retrofit2.Call
import retrofit2.http.*

interface MovimentacaoService {

    @GET("movimentacoes")
    fun listarMovimentacoes(): Call<List<Movimentacao>>

    @POST("movimentacoes")
    fun criarMovimentacao(@Body movimentacao: Movimentacao): Call<Movimentacao>

    @PUT("movimentacoes/{id}")
    fun atualizarMovimentacao(
        @Path("id") id: Long,
        @Body movimentacao: Movimentacao
    ): Call<Movimentacao>

    @DELETE("movimentacoes/{id}")
    fun deletarMovimentacao(@Path("id") id: Long): Call<Void>
}