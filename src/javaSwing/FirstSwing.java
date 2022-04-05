package javaSwing;

import javax.swing.*;
import java.awt.event.*;

//button example in swing
class ButtonExample{
    void buttonEx(){
        JFrame f = new JFrame("example here");
        JButton b = new JButton("click here");
        JTextField tf = new JTextField();
        tf.setBounds(50,50,120,20);
        b.setBounds(50,200,300,40);
// add action listener
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("welcome in my world");
            }
        });
        f.add(b);
        f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}

// label example in java
class LabelExample{
    void labelEx(){
        JFrame f = new JFrame("label example");
        JLabel L1,L2;
        L1=new JLabel("first label");
        L1.setBounds(50,50,100,30);
        L2=new JLabel("second label");
        L2.setBounds(50,100,100,30);
        f.add(L1);
        f.add(L2);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }

}

public class FirstSwing {
    public static void main(String[] args){
     ButtonExample b1 = new ButtonExample();
     b1.buttonEx();

     LabelExample l1 = new LabelExample();
     l1.labelEx();

    }
}