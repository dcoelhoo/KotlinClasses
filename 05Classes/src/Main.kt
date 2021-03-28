fun main(){
    val aluno = Aluno()

    val aluno3 = Aluno3("João", "Pires")
    println(aluno3.nome)
    println(aluno3.apelido)

    val aluno4 = Aluno3("Joana", "Maças")
    println(aluno3.nome)
    println(aluno3.apelido)

    println("-".repeat(20))

    val aluno5 = Aluno5("Paulo", "Ramos")

    println("-")

    val aluno5_v2 = Aluno5()

    println("*".repeat(20))

    val aluno5_multiple1 = Aluno5_multiple("Maria", "Gomes")
    println("*")
    val aluno5_multiple2 = Aluno5_multiple("José")
    println("*")
    val aluno5_multiple3 = Aluno5_multiple("Corais", 25)
    println("*")
    val aluno5_multiple4 = Aluno5_multiple(true)

    println("-".repeat(20))
    val aluno6_a = Aluno6("Pedro", "Marques")
    val aluno6_b = Aluno6(nome = "João")
    val aluno6_c = Aluno6(apelido = "Tomé")
    println("-".repeat(20))

    val  aluno7 = Aluno7()
    aluno7.alcunha = "Ninja"
    println(aluno7.alcunha)

    println("-".repeat(20))
    val aluno8 = Aluno8()
    aluno8.imprimirInfo()

    println("-".repeat(20))
    val aluno9_pub = ALuno9_pub()
    val aluno9_int = ALuno9_int()
    //val aluno9_priv = Aluno9_priv() //nao funciona

    val aluno9 = Aluno9()
    aluno9.alcunhaSetter("Morais")
    println(aluno9.alcunhaGetter())

}

