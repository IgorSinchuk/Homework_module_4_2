import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    public class Weather {
        public static void main (String[] args) throws NumberFormatException, IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Конвертация прогноза погоды. Введите значение: ");
            int celsius = Integer.parseInt(reader.readLine());
            System.out.println("Сейчас " + fromCelsiusToFahrenheit(celsius) + " градуса(ов) по Фаренгейту");

            System.out.println("А теперь в градусах по Цельсию");
            int fahrenheit = Integer.parseInt(reader.readLine());
            System.out.println("Сейчас " + fromFahrenheitToCelsius(fahrenheit) + " градуса(ов) по Цельсию");

        }

        public static int fromCelsiusToFahrenheit(int c){
            int fahrenheit = (int) (c *1.8 +32);
            return fahrenheit;
        }
        public static int fromFahrenheitToCelsius (int f){
            int celsius = (int) ((f-32)/1.8);
            return celsius;
        }


    }



