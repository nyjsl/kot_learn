package org.nyjsl.lib.funds


fun main() {
    println("Hello World!")

    val f = Founds()
    val sum = f.sum(1, 2)
    print(sum)

    val a = 3

    val b: Int
    b = 5

    var x:String
    x = "xx"

}


/**
 *    @author : weixing
 *    @date   : 2020/10/16
 */
class Founds {


    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun sum1(a: Int, b: Int) = a + b

    fun printSum(a:Int ,b:Int){
        println("a is$a and b is $b result is ${a+b}")
    }

    fun maxOf(a:Int ,b:Int) = if(a>b) a else b

    fun desc(obj:Any):String = when(obj){
        1 -> "One"
        "hello" -> "Greeting"
        else -> "Unknown"
    }

}