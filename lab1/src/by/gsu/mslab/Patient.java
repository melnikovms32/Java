package by.gsu.mslab;

public class Patient {

    private String lastName;
    private String gender;
    private int age;

    public Patient (String lastName, String gender, int age) {

        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

    public Patient() {
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return lastName+";"+gender+";"+age;
    }
}
