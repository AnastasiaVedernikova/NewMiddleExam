import java.util.Observable;
import java.util.Observer;

/**
 * Created by cs.ucu.edu.ua on 02.12.2016.
 */
public class Systema  implements Observer {
    private Observable observable;

    public Systema(Observable observable){
        this.observable = observable;
    }
    public void update(Observable turnstile, Object card){
        boolean b = CheckValidity((AbstractCard)card);
        if (!b){
            String a = BlockCard((AbstractCard)card);
            System.out.println(a);
        }

    }
    private boolean CheckValidity(AbstractCard card){
        if (card.days.equals(0) && card.days.equals(0)){
            return false;
        }else if (card.days == -1 && card.lifts == -1 && card.id == -1){
            return false;
        }
        return true;
    }

    private String BlockCard(AbstractCard card) {
        if (!(CheckValidity(card))) {
            card.id = card.days = card.lifts = -1;
            return "Card is blocked";
        }
        return "Card is valid so no reasons to block it";
    }

}
