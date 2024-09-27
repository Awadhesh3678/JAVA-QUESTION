import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class RandomNumberGenerator extends JFrame {
    
    // Components
    private JButton generateButton;
    private JLabel resultLabel;
    
    // Constructor
    public RandomNumberGenerator() {
        // Set the title of the window
        setTitle("Random Number Generator");
        
        // Set the size of the window
        setSize(300, 400);
        
        // Set default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Set layout to null for absolute positioning
        setLayout(null);
        
        // Initialize button and label
        generateButton = new JButton("Generate Random Number");
        resultLabel = new JLabel("Click the button to generate a number");
        
        // Set bounds for the components (x, y, width, height)
        generateButton.setBounds(50, 50, 200, 30);
        resultLabel.setBounds(50, 100, 200, 30);
        
        // Add ActionListener to the button
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Generate a random number between 1 and 68
                Random random = new Random();
                int randomNumber = random.nextInt(68) + 1;
                
                // Display the generated number in the label
                resultLabel.setText("Generated Number: " + randomNumber);
            }
        });
        
        // Add the button and label to the JFrame
        add(generateButton);
        add(resultLabel);
        
        // Make the window visible
        setVisible(true);
    }
    
    // Main method
    public static void main(String[] args) {
        // Create an instance of the RandomNumberGenerator class to display the GUI
        new RandomNumberGenerator();
    }
}


