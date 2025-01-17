package software.ulpgc.kata2;

import java.io.File;
import java.io.IOException;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("E:/UNI/Tercero de Carrera/IS2/Katas/Dataset/IE1.csv");
        List<Player> players = new FilePlayerLoader(file, new CsvPlayerDeserializer()).load();

        for (Player player : players) {
            System.out.println(player);

        }

    }
}
