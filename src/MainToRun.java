/**
 * Created by hgoscenski on 2/15/17.
 */
public class MainToRun {
    public static void main(String args[]){
        Immigrant jdoe = new Immigrant("John", "Doe", "09/06/1996", "Mexico", "1998");
        Immigrant asmith = new Immigrant("Anna", "Smith", "03/02/1994", "Greece", "2005");
        Immigrant swallace = new Immigrant("Sam", "Wallace", "06/01/1978", "Russia", "1998");
        Citizen ggoscenski = new Citizen("Gary", "Goscenski","03/01/1997", "USA");
        Citizen thenry = new Citizen("Thomas", "Henry","06/08/1995", "USA");
        Citizen mali = new Citizen("Muhammad", "Ali","04/10/2007", "USA");
        Citizen ewilder = new Citizen("Evan", "Wilder","02/19/2008", "USA");
        Citizen talexson = new Citizen("Tom", "Alexson","04/28/1978", "USA");
        Immigrant tquintana = new Immigrant("Tony", "Quintana", "07/13/1995", "Mexico", "1977");
        Immigrant sjobs = new Immigrant("Steve", "Jobs", "01/01/1996", "Mexico", "1999");

        RegisteredPeople rp = new RegisteredPeople();

        rp.assignRegistrationID(swallace);
        rp.assignRegistrationID(ggoscenski);
        rp.assignRegistrationID(jdoe);
        rp.assignRegistrationID(asmith);
        rp.assignRegistrationID(thenry);
        rp.assignRegistrationID(mali);
        rp.assignRegistrationID(ewilder);
        rp.assignRegistrationID(talexson);
        rp.assignRegistrationID(tquintana);
        rp.assignRegistrationID(sjobs);

        System.out.println(rp.toString());



    }
}
