
package Telas;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class TelaCadastroFisiologicoController implements Initializable {


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
        public void BotaoProcurarAluno2() throws IOException{
         Parent telamenusparent = FXMLLoader.load(getClass().getResource("TelaPesquisarAluno.fxml"));
        Stage stage = new Stage();
        Scene telamenusScene = new Scene(telamenusparent);
        stage.setScene(telamenusScene);
        stage.setTitle("Tela Procurar Aluno");
        stage.show();
    }
}
