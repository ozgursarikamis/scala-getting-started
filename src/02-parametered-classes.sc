class Employee(first: String, last: String) {
  override def toString: String = first + " " + last
}

var bob = new Employee("Bob", "Martin")

bob

// bob.first : does not compile
// first is used as a parameter
// to create a class
