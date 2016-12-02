/**
 * Created by cs.ucu.edu.ua on 02.12.2016.
 */
public class DiscountDecorator extends AbstractCardDecorator {
    public DiscountDecorator(AbstractCard tm){
        super(tm);
    }
    @Override
    public String getCharacteristics(){
        return this.tm.getCharacteristics()+"\n"+"added Discount; ";
    }
}
