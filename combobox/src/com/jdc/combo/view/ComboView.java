package com.jdc.combo.view;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;

public class ComboView {

	@FXML
	private ComboBox<String> combo;
	@FXML
	private Label output;
	
	@FXML
	private void initialize() {
		combo.setButtonCell(new PromptCell<String>(combo.getPromptText()));
		combo.getItems().addAll("Language Basic", "OOP", "Java API", "Database", "Java FX");
	}
	
	@FXML
	void process() {
		output.setText(combo.getValue());
		combo.getSelectionModel().clearSelection();
	}
	
	class PromptCell<T> extends ListCell<T> {
		
		private String promptText;
		
		public PromptCell(String promptText) {
			super();
			this.promptText = promptText;
		}

		@Override
		protected void updateItem(T item, boolean empty) {
			super.updateItem(item, empty);
			
			if(null == item || empty) {
				setText(promptText);
			} else {
				setText(item.toString());
			}
		}
	}
	
}
