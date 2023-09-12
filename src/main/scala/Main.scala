@main def hello: Unit =
  println("Hello world!")
  println(sum)
  println(sumUsingMap + " : Sum")


// Problem 1:
val array = Array(1,2,3,4,5)

// foldLeft method to sum all elements of an array
val sum = array.foldLeft(0)(_ + _) // this also satisfies the problem 2

// use map method to sum all elements of an array
val sumUsingMap = array.map(x => x).sum

// Problem 2:

// Problem 3:
  
