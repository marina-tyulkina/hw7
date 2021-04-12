package homework7;

import homework7.entity.Weather;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseRepository {
    private static final String DB_NAME = "geekbrains.db";
    String insertWeather = "insert  into weather (city, localdate, temperature, weather_text) values (?, ?, ?, ?)";

    static {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public boolean saveWeatherData(Weather weather) throws SQLException {
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:geekbrains.db")) {
            PreparedStatement saveWeather = connection.prepareStatement(insertWeather);
            saveWeather.setString(1, weather.getCity());
            saveWeather.setString(2, weather.getLocalDate());
            saveWeather.setDouble(3, weather.getTemperature());
            saveWeather.setString(4, weather.getWeatherText());
            return saveWeather.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        throw new SQLException("Сохранение погоды в базу данных не выполнено!");
    }


    public static void main(String[] args) throws SQLException {
        DataBaseRepository dataBaseRepository = new DataBaseRepository();
        dataBaseRepository.saveWeatherData(
                new Weather("Moscow", "12.12.12", 0.3, "Хорошая"));
    }
}
