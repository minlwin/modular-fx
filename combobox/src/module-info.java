module com.jdc.combo {
	
	requires javafx.controls;
	requires javafx.fxml;
	requires transitive javafx.graphics;
	
	opens com.jdc.combo.view to javafx.fxml;
	opens com.jdc.combo to javafx.graphics;
}