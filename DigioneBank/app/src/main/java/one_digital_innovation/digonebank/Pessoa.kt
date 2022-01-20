package one_digital_innovation.digonebank

class Pessoa {

    var nome: String = "Marcos"
    var cpf: String = "221.456.784-14"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"


}

fun Main(){
    val Marcos = Pessoa()
    print(Marcos.pessoaInfo())
}