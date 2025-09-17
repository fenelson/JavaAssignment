public class Salary {                         
   public static void main(String[] args) { 
      int hourlyWage;

      hourlyWage = 48;
                   
      System.out.print("Annual salary is: ");         
      System.out.println(hourlyWage * 40 * 50);   
    
      System.out.print("Monthly salary is: ");
      System.out.println((hourlyWage * 40 * 50) / 3); 
      // FIXME: The above is wrong. Change the 1 so the statement prints monthly salary.

   } 
}
