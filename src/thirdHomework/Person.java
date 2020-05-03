package thirdHomework;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String value) {
        this.firstName = value;
    }

    public void setLastName(String value) {
        this.lastName = value;
    }

    public void setAge(int value) {
        this.age = value >= 0 && value <= 100 ? value : 0;
    }

    public boolean isTeen() {
        return this.age > 12 && this.age < 20;
    }

    public String getFullName() {
        return !this.firstName.isEmpty() && !this.lastName.isEmpty() ?
                this.firstName + " " + this.lastName :
                this.firstName + this.lastName;
    }
}
