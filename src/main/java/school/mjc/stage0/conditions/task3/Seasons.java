package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if (month > 0 && month<=12){
            if (month>2 && month<6){
                System.out.println("Spring");
            }
            if (month>5 && month<9){
                System.out.println("Summer");
            }
            if (month>8 && month<12){
                System.out.println("Fall");
            }
            if (month==12 || month <3){
                System.out.println("Winter");
            }
        }
        else {
            System.out.println("wrong number!");
        }
    }
}
