//import java.util.NoSuchElementException

import org.scalatest.FunSuite
import org.scalatest.mock.MockitoSugar

/**
  * Created by M.Kumar on 5/15/2017.
  */
class TestingFunSuite extends FunSuite with MockitoSugar{

  test("An empty list should return true for isEmpty"){
    assert(List().isEmpty)
  }

  test("Calling head on empty list should produce NoSuchElementException"){
    intercept[NoSuchElementException]{
      List.empty.head
    }
  }

  test("An empty list should return true for isEmpty for mockito"){
    val mockList = mock[List[Int]]
    println(mockList.head)
  }

}
