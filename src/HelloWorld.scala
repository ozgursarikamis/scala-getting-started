object HelloWorld extends App {
  println("Hello Scala World")

  var e = new Employee
  e.first = "Ozgur"
  e.last = "Sarikamis"

  println(e.first)
}

class Employee {
  var first: String = "Default Name";
  var last: String = "Default Last Name";
}
