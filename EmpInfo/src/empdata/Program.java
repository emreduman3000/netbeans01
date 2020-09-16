
package empdata;

/**
 *
 * @author Megha Patel
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Employee e=new Employee("Maria",50,45);
        Manager m=new Manager("Jack",60,45,500);
        
        System.out.println("Employee Salary: "+e.calculatePay());
        System.out.println("Manger Salary:"+m.calculatePay());
    }

}
