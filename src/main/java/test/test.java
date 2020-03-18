package test;
import java.io.IOException;
public class test {
    void test_run(){

        Runtime r = Runtime.getRuntime();

        Process p = null;

//         String str[] = new String[]{"cmd","/C","start","F:\\java_work\\gcc_c\\c_io\\my.bat"};
        String str[] = new String[]{"cmd","/C","start","F:\\java_work\\test\\c_io\\my.bat"};
        try {
            p = r.exec(str);//运行cmd下的gcc
        } catch (IOException e) {
            try {
                e.printStackTrace();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }
    public static void main(String[] args)  {

        test t = new test();
        t.test_run();
    }

}
