import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.event.MouseEvent;

import java.awt.event.MouseAdapter;
import javax.swing.plaf.ColorUIResource;

public class newframe {

    private Thread thread1, thread2, thread3;
    private JFrame frame;
    private JPanel centerPanel;

    public newframe() {
        frame = new JFrame("Border Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        // left panel
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        JPanel leftPanel = new JPanel(new GridBagLayout());
        leftPanel.setBackground(Color.CYAN);
        leftPanel.setSize(new Dimension(800, size.height - 30));
        JScrollPane scrollPane = new JScrollPane(leftPanel);
        scrollPane.getVerticalScrollBar().setUnitIncrement(100);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        frame.add(scrollPane, BorderLayout.WEST);

        // left panel
        JPanel leftPanel2 = new JPanel(null);

        frame.add(leftPanel2, BorderLayout.EAST);

        // left panel
        JPanel leftPanel3 = new JPanel(null);

        frame.add(leftPanel3, BorderLayout.NORTH);

        // left panel
        JPanel leftPanel4 = new JPanel(null);

        frame.add(leftPanel4, BorderLayout.SOUTH);

        // center panel
        centerPanel = new JPanel(null);
        centerPanel.setBackground(ColorUIResource.MAGENTA);
        frame.add(centerPanel, BorderLayout.CENTER);

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(5, 20, 5, 20);
        gbc.gridx = 0;
        gbc.gridy = 0;
        JButton button1 = new JButton("    Doctores     ");
        leftPanel.add(button1, gbc);
        button1.setSize(100, 40);
        button1.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent me) {
                // task1
                if (thread2 != null && thread2.isAlive())
                    thread2.interrupt();
                if (thread3 != null && thread3.isAlive())
                    thread3.interrupt();
                thread1();

            }
        });

        gbc.gridy = 1;
        JButton button2 = new JButton("       Nurse       ");
        button2.setSize(100, 40);
        button2.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent me) {
                // task2
                if (thread1 != null && thread1.isAlive())
                    thread1.interrupt();
                if (thread3 != null && thread3.isAlive())
                    thread3.interrupt();
                thread2();
            }
        });
        leftPanel.add(button2, gbc);

        gbc.gridy = 2;
        JButton button3 = new JButton("House keeping");
        button3.setSize(100, 40);
        button3.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent me) {
                // task1
                if (thread2 != null && thread2.isAlive())
                    thread2.interrupt();
                if (thread1 != null && thread1.isAlive())
                    thread1.interrupt();
                thread3();
            }
        });
        leftPanel.add(button3, gbc);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public static void main(String[] args) {
        new newframe();
    }

    public void thread1() {
        thread1 = new Thread(new Runnable() {
            public void run() {
                try {

                } catch (Exception e) {
                }

                new AddPanel(frame, centerPanel);
                centerPanel = new JPanel(null);
                centerPanel.setBackground(ColorUIResource.RED);
                frame.add(centerPanel, BorderLayout.CENTER);

                JButton b1 = new JButton("hello user");
                b1.setBounds(200, 100, 200, 100);
                b1.setBorder(new BevelBorder(BevelBorder.RAISED));
                centerPanel.add(b1);

                JButton b2 = new JButton("hello user");
                b2.setBounds(200, 300, 200, 100);
                b2.setBorder(new BevelBorder(BevelBorder.RAISED));
                centerPanel.add(b2);

                JButton b3 = new JButton("hello user");
                b3.setBounds(200, 500, 200, 100);
                b3.setBorder(new BevelBorder(BevelBorder.RAISED));
                centerPanel.add(b3);

                JButton b4 = new JButton("hello user");
                b4.setBounds(800, 100, 200, 100);
                b4.setBorder(new BevelBorder(BevelBorder.RAISED));
                centerPanel.add(b4);

                JButton b5 = new JButton("hello user");
                b5.setBounds(800, 300, 200, 100);
                b5.setBorder(new BevelBorder(BevelBorder.RAISED));
                centerPanel.add(b5);

                JButton b6 = new JButton("hello user");
                b6.setBounds(800, 500, 200, 100);
                b6.setBorder(new BevelBorder(BevelBorder.RAISED));
                centerPanel.add(b6);

                centerPanel.revalidate();
                centerPanel.repaint();

                System.out.println("thread execution finished");

            }

        
        }


);
thread1.start();

    }

    public void thread2() {
        thread2 = new Thread(new Runnable() {
            public void run() {
                try {

                } catch (Exception e) {
                }

                new AddPanel(frame, centerPanel);
                centerPanel = new JPanel(null);
                centerPanel.setBackground(ColorUIResource.ORANGE);
                frame.add(centerPanel, BorderLayout.CENTER);

                JButton b1 = new JButton("hello user");
                b1.setBounds(200, 100, 200, 100);
                b1.setBorder(new BevelBorder(BevelBorder.RAISED));
                centerPanel.add(b1);

                JButton b2 = new JButton("hello user");
                b2.setBounds(200, 300, 200, 100);
                b2.setBorder(new BevelBorder(BevelBorder.RAISED));
                centerPanel.add(b2);

                JButton b3 = new JButton("hello user");
                b3.setBounds(200, 500, 200, 100);
                b3.setBorder(new BevelBorder(BevelBorder.RAISED));
                centerPanel.add(b3);

                JButton b4 = new JButton("hello user");
                b4.setBounds(800, 100, 200, 100);
                b4.setBorder(new BevelBorder(BevelBorder.RAISED));
                centerPanel.add(b4);

                JButton b5 = new JButton("hello user");
                b5.setBounds(800, 300, 200, 100);
                b5.setBorder(new BevelBorder(BevelBorder.RAISED));
                centerPanel.add(b5);

                JButton b6 = new JButton("hello user");
                b6.setBounds(800, 500, 200, 100);
                b6.setBorder(new BevelBorder(BevelBorder.RAISED));
                centerPanel.add(b6);

                centerPanel.revalidate();
                centerPanel.repaint();

                System.out.println("thread execution finished");

            }
        });
        thread2.start();
    }

    public void thread3() {
        thread3 = new Thread(new Runnable() {
            public void run() {
                try {

                } catch (Exception e) {
                }

                new AddPanel(frame, centerPanel);
                centerPanel = new JPanel(null);
                centerPanel.setBackground(ColorUIResource.GREEN);
                frame.add(centerPanel, BorderLayout.CENTER);

                JButton b1 = new JButton("hello user");
                b1.setBounds(200, 100, 200, 100);
                b1.setBorder(new BevelBorder(BevelBorder.RAISED));
                centerPanel.add(b1);

                JButton b2 = new JButton("hello user");
                b2.setBounds(200, 300, 200, 100);
                b2.setBorder(new BevelBorder(BevelBorder.RAISED));
                centerPanel.add(b2);

                JButton b3 = new JButton("hello user");
                b3.setBounds(200, 500, 200, 100);
                b3.setBorder(new BevelBorder(BevelBorder.RAISED));
                centerPanel.add(b3);

                JButton b4 = new JButton("hello user");
                b4.setBounds(800, 100, 200, 100);
                b4.setBorder(new BevelBorder(BevelBorder.RAISED));
                centerPanel.add(b4);

                JButton b5 = new JButton("hello user");
                b5.setBounds(800, 300, 200, 100);
                b5.setBorder(new BevelBorder(BevelBorder.RAISED));
                centerPanel.add(b5);

                JButton b6 = new JButton("hello user");
                b6.setBounds(800, 500, 200, 100);
                b6.setBorder(new BevelBorder(BevelBorder.RAISED));
                centerPanel.add(b6);

                centerPanel.revalidate();
                centerPanel.repaint();

                System.out.println("thread execution finished");
            }
        });
        thread3.start();
    }
}
