package com.java.lycoris.exception;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
关于try..catch中的finally子句：
    1、在finally子句中的代码是最后执行的，并且是一定会执行的，即使try语句块中的代码出现了异常。
        finally子句必须和try一起出现，不能单独编写。

    2、finally语句通常使用在哪些情况下呢？
        通常在finally语句块中完成资源的释放/关闭。
        因为finally中的代码比较有保障。
        即使try语句块中的代码出现异常，finally中代码也会正常执行。
 */

public class ExceptionTest10 {
    public static void main(String[] args) {
        FileInputStream fis = null;// 声明位置放到try外面。这样在finally中才能用。
        try {
            fis = new FileInputStream("H:\\Download\\密码本.txt");

            // 这里一定会出现空指针异常！
            String s = null;
            s.toString();
            // 流使用完需要关闭，因为流是占用资源的。
            // 即使以上程序出现异常，流也必须要关闭！
            // 放在这里有可能流关不了。
            //fis.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }finally {
            System.out.println("ooo");
            // 流的关闭放在这里比较保险。
            // finally中的代码是一定会执行的。
            // 即使try中出现了异常！
            if (fis != null) {// 避免空指针异常！
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
