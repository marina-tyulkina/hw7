package homework7;

import java.io.IOException;
import java.util.Scanner;

public class UserIntefaceView {
    Controller controller = new Controller();

    public void runInterface() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите название города");
            String city = scanner.nextLine();

            System.out.println("Введите 1 для получения текущей погоды, " +
                    "введите 2 для получения прогноза погоды на 5 дней, для выхода введите \"выход\"");

            String command = scanner.nextLine();

            try {
                controller.getWeather(command, city);
            } catch (IOException e) {
                e.printStackTrace();
                continue;
            }
        }
    }

    public void checkUserInput(String userInput) {
        //TODO: задание со звездочкой - обработать ввод пользователя (выбросить эксепш и прервать выполнение, либо предложить
        // пользователю попробовать снова)
    }
}
