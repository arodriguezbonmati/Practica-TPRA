package com.nebrija.tpra;

import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainInterfaces extends Application{
	
	static Stage Interfaz1;
	static Stage Interfaz2;
	static Stage Interfaz3;
	static Stage Interfaz4;
	static Stage Interfaz5;
	static Stage Interfaz6;
	
	public void start(Stage stage) throws Exception{
		
		Interfaz1 = new Stage();
		URL res1 = getClass().getClassLoader().getResource("IniciarSesion.fxml");
		Parent root1 = FXMLLoader.load(res1);
		Scene scene1 = new Scene(root1);
		Interfaz1.setTitle("Iniciar Sesion");
		Interfaz1.setScene(scene1);
		Interfaz1.show();
		
		Interfaz2 = new Stage();
		URL res2 = getClass().getClassLoader().getResource("MenuPrincipal.fxml");
		Parent root2 = FXMLLoader.load(res2);
		Scene scene2 = new Scene(root2);
		Interfaz2.setTitle("Iniciar Sesion");
		Interfaz2.setScene(scene2);
		 
		
		Interfaz3 = new Stage();
		URL res3 = getClass().getClassLoader().getResource("AvailableProducts.fxml");
		Parent root3 = FXMLLoader.load(res3);
		Scene scene3 = new Scene(root3);
		Interfaz3.setTitle("Available Products");
		Interfaz3.setScene(scene3);
		
		Interfaz4 = new Stage();
		URL res4 = getClass().getClassLoader().getResource("Books.fxml");
		Parent root4 = FXMLLoader.load(res4);
		Scene scene4 = new Scene(root4);
		Interfaz4.setTitle("Books");
		Interfaz4.setScene(scene4);
		
		Interfaz5 = new Stage();
		URL res5 = getClass().getClassLoader().getResource("Movies.fxml");
		Parent root5 = FXMLLoader.load(res5);
		Scene scene5 = new Scene(root5);
		Interfaz5.setTitle("Movies");
		Interfaz5.setScene(scene5);
		
		Interfaz6 = new Stage();
		URL res6 = getClass().getClassLoader().getResource("Conversor.fxml");
		Parent root6 = FXMLLoader.load(res6);
		Scene scene6 = new Scene(root6);
		Interfaz6.setTitle("Conversor");
		Interfaz6.setScene(scene6);
	}
	

	public static void main(String[] args) {
		launch(args);
		}

	

}
