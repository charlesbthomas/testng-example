package example 

object App {
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]): Unit = {
    println( "Hello World!" )
    println("concat arguments = " + foo(args))
  }
}
