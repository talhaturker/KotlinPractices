fun calcUs(x:Int,y:Int):Number{
    var result = x
    repeat(y-1){
        result*=x
    }
    return result
}

fun main(){
    println("Üssünü almak istediğiniz sayıyı giriniz")
    val x= readln()!!.toInt()

    println("Kaçıncı üssünü almak istersiniz")
    val y= readln()!!.toInt()

    val result=calcUs(x,y)

    print(result)
}