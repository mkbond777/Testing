import org.scalatest.FunSuite
import org.scalatest.prop.Checkers
import org.scalacheck.Arbitrary.arbContainer
import org.scalacheck.Prop.propBoolean

/**
  * Created by M.Kumar on 5/16/2017.
  */
class TestingWithScalaCheck extends FunSuite with Checkers{

  test("Concatenated list should have equal size as of individual sum") {
    check((a:List[Int], b:List[Int]) => a.size + b.size == (a:::b).size)
}

}
