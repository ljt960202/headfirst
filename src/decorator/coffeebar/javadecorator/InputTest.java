package decorator.coffeebar.javadecorator;

import java.io.*;

public class InputTest {
    public static void main(String[] args) throws IOException {
        InputStream in=new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("E://hello.txt")));
        int c;
        while((c=in.read())>=0){
            System.out.print((char)c);
        }
        in.close();
    }
}
