package ex3_tema;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author Gaby
 * @version 1
 * @since 2024
 */
public class MainApp {
    public static List<Mobilier> citire() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            File file = new File("C:/Users/Gaby/IdeaProjects/Laborator5_Maven/src/main/java/ex3_tema/mobilier.json");
            return mapper.readValue(file, new TypeReference<List<Mobilier>>() {});
        } catch (StreamReadException | DatabindException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
        List<Mobilier> mobiliere=citire();
        for(Mobilier mobilier:mobiliere) {
            System.out.println(mobilier.getNume());
            for(Placa placa:mobilier.getPlaci()){
                System.out.println(placa.toString());
                System.out.println("Numar coli estimativ:  "+(placa.getArieTotala()/5796000 + 1));
            }
        }
    }
}
