import java.util.Scanner;
public class prog1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer une chaine de caractere :");
        String str = sc.nextLine();
        System.out.println(" Entrer un nombre :");
        int nombre = sc.nextInt();
   
        System.out.println(" votre nombre est :"+ nombre);
        System.out.println(" la chaine saisie est :"+ str);
    }
    
}
