public class Conditions {
    public static void main(String[] args) {
        int age=12;
        // si age>= 18 alors
        //  Afficher "Vous pouvez vous inscrire à la compétition"
        // Fin si
        if(age>=18){
            System.out.println("Vous pouvez vous inscrire à la compétition");
        }else {
            System.out.println("Vous ne pouvez pas vous inscrire à la compétition");
        }

        int age2=21;
        boolean estMajeur=age2>=18;//true/false
        if(estMajeur){
            System.out.println("Vous pouvez vous inscrire à la compétition");
        }else {
            System.out.println("Vous ne pouvez pas vous inscrire à la compétition");
        }
    }
}
