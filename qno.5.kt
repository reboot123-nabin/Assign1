package assignment

fun main(){
    println("enter a number")
    val no:Int=readLine()!!.toInt()
    if(no>0 && no <=14){
        print("child")
    }
    else if(no>14 && no<=50){
        print("Young")
    }
    else if(no>50){
        print("old ")
    }
    else{
        print("invalid input")
    }

}