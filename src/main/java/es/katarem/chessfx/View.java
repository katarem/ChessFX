package es.katarem.chessfx;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.GridPane;

public class View extends GridPane{
    
    public View(){
        super();
        try {
            FXMLLoader f = new FXMLLoader(new URL("/tablero.fxml"));
            f.load();
        } catch (MalformedURLException e) {
            System.out.println("No se ha podido cargar el archivo");
        } catch(IOException e){
            System.out.println("Error al cargar");
        }

    }

}
