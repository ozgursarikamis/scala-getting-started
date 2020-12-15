class Employee(f: String, l: String, s: Int) {
  private val first: String = f
  private val last: String = l
  private var stocks: Int = s

  def getFirst = first
  def getLast: String = last
  def getStocks = stocks

  def awardMoreStocks(numberOfStocks: Int): Unit = stocks += numberOfStocks

  override def toString: String = first + " " + last + " " + stocks
}

var bob = new Employee("Bob", "Martin", 10)

bob

bob.getFirst
bob.getLast
bob.getStocks

bob.awardMoreStocks(99)
bob.getStocks

