package Lesson8.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearButtonListner implements ActionListener{
    private JTextField in;

    public ClearButtonListner(JTextField in) {
        this.in = in;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    in.setText("");
    }
}
