package com.company.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            // 创建文件字节输入流对象
            // 文件路径：D:\course\JavaProjects\02-JavaSE\temp （IDEA 会自动把\编程\\，因为 java 中\表示转义）
            // 以下都是采用了：绝对路径的方式。
            //FileInputStream fis = newFileInputStream("D:\\course\\JavaProjects\\02-JavaSE\\temp");

            // 写成这个/也是可以的。
            fis = new FileInputStream("E:/test/temp");

            // 开始读
            int readData = fis.read(); // 这个方法的返回值是：读取到的“字节”本身。

            System.out.println(readData); //97

            readData = fis.read();
            System.out.println(readData); //98

            readData = fis.read();
            System.out.println(readData); //99

            readData = fis.read();
            System.out.println(readData); //100

            readData = fis.read();
            System.out.println(readData); //101

            readData = fis.read();
            System.out.println(readData); //102

            // 已经读到文件的末尾了，再读的时候读取不到任何数据，返回-1.
            readData = fis.read();
            System.out.println(readData);

            readData = fis.read();
            System.out.println(readData);

            readData = fis.read();
            System.out.println(readData);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 在 finally 语句块当中确保流一定关闭。
            if (fis != null) { // 避免空指针异常！
                // 关闭流的前提是：流不是空。流是 null 的时候没必要关闭。
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        }
}
