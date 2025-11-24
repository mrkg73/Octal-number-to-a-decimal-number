import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {


        System.out.print ("Enter your number please: ");
        Scanner sc = new Scanner(System.in);
        String nam= sc.nextLine();
        int size=nam.length();

            int result=0, count=0;
        for (int i=size-1; i>=0;i--){
            result +=(nam.charAt(i)-'0') * (int)Math.pow(8,count);
            count +=1;}

        System.out.println(result);
    }
    }

