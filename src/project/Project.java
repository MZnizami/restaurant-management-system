
package project;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class Project extends Application {
 //this is the main page, the first page which is login page    
    @Override
    @SuppressWarnings("empty-statement")
    public void start(Stage stage){
     try {
            Parent  signin;
            
             signin= FXMLLoader.load(getClass().getResource("login.fxml"));;   
          
              Scene scene = new Scene(signin);
        stage.setTitle("Log In Page");
                stage.setScene(scene);
                stage.show();
        } catch (IOException ex) {
            Logger.getLogger(Project.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
