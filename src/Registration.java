



/**
 * Created by cs.ucu.edu.ua on 02.12.2016.
 */
class Registration {

    private Integer ControlerId = 0;

    AbstractCard createCard(LimitOnDays typeCard, String free_vs_work){
        AbstractCard c;
       // this.observable = observable;
        if (free_vs_work.equals("WorkDayCard")){
            c = new WorkDayCard(typeCard);
            c.days = typeCard.AmOfDays();
            c.id = ControlerId;
            ControlerId+=1;
        }else if (free_vs_work.equals("FreeDayCard")){
            c = new FreeDayCard(typeCard);
            c.days = typeCard.AmOfDays();
            c.id = ControlerId;
            ControlerId+=1;

        }else{
            throw new RuntimeException("error input");

        }
        return c;
    }
    public AbstractCard createCard(LimitOnLifts typeCard, String free_vs_work){
        AbstractCard c;
      //  this.observable = observable;
        if (free_vs_work.equals("WorkDayCard")){
            c = new WorkDayCard(typeCard);
            c.lifts = typeCard.AmOfLifts();
            c.id = ControlerId;
            ControlerId+=1;
        }else if (free_vs_work.equals("FreeDayCard")){
            c = new FreeDayCard(typeCard);
            c.lifts = typeCard.AmOfLifts();
            c.id = ControlerId;
            ControlerId+=1;

        }else{
            throw new RuntimeException("error input");

        }
        return c;
    }


}
