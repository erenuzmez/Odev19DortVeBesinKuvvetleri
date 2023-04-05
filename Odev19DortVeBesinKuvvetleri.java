package CDonguler;
import java.util.Scanner;
public class Odev19DortVeBesinKuvvetleri {
    public static void main(String[] args) {
        int sinirsayisi;
        Scanner input=new Scanner(System.in);
        System.out.println("Sınır sayısını giriniz:");
        sinirsayisi=input.nextInt();
        System.out.println("4'ün kuvvetleri");
        for (int i=1; i<=sinirsayisi ; i*=4){
            System.out.println("*" + i);
        }
        System.out.println("*****************\n5'in kuvvetleri:");
        for (int x=1; x<=sinirsayisi;x*=5){
            System.out.println("*"+x);
    }
  }
}
