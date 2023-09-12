@main def hello: Unit =
  println("Hello world!")
  println(sum)
  println(sumUsingMap + " : Sum")
  println(new_array)
  println(scanned_array.mkString(","))
  println(counted_foldLeft)


// Problem 1:
val array = Array(1,2,3,4,5)

// foldLeft method to sum all elements of an array
val sum = array.foldLeft(0)(_ + _) // this also satisfies the problem 2

// use map method to sum all elements of an array
val sumUsingMap = array.map(x => x).sum

// Problem 2:

// Problem 3:
  
/*
map builds a new collection by applying a function to all elements of this list. 
Define map in terms of foldLeft. What property, if any, must the structure have for this to make sense?
*/

var new_array = array.foldLeft(List.empty[Int]){(acc, x) => acc :+ (x + 5)}


/*
Problem 4:
Define map in terms of scanLeft. What is the difference between this and the one based on foldLeft?
*/

var scanned_array = array.scanLeft(0)((acc, current)=> current).tail


/*
Problem 5:
  foldLeft applies a binary operator to a start value and 
  all elements of this sequence, going left to right. Define foldLeft in terms of map.
*/

/*
Problem 6:
count selects all elements of a structure that satisfy a predicate. Define count in terms of foldLeft.
*/

var counted = array.count((x) => x > 4)
var counted_foldLeft = array.foldLeft(0)((acc, current) => if(current > 4) acc + 1 else acc)

/*
Problem 7:
  filter selects all elements of a structure that satisfy a predicate. Define filter in terms of map, foldLeft and/or scanLeft.
*/

