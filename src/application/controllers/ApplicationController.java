package application.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import application.api.API;
import application.models.Response;
import application.models.Translation;

public class ApplicationController {
	@FXML
	private TableView<Translation> table;
    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() throws Exception {
    	Response data = API.getTranslations();
    	
    	TableColumn word = new TableColumn("Word");
    	TableColumn firstTranslation = new TableColumn("First translation");
    	TableColumn secondTranslation = new TableColumn("Second translation");
    	
    	table.getColumns().addAll(word, firstTranslation, secondTranslation);
    	
    	word.setCellValueFactory(new PropertyValueFactory<Translation, String>("word"));
    	firstTranslation.setCellValueFactory(new PropertyValueFactory<Translation, String>("firstTrans"));
    	secondTranslation.setCellValueFactory(new PropertyValueFactory<Translation, String>("secondTrans"));
    	
    	final ObservableList<Translation> list = FXCollections.observableArrayList(data.data);
    	
    	table.setItems(list);
    	System.out.println(data.data[0].word);
    }
}
