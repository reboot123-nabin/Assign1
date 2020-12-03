package assignment



fun main(){
    println("enter a salary")
    val salary:Int= readLine()!!.toInt()
    var taxamount:Int=0
    val yearlysalary:Int=salary*12

    if(salary>1 && salary<=200000){
        taxamount=taxamount+(1/100*yearlysalary)
    }
    else if(salary>200000 && salary<=350000){
        taxamount=taxamount+(1/100*200000)+(15/100*(yearlysalary-200000))
    }
    else if (salary>350000){
        taxamount=taxamount+(1/100*200000)+(15/100*350000)+(25/100*(yearlysalary-350000))
    }
    println("amount of tax is:$taxamount")
}


