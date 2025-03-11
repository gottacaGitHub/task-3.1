import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя первого пользователя:");
        String firstName= scanner.nextLine();
        System.out.println("Введите возраст первого пользователя:");
        Integer firstAge = scanner.nextInt();
        scanner.nextLine();

        User user1 = new User(firstName, firstAge);

        System.out.println("Введите имя второго пользователя:");
        String secondName = scanner.nextLine();
        System.out.println("Введите возраст второго пользователя:");
        Integer secondAge = scanner.nextInt();

        User user2 = new User(secondName, secondAge);

        if (user1.getAge() < user2.getAge()) {
            System.out.println(user1);
        } else {
            System.out.println(user2);
        }

        scanner.close();
    }
}
