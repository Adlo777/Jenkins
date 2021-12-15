package ma.ac.uir;

public class Person {
    private final String givenName;
    private final String surname;

    public Person(String givenName, String surname) {
        this.givenName = givenName;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "givenName='" + givenName + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    String getDisplayName()
    {
        return surname + ", " +givenName;
    }


    public void ClasseLonguePourTesterSiSolarQubeEstPerformantEtefficace()
    {
        if(12==25)
        {
            System.out.println("OK");
        }
        else if (14==25)
        {
            System.out.println("DAD");
        }
        else if(218 > 254)
        {
            System.out.println("GAHI");
        }
        else if(218 < 254)
        {
            System.out.println("YOUSSEF");
        }
        else if(1588 > 254)
        {
            System.out.println("HABIBA");
        }


    }

}
