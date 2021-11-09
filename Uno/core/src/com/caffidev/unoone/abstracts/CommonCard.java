package com.caffidev.unoone.abstracts;

import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.caffidev.unoone.enums.CardColor;
import com.caffidev.unoone.enums.CardType;

/** A card model, that has its own Image */
public abstract class CommonCard extends ImageButton {
    private final CardType cardType;
    private final CardColor cardColor;
    private final Integer cardNumber; //if it's unique, has -1 number;
    
    public CommonCard(CardType type, CardColor color, Integer number){
        super(new TextureRegionDrawable());
        cardType = type;
        cardColor = color;
        cardNumber = number;
    }
    
    public CardType getCardType() {return cardType;}
    
    public CardColor getCardColor() {return cardColor;}

    public Integer getCardNumber() {return cardNumber;}
    
    private static String getTexturePath(){return "not implemented";}
    //todo
}
