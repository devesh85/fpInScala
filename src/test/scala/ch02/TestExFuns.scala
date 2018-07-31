package ch02

import org.scalatest.{FlatSpec, Matchers}


class TestExFuns extends FlatSpec with Matchers{


  "a factorial " should "process" in {
    ExFuns.factorila(5) should be (120)
  }

  "a factorial 2" should "process" in {
    ExFuns.factorila(6) should be (720)
  }

  "to check if an array is sorted" should "result" in {
    val arr: Array[Int] = Array(1,2,3,4,5)
    val ord: (Int, Int) => Boolean = (a:Int, b:Int) => a < b
    ExFuns.isSorted(arr, ord) should be (true)
  }

  "to check if an array is not sorted" should "result" in {
    val arr: Array[Int] = Array(1,4,3,4,5)
    val ord: (Int, Int) => Boolean = (a:Int, b:Int) => a < b
    ExFuns.isSorted(arr, ord) should be (false)

    ExFuns.isSorted(Array(1), ord) should be (true)
    ExFuns.isSorted(Array(), ord) should be (true)
  }

  "Uncurry a curried function" should "result" in {
    val f :(Int) => (Int) => (Int) = {i => j => i + j}
    ExFuns.uncurry(f)(2,3) should be (5)
  }
}
