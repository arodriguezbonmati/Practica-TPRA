package com.nebrija.tpra;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;

public class ControllerBooks {

    @FXML
    private Label availableBooksTitle;

    @FXML
    private RadioButton LordRings;

    @FXML
    private ToggleGroup books;

    @FXML
    private Label ringsStock;

    @FXML
    private RadioButton VinciCode;

    @FXML
    private Label vinciStock;

    @FXML
    private RadioButton ThinkJava;

    @FXML
    private Label javaStock;

    @FXML
    private RadioButton Hobbit;

    @FXML
    private Label hobbitStock;

    @FXML
    private RadioButton Sawyer;

    @FXML
    private Label sawyerStock;

    @FXML
    private Label Selectonebook;

    @FXML
    private Button exitBooks;

    @FXML
    void pressedExit(ActionEvent event) {
    	MainInterfaces.Interfaz4.close();
    	MainInterfaces.Interfaz3.show();
    }

    @FXML
    void radioHobbit(ActionEvent event) {
    	int stockHobbit = Book.book4.getBook_stock();
    	stockHobbit--;
    	String stringstockHobbit = Integer.toString(stockHobbit);
    	hobbitStock.setText("Stock: "+stringstockHobbit);
    	
    }

    @FXML
    void radioJava(ActionEvent event) {
    	int stockJava = Book.book3.getBook_stock();
    	stockJava--;
    	String stringstockJava = Integer.toString(stockJava);
    	javaStock.setText("Stock: "+stringstockJava);

    }

    @FXML
    void radioRings(ActionEvent event) {
    	int stockRings = Book.book1.getBook_stock();
    	stockRings--;
    	String stringstockRings = Integer.toString(stockRings);
    	ringsStock.setText("Stock: "+stringstockRings);
    	
    }

    @FXML
    void radioSawyer(ActionEvent event) {
    	int stockSawyer = Book.book5.getBook_stock();
    	stockSawyer--;
    	String stringstockSawyer = Integer.toString(stockSawyer);
    	sawyerStock.setText("Stock: "+stringstockSawyer);

    }

    @FXML
    void radioVinci(ActionEvent event) {
    	int stockVinci = Book.book2.getBook_stock();
    	stockVinci--;
    	String stringstockVinci = Integer.toString(stockVinci);
    	vinciStock.setText("Stock: "+stringstockVinci);
    
    }

}
