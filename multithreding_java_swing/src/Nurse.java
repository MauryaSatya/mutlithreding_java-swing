
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;

import javax.swing.plaf.ColorUIResource;


public class Nurse extends JFrame implements ActionListener {
    public Nurse() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(size.width, size.height);
        setLayout(null);

        JPanel mainpanel = new JPanel();
        mainpanel.setLayout(null);
        mainpanel.setBackground(new Color(0, 155, 0));
        mainpanel.setBounds(0, 0, size.width, size.height);
        add(mainpanel);

        JPanel panel = new JPanel();
        mainpanel.add(panel);
        panel.setLayout(null);
        panel.setBackground(ColorUIResource.cyan);
        panel.setBounds(200, 50, 1200, 600);
        panel.setBorder(new BevelBorder(BevelBorder.LOWERED, ColorUIResource.black, ColorUIResource.black,
                ColorUIResource.BLACK, ColorUIResource.BLACK));

        JButton b1 = new JButton("Submit ");
        b1.setBounds(100, 50, 200, 200);
        b1.setLayout(null);
        b1.addActionListener(this);
        panel.add(b1);

        JButton b2 = new JButton("Forgate pasword");
        b2.setBounds(100, 380, 200, 200);
        b2.setLayout(null);
        b2.addActionListener(this);
        panel.add(b2);

        JButton b3 = new JButton("Sign up");
        b3.setBounds(550, 50, 200, 200);
        b3.setLayout(null);
        b3.addActionListener(this);
        panel.add(b3);

        JButton b4 = new JButton("Submit ");
        b4.setBounds(320, 50, 200, 200);
        b4.setLayout(null);
        b4.addActionListener(this);
        panel.add(b4);

        JButton b5 = new JButton("Forgate pasword");
        b5.setBounds(320, 380, 200, 200);
        b5.setLayout(null);
        b5.addActionListener(this);
        panel.add(b5);

        JButton b6 = new JButton("Sign up");
        b6.setBounds(550, 380, 200, 200);
        b6.setLayout(null);
        b6.addActionListener(this);
        panel.add(b6);

    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("helllo");
    }

    public static void main(String[] args) {
        new Nurse().setVisible(true);
        ;
    }

}
