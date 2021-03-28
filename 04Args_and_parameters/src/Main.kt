fun ementaDoDia(hora: String, refeicoes: List<String>){
    println("------Ementa-------")
refeicoes.forEach{ prato ->
    println("Ao $hora vai ser servido $prato")
}
}

fun ementaDoDia2(hora: String, vararg refeicoes: String){
    println("------Ementa2-------")
    refeicoes.forEach{ prato ->
        println("Ao $hora vai ser servido $prato")
    }
}


fun main(){

    //Var Args - variable arguments
    val listaDeRefeicoes = listOf("Peixe Cozido", "Iogurte de Bacalhau", "Lasanha")
    ementaDoDia("Almoço", listaDeRefeicoes)
    ementaDoDia("Jantar", listOf())

    ementaDoDia2("Jantar", "Ribs", "Marisco", "Feijoada")
    ementaDoDia2("Jantar")

    //Spread Operator *
    //ementaDoDia2("Peq. Almoço", *listaDeRefeicoes) //nao funciona com listas (por causa da JVM)

    val novaListaDeRefeicoes = arrayOf("Pizza", "Hamburguer", "Tacos")
    ementaDoDia2("Almoço", *novaListaDeRefeicoes)
    ementaDoDia2("Jantar", *listaDeRefeicoes.toTypedArray())

    //Named Arguments

    fun nomeDoanimal(animal : String, nome: String) = println("O $animal é conhecido por $nome")

    nomeDoanimal("Cão", "Cãocrodilo")
    nomeDoanimal(animal = "Gato", nome = "Choonker")
    nomeDoanimal(nome = "CrazyHorse", animal = "Peixe")

    //Default Paremeter Values

    fun nomeDoanimal2(animal : String = "Cobra", nome: String = "Python") = println("O $animal é conhecido por $nome")
    nomeDoanimal2()
    nomeDoanimal2(animal = "Snake")
    nomeDoanimal2(nome = "Rasteirinha")

    //exemplos
    ementaDoDia2(hora = "Almoço", refeicoes = *novaListaDeRefeicoes)
    ementaDoDia2(refeicoes = *novaListaDeRefeicoes, hora = "Jantar")
}