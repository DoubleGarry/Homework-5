public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();


    }
    public static void task1(){
        System.out.println("Задача 1");
        int clientOC = 1;
        if (clientOC == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task2(){
        System.out.println("Задача 2");
        int clientOC = 0;
        int clientDeviceYear = 2014;
        if (clientOC == 0) {
            if (clientDeviceYear <=2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else {
            System.out.println("Установите обычную версию приложения для IOS по ссылке");
        }
        } else {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
        }
        }



    }
    public static void task3(){
        System.out.println("Задача 3");

    }
    public static void task4(){
        System.out.println("Задача 4");

    }
    public static void task5(){
        System.out.println("Задача 5");

    }
}