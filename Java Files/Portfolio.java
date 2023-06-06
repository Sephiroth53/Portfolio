import javax.swing.*;

// Interface to get the name
interface Name {
    String getName();
}

// Interface to get the introduction
interface Introduction {
    String getIntroduction();
}

// Interface to get the first description
interface Description1 {
    String getDescription1();
}

// Interface to get the profile picture
interface ProfilePicture {
    ImageIcon getProfilePicture();
}

// Interface to get work image 1
interface Work1 {
    ImageIcon getWork1();
}

// Interface to get work image 2
interface Work2 {
    ImageIcon getWork2();
}

// Interface to get contact information
interface Contact {
    String getContact();
}

// Interface to get frame 2 title
interface Frame2Title {
    String getFrame2Title();
}

// Interface to get frame 3 title
interface Frame3Title{
    String getFrame3Title();
}

// Interface to get frame 4 title
interface Frame4Title{
    String getFrame4Title();
}

// Interface to get the second description
interface Description2{
    String getDescription2();
}

// Interface to get the third description
interface Description3{
    String getDescription3();
}

// Portfolio class implementing all the interfaces
public class Portfolio implements Name, Introduction, Description1,
        ProfilePicture, Work1, Work2, Contact, Frame2Title, Frame3Title, Frame4Title, Description2, Description3 {

    public static void main(String[] args) {
        Portfolio portfolio = new Portfolio();
        PortfolioFrame frame = new PortfolioFrame(portfolio);
        frame.setVisible(true);
    }

    @Override
    public String getName() {
        return "GABRIEL M. CATAPANG";
    }

    @Override
    public String getIntroduction() {
        return "<html>I'm an Information Technology <font color='#1DDDBD'>Student</font></html>";
    }

    @Override
    public String getDescription1() {
        return "A student who is striving his best to learn everything for his goals and dreams to come to fruition";
    }

    @Override
    public ImageIcon getProfilePicture() {
        return new ImageIcon("C://Users//Gab//Desktop//School Files 2//Front.jpg");
    }

    @Override
    public ImageIcon getWork1(){
        return new ImageIcon("C:\\Users\\Gab\\Downloads\\work1.png");
    }

    @Override
    public ImageIcon getWork2(){
        return new ImageIcon("C:\\Users\\Gab\\Downloads\\work2.png");
    }

    @Override
    public String getContact() {
        return "<html>Gmail: gabbycatapang123@gmail.com<br><br><br>" +
                "Outlook: catapanggm@students.national-u.edu.ph<br><br><br>" +
                "Github: Sephiroth53<br><br><br>" +
                "Phone: 09472733316</html>";
    }

    @Override
    public String getFrame2Title() {
        return "<html>Reach Out to <font color='#1DDDBD'>Me</font></html>";
    }

    @Override
    public String getFrame3Title() {
        return "<html>Learn More About <font color='#1DDDBD'>Me</font></html>";
    }

    @Override
    public String getFrame4Title() {
        return "<html>Highlighted <font color='#1DDDBD'>Works</font></html>";
    }

    @Override
    public String getDescription2() {
        return "Hi, I'm Gabriel but you can call me Gabo. " +
               "I'm 19 years old and currently taking Bachelor of Science " +
               "in Information Technology Specializing in Mobile and Web " +
               "Applications in National University-Manila." +
               "I currently reside at Sampaloc, Manila. " +
               "The reason why I'm currently taking this program is because " +
               "I wanted to be a Game Developer which can give me the " +
               "chance to create games which people can enjoy.";
    }

    @Override
    public String getDescription3(){
        return "<html>Website <font color='#1DDDBD'>Creation</font></html>";
    }
}
