
import java.io.*;

public class BufferedReaderAndWriter {
    public static void main(String[] args) {
        bufferRader();
        bufferWriter();
    }

    private static void bufferWriter() {
        String str = "i have a dream";
        File file = new File("C:/yy/yy1.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))){
            bw.write(str);
            bw.flush();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void bufferRader() {
        String tempString;
        try (BufferedReader bf = new BufferedReader(new FileReader(new File("C:/yy/yy.txt")))){
            while( (tempString = bf.readLine()) != null) {
                System.out.println(tempString);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
