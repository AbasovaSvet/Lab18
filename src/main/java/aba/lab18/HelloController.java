package aba.lab18;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import static javafx.application.Application.launch;

public class HelloController {
    @FXML
    private Label labelRez;
    @FXML
    private Label textY;
    @FXML
    private Label textX;
    @FXML
    public  void  plus(){
        double x = Double.parseDouble(textX.getText());
        double y = Double.parseDouble(textY.getText());
        double z = x+y;
        labelRez.setText("Результат равен "+z);
    }
    @FXML
    public  void  minus(){
        double x = Double.parseDouble(textX.getText());
        double y = Double.parseDouble(textY.getText());
        double z = x-y;
        labelRez.setText("Результат равен "+z);
    }
    @FXML
    public  void  ymnosh(){
        double x = Double.parseDouble(textX.getText());
        double y = Double.parseDouble(textY.getText());
        double z = x*y;
        labelRez.setText("Результат равен "+z);
    }
    @FXML
    public  void  delit(){
        double x = Double.parseDouble(textX.getText());
        double y = Double.parseDouble(textY.getText());
        double z = x/y;
        labelRez.setText("Результат равен "+z);
    }
    public static void main(String[] args) {
        launch(args);
    }
}