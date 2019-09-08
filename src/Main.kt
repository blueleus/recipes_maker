import kotlin.system.exitProcess

fun main(args: Array<String>) {

    var recipes: MutableList<Any> = mutableListOf<Any>()

    do {
        println(":: Bienvenido a Recipe Maker ::")

        println("""
            Selecciona la opción deseada
            1. Hacer una receta
            2. Ver mis recetas
            3. Salir
        """.trimIndent()
        )

        var response: Int? = readLine()?.toInt()
        val ingredientsList: List<String> =
            listOf("Agua", "Leche", "Carne", "Verduras", "Frutas", "Cereal", "Huevos", "Aceite")
        val ingredientsString: String = """
            | 1.Agua
            | 2.Leche
            | 3.Carne
            | 4.Verduras
            | 5.Frutas
            | 6.Cereal
            | 7.Huevos
            | 8.Aceite
            | 0.Terminar
        """.trimIndent()

        when (response) {
            1 -> {
                var recipe: MutableList<String> = mutableListOf<String>()
                do {
                    println(ingredientsString)
                    var item: Int = readLine()?.toInt() ?: 0
                    if (item != 0) {
                        recipe.add(ingredientsList[item.minus(1)])
                    }
                } while (item != 0)
                recipes.add(recipe)
            }
            2 -> {
                for (recipe in recipes) {
                    println(recipe.toString())
                }
            }
        }
    } while (response != 3)
}