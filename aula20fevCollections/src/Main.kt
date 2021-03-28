fun main() {
    //Coleções (Array, List, Map)

    //Array
    //Declaração

    val hobbies = arrayOf("Programar", "Gaming", "Comer", "Ver series", "Dormir")

    println(hobbies[1])
    println(hobbies.get(1))
    println(hobbies.size)

    //Iterar sobre todos os valores do Array e imprimir os mesmos
    for (passatempo in hobbies){
        println(passatempo)
    }

    println("-----------------------")

    //metodo de Interação mais funcional (tipo javascript)
    hobbies.forEach { passatempo ->
        println(passatempo)
    }
    print("-".repeat(20))
    hobbies.forEachIndexed { index, passatempo ->
        println("O $passatempo está na posição $index")
    }


    //Listas
    //Declaração
    var livros = listOf("Design Patterns", "Clean Code", "Kotlin")

    livros.forEach{
        println(it)
    }

    //Map (relação entre chave : valor)
    //Declaração
    val contactos = mapOf("Ana" to 91, "Pedro" to 93, "Marta" to 96)
    contactos.forEach{ key, value ->
        println("O número da $key é $value")
    }

     println(contactos.keys)
     println("o contacto da Marta  é : " + contactos["Marta"])
     println("o contacto do Pedro  é : ${contactos["Pedro"]}")


    //tipos de dados
    val xpto = listOf("oi", 1234, true)
    xpto.forEach {
        println(it)
    }

    //As coleções por default são imutaveis.

    //Coleções mutáveis
    val bebidas = mutableListOf("Sumol", "7up", "Água")
    bebidas.add("Guaraná")
    bebidas.forEach {
        println(it)
    }

    val frutas = mutableMapOf(1 to "Laranja", 2 to "Maça", 10 to "Pera")
    frutas.put(4, "Kiwi")

    //ex.
    //Desenvolva uma função que receba dois argumentos, um relativo a uma saudação e um segundo que é uma lista de alunos
    //A funçãodevera imprimir uma saudação a todos os alunos
    fun sayHello(saudacao: String, alunos: List<String>){
        alunos.forEach { aluno ->
            println("$saudacao $aluno")
        }
    }

    val alunos = listOf("Maria", "Pedro", "José")
    sayHello("Ola", alunos)



}

