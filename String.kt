fun main() {
    var a = 8;
    val str = "a is $a"

    a = 0;
    val sr1 = "a ${str.replace("is", "was")}, now is $a"
    println(sr1)
}