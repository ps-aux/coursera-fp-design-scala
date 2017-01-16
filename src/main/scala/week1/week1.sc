val f1: String => String = {
  case "abc" => "xyz"
}

val f: PartialFunction[List[Int], String] = {
  case Nil => "one"
  case x :: y :: rest => "two"
}

f.isDefinedAt(List(1, 2, 3))


val g: PartialFunction[List[Int], String] = {
  case Nil => "one"
  case x :: rest => rest match {
    case Nil => "two"
  }
}

g.isDefinedAt(List(1, 2, 3))

val N = 44
for {
  x <- 2 to N
  y <- 2 to x
  if (x % y == 0)
} yield (x, y)


class Book(val title:String)


val b = new Book("aa")

b.title

val l = List(1,2,3).filter(_ > 2)

val l2 =List(1,2,3).withFilter(_ > 1)