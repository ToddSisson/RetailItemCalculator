package num1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RetailPriceCalculatorController {

	@FXML
	private Label outputLabel;

	@FXML
	private Button calcButton;

	@FXML
	private Label promptLabel2;

	@FXML
	private Label promptLabel1;

	@FXML
	private TextField costTextField;

	@FXML
	private TextField markupTextField;

	@FXML
	void inititalize() {
	}

	public void calcPrice(){
		String str;

		double retailPrice = Double.parseDouble(costTextField.getText()) * (1 + Double.parseDouble(markupTextField.getText()) / 100.0);

		str = "Retail Price: $" + String.format("%,.2f", retailPrice);

		outputLabel.setText(str);
	}

}
