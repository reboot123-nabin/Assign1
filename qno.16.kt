package assignment

fun main(){
    //val a:Int=3
    //val b:Int=1
    //val c:Int=2
    println("Enter a number")
    val arr=IntArray(4)
    var sum=0
    for(i in arr.indices){
        arr[i]= readLine()!!.toInt()
    }

    for(i in arr.indices){
        if(arr[i]%2==0) {
            sum=sum+arr[i]
            println("even no.:$sum")
        }
    }


}