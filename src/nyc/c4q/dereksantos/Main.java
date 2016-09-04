package nyc.c4q.dereksantos;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Karim", "Benzema", 9, "CHICKEN");
        Student student2 = new Student("Cristiano", "Ronaldo", 7, "chicken");

        System.out.println(Student.checkSameFavoriteFood(student1, student2));
    }

}