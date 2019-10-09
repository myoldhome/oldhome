package basis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestStream01 {
    public static void main(String[] args) {
        File file = new File("d:\\hello.txt");
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while (true){
                String line = br.readLine();
                if (null==line)
                    break;
                System.out.println(line);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
