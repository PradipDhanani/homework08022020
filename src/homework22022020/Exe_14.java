package homework22022020;

public class Exe_14 {//class
    /*
    Write a class with the name Person. The class needs three fields (instance variables) with the names firstName, lastName of type String and age of type int.
Write the following methods (instance methods):
*Method named getFirstName without any parameters, it needs to return the value of the firstName field.
*Method named getLastName without any parameters, it needs to return the value of the lastName field.
*Method named getAge without any parameters, it needs to return the value of the age field.
*Method named setFirstName with one parameter of type String, it needs to set the value of the firstName field.
*Method named setLastName with one parameter of type String, it needs to set the value of the lastName field.
*Method named setAge with one parameter of type int, it needs to set the value of the age field. If the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
*Method named isTeen without any parameters, it needs to return true if the value of the age field is greater than 12 and less than 20, otherwise, return false.
*Method named getFullName without any parameters, it needs to return the full name of the person.
    *In case both firstName and lastName fields are empty, Strings return an empty String.
    *In case firstName is an empty String, return firstName.
    *In case lastName is an empty String, return lastName.
To check if s String is empty, use the method isEmpty from the String class. For example, firstName.isEmpty() returns true if the String is empty or in other words, when the String does not contain any characters.
TEST EXAMPLE

TEST CODE: (Write below code in to main method then check out put)
Person person = new Person();
person.setFirstName("");   // firstName is set to empty string
person.setLastName("");    // lastName is set to empty string
person.setAge(10);
System.out.println("fullName= " + person.getFullName());
System.out.println("teen= " + person.isTeen());
person.setFirstName("John");    // firstName is set to John
person.setAge(18);
System.out.println("fullName= " + person.getFullName());
System.out.println("teen= " + person.isTeen());
person.setLastName("Smith");    // lastName is set to Smith
System.out.println("fullName= " + person.getFullName());

OUTPUT
fullName=
teen= false
fullName= John
teen= true
fullName= John Smith
NOTE: All methods should be defined as public NOT public static.
NOTE: In total, you have to write 8 methods.
     */

    public static void main(String[] args) {//mai method
        Exe_14 exe14 = new Exe_14();//object creation

        exe14.setFirstName(""); // calling firstName method with empty string
        exe14.setLastName(""); // calling lastName method with empty string
        exe14.setAge(10);//calling  instance method with onr parameter
        System.out.println("fullName= " + exe14.getFullName());//printing statement
        System.out.println("teen= " + exe14.isTeen());//printing statement
        exe14.setFirstName("John"); // printing statement with given name john
        exe14.setAge(18);//calling instance method with one parameter
        System.out.println("fullName= " + exe14.getFullName());//printing statement
        System.out.println("teen= " + exe14.isTeen());//printing statement
        exe14.setLastName("Smith"); //printing statement with lastname given as smith
        System.out.println("fullName= " + exe14.getFullName());//printing statement
    }

    // Local variables
    public String firstName;
    public String lastName;
    public int age;

    public String getFirstName() {//instance method
        return firstName;
    }

    public String getLastName() {//instance method
        return lastName;
    }

    public int getAge() {//instance method
        return age;
    }

    public void setFirstName(String firstName) {//instance method with one parameter
        this.firstName = firstName;
    }


    public void setLastName(String lastName) {//instance method with one parameter
        this.lastName = lastName;
    }

    public void setAge(int newAge) {// instance method with one parameter
        if (newAge < 0 || newAge > 100) {
            this.age = 0;
        } else {
            this.age = newAge;
        }
    }

    public boolean isTeen() {//instance method
        return age > 12 && age < 20;
    }

    public String getFullName() {////instance method
        if (lastName.isEmpty()) {//lastname string is empty
            this.lastName = firstName;
            return this.lastName;
        } else if (firstName.isEmpty()) {//lastname string is empty
            this.firstName = lastName;
            return this.firstName;
        } else {
            return firstName + " " + lastName;
        }


    }

}
