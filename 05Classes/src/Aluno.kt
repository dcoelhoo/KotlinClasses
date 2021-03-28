class Aluno

class Aluno2()

class Aluno3(_nome: String, _apelido: String){

    var nome: String = _nome
    var apelido: String = _apelido

}

class Aluno4(var nome: String, var apelido:String)



class Aluno5(var nome: String, var apelido: String){

    init {
        println("init 1")
    }

    constructor(): this("Manuel", "Afonso") {
        println("segundo construtor")
    }

    init {
        println("init 2")
    }
}

class Aluno5_multiple(var nome: String, var apelido: String){

    constructor(_nome:String): this(_nome, "Sem apelido"){
        println("Segundo Construtor")
    }

    constructor(_apelido:String, idade: Int): this("Sem nome", _apelido){
        println("Terceiro Construtor")
    }

    constructor(vdd: Boolean): this("Sem nome", "Sem apelido"){
        println("Quarto construtor")
    }
}

    //Default parameter values
class Aluno6(var nome: String = "Ana", var apelido: String = "Mendes")

    //Getters e Setters
class Aluno7(var nome: String = "Ana", var apelido: String = "Mendes"){
    var alcunha: String? = null
        set(value) {
            field = value
            println("A nova alcunha é $value")
        }
        get(){
            println("O valor a devcolver é $field")
            return field
        }

}

//Metodos
class Aluno8(var nome: String = "Ana", var apelido: String = "Mendes"){
    var alcunha:String? = null

    fun imprimirInfo(){
        //println("$nome $apelido $alcunha")
        //val alcunhaParaImprimir = if (alcunha != null) alcunha else "sem alcunha"
        //println("$nome $alcunhaParaImprimir $apelido")

        //Elvis Operator
        val alcunhaParaImprimir = alcunha ?: "sem alcunha"
        println("$nome $alcunhaParaImprimir $apelido")
    }

}

//Visibilidade das classes
public class ALuno9_pub(val nome:String = "José") //default
internal class ALuno9_int(val nome:String = "José") //é publica dentro do modulo
private class ALuno9_priv(val nome:String = "José") //Só é visivel no ficheiro onde está implementado

//Visibilidade dos Atributos
class Aluno9(val nome: String = "José"){
    private var idade: Int? = null
    protected var alcunha: String? = null

    fun alcunhaGetter(): String? {
        return alcunha
    }

    fun alcunhaSetter(_alcunha: String?) {
        this.alcunha = _alcunha
    }


}

//Herança
class Pessoa(var nome: String, var apelido: String? = null){
    private var idade: Int? = null
    protected var profissao: String? = null
}

class Professor(_nome: String): Pessoa(_nome){
    var xpto: String? = super.
}
