package midTest;
import javax.swing.*;
import java.awt.event.ActionEvent;
public class q8 {
    private static int[][] a = {{1, 2, 3}, {1, 2}, {1}, {1, 2, 3}};
    private static int row = 0;

    public static void main(String[] args) {
        Timer timer = new Timer(1000, event -> {
            if (row < a.length) {
                for (int num : a[row]) {
                    System.out.print(num + " ");
                }
                System.out.println();
                row++;
            } else {
                ((Timer) event.getSource()).stop();
            }
        });

        timer.start();
    }
}
