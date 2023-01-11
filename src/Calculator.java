import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) throws Exception {

        Calculator.start();

        Scanner scanner = new Scanner(System.in);
        String Operation = scanner.nextLine();
        String[] elements = Operation.split(" ");
        if (elements.length > 3){
            throw new Exception("Операции выполняются только над двумя числами!");
        }
        int firstNumber = 0;
        int secondNumber = 0;
        TypeOfNumbers firstType;
        int result = 0;
        TypeOfNumbers secondType;


        try {
            firstNumber = Integer.parseInt(elements[0]);
            firstType = TypeOfNumbers.ARABIC;
            if ((firstNumber < 0) || (firstNumber > 10)) {
                throw new Exception("Введеные числа не удовлетворяют условию!");
            }
        } catch (NumberFormatException e) {
            firstNumber = Converters.romanToInt(elements[0]);

            if ((firstNumber < 0) || (firstNumber > 10)) {
                throw new Exception("Введеные числа не удовлетворяют условию!");
            }
            firstType = TypeOfNumbers.ROMAN;
        }

        try {
            secondNumber = Integer.parseInt(elements[2]);
            if ((secondNumber < 0) || (secondNumber > 10)) {
                throw new Exception("Введеные числа не удовлетворяют условию!");
            }
            secondType = TypeOfNumbers.ARABIC;
        } catch (Exception e) {
            secondNumber = Converters.romanToInt(elements[2]);
            if ((secondNumber < 0) || (secondNumber > 10)) {
                throw new Exception("Введеные числа не удовлетворяют условию!");
            }
            secondType = TypeOfNumbers.ROMAN;
        }

        if (firstType != secondType) {
            throw new Exception("Числа разных типов!");
        }


        String token = elements[1];
        switch (token) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
            default:
                throw new Exception("Операции могут быть только: \"+, -, *, /\" ");
        }


        if ((firstType == TypeOfNumbers.ROMAN) && (secondType == TypeOfNumbers.ROMAN)) {
            if (result < 0) {
                throw new Exception("Римское число не может быть меньше 0!");
            }
            System.out.println(Converters.toRoman(result));
        } else System.out.println(result);

    }

    public static void start() {
        System.out.println("Добро пожаловать в мой целочисленный калькулятор!");
        System.out.println("Он умеет выполнять операции с арабскими и римскими числами! (только с одним типом чисел одновременно)");
        System.out.println("Введеные числа должны быть в диапозоне от 1 до 10 включительно.");
        System.out.println("Выражение вводится в строку. Между числами и знаком должен быть пробел!");
        System.out.println("Введите выражение...");
    }


}