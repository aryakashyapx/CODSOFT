//NUMBER GAME
import java.util.Scanner;
import java.util.Random;
class guessno{
    static boolean j=false;
    private int a;
   static int i=0;
    private int b;
    public guessno(){
        Random r=new Random();
        b=r.nextInt(100);
    }
    public void userinp(){
        Scanner sc=new Scanner(System.in);
        System.out.println("guess the number btw 0-100");

        a=sc.nextInt();
    }
    public void check(){
        if(a==b){
            System.out.println("correct no");
            j=true;
            i++;
        } else if (Math.abs(a-b)>10) {
            System.out.println("far away");
            i++;
            
        }
        else {
            System.out.println("too close");
            i++;
        }
        System.out.println("no of try"+i);
    }

}

public class numbergame {
    public static void main(String[] args) {
        guessno jas=new guessno();
 
        while (!jas.j){

            jas.userinp();
            jas.check();
           System.out.println("enter 1  if want to exit and 2 to continue");
           Scanner sc=new Scanner(System.in);
           int b=sc.nextInt();
            if(b==1){
                jas.j=true;
            } else if (b==2) {
                continue;

            }
            else {
                System.out.println("wrong input consider as continue");
            }


        }
    }
}
