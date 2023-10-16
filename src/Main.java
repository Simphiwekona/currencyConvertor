import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;


public class Main {
    public static class  CurrencyConverter extends JFrame implements ActionListener {

        private JTextField amountTextField, resultTextField;
        private JComboBox<String> currencyComboBox;

        public CurrencyConverter () {
            //Setting the Jframe
            setTitle("Currency Converter");
            setSize(400, 200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            //Creating Components
            JLabel amountLabel = new JLabel("Enter amount");
            amountTextField = new JTextField(10);

            JLabel currencyLabel = new JLabel("Select currency:");
            String[] currencies = {"USD", "ZAR", "EUR", "GBP", "CAD", "AUD", "JPY", "INR"};
            currencyComboBox = new JComboBox<>(currencies);

            JButton convertButton = new JButton("Convert");
            resultTextField = new JTextField(15);
            resultTextField.setEditable(false);

            //Layout Manager
            setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

            //Adding all the components into JFrame
            add(amountLabel);
            add(amountTextField);
            add(currencyLabel);
            add(currencyComboBox);
            add(convertButton);
            add(resultTextField);

            //adding a listener to the button
            convertButton.addActionListener(this);
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Convert")){
                double amount = Double.parseDouble(amountTextField.getText());
                String currency = (String) currencyComboBox.getSelectedItem();

                //Convertion Calculations performed
                double total;
                if (currency.equals("USD")){
                    total = amount * 0.067;
                    resultTextField.setText("Converted to Dollar: $" + total);
                } else if (currency.equals("ZAR")) {
                    total = amount * 18.77;
                    resultTextField.setText("Converted to Rand: R" + total);
                }

            }
        }


    }


    public static void main(String [] args){
        SwingUtilities.invokeLater(() -> {
            CurrencyConverter converter = new CurrencyConverter();
            converter.setVisible(true);
        });
    }
}
