import Senmas.Student;
import Tasks.*;

import java.util.*;
import java.util.stream.Collectors;

public class Tasks {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
        Task8();
        Task9();
        Task10();
    }

    /**
     Задание 1:
     1) Объявите две целочисленные переменные и присвойте им значения 7 и 10 соответственно. Имена
     переменных придумайте сами.
     2) Объявите целочисленную переменную с именем result и присвойте ей результат умножения первых
     двух переменных.
     3) Выведете на экран значение переменно result.
     */
    private static void Task1() {
        int sen1 = 7;
        int sen2 = 10;
        int result =sen1 + sen2;
        System.out.println(result);
    }
    /**
     Задание 2:
     1) Объявите четыре переменные типа string – s1,s2,s3,s4. Присвойте им произвольные значения.
     2) Выведите в консоль значения этих переменных в 1 строку, используя 1 метод.
     3) Выведите в консоль значения этих переменных в 4 строки, используя 1 метод.
     */
    private static void Task2() {
        String s1 = "s12";
        String s2 = "s2";
        String s3 = "s3";
        String s4 = "s4";
        System.out.println(s1 + s2 + s3 + s4);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
    /**
     Задание 3:
     1) Создайте 5 переменных и присвоите им значения, считанные с клавиатуры.
     2) Проанализируйте их, если среди них есть одинаковые, то выведите их на экран. Если они все разные
     выведите на экран фразу «Все разные», а если все 5 одинаковые, то выведите все пять строк на экран
     через запятую.
     Если все сделали правильно, то:
     при вводе “5 9 8 3 1”, будет выведено «Все разные»;
     при вводе “один два два три два”, будет выведено «два два два»;
     при вводе b b b b b, будет выведено «b, b, b, b, b».
     */
    private static void Task3() {
        String a, b, c, d, e;
        Scanner sc = new Scanner(System.in);

        a = sc.next();
        b = sc.next();
        c = sc.next();
        d = sc.next();
        e = sc.next();

        String[] array = {a, b, c, d, e};
        Map<String, Integer> map = new HashMap<>();

        for (String inputVar : array) {
            if (map.containsKey(inputVar)) {
                Integer countForThisValue = map.get(inputVar);
                map.put(inputVar, countForThisValue + 1);
            } else {
                map.put(inputVar, 1);
            }
        }

        List<String> inputVars = map.keySet().stream()
                .filter(x -> map.get(x) > 1).collect(Collectors.toList());

        if (inputVars.isEmpty()) {
        } else {
            inputVars.forEach(x -> {
                for (int i = 0; i < map.get(x); i++) {
                    System.out.print(x + "all different");
                }
            });
        }
    }
    /**
     Задание 4:
     Создайте программу, которая будет вычислять оценку в зависимости от полученных баллов.
     1) Если студент получил 0-60 баллов – то оценка 2.
     2) Если студент получил 60-74 баллов – то оценка 3.
     3) Если студент получил 75-90 баллов – то оценка 4.
     4) Если студент получил 91-100 баллов – то оценка 5.
     5) Градацию оценок надо вывести на экран. Количество баллов уточните у пользователя программы,
     путем вывода диалогового окна и считывания информации с клавиатуры.
     6) Использовать можно только конструкцию if-else.
     */
    private static void Task4() {
        System.out.println("If the student received 0-60 points - then a rating of 2.\n" +
                "If the student received 60-74 points, then a rating of 3.\n" +
                "If the student received 75-90 points, then a rating of 4.\n" +
                "If the student received 91-100 points, then a rating of 5.");
        System.out.println("Please enter the number of points");
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        if (grade > 90) {
            System.out.println("Rating 5");
        } else if (grade > 74) {
            System.out.println("Rating 4");
        } else if (grade > 60) {
            System.out.println("Rating 3");
        } else {
            System.out.println("Rating 2");
        }
    }
    /**
     Задание 5:
     Решите предыдущую задачу (No4), но с использованием конструкции «switch-case-default».
     */
    private static void Task5() {
        System.out.println("If the student received 0-60 points - then a rating of 2.\n" +
                "If the student received 60-74 points, then a rating of 3.\n" +
                "If the student received 75-90 points, then a rating of 4.\n" +
                "If the student received 91-100 points, then a rating of 5.");
        System.out.println("Please enter the number of points");
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        switch (grade) {
            case 91:
                System.out.println("Rating 5");
                break;
            case 75:
                System.out.println("Rating 4");
                break;
            case 61:
                System.out.println("Rating 3");
            default:
                System.out.println("Rating 2");
        }
    }
    /**
     Задание 6:
     Создайте массив из 15 чисел, введенных с клавиатуры. Отсортируйте полученный массив массив в
     порядке возрастания и выведите его на экран.
     */
    private static void Task6() {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        //System.out.print("Созданный массив:");
     //   System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
    /**
     Задание 7:
     Объявите массив целых чисел с 6 элементами и присвойте его какой-нибудь переменной. Обратитесь к
     7 элементу массива и выведите его на экран. Перехватите возникшее исключение и выведите
     сообщение об исключении и его имя.
     */
    private static void Task7() {
        int[] array = {1, 2, 3, 4, 5, 6};
        try {
            System.out.println(array[7]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Возникло исключение" + ex);
        }
    }
    /**
     Задание 8:
     Создайте два класса самолетов AirBusA320 и AirBusA380. Добавьте в класс самолета AirBusA320
     методы, отвечающие за скорость и длину разбега самолета, которые выводят на экран
     соответствующие надписи о действии экземпляра. Унаследуйте AirBusA380 от самолета AirbusA320,
     добавив ему метод отвечающий за вместимость пассажиров.
     */
    private static void Task8() {
        AirBusA320 airBusA320 = new AirBusA320();
        AirBusA380 airBusA380 = new AirBusA380();
        airBusA380.setSpeed(900);
    }
    /**
     Задание 9:
     Создайте 9 классов: студент, преподаватель, профессор, ассистент, магистрант, аспирант, декан,
     ректор, руководитель.
     1) Унаследуйте магистранта и аспиранта от класса Студент.
     2) Унаследуйте профессора и ассистента от Преподавателя.
     3) Унаследуйте декана и ректора от Руководителя.
     */
    private static void Task9() {
        Student student = new Student();
    }
    /**
     Задание 10:
     Напишите класс MoneyConverter для перевода денег по валюте Рубля в Евро, Доллары и Юани. У
     класса должен быть метод convertToRoubles, для перевода денег.
     */
    private static void Task10() {
        MoneyConvertor moneyConvertor = new MoneyConvertor();
        Euro euro = new Euro(70.1);
        Dollar dollar = new Dollar(64.8);
        Yuan yuan = new Yuan(8.98);
        Ruble euroToRuble = moneyConvertor.convertToRubli(euro);
        Ruble dollarToRuble = moneyConvertor.convertToRubli(dollar);
        Ruble yuanToRuble = moneyConvertor.convertToRubli(yuan);
        System.out.println("Euro rate/Курс евро: " + euroToRuble.getValue());
        System.out.println("Dollar rate/Курс доллара: " + dollarToRuble.getValue());
        System.out.println("RMB rate/Курс юаня: " + yuanToRuble.getValue());
    }
}
