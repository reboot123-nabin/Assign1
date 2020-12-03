package assignment

fun main(){
    println("enter a number")
    val no:Int= readLine()!!.toInt()

    if(no==1){
        print("Sunday")
    }
    else if(no==2){
        print("Monday")
    }
    else if(no==3){
        print("tuesday")
    }
    else if(no==4){
        print("wednesday")
    }
    else if(no==5){
        print("thursday")
    }
    else if(no==6){
        print("friday")
    }
    else{
        print("saturday")
    }

}