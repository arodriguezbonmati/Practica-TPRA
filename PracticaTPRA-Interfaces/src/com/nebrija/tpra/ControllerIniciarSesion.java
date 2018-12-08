package com.nebrija.tpra;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class ControllerIniciarSesion {

	@FXML
    private Label titleText;
	
    @FXML
    private Label usernameText;

    @FXML
    private Label emailText;

    @FXML
    private Label passwordText;

    @FXML
    private TextField usernameField;

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button enterButton;

    @FXML
    private RadioButton radioEspaña;

    @FXML
    private ToggleGroup botonIdioma;

    @FXML
    private RadioButton radioReinoUnido;

    @FXML
    private RadioButton radioAlemania;
    
    @FXML
    private Button exitIniciarSesion;

    @FXML
    void exitIniciarSesion(ActionEvent event) {
    	MainInterfaces.Interfaz1.close();
    }
    
    @FXML
    void pressedButtonEnter(ActionEvent event) {
    	String username = usernameField.getText();
    	String email = emailField.getText();
    	String password = passwordField.getText();
    	
    	if(username.equals(User.getUsername()) && email.equals(User.getEmail()) && password.equals(User.getPassword())) {
    		MainInterfaces.Interfaz1.close();
    		MainInterfaces.Interfaz2.show();
    		
    	}else
    		MainInterfaces.Interfaz1.show();
    }
    
    
    @FXML
    void pressedAlemania(ActionEvent event) {
    	String g = "al";
	    String t = "AL";
	    Translate.setCountry(t);
		Translate.setLanguage(g);
		Translate.translate();
		titleText.setText(Translate.getString40());
		usernameText.setText(Translate.getString41());
		emailText.setText(Translate.getString42());
		passwordText.setText(Translate.getString43());
		enterButton.setText(Translate.getString44());
		exitIniciarSesion.setText(Translate.getString49());
		
		
    }
    
    @FXML
    void pressedEspaña(ActionEvent event) {
    	String g = "es";
	    String t = "ES";
	    Translate.setCountry(t);
		Translate.setLanguage(g);
		Translate.translate();
		titleText.setText(Translate.getString40());
		usernameText.setText(Translate.getString41());
		emailText.setText(Translate.getString42());
		passwordText.setText(Translate.getString43());
		enterButton.setText(Translate.getString44());
		exitIniciarSesion.setText(Translate.getString49());
		
    }

    @FXML
    void pressedReinoUnido(ActionEvent event) {
    	String g = "en";
	    String t = "EN";
	    Translate.setCountry(t);
		Translate.setLanguage(g);
		Translate.translate();
		titleText.setText(Translate.getString40());
		usernameText.setText(Translate.getString41());
		emailText.setText(Translate.getString42());
		passwordText.setText(Translate.getString43());
		enterButton.setText(Translate.getString44());
		exitIniciarSesion.setText(Translate.getString49());
    }

}
