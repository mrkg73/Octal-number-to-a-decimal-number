import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {


        System.out.print ("Enter your number please: ");
        Scanner sc = new Scanner(System.in);

        int num= sc.nextInt();
        int count=0,result=0;


        while(num !=0)
        {
            result +=(num%10) * (int)Math.pow(8,count);
            num/=10; count +=1;
        }
        System.out.println(result);
    }
    }

