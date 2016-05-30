package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if(c == 0 || c == r) 1
      else pascal(c-1, r-1) + pascal(c, r-1)
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      !chars.map(parseToNumber).scanLeft(0)(_+_).contains(-1) &&
      chars.map(parseToNumber).sum == 0
    }

    private def parseToNumber(parenthesis: Char) = parenthesis match {
      case '(' => 1
      case ')' => -1
      case _ => 0
    }
    
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = ???
  }
