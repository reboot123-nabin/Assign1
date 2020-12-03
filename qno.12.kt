package assignment



fun main() {
    //val a:Int=3
    //val b:Int=1
    //val c:Int=2
    println("Enter a number")
    val num: Int = readLine()!!.toInt()


    for(i in 1..10){

        val product = num * i
        println("$num * $i = $product")
    }
}





