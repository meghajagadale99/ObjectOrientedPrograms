package com.bridgelabz.oops;

public class Card {
    String suit;
    String rank;

    public Card(int suit, int rank) {
        this.suit = getSuit(suit);
        this.rank = getRank(rank);
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    /** returns rank of the card from number **/
    String getRank(int rankNumber) {
        switch(rankNumber) {
            case 0:
                return "2";
            case 1:
                return "3";
            case 2:
                return "4";
            case 3:
                return "5";
            case 4:
                return "6";
            case 5:
                return "7";
            case 6:
                return "8";
            case 7:
                return "9";
            case 8:
                return "10";
            case 9:
                return "Jack";
            case 10:
                return "Queen";
            case 11:
                return "King";
            case 12:
                return "Ace";
            default:
                return "";
        }
    }

    /** returns suit name from number */
    String getSuit(int suitNumber) {
        switch(suitNumber) {
            case 0:
                return "Clubs";
            case 1:
                return "Diamonds";
            case 2:
                return "Hearts";
            case 3:
                return "Spades";
            default:
                return "";
        }
    }

    public static class StockPortfolio {
        private String name;	//name of the stock
        private int numberOfShares, price;	//share count and price of each share

        /**
         * Constructor
         * @param name - name of the stock
         * @param numberOfShares - share count
         * @param price - price of each share
         */
        public StockPortfolio(String name , int numberOfShares, int price) {
            this.name = name;
            this.numberOfShares = numberOfShares;
            this.price = price;
        }


        /**
         * @returns value of the all stocks
         */
        public int getValue() {
            return numberOfShares * price;
        }

        /**
         * @returns name of the stock
         */
        public String getName() {
            return name;
        }

        /**
         * @returns number of shares
         */
        public int getNumberOfShares() {
            return numberOfShares;
        }

        /**
         * @returns price of the each share
         */
        public int getPrice() {
            return price;
        }
    }
}

