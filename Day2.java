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
            String s = sc.nextLine().substring(8);
            String [] bruh = s.split("; ");
            ArrayList <String[]> cubes = new ArrayList<>();
            for (int i = 0; i < bruh.length; i++){
                cubes.add(bruh[i].split(", "));
            }

            boolean possible = true;

            for (int i = 0; i < cubes.size(); i++){
                
                for (int j = 0; j < cubes.get(i).length; j++){
                    int amount = -1;
                    try {
                        amount = Integer.parseInt(cubes.get(i)[j].substring(0, 2));
                    }
                    catch (Exception e) {
                        amount = Integer.parseInt(cubes.get(i)[j].substring(0, 1));
                    }
                    String color = cubes.get(i)[j].substring(2);

                    System.out.println (color + " " + amount);
                    if (color.contains("blue")){
                        if (amount > 12){
                            possible = false;
                            break;
                        }
                    } else if (color.contains("green")){
                        if (amount > 13){
                            possible = false;
                            break;
                        }
                    } else if (color.contains("red")){
                        if (amount > 14){
                            possible = false;
                            break;
                        }
                    }

                }

                if (!possible){
                    break;
                }
                
            }
            if (possible){
                sum += game;
                System.out.println(game);
            }
        }

        System.out.println(sum);
    }
}