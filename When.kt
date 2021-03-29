import javafx.scene.chart.ValueAxis

fun des(obj:Any) : String =
    when(obj)
    {
        1 -> "one"
        "hello" -> "hello man"
        is Long -> "long man"
        is Int -> "int"
        else -> "other"


    }
fun main()
{
    println(des(1))
    println(des("hello"))
    println(des(1000L))
    println(des(9))
    println(des("other"))
    var x = 0
    var y = 6
    for(x in x..y) {
        println(x)
        //x++
    }

    for(x in 1..5)
        println(x)

}
