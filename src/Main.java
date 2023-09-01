public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1.");
        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("У вас неизвестная операционная система. Данное приложение вам недоступно");
        }
        System.out.println(" ");

        System.out.println("Задание 2.");
        int clientDeviceYear = 2015;
        switch (clientOS) {
            case 0:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } break;
            case 1:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } break;
            default:
                System.out.println("У вас неизвестная операционная система. Данное приложение вам недоступно");
        }
        System.out.println(" ");

        System.out.println("Задание 3.");
        int year = 2021;
        if (year >= 1584) {
            if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0) {
                System.out.println(year + " год является високосным.");
            } else {
                System.out.println(year + " год не является високосным.");
            }
        } else {
            System.out.println("Понятие високосный год еще не было введено.");
        }
        System.out.println(" ");

        System.out.println("Задание 4.");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            deliveryDays++;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryDays += 2;
            System.out.println("Потребуется дней: " + deliveryDays);
        }
        else {
            System.out.println("Доставки нет.");
        }
        System.out.println(" ");

        System.out.println("Задание 5.");
        int monthNumber = 3;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону осень.");
                break;
            default:
                System.out.println("Такого месяца не существует.");
        }
    }
}
