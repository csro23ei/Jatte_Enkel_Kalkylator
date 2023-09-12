import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Räknare
{
    public static void main(String[] args) 
    {
        // operatoret för vilka tall csom ska sättas ihop
        int operator, n1, n2;

        // alternativ med deras reg-kod
        System.out.println("1- adera /n 2 - subtraktion n/ 3- dividera /n 4- multiplicera /5- Pytagoras_sats");
        System.out.println("Vad vill du göra?");
        // läser in vall
        Scanner sc = new Scanner(System.in);
        operator =sc.nextInt();

        
        // leser in första talet
        System.out.println("Ange första talet");
        n1 = sc.nextInt();
        
        //leser in andra talet
        System.out.println("Ange andra talet");
        n2 = sc.nextInt();

        // resultatet
        double result = 0;
        // hur den ska räkna addition eller subration o.s.v
        switch (operator)
        {
            
            case 1:
             result= n1 + n2;
             
             break;

            case 2:
             result= n1 - n2;
             break;
            
            case 3:
             result= n1 / n2;
             break;
            
            case 4:
             result= n1 * n2;
             break;
            case 5:
            result= Math.sqrt(Math.pow(n1, 2) + Math.pow(n2, 2));
            break;


            

        }
        // skriver ut resultatet

        System.out.println("Resultatet är : " + result);

    }
}