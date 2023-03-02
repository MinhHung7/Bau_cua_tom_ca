import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.Button;

public class SignFrame {
    
    public static void main(String[] args) {
        final int screenWidth = 500;
        final int screenHeight = 400;

        JLabel nameLabel = new JLabel("Bau Cua Tom Ca");
        nameLabel.setForeground(Color.yellow);
        nameLabel.setFont(new Font("Arial",Font.BOLD,40));

        JLabel logo = new JLabel();
        ImageIcon icon = new ImageIcon("Bau_cua_tom_ca.png");
        logo.setIcon(icon);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setPreferredSize(new Dimension(screenWidth,40));
        buttonPanel.setBackground(Color.red);
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER,60,0));

        Button signUp = new Button("Sign up");

        signUp.setLocation(100, 100);

        signUp.setPreferredSize(new Dimension(140,40));
        //signUp.setShape(round);
        signUp.setForeground(Color.red);
        signUp.setFont(new Font("Arial",Font.BOLD,25));
        signUp.setBackground(Color.yellow);
        signUp.setFocusable(false);
        
        JButton signIn = new JButton("Sign in");
        signIn.setPreferredSize(new Dimension(140,40));
        signIn.setForeground(Color.red);
        signIn.setFont(new Font("Arial",Font.BOLD,25));
        signIn.setBackground(Color.yellow);
        signIn.setFocusable(false);

        buttonPanel.add(signUp);
        buttonPanel.add(signIn);


        JPanel panel = new JPanel();
        panel.setBackground(Color.red);
        panel.setPreferredSize(new Dimension(screenWidth,screenHeight));
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,30,(int)screenHeight/9));
        panel.add(nameLabel);
        panel.add(buttonPanel);
        panel.add(logo);


        JFrame frame = new JFrame();
        frame.setTitle("Bau cua tom ca");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
