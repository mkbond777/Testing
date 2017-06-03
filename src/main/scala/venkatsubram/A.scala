//package venkatsubram
//
//import sun.awt.EventQueueDelegate.Delegate
//
///**
//  * Created by M.Kumar on 5/18/2017.
//  */
//class A {
//
//  def add : Int = {5}
//}
//
//
//class B{
//
//  @Delegate val a:A = new A()
//
//}
//
//object Run {
//  def main(args: Array[String]): Unit = {
//    val b:B = new B()
//    b.a.add
//  }
//}