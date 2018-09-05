package headfirst.decoration.starbuzz.four_javaIO;

import java.io.*;

public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowrCaseInputStream(new BufferedInputStream(new FileInputStream("/Users/unclewang/Idea_Projects/unclewang/src/main/java/headfirst/decoration_pattern/starbuzz/four_javaIO/test.txt")));
            while ((c = in.read()) >= 0) {
                System.out.println((char) c);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
