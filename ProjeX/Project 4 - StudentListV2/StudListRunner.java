import java.util.*;
/**
 * @Cameron Snyder
 * @Version 1029
 */
public class StudListRunner{
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter");
        String input = scanner.nextLine();
        StudentList studListObj = new StudentList();
        studListObj.addStudent(input);
    }
}
