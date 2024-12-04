import java.util.*

fun main(){

    println("Kaça kadar fibonacci sayısı görmek istiyorsunuz")
    val number:Int= readln()!!.toInt()

    var first=0
    var second=1
    println(first)
    println(second)

    for (a in 3..number) {

        var next= first+second
        first=second
        second=next
        if (next>number) break
        println(next)


    }
}