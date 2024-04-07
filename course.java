import java.util.Scanner;

public class course {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = null;
        String course = null;
        int j = 1, py = 1, ph = 1;
        boolean a = true;
        while (a) {
            System.out.println("Please enter the name:- ");
            name = sc.next();
            System.out.println("Please enter the course:-");
            course = sc.next();
            if (course.equals("Java")) {
                System.out.println("your sid is " + course + j);
                j++;
            } else {
                if (course.equals("Python")) {
                    System.out.println("your course is " + course + py);
                    py++;
                } else {
                    if (course.equals("php")) {
                        System.out.println("your course name is " + course + ph);
                        ph++;
                    } else {
                        System.out.println("Invalid course");
                    }
                }
            }
            System.out.println("Do you want to continue say Yes or No:-");
            String ey = sc.next();
            if (ey.equals("Yes")) {
                a = true;
            } else {
                a = false;
            }
        }
    }

}
