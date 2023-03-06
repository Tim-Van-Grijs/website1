import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SettingsMenu extends JFrame implements ActionListener {
    private JButton settingsButton;
    private JPanel settingsPanel;
    private JCheckBox darkModeCheckbox;
    
    public SettingsMenu() {
        // create the settings button
        settingsButton = new JButton("Settings");
        settingsButton.addActionListener(this);
        
        // create the settings panel
        settingsPanel = new JPanel();
        settingsPanel.setLayout(new BoxLayout(settingsPanel, BoxLayout.PAGE_AXIS));
        settingsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // create the dark mode checkbox
        darkModeCheckbox = new JCheckBox("Dark mode");
        darkModeCheckbox.addActionListener(this);
        
        // add the components to the settings panel
        settingsPanel.add(darkModeCheckbox);
        
        // add the components to the main frame
        add(settingsButton, BorderLayout.NORTH);
        add(settingsPanel, BorderLayout.CENTER);
        
        // set the frame properties
        setTitle("Settings Menu");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e) {
        // toggle the visibility of the settings panel when the settings button is clicked
        if (e.getSource() == settingsButton) {
            settingsPanel.setVisible(!settingsPanel.isVisible());
        }
        
        // toggle dark mode when the checkbox is clicked
        if (e.getSource() == darkModeCheckbox) {
            if (darkModeCheckbox.isSelected()) {
                getContentPane().setBackground(Color.darkGray);
            } else {
                getContentPane().setBackground(Color.white);
            }
        }
    }
    
    public static void main(String[] args) {
        SettingsMenu menu = new SettingsMenu();
        menu.setVisible(true);
    }
}
