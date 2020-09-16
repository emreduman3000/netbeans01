/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

/**
 *
 * @author emreduman
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        //fetch student record based on his roll no from the database
        Student model  = retriveStudentFromDatabase();//robert 10 bligilerini methoddan aldı 
        Student model2  = new Student("duman","11");

        //Create a view : to write student details on console
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);//robert-10 bilgisi ve view nesnesi
       
        controller.updateView();

        //update model data
        controller.setStudentName("John");

        controller.updateView();
        
        System.out.println("----controller2---------");
        StudentController controller2 = new StudentController(model2, view);//robert-10 bilgisi ve view nesnesi
        controller2.updateView();
        controller2.getStudentRollNo();
        controller2.setStudentRollNo("22");
        controller2.updateView();


   }

   private static Student retriveStudentFromDatabase()
   {
      Student student = new Student("emre","10");//model clasının içine constructor eklyerek set methodlarını kullanıp deger atamadım
      //direk nesne olustururken deger  atadım
      
      //student.setName("Robert");
      //student.setRollNo("10");
      //System.out.println(student);//mvc.Student@e580929
      return student;//robert ve 10 bilgilerini set ettik
   }
}


class Student 
{
    private String name;
    private String rollNo;

    public Student(String name, String rollNo) 
    {
        this.name = name;
        this.rollNo = rollNo;
    }



    public String getRollNo(){return rollNo;}
    public void setRollNo(String rollNo){this.rollNo = rollNo;} 

    public void setName(String name){this.name = name;}
    public String getName() {return name;}
}


class StudentView
{
    public void printStudentDetails(String studentName, String studentRollNo)//controllerın içinde robert -10 kondu
    {
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}

class StudentController
{
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view)//constructor
    {
        this.model = model;//robert-10 bilgisi
        this.view = view;//obje
    }

    public void setStudentName(String name){model.setName(name);}//model nesnesi ile student clasındak get set methdlarını kullanıp kendine get set
    public String getStudentName(){return model.getName();}

    public void setStudentRollNo(String rollNo){model.setRollNo(rollNo);}
    public String getStudentRollNo(){return model.getRollNo();}

    public void updateView()
    {				
        view.printStudentDetails(model.getName(), model.getRollNo());//view objesi ile method cagrıldı ve robert-10 bilgileri get edildi
    }	
}
