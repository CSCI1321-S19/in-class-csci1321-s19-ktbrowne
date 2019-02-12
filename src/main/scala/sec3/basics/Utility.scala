package sec3.basics

object Utility extends App{
  def findRemove[A](lst:List[A])(pred: A => Boolean):(Option[A], List[A]) = 
    lst match {
      case Nil => (None, lst) //(None, Nil) equivalent but more clear 
      case h :: t => 
        if(pred(h))(Some(h),t) else {
           val (found,fixedList) = findRemove(t)(pred) //findRemove(t)(pred) works but doesn't do what we want
          (found,h :: fixedList)
        }
    } 
  
  val nums = List(1,2,3,4,5,6,7,8,9)
  val(five,notFive) = findRemove(nums)(_==5)
  println(five,notFive)
  }
