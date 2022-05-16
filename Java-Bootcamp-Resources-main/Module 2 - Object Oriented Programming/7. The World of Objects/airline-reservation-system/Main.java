import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Person[] people = new Person[] {
            new Person("Cleopatra", "Egypt", "69 BC", new String[] {}, 1),
            new Person("Alexander the Great", "Macedon", "356 BC", new String[] {}, 2),
            new Person("Julius Caesar", "Rome", "100 BC", new String[] {}, 3),
            new Person("Hannibal", "Carthage", "247 BC", new String[] {}, 4),
            new Person("Confucius", "China", "551 BC", new String[] {}, 5),
            new Person("Pericles", "Greece", "429 BC", new String[] {}, 6),
            new Person("Spartacus", "Thrace", "111 BC", new String[] {}, 7),
            new Person("Marcus Aurelius", "Rome", "121 AD", new String[] {}, 8),
            new Person("Leonidas", "Greece", "540 BC", new String[] {}, 9),
            new Person("Sun Tzu", "China", "544 BC", new String[] {}, 10),
            new Person("Hammurabi", "Babylon", "1750 BC", new String[] {}, 10),
        };

        Airline airline = new Airline();
        
        // for (int i = 0; i < people.length; i++) {
        //     // airline.setPerson(people[i]);
        // }

      /**
       * 
       * Using a getter, print the objects at indexes: 1, 5, and 10 of the seats
       * array.
       * 
       * System.out.println(airline.getPerson(1));
       * System.out.println(airline.getPerson(5));
       * System.out.println(airline.getPerson(10));
       * 
       */
      for (int i = 0; i < people.length; i++) {
          if (people[i].applyPassport() == true) {
              people[i].setPassport(new String[] {});
              airline.createReservation(people[i]);
          }
      }

      System.out.println("********************** RESERVATIONS COMPLETE! **********************\n");
      System.out.println(airline);
    }
}

/**
 * 
 * Workbook solution 6 - 7
 * 
 * Person person = new Person("Owoka Olusanmi", "Nigeria", "14/04/2020", new
 * String[] {}, 8);
 * if (person.applyPassport()) {
 * String[] passport = new String[] { person.getName(), person.getNationality(),
 * person.getDateOfBirt() };
 * person.setPassport(passport);
 * }
 * 
 * // System.out.println("Name: " + person.getName() + "\n" + "Nationality: " +
 * person.getNationality() + "\n"
 * // + "Date of Birth: " + person.getDateOfBirt() + "\n" + "Seat Number: " +
 * person.getSeatNumber() + "\n"
 * // + "Passport: " + Arrays.toString(person.getPassport()) + "\n");
 * 
 * // NB: When you try to print an object, java will look for the toString()
 * method
 * // in the Car class.
 * 
 * System.out.println(person);
 */

/**
 * 
 * Workbook solution 1 - 5
 * 
 * public static void main(String[] args) {
 * 
 * // Person persenger = new Person();
 * 
 * Person persenger = new Person("Zack Bello", "Nigeria", "14/09/1990", 5);
 * // Person persenger2 = new Person(persenger);
 * 
 * // persenger.name = "Zack Bello";
 * // persenger.nationality = "Nigeria";
 * // persenger.dateOfBirt = "14/09/1990";
 * // persenger.passport = new String[] { persenger.name, persenger.nationality,
 * // persenger.dateOfBirt };
 * // persenger.seatNumber = 5;
 * 
 * // persenger.setSeatNumber(10);
 * // persenger2.setName("Fatai owolabi");
 * // persenger2.setSeatNumber(15);
 * 
 * persenger.chooseSeat();
 * 
 * System.out.println("Name: " + persenger.getName() + "\n" + "Nationality: " +
 * persenger.getNationality() + "\n"
 * + "Date of Birth: " + persenger.getDateOfBirt() + "\n" + "Seat Number: " +
 * persenger.getSeatNumber()
 * + "\n");
 * 
 * // System.out.println("Name: " + persenger2.getName() + "\n" + "Nationality:
 * " + persenger2.getNationality() + "\n"
 * // + "Date of Birth: " + persenger2.getDateOfBirt() + "\n" + "Seat Number: "
 * + persenger2.getSeatNumber()
 * // + "\n");
 * 
 * if (persenger.applyPassport()) {
 * System.out.println("Congratulations " + persenger.getName() + ". Your
 * passport was approved!");
 * } else {
 * System.out.println("We're sorry " + persenger.getName() + ". We cannot
 * process your application.");
 * }
 * 
 * }
 */
