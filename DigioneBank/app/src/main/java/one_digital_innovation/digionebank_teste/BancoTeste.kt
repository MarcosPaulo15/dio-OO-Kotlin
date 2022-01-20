package one_digital_innovation.digonebank_teste

import one_digital_innovation.digonebank.Banco

fun main(){
val digiOneBank = Banco(nome = "Digione", numero = 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 = digiOneBank.copy(nome= "banco1")

    println(digiOneBank.info())
}