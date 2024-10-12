import java.util.Scanner;
public class prog3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int CC,TP,EE,SUM;
        System.out.println(" Entrer votre note de CC :");
        CC = sc.nextInt();
        System.out.println("Entrer votre note de TP :");
        TP = sc.nextInt();
        System.out.println(" Entrer votre note de EE :");
        EE =  sc.nextInt();
        SUM = CC+TP+EE;
        if(SUM<100 && SUM >=80)
            System.out.println(" Votre grade est A ");
        else if(SUM<80 && SUM>75)
            System.out.println(" Votre grade est :B+");
        else if(SUM<75 && SUM>70)
            System.out.println(" Votre grade est :B");
        else if(SUM<70 && SUM>65)
            System.out.println(" Votre grade est :B-");
        else if(SUM<65 && SUM>60)
            System.out.println(" Votre grade est :C+");
        else if(SUM<60 && SUM>55)
            System.out.println(" Votre grade est :C");
        else if(SUM<55 && SUM>50)
            System.out.println(" Votre grade est :C-");
        else if(SUM<50 && SUM>35)
            System.out.println(" Votre grade est :D");
        else if(SUM<35 && SUM>20)
            System.out.println(" Votre grade est :E");
        else if(SUM<20 && SUM>00)
            System.out.println(" Votre grade est :F");
        else
            System.out.println("Vous n'avez pas composer! ");
    }
}
