/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package person;

/**
 *
 * @author kobed
 */
public class Person {
    private final String name;
    private final String role;
    

    public Person (String name, String role ) {
        this.name  = name;
        this.role = role;
        System.out.println(name + "is a " + role);
        
public static void main (String[] args) {
    Person professor = new Person ("Dr.Smith" , "Professor");
    
}
        
    }
    
}
