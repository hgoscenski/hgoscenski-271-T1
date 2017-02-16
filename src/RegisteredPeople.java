import java.util.*;

/**
 * Created by hgoscenski on 2/15/17.
 */
public class RegisteredPeople {

    int number =1;
    ArrayList<Person> regPeople;
    ArrayList<RegistrationID> regIDs;

    /**
     * takes an empty constructor to hold the arraylist of persons
     * this is used to hold the persons after they receive their registration number
     */
    public RegisteredPeople(){
        regPeople = new ArrayList<>();
    }

    // used to created a registration id for an immigrant

    public void assignRegistrationID(Immigrant regPer){
        regPeople.add(regPer);
        regPer.setRegID(new RegistrationID(regPer, number));
//        System.out.println(number);
        number++;
    }

//    used to create a registration id for a citizen
    public void assignRegistrationID(Citizen regPer){
        regPer.setRegID(new RegistrationID(regPer, number));
        regPeople.add(regPer);
        number++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < regPeople.size(); i++){
            sb.append(regPeople.get(i).toString());
        }
        return sb.toString();
    }
}

