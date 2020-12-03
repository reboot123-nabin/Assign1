package assignment

fun main(){
    print("please enter a number:")
    val rows:Int= readLine()!!.toInt()
    asterisk(rows)
}
fun asterisk(rows:Int){
    for(i in 1..rows){
        for(j in 1..i){
            print("*")
        }
        println()
    }
}