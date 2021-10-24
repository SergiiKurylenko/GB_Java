package Lesson8.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.math.MathContext;

public class CommandListner implements ActionListener {
    private JTextField in;

    public CommandListner(JTextField in) {
        this.in = in;
    }


    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();
        if (ApplicationFrame.start) {
            if (command.equals("-")) {
                in.setText(command);
                ApplicationFrame.start = false;
            } else ApplicationFrame.lastCommand = command;
        } else {
            calculate(new BigInteger(in.getText()));
            ApplicationFrame.lastCommand = command;
            ApplicationFrame.start = true;
        }

    }

    public void calculate(BigInteger x) {
        if (ApplicationFrame.lastCommand.equals("+")) ApplicationFrame.result = ApplicationFrame.result.add(x);
        else if (ApplicationFrame.lastCommand.equals("-")) ApplicationFrame.result = ApplicationFrame.result.subtract(x);
        else if (ApplicationFrame.lastCommand.equals("sqrt")) ApplicationFrame.result = (x.sqrt());
        else if (ApplicationFrame.lastCommand.equals("*")) ApplicationFrame.result = ApplicationFrame.result.multiply(x);
        else if (ApplicationFrame.lastCommand.equals("=")) ApplicationFrame.result = x;
        if (ApplicationFrame.result.compareTo(BigInteger.ZERO) == 0) {
            ApplicationFrame.result = BigInteger.ZERO;
        }
        in.setText(ApplicationFrame.result.toString());
    }
}
