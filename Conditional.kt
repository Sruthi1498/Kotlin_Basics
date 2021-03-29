fun max(a: Int, b: Int): Int
{
    return if(a>b)
        a
    else
        b
}

fun maxof(a:Int,b:Int) = if(a>b) a else b
fun main()
{
    println("maximum is ${maxof(5,6)}")
}