/**
 * Created by hgoscenski on 2/15/17.
 */
public class RegistrationID {
    private String regID;

    public RegistrationID(Immigrant imPer, int number) {
        regID = "IM*"+ imPer.getBirthCountry() + "*" + imPer.getYearOfEntry()+"*-*"+number;
    }
    public RegistrationID(Citizen citPer, int number){
        regID = "USA*" + citPer.getDob() + "*-*" + number;
    }
//    public RegistrationID(Person thing, int number){}

    @Override
    public String toString() {
        return regID;
    }
}
