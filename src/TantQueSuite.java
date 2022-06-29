import java.util.Scanner;

public class TantQueSuite {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int codePin=1234;

        int codePinASaisir=0;
        while (codePinASaisir!=codePin){
            System.out.print("Saisir le code PIN : ");
            codePinASaisir=input.nextInt();
            if(codePinASaisir!=codePin){
                System.out.println("Code erroné, veuillez ressayer.");
            }else{
                System.out.println("Appareil déverouillé!!!!");
            }
        }
    }
}
