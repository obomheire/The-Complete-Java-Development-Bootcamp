import java.util.Arrays;

public class Person {

    private String name;
    private String nationality;
    private String dateOfBirt;
    private String[] passport;
    private int seatNumber;
    // chooseSeat();

    public Person(String name, String nationality, String dateOfBirt, String[] passport, int seatNumber) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirt = dateOfBirt;
        this.seatNumber = seatNumber;
        this.passport = Arrays.copyOf(passport, 3);
    }

    public Person(Person copyConstructore) {
        this.name = copyConstructore.name;
        this.nationality = copyConstructore.nationality;
        this.dateOfBirt = copyConstructore.dateOfBirt;
        this.seatNumber = copyConstructore.seatNumber;
        this.passport = Arrays.copyOf(copyConstructore.passport, 3);
    }

    public String getName() {
        return this.name;
    }

    public String getNationality() {
        return this.nationality;
    }

    public String getDateOfBirt() {
        return this.dateOfBirt;
    }

    public String[] getPassport() {
        return Arrays.copyOf(this.passport, this.passport.length);
    }

    public int getSeatNumber() {
        return this.seatNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setDateOfBirt(String dateOfBirt) {
        this.dateOfBirt = dateOfBirt;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setPassport(String[] passport) {
        this.passport = Arrays.copyOf(passport, passport.length);
    }

    public boolean applyPassport() {
        double randonNumber = Math.random() * 2;
        int number = (int) randonNumber;
        if (number == 0)
            return false;
        else
            return true;
    }

    public void chooseSeat() {
        int number = (int) (Math.random() * 11 + 1);
        this.seatNumber = number;
    }

    public String toString() {
        return "Name: " + this.name + "\n" + "Nationality: " + this.nationality + "\n" + "Date of Birth: " + dateOfBirt
                + "\n" + "Seat Number: " + this.seatNumber + "\n" + "Passport: " + Arrays.toString(this.passport)
                + "\n";
    }

}
