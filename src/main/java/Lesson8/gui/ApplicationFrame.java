package Lesson8.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.math.BigInteger;

public class ApplicationFrame extends JFrame {

    public ApplicationFrame() {
        setTitle("Application Frame v1.0");
        setBounds(1500, 1500, 250, 350);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setJMenuBar(getjMenuBar());

        setLayout(new BorderLayout());

        JPanel top = createTop();
        add(top, BorderLayout.NORTH);

        JTextField in = (JTextField) top.getComponent(0);

        add(createMainPanel(in), BorderLayout.CENTER);


        setVisible(true);
    }
    public static BigInteger result;
    public static String lastCommand;
    public static boolean start;



    private JPanel createTop() {
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());

        JTextField in = new JTextField();
        in.setEditable(false);
        top.add(in, BorderLayout.NORTH);

        return top;
    }

    private JMenuBar getjMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = menuBar.add(new JMenu("File"));
        menu.add(new JMenuItem("Clear"));
        JMenuItem exit = menu.add(new JMenuItem("Exit"));
        exit.addActionListener(new ExitButtonListener());
        return menuBar;
    }

    private JPanel createMainPanel(JTextField in) {
        JPanel bottom = new JPanel();
        bottom.setLayout(new BorderLayout());
        JPanel digitsPanel = new JPanel();
        digitsPanel.setLayout(new GridLayout(4, 3));



        ActionListener buttonListener = new ButtonListener(in);
        ActionListener commandListener = new CommandListner(in);
        ActionListener clearButtonListener = new ClearButtonListner(in);

        result = BigInteger.ZERO;
        lastCommand = "=";
        start = true;

        for (int i = 1; i <= 9; i++) {
            JButton btn = new JButton(String.valueOf(i));
            btn.addActionListener(buttonListener);
            digitsPanel.add(btn);
        }
        JButton btn = new JButton("0");
        btn.addActionListener(buttonListener);
        digitsPanel.add(btn);

        JButton sqrt = new JButton("sqrt");
        sqrt.addActionListener(commandListener);
        digitsPanel.add(sqrt);

        JButton clear = new JButton("C");
        clear.addActionListener(clearButtonListener);
        digitsPanel.add(clear);

        bottom.add(digitsPanel, BorderLayout.CENTER);


        JPanel advPanel = new JPanel();
//        advPanel.setLayout(new BoxLayout(advPanel, BoxLayout.Y_AXIS));
        advPanel.setLayout(new GridLayout(4, 1));

        JButton minus = new JButton("-");
        minus.addActionListener(commandListener);
        advPanel.add(minus);

        JButton plus = new JButton("+");
        plus.addActionListener(commandListener);
        advPanel.add(plus);

        JButton calc = new JButton("=");
        calc.addActionListener(commandListener);
        advPanel.add(calc);

        JButton multiply = new JButton("*");
        multiply.addActionListener(clearButtonListener);
        advPanel.add(multiply);

        bottom.add(advPanel, BorderLayout.WEST);


        return bottom;
    }

}
