package program.java.AssistedPractice_4Pillars;

class Employee{  
    float salary=40000;  
   }  
   class Inheritance extends Employee{  
    int bonus=10000;  
    public static void main(String args[]){  
      Inheritance i = new Inheritance();  
      System.out.println("Programmer salary is:" +i.salary);  
      System.out.println("Bonus of Programmer is:" +i.bonus);  
   }  
   }  