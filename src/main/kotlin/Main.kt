fun main(){
val school = "akirachix"
    println(school[0] +""+school[2]+""+school[3])
    var z = aboutme("Marisah", 20)
println(z)
    length("home")

}
fun aboutme(name: String,age: Int):String{
    var result =("Hi my name is $name and I am $age years old")
    return result

}
fun length(z: String): Int{
    var p = z.length
    println(p)
    return p

}
fun thatsme(name: String){
    if(name=="Mary")
        println("Thats me!")
    else("I dont know who was that")

}


