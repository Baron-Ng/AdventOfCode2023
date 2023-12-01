import java.util.*;
import java.io.*;

public class Day1{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ArrayList <Integer> digits = new ArrayList<>();

        while (sc.hasNextLine()){
            String temp = conversion(sc.nextLine());

            //System.out.println (temp);

            char[] c = temp.toCharArray();

            int first = -1;
            int last = -1;

            for (int i = 0 ; i < c.length; i++){

                if (isInt(c[i])){
                    first = c[i] - 48;
                    break;
                }
            }

            for (int i = c.length - 1 ; i > -1; i--){
                if (isInt(c[i])){
                    last = c[i] - 48;
                    break;
                }
            }

            String s = "" + first + last;
            digits.add(Integer.parseInt(s));
            //System.out.println (s);
        }

        int sum = 0;

        for (int i = 0; i < digits.size(); i++){
            sum += digits.get(i);
        }

        System.out.println(sum);
    }

    public static boolean isInt (char c){
        return c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9';
    }

    public static String conversion (String s){

        String end = "";

        boolean b = false;
        for (int i = 0; i < s.length(); i++){

            String three = "";
            String four = "";
            String five = "";

            if (i < s.length() - 2){
                three = s.substring(i, i + 3);
            }

            if (i < s.length() - 3){
                four = s.substring(i, i + 4);
            }

            if (i < s.length() - 4){
                five = s.substring(i, i + 5);
            }

            if (!b){
                if (three.equals("one")){
                    end += 1;
                    i += 2;
                    b = true;
                } else if (three.equals("two")){
                    end += 2;
                    i += 2;
                    b = true;
                } else if (five.equals("three")){
                    end += 3;
                    i += 4;
                    b = true;
                } else if (four.equals("four")){
                    end += 4;
                    i += 3;
                    b = true;
                } else if (four.equals("five")){
                    end += 5;
                    i += 3;
                    b = true;
                } else if (three.equals("six")){
                    end += 6;
                    i += 2;
                    b = true;
                } else if (five.equals("seven")){
                    end += 7;
                    i += 4;
                    b = true;
                } else if (five.equals("eight")){
                    end += 8;
                    i += 4;
                    b = true;
                } else if (four.equals("nine")){
                    end += 9;
                    i += 3;
                    b = true;
                }
            } else {
                end += s.charAt(i); 
            }
        }

        s = end;
        end = "";
        b = false;
        
        for (int i = s.length() - 1; i > -1; i--){

            String three = "";
            String four = "";
            String five = "";

            if (i < s.length() - 2){
                three = s.substring(i, i + 3);
            }

            if (i < s.length() - 3){
                four = s.substring(i, i + 4);
            }

            if (i < s.length() - 4){
                five = s.substring(i, i + 5);
            }

            if (!b){
                if (three.equals("one")){
                    end += 1;
                    i -= 2;
                    b = true;
                } else if (three.equals("two")){
                    end += 2;
                    i -= 2;
                    b = true;
                } else if (five.equals("three")){
                    end += 3;
                    i -= 4;
                    b = true;
                } else if (four.equals("four")){
                    end += 4;
                    i -= 3;
                    b = true;
                } else if (four.equals("five")){
                    end += 5;
                    i -= 3;
                    b = true;
                } else if (three.equals("six")){
                    end += 6;
                    i -= 2;
                    b = true;
                } else if (five.equals("seven")){
                    end += 7;
                    i -= 4;
                    b = true;
                } else if (five.equals("eight")){
                    end += 8;
                    i -= 4;
                    b = true;
                } else if (four.equals("nine")){
                    end += 9;
                    i -= 3;
                    b = true;
                }
            } else {
                end += s.charAt(i); 
            }
        }

        return end;
    }
}