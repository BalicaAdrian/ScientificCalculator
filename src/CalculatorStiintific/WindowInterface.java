package CalculatorStiintific;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowInterface {
    static String operations;
    static double firstNumber;
    static double secondNumber;
    public static void main(String[] args) {

        JFrame frame= new JFrame("Scientific calculator");
        frame.setSize(800,600);//set dimensions
        frame.setLocationRelativeTo(null);// positioning window in center
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        // -------------------Buttons declaration---------------
        JButton digitOne=new JButton();
        digitOne.setText("1");
       // digitOne.setPreferredSize(new Dimension(1,50));
       // digitOne.setFont(new Font("a",Font.BOLD,40));

        JButton digitTwo=new JButton();
        digitTwo.setText("2");
        JButton digitThree=new JButton();
        digitThree.setText("3");
        JButton digitFour=new JButton();
        digitFour.setText("4");
        JButton digitFive=new JButton();
        digitFive.setText("5");
        JButton digitSix=new JButton();
        digitSix.setText("6");
        JButton digitSeven=new JButton();
        digitSeven.setText("7");
        JButton digitEight=new JButton();
        digitEight.setText("8");
        JButton digitNine=new JButton();
        digitNine.setText("9");
        JButton Minus=new JButton();
        Minus.setText("-");
        JButton Plus=new JButton();
        Plus.setText("+");
        JButton Equal=new JButton();
        Equal.setText("=");
        JButton Zero=new JButton();
        Zero.setText("0");
        JButton Coma=new JButton();
        Coma.setText(".");
        JButton Clear=new JButton();
        Clear.setText("C");



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


        JPanel center=new JPanel(new GridLayout(0,3));
        center.setPreferredSize(new Dimension(800,430));
        center.add(Minus);
        center.add(Plus);
        center.add(Equal);
        center.add(digitOne);
        center.add(digitTwo);
        center.add(digitThree);
        center.add(digitFour);
        center.add(digitFive);
        center.add(digitSix);
        center.add(digitSeven);
        center.add(digitEight);
        center.add(digitNine);
        center.add(Zero);
        center.add(Coma);
        center.add(Clear);

        JPanel north= new JPanel(new BorderLayout());
        JPanel north2=new JPanel(new BorderLayout());
        //north.setPreferredSize(new Dimension(100,100));
        JLabel result= new JLabel();
        JLabel secondResult=new JLabel("");
        secondResult.setFont(new Font("a",Font.BOLD,20));
       //.getContentPane().add(result,BorderLayout.PAGE_START);
        north.add(result);
        north2.add(secondResult);
    //frame.getContentPane().add(north);
    north.add(north2,BorderLayout.PAGE_START);
    frame.add(north,BorderLayout.NORTH);
    frame.add(center,BorderLayout.PAGE_END);



//-------------- Button Action-------------
        digitOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText()+"1");
                result.setFont(new Font("1",Font.BOLD,50));

            }
        });

        digitTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText()+"2");
                result.setFont(new Font("1",Font.BOLD,50));
            }
        });

        digitThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText()+"3");
                result.setFont(new Font("1",Font.BOLD,50));
            }
        });

        digitFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText()+"4");
                result.setFont(new Font("1",Font.BOLD,50));
            }
        });

        digitFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText()+"5");
                result.setFont(new Font("1",Font.BOLD,50));
            }
        });

        digitSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText()+"6");
                result.setFont(new Font("1",Font.BOLD,50));
            }
        });

        digitSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText()+"7");
                result.setFont(new Font("1",Font.BOLD,50));
            }
        });

        digitEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText()+"8");
                result.setFont(new Font("1",Font.BOLD,50));
            }
        });

        digitNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText()+"9");
                result.setFont(new Font("1",Font.BOLD,50));
            }
        });
        Zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText()+"0");
                result.setFont(new Font("1",Font.BOLD,50));
            }
        });
       Coma.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               if(!result.getText().contains(".")){
                   result.setText(result.getText() +  Coma.getText());
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
                firstNumber=Double.parseDouble(result.getText());
               result.setText(result.getText()+ Plus.getText());
               secondResult.setText(result.getText());
               operations= "+";
               result.setText("");


           }
       });

        Minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber=Double.parseDouble(result.getText());
                result.setText(result.getText()+ Minus.getText());
                secondResult.setText(result.getText());
                operations= "-";
                result.setText("");


            }
        });

       Equal.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               String resultOfOperation;

               if(operations=="+"){

                   secondNumber=Double.parseDouble(result.getText());
                   resultOfOperation=String.format("%.2f",firstNumber+secondNumber);
                   secondResult.setText(secondResult.getText()+result.getText());
                   result.setText(resultOfOperation);

               }
              else  if(operations=="-"){

                   secondNumber=Double.parseDouble(result.getText());
                   resultOfOperation=String.format("%.2f",firstNumber-secondNumber);
                   secondResult.setText(secondResult.getText()+result.getText());
                   result.setText(resultOfOperation);

               }
           }
       });



    }

}
