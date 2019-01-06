import java.util.ArrayList;

public class Questions {

    public ArrayList<String> mind = new ArrayList<>();
    public ArrayList<String> energy = new ArrayList<>();
    public ArrayList<String> nature = new ArrayList<>();
    public ArrayList<String> tactics = new ArrayList<>();
    public ArrayList<String> identity = new ArrayList<>();

    Questions(){
        pullMind();
        pullEnergy();
        pullNature();
        pullTactics();
        pullIdentity();


    }

    public ArrayList<String> pullMind()
    {
        mind.add("You feel less energized after spending time with a group of people.");
        mind.add("If someone does not respond to your e-mail quickly, you start wondering if you said something wrong.");
        mind.add("If the room is full, you stay closer to the walls, avoiding the center.");
        mind.add("You feel very anxious in a stressful situation.");
        mind.add("You do not usually initiate conversations.");
        mind.add("You usually find it difficult to relax when talking in front of many people.");
        mind.add("An interesting book or a video game is often better than a social event.");
        mind.add("You find it difficult to introduce yourself to other people.");
        mind.add("You do not like being at the center of attention.");
        mind.add("You don't enjoy going to social events that involve dress-up or role-play activities.");
        mind.add("It takes a while to start getting involved in social activities at your new workplace.");
        mind.add("You are a relatively reserved and quiet person.");

        return mind;

    }
    public int getMindSize()
    {
        return (mind.size());
    }

    public ArrayList<String> pullEnergy()
    {
        energy.add("You stick to the traditional way of performing common tasks.");
        energy.add("You find it easy to stay to stay relaxed even when there is some pressure.");
        energy.add("You do not care for people who make themselves the center of attention.");
        energy.add("Generally speaking, you rely  more on your experience than your imagination.");
        energy.add("You often contemplate the reasons for human existence.");
        energy.add("You usually get along better with people who are realistic.");
        energy.add("You rarely do something out of sheer curiosity.");
        energy.add("You would not call yourself a dreamer.");
        energy.add("You would consider yourself a practical person.");
        energy.add("You have always been interested in unconventional and ambiguous things (in book, art, or movies.)");
        energy.add("You rarely get carried away by fantasies and ideas.");
        energy.add("You've never gotten so lost in thoughts that you ignore your surroundings.");

        return energy;
    }
    public int getEnergySize()
    {
        return (energy.size());
    }

    public ArrayList<String> pullNature()
    {
        nature.add("It is often difficult for you to relate to other people's feelings.");
        nature.add("You see yourself as very emotionally stable.");
        nature.add("Winning a debate matters less to you than making sure no on gets upset.");
        nature.add("Your mood can change very quickly.");
        nature.add("You are more likely to offer emotional support than suggest ways to deal with the problem.");
        nature.add("You think that everyone's views should be respected regardless of facts.");
        nature.add("You consider yourself more practical than creative.");
        nature.add("You often spend time exploring unrealistic and impractical yet intriguing ideas.");
        nature.add("When you sleep, your dreams tend to focus on the real world and it's events.");
        nature.add("People can rarely upset you.");
        nature.add("Your emotions control you more than you control them.");
        nature.add("Logic is usually more important than heart when ut comes to making important decisions.");

        return nature;
    }
    public int getNatureSize(){return (nature.size());}

    public ArrayList<String> pullTactics()
    {
        tactics.add("When you take a trip, you prefer to just go without making a schedule.");
        tactics.add("You are more of a natural improviser than a careful planner.");
        tactics.add("You frequently misplace your things.");
        tactics.add("You would rather improvise than spend time coming up with a detailed plan.");
        tactics.add("The idea of making a to-do list for the weekend stresses you out.");
        tactics.add("You have trouble coming up with a personal time-table and a sticking with it.");
        tactics.add("Keeping your options open is more important than having a to-do list.");
        tactics.add("You have a tendency to procrastinate until there is not enough time to do everything.");
        tactics.add("You find it hard to start working and tend to lose focus.");
        tactics.add("Developing a plan and sticking to it is not an important part of a project.");
        tactics.add("Your travel plans are not usually well thought out.");
        tactics.add("Your work style is closer to random energy spikes than a methodical and organized approach.");


        return tactics;
    }
    public int getTacticsSize(){return (tactics.size());}

    public ArrayList<String> pullIdentity()
    {
        identity.add("You believe it is more rewarding to be liked than to be powerful.");
        identity.add("You often interrupt people in conversations.");
        identity.add("Being right is more important than being cooperative when it comes to teamwork.");
        identity.add("You often take initiative in social situations.");
        identity.add("You Don't often feel as if you have to justify yourself to other people.");
        identity.add("In a discussion, truth should be more important than people's sensitivities.");
        identity.add("You do not let other people influence your actions.");
        identity.add("You rarely feel insecure.");
        identity.add("You rarely worry about how your actions affect other people.");
        identity.add("As a parent, you would rather see your child grow up smart than kind.");
        identity.add("You are often envious of others");
        identity.add("You feel superior to other people.");

        return identity;
    }
    public int getIdentitySize(){return (identity.size());}
}