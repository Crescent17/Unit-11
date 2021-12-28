import java.util.Scanner;

public class X {
    private int x;

    public X() {
        System.out.print("Enter the value of x: ");
        Scanner x = new Scanner(System.in);
        this.x = x.nextInt();
    }

    public void x() {
        for (int x = 1; x < 13; x++) {
            System.out.println(this.x + " times " + x + " equals " + x * this.x);
        }
    }
}
