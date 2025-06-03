package com.finance.financas

data class Movimentacao (
    val id: Long? = null,
    val descricao: String,
    val valor: Double,
    val tipo: String, // "RECEITA" ou "DESPESA"
    val data: String  // formato: "YYYY-MM-DD"
)

