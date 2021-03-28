//Funções
//Declaracao tradicional
fun getHello(): String{
    return "Olá Kotlin"
}

//Ausencia de retorno(tipo void)
fun printHello(): Unit {
    println("Ola Alunos")
}

fun printHello2() {

}

//Retorno de um vazio (null)
fun getEmptyHello(): String? {
    return null
}

//Funcoes de expressao unica
fun getSimpleHello(): String = "Hello Classroom"
fun getSimpleHello2() = "Olá turma"

//Funcoes com parametros
fun sayGoodMorning(aluno:String): String { //parametro = "(aluno:String)"
    return "Bom dia $aluno"
}

//Funcao de expressao unica com 2 parametros
fun sayGood(saudacao: String, aluno:String) = "$saudacao $aluno"

//Funcao expressao unica que retorne avaliacao se um número é impar
fun numImpar(x:Int): Boolean = (x % 2 !=0)

fun main() {

    println(getHello())
    printHello()
    println(getEmptyHello())
    println(getSimpleHello())
    println(getSimpleHello2())
    println(sayGoodMorning("Ricardo"))
    println(sayGoodMorning(aluno = "Teresa"))
    println(sayGood("Boas", "José"))
    println(numImpar(5))

}