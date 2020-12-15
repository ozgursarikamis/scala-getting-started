abstract class Employee {
  val first: String
  val last: String
}

abstract class DepartmentEmployee extends Employee {
  private val secret = "Big Secret"
  val department: String
  val departmentCode: String
  val numberOfStocks: Int

  override def toString: String =
    "["  + first + "," + last + "," + department + "," + numberOfStocks + "," + "]"
}

class RnDEmployee(f: String, l: String) extends DepartmentEmployee {
  override val department = "Research & Development"
  override val departmentCode = "R&D"
  override val numberOfStocks = 100
  override val first = f
  override val last = l
}

class MarketingEmployee(f: String, l: String) extends DepartmentEmployee {
  override val department = "Marketing"
  override val departmentCode = "MKT"
  override val numberOfStocks = 100
  override val first = f
  override val last = l
}


var rnDEmployee = new RnDEmployee("Amy", "Jones")
var marketingEmployee = new MarketingEmployee("Bob", "Martin")

abstract class Company {
  val name: String
  val numberOfObjects: Int
  val employees: Set[Employee]
}

// Composition example
class Pluralsight(n: String, es: Set[Employee]) extends Company {
  val name = n
  val numberOfEmployees = es.size
  val employees = es
  override val numberOfObjects = 0
}

val pluralsight = new Pluralsight("Pluralsight Inc.", Set(rnDEmployee, marketingEmployee))
