package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {
@FXML
private Label result;
private long number1=0;
private String operate="";
private boolean start=true;
private Model model=new Model();

@FXML
	public void processNumbers(ActionEvent event){
	if(start)
	{
		result.setText("");
	start=false;
	}
	String value=((Button)event.getSource()).getText();
	result.setText(result.getText()+value);
}
@FXML
public void processOperators(ActionEvent event){
	String value= ((Button)event.getSource()).getText();
	if(!value.equals("=")){
		if(!operate.isEmpty())
			return;
		
		operate=value;
		number1=Long.parseLong(result.getText());
		result.setText("");
	}
	else
	{
		if(operate.isEmpty())
			return;
		long number2=Long.parseLong(result.getText());
		float output=model.Calculate(number1, number2, operate);
		result.setText(String.valueOf(output));
		operate="";
		start=true;
	}
	
}
}
