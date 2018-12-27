package com.nebrija.tpra;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class ControllerConversor {

	  @FXML
	    private Label converterlabel;

	    @FXML
	    private TextField numeroEuros;

	    @FXML
	    private TextField calculado;

	    @FXML
	    private Label moneda;

	    @FXML
	    private Button exitButton;

	    @FXML
	    private ToggleGroup radioCurrency;

	    @FXML
	    private RadioButton radioEspaña;

	    @FXML
	    private ToggleGroup botonIdiom;

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
			converterlabel.setText(Translate.getString47());
			exitButton.setText(Translate.getString49());
	    }

	    @FXML
	    void pressedEspaña(ActionEvent event) {
	    	String g = "es";
		    String t = "ES";
		    Translate.setCountry(t);
			Translate.setLanguage(g);
			Translate.translate();
			converterlabel.setText(Translate.getString47());
			exitButton.setText(Translate.getString49());
	    }

	    @FXML
	    void pressedReinoUnido(ActionEvent event) {
	    	String g = "en";
		    String t = "EN";
		    Translate.setCountry(t);
			Translate.setLanguage(g);
			Translate.translate();
			converterlabel.setText(Translate.getString47());
			exitButton.setText(Translate.getString49());
	    }
    
    @FXML
    void exitConverter(ActionEvent event) {
    	MainInterfaces.Interfaz6.close();
    	MainInterfaces.Interfaz2.show();
    }

    
    @FXML
    void radioDolar(ActionEvent event) {
    	String cantidad =numeroEuros.getText();
    	int intCantidad = Integer.parseInt(cantidad);
    	double dolares = intCantidad*1.14;
    	String dolares1 = String.valueOf(dolares);
    	calculado.setText(dolares1);
    	moneda.setText("$");
    }

    @FXML
    void radioLibra(ActionEvent event) {
    	String cantidad =numeroEuros.getText();
    	int intCantidad = Integer.parseInt(cantidad);
    	double libras = intCantidad*0.89;
    	String libras1 = String.valueOf(libras);
    	calculado.setText(libras1);
		moneda.setText("£");
    }

    @FXML
    void radioYen(ActionEvent event) {
    	String cantidad =numeroEuros.getText();
    	int intCantidad = Integer.parseInt(cantidad);
    	double yenes = intCantidad*128.33;
    	String yenes1 = String.valueOf(yenes);
    	calculado.setText(yenes1);
		moneda.setText("¥");
    }
}
