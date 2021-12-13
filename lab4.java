


import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) throws IOException {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите размерность массива:");

        int N = console.nextInt();
        int [] A = new int[N];


        System.out.println("Введите массив:");

        for (int i = 0; i < N; i ++) {
            try {
                A[i] = console.nextInt();
            }catch (InputMismatchException e){
                System.out.println("error");
                System.exit(1);
            }
        }

        System.out.println("Исходный массив:");


        for (int i = 0; i < N; i ++) {
            System.out.println(A[i]);
        }

        System.out.println("Введите число X, которое хотите удалить из массива:");
        int X = console.nextInt();

        for (int i = 0; i < N; i ++) {
            if (A[i] == X){
                A[i] = 0;
            };
        }

        System.out.println("Обработанный массив:");

        for (int i = 0; i < N; i ++) {
            System.out.println(A[i]);
        }

        System.in.close();

    }
}




