import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write the value of x: ");
        double x = in.nextDouble();
        if(x > 1){
            System.out.println("Write the value of n:");
            double n = in.nextDouble();
            double arcctg = 0;
            for(double i = 0;i < n; i++){
                arcctg += Math.pow(-1,i+1) / ((2*i+1) * Math.pow(x,(2*i+1)));
            }
            System.out.println("Result: "+ (arcctg + Math.PI/2));
        }
        else System.out.println("Value of x is incorrect");
        }
    }
