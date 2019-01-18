import java.util.*;
/**
 * @Cameron Snyder
 * @Version 1029
 */
public class Student{
    // instance variables
    private String firstName = "";
    private String middleName = "";
    private String lastName = "";
    private String fullName = "";
    private int stuNumber = 0;
    private double gpa = 0.0;
    public Student(String str){
        
        fullName = str;
        parseName();
    }
    
    public void parseName(){
        // parse full name and load  first, middle, and last
        //Last, First middle
        //Last, First
        //First Middle Last
        
        
    }
    // +++++++++++++++++++++++++++++++++  Getters
    public String getName(){
       
      return firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getMiddleName(){
        return middleName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getStuNumber(){
        return stuNumber;
    }

    public double getGPA(){
        return gpa;
    }
    // +++++++++++++++++++++++++++++++++  Setters
    public void setFirstName(String str){
        firstName = str;
    }

    public void setMiddleName(String str){
        middleName = str;
    }

    public void setLastName(String str){
        lastName = str;
    }

    public void setStuNumber(int str){
        stuNumber = str;
    }

    public void setGPA(double str){
        gpa = str;
    }
}
