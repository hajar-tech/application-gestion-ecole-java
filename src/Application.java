import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
      //objects
        Classe classe=new Classe();
        Apprenant apprenant=new Apprenant();
        Formateur formateur = new Formateur();
        Scanner scanner = new Scanner(System.in);
    //menu principale
        int choix=0;
    do {
        System.out.println("*********** Menu Principale ************");
        System.out.println("1: Gestion des Classes ");
        System.out.println("2: Gestion des Formateurs");
        System.out.println("3: Gestion des Apprenants");
        System.out.println("4: Quitter le programme");
        System.out.println("entrer votre choix : ");
        try {
        choix = scanner.nextInt();
        switch (choix){
            case 1:
                int choix1=0;
                do {
                System.out.println("------- menu gestion des classes ---------");
                System.out.println("1:Créer un classe ");
                System.out.println("2:Afficher un class ");
                System.out.println("3:Modifier un class ");
                System.out.println("4:Supprimer un class ");
                System.out.println("5:Quitter");

                    System.out.println("entrer votre choix : ");
                    try {
                    choix1 = scanner.nextInt();
                switch (choix1){
                    case 1:
                        classe.CreerClasse();
                        break;
                    case 2:
                        classe.AfficherClasse();
                        break;
                    case 3:
                        classe.ModifierClass();
                        break;
                    case 4:
                        classe.SupprimerClasse();
                        break;
                    case 5:
                        break;
                }}catch (InputMismatchException e){
                        System.out.println("Error: that was not a number!!");
                    }
                }while (choix1!=5);

                break;
            case 2:
                int choix2=0;
                do {
                    System.out.println("------- menu gestion des Formateurs ---------");
                    System.out.println("1:Ajouter un formateur ");
                    System.out.println("2:Afficher un formateur ");
                    System.out.println("3:Modifier un formateur ");
                    System.out.println("4:Supprimer un formateur");
                    System.out.println("5:Associer un formateur ");
                    System.out.println("6:Quitter");

                    System.out.println("entrer votre choix : ");
                    try {
                        choix2 = scanner.nextInt();
                        switch (choix2) {
                            case 1:
                                formateur.Ajouter();
                                break;
                            case 2:
                                formateur.Afficher();
                                break;
                            case 3:
                                formateur.Modifier();
                                break;
                            case 4:
                                formateur.Supprimer();
                                break;
                            case 5:
                                formateur.Associer(Classe.classes);
                                break;
                            case 6:
                                break;
                        }
                    }catch (InputMismatchException e){
                        System.out.println("Error: that was not a number!!");
                    }
                }while (choix2!=6);
                break;
            case 3:
                int choix3=0;
                do {
                    System.out.println("------- menu gestion des Apprenants ---------");
                    System.out.println("1:Ajouter un Appranant ");
                    System.out.println("2:Afficher un Appranant");
                    System.out.println("3:Modifier un Appranant ");
                    System.out.println("4:Supprimer un Appranant  ");
                    System.out.println("5:Associer un Appranant ");
                    System.out.println("6:Quitter");

                    System.out.println("entrer votre choix : ");
                    try {
                    choix3 = scanner.nextInt();
                    switch (choix3){
                        case 1:
                            apprenant.Ajouter();
                            break;
                        case 2:
                            apprenant.Afficher();
                            break;
                        case 3:
                            apprenant.Modifier();
                            break;
                        case 4:
                            apprenant.Supprimer();
                            break;
                        case 5:
                            apprenant.Associer(Classe.classes);
                            break;
                        case 6:
                            break;
                    }}catch (InputMismatchException e){
                        System.out.println("Error: that was not a number!!");
                    }
                }while (choix3!=6);
                break;
            case 4:
                break;
            default:
                System.out.println("choisir un nombre de menu!!");
        }}catch (InputMismatchException e){
            System.out.println("Error: that was not a number!!");
        }
    } while (choix != 4);


    }
    }
