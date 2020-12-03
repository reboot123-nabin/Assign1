package assignment

fun main(){
    println("enter a number")
    val no=readLine()!!.toInt()
    if(no>0){
        print("It is a positive no.")
    }
    else if(no<0){
        print("It is a negative no.")
    }
    else{
        print("It is a zero no.")
    }

}