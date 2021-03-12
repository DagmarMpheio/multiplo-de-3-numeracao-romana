package concurso;

import java.util.Scanner;

public class RomanosDivisor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = 0;
        int decimais[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String romanos[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
//        int r = Integer.parseInt(in.nextLine());
//        for (int i = 0; i < r; i++) {
//            romanos[i]=in.nextLine();
//        }
        System.out.println("\t\t\tMULTIPLOS DE 3");
        System.out.println("DIGITE UM NÚMERO ROMANO: ");
        String n = in.nextLine();
        String upper = n.toUpperCase();
        for (int i = 0; i < decimais.length; i++) {
            while (upper.indexOf(romanos[i]) == 0) {
                result += decimais[i];
                upper = upper.substring(romanos[i].length());
            }

        }

        if (result % 3 == 0) {
            System.out.println("YES " + result);
        } else {
            System.out.println("NO " + result);
        }
    }
}
