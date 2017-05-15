/**
  * Created by M.Kumar on 5/10/2017.
  */
object EitherLeftRight {

  def main(args: Array[String]): Unit = {

    println(addNumber(3,5).left.get)

  }

  def addNumber(a:Int, b:Int) : Either[Int,Unit] = {

    //val c = a+b
    Left(a+b)
    Right(println("Executing Right"))
  }
}
