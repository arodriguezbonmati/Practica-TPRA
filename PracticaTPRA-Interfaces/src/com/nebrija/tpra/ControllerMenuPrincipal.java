package com.nebrija.tpra;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class ControllerMenuPrincipal { 
    
	@FXML
    private Label MainMenu;

    @FXML
    private Button productsButton;

    @FXML
    private Button converterButton;
    
    @FXML
    private RadioButton radioEspaña;

    @FXML
    private RadioButton radioReinoUnido;

    @FXML
    private RadioButton radioAlemania;
    
    @FXML
    private Button exitButton;
    
    @FXML
    private ToggleGroup idioma;
    
    @FXML
    void pressedAlemania(ActionEvent event) {
    	String g = "al";
	    String t = "AL";
	    Translate.setCountry(t);
		Translate.setLanguage(g);
		Translate.translate();
		MainMenu.setText(Translate.getString45());
		productsButton.setText(Translate.getString46());
		converterButton.setText(Translate.getString47());
		exitButton.setText(Translate.getString49());
    }
    
    @FXML
    void pressedEspaña(ActionEvent event) {
    	String g = "es";
	    String t = "ES";
	    Translate.setCountry(t);
		Translate.setLanguage(g);
		Translate.translate();
		MainMenu.setText(Translate.getString45());
		productsButton.setText(Translate.getString46());
		converterButton.setText(Translate.getString47());
		exitButton.setText(Translate.getString49());
    }
    
    @FXML
    void pressedReinoUnido(ActionEvent event) {
    	String g = "en";
	    String t = "EN";
	    Translate.setCountry(t);
		Translate.setLanguage(g);
		Translate.translate();
		MainMenu.setText(Translate.getString45());
		productsButton.setText(Translate.getString46());
		converterButton.setText(Translate.getString47());
		exitButton.setText(Translate.getString49());
    }
    
    @FXML
    void exitMainMenu(ActionEvent event) {
    	MainInterfaces.Interfaz2.close();
    	MainInterfaces.Interfaz1.show();
    }

    @FXML
    void pressedConverter(ActionEvent event) {
    	MainInterfaces.Interfaz2.close();
    	MainInterfaces.Interfaz6.show();
    }

    @FXML
    void pressedProducts(ActionEvent event) {
    	MainInterfaces.Interfaz2.close();
    	MainInterfaces.Interfaz3.show();
    }
    

 
}
