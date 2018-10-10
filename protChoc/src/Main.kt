fun main(args: Array<String>) {
    val boxOfChocolate = RandomBox<Chocolate>(arrayListOf<Chocolate> {
        Chocolate( “Chocolate 1”, 100, “Cereza”),
        Chocolate(“Chocolate 2”, 100,“Licor”),
        Chocolate(“Chocolate 3”, 100, “Nuez”)
        }
            val forrest = ForrestGump<Chocolate>(boxOfChocolate):
    println(forrest.sayTheLineForrest())
    println(forrest.sayTheLineForrest())
    println(forrest.sayTheLineForrest())
    println(forrest.sayTheLineForrest())
    println(forrest.sayTheLineForrest())
}
