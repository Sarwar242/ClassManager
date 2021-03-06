package ml.sarwarcse4bu.classmanager;

import java.io.Serializable;

class Settings implements Serializable {

    private static final long serialVersionUID = -29238982928391L;

    private int start_day;
    private int end_day;

    private boolean showWeek;


    Settings() {
        this.start_day = 1;
        this.end_day = 5;
        this.showWeek = false;
    }

    //Getters
    int getStart_day(){return start_day;}
    int getEnd_day(){return end_day;}

    boolean getShowWeek(){return showWeek;}


    //Setters
    void setStart_day(int input_day){
        this.start_day = input_day;
        if(end_day < start_day) end_day = start_day;
    }
    void setEnd_day(int input_day){
        this.end_day = input_day;
        if(start_day > end_day) start_day = end_day;
    }

    void setShowWeek(boolean showWeek){this.showWeek = showWeek;}

}
