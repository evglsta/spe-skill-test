import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpeSkillTest {

    public static void narcisstic() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        int length = input.length();
        int sum = 0;
        for (char c : input.toCharArray()) {
            int number = Character.getNumericValue(c);
            int pow = (int) Math.pow(number, length);
            sum += pow;
        }

        boolean isNarcisstic = sum == Integer.parseInt(input) ? true : false;
        System.out.println(isNarcisstic);
    }

    public static void parityOutline() {
        Scanner sc = new Scanner(System.in);
        int totalArray = sc.nextInt();

        if (totalArray < 3) {
            throw new RuntimeException("Must be more than 3");
        }

        List<Integer> arrays = new ArrayList<>();
        for (int i = 0; i < totalArray; i++) {
            int number = sc.nextInt();
            arrays.add(number);
        }

        sc.close();

        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();
        for (int a : arrays) {
            if (a % 2 == 0) {
                evens.add(a);
            } else {
                odds.add(a);
            }
        }

        int oddTotal = odds.size();
        int evenTotal = evens.size();
        if (oddTotal == 0 || evenTotal == 0) {
            System.out.println(false);
        } else {
            if (oddTotal > evenTotal) {
                System.out.println(evens);
            } else {
                System.out.println(odds);
            }
        }
    }

    public static void findNeedle() {
       Scanner sc = new Scanner(System.in);
       int totalArray = sc.nextInt();

       List<String> arrays = new ArrayList<>();
       for (int i = 0; i < totalArray; i++) {
            String needle = sc.next();
            arrays.add(needle);
       }
       String needleToFind = sc.next();

       sc.close();

        for (int i = 0; i < arrays.size(); i++) {
            if (needleToFind.equals(arrays.get(i))) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void blueOcean() {
        Scanner sc = new Scanner(System.in);
        int totalArray = sc.nextInt();

        List<Integer> arrays = new ArrayList<>();
        for (int i = 0; i < totalArray; i++) {
            int number = sc.nextInt();
            arrays.add(number);
        }

        int n = sc.nextInt();

        sc.close();

        List<Integer> newArr = new ArrayList<>();
        for (int number : arrays) {
            if (n != number) {
                newArr.add(number);
            }
        }

        System.out.println(newArr);
    }
}
