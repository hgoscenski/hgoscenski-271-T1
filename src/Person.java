import java.time.LocalDate;

/**
 * Created by hgoscenski on 2/15/17.
 */

public abstract class  Person {
    private String fname;
    private String lname;
    private String dob;
    private String birthCountry;

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

    @Override
    public String toString() {
        return lname + ", " + fname + " " + dob + " " + birthCountry;
    }
}
