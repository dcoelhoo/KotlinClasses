var saudacao: String = "Ola"

fun main() {

    //variaveis (var: mutavel vs val: imutavel)

    val nome: String = "Ana"
    println(nome)

    println(saudacao)


    //variavel que possa ser nula
    var aluno:String? = "Pedro"
    //aluno = null

    //inferencia automatica
    val carro = "Nissan"
    println(carro)


    //control Flow
    //IF Statement
    if (aluno != "Pedro"){
        println(saudacao + " " + aluno)
    } else {
        println("Boas " + aluno)
    }

    //switch aka When
    when(aluno){
        "Pedro" -> println("Boa noite Pedro")
        "Nuno" -> println("Boa tarde Nuno")
        else -> println("Ola Joana")
    }

    //Ternarios
    val sobremesa = if(aluno == "Pedro") "gelado" else "fruta"

    val aviao = when(aluno){
        "Pedro" -> "Boieng"
        else -> "Airbus"
    }

    println(sobremesa)
    println(aviao)


    //Concatenação de Strings
    //var msg = saudacao + " " + aluno
    var msg = "$saudacao $nome e  a palavra aluno tem ${nome.length} caracteres"
    println(msg)

    //Kotlin Basic Types
    val inteiro: Int = 1 //32 bits (~10 numeros)
    val longo: Long = 1232156465 //64 (~19 numeros)
    val umByte: Byte = 1 // 8 bits (~1 numero)
    val pequeno: Short = 123 //16 bits (~6 numeros)

    //numeros reais
    val pi: Float = 3.1415f //32 bits (~6-7 casas decimais)
    val e: Double = 2.721341 //64 bits (~15 casas decimais)
    val real = 5.312313

    //Boolean
    var verdadeiro: Boolean = true
    var falso = false
    println(verdadeiro)
    println(false)


}