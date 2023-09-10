package task2;

import java.util.*;

public class Poker {
    private String[] cards = {"2♥", "3♥", "4♥", "5♥", "6♥", "7♥", "8♥", "9♥", "10♥", "A♥", "J♥", "Q♥", "K♥",
            "2♦", "3♦", "4♦", "5♦", "6♦", "7♦", "8♦", "9♦", "10♦", "A♦", "J♦", "Q♦", "K♦",
            "2♣", "3♣", "4♣", "5♣", "6♣", "7♣", "8v♣", "9♣", "10♣", "A♣", "J♣", "Q♣", "K♣",
            "2♠", "3♠", "4♠", "5♠", "6♠", "7♠", "8♠", "9♠", "10♠", "A♠", "J♠", "Q♠", "K♠"};

    public void giveCards(int n) {
        List<String> deck = Arrays.asList(cards);
        String s = "";
        Collections.shuffle(deck);
        if (n >= 1 && n <= 10) {
            for (int i = 0; i < n*5; i++) {
                s += deck.get(i) + (((i+1)%5 == 0)? "\n\n":" ");
            }
        }
        System.out.print(s);
    }
}
