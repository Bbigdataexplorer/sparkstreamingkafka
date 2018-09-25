package com.Beagle.tianyun

import java.io.{File, PrintWriter}

import scala.io.Source

/**
  * AUTHOR: Wanggc
  * Date : 2018/9/19 9:40
  */
object aa {

  def main(args: Array[String]): Unit = {
    System.out.print(args.length)
    if(args.length!=2){
      System.out.print("输入参数个数错误")
    }
    val Array(sourcefile, file) = args
    val localfile = Source.fromFile(new File(sourcefile.toString),"GBK") //中文乱码
    val writer = new PrintWriter(new File(file.toString),"UTF-8")
    for(line <- localfile.getLines()){
      var len=line.length
      var date=line.substring(0, 12)
      var bankname1 = line.substring(12, len - 10).trim
      var number=line.substring(len-10,len)
      var a=date+"|"+bankname1+"|"+number
      writer.println(a)
      println(a)
    }
    writer.close()
  }
}
