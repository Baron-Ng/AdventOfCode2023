import java.util.*;
import java.io.*;

public class Day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> subsets = new ArrayList<>();
        int sum = 0;
        int game = 0;
        while (sc.hasNextLine()) {
            game++;
            String s = sc.nextLine().split(": ")[1];
            String [] bruh = s.split("; ");
            ArrayList <String[]> cubes = new ArrayList<>();
            for (int i = 0; i < bruh.length; i++){
                cubes.add(bruh[i].split(", "));
            }

            boolean possible = true;

            int maxR = 0;
            int maxG = 0;
            int maxB = 0;
            for (int i = 0; i < cubes.size() && possible; i++){
                
                for (int j = 0; j < cubes.get(i).length && possible; j++){
                    String [] set = cubes.get(i)[j].split(" ");
                    int amount = Integer.parseInt(set[0]);
                    String color = set[1];

                    if (color.equals("blue")){
                        if (amount > maxB){
                            maxB = amount;
                        }
                    } else if (color.equals("green")){
                        if (amount > maxG){
                            maxG = amount;
                        }
                    } else if (color.equals("red")){
                        if (amount > maxR){
                            maxR = amount;
                        }
                    }

                }
                
            }
            if (possible){
                sum += maxR * maxB * maxG;
            }
        }

        System.out.println(sum);
    }
}