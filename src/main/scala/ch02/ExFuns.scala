package ch02

object ExFuns {
   def factorila(n: Int):Int = {
     @annotation.tailrec
     def go(m:Int, acc:Int):Int = {
       if(m > 0) go(m -1 , m * acc)
       else acc
     }
     go(n, 1)

   }

  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
    val length = as.length
    def check(currIdx:Int):Boolean = {
      if(currIdx + 1 == length || length == 0 ) true
      else if(ordered(as(currIdx), as(currIdx+1))) check(currIdx + 1 )
      else false
    }
    check(0)
  }


  def uncurry[A,B,C](f: A => B => C): (A, B) => C = {
    (a:A, b:B) =>  f(a)(b)
  }


}
