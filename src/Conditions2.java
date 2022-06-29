public class Conditions2 {
    public static void main(String[] args) {

//        Sans switch case
        String langue1="fr";
        if(langue1.equals("fr")){
            System.out.println("Bonjour");
        }else if(langue1.equals("en")){
            System.out.println("Good morning");
        }else if(langue1.equals("de")){
            System.out.println("Guten morgen");
        }else if(langue1.equals("es")){
            System.out.println("Guten Holla");
        }else{
            System.out.println("Langue invalide");
        }

//        Avec switch case
        String langue2="xyz";
        switch (langue2){
            default:
                System.out.println("Langue invalide");
                break;
            case "fr":
                System.out.println("Bonjour");
                break;
            case "en":
                System.out.println("Good morning");
                break;
            case "de":
                System.out.println("Guten morgen");
                break;
            case "es":
                System.out.println("Guten Holla");
                break;
        }
    }
}
