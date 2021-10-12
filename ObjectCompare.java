import java.util.Objects;

public class ObjectCompare implements Comparable {
    public ObjectCompare(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    String firstName;
    String lastName;

    public static void main(String args[]){
        ObjectCompare o = new ObjectCompare("Test", "Test");
        ObjectCompare o1 = new ObjectCompare("Test", "Test");
        System.out.println(o.equals(o1));
    }


    @Override
    public int compareTo(Object o) {
        ObjectCompare t = (ObjectCompare) o;
        return ((this.firstName + this.lastName).compareTo(t.firstName +t.lastName));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ObjectCompare)) return false;
        ObjectCompare that = (ObjectCompare) o;
        return Objects.equals(getFirstName(), that.getFirstName()) &&
                Objects.equals(getLastName(), that.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName());
    }
}
