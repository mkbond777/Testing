/**
  * Created by M.Kumar on 5/5/2017.
  */
object CountWords extends App{

  override def main(args: Array[String]): Unit = {

    val s = ".a."
    val a = s.split("[.?!]")
    //println(a)
    if(a.isEmpty)
      println(0)
    else {
      val b = a.map(x=>x.trim).map(n => if (n.length==0) 0 else n.split("\\W+").length)
      println(b.max)
    }
  }

}
