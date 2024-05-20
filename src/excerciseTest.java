import java.util.Scanner;

public class excerciseTest {
    public static void main(String[] args) {

        // question: write a program that sorts the 3 entered numbers "from least to greater"

        // tr: girilen 3 sayıyı küçükten büyüğe sıralayan program yazınız
        // sayılardan en az 2si aynı olursa hatalı giriş uyarısı versin

        int a,b,c;
        Scanner input= new Scanner(System.in);
        System.out.println("üç farklı tam sayı giriniz: ");

        System.out.print("birinci sayı(a): ");
        a= input.nextInt();

        System.out.print("ikinci sayıyı giriniz(b): ");
        b= input.nextInt();

        System.out.print("üçüncü sayıyı giriniz(c): ");
        c= input.nextInt();

        if ((a<b) && (a<c)){
            if (b<c){
                System.out.println("a<b<c");
            }else
                System.out.println("a<c<b");
        } else if ((b<a) && (b<c)) {
            if (a>c){
                System.out.println("b<c<a");
            }else
                System.out.println("b<a<c");
            
        } else if ((c<a) && (c<b)) {
            if (a<b){
                System.out.println("c<a<b");
            }else
                System.out.println("c<b<a");
        } else {
            System.out.println("hatalı giriş yaptınız. lütfen farklı tam sayı giriniz");
        }


    }
}
