package one_digital_innovation.digonebank

data class Banco(
    val nome: String,
    val numero: Int){

    fun info()= "$nome e $numero"
}

