package InputOutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWritingDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("/home/mahesh.raut/Datametica/Demo2.txt",true);
            String msg = " Mahesh ";
            //fout.write(msg.getBytes());
            fout.write(msg.getBytes());
            System.out.println("Writing Package!!!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
