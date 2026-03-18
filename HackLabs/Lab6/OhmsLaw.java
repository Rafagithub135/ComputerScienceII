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

public class OhmsLaw extends JFrame implements ActionListener {

    private JTextField amps;
    private JTextField volts;
    private JTextField ohms;


public OhmsLaw(String OhmsLaw) {
        super("Ohm's Law Calculator");
        super.setSize(400, 200);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();

        JPanel topPanel = new JPanel();
        JPanel bottomPanel = new JPanel();
        topPanel.setLayout(new GridLayout(3,1));

        JLabel label = new JLabel("Enter the current (amps): ");
        amps = new JTextField(15);
        JLabel label2 = new JLabel("Enter the voltage (volts): ");
        volts = new JTextField(15);
        JLabel label3 = new JLabel("Enter the resistance (ohms): ");
        ohms = new JTextField(15);

        JPanel topRow = new JPanel();
        JPanel rowTwoPanel = new JPanel();
        JPanel rowThreePanel = new JPanel();

        topPanel.add(amps);
        topPanel.add(amps);
        topPanel.add(volts);
        topPanel.add(volts);
        topPanel.add(ohms);
        topPanel.add(ohms);

        topPanel.add(topRow);
        topPanel.add(rowTwoPanel);
        topPanel.add(rowThreePanel);

        JButton calculateButton = new JButton("Calculate");

        calculateButton.setActionCommand("Calculate");

        calculateButton.addActionListener(this);

        bottomPanel.add(calculateButton);

        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        super.add(mainPanel);
        super.setVisible(true);
}

public void actionPerformed(ActionEvent e) {
    if (e.getActionCommand().equals("Calculate")) {
        if (amps.getText().equals("") || volts.getText().equals("") || ohms.getText().equals("")) {
            
        }
    }
}

    public static void main(String[] args) {
        MultiplePanelWindow w = new MultiplePanelWindow("Ohm's Law Calculator");
    }
}