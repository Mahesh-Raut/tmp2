package InputOutput;

import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        try {
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            System.out.println("Enter message");
            String msg =br.readLine();

            FileWriter writer=new FileWriter("/home/mahesh.raut/Datametica/Demo2.txt",true);
            writer.write("\n"+msg);
            writer.flush();  //to check the data written at destination
            System.out.println("Writing File !!!");

            FileReader reader = new FileReader("/home/mahesh.raut/Datametica/Demo2.txt");
            BufferedReader br1 = new BufferedReader(reader);

            String str=null;
            while((str =br1.readLine()) != null) {
                System.out.println(str);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
