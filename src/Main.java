/**
 * Created by cs.ucu.edu.ua on 02.12.2016.
 */
public class Main {
    public static void main(String[] atrgs){
        Turnstile turnstile = new Turnstile();
        Registration registration = new Registration();
        AbstractCard card = registration.createCard(LimitOnLifts.FiftyLifts,"WorkDayCard");
//        System.out.println(turnstile.TryLift(card));
//        System.out.println(card.lifts);
//        System.out.println(card.getCharacteristics());
        card = new DiscountDecorator(card);
        System.out.println(card.getCharacteristics());



    }
}
