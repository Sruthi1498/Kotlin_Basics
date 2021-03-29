fun main()
{
    val items = listOf("apple","dosa","idli")
    for (item in items.indices)
    {
        println("${items[item]} in $item")
    }
}