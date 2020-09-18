module com.jdc.hello.fxml {
	
	exports com.jdc.hello;
	
	requires javafx.controls;
	requires transitive javafx.graphics;
	requires javafx.fxml;
	
	opens com.jdc.hello to javafx.fxml;
}