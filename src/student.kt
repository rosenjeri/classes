class Student{
    var courses = ""
    var units = ""
    var fees = 0
}
fun main(){
    val c1 = Student()
    c1.courses = "Mit"
    c1.units = "unit 2"
    c1.fees = 48000

    println(c1.courses)
    println(c1.units)
    println(c1.fees)
}