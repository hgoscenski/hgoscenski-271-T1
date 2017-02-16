import java.time.LocalDate;

/**
 * Created by hgoscenski on 2/15/17.
 */
public class Immigrant extends Person {
    private String yearOfEntry;

    /**
     * @param fname same as Person
     * @param lname same as Person
     * @param dob same as Person
     * @param birthCountry same as Person
     * @param yearOfEntry unique to immagrants and contains the year they first entered the USA
     */
    public Immigrant(String fname, String lname, String dob, String birthCountry, String yearOfEntry) {
        super(fname, lname, dob, birthCountry);
        this.yearOfEntry = yearOfEntry;
    }

    public String getYearOfEntry() {
        return yearOfEntry;
    }

    @Override
    public String toString() {
        return super.toString() + " Entered: " + yearOfEntry + "\n";
    }
}
