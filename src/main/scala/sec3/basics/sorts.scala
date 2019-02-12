package sec3.basics

object sorts extends App {
  
  def bubblesort(arr:Array[Int]):Unit = {
    for (i<-0 until arr.length-1; j<-0 until arr.length-1-i) {
      if(arr(j) > arr(j+1)) {
        val tmp = arr(j)
        arr(j) = arr(j+1)
        arr(j+1) = tmp
      }
    }
    
    
    
  }
  
  def bubblesortOrdered[A <: Ordered [A]](arr: Array[A]):Unit = {
    for (i<-0 until arr.length-1; j<-0 until arr.length-1-i) {
      if(arr(j) > arr(j+1)) {
        val tmp = arr(j)
        arr(j) = arr(j+1)
        arr(j+1) = tmp
      }
    }
  }

 def bubblesortn[A](arr: Array[A])(gt:(A,A) => Boolean):Unit = { //cant do greaterthan on not sorted a, pass greater than
    for (i<-0 until arr.length-1; j<-0 until arr.length-1-i) {
      if(gt(arr(j), arr(j+1)))  {
        val tmp = arr(j)
        arr(j) = arr(j+1)
        arr(j+1) = tmp
      }
    }
  }


val nums = Array.fill(10)(util.Random.nextInt(100))
println(nums.mkString(" "))
bubblesortn(nums)(_>_) //( .name > .name) as example
println(nums.mkString(" "))
}
