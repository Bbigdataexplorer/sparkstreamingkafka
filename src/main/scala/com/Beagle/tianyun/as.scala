package com.Beagle.tianyun

import java.io.File

import scala.io.Source

/**
  * AUTHOR: Wanggc
  * Date : 2018/9/19 10:34KafkaClientApp.java
KafkaProperties.java
KafkaConsumer.java
KafkaProducer.java
  */
object as {
  def main(args: Array[String]): Unit = {
    if (args.length != 2) {
      System.out.print("输入参数个数错误")
    }
    val Array(sourcefile, file) = args
    val localfile = Source.fromFile(new File(sourcefile.toString), "GBK") //中文乱码
//    val writer = new PrintWriter(new File(file.toString), "UTF-8")
    for (line <- localfile.getLines()) {
//      writer.println(line)
      line.split(" ").toList.toBuffer
        println(line.split(" ").length+" "+line.split(" ").toList.toBuffer)

      }

    }
//    writer.close()

}
