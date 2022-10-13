package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcView extends JFrame {

    private JTextField firstNumber = new JTextField(10);
    private JLabel addLabel = new JLabel("+");

    private JTextField secondNumber = new JTextField(10);
    private JButton calcButton = new JButton("Calculate");

    private JTextField theSolution = new JTextField(10);

    public CalcView (){
        JPanel calcPanel = new JPanel();
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        calcPanel.add(firstNumber);
        calcPanel.add(addLabel);
        calcPanel.add(secondNumber);
        calcPanel.add(calcButton);
        calcPanel.add(theSolution);

        this.add(calcPanel);

//        calcButton.addActionListener((ActionEvent e) -> {
//
//        });
    }

    public  int getFirstNumber() {
        return Integer.parseInt(firstNumber.getText());
    }
    public  int getSecondNumber() {
        return Integer.parseInt(secondNumber.getText());
    }
    public void setTheSolution (int sol){
        theSolution.setText(Integer.toString(sol));
    }

    public void addCalcListener (ActionListener listenForCalcButton){
        calcButton.addActionListener(listenForCalcButton);
    }
    public void displayErrorMessage (String errorMessage){
        JOptionPane.showMessageDialog(this,errorMessage);
    }

}
