/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public enum Enum2 {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

}

class DayInWeek {

    Enum2 d;

    DayInWeek(Enum2 d) {
        this.d = d;
    }

    public void tellItlikeItIs() {
        switch (d) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best.");
                break;
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }
}
class UseDay{
    public static void main(String[] args){
        DayInWeek obj = new DayInWeek(Enum2.MONDAY);
        obj.tellItlikeItIs();
        obj= new DayInWeek(Enum2.WEDNESDAY);
        obj.tellItlikeItIs();
    }
}
