package com.nebrija.tpra;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class ControllerMovies {
	
	@FXML
    private Label availablemovies;

	@FXML
    private RadioButton starwars;

    @FXML
    private ToggleGroup movies;

    @FXML
    private Label starStock;

    @FXML
    private RadioButton shining;

    @FXML
    private Label shiningStock;

    @FXML
    private RadioButton ryan;

    @FXML
    private Label ryanStock;

    @FXML
    private RadioButton toy;

    @FXML
    private Label toyStock;

    @FXML
    private RadioButton speed;

    @FXML
    private Label speedStock;

    @FXML
    private Button exit;

    @FXML
    private RadioButton radioEspaña;

    @FXML
    private ToggleGroup botonIdi;

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
		availablemovies.setText(Translate.getString51());
		starwars.setText(Translate.getString28());
		shining.setText(Translate.getString29());
		ryan.setText(Translate.getString30());
		toy.setText(Translate.getString31());
		speed.setText(Translate.getString32());
		exit.setText(Translate.getString49());;
    }

    @FXML
    void pressedEspaña(ActionEvent event) {
    	String g = "es";
	    String t = "ES";
	    Translate.setCountry(t);
		Translate.setLanguage(g);
		Translate.translate();
		availablemovies.setText(Translate.getString51());
		starwars.setText(Translate.getString28());
		shining.setText(Translate.getString29());
		ryan.setText(Translate.getString30());
		toy.setText(Translate.getString31());
		speed.setText(Translate.getString32());
		exit.setText(Translate.getString49());
    }

    @FXML
    void pressedReinoUnido(ActionEvent event) {
    	String g = "en";
	    String t = "EN";
	    Translate.setCountry(t);
		Translate.setLanguage(g);
		Translate.translate();
		availablemovies.setText(Translate.getString51());
		starwars.setText(Translate.getString28());
		shining.setText(Translate.getString29());
		ryan.setText(Translate.getString30());
		toy.setText(Translate.getString31());
		speed.setText(Translate.getString32());
		exit.setText(Translate.getString49());
    }

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
