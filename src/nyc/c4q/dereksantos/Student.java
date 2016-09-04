package nyc.c4q.dereksantos;

public class Student {

    private String firstName;
    private String lastName;
    private int idNumber;
    private String favoriteFood;

    public Student() {
    }

    public Student(String firstName, String lastName, int idNumber, String favoriteFood) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.favoriteFood = favoriteFood;
    }

    public Student(String favoriteFood) {
        this.favoriteFood = favoriteFood;
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

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }
}
