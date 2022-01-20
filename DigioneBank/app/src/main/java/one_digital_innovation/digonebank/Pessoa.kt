package one_digital_innovation.digonebank

class Pessoa {

    var nome: String = "Marcos"
    var cpf: String = "221.456.784-14"
    private set

}

fun Main(){
    val Marcos = Pessoa()
    print(Marcos.nome)
    print(Marcos.cpf)
}