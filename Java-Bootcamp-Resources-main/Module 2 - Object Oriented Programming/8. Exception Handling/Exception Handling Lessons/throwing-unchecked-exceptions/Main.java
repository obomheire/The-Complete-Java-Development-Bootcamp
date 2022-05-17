import models.Employee;
import models.Store;

public class Main {
    public static void main(String[] args) {
        Employee stocker = new Employee("Lawal", "Stocker");
        Employee assisManager = new Employee("Nicholas", "Assistant Manager");
        Employee manager = new Employee("Zack", "Manger");

        Store store = new Store();

        //NB: line 13 - 15 will correct the error stated in 18 - 19 bellow
        store.setEmployees(0, stocker);
        store.setEmployees(1, assisManager);
        store.setEmployees(2, manager);

        System.out.println(store);
        // NB: at this point the store object does not have employee before calling the
        // open method hence we need to catch the error.
        store.open();

    }
}
