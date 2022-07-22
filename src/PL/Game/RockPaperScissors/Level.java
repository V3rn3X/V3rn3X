package PL.Game.RockPaperScissors;

public class Level {

    private int roundNumberPc;

    private int roundNumberHuman;

    private String nameLevel;

    public int getRoundNumberPc() {
        return roundNumberPc;
    }

    public int getRoundNumberHuman() {
        return roundNumberHuman;
    }

    public String getNameLevel() {
        return nameLevel;
    }

    public Level(int roundNumberPc, int roundNumberHuman, String nameLevel) {
        this.roundNumberPc = roundNumberPc;
        this.roundNumberHuman = roundNumberHuman;
        this.nameLevel = nameLevel;
    }

}