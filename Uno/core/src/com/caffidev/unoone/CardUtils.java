package com.caffidev.unoone;

import com.caffidev.unoone.abstracts.CommonCard;
import com.caffidev.unoone.enums.CardColor;
import com.caffidev.unoone.enums.CardType;

public class CardUtils {
    
    /** Returns true if color is not null */
    public static boolean validateColor(CardColor color){
        if (color == null) return false;
        return true;
    }

    /** Returns true if it's a valid number for Uno */
    public static boolean validateNumber(int number){
        if(number < 0 || number > 9) {
            return false;
        } return true;
    }
    
    /** Returns true if it's a wild card, false if not */
    public static boolean isWildCard(CommonCard card) {
        return card.getCardType() == CardType.WILD_COLOR
                || card.getCardType() == CardType.PLUS_FOUR;
    }
}
