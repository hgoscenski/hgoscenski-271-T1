/**
 * Created by hgoscenski on 2/15/17.
 */
public class MainToRun {
    public static void main(String args[]){
        Immigrant jdoe = new Immigrant("John", "Doe", "09/06/1996", "Mexico", "1998");
        Immigrant asmith = new Immigrant("Anna", "Smith", "03/02/1994", "Greece", "2005");
        Immigrant swallace = new Immigrant("Sam", "Wallace", "06/01/1978", "Russia", "1998");
        Citizen ggoscenski = new Citizen("Gary", "Goscenski","03/01/1997", "USA");

        RegisteredPeople rp = new RegisteredPeople();

        rp.assignRegistrationID(swallace);
        rp.assignRegistrationID(ggoscenski);
        rp.assignRegistrationID(jdoe);
        rp.assignRegistrationID(asmith);

        rp.toString();



    }
}
