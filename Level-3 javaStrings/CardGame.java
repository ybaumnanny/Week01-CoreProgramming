import java.util.*;

public class CardGame{

    //Method to initialize the deck of cards with suits and ranks
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        int numCards = suits.length * ranks.length;
        String[] deck = new String[numCards];
        
        int index = 0;
        //Creating the deck by combining ranks and suits
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        
        return deck;
    }
    
    //Method to shuffle the deck of cards
    public static String[] shuffleDeck(String[] deck) {
        Random randomCard = new Random();
        int n = deck.length;
        
        //Shuffle
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + randomCard.nextInt(n - i); //Random card index
            //Swap the current card with the random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        
        return deck;
    }
    
    //Method to distribute cards to players
    public static String[][] distributeCards(String[] deck, int numPlayers, int numCards) {
        if (numCards * numPlayers > deck.length) {
            throw new IllegalArgumentException("Not enough cards to distribute!");
        }
        
        //Initializing a 2D array to store the players and their cards
        String[][] players = new String[numPlayers][numCards];
        
        int cardIndex = 0;
        //Distributing the cards to players
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < numCards; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        
        return players;
    }
    
    //Method to print the cards of each player
    public static void printPlayersCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (int j = 0; j < players[i].length; j++) {
                System.out.print(players[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //Initializing the deck array
        String[] deck = initializeDeck();
        
        //Shuffled the deck
        deck = shuffleDeck(deck);
        
        //Number of players and number of cards per player
        int numPlayers = 4; //For example
        int numCards = 5;   //Each player gets 5 cards
        
        //Distributing the cards
        String[][] players = distributeCards(deck, numPlayers, numCards);
        
        //Printing the cards of each player
        printPlayersCards(players);
    }
}
