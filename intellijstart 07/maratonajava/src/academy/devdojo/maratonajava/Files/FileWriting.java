package academy.devdojo.maratonajava.Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⠤⢤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⢀⠎⠀⠀⠀⠘⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ \n" +
                    "⠀⠀⠀⠀⠀⠀⢠⣾⡖⢦⣰⣿⢲⠸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ \n" +
                    "⠀⠀⠀⠀⠀⠀⢨⠻⢷⣟⠙⠿⠞⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ \n" +
                    "⠀⠀⠀⠀⠀⠀⢸⠦⠤⠷⠶⠶⠂⠀⢸⠀⠀⠀⠀⠀⠀⢀⢀⠀⠀⠀⠀⠀⠀⠀ \n" +
                    "⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⡆⡄⢸⠀⠀⠀⠀⠀⢠⠃⢸⠀⠀⠀⠀⠀⠀⠀ \n" +
                    "⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⡇⡇⢸⣇⡀⠀⠀⡠⠁⢠⠃⠀⠀⠀⠀⠀⠀⠀ \n" +
                    "⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⣸⠃⢻⠈⠈⠉⢙⣳⣥⣄⣀⠔⠀⠀⠀⠀⠀⠀⠀ \n" +
                    "⠀⠀⠀⠀⠀⠀⠸⡆⠀⠀⠰⣧⣶⠌⠂⠀⠀⠉⠁⠀⠀⠉⠳⡄⠀⠀⠀⠀⠀⠀ \n" +
                    "⠀⠀⠀⠀⠀⠀⠀⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀ \n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠹⢦⣀⣀⣀⡀⠀⢀⣀⣀⡀⠀⢀⣀⡠⠚⠀⠀⠀⠀⠀⠀⠀ \n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠉⡹⠉⠉⠉⠉⢉⠇⢠⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ \n" +
                    "⠀⠀⠀⠀⠀⠀⠰⡉⠑⠁⢠⠃⠀⠀⣟⠓⠋⢠⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ \n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠈⠛⠒⠁⠀⠀⠀⠈⠓⠒⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ \n");
            fw.flush();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
