import java.util.*;

/**
 * Created by hgoscenski on 2/15/17.
 */
public class RegisteredPeople {

    int number =1;
    ArrayList<Person> regPeople;
    ArrayList<RegistrationID> regIDs;

    public RegisteredPeople(){
        regPeople = new ArrayList<>();
        regIDs = new ArrayList<>();
    }

    public void assignRegistrationID(Immigrant regPer){
        regPeople.add(regPer);
        regIDs.add(new RegistrationID(regPer, number));
//        System.out.println(number);
        number++;
    }

    public void assignRegistrationID(Citizen regPer){
        regPeople.add(regPer);
        regIDs.add(new RegistrationID(regPer, number));
//        System.out.println(number);
        number++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < regPeople.size(); i++){
            sb.append(regIDs.get(i).toString()+ " | " + regPeople.get(i).toString());
        }
        System.out.println(sb);
        return sb.toString();
    }
}

