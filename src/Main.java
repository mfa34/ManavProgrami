import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut=2.14 ,elma=3.67 , domates=1.11 ,muz=0.95 , patlican=5.00 ,armutp,elmap,domatesp,muzp,patlicanp, totalPrice;
        Scanner input=new Scanner(System.in).useLocale(Locale.US);
        System.out.print(" Armut Kac kilo ? ");
        armutp=input.nextDouble();
        System.out.print(" Elma Kac kilo ? ");
        elmap=input.nextDouble();
        System.out.print(" Domates Kac kilo ? ");
        domatesp=input.nextDouble();
        System.out.print(" Muz Kac kilo ? ");
        muzp=input.nextDouble();
        System.out.print(" Patlican Kac kilo ? ");
        patlicanp=input.nextDouble();

        totalPrice=armut*armutp+elma*elmap+domates*domatesp+muz*muzp+patlican*patlicanp;
        System.out.println("Toplam Tutar : " + totalPrice + "TL");
    }
}
