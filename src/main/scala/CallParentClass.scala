/**
  * Created by M.Kumar on 5/9/2017.
  */
object CallParentClass extends App{

  override def main(args: Array[String]): Unit = {

    callingMethod("hello")

  }

  def callingMethod(string: String) : Unit = {
    A.doStep("hello")
  }
}

object A {

  def doStep (string: String): Unit = {

    println(this)

  }
}
