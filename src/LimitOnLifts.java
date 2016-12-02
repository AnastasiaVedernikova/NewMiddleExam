/**
 * Created by cs.ucu.edu.ua on 02.12.2016.
 */
public enum LimitOnLifts {
    TenLifts(10), TwentyLifts(20), FiftyLifts(50), OneHundredLifts(100);
    Integer lifts;
    LimitOnLifts(Integer num){
        this.lifts = num;
    }
    Integer AmOfLifts(){
        return this.lifts;
    }
}
