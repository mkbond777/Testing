/**
  * Created by M.Kumar on 5/5/2017.
  */
object PhoneNumber extends App{

  override def main(args: Array[String]): Unit = {

    val s = "0 - 22 1985-- 324"
    var str = s.replaceAll("[^\\d]", "")
    var newStr = ""
    println(newStr)
    while (str.length > 4){
        newStr = newStr + str.take(3)+"-"
        str = str.takeRight(str.length-3)
    }
    if (str.length == 4){
      newStr = newStr + str.take(2) + "-" + str.takeRight(2)
    }
    else if (str.length==3){
      newStr = newStr + str.take(3)
    }
    else if (str.length ==2){
      newStr = newStr + str.take(2)
    }
    println(newStr)
  }

}
