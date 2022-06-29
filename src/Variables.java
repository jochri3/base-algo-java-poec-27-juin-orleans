public class Variables {
    public static void main(String[] args){
        int longueur=200;
        int largeur=50;
        int perimetre=2*(longueur+largeur);
        int surface=longueur*largeur;
        System.out.println(perimetre);
        System.out.println(surface);


//        Chaine de caractères
        String prenom="Christian";
        String nom="Lisangola";
        int age=15;
        String pays="Italie";
        System.out.println("Je suis "+prenom+" "+nom+",j'ai "+age+" ans.Je suis né en "+pays);
        System.out.printf("Je suis %s %s,j'ai %d ans.Je suis né en %s.\n",prenom,nom,age,
                pays);
//        Caractère
        char genre='m';

//
        float prixUht=15.5F;
        double PI = 3.14;

        int pause=10;
    }
}

/*
*  longueur=10
*  largeur=5
*  surface = longueur * largeur;
*  surface = ? => 50
*  longueur=20;
*  surface = ?=> 20*10
* */
