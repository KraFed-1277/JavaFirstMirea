package done.pr_9;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Сколько студентов?");
        int n=scanner.nextInt();

        SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA(n);
        sortingStudentsByGPA.sortGpaQuick();
        sortingStudentsByGPA.out_students();

    }

}