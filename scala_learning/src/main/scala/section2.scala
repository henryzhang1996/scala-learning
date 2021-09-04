package main.scala

object section2{
  def main(args: Array[String]): Unit = {
    /* step3 function */
    def max(x:Int,y:Int):Int = {
      if(x > y) x
      else y
    }
    //println(max(3,4))

    def greet() = println("Hello world!")
    //greet()

    /* step4 arguement */
    //println("Hello," + args(0) + "!")

    /* step5 while */
    var i = 0
    while(i < 5){
      //println(i)
      i+= 1
    }

    /* step6 foreach for */
    var args = "hello world 123 nice"
    //args.foreach(args => println(args))
    for(arg<-args)
      println(arg)

  }
}
