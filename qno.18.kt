package assignment

fun main(){
    println("this is a dictionary app")
    dicttest()
}

fun dicttest(){
    val diction=mapOf(
            "function" to "a function is  a combination of instruction",
            "class" to "A class is a blueprint of an objects ",
            "object" to "Objects can communicate with well-defined integer",
        "Array" to "An array is a collection of data items accessing using a common name"
    )
    println("Find meanings of those words:$(diction.keys}")
    println("What do you want to know about?")
    val meanings= readLine()!!
    println("$diction{meaning}")
}