import java.util.Scanner;
public class prog5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.println(" Entrer un nombre X :");
        x = sc.nextInt();
        System.out.println(" Entrer un nombre Y :");
        y = sc.nextInt();
        int max=(x>y)? x:y;
        System.out.println(" le max entre x et y est :"+max);
    }
}
