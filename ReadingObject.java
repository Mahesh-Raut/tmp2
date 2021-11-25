package InputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadingObject {
    public static void main(String[] args) {

        try {
            FileInputStream  fin = new FileInputStream("/home/mahesh.raut/Datametica/Demo3.txt");
            ObjectInputStream in = new ObjectInputStream(fin);

            Employee emp =(Employee) in.readObject();    //downcasting   - readObject method inherit from object class

            System.out.println("Employee Details :");
            System.out.println("Id : "+emp.getId());
            System.out.println("Name : "+emp.getName());
            System.out.println("Salary : "+emp.getSalary());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
