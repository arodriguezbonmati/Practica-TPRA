package com.nebrija.tpra;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ControllerAvailableProducts {
	
	@FXML
    private Label availableProducts;

    @FXML
    private Button lableBooks;

    @FXML
    private Button labelMovies;
    
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

	protected Button getLableBooks() {
		return lableBooks;
	}

	protected Button getLabelMovies() {
		return labelMovies;
	}

	protected void setLableBooks(Button lableBooks) {
		this.lableBooks = lableBooks;
	}

	protected void setLabelMovies(Button labelMovies) {
		this.labelMovies = labelMovies;
	}

}

