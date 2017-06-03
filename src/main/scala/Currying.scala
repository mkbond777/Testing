/**
  * Created by M.Kumar on 5/30/2017.
  */
object Currying {

  def main(args: Array[String]): Unit = {
    val nums = List(1, 2,3,4,5,6,7,8,9)
    println(filter(nums,modN(2)))
    println(filter(nums,modN(3)))
  }

  def filter (xs: List[Int], p : Int => Boolean) : List[Int] = {
    if (xs.isEmpty) xs
    else if (p(xs.head)) xs.head :: filter(xs.tail,p)
    else filter(xs.tail,p)
  }

  def modN(n: Int)(x: Int) = (x % n) == 0
}
