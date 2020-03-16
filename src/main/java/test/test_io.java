package test;

import java.io.*;

public class test_io {

//    public static void main(String[] args) {
//       // readFile();
//        writeFile("nihaoa ");
//    }
    public static void readFile(){
        String pathname = "F:\\java_work\\test\\c_io\\input.txt";
        try (FileReader reader = new FileReader(pathname);
             BufferedReader br = new BufferedReader(reader) // 建立一个对象，它把文件内容转成计算机能读懂的语言
        ) {
            String line;
            //网友推荐更加简洁的写法
            while ((line = br.readLine()) != null) {
                // 一次读入一行数据
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public  void writeFile(String string) {
        try {
            File writeName = new File("F:\\java_work\\test\\c_io\\test.c"); // 相对路径，如果没有则要建立一个新的output.txt文件
            writeName.createNewFile(); // 创建新文件,有同名的文件的话直接覆盖
            try (FileWriter writer = new FileWriter(writeName);
                 BufferedWriter out = new BufferedWriter(writer)
            ) {
                out.write(string); // \r\n即为换行

                out.flush(); // 把缓存区内容压入文件
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
