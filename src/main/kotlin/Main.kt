fun main(){
   println(printName())
    sentence("Elizabeth", 21)
    fact("")
    word("Lucy")



}
fun printName(){
    var name = "AkiraChix"
    println(name[0] .toString() +name[2] +name[3])
}
fun sentence(name:String, age:Int):String{
    var value= "Hi, my name is $name and i am $age years old"

    return value

}
fun fact(name: String) : Int{
    val name = "reading novels"
    return name.length


}
fun word(name: String){
    if (name =="Lucy"){
        println("That's me!")}

        else{
          println( "I don't know who that is")
    }

}


