package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {

	@FXML
	private TextField txtNumero1;
	@FXML
	private TextField txtNumero2;
	@FXML
	private Label lbResultado;
	@FXML
	private Button btSoma;

	@FXML
	public void onBtSomaAction() {
		try {
			double numero1 = Double.parseDouble(txtNumero1.getText());
			double numero2 = Double.parseDouble(txtNumero2.getText());
			double soma = numero1 + numero2;
			lbResultado.setText(String.format("%.2f", soma));
		} catch (NumberFormatException e) {
			Alerts.showAlert("Erro", "Erro na conversão", "Digite apenas números", AlertType.ERROR);
		}
	}
}