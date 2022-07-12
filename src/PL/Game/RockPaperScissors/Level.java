package src.PL.Game.RockPaperScissors;

public class Level {

    private int roundNumberPc;

    private int roundNumberHuman;

    private String nameLevel;

    public int getRoundNumberPc() {
        return roundNumberPc;
    }

    public void setRoundNumberPc(int roundNumberPc) {
        this.roundNumberPc = roundNumberPc;
    }

    public int getRoundNumberHuman() {
        return roundNumberHuman;
    }

    public void setRoundNumberHuman(int roundNumberHuman) {
        this.roundNumberHuman = roundNumberHuman;
    }

    public String getNameLevel() {
        return nameLevel;
    }

    public void setNameLevel(String nameLevel) {
        this.nameLevel = nameLevel;
    }

    public Level(int roundNumberPc, int roundNumberHuman, String nameLevel) {
        this.roundNumberPc = roundNumberPc;
        this.roundNumberHuman = roundNumberHuman;
        this.nameLevel = nameLevel;
    }

}