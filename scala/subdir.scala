import java.io.File
import scala.io.Source
object subdir {
  def main(args: Array[String]) {

    print("enter the src_path: ")      //C:\\aaa\\Holidaytask\\raja
    val src_path= scala.io.StdIn.readLine()
    print("the word should search: ")
    val word = scala.io.StdIn.readLine()
    var l = getListOfSubDirectories(src_path).toList
    println(l)
    for (m <- l) {
      var n = getListOfFiles( src_path +"\\"+ m )
     // println(n)
      for (t <- n) {
        val fSource = Source.fromFile(t)
        var mp = 0
        for (line <- fSource.getLines) {
          mp +=1
          //println(line)
        }
        println("the word "+word +" occurs " +mp + " times"+ " in " + t)
        fSource.close()
      }
    }
    val a = getListOfFiles(src_path)
    for (b <- a) {
      val fSource = Source.fromFile(b)
      var mo = 0
      for (line <- fSource.getLines) {
        mo +=1
        //println(line)
      }
      println("the word "+word+" occurs " +mo + " times"+ " in " + b)
      fSource.close()
    }
  }
    def getListOfFiles(dir: String): List[File] = {
      val d = new File(dir)
      if (d.exists() && d.isDirectory) {
        d.listFiles.filter(_.isFile).toList
      }
      else {
        List[File]()
      }
    }
    def getListOfSubDirectories(directoryName: String): Array[String] = {
      val e = new File(directoryName)
      e.listFiles.filter(_.isDirectory).map(_.getName)
    }
}

