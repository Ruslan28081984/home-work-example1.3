public class Main {
    public static void main(String[] args) {

            // Задние 1

       int clientOS = 0;
       if (clientOS == 0) {
           System.out.println(" Установите версию приложения для iOS по ссылке");
       }  else if
            (clientOS == 1) {

            System.out.println(" Установите версию приложения для Android по ссылке");

        } else {
            System.out.println(" такой ОС нет");
           }


           // Задание 2

        int clientDeviceYear = 2016;
       int clientOs = 1;

       if (clientOs  == 1 && clientDeviceYear >= 2015) {
           System.out.println( " Установите новую прошивку для  IOS ");
       } else if (clientOs  == 1 && clientDeviceYear < 2015) {
           System.out.println( " Установите облегчённую версию прошивки для  IOS ");
       } else if (clientOs  == 0 && clientDeviceYear >= 2015) {
           System.out.println( " Установите новую прошивку для Android ");
       } else if (clientOs  == 0 && clientDeviceYear < 2015) {
           System.out.println( " Установите облегчённую версию прошивки для  Android ");
       } else  {
           System.out.println(" Такой системы не существует");
       }


         // Задание 3

        int year = 2021;
       if ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
           System.out.println(year + " год является високосным ");
       }
       else {
           System.out.println( year + " год не является високосным");
       }


       // Задание 4

        int deliveryDistance = 195;
       if ( deliveryDistance <= 20 && deliveryDistance > 0) {
           System.out.println(" Потребуется 1 день доставки");
       } else if ( deliveryDistance > 20 && deliveryDistance <= 60 ){
           System.out.println("  Потребуется 2 дня доставки");
       } else if  (deliveryDistance > 60 && deliveryDistance <= 100 ) {
           System.out.println(" Потребуеется 3 дня доставки");
       } else {
           System.out.println(" Так далеко не едем))!");
       }


      // Задание 5

        int monthNumber = 11;
       switch (monthNumber){
           case 1:
           case 2:
           case 12:
               System.out.println(" Зима");
               break;
           case 3:
           case 4:
           case 5:
               System.out.println(" Весна");
               break;
           case 6:
           case 7:
           case 8 :
               System.out.println(" Лето");
               break;
           case 9:
           case 10:
           case 11:
               System.out.println(" Осень");
               break;
           default:
               System.out.println(" такого месяц не существует");
       }


    }
    }

