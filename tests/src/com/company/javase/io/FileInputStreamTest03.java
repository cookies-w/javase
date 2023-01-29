package com.company.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("tests/src/com/company/javase/io/tempfile4");

            // 开始读，采用 byte 数组，一次读取多个字节。最多读取“数组.length”个字节。

            byte[] bytes = new byte[4]; // 准备一个 4 个长度的 byte 数组，一次最多读取 4 个字节。
            // 这个方法的返回值是：读取到的字节数量。（不是字节本身）
            int readCount = fis.read(bytes);
            System.out.println(readCount); // 第一次读到了 4 个字节。
            // 将字节数组全部转换成字符串
            //System.out.println(new String(bytes)); // abcd
            // 不应该全部都转换，应该是读取了多少个字节，转换多少个。
            System.out.println(new String(bytes,0, readCount));

            readCount = fis.read(bytes); // 第二次只能读取到 2 个字节。
            System.out.println(readCount); // 2
            // 将字节数组全部转换成字符串

            //System.out.println(new String(bytes)); // efcd
            // 不应该全部都转换，应该是读取了多少个字节，转换多少个。
            System.out.println(new String(bytes,0, readCount));

            readCount = fis.read(bytes); // 1 个字节都没有读取到返回-1
            System.out.println(readCount); // -1

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
