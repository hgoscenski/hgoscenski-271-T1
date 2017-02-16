import java.time.LocalDate;

/**
 * Created by hgoscenski on 2/15/17.
 */
public class Citizen extends Person {

    /**
     * @param fname same as Person
     * @param lname same as Person
     * @param dob same as Person
     * @param birthCountry same as Person
     */
    public Citizen(String fname, String lname, String dob, String birthCountry) {
        super(fname, lname, dob, birthCountry);
    }

    @Override
    public String toString() {
        return super.toString() + "\n";
    }
}
