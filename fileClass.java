import java.io.*;
public class fileClass {
    public static void main(String[] args) throws IOException {
        FileWriter fwe= new FileWriter("ExampleFile.txt");
        fwe.write("hello this is my example text");
        fwe.close();
        FileReader fre= new FileReader("ExampleFile.txt");
        int i;
        while((i=fre.read())!=-1)
            System.out.print((char)i);
        fre.close();
    }
}
