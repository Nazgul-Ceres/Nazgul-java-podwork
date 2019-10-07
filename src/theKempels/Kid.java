package theKempels;

public class Kid extends FamilyMember {

    public Kid(int age, String firstName, String lastName){
        super(age,firstName,lastName);
    }

    void sayHelloKid() {
        Kid jason = (Kid) new FamilyMember(getAge(),getFirstName(),getLastName());
        System.out.println(jason);
    }

}
