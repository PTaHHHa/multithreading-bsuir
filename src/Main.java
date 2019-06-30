/*8. В театральной кассе продаются билеты.
Работает три кассы. Первый кассир обслуживает одного покупателя за {2 мин.},
второй – за {2,5 мин.}, третий – за {2,8 мин.}. Всего надо обслужить {250} человек.
Через каждые 45 мин. кассиры закрывают кассу на 10 минутный технический перерыв.
Во время работы кассиры не простаивают. Необходимо разработать многопоточное приложение, которое позволяет сделать следующее:
a) вводятся все данные, отмеченные в условии задачи как {..};
б) время, за которое были обслужены все покупатели;
в) количество покупателей, обслуженные каждым кассиром
 */
import java.util.Scanner;

public class Main {
    static public double t1, t2, t3;
    static public int kol;

    public static void main(String[] args) {

        System.out.print("Введите количество покупателей\n");
        Scanner s1 = new Scanner(System.in);
        kol = s1.nextInt();
        System.out.print("Введите время обслуживания одного покупателя(сек)\n");
        System.out.print("КАССА 1: ");
        Scanner s2 = new Scanner(System.in);
        t1 = s2.nextDouble();
        System.out.print("КАССА 2: ");
        Scanner s3 = new Scanner(System.in);
        t2 = s3.nextDouble();
        System.out.print("КАССА 3: ");
        Scanner s4 = new Scanner(System.in);
        t3 = s4.nextDouble();

        CashBox1 thread1 = new CashBox1();
        thread1.start();
        CashBox2 thread2 = new CashBox2();
        thread2.start();
        CashBox3 thread3 = new CashBox3();
        thread3.start();
    }
}




