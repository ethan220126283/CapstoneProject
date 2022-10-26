package za.ac.cput.library_management.ui;
import org.springframework.stereotype.Component;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
@Component
public class LoginView implements ActionListener {
    private final JFrame mainFrame;
    private final JPanel pnlLeft, pnlRight;
    private final JLabel lblUsername, lblPassword, lblImage, lblHeading;
    private final JTextField txtUsername;
    private final JPasswordField txtPassword;
    private final JButton btnLogin,btnCancel;
    private final Font fontNormal, fontHeading;

    public LoginView() {
        mainFrame = new JFrame("Library Management");
        pnlLeft = new JPanel();
        pnlRight = new JPanel();

        lblUsername = new JLabel("Username: ");
        lblPassword = new JLabel("Password: ");
        lblImage = new JLabel(new ImageIcon("C:\\Users\\darry\\OneDrive\\Desktop\\Reactworkspace\\CapstoneProject\\images"));
        lblHeading = new JLabel("Library Management");

        txtUsername = new JTextField(30);
        txtPassword = new JPasswordField(30);
        txtUsername.setMaximumSize(txtUsername.getPreferredSize());
        txtPassword.setMaximumSize(txtPassword.getPreferredSize());

        btnLogin = new JButton("LOGIN");
        btnCancel = new JButton("CANCEL");

        fontNormal = new Font(Font.SERIF, Font.PLAIN,  15);
        fontHeading = new Font(Font.SERIF, Font.BOLD,  25);

        lblImage.setPreferredSize(new Dimension(400, 400));
        pnlLeft.setMaximumSize(new Dimension(400, 400));
        pnlRight.setMaximumSize(new Dimension(600, 400));

        mainFrame.pack();
        mainFrame.setVisible(true);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        txtUsername.setText("john");
        txtPassword.setText("123");

    }

    public void showGUI() {
        btnLogin.addActionListener(this);
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });
        lblHeading.setFont(fontHeading);
        txtUsername.setFont(fontNormal);
        txtPassword.setFont(fontNormal);

        btnLogin.setBackground(Color.black);
        btnCancel.setBackground(Color.red);
        btnCancel.setForeground(Color.white);
        btnLogin.setForeground(Color.decode("#f59b42"));

        pnlLeft.add(lblImage);

        pnlRight.setBackground(Color.decode("#C21460"));
        pnlRight.setLayout(new BoxLayout(pnlRight, BoxLayout.Y_AXIS));
        pnlRight.setBorder(BorderFactory.createEmptyBorder(100, 80, 0, 0));
        pnlRight.add(lblHeading);
        pnlRight.add(lblUsername);
        pnlRight.add(txtUsername);
        pnlRight.add(lblPassword);
        pnlRight.add(txtPassword);
        pnlRight.add(btnLogin);
        pnlRight.add(btnCancel);


        mainFrame.add(pnlLeft, BorderLayout.WEST);
        mainFrame.add(pnlRight, BorderLayout.EAST);

        mainFrame.setSize(new Dimension(1000, 400));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
                String Name = txtUsername.getText();
                String password = txtPassword.getText();
                if(Name.equals("john") && password.equals("123")){

                    JOptionPane.showMessageDialog(mainFrame,"Logged in");

                   libraryGUI libGui = new libraryGUI();
                    libGui.setVisible(true);


        }else{
                    JOptionPane.showMessageDialog(mainFrame,"Try again");

                }
    }

}
