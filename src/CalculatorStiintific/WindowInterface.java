package CalculatorStiintific;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class WindowInterface {
    static String operations;
    static double firstNumber=0;
    static double secondNumber=0;
    public static void main(String[] args) {

        JFrame frame= new JFrame("Scientific calculator");
        frame.setSize(650,700);//set dimensions
        frame.setLocationRelativeTo(null);// positioning window in center
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        // -------------------Buttons declaration---------------
        JButton digitOne=new JButton();

        digitOne.setText("1");
       // digitOne.setPreferredSize(new Dimension(1,50));
        digitOne.setFont(new Font("a",Font.BOLD,40));

        JButton digitTwo=new JButton();
        digitTwo.setText("2");
        digitTwo.setFont(new Font("a",Font.BOLD,40));

        JButton digitThree=new JButton();
        digitThree.setText("3");
        digitThree.setFont(new Font("a",Font.BOLD,40));

        JButton digitFour=new JButton();
        digitFour.setText("4");
        digitFour.setFont(new Font("a",Font.BOLD,40));

        JButton digitFive=new JButton();
        digitFive.setText("5");
        digitFive.setFont(new Font("a",Font.BOLD,40));

        JButton digitSix=new JButton();
        digitSix.setText("6");
        digitSix.setFont(new Font("a",Font.BOLD,40));

        JButton digitSeven=new JButton();
        digitSeven.setText("7");
        digitSeven.setFont(new Font("a",Font.BOLD,40));

        JButton digitEight=new JButton();
        digitEight.setText("8");
        digitEight.setFont(new Font("a",Font.BOLD,40));

        JButton digitNine=new JButton();
        digitNine.setText("9");
        digitNine.setFont(new Font("a",Font.BOLD,40));

        JButton Minus=new JButton();
        Minus.setText("-");
        Minus.setFont(new Font("a",Font.BOLD,40));

        JButton Plus=new JButton();
        Plus.setText("+");
        Plus.setFont(new Font("a",Font.BOLD,40));

        JButton Equal=new JButton();
        Equal.setText("=");
        Equal.setFont(new Font("a",Font.BOLD,40));

        JButton Zero=new JButton();
        Zero.setText("0");
        Zero.setFont(new Font("a",Font.BOLD,40));

        JButton Coma=new JButton();
        Coma.setText(".");
        Coma.setFont(new Font("a",Font.BOLD,40));

        JButton Clear=new JButton();
        Clear.setText("C");
        Clear.setFont(new Font("a",Font.BOLD,40));

        JButton sqrt=new JButton();
        sqrt.setText("√");
        sqrt.setFont(new Font("a",Font.BOLD,40));

        JButton Divide=new JButton();
        Divide.setText("/");
        Divide.setFont(new Font("a",Font.BOLD,40));

        JButton Multiply=new JButton();
        Multiply.setText("x");
        Multiply.setFont(new Font("a",Font.BOLD,40));

        JButton PlusOrMinus=new JButton();
        PlusOrMinus.setText("±");
        PlusOrMinus.setFont(new Font("a",Font.BOLD,40));

        JButton doubleZero=new JButton();
        doubleZero.setText("00");
        doubleZero.setFont(new Font("a",Font.BOLD,40));

        JButton powerTwo= new JButton();
        powerTwo.setText("X^2");
        powerTwo.setFont(new Font("a",Font.BOLD,25));

        ///TO DOO


        JButton backSpace=new JButton();
        backSpace.setText("⌫");
        backSpace.setFont(new Font("a",Font.BOLD,40));

        JButton factorial=new JButton();
        factorial.setText("X!");
        factorial.setFont(new Font("a",Font.BOLD,40));

        JButton history= new JButton();
        history.setText("History");
        history.setFont(new Font("a",Font.BOLD,20));

        JButton percent= new JButton();
        percent.setText("%");
        percent.setFont(new Font("a",Font.BOLD,40));


        // --------------- Layout -----------





        //GridLayout layoutWindow=new GridLayout(0,3);
        // frame.setLayout(layoutWindow);


        /*frame.getContentPane().add(digitOne);
        frame.getContentPane().add(digitTwo);
        frame.getContentPane().add(digitThree);
        frame.getContentPane().add(digitFour);
        frame.getContentPane().add(digitFive);
        frame.getContentPane().add(digitSix);
        frame.getContentPane().add(digitSeven);
        frame.getContentPane().add(digitEight);
        frame.getContentPane().add(digitNine);*/

        frame.setLayout(new BorderLayout());


        JPanel center=new JPanel(new GridLayout(0,5,20,15));
        center.setBorder(BorderFactory.createEmptyBorder(0,10,5,10));
        center.setPreferredSize(new Dimension(600,480));

        center.add(history);     center.add(percent);     center.add(powerTwo);  center.add(factorial);   center.add(backSpace);
        center.add(digitSeven);  center.add(digitEight);  center.add(digitNine); center.add(PlusOrMinus); center.add(sqrt);
        center.add(digitFour);   center.add(digitFive);   center.add(digitSix);   center.add(Plus);       center.add(Multiply);
        center.add(digitOne);    center.add(digitTwo);    center.add(digitThree); center.add(Minus);      center.add(Divide);
        center.add(Zero);         center.add(doubleZero); center.add(Coma);       center.add(Equal);      center.add(Clear);


        JPanel north = new JPanel(new BorderLayout());
        JPanel north2 = new JPanel(new BorderLayout());
        //north.setPreferredSize(new Dimension(100,100));
        JLabel result = new JLabel();
        JLabel secondResult = new JLabel("");
        secondResult.setFont(new Font("a", Font.BOLD, 20));
        //.getContentPane().add(result,BorderLayout.PAGE_START);
        north.add(result);
        north2.add(secondResult);
        //frame.getContentPane().add(north);
        north.add(north2, BorderLayout.PAGE_START);
        frame.add(north, BorderLayout.NORTH);
        frame.add(center, BorderLayout.PAGE_END);


//-------------- Button Action-------------

        Divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble(result.getText());
                result.setText(result.getText() + Divide.getText());

                secondResult.setText(result.getText());
                operations = "/";
                result.setText("");


            }
        });

        powerTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double number;
                number = Double.parseDouble(result.getText());
                number = number * number;
                secondResult.setText(result.getText() + "x" + result.getText());
                result.setText(String.format("%.5f", number));
            }
        });
        doubleZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "00");
            }
        });

        PlusOrMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double number;
                number = Double.parseDouble(result.getText());
                number = number * (-1);
                result.setText(Double.toString(number));
            }
        });

        Multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble(result.getText());
                result.setText(result.getText() + Multiply.getText());

                secondResult.setText(result.getText());
                operations = "x";
                result.setText("");

            }
        });
        digitOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "1");
                result.setFont(new Font("1", Font.BOLD, 50));

            }
        });

        
        digitTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "2");
                result.setFont(new Font("1", Font.BOLD, 50));
            }
        });

        digitThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "3");
                result.setFont(new Font("1", Font.BOLD, 50));
            }
        });

        digitFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "4");
                result.setFont(new Font("1", Font.BOLD, 50));
            }
        });

        digitFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "5");
                result.setFont(new Font("1", Font.BOLD, 50));
            }
        });

        digitSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "6");
                result.setFont(new Font("1", Font.BOLD, 50));
            }
        });

        digitSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "7");
                result.setFont(new Font("1", Font.BOLD, 50));
            }
        });

        digitEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "8");
                result.setFont(new Font("1", Font.BOLD, 50));
            }
        });

        digitNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "9");
                result.setFont(new Font("1", Font.BOLD, 50));
            }
        });
        Zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "0");
                result.setFont(new Font("1", Font.BOLD, 50));
            }
        });
        Coma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!result.getText().contains(".")) {
                    result.setText(result.getText() + Coma.getText());
                }
            }
        });

        Clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setText("");
                secondResult.setText("");
            }
        });

        Plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble(result.getText());
                result.setText(result.getText() + Plus.getText());

                secondResult.setText(result.getText());
                operations = "+";
                result.setText("");


            }
        });

        Minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble(result.getText());
                result.setText(result.getText() + Minus.getText());
                secondResult.setText(result.getText());
                operations = "-";
                result.setText("");


            }
        });

        sqrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double number;
                String resultOfsqrt;
                number = Double.parseDouble(result.getText());
                resultOfsqrt = String.format("%.2f", Math.sqrt(number));
                result.setText(resultOfsqrt);


            }
        });

        Equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String resultOfOperation;

                if (operations == "+") {

                    secondNumber = Double.parseDouble(result.getText());
                    resultOfOperation = String.format("%.4f", firstNumber + secondNumber);
                    secondResult.setText(secondResult.getText() + result.getText());
                    result.setText(resultOfOperation);

                } else if (operations == "-") {

                    secondNumber = Double.parseDouble(result.getText());
                    resultOfOperation = String.format("%.4f", firstNumber - secondNumber);
                    secondResult.setText(secondResult.getText() + result.getText());
                    result.setText(resultOfOperation);

                } else if (operations == "/") {
                    secondNumber = Double.parseDouble(result.getText());
                    resultOfOperation = String.format("%.4f", firstNumber / secondNumber);
                    secondResult.setText(secondResult.getText() + result.getText());
                    result.setText(resultOfOperation);
                } else if (operations == "x") {
                    secondNumber = Double.parseDouble(result.getText());
                    resultOfOperation = String.format("%.4f", firstNumber * secondNumber);
                    secondResult.setText(secondResult.getText() + result.getText());
                    result.setText(resultOfOperation);
                }
            }
        });


    }

}
