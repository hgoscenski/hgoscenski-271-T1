/**
 * Created by hgoscenski on 2/15/17.
 */
public class RegistrationID {
    private String regID;

    /**
     * @param imPer takes an immigrant object
     * @param number takes the number object which is an artificial count
     */
    public RegistrationID(Immigrant imPer, int number) {
        regID = "IM*"+ imPer.getBirthCountry() + "*" + imPer.getYearOfEntry()+"*-*"+number;
    }


    /**
     * @param citPer takes a citizen object
     * @param number takes the number object which is an artificial count
     */
    public RegistrationID(Citizen citPer, int number){
        regID = "USA*" + citPer.getDob() + "*-*" + number;
    }

    @Override
    public String toString() {
        return regID;
    }
}
