/**
  * Created by M.Kumar on 5/29/2017.
  */
object anonymous_function {

  def main(args: Array[String]): Unit = {
    val mul = (x:Int,y:Int) => x*y
    println(mul(2,3))
    println(mul)
  }

}
