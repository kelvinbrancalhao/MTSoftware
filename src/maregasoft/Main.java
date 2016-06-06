
package maregasoft;
import Telas.Tela_Inicial_LoginController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
    


    @Override
    public void start(Stage primaryStage) throws Exception {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/Telas/Tela_Inicial_Login.fxml"));
            Scene scene = new Scene(root,494,429);
            primaryStage.setScene(scene);
            primaryStage.show();
            primaryStage.setTitle("Efetuar Login");
            
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("nao deu");
        }
    }
        
    
    
    public static void main (String[] args){
       launch(args); 
    }
}
