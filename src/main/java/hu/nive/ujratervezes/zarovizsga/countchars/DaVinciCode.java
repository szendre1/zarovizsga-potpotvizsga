package hu.nive.ujratervezes.zarovizsga.countchars;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DaVinciCode {


    public int decode(String input, char character) {
        if (!"01x".contains(Character.toString(character))){
              throw new IllegalArgumentException("Bad parameter");
        }

        Path file = Path.of(input);
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            String line;
            int counter=0;
            while((line = reader.readLine()) != null) {
                for (int ch: line.toCharArray()) {
                    if (ch==character){
                        counter++;
                    }
                }
            }
            return counter;
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }



    }
}
