/**
 * Created by cs.ucu.edu.ua on 02.12.2016.
 */
class WorkDayCard extends AbstractCard{
    public Integer getDays() {
        return this.days;
    }

    Integer days;
    Integer id;

    public Integer getLifts() {
        return this.lifts;
    }

    Integer lifts;
    public WorkDayCard(LimitOnLifts lifts){
        this.lifts = lifts.AmOfLifts();
    }
    public WorkDayCard(LimitOnDays days){
        this.days = days.AmOfDays();
    }

    @Override
    public String getCharacteristics(){
        return super.getCharacteristics()+"\n" + "WorkDayCard"+"\n"+ "am of lifts: " + getLifts() + "\n" + "am of days: "+ getDays();
    }

}
