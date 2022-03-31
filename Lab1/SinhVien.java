package Session6.Lab1;

import java.nio.file.FileSystemAlreadyExistsException;
import java.util.ArrayList;
import java.util.Scanner;

public class SinhVien  {
    String ID;
    String Name;
    String dataOfBirth;
    String Address;
    float Gpa;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(String dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public float getGpa() {
        return Gpa;
    }

    public void setGpa(float gpa) {
        Gpa = gpa;
    }
    public SinhVien() {

    }
    public SinhVien(String ID,  String Name, String dataOfBirth, String Address,float Gpa ){
        super();
        this.ID = ID;
        this.Name = Name;
        this.dataOfBirth = dataOfBirth;
        this.Address = Address;
        this.Gpa = Gpa;
    }

    public static void main(String[] agrs){
        try {
            Scanner sc = new Scanner(System.in);
            String ID = sc.nextLine();
            String Name = sc.nextLine();
            String dataOfBirth = sc.nextLine();
            String Address = sc.nextLine();
            float Gpa = sc.nextFloat();

            System.out.println("ID" +ID);
            System.out.println("Name" +Name);
            System.out.println("DataOfBirth:" +dataOfBirth);
            System.out.println("Address" +Address);
            System.out.println("GPA" +Gpa);
        }catch (FileSystemAlreadyExistsException f){
            f.printStackTrace();
        }
    }


}
