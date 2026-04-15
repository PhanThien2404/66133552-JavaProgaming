package thien.pnn;



import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SuppressWarnings("unused")
public class ViDuDocStream2 {

    public static void main(String[] args) throws IOException {
        
        FileInputStream fInput = new FileInputStream("baitho.txt");
        

        InputStreamReader ipReader = new InputStreamReader(fInput);

        BufferedReader bufReader = new BufferedReader(ipReader);
        

        String line1 = bufReader.readLine();

        System.out.println(line1);

        line1 = bufReader.readLine();

        System.out.println(line1);
    }
}