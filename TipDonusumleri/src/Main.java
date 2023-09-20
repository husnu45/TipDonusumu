import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner getNumber = new Scanner(System.in);

        System.out.print("Please Enter an Integer Number : ");

        int numberInt = getNumber.nextInt();

        System.out.print("Please Enter an Float Number : ");

        float numberFloat = getNumber.nextFloat();



        float intToFloat = (float)numberInt;

        int floatToInt = (int)numberFloat;

        System.out.println(intToFloat + " Integer to Float ");
        System.out.println(floatToInt + " Float to Int");






    }

}
