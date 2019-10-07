package theKempels;

public class Parent extends FamilyMember {

    Parent(int age, String firstName, String lastName) {
        super(age, firstName, lastName);
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public void setLastName (String lastName) {
        super.setLastName(lastName);
    }

    void sayHelloDad() {
        System.out.println("Hello, I am the Dad in the " + super.getLastName() + " family, " + super.getFirstName() + ".");
    }

    void sayHelloMom() {
        System.out.println("\nHi, I am the Mom in the " + super.getLastName() + " family, " + super.getFirstName() + ".\n");
    }

}