package HackLabs.Lab6;

import HackLabs.Module8.MultiplePanelWindow;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Demonstrates using a JFrame to create a basic window.
 */
public class OhmsLaw extends JFrame implements ActionListener {

    private JTextField amps;
    private JTextField volts;
    private JTextField ohms;

    public static void main(String[] args) {
        MultiplePanelWindow w = new MultiplePanelWindow("Ohm's Law Calculator");
    }

public MultiplePaneWindow(String, "Ohm's Law'");
    JLabel amps = new JLabel("Enter the current (amps):");                                                                 //Creates the Labels and Text Fields
    field = new JTextField(15);
    JLabel volts = new JLabel("Enter the voltage (volts):");
    field2 = new JTextField(15);
    JLabel ohms = new JLabel("Enter the resistance (ohms):");
    ohms = new JTextField(15);
}