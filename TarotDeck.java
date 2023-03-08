import java.util.*;

public class TarotDeck {
    private String card;
    private boolean inverted;
    private String[] reading;

    public TarotDeck() {
    }

    public String pull() {
        Random random = new Random(2);
        if(random.nextInt() == 0){
            card = majorArcana();
        }
        else card = minorArcana();
        return card;

    }
    private boolean isInverted(){
        return inverted;
    }

    private boolean flipRandom(){
        Random random = new Random();
        inverted = random.nextBoolean();
        return inverted;
    }

    public String pullMajor(){
        return majorArcana();
    }

    private String majorArcana() {
        Random random = new Random();
        int arcana = random.nextInt(22);
        String arcanaString = "The Fool";
        String inverted = "";
        if (flipRandom())
        inverted = "inverted ";
        switch(arcana){
            case 0:{
                arcanaString = "Fool";
                break;
            }
            case 1:{
                arcanaString = "Magician";
                break;
            }
            case 2:{
                arcanaString = "High Priestess";
                break;
            }
            case 3:{
                arcanaString = "Empress";
                break;
            }
            case 4:{
                arcanaString = "Emperor";
                break;
            }
            case 5:{
                arcanaString = "Hierophant";
                break;
            }
            case 6:{
                arcanaString = "Lovers";
                break;
            }
            case 7:{
                arcanaString = "Chariot";
                break;
            }
            case 8:{
                arcanaString = "Strength";
                break;
            }
            case 9:{
                arcanaString = "Hermit";
                break;
            }
            case 10:{
                arcanaString = "Wheel of Fortune";
                break;
            }
            case 11:{
                arcanaString = "Justice";
                break;
            }
            case 12:{
                arcanaString = "Hanged Man";
                break;
            }
            case 13:{
                arcanaString = "Death";
                break;
            }
            case 14:{
                arcanaString = "Temperance";
                break;
            }
            case 15:{
                arcanaString = "Devil";
                break;
            }
            case 16:{
                arcanaString = "Tower";
                break;
            }
            case 17:{
                arcanaString = "Star";
                break;
            }
            case 18:{
                arcanaString = "Moon";
                break;
            }
            case 19:{
                arcanaString = "Sun";
                break;
            }
            case 20:{
                arcanaString = "Judgement";
                break;
            }
            case 21:{
                arcanaString = "World";
                break;
            }
        }

        return "The " + inverted + arcanaString;
    }

    private String minorArcana() {
        Random random = new Random();
        int suite = random.nextInt(4);
        int number = random.nextInt(14);
        String suiteString = "";
        String numberString = "";
        switch (suite) {
            case 0: {
                suiteString = "Wands";
                break;
            }
            case 1: {
                suiteString = "Cups";
                break;
            }
            case 2: {
                suiteString = "Swords";
                break;
            }
            case 3: {
                suiteString = "Pentacles";
                break;
            }
        }
        switch (number) {
            case 0: {
                numberString = "Queen";
                break;
            }
            case 1: {
                numberString = "King";
                break;
            }
            case 2: {
                numberString = "Knight";
                break;
            }
            case 3: {
                numberString = "Page";
            }
            case default: {
                number = number - 3;
                numberString = "" + number;
                break;
            }
        }
        return numberString + " of " + suiteString;
    }

}
