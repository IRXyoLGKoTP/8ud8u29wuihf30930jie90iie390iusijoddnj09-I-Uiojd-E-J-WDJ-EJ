import java.util.Scanner;

public class thyoogabooga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("is Emma ooga booga? ");
        String response1 = scanner.nextLine();
        if (response1.equals("yes")) {
            System.out.println("nuhh uhh");
        } else if (response1.equals("no")) {
            System.out.println("corect emma is the not good booga ooga!");
        }

        System.out.print("Is liam ooga booga?!?! ");
        String response2 = scanner.nextLine();
        if (response2.equals("yes") && !response1.equals("yes")) {
            System.out.println("nuh uh!");
        }
        System.out.print(" How old you🤨?");


        Integer response3 = Integer.valueOf(scanner.nextLine());
        if (response3.equals(100)) {
            System.out.println("😭😭🙏");
        } else if (response3.equals(0)) {
            System.out.println("so you were just born? cool.");
            scanner.close();
        for (int i = 0; i < 310; i++) {
                System.out.println("it has been " + i + " days since josh started playing brawl stars.");
            }
            int i = 0;
            while (i < 5) {
                System.out.println(i);
                i++;

            }
        }
    }
}

