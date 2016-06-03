package Telas;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TelaMenusController implements Initializable {


    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
        
    }  
    
    public void MenuCadastroAluno(ActionEvent evento) throws IOException{
        // sistema q deu certo
        Parent telamenusparent = FXMLLoader.load(getClass().getResource("TelaCadastroAluno.fxml"));
        Stage stage = new Stage();
        Scene telamenusScene = new Scene(telamenusparent);
        stage.setScene(telamenusScene);
        stage.setTitle("tela");
        stage.show();
        
        
    }
    
  
    
}
