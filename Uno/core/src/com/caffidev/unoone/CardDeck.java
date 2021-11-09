package com.caffidev.unoone;

import com.caffidev.unoone.abstracts.CommonCard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Card deck has:
 * 4 colors; e.g 
 * Numbers: 4 zeros; 9*4*2=72(+4)=76 cards;
 * Skip, reverse + plus 2: 2^3*3=24 cards;
 * Wild cards: 8 cards
 * Total = 76+32+8=108 cards
 * https://commons.wikimedia.org/wiki/File:UNO_cards_deck.svg?uselang=ru
 */
public class CardDeck {
    private final List<CommonCard> cards = new ArrayList<>();
    
    private void createCards(){
        //todo: create cards
        
        //Shuffles card
        Collections.shuffle(cards);
    }
    
    public CardDeck(){
        createCards();
        
        Game.logger.debug("Created a starter deck of cards.");
    }
}
