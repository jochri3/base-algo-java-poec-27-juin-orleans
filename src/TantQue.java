import java.util.Scanner;

public class TantQue {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // Définir un code PIN
       int codePin=1234;

       // Demander à l'utilisateur le code PIN
        //  Tant que la valeur fournie ne correspond pas au code PIN défini
        int codePinASaisir=0;
        while (codePinASaisir!=codePin){
            System.out.print("Saisir le code PIN : ");
            codePinASaisir=input.nextInt();
        }
    }
}
