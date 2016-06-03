
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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TelaCadastroAlunoController implements Initializable {
    
    public TextField TF_nome;
    public TextField TF_NID;
    public TextField TF_dataNascimento;
    public TextField TF_RG;
    public TextField TF_orgaoEmissor;
    public TextField TF_CPF;
    public TextField TF_celular;
    public TextField TF_Telefone;
    public TextField TF_endereco;
    public TextField TF_bairro;
    public TextField TF_numeroCasa;
    public ComboBox Combo_Sexo;
    


    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
    
    }
   
    
    public void BotaoCancelar(ActionEvent event){
        
        
    }
    
    public void BotaoCadastrar(ActionEvent event){
        
        
    }
    
    public void BotaoCadastrarTreino(ActionEvent event) throws IOException{
         Parent telamenusparent = FXMLLoader.load(getClass().getResource("TelaCadastroTreino.fxml"));
        Stage stage = new Stage();
        Scene telamenusScene = new Scene(telamenusparent);
        stage.setScene(telamenusScene);
        stage.setTitle("tela");
        stage.show();
        
    }
    
    public void BotaoCadastrarFicha(ActionEvent event) throws IOException{
         Parent telamenusparent = FXMLLoader.load(getClass().getResource("TelaCadastroFisiologico.fxml"));
        Stage stage = new Stage();
        Scene telamenusScene = new Scene(telamenusparent);
        stage.setScene(telamenusScene);
        stage.setTitle("tela");
        stage.show();
        
        
    }
    public void BotaoLimpar(ActionEvent event){
        
     TF_nome.setText("");
     TF_NID.setText("");
     TF_dataNascimento.setText("");
     TF_RG.setText("");
     TF_orgaoEmissor.setText("");
     TF_CPF.setText("");
     TF_celular.setText("");
     TF_Telefone.setText("");
     TF_endereco.setText("");
     TF_bairro.setText("");
     TF_numeroCasa.setText("");
        
    }
    
    
    
    
}
