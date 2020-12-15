class Employee(f: String, l: String, s: Int) {
  private val departmentCodeByName: Map[String, String] = Map(
    "HR" -> "Human Resources",
    "ACT" -> "Accounts",
    "R&D" -> "Research & Development",
    "MKT" -> "Marketing",
    "SLS" -> "Sales",
    "OPS" -> "Operations"
  )

  private val first: String = f
  private val last: String = l
  private var stocks: Int = s

  def getFirst = first
  def getLast = last
  def getStocks = stocks

  def awardMoreStocks(numberOfStocks: Int): Unit = stocks += numberOfStocks

  def getDepartmentName(code: String): String =
    departmentCodeByName.getOrElse(code, "The department with such code does not exist")

  override def toString: String = first + " " + last + " " + stocks
}

val bob = new Employee("Bob", "Martin", 100)
bob.getDepartmentName("R&D")
