package InputOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadingDemo {
    public static void main(String[] args) {
        File file = new File("/home/mahesh.raut/Datametica/Demo.txt");   //
        if(file.exists()){
            try{
                FileInputStream fin = new FileInputStream(file);    //file is open in new read mode
                int ch = 0;
                while((ch =fin.read()) != -1){
                    System.out.print((char)ch);

                }
            }
            catch (FileNotFoundException e){
                e.printStackTrace();

            }catch (IOException e){
                e.printStackTrace();
            }
        }
        else {
            System.out.println("File does not exist");
        }

    }
}
