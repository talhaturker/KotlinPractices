
fun calcFact(number:Int): Long {
    var result:Long=1

    for (it in 1..number){

        result=it*result

    }
    return result}


fun main(){

    println("Faktöriyelini almak istediğiniz sayıyı giriniz")
    val fakt:Int= readln()!!.toInt()

    val result=calcFact(fakt)

    print("$fakt faktöriyeli -> $result")



}