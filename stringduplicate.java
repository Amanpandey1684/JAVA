import java.util.Scanner;

public class stringduplicate {
    public static String main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!ans.contains(ch + "")) {
                ans += ch;
            }
        }
        return ans;
    }

}
