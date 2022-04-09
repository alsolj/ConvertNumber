import java.util.Scanner;

public class ConvertNumber {
    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Для перевода числа из 10-ой СС в 16-ую СС введите 16, из 10-ой СС в 2-ую СС введите 2, из 2-ой сс в 10-ую СС введите 10.");

            int numberToChoose;
            if (scanner.hasNextInt()) {
                numberToChoose = scanner.nextInt();
            } else {
                System.out.println("Введено не число. Попробуйте заново.");
                continue;
            }

            System.out.println("Введите число от 0 до 10000 или число в 2-ой СС.");

            int number = -1;
            long numberBinary = -1l;
            if (scanner.hasNextInt(10) | scanner.hasNextLong(2)) {

                if (numberToChoose == 16 | numberToChoose == 2) {
                    number = scanner.nextInt(10);
                } else if (numberToChoose == 10) {
                    numberBinary = scanner.nextLong(2);
                } else {
                    System.out.println("Нельзя перевести число в данную систему счисления.");
                    continue;
                }

            } else {
                System.out.println("Введено не число. Попробуйте заново.");
                continue;
            }

            if (number >= 0 & number < 10000 | numberBinary >= 0b0 & numberBinary < 0b10011100010000) {

                if (numberToChoose == 16) {
                    String convertToHex = Integer.toHexString(number);
                    System.out.println("Число в 16-ой СС" + " = " + convertToHex + ".");
                } else if (numberToChoose == 2) {
                    String convertToBinary = Integer.toBinaryString(number);
                    System.out.println("Число в 2-ой СС" + " = " + convertToBinary + ".");
                } else if (numberToChoose == 10) {
                    long numberDecimal = Long.parseLong(Long.toBinaryString(numberBinary), 2);
                    System.out.println("Число в 10-ой СС" + " = " + numberDecimal + ".");
                }

            } else {
                System.out.println("Число не входит в допустимый диапазон.");
            }

            System.out.println("Для завершения работы введите 1, для продолжения работы любую цифру отличную от 1 или букву.");

            if (scanner.hasNextInt()) {
                int numberBreak = scanner.nextInt();

                if (numberBreak == 1) {
                    break;
                }
            }
        }
    }
}
