import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number;
        List<Integer> powers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = scanner.nextInt();

        for(int i = 1; i <= number; i *= 4){
            if(!powers.contains(i)){
                powers.add(i);
            }
        }

        for(int i = 1; i <= number; i *= 5){
            if(!powers.contains(i)){
                powers.add(i);
            }
        }

        Collections.sort(powers);

        System.out.println(powers);

    }
}
