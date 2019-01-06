import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.io.IOException;


public class FrameOne extends JFrame {
    /**
     * Creates the Myers-Briggs quiz
     * populates the questions with an array of labels and an array of mutually exclusive radio buttons
     */

    private JPanel mindPanel, buttonPanel, energyPanel, naturePanel, tacticsPanel, identityPanel, resultPanel;
    private JButton nextButton;
    private JLabel l1 = new JLabel();
    private JLabel l2 = new JLabel();
    private JLabel l3 = new JLabel();
    private JLabel l4 = new JLabel();
    private JLabel l5 = new JLabel();
    private JLabel l6 = new JLabel();
    private JLabel title;
    private JLabel resultLabel;
    ActionListener next = new NextListener();
    private Types t = new Types();
    PrintWriter output;

    private Questions questions = new Questions();
    ButtonGroup group1 = new ButtonGroup();
    ButtonGroup group2 = new ButtonGroup();
    ButtonGroup group3 = new ButtonGroup();
    ButtonGroup  group4 = new ButtonGroup();
    ButtonGroup group5 = new ButtonGroup();
    ButtonGroup group6 = new ButtonGroup();
    ButtonGroup group7 = new ButtonGroup();
    ButtonGroup group8 = new ButtonGroup();
    ButtonGroup group9 = new ButtonGroup();
    ButtonGroup group10 = new ButtonGroup();
    ButtonGroup group11 = new ButtonGroup();
    ButtonGroup group12 = new ButtonGroup();
    JRadioButton buttons[];

    int numButtons = 85; // count of total buttons on the screen
    int numButtonGroup = 7; // count of the number of buttons next to the question
    int frameCount = 0; // switch for the panel being displayed

    private final int FRAME_HEIGHT = 850;
    private final int FRAME_WIDTH = 1200;


    public FrameOne()
    {
        setLayout(new GridLayout(0, 2));
        setTitle("Myers - Briggs Personality type test");
        addQuestions(frameCount);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        getContentPane().setBackground(new Color(223,237,238));

    }
    private void addQuestions(int frameCount)
    {
        if (frameCount == 0)
        {
            add(PopMind());
            add(popButtons());

        }
        else if (frameCount == 1)
        {
            add(PopEnergy());
            add(popButtons());

        }
        else if (frameCount == 2)
        {
            add(PopNature());
            add(popButtons());
        }

        else if (frameCount == 3)
        {
            add(PopTactics());
            add(popButtons());
        }
        else if (frameCount == 4)
        {
            add(PopIdentity());
            add(popButtons());
        }
        else if (frameCount > 4)
        {
            add(result());

        }

        validate();
    }

    private JPanel PopMind()
    {
        mindPanel = new JPanel();
        mindPanel.setLayout(new GridLayout(14, 1));
        mindPanel.setBackground(new Color(223,237,238));
        JLabel quests[] = new JLabel[questions.getMindSize()];

        int mindSize = questions.getMindSize(); // equals 12

        for (int i = 0; i < mindSize; i++)
        {
            String temp = questions.pullMind().get(i);
            quests[i] = new JLabel(temp);
            quests[i].setFont(new Font("Serif", Font.PLAIN, 14));
            mindPanel.add(quests[i]);
        }

        return mindPanel;
    }

    private JPanel PopEnergy()
    {
        energyPanel = new JPanel();
        energyPanel.setLayout(new GridLayout(14, 1));
        energyPanel.setBackground(new Color(223,237,238));
        JLabel quests[] = new JLabel[questions.getEnergySize()];
        energyPanel.setFont(new Font ("Georgia", Font.PLAIN,30));

        int energySize = questions.getEnergySize(); // equals 12
        System.out.println(energySize);
        for (int i = 0; i < energySize; i++)
        {
            String temp = questions.pullEnergy().get(i);
            quests[i] = new JLabel(temp);
            energyPanel.add(quests[i]);
        }

        return energyPanel;
    }

    private JPanel PopNature()
    {
        naturePanel = new JPanel();
        naturePanel.setFont(new Font ("Georgia", Font.PLAIN,30));
        naturePanel.setLayout(new GridLayout(14, 1));
        naturePanel.setBackground(new Color(223,237,238));
        JLabel quests[] = new JLabel[questions.getNatureSize()];

        int natureSize = questions.getNatureSize(); // equals 12

        for (int i = 0; i < natureSize; i++)
        {
            String temp = questions.pullNature().get(i);
            quests[i] = new JLabel(temp);
            naturePanel.add(quests[i]);
        }

        return naturePanel;
    }

    private JPanel PopTactics()
    {
        tacticsPanel = new JPanel();
        tacticsPanel.setLayout(new GridLayout(14, 1));
        tacticsPanel.setBackground(new Color(223,237,238));
        JLabel quests[] = new JLabel[questions.getTacticsSize()];

        int tacticsSize = questions.getTacticsSize(); // equals 12

        for (int i = 0; i < tacticsSize; i++)
        {
            String temp = questions.pullTactics().get(i);
            quests[i] = new JLabel(temp);
            tacticsPanel.add(quests[i]);
        }

        return tacticsPanel;
    }

    private JPanel PopIdentity()
    {
        identityPanel = new JPanel();
        identityPanel.setLayout(new GridLayout(14, 1));
        identityPanel.setBackground(new Color(223,237,238));
        JLabel quests[] = new JLabel[questions.getIdentitySize()];

        int identitySize = questions.getIdentitySize(); // equals 12

        for (int i = 0; i < identitySize; i++)
        {
            String temp = questions.pullIdentity().get(i);
            quests[i] = new JLabel(temp);
            identityPanel.add(quests[i]);
        }

        return identityPanel;
    }

    private JPanel result()
    {
        resultPanel = new JPanel();
        resultPanel.setLayout(new GridLayout(3, 2));
        title = new JLabel("Your results: ");
        title.setFont(new Font("Serif", Font.PLAIN, 16));
        resultPanel.add(title);

        resultLabel = new JLabel(t.out());
        resultLabel.setFont(new Font("Serif", Font.PLAIN, 16));
        resultPanel.add(resultLabel);

        resultPanel.add(l1);
        resultPanel.add(l2);
        resultPanel.add(l3);
        try
        {
            writeData();
        }
        catch (IOException e)
        {
            System.out.println("something went wrong!");
        }

        return resultPanel;
    }
    private void writeData()throws IOException
    {
        output = new PrintWriter(new FileWriter(new File("results.txt"),true));
        try
        {
            output.write("\n" + t.out());

        }
        finally
        {
            output.close();
        }
    }

    private JPanel popButtons()
    {
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(14, 7));
        nextButton = new JButton("Next");
        int buttonCount = 0; // this just keeps up with the location in the array for the buttons

        buttons = new JRadioButton[numButtons];

        for( int i = 0; i < 12;i++)
        {
            for (int j = 0; j < numButtonGroup; j++) // add buttons to panel
            {
                switch (j)
                {
                    case 0:
                        buttons[buttonCount] = new JRadioButton("Agree");
                        addGroup(i,buttons[buttonCount]);
                        buttonPanel.add(buttons[buttonCount]); break;
                    case 1:
                        buttons[buttonCount] = new JRadioButton();
                        addGroup(i,buttons[buttonCount]);
                        buttonPanel.add(buttons[buttonCount]); break;
                    case 2:
                        buttons[buttonCount] = new JRadioButton();
                        addGroup(i,buttons[buttonCount]);
                        buttonPanel.add(buttons[buttonCount]);  break;
                    case 3:
                        buttons[buttonCount] = new JRadioButton();
                        addGroup(i,buttons[buttonCount]);
                        buttonPanel.add(buttons[buttonCount]);break;
                    case 4:
                        buttons[buttonCount] = new JRadioButton();
                        addGroup(i,buttons[buttonCount]);
                        buttonPanel.add(buttons[buttonCount]); break;
                    case 5:
                        buttons[buttonCount] = new JRadioButton();
                        addGroup(i,buttons[buttonCount]);
                        buttonPanel.add(buttons[buttonCount]); break;
                    case 6:
                        buttons[buttonCount] = new JRadioButton("Disagree");
                        addGroup(i,buttons[buttonCount]);
                        buttonPanel.add(buttons[buttonCount]);break;
                    default: break;

                }
                buttonCount++;
            }
        }
        buttonPanel.add(l1);
        buttonPanel.add(l2);
        buttonPanel.add(l3);
        buttonPanel.add(l4);
        buttonPanel.add(l5);
        buttonPanel.add(l6);
        buttonPanel.add(nextButton);
        nextButton.addActionListener(next);
        return buttonPanel;
    }

    private void addGroup(int i, JRadioButton button)
    {
        switch (i)
        {
            case 0: group1.add(button); break;
            case 1: group2.add(button);break;
            case 2: group3.add(button);break;
            case 3: group4.add(button);break;
            case 4: group5.add(button);break;
            case 5: group6.add(button);break;
            case 6: group7.add(button);break;
            case 7: group8.add(button);break;
            case 8: group9.add(button);break;
            case 9: group10.add(button);break;
            case 10: group11.add(button);break;
            case 11: group12.add(button);break;
            default: break;
        }
    }

    public class NextListener implements ActionListener
    {

        public void actionPerformed(ActionEvent e)
        {
            getChoices();
            frameCount++;
            getContentPane().removeAll();
            addQuestions(frameCount);
            repaint();
        }
    }
    private void getChoices()
    {
        int score =0;

        for( int i = 0; i < 12; i++)
        {
            for (int j = 0; j < numButtonGroup; j++) // add buttons to panel
            {
                if(buttons[j].isSelected())
                {
                    if (j < 1) {
                        score = score+ 3;

                    } else if (j == 1) {
                        score = score+ 2;

                    } else if (j == 2) {
                        score = score+ 1;

                    } else if (j == 3) {

                    } else if (j == 4) {
                        score = score - 1;

                    } else if (j == 5) {
                        score = score - 2;

                    } else if (j == 6) {
                        score = score - 3;

                    }

                }

            }
        }

        t.assign(frameCount, score);
    }
}

