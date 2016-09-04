package nyc.c4q.dereksantos;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("chicken");
        Student student2 = new Student("chicken");

        System.out.println(checkSameFavoriteFood(student1, student2));
    }


    public static boolean checkSameFavoriteFood(Student student1, Student student2) {

        if (student1.getFavoriteFood().equals(student2.getFavoriteFood())) {
            return true;
        } else {
            return false;
        }
    }

}