import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @author: lydsgy699
 * @email: 337887790@qq.com
 * @date: 2021/5/9 13:28
 */
public class Test1 {
    /*
    对象与类
    由类构造对象的过程成为创造类的实例
     */
    /*
    日历
     */
    public static void main(String args[]){
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        date = date.minusDays(today-1);
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i=1;i<value;i++) {
            System.out.print("    ");
        }
            while(date.getMonthValue()==month) {
                System.out.printf("%3d", date.getDayOfMonth());
                if (date.getDayOfMonth() == today) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                date = date.plusDays(1);
                if (date.getDayOfWeek().getValue() == 1) {
                    System.out.println();
                }
            }
                if (date.getDayOfWeek().getValue()!=1){
                    System.out.println();
                }
        }
    }

