package com.caffidev.unoone.abstracts;

import com.caffidev.unoone.enums.CardColor;
import com.caffidev.unoone.enums.CardType;

/** A card model */
public abstract class CommonCard{
    private final CardType cardType;
    private final CardColor cardColor;
    
    public CommonCard(CardType type, CardColor color){
        cardType = type;
        cardColor = color;
    }
    
    public CardType getCardType() {return cardType;}
    
    public CardColor getCardColor() {return cardColor;}
}
