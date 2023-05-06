import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sid.Wani
 */
public class Calculator extends Application{
    
    public static void main(String [] args)
    {
        launch(args);
    }

   private Label firstNumberLbl;
    private TextField firstNumberTf;
    private Label secondNumberLbl;
    private TextField secondNumberTf;
    private Label operationLbl;
    private Button addBtn;
    private Button subBtn;
    private Button mulBtn;
    private Button divBtn;
    private Label resultLbl;
    private TextField resultTf;
    @Override
    public void start(Stage stage)
    {
         firstNumberLbl= new Label("First Number:");
        firstNumberTf= new TextField("3");
       secondNumberLbl = new Label("First Number:");
       secondNumberTf= new TextField("3");
       operationLbl= new Label("Operation:");
         addBtn= new Button("+");
        subBtn= new Button("-");
         mulBtn= new Button("*");
         divBtn= new Button("/");
         resultLbl= new Label("Result:");
         resultTf = new TextField();
        
        VBox vbox = new VBox(10, firstNumberLbl, firstNumberTf, secondNumberLbl, secondNumberTf, operationLbl, addBtn, 
        subBtn, mulBtn, divBtn, resultLbl, resultTf);
        //vbox.setAlignment(Pos.CENTER);
        HBox hbox = new HBox(10, addBtn, subBtn, mulBtn, divBtn );
        GridPane grid = new GridPane();
        grid.add(firstNumberLbl, 0, 0);
        grid.add(firstNumberTf, 1, 0);
        grid.add(secondNumberLbl, 0, 1);
        grid.add(secondNumberTf, 1, 1);
        grid.add(operationLbl, 0, 2);
         grid.add(hbox, 1, 2);
       
        grid.add( resultLbl, 0, 3);
         grid.add(resultTf, 1, 3);
        
        Scene scene = new Scene(grid);
        stage.setScene(scene);
        stage.show();   
         addBtn.setOnAction(new AddHandler());
        subBtn.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event) {
             
                int value = getValue1()-getValue2();
        setValue(value);



//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
                
        
    });
        mulBtn.setOnAction(event ->
        { setValue(getValue1()*getValue2());
        });
        divBtn.setOnAction(event -> 
        {setValue(getValue1()/getValue2());});
    }
    
    private int getValue1(){
        return Integer.parseInt(firstNumberTf.getText());
    }
      private int getValue2(){
        return Integer.parseInt(secondNumberTf.getText());
    }
    private void setValue(int value)
    {
        resultTf.setText(""+value);
    }
    
    
    private class AddHandler implements EventHandler<ActionEvent>
    {

        @Override
        public void handle(ActionEvent event) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int value = getValue1()+getValue2();
        
        setValue(value);
            
            
        
    }

}
}
    


