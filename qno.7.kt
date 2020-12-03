package assignment

fun main(){
    print("enter first number")
    val num: Int=readLine()!!.toInt()
    convert(num)

}
fun convert (num:Int){
    when(num){
        1->print("one")
        2->print("two")
        3->print("three")
        4->print("four")
        5->print("five")
        6->print("six")
        7->print("seven")
        8->print("eight")
        9->print("nine")
        0->print("zero")
        else -> {
            print("enter single digit number")
        }

    }
}