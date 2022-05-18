import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        String name = sc.nextLine();
        while (true) {
            System.out.printf("%s 사랑해줘❤\n",name);
            Thread.sleep(500);
            System.out.printf("%s 사랑해줄래요?\n",name);
            Thread.sleep(500);
        }
    }
}
