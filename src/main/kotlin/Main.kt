fun main() {
    var result=fun edit("Barnie bakes brown bagels and buns")
    var sum =fun numbers()
}


fun edit(x:String){
    var result = x.slice(0, 7, 13, 19)
    println(result)
}
fun number(b:Array<Int>):Int{
    var sum= b.sum()
    println(sum)
    var count= b.count()
    println(count)
    var average= b.average()
    println(average)



}