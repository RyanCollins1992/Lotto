

public class Person {

   private String address;
   private int age;
   private String firstName;
   private String lastName;
   
   public Person(String add, int a, String f, String l){
      address = add;
      age = a;
      firstName = f;
      lastName = l;
   }
   
   String getAddress(){
      return address;
   }
   
   int getAge(){
      return age;
   }
   
   String getLastName(){
      return lastName;
   }
   
   String getFirstName(){
      return firstName;
   }
   
   public String toString(){
      return "Name: " + getFirstName() +" " + getLastName() + ", Age: " + getAge() + ", Address: " +getAddress() + "\n";
   }
}