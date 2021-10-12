import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class ObjectSorting {
    public static void main(String args[]) {
        ObjectSorting objectSorting = new ObjectSorting();
        objectSorting.sort();

    }

    public void sort() {
        //to get the value from map we need override equals and hashcode.
        Map<Customer, Account> accounts = new HashMap<>();
        accounts.put(new Customer("Joe", "Bloggs"), new Account("100000", 1.05));

        Account account = accounts.get(new Customer("Joe", "Bloggs"));
        System.out.println(account);

        double balance = account.getBalance();
        balance -= 0.42;
        account.setBalance(balance);
        System.out.println(account.getBalance());

        //Sorting and comparing we need to implement comparable and override tocompare method
        SortedSet<Customer> customers = new TreeSet<>();
        customers.add(new Customer("Victoria", "Gotti"));
        customers.add(new Customer("John", "Barnes"));
        customers.add(new Customer("Rajeev", "Sasid"));
        customers.add(new Customer("Miriam", "Makeba"));
        customers.add(new Customer("Freddie", "Flintoff"));
        customers.add(new Customer("Esther", "Tester"));

        for (final Customer customer : customers) {
            System.out.println(customer);
        }
    }


    class Customer implements Comparable {

        private final String firstName;
        private final String lastName;

        public Customer(final String firstName, final String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this)
                return true;
            if (!(o instanceof Customer))
                return false;

            Customer other = (Customer) o;
            boolean equalsFirstName = (this.firstName == null && other.firstName == null)
                    || (this.firstName != null && this.firstName.equals(other.firstName));
            boolean equalsLastName = (this.lastName == null && other.lastName == null)
                    || (this.lastName != null && this.lastName.equals(other.lastName));
            return equalsLastName && equalsFirstName;
        }

        @Override
        public final int hashCode() {
            int result = 17;
            if (firstName != null) {
                result = 31 * result + firstName.hashCode();
            }
            if (lastName != null) {
                result = 31 * result + lastName.hashCode();
            }
            return result;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Object o) {
            Customer c = (Customer) o;
            return ((this.firstName + this.lastName).compareTo((c.firstName + c.lastName)));

        }
    }

    class Account {

        private String accountNumber;
        private double balance;

        public Account(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(final String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(final double balance) {
            this.balance = balance;
        }

        @Override
        public String toString() {
            return "Account{" +
                    "accountNumber='" + accountNumber + '\'' +
                    ", balance=" + balance +
                    '}';
        }
    }
}
