import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give me a number : ");
        int number = scanner.nextInt();
        //String isTrue = (((number%5)==0) || ((number%3)==0)) ? "true": "false";
        String output = "";

        switch (number%5){

            case 0 :
                output = "Fizz";
                break;
            default:
                break;
        }

        switch (number%3){

            case 0 :
                output += "Buzz";
                break;
            default:
                break;
        }
        switch (output){

            case "" :
                System.out.println(number);
                break;
            default:
                System.out.println(output);
                break;
        }




    }
}