public class Arcade {
    public String name;
    public boolean isOpen;
    public int yearFounded;
    String gameName;

    public static void main(String[] args) {
        Arcade pixeParadise = new Arcade();

    }

    public Arcade(){
        System.out.println("Hello World! Good luck on your exams!");
        name = "Pixel Paradise";
        isOpen = true;
        yearFounded = 1985;
        System.out.println("\nWelcome to " + name + "! It is " + isOpen + " that we are open. " +
                "We were founded in " + yearFounded);
        yearFounded = 2008;
        System.out.println("Welcome to " + name + "! It is " + isOpen + " that we are open. " +
                "We were founded in " + yearFounded);
        spinForTokens();
        gameOfTheDay("Pong");
        displayScores();
        ticketMultiplier();
        ArcadeGame classicGame;
        classicGame = new ArcadeGame("Pinball", 2, false);
        ArcadeGame myFavGame;
        myFavGame = new ArcadeGame("Pac Man", 5, true);
    }

    public void spinForTokens(){
        int randomInt = (int)(Math.random()*50+1);
        System.out.println("\nYou spun the wheel and you won " + randomInt + " tokens!");
    }

    public void gameOfTheDay (String paramgamename){
        gameName = paramgamename;
        System.out.println("\nToday's game of the day is "+ gameName + "\n");
    }

    public void displayScores(){
        for (int x=1; x<=5; x=x+1){
            System.out.println(x);
        }
        for (int x=200; x<=1100; x=x+300){
            System.out.println(x);
        }
        for (int x=6; x>=0; x=x-1){
            System.out.println(x);
        }
    }

    public void ticketMultiplier(){
        double randomNum = Math.random();
        if (randomNum<0.25){
            System.out.println("\nYou've won 10 extra tickets.");
        }
        else if (0.25<=randomNum && randomNum<0.5){
            System.out.println("\nYou've won 50 extra tickets.");
        }
        else if (0.5<=randomNum && randomNum<0.75){
            System.out.println("\nYou've doubled your tickets.");
        }
        else{
            System.out.println("\nYou've tripled your tickets.");
        }
    }
}
