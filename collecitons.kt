fun main()
{
    val f = listOf("apple","ando","banana","orange","grapes")
    with(f) {
        filter { it.startsWith('a') }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { (println(it)) }
    }


}

