package assignment

fun main(){
    //val a:Int=3
    //val b:Int=1
    //val c:Int=2
    println("Enter a number")
    val num=readLine()!!.toInt()

    val arr=IntArray(4)
    for(i in arr.indices){
        print("enter ${i+1} elements")
        arr[i]= readLine()!!.toInt()
    }
    var great=arr[0]
    var small=arr[0]
    for(i in arr.indices){
        if(arr[i]>great){
            great=arr[i]
        }
        if(arr[i]<small){
            small=arr[i]
        }
    }
    println("The greatest number in the array:$great")
    println("The smallest number in the array:$small")

}