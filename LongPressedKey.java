import java.util.*;
//https://leetcode.com/problems/long-pressed-name/submissions/
public class Main {

    // ~~~~~~~~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~~~~~~~

    public static boolean isPossible(String name, String typed) {
        if(name.length() > typed.length())
            return false;
        int i = 0;
        int j = 0;
        while(i< name.length() && j< typed.length())
        {
            if(name.charAt(i) == typed.charAt(j))
            {
                i++;
                j++;
            }
            else if(0<=i-1 && name.charAt(i-1) == typed.charAt(j))
            {
                j++;
            }
            else
            {
                return false;
            }
        }
        while(j<typed.length())
        {
            if(typed.charAt(j) != name.charAt(i-1))
            {
                return false;
            }
            else
            {
                j++;
            }
        }
        
        return i<name.length()?false:true;
        
    }

    // ~~~~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~~~~~

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        String name = scn.next();
        String typed = scn.next();

        boolean res = isPossible(name, typed);

        System.out.println(res);
    }
}