
import java.io.*;
import java.util.*;

// Read only region start
public class password {
    public String userIdGeneration(String input1, String input2, int input3, int input4) {
        // Read only region end
        // Write code here...
        String smallername = new String("");
        String longername = new String("");
        if (input1.length() < input2.length()) {
            smallername = input1;
            longername = input2;
        } else if (input1.length() > input2.length()) {
            smallername = input2;
            longername = input1;
        } else {
            // alphabetical order
            smallername = input1.compareTo(input2) < 0 ? input1 : input2;
            longername = input1.compareTo(input2) < 0 ? input2 : input1;

        }

        String strpin = Integer.toString(input3);
        String uid = smallername.charAt(smallername.length() - 1)
                + longername
                + strpin.charAt(input4 - 1)
                + strpin.charAt(strpin.length() - input4);
        String toggleuid = new String("");
        for (int i = 0; i < uid.length(); i++) {
            char ch = uid.charAt(i);
            if (Character.isLowerCase(ch)) {
                toggleuid = toggleuid.concat(Character.toUpperCase(ch) + "");
            } else {
                toggleuid = toggleuid.concat(Character.toLowerCase(ch) + "");
            }

        }

        return toggleuid;
    }
}
