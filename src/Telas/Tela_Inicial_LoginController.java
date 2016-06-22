package Telas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Tela_Inicial_LoginController implements Initializable {
     
    
    public Tela_Inicial_LoginController() {
        

    }
 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }    
    
    
    public void BotaoLogar(ActionEvent event) throws Exception{
        
        Parent telamenusparent = FXMLLoader.load(getClass().getResource("TelaMenus.fxml"));
        Scene telamenusScene = new Scene(telamenusparent);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setScene(telamenusScene);
        appStage.setTitle("Menu Principal MaregaThai");
        appStage.show();
        
    }
    
    }
       



