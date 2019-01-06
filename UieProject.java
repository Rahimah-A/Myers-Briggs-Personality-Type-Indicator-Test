import javax.swing.*;
import java.awt.*;


public class UieProject
{
    public static void main(String[] args)
    {
        JFrame frame = new StartGui();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(new Color(223,237,238));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setTitle("Myers-Briggs Personality test");

    }
}
