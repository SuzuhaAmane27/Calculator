import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String Operation = scanner.nextLine();
    String[] elements = Operation.split(" ");
    int FirstNumber = 0;
    int SecondNumber = 0;
    TypeOfNumbers type;




    try {
         FirstNumber = Integer.parseInt(elements[0]);
         type = TypeOfNumbers.ARABIC;
    } catch (NumberFormatException  e){
        FirstNumber = Romanian.getArabianValue(String.valueOf(elements[0].charAt(0)));
        type = TypeOfNumbers.ROMAN;
        System.out.println(FirstNumber);
    }
    try {
         SecondNumber = Integer.parseInt(elements[2]);
    } catch (Exception e){
         SecondNumber = Romanian.getArabianValue(elements[2]);
        System.out.println(SecondNumber);
    }
    String token = elements[1];




        System.out.println(FirstNumber + " " + SecondNumber);
    }

}