package com.nebrija.tpra;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class ControllerAvailableProducts {
	
	@FXML
    private Label availableProducts;

    @FXML
    private Button lableBooks;

    @FXML
    private Button labelMovies;

    @FXML
    private Button exitButton;

    @FXML
    private RadioButton radioEspaña;

    @FXML
    private ToggleGroup botonIdiomas;

    @FXML
    private RadioButton radioReinoUnido;

    @FXML
    private RadioButton radioAlemania;
    
    @FXML
    void pressedAlemania(ActionEvent event) {
    	String g = "al";
	    String t = "AL";
	    Translate.setCountry(t);
		Translate.setLanguage(g);
		Translate.translate();
		availableProducts.setText(Translate.getString48());
		lableBooks.setText(Translate.getString10());
		labelMovies.setText(Translate.getString11());
		exitButton.setText(Translate.getString49());
    }
    
    @FXML
    void pressedEspaña(ActionEvent event) {
    	String g = "es";
	    String t = "ES";
	    Translate.setCountry(t);
		Translate.setLanguage(g);
		Translate.translate();
		availableProducts.setText(Translate.getString48());
		lableBooks.setText(Translate.getString10());
		labelMovies.setText(Translate.getString11());
		exitButton.setText(Translate.getString49());
    }
    
    @FXML
    void pressedReinoUnido(ActionEvent event) {
    	String g = "en";
	    String t = "EN";
	    Translate.setCountry(t);
		Translate.setLanguage(g);
		Translate.translate();
		availableProducts.setText(Translate.getString48());
		lableBooks.setText(Translate.getString10());
		labelMovies.setText(Translate.getString11());
		exitButton.setText(Translate.getString49());
    }
    
    @FXML
    void exitAvailableProducts(ActionEvent event) {
    	MainInterfaces.Interfaz3.close();
    	MainInterfaces.Interfaz2.show();
    }

    @FXML
    void pressedBooks(ActionEvent event) {
    	MainInterfaces.Interfaz3.close();
    	MainInterfaces.Interfaz4.show();
    }

    @FXML
    void pressedMovies(ActionEvent event) {
    	MainInterfaces.Interfaz3.close();
    	MainInterfaces.Interfaz5.show();
    }

} 

