//import scala.collection.mutable.MutableList
case class email(emailId: String)
object mailid {
  def main(args: Array[String]): Unit = {
    val q = args.length
    val list = List
    var sha =List("")
    val z: Array[String] = new Array[String](q)
   // val bha = List(email("abc@gmail.com"),email("123@gmail.com"),email("abcde@yahoo.com"),email("12345@yahoo.com"),email("abcfged@Live.com"),email("1235@Live.com"),email("ljflsdajf@rediff.com"))
    for( i<- 0 until q) {
      val bha = list(email(args(i)))
      sha = bha.map(x => x.emailId.slice(x.emailId.indexOf("@") + 1, x.emailId.indexOf(".")))
      println(sha)
      z(i) += sha
    }
      println(z.groupBy(l => l).map(t => (t._1, t._2.length + " ")).mkString)
  }
}
