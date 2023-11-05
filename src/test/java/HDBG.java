import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;

public class HDBG {
    public static void main(String[] args) {
        try{
            Process process = Runtime.getRuntime().exec("C:\\Program Files (x86)\\HTTPDebuggerPro\\HTTPDebuggerUI.exe");

            Thread.sleep(5_000L);

            // если запросов не будет, то оно ничего и не сохранит, логишно?
            Robot robot = new Robot();

            int x = 125;
            int y = 108;
            robot.mouseMove(x, y);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            Thread.sleep(750L);

            x = 194;
            y = 236;
            robot.mouseMove(x, y);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            Thread.sleep(1250L);

            x = 1427;
            y = 772;
            robot.mouseMove(x, y);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            Files.delete(Path.of("X:\\httpdata.json"));
        }catch (Exception ex) {}

    }

    public static void main2(String[] args) {
        isRussianKeyboardLayout();
        try {
            // Запускаем HTTPDebuggerPro.exe
            Process process = Runtime.getRuntime().exec("C:\\Program Files (x86)\\HTTPDebuggerPro\\HTTPDebuggerUI.exe");

            Thread.sleep(5_000L);
            // Создаем объект Robot
            Robot robot = new Robot();

            // Проверяем текущий язык клавиатуры
            if (isRussianKeyboardLayout()) {
                // Если текущий язык клавиатуры - русский, переключаем на английский
                    // Нажимаем комбинацию клавиш для переключения на английский язык
                   //switchLanguage(robot);

            }

            Thread.sleep(1_500L);

            // Перемещаем указатель мыши к определенным координатам (замените на свои)
            int x = 682; // X-координата
            int y = 175; // Y-координата
            robot.mouseMove(x, y);

            // Выполняем клик
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // Левая кнопка мыши
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            // Задержка для ожидания открытия текстового поля (может потребоваться настроить)
            Thread.sleep(1000);

            // Вводим текст "https://oauth.vk.com/oauth/"
            String textToType = "oauth.vk.com/oauth/";
            for (char c : textToType.toCharArray()) {
                int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
                if (keyCode != KeyEvent.CHAR_UNDEFINED) {
                    robot.keyPress(keyCode);
                    robot.keyRelease(keyCode);
                } else {
                    System.err.println("Символ не поддерживается: " + c);
                }
            }
            // Открываем поток для записи в стандартный ввод процесса
            //BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
            //writer.write("https://oauth.vk.com/oauth/");
            //writer.flush();

            // Открываем поток для чтения из стандартного вывода процесса
            //BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            while (true) {
                // Проверяем наличие новых запросов
                //String line = reader.readLine();
                //if (line != null && line.contains("https://oauth.vk.com/oauth/")) {
                    // Выполняйте здесь действия при наличии нового запроса
                  //  String url = extractURL(line);
                    //System.out.println("Новый запрос: " + url);
               // }

                // Задержка на 1 секунду
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Метод для проверки текущего языка клавиатуры (русский или английский)
    private static boolean isRussianKeyboardLayout() {
        System.out.println(Locale.getDefault().getDisplayLanguage());
        return Locale.getDefault().getDisplayLanguage().equals("ru");
    }

    private static void switchLanguage(Robot robot) {
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_SHIFT);
    }

    // Метод для извлечения URL из строки
    private static String extractURL(String line) {
        // Реализуйте логику извлечения URL из строки
        // Например, можно использовать регулярные выражения
        return line;
    }
}
