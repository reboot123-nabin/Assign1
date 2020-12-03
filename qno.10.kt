package assignment



fun main(){
    //val a:Int=3
    //val b:Int=1
    //val c:Int=2
    println("Enter a number")
    val a: Int=readLine()!!.toInt()
    println("Enter a number")
    val b: Int=readLine()!!.toInt()


    for(i in a..b)
        if(i%2!==0){
            println("odd no.:$i")
        }
}