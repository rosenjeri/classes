fun main(args: Array<String>) {
    var i = 0
    var num = 0
    //Empty String
    var primeNumbers = ""
    i = 1
    while (i <= 10000) {
        var counter = 0
        num = i
        while (num >= 1) {
            if (i % num == 0) {
                counter = counter + 1
            }
            num--
        }
        if (counter == 2) {
            //Appended the Prime number to the String
            primeNumbers = "$primeNumbers$i "
        }
        i++
    }
    println("Prime numbers from 1 to 10000 are :")
    println(primeNumbers)
}