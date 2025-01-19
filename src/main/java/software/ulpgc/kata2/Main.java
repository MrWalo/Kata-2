package software.ulpgc.kata2;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String url = "https://github.com/MrWalo/Resources/raw/main/IE1.csv\n";
        File path = new File("");
        String absolutePath = path.getAbsolutePath();
        String outputPath = absolutePath + "\\IE1.csv";
        CsvDownloader.downloadCsv(url, outputPath);
        List<Player> players = new FilePlayerLoader(new File(outputPath), new CsvPlayerDeserializer()).load();
        players.forEach(System.out::println);
    }
}
