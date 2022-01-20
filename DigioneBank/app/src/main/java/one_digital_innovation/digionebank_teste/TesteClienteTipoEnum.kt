package one_digital_innovation.digionebank_teste

import one_digital_innovation.digonebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} e ${elemento.toString()}")

        ClienteTipo.values().forEach {
            println("$it.name}e $it.")

        }
    }
    val PJ = ClienteTipo.pj
    println("${PJ.name} ")

    val PF = ClienteTipo.pf
    println("${PF.name} ")
}