import java.util.Scanner;

public class ZodiacSign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter your birth year: ");
        int year = input.nextInt();
        
        year %= 12;
        
        switch(year){
            case 0:
                System.out.println("Your Chinese zodiac sign is 'Monkey'.");
                break;
            case 1:
                System.out.println("Your Chinese zodiac sign is 'Rooster'.");
                break;
            case 2:
                System.out.println("Your Chinese zodiac sign is 'Dog'.");
                break;
            case 3:
                System.out.println("Your Chinese zodiac sign is 'Pig'.");
                break;
            case 4:
                System.out.println("Your Chinese zodiac sign is 'Rat'.");
                break;
            case 5:
                System.out.println("Your Chinese zodiac sign is 'Ox'.");
                break;
            case 6:
                System.out.println("Your Chinese zodiac sign is 'Tiger'.");
                break;
            case 7:
                System.out.println("Your Chinese zodiac sign is 'Rabbit'.");
                break;
            case 8:
                System.out.println("Your Chinese zodiac sign is 'Dragon'.");
                break;
            case 9:
                System.out.println("Your Chinese zodiac sign is 'Snake'.");
                break;
            case 10:
                System.out.println("Your Chinese zodiac sign is 'Horse'.");
                break;
            case 11:
                System.out.println("Your Chinese zodiac sign is 'Goat'.");
                break;
            
            default:
                System.out.println("Please check your information!");
        }
    }
}
