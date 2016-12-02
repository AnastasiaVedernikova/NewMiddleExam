/**
 * Created by cs.ucu.edu.ua on 02.12.2016.
 */
public enum LimitOnDays {
    OneDay(1), TwoDays(2), FiveDays(5);
    Integer days;
      LimitOnDays(Integer num){
        this.days = num;
    }
    Integer AmOfDays(){
        return this.days;
    }
}
