public class Student{
    /**
     * Instance variables of class Student
     */
    private int studNumber;
    private boolean stuActive;
    private double stuGPA;
    private String stuName;

    /**
     * Constructor for objects of class Student
     */
    public Student(){
        // initialise instance variables
        studNumber = 0;
        stuActive = false;
        stuGPA = 0.0;
        stuName = "Bob";
    }

    /**
     * Student Methods
     */
    public void setStudNumber(int sn)    {
        studNumber = sn;    
    }

    /**
     * Student Methods
     */
    public void setStuActive(boolean sn)    {
        stuActive = sn;
    }
    
    /**
     * Student Methods
     */
    public void setStuGPA(double sn)    {
        stuGPA = sn;
    }

    /**
     * Student Methods
     */
    public void setStuName(String sn)    {
        stuName = sn;
    }
    
    public int getStudNumber()    {
        return studNumber;
    }

    public boolean getStuActive()    {
        return stuActive;
    }

    public double getStuGPA()    {
        return stuGPA;
    }

    public String getStuName()    {
        return stuName;
    }
}