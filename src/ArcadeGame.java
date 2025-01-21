public class ArcadeGame {
    String gameName;
    int numberOfTokens;
    boolean isMultiplayer;


    public ArcadeGame(String paramgamename, int paramnumber, boolean parammultiplayer){
        gameName = paramgamename;
        numberOfTokens = paramnumber;
        isMultiplayer = parammultiplayer;
        PrintInfo();
    }

    public void PrintInfo(){
        if (isMultiplayer == true){
            System.out.println("\nThe game " + gameName + " requires " + numberOfTokens + " tokens to play" +
                    " and is multiplayer");
        }
        else{
            System.out.println("\nThe game " + gameName + " requires " + numberOfTokens + " tokens to play" +
                    " and is not multiplayer");
        }
    }
}
