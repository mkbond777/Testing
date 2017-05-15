/**
  * Created by M.Kumar on 5/5/2017.
  */
object Time extends App{

  override def main(args: Array[String]): Unit = {
    val a : Int= 4
    val hour = a/(60*60)
    val minutes = (a% 3600)/60
    val seconds = (a % 3600)%60
    val time = hour + "h" + minutes + "m" + seconds + "s"
    println(time)
  }

}
