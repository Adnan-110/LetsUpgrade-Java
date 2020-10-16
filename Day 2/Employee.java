package employee;

public class employee {
    
    String name, city;
    int age;
    
    public void display() {
        
        System.out.println("The Name is : " +name);
        System.out.println("The Age is : " +age);
        System.out.println("The City is : " +city);
        
    }
    
    public static void main(String[] args) {
        
        employee emp1 = new employee();
        emp1.name = "Rajeev";
        emp1.age = 26;
        emp1.city = "Delhi";
        
        employee emp2 = new employee();
        emp2.name = "Mayank";
        emp2.age = 24;
        emp2.city = "Bhopal";
        
        System.out.println("------- Employee Details -------");
        emp1.display();
        emp2.display();
        
    }
    
}