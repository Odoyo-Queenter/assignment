fun main() {

    var campus = "akirachix"
    var char1 = campus[0]
    var char2 = campus[2]
    var char3 = campus[3]
    var outcome = "$char1$char2$char3"
    println(outcome)

    var words = comp("Queenter",24)
    println(words)
    var String = "Achieng"
    println("the length of my name is "+String.length)

    var nails = "kimberly"
    if (nails=="faith")
        println("thats me")
    else{
        println("thats not me")
    }
}
fun comp(name:String,age:Int):String{
  var sentence = "Hi,my name is $name $age years"
    return sentence

}