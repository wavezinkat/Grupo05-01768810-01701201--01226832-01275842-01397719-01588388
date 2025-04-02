class ContaBancaria(private var saldo: Double) {


    fun getSaldo(): Double {
        return saldo
    }


    fun depositar(valor: Double) {
        if (valor > 0) {
            saldo += valor
            println("Depósito de R$ $valor realizado com sucesso!")
        } else {
            println("Valor inválido para o depósito.")
        }
    }


    fun sacar(valor: Double) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor
            println("Saque de R$ $valor realizado com sucesso!")
        } else if (valor > saldo) {
            println("Saldo na conta insuficiente.")
        } else {
            println("Valor inválido para o saque.")
        }
    }


    fun consultarSaldo() {
        println("Saldo atual: R$ $saldo")
    }


    fun sair() {
        println("Saindo do aplicativo. Até logo!")
        // Aqui o programa será encerrado
        System.exit(0)
    }
}

fun main() {
    val conta = ContaBancaria(0.0)

    while (true) {

        println("\nMenu:")
        println("1. Depositar")
        println("2. Sacar")
        println("3. Consultar Saldo")
        println("4. Sair")
        println("Escolha uma opção acima (1-4): ")

        
        val opcao = readLine()?.toIntOrNull()

        when (opcao) {
            1 -> {
                print("Digite o valor a ser depositado: R$ ")
                val valor = readLine()?.toDoubleOrNull()
                if (valor != null) {
                    conta.depositar(valor)
                } else {
                    println("Valor inválido.")
                }
            }
            2 -> {
                print("Digite o valor a ser sacado: R$ ")
                val valor = readLine()?.toDoubleOrNull()
                if (valor != null) {
                    conta.sacar(valor)
                } else {
                    println("Valor inválido.")
                }
            }
            3 -> conta.consultarSaldo()
            4 -> conta.sair()
            else -> println("Opção inválida. Tente novamente.")
        }
    }
}