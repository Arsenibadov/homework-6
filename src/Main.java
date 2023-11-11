public class Main {
    public static void main(String[] args) {
// Задание № 1

        for (int i = 0; i <=10; i = i+1)
        {System.out.println (i);}

        //задание 2
        for (int a = 10; a >= 1; a = a-1)
        {System.out.println (a);}

        //задание № 3
        for (int b = 0; b <=17; b= b + 2)
        {System.out.println (b);}

        // задание № 4
        for (int c = 10; c >= - 10; c = c - 1)
        {System.out.println (c);}

        // задание № 5
        for (int year = 1904; year <=2096; year = year + 4)
            System.out.println (year);

        //задание № 6
        for (int t = 7; t <=98; t = t + 7)
            System.out.println (t);

        //задание № 7
        for (int k = 1; k <= 512; k = k * 2)
            System.out.println (k);

        //задание № 8
        int salary = 29000;
        int month = 0;
        for (int a = 0; a < 12; a ++ )
        {month = salary + month;
        System.out.println ("Месяц " + a + " сумма накоплений равна " + month + " рублей ");}

        // задание № 9
        for ( int a = 0; a <12; a ++)
        {month = month + month / 100;
            System.out.println (" Месяц " + a + " сумма накоплений равна " + month + " рублей " );}

        //задание № 10
        for (int i = 1; i <= 10; i = i + 1)
            System.out.println("2 * " + i + " = " + 2 * i);
    }
}