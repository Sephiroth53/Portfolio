import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class PortfolioFrame extends JFrame {
    private Portfolio portfolio;

    public PortfolioFrame(Portfolio portfolio) {
        this.portfolio = portfolio;
        initialize();
    }

    private void initialize() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 700);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(0, 0, 30)); // Set dark blue color
        setLayout(null); // Disable layout manager

        JLabel nameLabel = new JLabel(portfolio.getName());
        nameLabel.setForeground(new Color(29, 221, 189));
        nameLabel.setFont(new Font("Serif", Font.BOLD, 25));
        nameLabel.setBounds(500, 130, 360, 30);
        add(nameLabel);

        JLabel introductionLabel = new JLabel(portfolio.getIntroduction());
        introductionLabel.setForeground(Color.WHITE);
        introductionLabel.setFont(new Font("Arial", Font.ITALIC, 25));
        introductionLabel.setBounds(505, 170, 360, 150);
        add(introductionLabel);

        JLabel descriptionLabel1 = new JLabel("<html>" + portfolio.getDescription1() + "</html>");
        descriptionLabel1.setForeground(Color.WHITE);
        descriptionLabel1.setFont(new Font("Courier New", Font.ITALIC, 23));
        descriptionLabel1.setBounds(505, 210, 500, 300);
        add(descriptionLabel1);

        ImageIcon profilePicture = portfolio.getProfilePicture();
        JLabel pictureLabel = new JLabel(profilePicture);
        pictureLabel.setBounds(30, 40, 389, 672);
        add(pictureLabel);

        // Information for Button "Reach Out"
        JButton reachOutButton = new JButton("Reach Out");
        reachOutButton.setBounds(35, 50, 100, 30);

        Color darkBlueColor = new Color(0, 0, 30);
        reachOutButton.setForeground(darkBlueColor);
        Color lightBlueColor = new Color(29, 221, 189);
        reachOutButton.setBackground(darkBlueColor);
        reachOutButton.setForeground(lightBlueColor);
        reachOutButton.setBorder(BorderFactory.createLineBorder(new Color(29, 221, 189)));

        add(reachOutButton);

        reachOutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame reachOutFrame = new JFrame("Reach Out");
                reachOutFrame.getContentPane().setBackground(new Color(0, 0, 30)); 
                reachOutFrame.setSize(1200, 700);
                reachOutFrame.setLocationRelativeTo(null);
                reachOutFrame.setLayout(null); 
                reachOutFrame.setVisible(true);

                ImageIcon profilePicture = portfolio.getProfilePicture();
                JLabel pictureLabel = new JLabel(profilePicture);
                pictureLabel.setBounds(30, 40, 389, 672);
                reachOutFrame.add(pictureLabel);

                JLabel ContactLabel = new JLabel(portfolio.getContact());
                ContactLabel.setForeground(Color.WHITE);
                ContactLabel.setFont(new Font("Courier New", Font.ITALIC, 20));
                ContactLabel.setBounds(505, 170, 600, 300);
                reachOutFrame.add(ContactLabel);

                JLabel Frame2Title = new JLabel(portfolio.getFrame2Title());
                Frame2Title.setForeground(Color.WHITE);
                Frame2Title.setFont(new Font("Arial", Font.ITALIC, 30));
                Frame2Title.setBounds(500, 130, 360, 30);
                reachOutFrame.add(Frame2Title);

                JButton returnButton = new JButton("Return");
                returnButton.setBounds(990, 50, 100, 30);
                returnButton.setBackground(darkBlueColor);
                returnButton.setForeground(lightBlueColor);
                returnButton.setBorder(BorderFactory.createLineBorder(new Color(29, 221, 189)));
                reachOutFrame.add(returnButton);

                returnButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        reachOutFrame.dispose(); // Close the Reach Out frame
                        setVisible(true); // Display the main frame again
                    }
                });

                dispose();
            }
        });

        // Information For About Me

        JButton aboutMeButton = new JButton("About Me");
        aboutMeButton.setBounds(150, 50, 100, 30);
        aboutMeButton.setBackground(darkBlueColor);
        aboutMeButton.setForeground(lightBlueColor);
        aboutMeButton.setBorder(BorderFactory.createLineBorder(new Color(29, 221, 189)));
        add(aboutMeButton);

        aboutMeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame aboutMeFrame = new JFrame("About Me");
                aboutMeFrame.getContentPane().setBackground(new Color(0, 0, 30)); 
                aboutMeFrame.setSize(1200, 700);
                aboutMeFrame.setLocationRelativeTo(null);
                aboutMeFrame.setLayout(null); 
                aboutMeFrame.setVisible(true);

                ImageIcon profilePicture = portfolio.getProfilePicture();
                JLabel pictureLabel = new JLabel(profilePicture);
                pictureLabel.setBounds(30, 40, 389, 672);
                aboutMeFrame.add(pictureLabel);

                JLabel Frame3Title = new JLabel(portfolio.getFrame3Title());
                Frame3Title.setForeground(Color.WHITE);
                Frame3Title.setFont(new Font("Arial", Font.ITALIC, 30));
                Frame3Title.setBounds(500, 130, 360, 30);
                aboutMeFrame.add(Frame3Title);
                

                JLabel descriptionLabel2 = new JLabel("<html>" + portfolio.getDescription2() + "</html>");
                descriptionLabel2.setForeground(Color.WHITE);
                descriptionLabel2.setFont(new Font("Courier New", Font.ITALIC, 23));
                descriptionLabel2.setBounds(505, 190, 500, 400);
                aboutMeFrame.add(descriptionLabel2);

                JButton returnButton = new JButton("Return");
                returnButton.setBounds(990, 50, 100, 30);
                returnButton.setBackground(darkBlueColor);
                returnButton.setForeground(lightBlueColor);
                returnButton.setBorder(BorderFactory.createLineBorder(new Color(29, 221, 189)));
                aboutMeFrame.add(returnButton);

                returnButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        aboutMeFrame.dispose(); // Close the About Me frame
                        setVisible(true); // Display the main frame again
                    }
                });

                dispose(); 
        }
    });

              // New "Project" button
        JButton projectButton = new JButton("Project");
        projectButton.setBounds(265, 50, 100, 30);
        projectButton.setBackground(darkBlueColor);
        projectButton.setForeground(lightBlueColor);
        projectButton.setBorder(BorderFactory.createLineBorder(new Color(29, 221, 189)));
        add(projectButton);

            projectButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JFrame projectFrame = new JFrame("Projects");
                    projectFrame.getContentPane().setBackground(new Color(0, 0, 30));
                    projectFrame.setSize(1500, 800);
                    projectFrame.setLocationRelativeTo(null);
                    projectFrame.setLayout(null); 
                    projectFrame.setVisible(true);

                    ImageIcon work1 = portfolio.getWork1();
                    JLabel work1Label = new JLabel(work1);
                    work1Label.setBounds(40, 165, 690, 430); 
                    projectFrame.add(work1Label);

                    ImageIcon work2 = portfolio.getWork2();
                    JLabel work2Label = new JLabel(work2);
                    work2Label.setBounds(760, 165, 690, 430); 
                    projectFrame.add(work2Label);

                    JLabel Frame4Title = new JLabel(portfolio.getFrame4Title());
                    Frame4Title.setForeground(Color.WHITE);
                    Frame4Title.setFont(new Font("Arial", Font.ITALIC, 30));
                    Frame4Title.setBounds(610, 110, 360, 35);
                    projectFrame.add(Frame4Title);

                    JLabel descriptionLabel3 = new JLabel(portfolio.getDescription3());
                    descriptionLabel3.setForeground(Color.WHITE);
                    descriptionLabel3.setFont(new Font("Serif", Font.BOLD, 30));
                    descriptionLabel3.setBounds(610, 630, 360, 35);
                    projectFrame.add(descriptionLabel3);

                    JButton returnButton = new JButton("Return");
                    returnButton.setBounds(60, 55, 100, 30);
                    returnButton.setBackground(darkBlueColor);
                    returnButton.setForeground(lightBlueColor);
                    returnButton.setBorder(BorderFactory.createLineBorder(new Color(29, 221, 189)));
                    projectFrame.add(returnButton);


                    returnButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            projectFrame.dispose(); // Close the Project Frame
                            setVisible(true); // Display the main frame again
                        }
                    });

                    dispose();
        }
    });

        // Information for Button "Check CV"
        JButton checkCVButton = new JButton("Check CV");
        checkCVButton.setBounds(510, 450, 100, 30);
        checkCVButton.setBackground(darkBlueColor);
        checkCVButton.setForeground(lightBlueColor);

        checkCVButton.setBorder(BorderFactory.createLineBorder(new Color(29, 221, 189)));

        add(checkCVButton);

        checkCVButton.addActionListener(e -> {
            try {
                PDFRender.renderPDF("C:/Users/Gab/Downloads/CATAPANG_CV.pdf");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Portfolio portfolio = new Portfolio(); 
            PortfolioFrame portfolioFrame = new PortfolioFrame(portfolio);
            portfolioFrame.setVisible(true);
        });
    }
}
