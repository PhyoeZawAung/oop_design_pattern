package decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest{
    public static void main(String[] args) throws IOException {
        int c;

        try{
            InputStream in = new LowercaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("/Users/test/JavaLearning/oop_design_pattern/src/text.txt")
                    )
            );
            while ((c = in.read()) >= 0){
                System.out.print((char)c);
            }
            in.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
