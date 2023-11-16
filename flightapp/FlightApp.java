package flightapp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlightApp {

    private JFrame frame;
    private JTextField textFrom;
    private JTextField textTo;

    private String loggedInUser;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                new FlightApp().initialize();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    private void initialize() {
        frame = new JFrame("Flight App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.YELLOW);
        JButton buttonLogin = new JButton("Login");
        buttonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showLoginDialog();
            }
        });

        // Layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 1)); // Single row layout

        panel.add(buttonLogin);

        frame.getContentPane().add(panel);
        frame.setSize(300, 100); // Smaller size to accommodate login button
        frame.setVisible(true);
    }

    private void searchFlights(String fromLocation, String toLocation) {
        // Implement your logic for flight search here
        System.out.println("Searching for flights from " + fromLocation + " to " + toLocation);
    }

    private void showLoginDialog() {
    JFrame loginFrame = new JFrame("Login");
    JPanel loginPanel = new JPanel();
    loginPanel.setLayout(new GridLayout(3, 2));

    JLabel labelUsername = new JLabel("Username:");
    JTextField textUsername = new JTextField();

    JLabel labelPassword = new JLabel("Password:");
    JPasswordField passwordField = new JPasswordField();

    // Mengatur warna biru untuk latar belakang tombol
    Color blueColor = new Color(135, 206, 235); // Warna biru langit
    JButton buttonLogin = new JButton("Login");
    buttonLogin.setBackground(blueColor);
    buttonLogin.setForeground(Color.black); // Mengatur warna teks menjadi biru

    buttonLogin.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String username = textUsername.getText();
            char[] password = passwordField.getPassword();
            loggedInUser = username;
            performLogin(username, new String(password));
            loginFrame.dispose();
            showMainMenu();
        }
    });

    loginPanel.add(labelUsername);
    loginPanel.add(textUsername);
    loginPanel.add(labelPassword);
    loginPanel.add(passwordField);
    loginPanel.add(new JLabel()); // Placeholder for spacing
    loginPanel.add(buttonLogin);

    loginFrame.getContentPane().setBackground(blueColor); // Mengatur latar belakang panel login
    loginFrame.getContentPane().add(loginPanel);
    loginFrame.setSize(300, 150);
    loginFrame.setVisible(true);
}


    private void performLogin(String username, String password) {
        // Implement your logic for user authentication here
        // For demonstration purposes, just print the credentials
        System.out.println("Logged in as: " + username);
    }

    private void showMainMenu() {
       Color blueSky = new Color(135, 206, 235); // Warna biru langit

        // Membuat tombol-tombol dengan latar belakang biru langit
        JButton buttonChooseAirline = new JButton("Choose Airline");
        buttonChooseAirline.setBackground(blueSky);

        JButton buttonChooseSeatType = new JButton("Choose Seat Type");
        buttonChooseSeatType.setBackground(blueSky);

        JButton buttonChooseMeal = new JButton("Choose Meal in Flight");
        buttonChooseMeal.setBackground(blueSky);

        JButton buttonReschedule = new JButton("Reschedule Flight");
        buttonReschedule.setBackground(blueSky);

        JButton buttonRefund = new JButton("Refund Ticket");
        buttonRefund.setBackground(blueSky);

        JButton buttonExit = new JButton("Exit");
        buttonExit.setBackground(blueSky);


        // Add action listeners to the buttons
        buttonChooseAirline.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chooseAirline();
            }
        });

        buttonChooseSeatType.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chooseSeatType();
            }
        });

        buttonChooseMeal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chooseMeal();
            }
        });

        buttonReschedule.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rescheduleFlight();
            }
        });

        buttonRefund.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refundTicket();
            }
        });
           
    buttonExit.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0); // Menutup aplikasi saat tombol Exit ditekan
        }
    });

    
        // Create main menu panel
        JPanel mainMenuPanel = new JPanel();
        mainMenuPanel.setLayout(new GridLayout(5, 1));
        mainMenuPanel.setBackground(Color.YELLOW);
        mainMenuPanel.add(buttonChooseAirline);
        mainMenuPanel.add(buttonChooseSeatType);
        mainMenuPanel.add(buttonChooseMeal);
        mainMenuPanel.add(buttonReschedule);
        mainMenuPanel.add(buttonRefund);
        mainMenuPanel.add(buttonExit);
        // Create main menu frame
        JFrame mainMenuFrame = new JFrame("Main Menu - Welcome, " + loggedInUser + "!");
        mainMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainMenuFrame.getContentPane().setBackground(Color.YELLOW);
        mainMenuFrame.getContentPane().add(mainMenuPanel);
        
        mainMenuFrame.setSize(300, 300);
        mainMenuFrame.setVisible(true);
    }

    // Implement additional methods for each menu option
    private void chooseAirline() {
        // Implement logic for choosing airline
        System.out.println("Choosing Airline");
    }

    private void chooseSeatType() {
        // Implement logic for choosing seat type
        System.out.println("Choosing Seat Type");
    }

    private void chooseMeal() {
        // Implement logic for choosing meal
        System.out.println("Choosing Meal in Flight");
    }

    private void rescheduleFlight() {
        // Implement logic for rescheduling flight
        System.out.println("Rescheduling Flight");
    }

    private void refundTicket() {
        // Implement logic for refunding ticket
        System.out.println("Refunding Ticket");
    }
   private void exitApplication() {
    System.exit(0); // Menutup aplikasi saat tombol Exit ditekan
}

}
