import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by johrir on 7/24/2017.
 */

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@interface TimeStamp {
    enum Day{
        MONDAY,TUESDAY,WEDNESDAY,THRUSDAY,FRIDAY,SATURDAY,SUNDAY
    }
    enum Month{
        JAN,FEB,MARCH,APRIL,MAY,JUNE,JULY,AUG,SEP,OCT,NOV,DEC
    }
    enum Year{
        YEAR2015,YEAR2016,YEAR2017,YEAR2018,YEAR2019,YEAR2020
    }
    Day day();
    Month month();
    Year year();
}
