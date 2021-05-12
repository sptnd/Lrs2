package Test2;

import java.time.LocalDate;

/**
 * @author: lydsgy699
 * @email: 337887790@qq.com
 * @date: 2021/5/9 15:02
 */
public class Employee {
    /*
    这个类包含了一个构造器和四个方法
    public关键字意味着任何类的任何方法都可以调用这些方法
    private关键字确保只有Employee类自身的方法能够访问这些实例字段，其他类的方法不能狗读这些字段
     */
        private static int nextId = 1;
        private String name;
        private double salary;
        private LocalDate hireDay;
        private int id;
        /*
        1.构造器与类同名
        2.每个类可以有一个以上的构造器
        3.构造器可以有0个，1个，或多个参数
        4.构造器没有返回值
        5.构造器总是伴随着new操作符一起调用
         */
        public Employee(String n,double s,int year,int month,int day){//构造器
            name=n;
            salary=s;
            id = 0;
            hireDay=LocalDate.of(year,month,day);
        }
        /*
        典型的访问器方法，又称为字段访问器
        只返回实例字段值
         */
        public String getName(){
            return name;
        }
        public double getSalary(){
            return salary;
        }
        public LocalDate getHireDay(){
            return hireDay;
        }
        public void setId(){
            id = nextId;
            nextId++;
        }
        public int getId(){
            return id;
        }
        public static int getNextId(){
            return nextId;
        }
        /*
        raiseSalary有两个参数  第一个参数为隐式参数是出现在方法名签的Employee类型的对象
        第二个参数是位于方法名后面括号中的数值，这是一个显式参数
        在每一个方法中，关键字this指示隐式参数
         */
        public void raiseSalary(double byPercent){
            double raise=salary * byPercent/100;
            salary+=raise;
        }
}
