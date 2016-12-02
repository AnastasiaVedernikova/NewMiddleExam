/**
 * Created by cs.ucu.edu.ua on 02.12.2016.
 */
class FreeDayCard extends AbstractCard{
    Integer days;
    Integer lifts;
    Integer id;

    public FreeDayCard(LimitOnDays days){
        this.days = days.AmOfDays();
    }

    public FreeDayCard(LimitOnLifts lifts){
        this.lifts = lifts.AmOfLifts();
    }
    public Integer getDays() {
        return days;
    }



    public Integer getLifts() {
        return lifts;
    }
    @Override
    public String getCharacteristics(){
        return super.getCharacteristics()+ "\n"+"FreeDayCard " +"\n"+ "am of lifts: " + getLifts() + "am of days: "+ getDays();
    }
}
