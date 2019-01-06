import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* This class creates the start window GUI
 * Created by: Rahimah Abdul-Karim
 */
public class StartGui extends JFrame
{
    private static final int FRAME_WIDTH = 530;
    private static final int FRAME_HEIGHT = 200;
    private JTextArea tArea;
    private JButton startB, quitB;
    private ActionListener quitBListener, startBListener;

    //creates frame and populates the screen
    public StartGui()
    {
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        createOpenMessage();
        createButtons();
        popComponents();
    }

    //creates the message displayed on the start screen
    public void createOpenMessage()
    {
        tArea = new JTextArea( "\n"+"\n"+"\n" +
                "            ~WELCOME TO THE MYERS-BRIGGS PERSONALITY QUIZ~"+
                "\n"+"\n"+"\t"+" Answer the following questions based on"+"\n"+"\t"
                + "   how the statement best applies to you."
                +"\n"+"\t"+"      There is no right or wrong answer"
                ,12,38);
        tArea.setFont(new Font ("Georgia", Font.PLAIN,20));
        tArea.setBackground(new Color(223,237,238));
        tArea.setForeground(Color.BLACK);
        JPanel messPanel = new JPanel();
        add(messPanel, BorderLayout.NORTH);
        messPanel.setBackground(new Color(15,123,131));
        tArea.setLineWrap(true);
        messPanel.add(tArea);
        tArea.setEditable(false);
    }

    // creates the buttons displayed on the start screen and adds listeners to them
    private void createButtons()
    {
        quitB = new JButton("Close");
        quitBListener = new quitListener();
        quitB.addActionListener(quitBListener);

        startB = new JButton("Start Quiz");
        startBListener = new startQuizListener();
        startB.addActionListener(startBListener);
    }

    // adds the components to the frame
    private void popComponents()
    {
        JPanel panel = new JPanel();
        panel.add(startB, BorderLayout.SOUTH);
        panel.add(quitB, BorderLayout.SOUTH);

        add(panel, BorderLayout.SOUTH);
        panel.setBackground(new Color(15,123,131));
    }

    //action listener for the start button, opens the next window/ starts the quiz
    class startQuizListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            //Create frame and show input for address
            JFrame quizPgOne = new FrameOne();
            quizPgOne.setVisible(true);
            dispose();
        }
    }

    //action listener for the quit button, closes the window when pressed
    class quitListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }
}
