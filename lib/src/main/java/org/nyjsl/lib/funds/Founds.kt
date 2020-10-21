package org.nyjsl.lib.funds

import java.io.Console


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

    val map = mapOf("a" to 1,"b" to 2,"c" to 3)

    print(map["a"])

    val d = InitOrderDemo("abc")

}

class Person(){
    //一个主构造函数,一个或多个次构造函数
    var children:MutableList<Person> = mutableListOf()
    //次构造函数
    constructor(parent:Person) : this() {
        parent.children.add(this)
    }

}

class InitOrderDemo(par:String){
    var property = "First Property: ${par}".also(::println)
    init {
        println("First initializer block that prints $par")

    }
    var property2 = "Second Property: ${par.length}".also(::println)
    init {
        println("Second initializer block that prints ${par.length}")

    }
}

//默认情况下类都是final的 ,如果想让类可继承,必须使用open关键字标记

open class Base(p:Int){
    fun canNotOv(){
        print("222")
    }
    //方法可重载也需要open关键字标记
    open fun canOv(){
        print(111)
    }
}

class Derived(p:Int):Base(p){

    override fun canOv() {
        super.canOv()
        print(222)
    }

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