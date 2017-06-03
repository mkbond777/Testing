///**
//  * Created by M.Kumar on 5/18/2017.
//  */
//
//sealed abstract class Tree
//case class Node(left: Tree, right: Tree, v: Int) extends Tree
//case object Leaf extends Tree
//
//import org.scalacheck._
//import Gen._
//import Arbitrary.arbitrary
//
//object ScalaCheckCaseClassGen {
//
//  def main(args: Array[String]): Unit = {
//
//    val genLeaf = const(Leaf)
//
//    val genNode = for {
//      v <- arbitrary[Int]
//      left <- genTree
//      right <- genTree
//    } yield Node(left, right, v)
//
//    def genTree: Gen[Tree] = oneOf(genLeaf, genNode)
//
//    println(genLeaf)
//
//    println(genNode)
//  }
//
//}
