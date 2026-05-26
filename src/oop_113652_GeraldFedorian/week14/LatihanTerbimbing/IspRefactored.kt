package oop_113652_GeraldFedorian.week14.LatihanTerbimbing

interface Printable {
    fun print(doc: String)
}

interface Scannable {
    fun scan(doc: String): String
}

class ModernSimplePrinter: Printable {
    override fun print(doc: String) {println("Printing Securely: $doc")}
}