enum Day {
    MONDAY, TUESDAY, WEDNSEDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

enum Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
}

public class EnumExample {
    public static void main(String[] args) {
        Day day = Day.MONDAY;

        switch(day) {
            case MONDAY : 
            System.out.println("월요일입니다.");
            break;
            case TUESDAY :
            System.out.println("화요일입니다.");
            break;
            case WEDNSEDAY :
            System.out.println("수요일입니다.");
            break;
            /*
             *  ... 생략 ...
             */
        }
    }