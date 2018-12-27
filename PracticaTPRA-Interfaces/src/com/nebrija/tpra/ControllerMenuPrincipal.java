package com.nebrija.tpra;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ControllerMenuPrincipal { 
    
	@FXML
    public static Label MainMenu;

    @FXML
    public static Button productsButton;

    @FXML
    public static Button converterButton;
    
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
