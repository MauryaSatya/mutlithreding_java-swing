import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;

import javax.swing.plaf.ColorUIResource;

public class loginUser extends JFrame implements ActionListener {
    public loginUser() {

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
        panel.setBounds(200, 50, 800, 600);
        panel.setBorder(new BevelBorder(BevelBorder.LOWERED, ColorUIResource.black, ColorUIResource.black,
                ColorUIResource.BLACK, ColorUIResource.BLACK));

        JLabel l1 = new JLabel("Name =");
        l1.setBackground(ColorUIResource.WHITE);
        l1.setBounds(80, 280, 200, 30);
        l1.setLayout(null);

        l1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
        panel.add(l1);

        JLabel l2 = new JLabel("Password =");
        l2.setBackground(ColorUIResource.WHITE);
        l2.setBounds(80, 350, 200, 30);
        l1.setLayout(null);
        l2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
        panel.add(l2);

        JTextField tf1 = new JTextField();
        tf1.setBackground(ColorUIResource.WHITE);
        tf1.setLayout(null);
        tf1.setBounds(300, 280, 200, 30);
        panel.add(tf1);

        JTextField tf2 = new JTextField();
        tf2.setBackground(ColorUIResource.WHITE);
        tf2.setBounds(300, 350, 200, 30);
        tf2.setLayout(null);
        panel.add(tf2);

        JButton b1 = new JButton("Submit ");
        b1.setBounds(300, 420, 100, 30);
        b1.setLayout(null);
        b1.addActionListener(this);
        panel.add(b1);

        JButton b2 = new JButton("Forgate pasword");
        b2.setBounds(400, 420, 100, 30);
        b2.setLayout(null);
        b2.addActionListener(this);
        panel.add(b2);

        JButton b3 = new JButton("Sign up");
        b3.setBounds(350, 500, 100, 30);
        b3.setLayout(null);
        b3.addActionListener(this);
        panel.add(b3);

    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("helllo");
    }

    public static void main(String[] args) {
        new loginUser().setVisible(true);
        ;
    }

}
