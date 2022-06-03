import java.util.Scanner;

public class usAlma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int i,n,k,total=1;

        System.out.print("Ussu Alinacak Sayi: ");
        n= inp.nextInt();
        System.out.print("Us :");
        k= inp.nextInt();

        for(i=1;i<=k;i++){
            total*=n;

            System.out.println(total);
        }
    }
}
