
import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sid.Wani
 */
public class LoginForm extends Application{
    public static void main(String [] args)
    {
        launch(args);
    }
    private Label usernameLbl;
    private Label passwordLbl;
    private TextField usernameTf;
    private PasswordField passwordPf;
     private Button loginBtn;
     private Text disp;
     @Override 
     public void start(Stage stage) {
     loginBtn = new Button("Login");
     usernameLbl = new Label("Username:");
     passwordLbl = new Label("Password:");
   
    GridPane grid1 = new GridPane();
        grid1.add(usernameLbl, 0, 0);
        
        grid1.add(passwordLbl, 0, 1);
        grid1.add(passwordPf, 1, 1);
        grid1.add(loginBtn, 1,2); 
        grid1.add(disp, 1,3);
        
        Scene scene = new Scene(grid1);
        stage.setScene(scene);
        stage.show();   
        loginBtn.setOnAction(new EventHandler<ActionEvent>() {
@Override 
public void handle(ActionEvent event) {
if (checkPassword(usernameTf.getText(), passwordPf.getText()))
        {
            disp.setText("Password correct!");
            
        }
else
    disp.setText("Password incorrect!");
}

   });
     }
 public boolean checkPassword(String uname, String pname)
{
    if(uname.equals("sam")&&pname.equals("mypassword"))
    {
        return true;
    }
    return false;
    
}




    
    

}
