package Test2;

/**
 * @author: lydsgy699
 * @email: 337887790@qq.com
 * @date: 2021/5/9 15:20
 */
public class EmployeeTest {
    public static void main(String args[]){
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("lrs1",50000,2021,1,1);
        staff[1] = new Employee("lrs2",60000,2021,1,1);
        staff[2] = new Employee("lrs3",70000,2021,1,1);
        for (Employee e:staff
             ) {
            e.raiseSalary(5);
        }
        for (Employee e:staff
             ) {
            System.out.println("name:"+e.getName()+",salary:"+e.getSalary()+",hireDay:"+e.getHireDay());
        }
    }
}
