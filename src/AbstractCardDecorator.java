/**
 * Created by cs.ucu.edu.ua on 02.12.2016.
 */
abstract public class AbstractCardDecorator extends AbstractCard {
    AbstractCard tm;
    public AbstractCardDecorator(AbstractCard tm){
        this.tm = tm;
    }
    public String getCharacteristics(){
        return this.tm.getCharacteristics()+ "\n" + "added  Decorator";
    }

}
