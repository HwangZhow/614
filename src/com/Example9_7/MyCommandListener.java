package com.Example9_7;

import javax.swing.*;
import java.awt.event.ActionListener;

public interface MyCommandListener extends ActionListener {
    public void setJTextField(JTextField text);
    public void setJTextArea(JTextArea area);
}
