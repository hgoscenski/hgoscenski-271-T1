import java.time.LocalDate;

/**
 * Created by hgoscenski on 2/15/17.
 */
public class Immigrant extends Person {
    private String yearOfEntry;

    public Immigrant(String fname, String lname, String dob, String birthCountry, String yearOfEntry) {
        super(fname, lname, dob, birthCountry);
        this.yearOfEntry = yearOfEntry;
    }

    public String getYearOfEntry() {
        return yearOfEntry;
    }

    @Override
    public String toString() {
        return yearOfEntry + " " + super.toString() + "\n";
    }
}
