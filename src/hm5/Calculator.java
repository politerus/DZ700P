package hm5;

import java.util.Scanner;

public class Calculator {

    public int a;
    public int b;

    public int add(){ return a + b; }

    public int sub(){ return a - b;}

    public int mul(){return a * b;}

    public int div() throws ArithmeticException{

        return a/b;

    }

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ВВедите первое число");
        int a = sc.nextInt();
        System.out.println("ВВедите второе число");
        int b = sc.nextInt();
        System.out.println("выберите операцию (+, -, *, или /)");
        String op = sc.next();

        Calculator calc = new Calculator(a,b);

        switch (op){
            case "+":
                System.out.println(calc.add());
                break;
            case "-":
                System.out.println(calc.sub());
                break;
            case "*":
                System.out.println(calc.mul());
                break;
            case "/":
                try {
                    System.out.println(calc.div());
                }
                catch (ArithmeticException e){
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Вы сделали что то не так! ");
        }

    }
}
/*
   Створіть проект за допомогою IntelliJ IDEA. Створіть клас Calculator.
   У тілі класу створіть чотири методи для арифметичних дій:
   (add – додавання, sub – віднімання, mul – множення, div – поділ).
   Метод поділу повинен перевірити поділ на нуль, якщо перевірка не проходить,
    згенерувати виняток. Користувач вводить значення, над якими хоче зробити операцію
    та вибрати саму операцію. У разі виникнення помилок повинні викидатися винятки.
 */