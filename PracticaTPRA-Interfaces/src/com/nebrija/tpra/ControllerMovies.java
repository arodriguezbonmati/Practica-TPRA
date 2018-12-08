package com.nebrija.tpra;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;

public class ControllerMovies {

    @FXML
    private ToggleGroup movies;

    @FXML
    private Label starStock;

    @FXML
    private Label shiningStock;

    @FXML
    private Label ryanStock;

    @FXML
    private Label toyStock;

    @FXML
    private Label speedStock;

    @FXML
    void exitMovies(ActionEvent event) {
    	MainInterfaces.Interfaz5.close();
    	MainInterfaces.Interfaz3.show();
    }

    @FXML
    void radioRyan(ActionEvent event) {
    	int stockRyan = Movie.movie3.getMovie_stock();
    	stockRyan--;
    	String stringstockRyan = Integer.toString(stockRyan);
    	ryanStock.setText("Stock: "+stringstockRyan);

    }

    @FXML
    void radioShining(ActionEvent event) {
    	int stockShining = Movie.movie2.getMovie_stock();
    	stockShining--;
    	String stringstockShining = Integer.toString(stockShining);
    	shiningStock.setText("Stock: "+stringstockShining);
    }

    @FXML
    void radioSpeed(ActionEvent event) {
    	int stockSpeed = Movie.movie5.getMovie_stock();
    	stockSpeed--;
    	String stringstockSpeed = Integer.toString(stockSpeed);
    	speedStock.setText("Stock: "+stringstockSpeed);
    }

    @FXML
    void radioStar(ActionEvent event) {
    	int stockStar = Movie.movie1.getMovie_stock();
    	stockStar--;
    	String stringstockStar = Integer.toString(stockStar);
    	starStock.setText("Stock: "+stringstockStar);
    }

    @FXML
    void radioToy(ActionEvent event) {
    	int stockToy = Movie.movie4.getMovie_stock();
    	stockToy--;
    	String stringstockToy = Integer.toString(stockToy);
    	toyStock.setText("Stock: "+stringstockToy);
    }

}
