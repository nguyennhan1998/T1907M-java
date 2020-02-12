package example;

public class Card {
    int suit;
    int value;
    public boolean equals(Object obj){
        try{
            Card c= (Card) obj;
            if(suit==c.suit&&value==c.suit){
                 return true;
            }else{
                return false;
            }

        }catch (Exception e){
            return false;
        }
    }
}
