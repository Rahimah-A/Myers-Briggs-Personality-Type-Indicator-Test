
import java.util.ArrayList;

public class Types
{
    ArrayList<Character> type = new ArrayList<>();

    public Types()
    {
        int frame;
        int score;
    }

    public void assign(int frame, int score)
    {
        switch(frame)
        {
            case 0: testMind(score);
                break;
            case 1:
                testEnergy(score);
                break;
            case 2:
                testNature(score);
                break;
            case 3:
                testTactics(score);
                break;
            case 4:
                testIdentity(score);
                break;
            default:
                break;
        }
    }

    public void testMind(int mind)
    {
        int compare = 0;
        if(mind > compare)
        {
          type.add('I');
        }
        else
        {
            type.add('E');
        }
    }
    public void testEnergy(int energy)
    {
        int compare = 0;
        if(energy > compare)
        {
            type.add('S');
        }
        else
        {
            type.add('N');
        }
    }
    public void testNature(int nature)
    {
        int compare = 0;
        if(nature > compare)
        {
            type.add('F');
        }
        else
        {
            type.add('T');
        }
    }
    public void testTactics(int tactics)
    {
        int compare = 0;
        if(tactics > compare)
        {
            type.add('P');
        }
        else
        {
            type.add('J');
        }
    }
    public void testIdentity(int identity)
    {
        int compare = 0;
        if(identity > compare)
        {
            type.add('-');
            type.add('A');

        }
        else
        {
            type.add('-');
            type.add('T');

        }

    }
    public String out()
    {
        String result = "";
        for (Character c: type)
        {
            result +=c;
        }
        return result;
    }


}
