package hm2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Worker implements Comparable<Worker>{
    public String name;
    private String title;
    private int yearOfEmployment;

    @Override
    public String toString() {
        return "\nИмя: " + name  +
                "\nДолжность: " + title +
                "\nГоды Работы: " + yearOfEmployment;
    }

    public String getName() {
        return name;
    }


    public int getYearOfEmployment() {
        return yearOfEmployment;
    }

    @Override
    public int compareTo(Worker o) {
        return this.name.compareTo(o.getName());
    }


    public Worker(String name, String title, int yearOfEmployment) {
        this.name = name;
        this.title = title;
        this.yearOfEmployment = yearOfEmployment;
    }
}

class Main{

    public static void main(String[] args) {


        try {
            ArrayList<Worker> workersList = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Введите имя работника:");
                String name = sc.nextLine();
                System.out.println("Введите должность:");
                String title = sc.nextLine();
                System.out.println("Введите год работы:");
                int yearOfEmployment = sc.nextInt();

                workersList.add(new Worker(name, title, yearOfEmployment));

            }//for

            Collections.sort(workersList);
            System.out.println("Список рабочих, отсортированный в алфавитном порядке:" + "\n" + workersList.toString());

            int year = 2022;
            Scanner sc = new Scanner(System.in);

            System.out.println("Введите многолетний опыт:");
            int yearsOfExperience = sc.nextInt();
            for (Worker temp : workersList) {
                if((year - temp.getYearOfEmployment()) > yearsOfExperience){
                    System.out.println("ФИО рабочих со стажем свыше требуемого: " + temp.getName());
                }
            }
        }

        catch (InputMismatchException e) {
            System.out.println(e + "\n Введите год в правильном формате: гггг");
        }

    }
}
/* Створіть проект за допомогою IntelliJ IDEA. Потрібно: Описати клас з ім'ям Worker, що містить такі поля:

         прізвище та ініціали працівника;

         назва посади;

         рік надходження на роботу.

        Написати програму, яка виконує такі дії:

         введення з клавіатури даних до масиву, що складається з п'яти елементів типу Worker
         (записи мають бути впорядковані за абеткою);

         якщо значення року введено не у відповідному форматі, видає виняток.

         виведення на екран прізвища працівника, стаж роботи якого перевищує введене значення   */