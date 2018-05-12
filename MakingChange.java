import static java.lang.System.out;
import java.util.Scanner;


public class MakingChange {
    static int quar = 0;
    static int dime = 0;
    static int nick = 0;
    static int pen = 0;

    public static int quarters(int current){
        quar = current / 25;
        current = current - (quar * 25);
        return current;
    }

    public static int dimes(int current){
        dime = current / 10;
        current = current - (dime * 10);
        return current;
    }

    public static int nickels(int current){
        nick = current / 5;
        current = current - (nick *5);
        return current;
    }

    public static void pennies(int current){
        pen = current;
    }

    public static void concant(String coin){
        if(coin=="D"){
            if(quar >0 && (nick>0 || pen>0)){
                out.print(", "); // ,
            } else if(quar >0 && (nick==0 && pen==0)){
                out.print(" and ");
            }

        }else if(coin=="N"){
            if((quar>0 || dime>0) && pen>0){
                out.print(", ");
            }
            else if((quar>0 || dime>0) && pen==0){
                out.print(" and ");
            }
            else if((quar>0 && dime>0) && pen==0){
                out.print(", and ");
            }

        }else if(coin=="P"){
            if((quar>0 && dime>0) || (quar>0&&nick>0)){
                out.print(", and ");
            }
            else if(quar>0 || dime>0 || nick>0){
                out.print(" and ");
            }
        }
    }

    public static void main(String[] args) {

        int amount = 0; // original value
        int current = amount; // value

        Scanner keyboard = new Scanner(System.in);

        out.println("Please enter a value: ");
        amount = keyboard.nextInt();
        current = amount;

        current = quarters(current);

        current = dimes(current);
        current = nickels(current);
        pennies(current);

        out.print("You entered a value of " + amount + " Your change would be: ");
        if (quar == 1){
            out.print(quar + " quarter");
        }
        else if(quar > 1){
            out.print(quar + " quarters");
        }

        if(dime>0) {
            concant("D");
        }
        if(dime == 1) {
            out.print(dime + " dime");
        }
        else if(dime > 1) {
            out.print(dime + " dimes");
            }

        if(nick>0) {
            concant("N");
        }
        if(nick == 1){
            out.print(nick + " nickel");
        }
        else if(nick > 1){
            out.print(nick + " nickels");
        }

        if(pen>0){
            concant("P");
        }

        if(pen == 1) {
            out.print(pen + " penny");
        }
        else if(pen > 1) {
            out.print(pen + " pennies");
        }
   }
}
