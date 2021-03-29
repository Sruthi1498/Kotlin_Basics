open class Lion(val name: String, val id:Int) {
    fun show() {
        println("$name and $id")
    }
}

class Animal(name: String, id:Int): Lion(name= name, id=id)
{
    fun main()
    {
        val obj: Lion = Animal("hello",12)
    }
}