import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        scanner sc = new Scanner(System.in);

        double amount = sc.nextD
        JFrame frame = new JFrame("Curreny converter");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("Converter");
        JButton button = new JButton();
        button.setText("Convert");
        panel.add(label);
        panel.add(button);
        frame.add(panel);
        frame.setSize(300, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
