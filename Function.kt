class rect(var h: Double, var l: Double)
{
    var perimeter = (h+l)*2;
}
fun main()
{
    val r = rect(5.0,3.0)
    println("${r.perimeter}")
}