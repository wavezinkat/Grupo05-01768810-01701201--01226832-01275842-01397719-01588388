package com.seuapp.financas.model

import jakarta.persistence.*
import java.math.BigDecimal
import java.time.LocalDate

@Entity
@Table(name = "movimentacoes")
data class MovimentacaoFinanceira(

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	val id: Long = 0,

	@Column(nullable = false)
	val nome: String,

	@Column(nullable = false)
	val tipo: String, // "entrada" ou "saida"

	@Column(nullable = false)
	val valor: BigDecimal,

	@Column(nullable = false)
	val data: LocalDate,

	val categoria: String? = null
)
