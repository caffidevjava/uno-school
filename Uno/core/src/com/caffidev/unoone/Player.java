package com.caffidev.unoone;

import com.caffidev.unoone.abstracts.CommonCard;
import com.caffidev.unoone.abstracts.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.smartcardio.Card;

public class Player extends Entity {
    private final String name;
    List<CommonCard> cards = new ArrayList<>();
    
    public Player(String name){
        this.name = name;
    }
    
    public void drawCards(int number){
        for (int i = 0; i < number; i++) {
            drawOneCard();
        }
    }
    
    public void drawOneCard(){
        //todo: draw one card
    }
}
