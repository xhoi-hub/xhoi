import java.util.Scanner;

public class Ushtrimi3 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("\nvendos fjalen: ");
            String word = in.nextLine();
            word = word.trim();
            String result = "";
            char[] ch = word.toCharArray();
            for (int i = ch.length - 1; i >= 0; i--) {
                result += ch[i];
            }
            System.out.println("fjala e ndryshuar: " + result.trim());
        }
        //punoi xhuend hysa//

    }



