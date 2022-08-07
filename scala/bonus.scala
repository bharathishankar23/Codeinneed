import scala.io.Source
import scala.language.postfixOps
object bonus {
  def main(args: Array[String]): Unit = {
    val worker = Source.fromFile("C:\\aaa\\Holidaytask\\worker.csv").getLines.drop(1)
    var t: Array[String] = new Array[String](6)
    for (x <- worker) {
      t = x.split(',')
      // println(x)

      val bonus = Source.fromFile("C:\\aaa\\Holidaytask\\bonus.csv").getLines.drop(1)
      var z: Array[String] = new Array[String](3)
      for (y <- bonus) {
        //if(y.split(','):Array[0] == x.split)
        z = y.split(',')
        //println(z(0))
        // println(y)

      if (t(0) == z(0)) {
              if (z(2).toInt >= 4500) {
          println("The person "+t(1) + " " + t(2) + " has bonus of "+z(2))
        }
      }
    }
    }
  }
}
