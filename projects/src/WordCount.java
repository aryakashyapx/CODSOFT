import java.util.Scanner;

public class WordCount {

    static int wordcount(String string)
    {


        String[] wordArray = string.trim().split(" ");
        int wordCount = wordArray.length;

        return wordCount;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int j=1;
        while(j==1){

        Scanner sca =new Scanner(System.in);
        System.out.println("enter the text for counting no of words");
        String string = sca.nextLine();
        System.out.print("total no of words ");
        System.out.println(wordcount(string) );
            System.out.println("enter 1 to continue and 2 to exit");
             j= sc.nextByte();
             if(j==1){
                 continue;
             }
             else {
                 j=2;
             }
    }
}}