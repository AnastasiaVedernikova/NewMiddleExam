import java.util.Observable;


/**
 * Created by cs.ucu.edu.ua on 02.12.2016.
 */
class Turnstile extends Observable{
    public Turnstile(){
        this.addObserver(new Systema(this));

    }
    public boolean TryLift(AbstractCard card) {
        notifyObservers(card);
        if (card.lifts != 0 && card.lifts!=-1) {
            card.lifts -= 1;
            return true;
        }
        return false;
    }

}
