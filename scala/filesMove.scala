import java.nio.file.{Files, Paths, StandardCopyOption}
import java.io.File
import java.nio.file.attribute.BasicFileAttributes
import java.text.SimpleDateFormat
import java.util.Date
object filesMove {
  def main(args: Array[String]): Unit = {
    //print("enter the src_path: ")      //C:\\aaa\\Holidaytask\\raja
    // val src_path= scala.io.StdIn.readLine()
    //print("enter the tgt_path: ")      //C:\\aaa\\Holidaytask\\rani
    // val tgt_path= scala.io.StdIn.readLine()
    //print("Enter the ts: ")            //2022-07-31
    //  val ts = scala.io.StdIn.readLine()
    val src_path = args(0)
    val tgt_path = args(1)
    val ts  = args(2)
    val FileList=getListOfFiles(src_path)

    FileList.foreach { f =>
      val a = (Files.readAttributes(Paths.get("" + f + ""), classOf[BasicFileAttributes]).creationTime().toString)
      val b = a.slice(0, 10)
      println(f + " and it's creation time is : " + b)
      val src_file = f.toString()
      val tgt_file = tgt_path + "/" + getFileName(f.getName)

      if (b == ts) {
        moveRenameFile(src_file, tgt_file)
        println(src_file+ "File's moved to Destination successfully")
      }
    }
  }
  def getFileName(fname : String):String = {
    val fileName = new SimpleDateFormat(s"'${fname.split('.')(0)}.txt'").format(new Date());
    fileName
  }

  def getListOfFiles(dir: String):List[File] = {
    val d = new File(dir)
    if (d.exists && d.isDirectory) {
      d.listFiles.filter(_.isFile).toList
    } else {
      List[File]()
    }
  }

  def moveRenameFile(source: String, destination: String): Unit = {
    val path = Files.move(
      Paths.get(source),
      Paths.get(destination),
      StandardCopyOption.REPLACE_EXISTING
    )
  }
}

