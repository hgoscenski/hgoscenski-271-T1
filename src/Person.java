import java.time.LocalDate;

/**
 * Created by hgoscenski on 2/15/17.
 */

public abstract class  Person {
    private String fname;
    private String lname;
    private String dob;
    private String birthCountry;
    private RegistrationID regID;

    /**
     * @param fname the person's first name as a string
     * @param lname the person's
     * @param dob the person's dob as a string (probably should be localdate, but time constraints)
     * @param birthCountry the person's country of origin as a string
     */
    public Person(String fname, String lname, String dob, String birthCountry) {
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.birthCountry = birthCountry;
    }

    Person(){}

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getDob() {
        return dob;
    }

    public String getBirthCountry() {
        return birthCountry;
    }

    public void setRegID(RegistrationID regID) {
        this.regID = regID;
    }

    @Override
    public String toString() {
        return regID + " | " + lname + ", " + fname + " " + dob + " " + birthCountry;
    }
}
