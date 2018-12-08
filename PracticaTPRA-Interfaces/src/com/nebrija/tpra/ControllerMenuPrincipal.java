package com.nebrija.tpra;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ControllerMenuPrincipal {
    
	@FXML
    private static Label MainMenu;

    @FXML
    private static Button productsButton;

    @FXML
    private static Button converterButton;
    
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

	public static Label getMainMenu() {
		return MainMenu;
	}

	public static Button getProductsButton() {
		return productsButton;
	}

	public static Button getConverterButton() {
		return converterButton;
	}

	public static void setMainMenu(Label mainMenu) {
		MainMenu = mainMenu;
	}

	public static void setProductsButton(Button productsButton) {
		productsButton = productsButton;
	}

	public static void setConverterButton(Button converterButton) {
		converterButton = converterButton;
	}

}
