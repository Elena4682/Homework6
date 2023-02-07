public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.println(" Задача 1 ");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }
        task2();
    }

    public static void task2() {
        System.out.println(" Задача 2 ");
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println(i);
        }
        task3();
    }

    public static void task3() {
        System.out.println(" Задача 3 ");
        for (int i = 2; i <= 17; i = i + 2) {
            System.out.println(i);

        }
        task4();
    }

    public static void task4() {
        System.out.println(" Задача 4 ");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }
        task5();
    }

    public static void task5() {
        System.out.println(" Задача 5 ");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(+i + " год является високосным ");
        }
        task6();
    }

    public static void task6() {
        System.out.println(" Задача 6 ");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        task7();
    }

    public static void task7() {
        System.out.println(" Задача 7 ");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        task8();
    }

    public static void task8() {
        System.out.println(" Задача 8 ");
        int capital = 29000;
        int total = 0;
        for (int i = 0; i <= 12; i++) {
            total = total + capital;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей ");
        }
        System.out.println(total);

        task9();
    }

public static void task9() {
    System.out.println(" Задача 9 ");
    int capital = 29000;
    int total = 0;
    for (int i = 0; i <= 12; i++) {
        total= total + (total/100);
        total = total + capital;
        System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей ");
    }
    System.out.println(total);
    task10();
}

    public static void task10(){
        System.out.println(" Задача 10");
        int multiplier1=2;
int multiplier2 =1;
for (;multiplier2<=10;multiplier2++){
int composition= multiplier1*multiplier2;
    System.out.println(+ multiplier1+ "*" + multiplier2+ "=" + composition+ ";");
}
}
}



