package main.scala
object section3 {
  def main(args: Array[String]): Unit ={
    /* step7  parametrize array */
    val a:Array[String] = new Array[String](3)
    //a(0) = "c"
    //a(1) = "s"
    //a(2) = "d"
    a.update(0,"c")
    a.update(1,"s")
    a.update(2,"d")
    for(i <- 0 to 2){
      //println(a(i))
    }

    /* step8 list :::(connect)/::(add) */
    var oneTwoThree = List(1,2,3)
    val oneTwo = List(1,2)
    val threeFour = List(3,4)
    oneTwoThree = oneTwo ::: threeFour
    //println(oneTwo + "and" + threeFour + "were not mutated")
    //println("Thus, " + oneTwoThree + "is a new list")
    val twoThree = List(2,3)
    //oneTwoThree = 1 :: twoThree
    //println(oneTwoThree)
    var oneTwoThree1 = 1 :: 2 :: 3 ::Nil
    //println(oneTwoThree1)
    var thrill = "Will" :: "fill" :: "until" :: Nil
    //println(thrill.count(s => s.length == 4))
    //println(thrill.filter(s => s.length == 4))
    //println(thrill.map(s => s + "!"))

    /* step9 tuple */
    val pair = (99,"abc")
    //println(pair._1)
    //println(pair._2)

    /* step10 set & map  */
    var jetSet = Set("bbb","aaa")
    jetSet += "lll"
    //println(jetSet)
    //println(jetSet.contains("ccc"))

    import scala.collection.mutable //mutable set
    val movieSet = mutable.Set("hhh","pppp")
    movieSet += "sss"
    //println(movieSet)
    val tr = mutable.Map[Int,String]()
    tr += (1 -> "Go to island")
    tr += (2 -> "Find big X on ground")
    tr += (3 -> "Dig.")
    println(tr(2))


  }
}