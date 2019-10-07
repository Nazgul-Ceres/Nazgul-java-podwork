package theKempels;

import java.util.ArrayList;

public class FamilyTest {

    public static void main (String[] args) {
        Parent dad = new Parent(35, "Jason", "Kempel");
        dad.setLastName("Kempel");
        dad.setFirstName("Jason");

        Parent mom = new Parent(35,"Eufemia","Kempel");
        mom.setLastName("Kempel");
        mom.setFirstName("Eufemia");

        dad.sayHelloDad();
        mom.sayHelloMom();

        ArrayList<FamilyMember> kids = new ArrayList<>();
        kids.add(new FamilyMember(3, "Kempel", "Jenevieve"));
        kids.add(new FamilyMember(8, "Kempel", "Jason Jr."));
        kids.add(new FamilyMember(17, "Favela", "Julian"));

    }

}