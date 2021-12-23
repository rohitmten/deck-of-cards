import org.apache.commons.lang.ArrayUtils;
import java.util.*;

class Card {
    private String value;

    public Card() {}

    public Card(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card{" +
            "value='" + value + '\'' +
            '}';
    }
}

class DeckOfCards {
    private int MAX_CARDS = 52;
    private int NUM_SUITS = 4;
    private int CARDS_PER_SUIT = 13;
    private Card[] deck = new Card[52];
    private int topCard = -1;
    private Map < Card, Integer > cardToPointsMap = null;

    public Card drawCard() {
        return this.deck[0];
    }

    public Map < Card, Integer > getCardToPointsMap() {
        return cardToPointsMap;
    }

    public void setCardToPointsMap(Map < Card, Integer > cardToPointsMap) {
        this.cardToPointsMap = cardToPointsMap;
    }

    public void shuffle() {
        Collections.shuffle(Arrays.asList(this.deck));
    }

    public boolean isEmpty() {
        return ArrayUtils.isEmpty(this.deck);
    }

    public DeckOfCards() {
        cardToPointsMap = new HashMap < > ();
        Card c1 = new Card("CLUBS_ACE");
        Card c2 = new Card("CLUBS_2");
        Card c3 = new Card("CLUBS_3");
        Card c4 = new Card("CLUBS_4");
        Card c5 = new Card("CLUBS_5");
        Card c6 = new Card("CLUBS_6");
        Card c7 = new Card("CLUBS_7");
        Card c8 = new Card("CLUBS_8");
        Card c9 = new Card("CLUBS_9");
        Card c10 = new Card("CLUBS_10");
        Card c11 = new Card("CLUBS_JACK");
        Card c12 = new Card("CLUBS_QUEEN");
        Card c13 = new Card("CLUBS_KING");
        Card c14 = new Card("DIAMONDS_ACE");
        Card c15 = new Card("DIAMONDS_2");
        Card c16 = new Card("DIAMONDS_3");
        Card c17 = new Card("DIAMONDS_4");
        Card c18 = new Card("DIAMONDS_5");
        Card c19 = new Card("DIAMONDS_6");
        Card c20 = new Card("DIAMONDS_7");
        Card c21 = new Card("DIAMONDS_8");
        Card c22 = new Card("DIAMONDS_9");
        Card c23 = new Card("DIAMONDS_10");
        Card c24 = new Card("DIAMONDS_JACK");
        Card c25 = new Card("DIAMONDS_QUEEN");
        Card c26 = new Card("DIAMONDS_KING");
        Card c27 = new Card("HEARTS_ACE");
        Card c28 = new Card("HEARTS_2");
        Card c29 = new Card("HEARTS_3");
        Card c30 = new Card("HEARTS_4");
        Card c31 = new Card("HEARTS_5");
        Card c32 = new Card("HEARTS_6");
        Card c33 = new Card("HEARTS_7");
        Card c34 = new Card("HEARTS_8");
        Card c35 = new Card("HEARTS_9");
        Card c36 = new Card("HEARTS_10");
        Card c37 = new Card("HEARTS_JACK");
        Card c38 = new Card("HEARTS_QUEEN");
        Card c39 = new Card("HEARTS_KING");
        Card c40 = new Card("SPADES_ACE");
        Card c41 = new Card("SPADES_2");
        Card c42 = new Card("SPADES_3");
        Card c43 = new Card("SPADES_4");
        Card c44 = new Card("SPADES_5");
        Card c45 = new Card("SPADES_6");
        Card c46 = new Card("SPADES_7");
        Card c47 = new Card("SPADES_8");
        Card c48 = new Card("SPADES_9");
        Card c49 = new Card("SPADES_10");
        Card c50 = new Card("SPADES_JACK");
        Card c51 = new Card("SPADES_QUEEN");
        Card c52 = new Card("SPADES_KING");

        this.cardToPointsMap.put(c2, 5);
        this.cardToPointsMap.put(c3, 5);
        this.cardToPointsMap.put(c4, 5);
        this.cardToPointsMap.put(c5, 5);
        this.cardToPointsMap.put(c6, 5);
        this.cardToPointsMap.put(c7, -20);
        this.cardToPointsMap.put(c8, -20);
        this.cardToPointsMap.put(c9, -20);
        this.cardToPointsMap.put(c10, -20);
        this.cardToPointsMap.put(c11, -10);
        this.cardToPointsMap.put(c20, -20);
        this.cardToPointsMap.put(c21, -20);
        this.cardToPointsMap.put(c22, -20);
        this.cardToPointsMap.put(c23, -20);
        this.cardToPointsMap.put(c15, 5);
        this.cardToPointsMap.put(c16, 5);
        this.cardToPointsMap.put(c17, 5);
        this.cardToPointsMap.put(c18, 5);
        this.cardToPointsMap.put(c19, 5);
        this.cardToPointsMap.put(c24, -10);
        this.cardToPointsMap.put(c28, 5);
        this.cardToPointsMap.put(c29, 5);
        this.cardToPointsMap.put(c30, 5);
        this.cardToPointsMap.put(c31, 5);
        this.cardToPointsMap.put(c32, 5);
        this.cardToPointsMap.put(c33, -20);
        this.cardToPointsMap.put(c34, -20);
        this.cardToPointsMap.put(c35, -20);
        this.cardToPointsMap.put(c36, -20);
        this.cardToPointsMap.put(c37, -10);
        this.cardToPointsMap.put(c46, -20);
        this.cardToPointsMap.put(c47, -20);
        this.cardToPointsMap.put(c48, -20);
        this.cardToPointsMap.put(c49, -20);
        this.cardToPointsMap.put(c41, 5);
        this.cardToPointsMap.put(c42, 5);
        this.cardToPointsMap.put(c43, 5);
        this.cardToPointsMap.put(c44, 5);
        this.cardToPointsMap.put(c45, 5);
        this.cardToPointsMap.put(c50, -10);
        this.cardToPointsMap.put(c1, 20);
        this.cardToPointsMap.put(c14, 20);
        this.cardToPointsMap.put(c27, 20);
        this.cardToPointsMap.put(c40, 20);
        this.cardToPointsMap.put(c52, 40);
        this.cardToPointsMap.put(c13, 40);
        this.cardToPointsMap.put(c26, 40);
        this.cardToPointsMap.put(c39, 40);
        this.cardToPointsMap.put(c12, 10);
        this.cardToPointsMap.put(c25, 10);
        this.cardToPointsMap.put(c38, 10);
        this.cardToPointsMap.put(c51, 10);

        this.deck[0] = c1;
        this.deck[1] = c2;
        this.deck[2] = c3;
        this.deck[3] = c4;
        this.deck[4] = c5;
        this.deck[5] = c6;
        this.deck[6] = c7;
        this.deck[7] = c8;
        this.deck[8] = c9;
        this.deck[9] = c10;
        this.deck[10] = c11;
        this.deck[11] = c12;
        this.deck[12] = c13;
        this.deck[13] = c14;
        this.deck[14] = c15;
        this.deck[15] = c16;
        this.deck[16] = c17;
        this.deck[17] = c18;
        this.deck[18] = c19;
        this.deck[19] = c20;
        this.deck[20] = c21;
        this.deck[21] = c22;
        this.deck[22] = c23;
        this.deck[23] = c24;
        this.deck[24] = c25;
        this.deck[25] = c26;
        this.deck[26] = c27;
        this.deck[27] = c28;
        this.deck[28] = c29;
        this.deck[29] = c30;
        this.deck[30] = c31;
        this.deck[31] = c32;
        this.deck[32] = c33;
        this.deck[33] = c34;
        this.deck[34] = c35;
        this.deck[35] = c36;
        this.deck[36] = c37;
        this.deck[37] = c38;
        this.deck[38] = c39;
        this.deck[39] = c40;
        this.deck[40] = c41;
        this.deck[41] = c42;
        this.deck[42] = c43;
        this.deck[43] = c44;
        this.deck[44] = c45;
        this.deck[45] = c46;
        this.deck[46] = c47;
        this.deck[47] = c48;
        this.deck[48] = c49;
        this.deck[49] = c50;
        this.deck[50] = c51;
        this.deck[51] = c52;
    }
}

class Player {
    private String name;
    private double points;

    public Player() {}

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPoints() {
        return points;
    }

    public void addPoints(double points) {
        this.points = points;
    }

    public void deductPoints(double points) {
        this.points = points;
    }
}

public class FishingGameTest {
    public static void main(String[] args) {
        DeckOfCards deckOfCards1 = new DeckOfCards();
        Scanner scan = new Scanner(System.in);
        System.out.print("How many times you want to cast? ");
        int response = scan.nextInt();
        int finalScore = 0;
        for (int i = 0; i < response; i++) {
            deckOfCards1.shuffle();
            Card drewCard = deckOfCards1.drawCard();
            int score = deckOfCards1.getCardToPointsMap().get(drewCard);
            System.out.println("Drew Card is : " + drewCard.toString() + " and it's point is: " + score);
            finalScore += score;
        }
        System.out.println("Your final score is: " + finalScore);
    }
}
